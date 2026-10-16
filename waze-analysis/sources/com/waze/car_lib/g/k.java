package com.waze.car_lib.g;

import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private static final Method f19808a;

    static {
        Method method = null;
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                method = cls.getMethod("get", String.class, String.class);
                cls.getMethod("getInt", String.class, Integer.TYPE);
                cls.getMethod("getLong", String.class, Long.TYPE);
                cls.getMethod("getBoolean", String.class, Boolean.TYPE);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } finally {
            f19808a = method;
        }
    }

    public static String a() {
        try {
            return (String) f19808a.invoke(null, "ro.product.driverlicense", "");
        } catch (Exception e2) {
            Log.e("SystemProperties", "get error", e2);
            return "";
        }
    }
}
