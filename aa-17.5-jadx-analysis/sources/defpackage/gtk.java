package defpackage;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Distance;
import androidx.car.app.navigation.model.Maneuver;
import java.util.List;

/* loaded from: classes2.dex */
public final class gtk implements gti {
    public final Maneuver a;
    public final CarIcon b;
    public final CarIcon c;
    public final CarText d;
    public final Distance e;
    private final gth f;
    private final List g;
    private final CarText h;

    public gtk(gth gthVar, Maneuver maneuver, List list, CarIcon carIcon, CarIcon carIcon2, CarText carText, CarText carText2, Distance distance) {
        this.f = gthVar;
        this.a = maneuver;
        this.g = list;
        this.b = carIcon;
        this.c = carIcon2;
        this.d = carText;
        this.h = carText2;
        this.e = distance;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtk)) {
            return false;
        }
        gtk gtkVar = (gtk) obj;
        return affa.f(this.f, gtkVar.f) && affa.f(this.a, gtkVar.a) && affa.f(this.g, gtkVar.g) && affa.f(this.b, gtkVar.b) && affa.f(this.c, gtkVar.c) && affa.f(this.d, gtkVar.d) && affa.f(this.h, gtkVar.h) && affa.f(this.e, gtkVar.e);
    }

    public final int hashCode() {
        gth gthVar = this.f;
        int iHashCode = gthVar == null ? 0 : gthVar.hashCode();
        Maneuver maneuver = this.a;
        int iHashCode2 = maneuver == null ? 0 : maneuver.hashCode();
        int i = iHashCode * 31;
        List list = this.g;
        int iHashCode3 = (((i + iHashCode2) * 31) + (list == null ? 0 : list.hashCode())) * 31;
        CarIcon carIcon = this.b;
        int iHashCode4 = (iHashCode3 + (carIcon == null ? 0 : carIcon.hashCode())) * 31;
        CarIcon carIcon2 = this.c;
        int iHashCode5 = (iHashCode4 + (carIcon2 == null ? 0 : carIcon2.hashCode())) * 31;
        CarText carText = this.d;
        int iHashCode6 = (iHashCode5 + (carText == null ? 0 : carText.hashCode())) * 31;
        CarText carText2 = this.h;
        int iHashCode7 = (iHashCode6 + (carText2 == null ? 0 : carText2.hashCode())) * 31;
        Distance distance = this.e;
        return iHashCode7 + (distance != null ? distance.hashCode() : 0);
    }

    public final String toString() {
        return "TurnCardInstructionInternal(travelEstimate=" + this.f + ", maneuver=" + this.a + ", lanes=" + this.g + ", lanesImage=" + this.b + ", junctionImage=" + this.c + ", cue=" + this.d + ", road=" + this.h + ", distance=" + this.e + ")";
    }

    public gtk() {
        this(null, null, null, null, null, null, null, null);
    }
}
