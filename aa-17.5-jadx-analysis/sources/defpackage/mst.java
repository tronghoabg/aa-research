package defpackage;

/* loaded from: classes.dex */
public final class mst {
    public final mss a;
    public final cfy b;
    public final boolean c;
    public final afec d;
    public final boolean e;

    public mst(mss mssVar, cfy cfyVar, boolean z, afec afecVar, boolean z2) {
        cfyVar.getClass();
        afecVar.getClass();
        this.a = mssVar;
        this.b = cfyVar;
        this.c = z;
        this.d = afecVar;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mst)) {
            return false;
        }
        mst mstVar = (mst) obj;
        return affa.f(this.a, mstVar.a) && affa.f(this.b, mstVar.b) && this.c == mstVar.c && affa.f(this.d, mstVar.d) && this.e == mstVar.e;
    }

    public final int hashCode() {
        mss mssVar = this.a;
        return ((((((((mssVar == null ? 0 : mssVar.hashCode()) * 31) + this.b.hashCode()) * 31) + a.f(this.c)) * 31) + this.d.hashCode()) * 31) + a.f(this.e);
    }

    public final String toString() {
        return "CardContentParams(cardContent=" + this.a + ", modifier=" + this.b + ", isHorizontal=" + this.c + ", onSwipeProgressChanged=" + this.d + ", isMultiCardLayout=" + this.e + ")";
    }

    public /* synthetic */ mst(mss mssVar, cfy cfyVar, boolean z, boolean z2) {
        this(mssVar, cfyVar, z, new mii(9), z2);
    }
}
