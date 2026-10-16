package defpackage;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;

/* loaded from: classes2.dex */
public final class gdj implements gmo {
    public final CarText a;
    public final CarText b;
    public final CarIcon c;
    public final int d;
    public final int e;
    public final uc f;

    public gdj(CarText carText, CarText carText2, CarIcon carIcon, int i, int i2, uc ucVar) {
        carText.getClass();
        this.a = carText;
        this.b = carText2;
        this.c = carIcon;
        this.d = i;
        this.e = i2;
        this.f = ucVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdj)) {
            return false;
        }
        gdj gdjVar = (gdj) obj;
        return affa.f(this.a, gdjVar.a) && affa.f(this.b, gdjVar.b) && affa.f(this.c, gdjVar.c) && this.d == gdjVar.d && this.e == gdjVar.e && affa.f(this.f, gdjVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        CarText carText = this.b;
        int iHashCode2 = (iHashCode + (carText == null ? 0 : carText.hashCode())) * 31;
        CarIcon carIcon = this.c;
        int iHashCode3 = (((((iHashCode2 + (carIcon == null ? 0 : carIcon.hashCode())) * 31) + this.d) * 31) + this.e) * 31;
        uc ucVar = this.f;
        return iHashCode3 + (ucVar != null ? ucVar.hashCode() : 0);
    }

    public final String toString() {
        return "CheckoutItemInternal(title=" + this.a + ", subtitle=" + this.b + ", image=" + this.c + ", initialValue=" + this.d + ", minValue=" + this.e + ", onValueChangeListener=" + this.f + ")";
    }
}
