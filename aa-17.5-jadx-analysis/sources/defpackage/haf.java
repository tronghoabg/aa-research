package defpackage;

import androidx.car.app.model.CarText;
import androidx.car.app.model.Shape;

/* loaded from: classes2.dex */
public final class haf extends ham {
    public final CarText a;
    public final CarText b;
    public final gag c;
    public final gag d;
    public final Shape e;
    public final fyj f;
    public final gby g;
    public final afdr h;
    public final boolean i;
    public final int j;
    public final int k;

    public haf(CarText carText, CarText carText2, gag gagVar, int i, gag gagVar2, int i2, Shape shape, fyj fyjVar, gby gbyVar, afdr afdrVar, boolean z) {
        super(z);
        this.a = carText;
        this.b = carText2;
        this.c = gagVar;
        this.j = i;
        this.d = gagVar2;
        this.k = i2;
        this.e = shape;
        this.f = fyjVar;
        this.g = gbyVar;
        this.h = afdrVar;
        this.i = z;
    }

    @Override // defpackage.ham
    public final CarText a() {
        return this.a;
    }

    @Override // defpackage.ham
    public final boolean b() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof haf)) {
            return false;
        }
        haf hafVar = (haf) obj;
        return affa.f(this.a, hafVar.a) && affa.f(this.b, hafVar.b) && affa.f(this.c, hafVar.c) && this.j == hafVar.j && affa.f(this.d, hafVar.d) && this.k == hafVar.k && affa.f(this.e, hafVar.e) && affa.f(this.f, hafVar.f) && affa.f(this.g, hafVar.g) && affa.f(this.h, hafVar.h) && this.i == hafVar.i;
    }

    public final int hashCode() {
        CarText carText = this.a;
        int iHashCode = carText == null ? 0 : carText.hashCode();
        CarText carText2 = this.b;
        int iHashCode2 = carText2 == null ? 0 : carText2.hashCode();
        int i = iHashCode * 31;
        gag gagVar = this.c;
        int iHashCode3 = (((((i + iHashCode2) * 31) + (gagVar == null ? 0 : gagVar.hashCode())) * 31) + this.j) * 31;
        gag gagVar2 = this.d;
        int iHashCode4 = (((iHashCode3 + (gagVar2 == null ? 0 : gagVar2.hashCode())) * 31) + this.k) * 31;
        Shape shape = this.e;
        int iHashCode5 = (iHashCode4 + (shape == null ? 0 : shape.hashCode())) * 31;
        fyj fyjVar = this.f;
        int iHashCode6 = (iHashCode5 + (fyjVar == null ? 0 : fyjVar.hashCode())) * 31;
        gby gbyVar = this.g;
        int iHashCode7 = (iHashCode6 + (gbyVar == null ? 0 : gbyVar.hashCode())) * 31;
        afdr afdrVar = this.h;
        return ((iHashCode7 + (afdrVar != null ? afdrVar.hashCode() : 0)) * 31) + a.f(this.i);
    }

    public final String toString() {
        return "CondensedItemInternal(title=" + this.a + ", text=" + this.b + ", leadingImage=" + this.c + ", leadingImageSize=" + ((Object) gny.h(this.j)) + ", trailingImage=" + this.d + ", trailingImageSize=" + ((Object) gny.h(this.k)) + ", shape=" + this.e + ", background=" + this.f + ", progressBar=" + this.g + ", onClick=" + this.h + ", isIndexable=" + this.i + ")";
    }
}
