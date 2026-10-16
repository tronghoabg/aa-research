package defpackage;

import androidx.car.app.model.CarText;
import androidx.car.app.model.CondensedItem;
import java.util.List;

/* loaded from: classes2.dex */
public final class hba extends haw {
    public final CarText a;
    public final gag b;
    public final hat c;
    public final List d;
    private final afeg e;
    private final xs f;

    public hba(CarText carText, gag gagVar, hat hatVar, afeg afegVar, List list, xs xsVar) {
        this.a = carText;
        this.b = gagVar;
        this.c = hatVar;
        this.e = afegVar;
        this.d = list;
        this.f = xsVar;
    }

    @Override // defpackage.haw
    public final xs a() {
        return this.f;
    }

    @Override // defpackage.haw
    public final /* bridge */ /* synthetic */ ham b(uf ufVar, geu geuVar) {
        CondensedItem condensedItem = (CondensedItem) ufVar;
        condensedItem.getClass();
        geuVar.getClass();
        return gny.g(condensedItem, geuVar);
    }

    @Override // defpackage.haw
    public final /* synthetic */ haw c(List list) {
        return new hba(this.a, this.b, this.c, this.e, list, this.f);
    }

    @Override // defpackage.haw
    public final List d() {
        return this.d;
    }

    @Override // defpackage.haw
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hba)) {
            return false;
        }
        hba hbaVar = (hba) obj;
        return affa.f(this.a, hbaVar.a) && affa.f(this.b, hbaVar.b) && affa.f(this.c, hbaVar.c) && affa.f(this.e, hbaVar.e) && affa.f(this.d, hbaVar.d) && affa.f(this.f, hbaVar.f);
    }

    public final int hashCode() {
        CarText carText = this.a;
        int iHashCode = ((carText == null ? 0 : carText.hashCode()) * 31) + this.b.hashCode();
        hat hatVar = this.c;
        int iHashCode2 = ((iHashCode * 31) + (hatVar == null ? 0 : hatVar.hashCode())) * 31;
        afeg afegVar = this.e;
        int iHashCode3 = (((iHashCode2 + (afegVar == null ? 0 : afegVar.hashCode())) * 31) + this.d.hashCode()) * 31;
        xs xsVar = this.f;
        return iHashCode3 + (xsVar != null ? xsVar.hashCode() : 0);
    }

    public final String toString() {
        return "SpotlightSectionInternal(sectionTitle=" + this.a + ", image=" + this.b + ", sectionHeaderInternal=" + this.c + ", onItemVisibilityChanged=" + this.e + ", loadedItems=" + this.d + ", itemDelegate=" + this.f + ")";
    }
}
