package defpackage;

/* loaded from: classes2.dex */
public final class rqr extends rqy {
    public final long a;
    private final yxc b;
    private final yxy c;
    private final xxh d;
    private final xxh e;
    private final xxh f;
    private final yfq g;
    private final ygr h;
    private final yxk i;
    private final int j;
    private final int k;

    public rqr(yxc yxcVar, yxy yxyVar, xxh xxhVar, xxh xxhVar2, xxh xxhVar3, yfq yfqVar, ygr ygrVar, int i, int i2, yxk yxkVar, long j) {
        this.b = yxcVar;
        this.c = yxyVar;
        this.d = xxhVar;
        this.e = xxhVar2;
        this.f = xxhVar3;
        this.g = yfqVar;
        this.h = ygrVar;
        this.j = i;
        this.k = i2;
        this.i = yxkVar;
        this.a = j;
    }

    @Override // defpackage.rqy
    public final xxh a() {
        return this.d;
    }

    @Override // defpackage.rqy
    public final xxh b() {
        return this.e;
    }

    @Override // defpackage.rqy
    public final yfq c() {
        return this.g;
    }

    @Override // defpackage.rqy
    public final ygr d() {
        return this.h;
    }

    @Override // defpackage.rqy
    public final yxc e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rqr) {
            rqr rqrVar = (rqr) obj;
            if (this.b.equals(rqrVar.b) && this.c.equals(rqrVar.c) && this.d.equals(rqrVar.d) && this.e.equals(rqrVar.e) && this.f.equals(rqrVar.f) && yrm.W(this.g, rqrVar.g) && this.h.equals(rqrVar.h)) {
                int i = this.j;
                int i2 = rqrVar.j;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    int i3 = this.k;
                    int i4 = rqrVar.k;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == i4 && this.i.equals(rqrVar.i) && this.a == rqrVar.a) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.rqy
    public final yxy f() {
        return this.c;
    }

    @Override // defpackage.rqy
    public final abnp g() {
        abnp abnpVarG = super.g();
        abnp abnpVarN = yzn.a.n();
        int i = this.j;
        if (i == 0) {
            throw null;
        }
        abnpVarN.t();
        yzn yznVar = (yzn) abnpVarN.b;
        yznVar.b |= 1;
        yznVar.c = i - 1;
        int i2 = this.k;
        if (i2 == 0) {
            throw null;
        }
        abnpVarN.t();
        yzn yznVar2 = (yzn) abnpVarN.b;
        yznVar2.b |= 2;
        yznVar2.d = i2 - 1;
        int i3 = this.i.D;
        abnpVarN.t();
        yzn yznVar3 = (yzn) abnpVarN.b;
        yznVar3.b |= 4;
        yznVar3.e = i3;
        long j = this.a;
        abnpVarN.t();
        yzn yznVar4 = (yzn) abnpVarN.b;
        yznVar4.b |= 8;
        yznVar4.f = j;
        yzn yznVar5 = (yzn) abnpVarN.q();
        abnpVarG.t();
        yxb yxbVar = (yxb) abnpVarG.b;
        yxb yxbVar2 = yxb.a;
        yznVar5.getClass();
        yxbVar.U = yznVar5;
        yxbVar.c |= 4194304;
        return abnpVarG;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
        int i = this.j;
        a.aW(i);
        int i2 = this.k;
        a.aW(i2);
        int iHashCode2 = (((((iHashCode * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ this.i.hashCode();
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) ^ (iHashCode2 * 1000003);
    }

    public final String toString() {
        int i = this.j;
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(this.c);
        String strValueOf3 = String.valueOf(this.d);
        String strValueOf4 = String.valueOf(this.e);
        String strValueOf5 = String.valueOf(this.f);
        String strValueOf6 = String.valueOf(this.g);
        String strValueOf7 = String.valueOf(this.h);
        String string = i != 0 ? Integer.toString(i - 1) : "null";
        int i2 = this.k;
        return "ConnectivityStateLogEvent{carEventType=" + strValueOf + ", domainIdType=" + strValueOf2 + ", lifetimeId=" + strValueOf3 + ", sessionId=" + strValueOf4 + ", gearheadInfo=" + strValueOf5 + ", domainLifetimeIds=" + strValueOf6 + ", testCodes=" + strValueOf7 + ", toState=" + string + ", fromState=" + (i2 != 0 ? Integer.toString(i2 - 1) : "null") + ", event=" + String.valueOf(this.i) + ", timeSinceBootMillis=" + this.a + "}";
    }

    public rqr() {
        throw null;
    }
}
