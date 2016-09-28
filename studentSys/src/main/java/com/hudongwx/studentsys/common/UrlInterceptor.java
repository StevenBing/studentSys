package com.hudongwx.studentsys.common;

import com.hudongwx.studentsys.util.Common;
import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;
import com.jfinal.log.Log;

/**
 * Created by wuhongxu on 2016/8/31 0031.
 */

public class UrlInterceptor implements Interceptor {
    private Log log = Log.getLog(UrlInterceptor.class);
    @Override
    public void intercept(Invocation inv) {
        String actionKey = inv.getActionKey();
        String controllerKey = inv.getControllerKey();
        inv.getController().setAttr(Common.LABEL_ACTION_KEY,actionKey);
        inv.getController().setAttr(Common.LABEL_CONTROLLER_KEY,controllerKey);
        log.info(actionKey);
        inv.invoke();
    }
}
