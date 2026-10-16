package defpackage;

import androidx.car.app.model.CarText;

/* loaded from: classes2.dex */
public final class hat implements gmo {
    public final CarText a;
    public final CarText b;
    public final fzy c;
    public final int d;
    public final fzy e;
    public final afdr f;

    public hat(CarText carText, CarText carText2, fzy fzyVar, int i, fzy fzyVar2, afdr afdrVar) {
        this.a = carText;
        this.b = carText2;
        this.c = fzyVar;
        this.d = i;
        this.e = fzyVar2;
        this.f = afdrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hat)) {
            return false;
        }
        hat hatVar = (hat) obj;
        return affa.f(this.a, hatVar.a) && affa.f(this.b, hatVar.b) && affa.f(this.c, hatVar.c) && this.d == hatVar.d && affa.f(this.e, hatVar.e) && affa.f(this.f, hatVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        CarText carText = this.b;
        int iHashCode2 = (iHashCode + (carText == null ? 0 : carText.hashCode())) * 31;
        fzy fzyVar = this.c;
        int iHashCode3 = (((iHashCode2 + (fzyVar == null ? 0 : fzyVar.hashCode())) * 31) + this.d) * 31;
        fzy fzyVar2 = this.e;
        int iHashCode4 = (iHashCode3 + (fzyVar2 == null ? 0 : fzyVar2.hashCode())) * 31;
        afdr afdrVar = this.f;
        return iHashCode4 + (afdrVar != null ? afdrVar.hashCode() : 0);
    }

    public final String toString() {
        return "SectionHeaderInternal(primaryTitleText=" + this.a + ", subtitle=" + this.b + ", leadingIcon=" + this.c + ", leadingIconType=" + this.d + ", trailingIcon=" + this.e + ", onClick=" + this.f + ")";
    }
}
