package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class hck implements hcb {
    public final List a;
    public final afeg b;
    public final gfa c;
    public final hcd d;
    public final boolean e;
    private final gfa f;
    private final hju g;

    public hck(gfa gfaVar, hju hjuVar, List list, afeg afegVar, gfa gfaVar2, hcd hcdVar, boolean z) {
        this.f = gfaVar;
        this.g = hjuVar;
        this.a = list;
        this.b = afegVar;
        this.c = gfaVar2;
        this.d = hcdVar;
        this.e = z;
    }

    public static /* synthetic */ hck d(hck hckVar, List list) {
        gfa gfaVar = hckVar.f;
        hju hjuVar = hckVar.g;
        afeg afegVar = hckVar.b;
        gfa gfaVar2 = hckVar.c;
        hcd hcdVar = hckVar.d;
        boolean z = hckVar.e;
        list.getClass();
        return new hck(gfaVar, hjuVar, list, afegVar, gfaVar2, hcdVar, z);
    }

    @Override // defpackage.hcb
    public final gfa a() {
        return this.f;
    }

    @Override // defpackage.hcb
    public final hju b() {
        return this.g;
    }

    @Override // defpackage.hcb
    public final List c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hck)) {
            return false;
        }
        hck hckVar = (hck) obj;
        return affa.f(this.f, hckVar.f) && affa.f(this.g, hckVar.g) && affa.f(this.a, hckVar.a) && affa.f(this.b, hckVar.b) && affa.f(this.c, hckVar.c) && this.d == hckVar.d && this.e == hckVar.e;
    }

    public final int hashCode() {
        gfa gfaVar = this.f;
        int iHashCode = gfaVar == null ? 0 : gfaVar.hashCode();
        hju hjuVar = this.g;
        int iHashCode2 = (((iHashCode * 31) + (hjuVar == null ? 0 : hjuVar.hashCode())) * 31) + this.a.hashCode();
        afeg afegVar = this.b;
        int iHashCode3 = ((iHashCode2 * 31) + (afegVar == null ? 0 : afegVar.hashCode())) * 31;
        gfa gfaVar2 = this.c;
        return ((((iHashCode3 + (gfaVar2 != null ? gfaVar2.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + a.f(this.e);
    }

    public final String toString() {
        return "SectionedContentGridSectionUiModel(title=" + this.f + ", sectionHeader=" + this.g + ", items=" + this.a + ", onItemVisibilityChanged=" + this.b + ", noItemsMessage=" + this.c + ", itemType=" + this.d + ", showDivider=" + this.e + ")";
    }
}
