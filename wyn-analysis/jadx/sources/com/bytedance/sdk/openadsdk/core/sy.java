package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class sy {

    /* renamed from: oa, reason: collision with root package name */
    private static volatile gzw<com.bytedance.sdk.openadsdk.moa.uef> f25752oa = null;
    private static volatile Context uef = null;
    private static int yo = -1;

    public static class uef {
        private static volatile Application uef;

        static {
            try {
                Object objOa = oa();
                uef = (Application) objOa.getClass().getMethod("getApplication", new Class[0]).invoke(objOa, new Object[0]);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.dhk.uef("MyApplication", "application get failed", th);
            }
        }

        private static Object oa() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
                method.setAccessible(true);
                return method.invoke(null, new Object[0]);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.dhk.uef("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th);
                return null;
            }
        }

        public static Application uef() {
            return uef;
        }
    }

    public static com.bytedance.sdk.openadsdk.ab.oa.yo lw() {
        return !com.bytedance.sdk.openadsdk.core.settings.xs.uef() ? com.bytedance.sdk.openadsdk.ab.oa.moa.uef() : com.bytedance.sdk.openadsdk.moa.uef.oa.uef();
    }

    public static com.bytedance.sdk.openadsdk.core.settings.dj moa() {
        return com.bytedance.sdk.openadsdk.core.settings.dj.oa();
    }

    public static void oa(Context context) {
        if (uef == null) {
            synchronized (sy.class) {
                try {
                    if (uef == null) {
                        if (context != null) {
                            uef = context;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                uef = applicationContext;
                            }
                            return;
                        }
                        try {
                            Application applicationUef = uef.uef();
                            if (applicationUef != null) {
                                uef = applicationUef;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static Context uef() {
        if (uef == null) {
            oa(null);
        }
        return uef;
    }

    public static gzw<com.bytedance.sdk.openadsdk.moa.uef> yo() {
        if (f25752oa == null) {
            synchronized (sy.class) {
                try {
                    if (f25752oa == null) {
                        f25752oa = new gsd(uef);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f25752oa;
    }

    public static Context uef(Context context) {
        if (context == null) {
            context = uef();
        }
        if (context instanceof Application) {
            return context;
        }
        if (context != null) {
            return context.getApplicationContext();
        }
        return null;
    }

    public static int oa() {
        Context contextUef;
        if (yo < 0 && (contextUef = uef()) != null) {
            yo = ViewConfiguration.get(contextUef).getScaledTouchSlop();
        }
        return yo;
    }
}
