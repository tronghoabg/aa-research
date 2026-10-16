package defpackage;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;

/* loaded from: classes2.dex */
public final class gtg implements gmo {
    private final CarText a;
    private final CarIcon b;
    private final CarText c;

    public gtg(CarText carText, CarIcon carIcon, CarText carText2) {
        this.a = carText;
        this.b = carIcon;
        this.c = carText2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtg)) {
            return false;
        }
        gtg gtgVar = (gtg) obj;
        return affa.f(this.a, gtgVar.a) && affa.f(this.b, gtgVar.b) && affa.f(this.c, gtgVar.c);
    }

    public final int hashCode() {
        CarText carText = this.a;
        int iHashCode = carText == null ? 0 : carText.hashCode();
        CarIcon carIcon = this.b;
        int iHashCode2 = carIcon == null ? 0 : carIcon.hashCode();
        int i = iHashCode * 31;
        CarText carText2 = this.c;
        return ((i + iHashCode2) * 31) + (carText2 != null ? carText2.hashCode() : 0);
    }

    public final String toString() {
        return "LocationInfoInternal(name=" + this.a + ", image=" + this.b + ", address=" + this.c + ")";
    }

    public gtg() {
        this(null, null, null);
    }
}
