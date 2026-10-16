package defpackage;

import androidx.car.app.model.CarColor;

/* loaded from: classes2.dex */
public final class fvy implements fwb {
    public final gcs a;
    public final gag b;
    public final afdr c;
    public final boolean d;
    public final CarColor e;
    public final boolean f;
    public final boolean g;

    public fvy(gcs gcsVar, gag gagVar, afdr afdrVar, boolean z, CarColor carColor, boolean z2, boolean z3) {
        this.a = gcsVar;
        this.b = gagVar;
        this.c = afdrVar;
        this.d = z;
        this.e = carColor;
        this.f = z2;
        this.g = z3;
    }

    public static /* synthetic */ fvy h(fvy fvyVar, gcs gcsVar, afdr afdrVar, boolean z) {
        return new fvy(gcsVar, fvyVar.b, afdrVar, z, fvyVar.e, fvyVar.f, fvyVar.g);
    }

    @Override // defpackage.fwb
    public final CarColor a() {
        return this.e;
    }

    @Override // defpackage.fwb
    public final gag b() {
        return this.b;
    }

    @Override // defpackage.fwb
    public final gcs c() {
        return this.a;
    }

    @Override // defpackage.fwb
    public final afdr d() {
        return this.c;
    }

    @Override // defpackage.fwb
    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvy)) {
            return false;
        }
        fvy fvyVar = (fvy) obj;
        return affa.f(this.a, fvyVar.a) && affa.f(this.b, fvyVar.b) && affa.f(this.c, fvyVar.c) && this.d == fvyVar.d && affa.f(this.e, fvyVar.e) && this.f == fvyVar.f && this.g == fvyVar.g;
    }

    @Override // defpackage.fwb
    public final boolean f() {
        return this.g;
    }

    @Override // defpackage.fwb
    public final boolean g() {
        return this.f;
    }

    public final int hashCode() {
        gcs gcsVar = this.a;
        int iHashCode = gcsVar == null ? 0 : gcsVar.hashCode();
        gag gagVar = this.b;
        int iHashCode2 = gagVar == null ? 0 : gagVar.hashCode();
        int i = iHashCode * 31;
        afdr afdrVar = this.c;
        int iHashCode3 = (((((i + iHashCode2) * 31) + (afdrVar == null ? 0 : afdrVar.hashCode())) * 31) + a.f(this.d)) * 31;
        CarColor carColor = this.e;
        return ((((iHashCode3 + (carColor != null ? carColor.hashCode() : 0)) * 31) + a.f(this.f)) * 31) + a.f(this.g);
    }

    public final String toString() {
        return "CarActionInternalModel(title=" + this.a + ", icon=" + this.b + ", onClick=" + this.c + ", isEnabled=" + this.d + ", backgroundColor=" + this.e + ", isPrimary=" + this.f + ", isPersistent=" + this.g + ")";
    }

    public fvy() {
        this(null, null, null, true, null, false, false);
    }
}
