package defpackage;

/* loaded from: classes.dex */
public final class cmu extends cmw {
    public int a;
    private final long b;
    private final long c;
    private final long d;
    private float e;
    private cjw f;
    private final cjj g;

    public cmu(cjj cjjVar, long j) {
        int i;
        this.g = cjjVar;
        this.b = 0L;
        this.c = j;
        this.a = 1;
        int i2 = (int) (j >> 32);
        if (i2 < 0 || (i = (int) (4294967295L & j)) < 0 || i2 > cjjVar.c() || i > cjjVar.b()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.d = j;
        this.e = 1.0f;
    }

    @Override // defpackage.cmw
    public final long a() {
        return dln.k(this.d);
    }

    @Override // defpackage.cmw
    protected final void b(cmd cmdVar) {
        int iRound = Math.round(Float.intBitsToFloat((int) (cmdVar.o() >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (cmdVar.o() & 4294967295L)));
        float f = this.e;
        cjw cjwVar = this.f;
        int i = this.a;
        czz.J(cmdVar, this.g, 0L, this.c, (iRound << 32) | (iRound2 & 4294967295L), f, cjwVar, i, 328);
    }

    @Override // defpackage.cmw
    protected final boolean c(float f) {
        this.e = f;
        return true;
    }

    @Override // defpackage.cmw
    protected final boolean d(cjw cjwVar) {
        this.f = cjwVar;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmu)) {
            return false;
        }
        cmu cmuVar = (cmu) obj;
        if (!affa.f(this.g, cmuVar.g)) {
            return false;
        }
        long j = cmuVar.b;
        return this.c == cmuVar.c && this.a == cmuVar.a;
    }

    public final int hashCode() {
        int iHashCode = this.g.hashCode() * 961;
        long j = this.c;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.a;
    }

    public final String toString() {
        long j = this.c;
        return "BitmapPainter(image=" + this.g + ", srcOffset=" + dlo.e(0L) + ", srcSize=" + dlq.c(j) + ", filterQuality=" + (1 != this.a ? "None" : "Low") + ")";
    }

    public /* synthetic */ cmu(cjj cjjVar) {
        this(cjjVar, (cjjVar.c() << 32) | (cjjVar.b() & 4294967295L));
    }
}
