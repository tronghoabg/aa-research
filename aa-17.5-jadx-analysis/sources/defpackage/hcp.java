package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class hcp implements hcb {
    public final gfa a;
    public final hju b;
    public final List c;
    public final afeg d = null;
    public final gbg e;

    public hcp(gfa gfaVar, hju hjuVar, List list, gbg gbgVar) {
        this.a = gfaVar;
        this.b = hjuVar;
        this.c = list;
        this.e = gbgVar;
    }

    @Override // defpackage.hcb
    public final gfa a() {
        return this.a;
    }

    @Override // defpackage.hcb
    public final hju b() {
        return this.b;
    }

    @Override // defpackage.hcb
    public final List c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcp)) {
            return false;
        }
        hcp hcpVar = (hcp) obj;
        if (!affa.f(this.a, hcpVar.a) || !affa.f(this.b, hcpVar.b) || !affa.f(this.c, hcpVar.c)) {
            return false;
        }
        afeg afegVar = hcpVar.d;
        return affa.f(null, null) && affa.f(this.e, hcpVar.e);
    }

    public final int hashCode() {
        gfa gfaVar = this.a;
        int iHashCode = gfaVar == null ? 0 : gfaVar.hashCode();
        hju hjuVar = this.b;
        return (((((iHashCode * 31) + (hjuVar != null ? hjuVar.hashCode() : 0)) * 31) + this.c.hashCode()) * 961) + this.e.hashCode();
    }

    public final String toString() {
        return "SpotlightSectionUiModel(title=" + this.a + ", sectionHeader=" + this.b + ", items=" + this.c + ", onItemVisibilityChanged=null, image=" + this.e + ")";
    }
}
