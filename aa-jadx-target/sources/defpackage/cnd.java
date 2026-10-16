package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cnd extends defpackage.cne {
    private final long a;
    private float b = 1.0f;
    private defpackage.cke c;

    public cnd(long j) {
        this.a = j;
    }

    @Override // defpackage.cne
    public final long a() {
        return 9205357640488583168L;
    }

    @Override // defpackage.cne
    protected final void b(defpackage.cml cmlVar) {
        defpackage.dai.U(cmlVar, this.a, 0L, 0L, this.b, this.c, 86);
    }

    @Override // defpackage.cne
    protected final boolean c(float f) {
        this.b = f;
        return true;
    }

    @Override // defpackage.cne
    protected final boolean d(defpackage.cke ckeVar) {
        this.c = ckeVar;
        return true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.cnd) && this.a == ((defpackage.cnd) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return "ColorPainter(color=" + defpackage.ckd.g(this.a) + ")";
    }
}
