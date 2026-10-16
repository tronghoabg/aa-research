package defpackage;

/* loaded from: classes2.dex */
public final class rql extends rqy {
    public final long a;
    private final yxc b;
    private final yxy c;
    private final xxh d;
    private final xxh e;
    private final xxh f;
    private final yfq g;
    private final ygr h;
    private final int i;

    public rql(yxc yxcVar, yxy yxyVar, xxh xxhVar, xxh xxhVar2, xxh xxhVar3, yfq yfqVar, ygr ygrVar, int i, long j) {
        this.b = yxcVar;
        this.c = yxyVar;
        this.d = xxhVar;
        this.e = xxhVar2;
        this.f = xxhVar3;
        this.g = yfqVar;
        this.h = ygrVar;
        this.i = i;
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
        if (obj instanceof rql) {
            rql rqlVar = (rql) obj;
            if (this.b.equals(rqlVar.b) && this.c.equals(rqlVar.c) && this.d.equals(rqlVar.d) && this.e.equals(rqlVar.e) && this.f.equals(rqlVar.f) && yrm.W(this.g, rqlVar.g) && this.h.equals(rqlVar.h)) {
                int i = this.i;
                int i2 = rqlVar.i;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.a == rqlVar.a) {
                    return true;
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
        abnp abnpVarN = ywr.a.n();
        int i = this.i;
        if (i == 0) {
            throw null;
        }
        abnpVarN.t();
        ywr ywrVar = (ywr) abnpVarN.b;
        ywrVar.b |= 1;
        ywrVar.c = i - 1;
        long j = this.a;
        abnpVarN.t();
        ywr ywrVar2 = (ywr) abnpVarN.b;
        ywrVar2.b |= 2;
        ywrVar2.d = j;
        ywr ywrVar3 = (ywr) abnpVarN.q();
        abnpVarG.t();
        yxb yxbVar = (yxb) abnpVarG.b;
        yxb yxbVar2 = yxb.a;
        ywrVar3.getClass();
        yxbVar.Y = ywrVar3;
        yxbVar.c |= 134217728;
        return abnpVarG;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
        int i = this.i;
        a.aW(i);
        long j = this.a;
        return (((iHashCode * 1000003) ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        int i = this.i;
        return "BtProfileConnectLogEvent{carEventType=" + String.valueOf(this.b) + ", domainIdType=" + String.valueOf(this.c) + ", lifetimeId=" + String.valueOf(this.d) + ", sessionId=" + String.valueOf(this.e) + ", gearheadInfo=" + String.valueOf(this.f) + ", domainLifetimeIds=" + String.valueOf(this.g) + ", testCodes=" + String.valueOf(this.h) + ", connectionType=" + (i != 0 ? Integer.toString(i - 1) : "null") + ", timeSinceBootMillis=" + this.a + "}";
    }

    public rql() {
        throw null;
    }
}
