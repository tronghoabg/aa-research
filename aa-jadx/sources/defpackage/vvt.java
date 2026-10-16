package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vvt {
    public int a;
    public defpackage.xyn b;
    public boolean c;
    public byte d;
    public int e;
    private boolean f;
    private boolean g;
    private boolean h;

    public vvt(defpackage.vvu vvuVar) {
        this.b = defpackage.xxe.a;
        this.e = vvuVar.g;
        this.a = vvuVar.a;
        this.b = vvuVar.b;
        this.f = vvuVar.c;
        this.c = vvuVar.d;
        this.g = vvuVar.e;
        this.h = vvuVar.f;
        this.d = (byte) 127;
    }

    public final defpackage.vvu a() {
        int i;
        if (this.d == 127 && (i = this.e) != 0) {
            return new defpackage.vvu(i, this.a, this.b, this.f, this.c, this.g, this.h);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.e == 0) {
            sb.append(" enablement");
        }
        if ((this.d & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if ((this.d & 2) == 0) {
            sb.append(" recordMetricPerProcess");
        }
        if ((this.d & 4) == 0) {
            sb.append(" forceGcBeforeRecordMemory");
        }
        if ((this.d & 8) == 0) {
            sb.append(" captureDebugMetrics");
        }
        if ((this.d & 16) == 0) {
            sb.append(" captureMemoryInfo");
        }
        if ((this.d & 32) == 0) {
            sb.append(" recordMemoryPeriodically");
        }
        if ((this.d & 64) == 0) {
            sb.append(" randomizePeriodicMemoryMetricStartTime");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.f = z;
        this.d = (byte) (this.d | 4);
    }

    public final void c(boolean z) {
        this.h = z;
        this.d = (byte) (this.d | 64);
    }

    public final void d(boolean z) {
        this.g = z;
        this.d = (byte) (this.d | 32);
    }

    public vvt() {
        this.b = defpackage.xxe.a;
    }
}
