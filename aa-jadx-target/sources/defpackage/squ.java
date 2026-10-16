package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class squ {
    private static final java.lang.reflect.Method a;
    private static final java.lang.reflect.Method b;
    private static final java.lang.reflect.Method c;
    private static final java.lang.reflect.Method d;
    private static java.lang.Boolean e;

    static {
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.lang.reflect.Method method3;
        java.lang.reflect.Method method4;
        android.os.Process.myUid();
        try {
            method = android.os.WorkSource.class.getMethod("add", java.lang.Integer.TYPE);
        } catch (java.lang.Exception unused) {
            method = null;
        }
        a = method;
        try {
            method2 = android.os.WorkSource.class.getMethod("add", java.lang.Integer.TYPE, java.lang.String.class);
        } catch (java.lang.Exception unused2) {
            method2 = null;
        }
        b = method2;
        try {
            method3 = android.os.WorkSource.class.getMethod("size", null);
        } catch (java.lang.Exception unused3) {
            method3 = null;
        }
        c = method3;
        try {
            android.os.WorkSource.class.getMethod("get", java.lang.Integer.TYPE);
        } catch (java.lang.Exception unused4) {
        }
        try {
            android.os.WorkSource.class.getMethod("getName", java.lang.Integer.TYPE);
        } catch (java.lang.Exception unused5) {
        }
        try {
            android.os.WorkSource.class.getMethod("createWorkChain", null);
        } catch (java.lang.Exception e2) {
            android.util.Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e2);
        }
        try {
            java.lang.Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", java.lang.Integer.TYPE, java.lang.String.class);
        } catch (java.lang.Exception e3) {
            android.util.Log.w("WorkSourceUtil", "Missing WorkChain class", e3);
        }
        try {
            method4 = android.os.WorkSource.class.getMethod("isEmpty", null);
            try {
                method4.setAccessible(true);
            } catch (java.lang.Exception unused6) {
            }
        } catch (java.lang.Exception unused7) {
            method4 = null;
        }
        d = method4;
        e = null;
    }

    public static void a(android.os.WorkSource workSource, int i, java.lang.String str) {
        java.lang.reflect.Method method = b;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, java.lang.Integer.valueOf(i), str);
                return;
            } catch (java.lang.Exception e2) {
                android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                return;
            }
        }
        java.lang.reflect.Method method2 = a;
        if (method2 != null) {
            try {
                method2.invoke(workSource, java.lang.Integer.valueOf(i));
            } catch (java.lang.Exception e3) {
                android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
            }
        }
    }

    public static synchronized boolean b(android.content.Context context) {
        java.lang.Boolean bool = e;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = defpackage.duw.c(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
        e = boolValueOf;
        boolValueOf.getClass();
        return z;
    }

    public static boolean c(android.os.WorkSource workSource) {
        java.lang.reflect.Method method = d;
        if (method != null) {
            try {
                java.lang.Object objInvoke = method.invoke(workSource, null);
                defpackage.sqs.aA(objInvoke);
                return ((java.lang.Boolean) objInvoke).booleanValue();
            } catch (java.lang.Exception e2) {
                android.util.Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e2);
            }
        }
        java.lang.reflect.Method method2 = c;
        if (method2 == null) {
            return true;
        }
        try {
            java.lang.Object objInvoke2 = method2.invoke(workSource, null);
            defpackage.sqs.aA(objInvoke2);
            return ((java.lang.Integer) objInvoke2).intValue() == 0;
        } catch (java.lang.Exception e3) {
            android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
            return true;
        }
    }
}
