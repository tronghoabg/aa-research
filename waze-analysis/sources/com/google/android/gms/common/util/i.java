package com.google.android.gms.common.util;

import android.content.Context;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.api.internal.av;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final Method f5155a;

    /* renamed from: b, reason: collision with root package name */
    private static final Method f5156b;

    /* renamed from: c, reason: collision with root package name */
    private static final Method f5157c;

    /* renamed from: d, reason: collision with root package name */
    private static final Method f5158d;

    /* renamed from: e, reason: collision with root package name */
    private static Boolean f5159e;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        f5155a = method;
        try {
            method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f5156b = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        f5157c = method3;
        try {
            WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", Integer.TYPE);
        } catch (Exception unused5) {
        }
        try {
            WorkSource.class.getMethod("createWorkChain", null);
        } catch (Exception e2) {
            Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e2);
        }
        try {
            Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
        } catch (Exception e3) {
            Log.w("WorkSourceUtil", "Missing WorkChain class", e3);
        }
        try {
            method4 = WorkSource.class.getMethod("isEmpty", null);
            try {
                method4.setAccessible(true);
            } catch (Exception unused6) {
            }
        } catch (Exception unused7) {
            method4 = null;
        }
        f5158d = method4;
        f5159e = null;
    }

    public static void a(WorkSource workSource, int i2, String str) {
        Method method = f5156b;
        if (method != null) {
            try {
                method.invoke(workSource, Integer.valueOf(i2), str);
                return;
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                return;
            }
        }
        Method method2 = f5155a;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i2));
            } catch (Exception e3) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
            }
        }
    }

    public static synchronized boolean b(Context context) {
        Boolean bool = f5159e;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        boolean z = ContextCompat.checkSelfPermission(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
        Boolean boolValueOf = Boolean.valueOf(z);
        f5159e = boolValueOf;
        boolValueOf.getClass();
        return z;
    }

    public static boolean c(WorkSource workSource) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = f5158d;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(workSource, null);
                av.m(objInvoke);
                return ((Boolean) objInvoke).booleanValue();
            } catch (Exception e2) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e2);
            }
        }
        Method method2 = f5157c;
        if (method2 == null) {
            return true;
        }
        try {
            Object objInvoke2 = method2.invoke(workSource, null);
            av.m(objInvoke2);
            return ((Integer) objInvoke2).intValue() == 0;
        } catch (Exception e3) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
            return true;
        }
    }
}
