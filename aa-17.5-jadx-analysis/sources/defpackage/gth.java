package defpackage;

import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;

/* loaded from: classes2.dex */
public final class gth implements gmo {
    public final CarIcon a;
    public final CarText b;
    public final String c;
    public final String d;
    public final String e;
    public final CarColor f;
    public final CarColor g;

    public gth(CarIcon carIcon, CarText carText, String str, String str2, String str3, CarColor carColor, CarColor carColor2) {
        this.a = carIcon;
        this.b = carText;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = carColor;
        this.g = carColor2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gth)) {
            return false;
        }
        gth gthVar = (gth) obj;
        return affa.f(this.a, gthVar.a) && affa.f(this.b, gthVar.b) && affa.f(this.c, gthVar.c) && affa.f(this.d, gthVar.d) && affa.f(this.e, gthVar.e) && affa.f(this.f, gthVar.f) && affa.f(this.g, gthVar.g);
    }

    public final int hashCode() {
        CarIcon carIcon = this.a;
        int iHashCode = carIcon == null ? 0 : carIcon.hashCode();
        CarText carText = this.b;
        int iHashCode2 = carText == null ? 0 : carText.hashCode();
        int i = iHashCode * 31;
        String str = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CarColor carColor = this.f;
        int iHashCode6 = (iHashCode5 + (carColor == null ? 0 : carColor.hashCode())) * 31;
        CarColor carColor2 = this.g;
        return iHashCode6 + (carColor2 != null ? carColor2.hashCode() : 0);
    }

    public final String toString() {
        return "TravelEstimateInternal(tripIcon=" + this.a + ", tripText=" + this.b + ", timeToDestination=" + this.c + ", arrivalTimeAtDestination=" + this.d + ", distanceToDestination=" + this.e + ", remainingDistanceColor=" + this.f + ", remainingTimeColor=" + this.g + ")";
    }

    public gth() {
        this(null, null, null, null, null, null, null);
    }
}
