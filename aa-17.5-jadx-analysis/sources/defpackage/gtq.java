package defpackage;

import androidx.car.app.model.CarColor;

/* loaded from: classes2.dex */
public final class gtq {
    public final CarColor a;
    public final gmq b;

    public gtq(CarColor carColor, gmq gmqVar) {
        this.a = carColor;
        this.b = gmqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtq)) {
            return false;
        }
        gtq gtqVar = (gtq) obj;
        return affa.f(this.a, gtqVar.a) && affa.f(this.b, gtqVar.b);
    }

    public final int hashCode() {
        CarColor carColor = this.a;
        int iHashCode = carColor == null ? 0 : carColor.hashCode();
        gmq gmqVar = this.b;
        return (iHashCode * 31) + (gmqVar != null ? gmqVar.hashCode() : 0);
    }

    public final String toString() {
        return "NavigationInfoInternal(backgroundColor=" + this.a + ", navigationInfoDetailsInternal=" + this.b + ")";
    }

    public gtq() {
        this(null, null);
    }
}
