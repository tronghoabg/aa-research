package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class dlq implements defpackage.dlo {
    private final float a;
    private final float b;
    private final defpackage.dme c;

    public dlq(float f, float f2, defpackage.dme dmeVar) {
        this.a = f;
        this.b = f2;
        this.c = dmeVar;
    }

    @Override // defpackage.dlo
    public final float a() {
        return this.a;
    }

    @Override // defpackage.dlu
    public final float b() {
        return this.b;
    }

    @Override // defpackage.dlu
    public final float dE(long j) {
        if (defpackage.dmb.a[(int) ((1095216660480L & j) >>> 32)].a == 4294967296L) {
            return this.c.b(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
        }
        throw new java.lang.IllegalStateException("Only Sp can convert to Px");
    }

    @Override // defpackage.dlo
    public final /* synthetic */ float dF(float f) {
        return (f / this.a) + 0.0f;
    }

    @Override // defpackage.dlo
    public final /* synthetic */ float dG(int i) {
        return (i / this.a) + 0.0f;
    }

    @Override // defpackage.dlo
    public final /* synthetic */ float dH(long j) {
        return defpackage.dln.p(this, j);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ float dI(float f) {
        return f * this.a;
    }

    @Override // defpackage.dlo
    public final /* synthetic */ int dM(long j) {
        throw null;
    }

    @Override // defpackage.dlo
    public final /* synthetic */ int dN(float f) {
        return defpackage.dln.q(this, f);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ long dO(long j) {
        return defpackage.dln.r(this, j);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ long dP(long j) {
        return defpackage.dln.s(this, j);
    }

    @Override // defpackage.dlu
    public final long dQ(float f) {
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(this.c.a(f));
        defpackage.dmc[] dmcVarArr = defpackage.dmb.a;
        return (jFloatToRawIntBits & 4294967295L) | 4294967296L;
    }

    @Override // defpackage.dlo
    public final /* synthetic */ long dR(float f) {
        return dQ((f / this.a) + 0.0f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dlq)) {
            return false;
        }
        defpackage.dlq dlqVar = (defpackage.dlq) obj;
        return java.lang.Float.compare(this.a, dlqVar.a) == 0 && java.lang.Float.compare(this.b, dlqVar.b) == 0 && defpackage.afga.f(this.c, dlqVar.c);
    }

    public final int hashCode() {
        return (((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "DensityWithConverter(density=" + this.a + ", fontScale=" + this.b + ", converter=" + this.c + ")";
    }
}
