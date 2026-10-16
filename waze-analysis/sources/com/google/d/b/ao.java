package com.google.d.b;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ao {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7220a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f7221b;

    static {
        Object objInvoke = null;
        try {
            objInvoke = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (Throwable th) {
            b(th);
        }
        f7221b = objInvoke;
        if (objInvoke != null) {
            a("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (objInvoke == null) {
            return;
        }
        c(objInvoke);
    }

    private static Method a(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (Throwable th) {
            b(th);
            return null;
        }
    }

    private static void b(Throwable th) {
        if (th.getClass().getName().equals("java.lang.ThreadDeath")) {
            throw ((Error) th);
        }
    }

    private static void c(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Method methodA = a("getStackTraceDepth", Throwable.class);
            if (methodA == null) {
                return;
            }
            methodA.invoke(obj, new Throwable());
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
        }
    }
}
