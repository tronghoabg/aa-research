package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class fib {
    private fib() {
    }

    public static int d(androidx.window.sidecar.SidecarDeviceState sidecarDeviceState) {
        int iIntValue;
        try {
            try {
                iIntValue = sidecarDeviceState.posture;
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
                iIntValue = 0;
            }
        } catch (java.lang.NoSuchFieldError unused2) {
            java.lang.Object objInvoke = androidx.window.sidecar.SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
            objInvoke.getClass();
            iIntValue = ((java.lang.Integer) objInvoke).intValue();
        }
        if (iIntValue < 0 || iIntValue > 4) {
            return 0;
        }
        return iIntValue;
    }

    public static java.util.List e(androidx.window.sidecar.SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        try {
            try {
                java.util.List list = sidecarWindowLayoutInfo.displayFeatures;
                return list == null ? defpackage.afce.a : list;
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
                return defpackage.afce.a;
            }
        } catch (java.lang.NoSuchFieldError unused2) {
            java.lang.Object objInvoke = androidx.window.sidecar.SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
            objInvoke.getClass();
            return (java.util.List) objInvoke;
        }
        return defpackage.afce.a;
    }

    public boolean b() {
        return false;
    }

    public boolean c(int[] iArr) {
        return false;
    }

    public fib(byte[] bArr) {
    }
}
