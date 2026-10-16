package defpackage;

import androidx.car.app.model.CarColor;

/* loaded from: classes2.dex */
public final class gub {
    public final gfa a;
    public final deu b;
    public final CarColor c;
    public final deu d;
    public final CarColor e;

    public gub(gfa gfaVar, deu deuVar, CarColor carColor, deu deuVar2, CarColor carColor2) {
        this.a = gfaVar;
        this.b = deuVar;
        this.c = carColor;
        this.d = deuVar2;
        this.e = carColor2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gub)) {
            return false;
        }
        gub gubVar = (gub) obj;
        return affa.f(this.a, gubVar.a) && affa.f(this.b, gubVar.b) && affa.f(this.c, gubVar.c) && affa.f(this.d, gubVar.d) && affa.f(this.e, gubVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        deu deuVar = this.b;
        int iHashCode2 = (iHashCode + (deuVar == null ? 0 : deuVar.hashCode())) * 31;
        CarColor carColor = this.c;
        int iHashCode3 = (iHashCode2 + (carColor == null ? 0 : carColor.hashCode())) * 31;
        deu deuVar2 = this.d;
        int iHashCode4 = (iHashCode3 + (deuVar2 == null ? 0 : deuVar2.hashCode())) * 31;
        CarColor carColor2 = this.e;
        return iHashCode4 + (carColor2 != null ? carColor2.hashCode() : 0);
    }

    public final String toString() {
        return "BaseEtaCardUiModel(eta=" + this.a + ", distanceRemaining=" + ((Object) this.b) + ", distanceRemainingColor=" + this.c + ", timeRemaining=" + ((Object) this.d) + ", timeRemainingColor=" + this.e + ")";
    }

    public gub() {
        this(gey.b, null, null, null, null);
    }
}
