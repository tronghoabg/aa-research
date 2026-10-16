package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class dpj extends dph {
    float a;

    public dpj(float f) {
        super(null);
        this.a = f;
    }

    @Override // defpackage.dph
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dpj) {
            float fV = v();
            float fV2 = ((dpj) obj).v();
            if ((Float.isNaN(fV) && Float.isNaN(fV2)) || fV == fV2) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dph
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        float f = this.a;
        return iHashCode + (f != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f) : 0);
    }

    @Override // defpackage.dph
    public final float v() {
        if (Float.isNaN(this.a) && A()) {
            this.a = Float.parseFloat(x());
        }
        return this.a;
    }

    @Override // defpackage.dph
    public final int w() {
        if (Float.isNaN(this.a) && A()) {
            this.a = Integer.parseInt(x());
        }
        return (int) this.a;
    }
}
