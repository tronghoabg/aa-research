package defpackage;

import androidx.car.app.model.CondensedItem;
import java.util.List;

/* loaded from: classes2.dex */
public final class hag extends haw {
    public final gcs a;
    public final gcs b;
    public final List c;
    public final hat d;
    public final afeg e;
    private final xs f;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ hag(gcs gcsVar, gcs gcsVar2, xs xsVar, hat hatVar, afeg afegVar, int i) {
        afbe afbeVar = (i & 8) != 0 ? afbe.a : null;
        int i2 = i & 2;
        int i3 = i & 1;
        xsVar = (i & 4) != 0 ? null : xsVar;
        this(1 == i3 ? null : gcsVar, i2 != 0 ? null : gcsVar2, xsVar, afbeVar, (i & 16) != 0 ? null : hatVar, (i & 32) != 0 ? null : afegVar);
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
        return new hag(this.a, this.b, this.f, list, this.d, this.e);
    }

    @Override // defpackage.haw
    public final List d() {
        return this.c;
    }

    @Override // defpackage.haw
    public final boolean e() {
        return (this.a == null && this.c.isEmpty() && this.b == null && this.d == null) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hag)) {
            return false;
        }
        hag hagVar = (hag) obj;
        return affa.f(this.a, hagVar.a) && affa.f(this.b, hagVar.b) && affa.f(this.f, hagVar.f) && affa.f(this.c, hagVar.c) && affa.f(this.d, hagVar.d) && affa.f(this.e, hagVar.e);
    }

    public final int hashCode() {
        gcs gcsVar = this.a;
        int iHashCode = gcsVar == null ? 0 : gcsVar.hashCode();
        gcs gcsVar2 = this.b;
        int iHashCode2 = gcsVar2 == null ? 0 : gcsVar2.hashCode();
        int i = iHashCode * 31;
        xs xsVar = this.f;
        int iHashCode3 = (((((i + iHashCode2) * 31) + (xsVar == null ? 0 : xsVar.hashCode())) * 31) + this.c.hashCode()) * 31;
        hat hatVar = this.d;
        int iHashCode4 = (iHashCode3 + (hatVar == null ? 0 : hatVar.hashCode())) * 31;
        afeg afegVar = this.e;
        return iHashCode4 + (afegVar != null ? afegVar.hashCode() : 0);
    }

    public final String toString() {
        return "CondensedSectionInternal(sectionTitle=" + this.a + ", noItemsMessage=" + this.b + ", itemDelegate=" + this.f + ", loadedItems=" + this.c + ", sectionHeaderInternal=" + this.d + ", onItemVisibilityChanged=" + this.e + ")";
    }

    public hag(gcs gcsVar, gcs gcsVar2, xs xsVar, List list, hat hatVar, afeg afegVar) {
        list.getClass();
        this.a = gcsVar;
        this.b = gcsVar2;
        this.f = xsVar;
        this.c = list;
        this.d = hatVar;
        this.e = afegVar;
    }

    public hag() {
        this((gcs) null, (gcs) null, (xs) null, (hat) null, (afeg) null, 63);
    }
}
