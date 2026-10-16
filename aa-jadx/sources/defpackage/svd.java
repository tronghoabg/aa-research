package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class svd implements java.lang.AutoCloseable {
    private final int c;
    private final android.content.Context d;
    private final float e;
    private int f = 13;
    private final long a = java.lang.System.currentTimeMillis();
    private final long b = android.os.SystemClock.uptimeMillis();

    public svd(android.content.Context context, int i, float f) {
        this.c = i;
        this.d = context;
        this.e = f;
    }

    public final void a() {
        this.f = 0;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        android.content.Context context = this.d;
        if (defpackage.svc.a == null) {
            synchronized (defpackage.svc.b) {
                if (defpackage.svc.a == null) {
                    defpackage.svc.a = new defpackage.svc(context);
                }
            }
        }
        int i = this.c;
        defpackage.svc svcVar = defpackage.svc.a;
        int i2 = this.f;
        long j = this.a;
        long j2 = this.b;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        long jUptimeMillis = android.os.SystemClock.uptimeMillis() - j2;
        if (j$.util.concurrent.ThreadLocalRandom.current().nextFloat() < this.e) {
            svcVar.a(i, i2, j, jCurrentTimeMillis, (int) jUptimeMillis);
        }
    }
}
