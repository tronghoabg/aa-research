package defpackage;

/* loaded from: classes2.dex */
public final class gun extends guw {
    public final gab a;
    public final gab b;
    public final gfa c;
    public final gfa d;
    public final gab e;
    public final gab f;
    public final gfa g;

    public gun(gab gabVar, gab gabVar2, gfa gfaVar, gfa gfaVar2, gab gabVar3, gab gabVar4, gfa gfaVar3) {
        this.a = gabVar;
        this.b = gabVar2;
        this.c = gfaVar;
        this.d = gfaVar2;
        this.e = gabVar3;
        this.f = gabVar4;
        this.g = gfaVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gun)) {
            return false;
        }
        gun gunVar = (gun) obj;
        return affa.f(this.a, gunVar.a) && affa.f(this.b, gunVar.b) && affa.f(this.c, gunVar.c) && affa.f(this.d, gunVar.d) && affa.f(this.e, gunVar.e) && affa.f(this.f, gunVar.f) && affa.f(this.g, gunVar.g);
    }

    public final int hashCode() {
        gab gabVar = this.a;
        int iHashCode = gabVar == null ? 0 : gabVar.hashCode();
        gab gabVar2 = this.b;
        int iHashCode2 = (((((iHashCode * 31) + (gabVar2 == null ? 0 : gabVar2.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        gab gabVar3 = this.e;
        int iHashCode3 = ((iHashCode2 * 31) + (gabVar3 == null ? 0 : gabVar3.hashCode())) * 31;
        gab gabVar4 = this.f;
        return ((iHashCode3 + (gabVar4 != null ? gabVar4.hashCode() : 0)) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "ExpandedTurnCardUiModel(laneImage=" + this.a + ", turnImage=" + this.b + ", turnDistance=" + this.c + ", cueText=" + this.d + ", junctionImage=" + this.e + ", nextTurnImage=" + this.f + ", nextTurnText=" + this.g + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public gun() {
        gfs gfsVar = gey.b;
        this(null, null, gfsVar, gfsVar, null, null, gfsVar);
    }
}
