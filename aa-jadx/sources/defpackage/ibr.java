package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ibr {
    public static final boolean a;
    private static final java.io.File c;
    private static volatile defpackage.ibr d;
    private int e;
    private boolean f = true;
    public final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean(false);

    static {
        a = android.os.Build.VERSION.SDK_INT < 29;
        c = new java.io.File("/proc/self/fd");
    }

    public static defpackage.ibr a() {
        if (d == null) {
            synchronized (defpackage.ibr.class) {
                if (d == null) {
                    d = new defpackage.ibr();
                }
            }
        }
        return d;
    }

    private final synchronized boolean c() {
        boolean z = true;
        int i = this.e + 1;
        this.e = i;
        if (i >= 50) {
            this.e = 0;
            int length = c.list().length;
            int i2 = 20000;
            if (android.os.Build.VERSION.SDK_INT == 28) {
                java.util.Iterator it = java.util.Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
                while (it.hasNext()) {
                    if (android.os.Build.MODEL.startsWith((java.lang.String) it.next())) {
                        i2 = 500;
                        break;
                    }
                }
            }
            long j = i2;
            if (length >= j) {
                z = false;
            }
            this.f = z;
            if (!z && android.util.Log.isLoggable("Downsampler", 5)) {
                android.util.Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + j);
            }
        }
        return this.f;
    }

    public final boolean b(int i, int i2, boolean z, boolean z2) {
        if (!z) {
            if (android.util.Log.isLoggable("HardwareConfig", 2)) {
                android.util.Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (a && !this.b.get()) {
            if (android.util.Log.isLoggable("HardwareConfig", 2)) {
                android.util.Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z2) {
            if (android.util.Log.isLoggable("HardwareConfig", 2)) {
                android.util.Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        if (i < 0 || i2 < 0) {
            if (android.util.Log.isLoggable("HardwareConfig", 2)) {
                android.util.Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        }
        if (c()) {
            return true;
        }
        if (android.util.Log.isLoggable("HardwareConfig", 2)) {
            android.util.Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }
}
