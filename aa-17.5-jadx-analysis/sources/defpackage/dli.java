package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
final class dli implements dlg {
    private final float a;
    private final float b;
    private final dlw c;

    public dli(float f, float f2, dlw dlwVar) {
        this.a = f;
        this.b = f2;
        this.c = dlwVar;
    }

    @Override // defpackage.dlg
    public final float a() {
        return this.a;
    }

    @Override // defpackage.dlm
    public final float b() {
        return this.b;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float eA(float f) {
        return f * this.a;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ int eE(long j) {
        throw null;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ int eF(float f) {
        return dlf.l(this, f);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ long eG(long j) {
        return dlf.m(this, j);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ long eH(long j) {
        return dlf.n(this, j);
    }

    @Override // defpackage.dlm
    public final long eI(float f) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.c.a(f));
        dlu[] dluVarArr = dlt.a;
        return (jFloatToRawIntBits & 4294967295L) | 4294967296L;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ long eJ(float f) {
        return eI((f / this.a) + BitmapDescriptorFactory.HUE_RED);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dli)) {
            return false;
        }
        dli dliVar = (dli) obj;
        return Float.compare(this.a, dliVar.a) == 0 && Float.compare(this.b, dliVar.b) == 0 && affa.f(this.c, dliVar.c);
    }

    @Override // defpackage.dlm
    public final float ew(long j) {
        if (dlt.a[(int) ((1095216660480L & j) >>> 32)].a == 4294967296L) {
            return this.c.b(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float ex(float f) {
        return (f / this.a) + BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float ey(int i) {
        return (i / this.a) + BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float ez(long j) {
        return dlf.k(this, j);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.a + ", fontScale=" + this.b + ", converter=" + this.c + ")";
    }
}
