package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zua {
    private static final java.lang.String a = "zua";
    private static final long b;
    private static final java.util.concurrent.atomic.AtomicInteger c;
    private int d;
    private final long e = android.os.SystemClock.elapsedRealtime();
    private final java.lang.StringBuilder f;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
        b = 60000L;
        c = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    public zua(java.util.List list) {
        synchronized (this) {
            this.d = -1;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DRD");
            this.f = sb;
            sb.append("(");
            sb.append(c.incrementAndGet());
            sb.append("): ");
            java.lang.String str = "";
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                defpackage.ztv ztvVar = (defpackage.ztv) it.next();
                this.f.append(str);
                str = "|";
                this.f.append(ztvVar.h());
            }
        }
    }

    public final synchronized void a(int i, int i2) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.e;
        if (i2 >= 8192) {
            int i3 = (int) jElapsedRealtime;
            if (i3 <= b) {
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                this.d = (i2 * 1000) / i3;
                java.lang.String str = a;
                if (defpackage.zsr.e(str, 3)) {
                    android.util.Log.d(str, "Sent " + i + ", Loaded " + i2 + " bytes.  Byte/Sec = " + this.d);
                }
            }
        }
        java.lang.StringBuilder sb = this.f;
        sb.append(", ");
        if (i2 < 1000) {
            sb.append("<1kb");
        } else {
            sb.append(i2 / 1000);
            sb.append("kb");
        }
        java.lang.String str2 = a;
        if (defpackage.zsr.e(str2, 3)) {
            android.util.Log.d(str2, sb.toString());
        }
    }

    public final synchronized void b() {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.e;
        java.lang.StringBuilder sb = this.f;
        sb.append(", ");
        if (jElapsedRealtime < 1000) {
            sb.append("<1s");
        } else {
            sb.append(jElapsedRealtime / 1000);
            sb.append("s");
        }
    }
}
