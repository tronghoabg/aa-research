package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class hbn implements hcb {
    public final List a;
    public final afeg b;
    public final int c;
    public final int d;
    public final afeg e;
    private final gfa f;
    private final hju g;

    public hbn(gfa gfaVar, hju hjuVar, List list, afeg afegVar, int i, int i2, afeg afegVar2) {
        this.f = gfaVar;
        this.g = hjuVar;
        this.a = list;
        this.b = afegVar;
        this.c = i;
        this.d = i2;
        this.e = afegVar2;
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
        if (!(obj instanceof hbn)) {
            return false;
        }
        hbn hbnVar = (hbn) obj;
        return affa.f(this.f, hbnVar.f) && affa.f(this.g, hbnVar.g) && affa.f(this.a, hbnVar.a) && affa.f(this.b, hbnVar.b) && this.c == hbnVar.c && this.d == hbnVar.d && affa.f(this.e, hbnVar.e);
    }

    public final int hashCode() {
        gfa gfaVar = this.f;
        int iHashCode = gfaVar == null ? 0 : gfaVar.hashCode();
        hju hjuVar = this.g;
        int iHashCode2 = (((iHashCode * 31) + (hjuVar == null ? 0 : hjuVar.hashCode())) * 31) + this.a.hashCode();
        afeg afegVar = this.b;
        int iHashCode3 = ((((((iHashCode2 * 31) + (afegVar == null ? 0 : afegVar.hashCode())) * 31) + this.c) * 31) + this.d) * 31;
        afeg afegVar2 = this.e;
        return iHashCode3 + (afegVar2 != null ? afegVar2.hashCode() : 0);
    }

    public final String toString() {
        return "FilterChipSectionUiModel(title=" + this.f + ", sectionHeader=" + this.g + ", items=" + this.a + ", onItemVisibilityChanged=" + this.b + ", scrollIndex=" + this.c + ", scrollOffset=" + this.d + ", onScroll=" + this.e + ")";
    }

    public hbn() {
        this(null, null, afbe.a, null, 0, 0, null);
    }
}
