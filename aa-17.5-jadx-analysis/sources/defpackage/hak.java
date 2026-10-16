package defpackage;

import androidx.car.app.model.CarText;

/* loaded from: classes2.dex */
public final class hak extends ham {
    public final CarText a;
    public final CarText b;
    public final fzw c;
    public final boolean d;
    public final afdr e;
    public final gby f;
    private final boolean g;
    private final boolean h;

    public hak(CarText carText, CarText carText2, fzw fzwVar, boolean z, afdr afdrVar, boolean z2, gby gbyVar, boolean z3) {
        super(z3);
        this.a = carText;
        this.b = carText2;
        this.c = fzwVar;
        this.d = z;
        this.e = afdrVar;
        this.g = z2;
        this.f = gbyVar;
        this.h = z3;
    }

    @Override // defpackage.ham
    public final CarText a() {
        return this.a;
    }

    @Override // defpackage.ham
    public final boolean b() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hak)) {
            return false;
        }
        hak hakVar = (hak) obj;
        return affa.f(this.a, hakVar.a) && affa.f(this.b, hakVar.b) && affa.f(this.c, hakVar.c) && this.d == hakVar.d && affa.f(this.e, hakVar.e) && this.g == hakVar.g && affa.f(this.f, hakVar.f) && this.h == hakVar.h;
    }

    public final int hashCode() {
        CarText carText = this.a;
        int iHashCode = carText == null ? 0 : carText.hashCode();
        CarText carText2 = this.b;
        int iHashCode2 = carText2 == null ? 0 : carText2.hashCode();
        int i = iHashCode * 31;
        fzw fzwVar = this.c;
        int iHashCode3 = (((((i + iHashCode2) * 31) + (fzwVar == null ? 0 : fzwVar.hashCode())) * 31) + a.f(this.d)) * 31;
        afdr afdrVar = this.e;
        int iHashCode4 = (((iHashCode3 + (afdrVar == null ? 0 : afdrVar.hashCode())) * 31) + a.f(this.g)) * 31;
        gby gbyVar = this.f;
        return ((iHashCode4 + (gbyVar != null ? gbyVar.hashCode() : 0)) * 31) + a.f(this.h);
    }

    public final String toString() {
        return "GridItemInternal(title=" + this.a + ", subtitle=" + this.b + ", image=" + this.c + ", isImageAnIcon=" + this.d + ", onClick=" + this.e + ", isLoading=" + this.g + ", progressBar=" + this.f + ", isIndexable=" + this.h + ")";
    }
}
