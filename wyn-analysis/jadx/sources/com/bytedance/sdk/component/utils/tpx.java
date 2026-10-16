package com.bytedance.sdk.component.utils;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.qonversion.android.sdk.internal.Constants;
import java.lang.reflect.Method;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes.dex */
public class tpx {
    private static String uef;

    public static String oa(Context context) {
        if (!TextUtils.isEmpty(uef)) {
            return uef;
        }
        String strUef = uef();
        uef = strUef;
        if (!TextUtils.isEmpty(strUef)) {
            return uef;
        }
        String strOa = oa();
        uef = strOa;
        return !TextUtils.isEmpty(strOa) ? uef : uef;
    }

    public static boolean uef(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return false;
        }
        return TextUtils.equals(context.getApplicationContext().getPackageName(), oa(context));
    }

    public static String yo(Context context) {
        String strOa = oa(context);
        return (TextUtils.isEmpty(strOa) || !strOa.contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)) ? strOa : strOa.replace(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, Constants.USER_ID_SEPARATOR);
    }

    private static String uef() {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return Application.getProcessName();
        } catch (Exception unused) {
            return null;
        }
    }

    private static String oa() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
