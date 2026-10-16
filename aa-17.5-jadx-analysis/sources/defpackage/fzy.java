package defpackage;

import androidx.car.app.model.CarIcon;

/* loaded from: classes2.dex */
public final class fzy implements gmo {
    public final CarIcon a;
    public final gac b;
    public final gag c;

    public fzy(CarIcon carIcon, gac gacVar, gag gagVar) {
        this.a = carIcon;
        this.b = gacVar;
        this.c = gagVar;
        if (woy.da(new Object[]{carIcon, gacVar, gagVar}).size() != 1) {
            throw new IllegalArgumentException("CarIconDelegateInternalModel requires that only a single field be non-null.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzy)) {
            return false;
        }
        fzy fzyVar = (fzy) obj;
        return affa.f(this.a, fzyVar.a) && affa.f(this.b, fzyVar.b) && affa.f(this.c, fzyVar.c);
    }

    public final int hashCode() {
        CarIcon carIcon = this.a;
        int iHashCode = carIcon == null ? 0 : carIcon.hashCode();
        gac gacVar = this.b;
        int iHashCode2 = gacVar == null ? 0 : gacVar.hashCode();
        int i = iHashCode * 31;
        gag gagVar = this.c;
        return ((i + iHashCode2) * 31) + (gagVar != null ? gagVar.hashCode() : 0);
    }

    public final String toString() {
        return "CarIconDelegateInternalModel(carIcon=" + this.a + ", carIconInternalModel=" + this.b + ", lazyIconInternalModel=" + this.c + ")";
    }

    public fzy() {
        this(null, null, null);
    }
}
