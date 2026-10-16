package defpackage;

import androidx.car.app.model.CarText;
import java.util.List;

/* loaded from: classes2.dex */
public final class hac extends ham {
    public final CarText a;
    public final CarText b;
    public final afdr c;
    public final hab d;
    public final List e;
    public final List f;
    public final hae g;

    public hac(CarText carText, CarText carText2, afdr afdrVar, hab habVar, List list, List list2, hae haeVar) {
        super(false);
        this.a = carText;
        this.b = carText2;
        this.c = afdrVar;
        this.d = habVar;
        this.e = list;
        this.f = list2;
        this.g = haeVar;
    }

    @Override // defpackage.ham
    public final CarText a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hac)) {
            return false;
        }
        hac hacVar = (hac) obj;
        return affa.f(this.a, hacVar.a) && affa.f(this.b, hacVar.b) && affa.f(this.c, hacVar.c) && affa.f(this.d, hacVar.d) && affa.f(this.e, hacVar.e) && affa.f(this.f, hacVar.f) && affa.f(this.g, hacVar.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        CarText carText = this.b;
        int iHashCode2 = (iHashCode + (carText == null ? 0 : carText.hashCode())) * 31;
        afdr afdrVar = this.c;
        int iHashCode3 = (iHashCode2 + (afdrVar == null ? 0 : afdrVar.hashCode())) * 31;
        hab habVar = this.d;
        int iHashCode4 = (((((iHashCode3 + (habVar == null ? 0 : habVar.hashCode())) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        hae haeVar = this.g;
        return iHashCode4 + (haeVar != null ? haeVar.hashCode() : 0);
    }

    public final String toString() {
        return "BannerInternal(title=" + this.a + ", subtitle=" + this.b + ", onClick=" + this.c + ", leadingElement=" + this.d + ", trailingElements=" + this.e + ", belowActions=" + this.f + ", style=" + this.g + ")";
    }
}
