package com.bytedance.sdk.openadsdk.moa;

import android.app.ActivityManager;
import android.os.Build;
import com.bytedance.sdk.component.utils.dhk;
import java.lang.reflect.Method;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class bcc {
    private static boolean lw = false;
    private static Method moa;

    /* renamed from: oa, reason: collision with root package name */
    private static Class<?> f25939oa;
    private static Method uef;
    private static Method yo;

    static {
        oa();
    }

    private static void oa() {
        int i5;
        if (lw || (i5 = Build.VERSION.SDK_INT) < 35) {
            return;
        }
        try {
            if (yo()) {
                uef = ActivityManager.class.getMethod("getHistoricalProcessStartReasons", Integer.TYPE);
                Class<?> cls = Class.forName("android.app.ApplicationStartInfo");
                f25939oa = cls;
                moa = cls.getMethod("getReason", new Class[0]);
                if (i5 >= 36) {
                    yo = f25939oa.getMethod("getStartComponent", new Class[0]);
                }
                lw = true;
            }
        } catch (Throwable th) {
            dhk.yo(th.getMessage(), new Object[0]);
        }
    }

    public static JSONObject uef() {
        JSONObject jSONObject;
        Method method;
        List list;
        Method method2;
        Method method3;
        int i5 = Build.VERSION.SDK_INT;
        JSONObject jSONObject2 = null;
        if (i5 >= 35 && yo()) {
            oa();
            try {
                jSONObject = new JSONObject();
            } catch (Throwable th) {
                th = th;
            }
            try {
                ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.sy.uef().getSystemService(ActivityManager.class);
                if (activityManager != null && (method = uef) != null && (list = (List) method.invoke(activityManager, 1)) != null && !list.isEmpty()) {
                    Object obj = list.get(0);
                    if (i5 >= 36 && obj != null && (method3 = yo) != null) {
                        jSONObject.put("start_component", ((Integer) method3.invoke(obj, new Object[0])).intValue());
                    }
                    if (obj != null && (method2 = moa) != null) {
                        jSONObject.put("start_reason", ((Integer) method2.invoke(obj, new Object[0])).intValue());
                    }
                }
                return jSONObject;
            } catch (Throwable th2) {
                th = th2;
                jSONObject2 = jSONObject;
                dhk.yo(th.getMessage(), new Object[0]);
                return jSONObject2;
            }
        }
        return jSONObject2;
    }

    private static boolean yo() {
        return com.bytedance.sdk.openadsdk.gzw.lw.uef("s_i_e", 0) == 1;
    }
}
