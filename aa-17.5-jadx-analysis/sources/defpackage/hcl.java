package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class hcl implements hju {
    public final List a;
    public final hju b;
    public final int c;
    public final int d;
    public final afeh e;
    public final aizm f;
    private final haz g;

    public /* synthetic */ hcl(List list, hju hjuVar, int i, int i2, afeh afehVar, aizm aizmVar, int i3) {
        this((i3 & 1) != 0 ? afbe.a : list, (i3 & 2) != 0 ? null : hjuVar, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 32) != 0 ? null : afehVar, (i3 & 64) != 0 ? null : aizmVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcl)) {
            return false;
        }
        hcl hclVar = (hcl) obj;
        if (!affa.f(this.a, hclVar.a) || !affa.f(this.b, hclVar.b) || this.c != hclVar.c || this.d != hclVar.d) {
            return false;
        }
        haz hazVar = hclVar.g;
        return affa.f(null, null) && affa.f(this.e, hclVar.e) && affa.f(this.f, hclVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        hju hjuVar = this.b;
        int iHashCode2 = (((iHashCode + (hjuVar == null ? 0 : hjuVar.hashCode())) * 31) + this.c) * 31;
        int i = this.d;
        afeh afehVar = this.e;
        int iHashCode3 = (((iHashCode2 + i) * 961) + (afehVar == null ? 0 : afehVar.hashCode())) * 31;
        aizm aizmVar = this.f;
        return iHashCode3 + (aizmVar != null ? aizmVar.hashCode() : 0);
    }

    public final String toString() {
        return "SectionedContentGridUiModel(sections=" + this.a + ", scrollContainerContents=" + this.b + ", initialScrolledItemIndex=" + this.c + ", initialScrollOffset=" + this.d + ", scrollRequest=null, onScroll=" + this.e + ", scrollToTopSignal=" + this.f + ")";
    }

    public hcl(List list, hju hjuVar, int i, int i2, afeh afehVar, aizm aizmVar) {
        list.getClass();
        this.a = list;
        this.b = hjuVar;
        this.c = i;
        this.d = i2;
        this.g = null;
        this.e = afehVar;
        this.f = aizmVar;
    }

    public hcl() {
        this(null, null, 0, 0, null, null, 127);
    }
}
