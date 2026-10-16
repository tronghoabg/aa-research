package defpackage;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.Distance;
import androidx.car.app.navigation.model.Step;

/* loaded from: classes2.dex */
public final class gtr implements gtp {
    public final Distance a;
    public final Step b;
    public final Step c;
    public final CarIcon d;

    public gtr(Distance distance, Step step, Step step2, CarIcon carIcon) {
        this.a = distance;
        this.b = step;
        this.c = step2;
        this.d = carIcon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtr)) {
            return false;
        }
        gtr gtrVar = (gtr) obj;
        return affa.f(this.a, gtrVar.a) && affa.f(this.b, gtrVar.b) && affa.f(this.c, gtrVar.c) && affa.f(this.d, gtrVar.d);
    }

    public final int hashCode() {
        Distance distance = this.a;
        int iHashCode = distance == null ? 0 : distance.hashCode();
        Step step = this.b;
        int iHashCode2 = step == null ? 0 : step.hashCode();
        int i = iHashCode * 31;
        Step step2 = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (step2 == null ? 0 : step2.hashCode())) * 31;
        CarIcon carIcon = this.d;
        return iHashCode3 + (carIcon != null ? carIcon.hashCode() : 0);
    }

    public final String toString() {
        return "RoutingInfoInternal(currentDistance=" + this.a + ", currentStep=" + this.b + ", nextStep=" + this.c + ", junctionImage=" + this.d + ")";
    }
}
