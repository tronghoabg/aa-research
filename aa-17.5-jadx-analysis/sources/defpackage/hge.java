package defpackage;

/* loaded from: classes2.dex */
public final class hge {
    public final boolean a;
    public final hgd b;
    public final long c;
    public final long d;

    public /* synthetic */ hge(hgd hgdVar, int i) {
        this(false, (i & 2) != 0 ? new hgd(null, null) : hgdVar, cjn.i(0), cjn.i(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hge)) {
            return false;
        }
        hge hgeVar = (hge) obj;
        return this.a == hgeVar.a && affa.f(this.b, hgeVar.b) && a.j(this.c, hgeVar.c) && a.j(this.d, hgeVar.d);
    }

    public final int hashCode() {
        return (((((a.f(this.a) * 31) + this.b.hashCode()) * 31) + a.g(this.c)) * 31) + a.g(this.d);
    }

    public final String toString() {
        long j = this.d;
        return "SurfaceAreaParams(freezeAreaCalculation=" + this.a + ", stableAreaAnchors=" + this.b + ", visibleAreaBackgroundColor=" + cjv.g(this.c) + ", stableAreaBackgroundColor=" + cjv.g(j) + ")";
    }

    public hge(boolean z, hgd hgdVar, long j, long j2) {
        hgdVar.getClass();
        this.a = z;
        this.b = hgdVar;
        this.c = j;
        this.d = j2;
    }
}
