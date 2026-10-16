package defpackage;

import androidx.car.app.model.CarColor;

/* loaded from: classes2.dex */
public final class gak implements gag {
    public final geu a;
    public final CarColor b;

    public gak(geu geuVar, CarColor carColor) {
        this.a = geuVar;
        this.b = carColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gak)) {
            return false;
        }
        gak gakVar = (gak) obj;
        return affa.f(this.a, gakVar.a) && affa.f(this.b, gakVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        CarColor carColor = this.b;
        return iHashCode + (carColor == null ? 0 : carColor.hashCode());
    }

    public final String toString() {
        return "LazyMediaPlaybackIconInternalModel(templateContext=" + this.a + ", tint=" + this.b + ")";
    }
}
