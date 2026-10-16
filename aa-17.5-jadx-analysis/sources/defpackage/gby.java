package defpackage;

import androidx.car.app.model.CarColor;

/* loaded from: classes2.dex */
public final class gby implements gmo {
    public final float a;
    public final CarColor b;

    public gby(float f, CarColor carColor) {
        this.a = f;
        this.b = carColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gby)) {
            return false;
        }
        gby gbyVar = (gby) obj;
        return Float.compare(this.a, gbyVar.a) == 0 && affa.f(this.b, gbyVar.b);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.a) * 31;
        CarColor carColor = this.b;
        return iFloatToIntBits + (carColor == null ? 0 : carColor.hashCode());
    }

    public final String toString() {
        return "CarProgressBarInternal(progress=" + this.a + ", color=" + this.b + ")";
    }
}
