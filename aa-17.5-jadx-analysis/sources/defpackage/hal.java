package defpackage;

import androidx.car.app.model.CarText;
import androidx.car.app.model.GridItem;
import java.util.List;

/* loaded from: classes2.dex */
public final class hal extends haw {
    public final CarText a;
    public final hat b;
    public final CarText c;
    public final afeg d;
    public final List e;
    public final int f;
    public final int g;
    private final xs h;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ hal(CarText carText, CarText carText2, int i, int i2, afeg afegVar, List list, int i3) {
        List list2 = (i3 & 64) != 0 ? afbe.a : list;
        int i4 = i3 & 16;
        int i5 = i3 & 8;
        afeg afegVar2 = (i3 & 32) != 0 ? null : afegVar;
        int i6 = i4 != 0 ? 1 : i2;
        int i7 = i5 != 0 ? 1 : i;
        int i8 = i3 & 1;
        this(1 == i8 ? null : carText, null, (i3 & 4) != 0 ? null : carText2, i7, i6, afegVar2, list2, null);
    }

    @Override // defpackage.haw
    public final xs a() {
        return this.h;
    }

    @Override // defpackage.haw
    public final /* bridge */ /* synthetic */ ham b(uf ufVar, geu geuVar) {
        GridItem gridItem = (GridItem) ufVar;
        gridItem.getClass();
        geuVar.getClass();
        return gnz.c(gridItem, geuVar);
    }

    @Override // defpackage.haw
    public final /* synthetic */ haw c(List list) {
        return new hal(this.a, this.b, this.c, this.f, this.g, this.d, list, this.h);
    }

    @Override // defpackage.haw
    public final List d() {
        return this.e;
    }

    @Override // defpackage.haw
    public final boolean e() {
        return (this.a == null && this.b == null && this.c == null && this.e.isEmpty()) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hal)) {
            return false;
        }
        hal halVar = (hal) obj;
        return affa.f(this.a, halVar.a) && affa.f(this.b, halVar.b) && affa.f(this.c, halVar.c) && this.f == halVar.f && this.g == halVar.g && affa.f(this.d, halVar.d) && affa.f(this.e, halVar.e) && affa.f(this.h, halVar.h);
    }

    public final int hashCode() {
        CarText carText = this.a;
        int iHashCode = carText == null ? 0 : carText.hashCode();
        hat hatVar = this.b;
        int iHashCode2 = hatVar == null ? 0 : hatVar.hashCode();
        int i = iHashCode * 31;
        CarText carText2 = this.c;
        int iHashCode3 = (((((((i + iHashCode2) * 31) + (carText2 == null ? 0 : carText2.hashCode())) * 31) + this.f) * 31) + this.g) * 31;
        afeg afegVar = this.d;
        int iHashCode4 = (((iHashCode3 + (afegVar == null ? 0 : afegVar.hashCode())) * 31) + this.e.hashCode()) * 31;
        xs xsVar = this.h;
        return iHashCode4 + (xsVar != null ? xsVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GridSectionInternal(sectionTitle=");
        sb.append(this.a);
        sb.append(", sectionHeaderInternal=");
        sb.append(this.b);
        sb.append(", noItemsMessage=");
        sb.append(this.c);
        sb.append(", imageSize=");
        int i = this.f;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "EXTRA_LARGE" : "LARGE" : "MEDIUM" : "SMALL" : "UNSET"));
        sb.append(", itemImageShape=");
        sb.append((Object) (this.g != 1 ? "CIRCLE" : "UNSET"));
        sb.append(", onItemVisibilityChanged=");
        sb.append(this.d);
        sb.append(", loadedItems=");
        sb.append(this.e);
        sb.append(", itemDelegate=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    public hal(CarText carText, hat hatVar, CarText carText2, int i, int i2, afeg afegVar, List list, xs xsVar) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        list.getClass();
        this.a = carText;
        this.b = hatVar;
        this.c = carText2;
        this.f = i;
        this.g = i2;
        this.d = afegVar;
        this.e = list;
        this.h = xsVar;
    }

    public hal() {
        this(null, null, 0, 0, null, null, 255);
    }
}
