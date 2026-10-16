package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cnc extends defpackage.cne {
    public int a;
    private final long b;
    private final long c;
    private final long d;
    private float e;
    private defpackage.cke f;
    private final defpackage.cjr g;

    public cnc(defpackage.cjr cjrVar, long j) {
        int i;
        this.g = cjrVar;
        this.b = 0L;
        this.c = j;
        this.a = 1;
        int i2 = (int) (j >> 32);
        if (i2 < 0 || (i = (int) (4294967295L & j)) < 0 || i2 > cjrVar.c() || i > cjrVar.b()) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        this.d = j;
        this.e = 1.0f;
    }

    @Override // defpackage.cne
    public final long a() {
        return defpackage.dlv.f(this.d);
    }

    @Override // defpackage.cne
    protected final void b(defpackage.cml cmlVar) {
        int iRound = java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (cmlVar.o() >> 32)));
        int iRound2 = java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (cmlVar.o() & 4294967295L)));
        float f = this.e;
        defpackage.cke ckeVar = this.f;
        int i = this.a;
        defpackage.cjr cjrVar = this.g;
        defpackage.dai.V(cmlVar, cjrVar, 0L, this.c, (((long) iRound) << 32) | (((long) iRound2) & 4294967295L), f, ckeVar, i, 328);
    }

    @Override // defpackage.cne
    protected final boolean c(float f) {
        this.e = f;
        return true;
    }

    @Override // defpackage.cne
    protected final boolean d(defpackage.cke ckeVar) {
        this.f = ckeVar;
        return true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cnc)) {
            return false;
        }
        defpackage.cnc cncVar = (defpackage.cnc) obj;
        if (!defpackage.afga.f(this.g, cncVar.g)) {
            return false;
        }
        long j = cncVar.b;
        return this.c == cncVar.c && this.a == cncVar.a;
    }

    public final int hashCode() {
        int iHashCode = this.g.hashCode() * 961;
        long j = this.c;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.a;
    }

    public final java.lang.String toString() {
        long j = this.c;
        return "BitmapPainter(image=" + this.g + ", srcOffset=" + defpackage.dlw.e(0L) + ", srcSize=" + defpackage.dly.c(j) + ", filterQuality=" + (1 != this.a ? "None" : "Low") + ")";
    }

    public /* synthetic */ cnc(defpackage.cjr cjrVar) {
        this(cjrVar, (((long) cjrVar.c()) << 32) | (((long) cjrVar.b()) & 4294967295L));
    }
}
