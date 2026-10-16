package defpackage;

import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Row;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class har extends haw {
    public final CarText a;
    public final hat b;
    public final CarText c;
    public final afeg d;
    public final int e;
    public final List f;
    private final xs g;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ har(CarText carText, CarText carText2, afeg afegVar, int i, List list, int i2) {
        List list2 = (i2 & 32) != 0 ? afbe.a : list;
        int i3 = i2 & 16;
        int i4 = i2 & 8;
        int i5 = i2 & 4;
        int i6 = i2 & 1;
        int i7 = i3 != 0 ? -1 : i;
        afeg afegVar2 = i4 != 0 ? null : afegVar;
        this(1 == i6 ? null : carText, null, i5 != 0 ? null : carText2, afegVar2, i7, list2, null);
    }

    public static /* synthetic */ har f(har harVar, CarText carText, afeg afegVar, int i, List list, int i2) {
        if ((i2 & 1) != 0) {
            carText = harVar.a;
        }
        CarText carText2 = carText;
        hat hatVar = (i2 & 2) != 0 ? harVar.b : null;
        CarText carText3 = (i2 & 4) != 0 ? harVar.c : null;
        if ((i2 & 8) != 0) {
            afegVar = harVar.d;
        }
        afeg afegVar2 = afegVar;
        if ((i2 & 16) != 0) {
            i = harVar.e;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            list = harVar.f;
        }
        List list2 = list;
        xs xsVar = harVar.g;
        list2.getClass();
        return new har(carText2, hatVar, carText3, afegVar2, i3, list2, xsVar);
    }

    @Override // defpackage.haw
    public final xs a() {
        return this.g;
    }

    @Override // defpackage.haw
    public final /* bridge */ /* synthetic */ ham b(uf ufVar, geu geuVar) {
        ufVar.getClass();
        geuVar.getClass();
        if (ufVar instanceof Row) {
            return haq.b((Row) ufVar, geuVar);
        }
        if (ufVar instanceof ConversationItem) {
            return haq.a((ConversationItem) ufVar, geuVar);
        }
        Objects.toString(ufVar);
        throw new IllegalArgumentException("Invalid item for RowSectionInternal ".concat(ufVar.toString()));
    }

    @Override // defpackage.haw
    public final /* synthetic */ haw c(List list) {
        return f(this, null, null, 0, list, 95);
    }

    @Override // defpackage.haw
    public final List d() {
        return this.f;
    }

    @Override // defpackage.haw
    public final boolean e() {
        return (this.a == null && this.b == null && this.c == null && this.f.isEmpty()) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof har)) {
            return false;
        }
        har harVar = (har) obj;
        return affa.f(this.a, harVar.a) && affa.f(this.b, harVar.b) && affa.f(this.c, harVar.c) && affa.f(this.d, harVar.d) && this.e == harVar.e && affa.f(this.f, harVar.f) && affa.f(this.g, harVar.g);
    }

    public final int hashCode() {
        CarText carText = this.a;
        int iHashCode = carText == null ? 0 : carText.hashCode();
        hat hatVar = this.b;
        int iHashCode2 = hatVar == null ? 0 : hatVar.hashCode();
        int i = iHashCode * 31;
        CarText carText2 = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (carText2 == null ? 0 : carText2.hashCode())) * 31;
        afeg afegVar = this.d;
        int iHashCode4 = (((((iHashCode3 + (afegVar == null ? 0 : afegVar.hashCode())) * 31) + this.e) * 31) + this.f.hashCode()) * 31;
        xs xsVar = this.g;
        return iHashCode4 + (xsVar != null ? xsVar.hashCode() : 0);
    }

    public final String toString() {
        return "RowSectionInternal(sectionTitle=" + this.a + ", sectionHeaderInternal=" + this.b + ", noItemsMessage=" + this.c + ", onItemVisibilityChanged=" + this.d + ", initiallySelectedIndex=" + this.e + ", loadedItems=" + this.f + ", itemDelegate=" + this.g + ")";
    }

    public har(CarText carText, hat hatVar, CarText carText2, afeg afegVar, int i, List list, xs xsVar) {
        list.getClass();
        this.a = carText;
        this.b = hatVar;
        this.c = carText2;
        this.d = afegVar;
        this.e = i;
        this.f = list;
        this.g = xsVar;
    }

    public har() {
        this(null, null, null, 0, null, 127);
    }
}
