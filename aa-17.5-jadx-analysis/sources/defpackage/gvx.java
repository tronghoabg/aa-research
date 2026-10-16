package defpackage;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;

/* loaded from: classes2.dex */
public final class gvx implements gmo {
    public final CarText a;
    public final CarText b;
    public final CarIcon c;
    public final uq d;

    public gvx(CarText carText, CarText carText2, CarIcon carIcon, uq uqVar) {
        carText.getClass();
        this.a = carText;
        this.b = carText2;
        this.c = carIcon;
        this.d = uqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvx)) {
            return false;
        }
        gvx gvxVar = (gvx) obj;
        return affa.f(this.a, gvxVar.a) && affa.f(this.b, gvxVar.b) && affa.f(this.c, gvxVar.c) && affa.f(this.d, gvxVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        CarText carText = this.b;
        int iHashCode2 = (iHashCode + (carText == null ? 0 : carText.hashCode())) * 31;
        CarIcon carIcon = this.c;
        int iHashCode3 = (iHashCode2 + (carIcon == null ? 0 : carIcon.hashCode())) * 31;
        uq uqVar = this.d;
        return iHashCode3 + (uqVar != null ? uqVar.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentItemInternal(title=" + this.a + ", subtitle=" + this.b + ", image=" + this.c + ", onClickDelegate=" + this.d + ")";
    }
}
