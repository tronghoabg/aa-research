package defpackage;

import androidx.car.app.model.CarText;

/* loaded from: classes2.dex */
public final class hah extends ham {
    public final CarText a;
    public final gag b;
    public final gag c;
    public final boolean d;
    public final afdr e;
    public final haj f;

    public hah(CarText carText, gag gagVar, gag gagVar2, boolean z, afdr afdrVar, haj hajVar) {
        super(false);
        this.a = carText;
        this.b = gagVar;
        this.c = gagVar2;
        this.d = z;
        this.e = afdrVar;
        this.f = hajVar;
    }

    @Override // defpackage.ham
    public final CarText a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hah)) {
            return false;
        }
        hah hahVar = (hah) obj;
        return affa.f(this.a, hahVar.a) && affa.f(this.b, hahVar.b) && affa.f(this.c, hahVar.c) && this.d == hahVar.d && affa.f(this.e, hahVar.e) && affa.f(this.f, hahVar.f);
    }

    public final int hashCode() {
        CarText carText = this.a;
        int iHashCode = carText == null ? 0 : carText.hashCode();
        gag gagVar = this.b;
        int iHashCode2 = gagVar == null ? 0 : gagVar.hashCode();
        int i = iHashCode * 31;
        gag gagVar2 = this.c;
        int iHashCode3 = (((((i + iHashCode2) * 31) + (gagVar2 == null ? 0 : gagVar2.hashCode())) * 31) + a.f(this.d)) * 31;
        afdr afdrVar = this.e;
        int iHashCode4 = (iHashCode3 + (afdrVar == null ? 0 : afdrVar.hashCode())) * 31;
        haj hajVar = this.f;
        return iHashCode4 + (hajVar != null ? hajVar.hashCode() : 0);
    }

    public final String toString() {
        return "FilterChipInternal(title=" + this.a + ", startIcon=" + this.b + ", endIcon=" + this.c + ", isSelected=" + this.d + ", onClick=" + this.e + ", style=" + this.f + ")";
    }

    public hah() {
        this(null, null, null, false, null, null);
    }
}
