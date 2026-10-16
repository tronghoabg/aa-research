package n7;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f40933a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f40934b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f40935c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f40936d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f40937e;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Class<?> cls = Integer.TYPE;
        Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        f40933a = method;
        try {
            method2 = WorkSource.class.getMethod("add", cls, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f40934b = method2;
        try {
            method3 = WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused3) {
            method3 = null;
        }
        f40935c = method3;
        try {
            WorkSource.class.getMethod("get", cls);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", cls);
        } catch (Exception unused5) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e7) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e7);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
            } catch (Exception e10) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e10);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                method4 = WorkSource.class.getMethod("isEmpty", new Class[0]);
                try {
                    method4.setAccessible(true);
                } catch (Exception unused6) {
                }
            } catch (Exception unused7) {
            }
        } else {
            method4 = null;
        }
        f40936d = method4;
        f40937e = null;
    }

    public static void a(WorkSource workSource, int i5, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = f40934b;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i5), str);
                return;
            } catch (Exception e7) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e7);
                return;
            }
        }
        Method method2 = f40933a;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i5));
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            }
        }
    }

    public static synchronized boolean b(Context context) {
        Boolean bool = f40937e;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        boolean z2 = Y0.e.checkSelfPermission(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
        f40937e = Boolean.valueOf(z2);
        return z2;
    }

    public static boolean c(WorkSource workSource) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iIntValue;
        Method method = f40936d;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(workSource, new Object[0]);
                AbstractC1732v.i(objInvoke);
                return ((Boolean) objInvoke).booleanValue();
            } catch (Exception e7) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e7);
            }
        }
        Method method2 = f40935c;
        if (method2 != null) {
            try {
                Object objInvoke2 = method2.invoke(workSource, new Object[0]);
                AbstractC1732v.i(objInvoke2);
                iIntValue = ((Integer) objInvoke2).intValue();
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            }
        } else {
            iIntValue = 0;
        }
        return iIntValue == 0;
    }
}
