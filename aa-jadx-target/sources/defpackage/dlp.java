package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dlp implements defpackage.dlo {
    public final float a;
    private final float b;

    public dlp(float f, float f2) {
        this.a = f;
        this.b = f2;
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
    public final /* synthetic */ float dE(long j) {
        return defpackage.dln.n(this, j);
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
    public final /* synthetic */ long dQ(float f) {
        return defpackage.dln.o(this, f);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ long dR(float f) {
        return defpackage.dln.o(this, (f / this.a) + 0.0f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dlp)) {
            return false;
        }
        defpackage.dlp dlpVar = (defpackage.dlp) obj;
        return java.lang.Float.compare(this.a, dlpVar.a) == 0 && java.lang.Float.compare(this.b, dlpVar.b) == 0;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        return "DensityImpl(density=" + this.a + ", fontScale=" + this.b + ")";
    }
}
