package defpackage;

import androidx.car.app.model.CarColor;

/* loaded from: classes2.dex */
public final class fvz implements fwb {
    public final gag a;
    public final CarColor b;

    public fvz(gag gagVar, CarColor carColor) {
        this.a = gagVar;
        this.b = carColor;
    }

    public static /* synthetic */ fvz h(fvz fvzVar, CarColor carColor, int i) {
        gag gagVar = (i & 1) != 0 ? fvzVar.a : null;
        if ((i & 2) != 0) {
            carColor = fvzVar.b;
        }
        gagVar.getClass();
        return new fvz(gagVar, carColor);
    }

    @Override // defpackage.fwb
    public final CarColor a() {
        return null;
    }

    @Override // defpackage.fwb
    public final gag b() {
        return this.a;
    }

    @Override // defpackage.fwb
    public final gcs c() {
        return null;
    }

    @Override // defpackage.fwb
    public final afdr d() {
        return null;
    }

    @Override // defpackage.fwb
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvz)) {
            return false;
        }
        fvz fvzVar = (fvz) obj;
        return affa.f(this.a, fvzVar.a) && affa.f(this.b, fvzVar.b);
    }

    @Override // defpackage.fwb
    public final boolean f() {
        return true;
    }

    @Override // defpackage.fwb
    public final boolean g() {
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        CarColor carColor = this.b;
        return iHashCode + (carColor == null ? 0 : carColor.hashCode());
    }

    public final String toString() {
        return "CarAppIconActionInternalModel(icon=" + this.a + ", tint=" + this.b + ")";
    }
}
