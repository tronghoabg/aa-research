package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class dlh implements dlg {
    public final float a;
    private final float b;

    public dlh(float f, float f2) {
        this.a = f;
        this.b = f2;
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
    public final /* synthetic */ long eI(float f) {
        return dln.d(this, f);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ long eJ(float f) {
        return dln.d(this, (f / this.a) + BitmapDescriptorFactory.HUE_RED);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlh)) {
            return false;
        }
        dlh dlhVar = (dlh) obj;
        return Float.compare(this.a, dlhVar.a) == 0 && Float.compare(this.b, dlhVar.b) == 0;
    }

    @Override // defpackage.dlm
    public final /* synthetic */ float ew(long j) {
        return dln.c(this, j);
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
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "DensityImpl(density=" + this.a + ", fontScale=" + this.b + ")";
    }
}
