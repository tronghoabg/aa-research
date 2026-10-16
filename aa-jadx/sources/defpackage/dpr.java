package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dpr extends defpackage.dpp {
    float a;

    public dpr(float f) {
        super(null);
        this.a = f;
    }

    @Override // defpackage.dpp
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dpr) {
            float fV = v();
            float fV2 = ((defpackage.dpr) obj).v();
            if ((java.lang.Float.isNaN(fV) && java.lang.Float.isNaN(fV2)) || fV == fV2) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dpp
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        float f = this.a;
        return iHashCode + (f != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? java.lang.Float.floatToIntBits(f) : 0);
    }

    @Override // defpackage.dpp
    public final float v() {
        if (java.lang.Float.isNaN(this.a) && A()) {
            this.a = java.lang.Float.parseFloat(x());
        }
        return this.a;
    }

    @Override // defpackage.dpp
    public final int w() {
        if (java.lang.Float.isNaN(this.a) && A()) {
            this.a = java.lang.Integer.parseInt(x());
        }
        return (int) this.a;
    }
}
