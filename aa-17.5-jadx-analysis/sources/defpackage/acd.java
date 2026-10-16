package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class acd {
    public final acr a;
    public final adj b;
    public final abw c;
    public final acy d;
    public final adm e;
    public final boolean f;
    public final Map g;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ acd(acr acrVar, adj adjVar, abw abwVar, acy acyVar, boolean z, Map map, int i) {
        Map map2 = (i & 64) != 0 ? afbf.a : map;
        int i2 = i & 8;
        int i3 = i & 4;
        int i4 = i & 2;
        boolean z2 = (i & 32) == 0;
        int i5 = i & 1;
        boolean z3 = z2 & z;
        acy acyVar2 = i2 != 0 ? null : acyVar;
        abwVar = i3 != 0 ? null : abwVar;
        this(1 == i5 ? null : acrVar, i4 != 0 ? null : adjVar, abwVar, acyVar2, z3, map2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acd)) {
            return false;
        }
        acd acdVar = (acd) obj;
        if (affa.f(this.a, acdVar.a) && affa.f(this.b, acdVar.b) && affa.f(this.c, acdVar.c) && affa.f(this.d, acdVar.d)) {
            adm admVar = acdVar.e;
            if (this.f == acdVar.f && affa.f(this.g, acdVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        acr acrVar = this.a;
        int iHashCode = acrVar != null ? acrVar.hashCode() : 0;
        adj adjVar = this.b;
        int iHashCode2 = adjVar != null ? adjVar.hashCode() : 0;
        int i = iHashCode * 31;
        abw abwVar = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (abwVar != null ? abwVar.hashCode() : 0)) * 31;
        acy acyVar = this.d;
        return ((((iHashCode3 + (acyVar != null ? acyVar.hashCode() : 0)) * 961) + a.f(this.f)) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "EnterExitTransitionConfig(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", veil=null, hold=" + this.f + ", effectsMap=" + this.g + ")";
    }

    public acd(acr acrVar, adj adjVar, abw abwVar, acy acyVar, boolean z, Map map) {
        this.a = acrVar;
        this.b = adjVar;
        this.c = abwVar;
        this.d = acyVar;
        this.e = null;
        this.f = z;
        this.g = map;
    }

    public acd() {
        this(null, null, null, null, false, null, 127);
    }
}
