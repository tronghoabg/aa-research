package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sjr {
    private static volatile defpackage.sjr b;
    public final java.lang.Object a;

    public sjr(byte[] bArr) {
        this.a = new java.util.concurrent.atomic.AtomicLong(Long.MIN_VALUE);
    }

    public static defpackage.sjr a() {
        if (b == null) {
            synchronized (defpackage.sjr.class) {
                if (b == null) {
                    b = new defpackage.sjr();
                }
            }
        }
        return b;
    }

    public final void b() {
        ((java.util.concurrent.atomic.AtomicLong) this.a).set(Long.MIN_VALUE);
    }

    public final boolean c() {
        java.util.concurrent.atomic.AtomicLong atomicLong;
        long j;
        long j2;
        long jElapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
        do {
            atomicLong = (java.util.concurrent.atomic.AtomicLong) this.a;
            j = atomicLong.get();
            j2 = 5000000000L + j < jElapsedRealtimeNanos ? jElapsedRealtimeNanos : j;
        } while (!atomicLong.compareAndSet(j, j2));
        return j2 == jElapsedRealtimeNanos;
    }

    public final void d(wdj wdjVar) {
        wdjVar.a((defpackage.wdn) this.a);
    }

    public sjr(java.lang.Object obj) {
        this.a = obj;
    }

    private sjr() {
        this.a = new java.util.concurrent.CopyOnWriteArrayList();
    }
}
