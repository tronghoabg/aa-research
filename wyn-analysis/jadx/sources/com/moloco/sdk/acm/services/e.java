package com.moloco.sdk.acm.services;

import Bf.k;
import Bf.r;
import Ef.H;
import Ef.S;
import Jf.n;
import android.text.TextUtils;
import android.util.Log;
import ff.m;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Kd.a f28472a;

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f28473b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f28474c;

    static {
        Lf.e eVar = S.f3698a;
        f28472a = H.c(n.f6132a);
        f28473b = new ArrayList();
        String str = null;
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, "debug.moloco.enable_logs");
            AbstractC3340k.c(objInvoke, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) objInvoke;
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            }
        } catch (Exception unused) {
        }
        f28474c = Boolean.parseBoolean(str);
    }

    public static String a(String str) {
        try {
            return "[" + e() + "] " + str;
        } catch (Exception unused) {
            return str;
        }
    }

    public static void b(int i5, Exception exc, String tag, String msg) {
        if ((i5 & 4) != 0) {
            exc = null;
        }
        AbstractC3340k.e(tag, "tag");
        AbstractC3340k.e(msg, "msg");
        if (f28474c) {
            String strF = f(tag);
            String strA = a(msg);
            Log.e(strF, strA, exc);
            d(strF, strA);
        }
    }

    public static void c(String str, String msg) {
        AbstractC3340k.e(msg, "msg");
        if (f28474c) {
            String strF = f(str);
            String strA = a(msg);
            Log.d(strF, strA);
            d(strF, strA);
        }
    }

    public static void d(String str, String str2) {
        H.D(f28472a, null, new d(str, str2, null), 3);
    }

    public static String e() throws ClassNotFoundException, SecurityException {
        StackTraceElement stackTraceElement;
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        AbstractC3340k.d(stackTrace, "getStackTrace(...)");
        int length = stackTrace.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                stackTraceElement = (StackTraceElement) m.u0(stackTrace);
                break;
            }
            stackTraceElement = stackTrace[i5];
            if (!AbstractC3340k.a(stackTraceElement.getClassName(), e.class.getCanonicalName())) {
                break;
            }
            i5++;
        }
        String className = stackTraceElement.getClassName();
        stackTraceElement.getMethodName();
        Class<?> cls = Class.forName(className);
        cls.isAnonymousClass();
        cls.getDeclaredMethods();
        String methodName = stackTraceElement.getMethodName();
        if (AbstractC3340k.a(methodName, "invokeSuspend")) {
            String className2 = stackTraceElement.getClassName();
            AbstractC3340k.d(className2, "getClassName(...)");
            methodName = k.O0(k.F0(className2, "$1"), "$");
        }
        AbstractC3340k.d(methodName, "let(...)");
        return methodName;
    }

    public static String f(String str) {
        return r.k0(str, "ACM", false) ? str : "ACM".concat(str);
    }

    public static void g(String str, String msg) {
        AbstractC3340k.e(msg, "msg");
        if (f28474c) {
            String strF = f(str);
            String strA = a(msg);
            Log.i(strF, strA);
            d(strF, strA);
        }
    }
}
