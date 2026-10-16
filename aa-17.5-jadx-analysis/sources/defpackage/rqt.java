package defpackage;

/* loaded from: classes2.dex */
public final class rqt extends rqy {
    private final yxc a;
    private final yxy b;
    private final xxh c;
    private final xxh d;
    private final xxh e;
    private final yfq f;
    private final ygr g;
    private final xxh h;
    private final xxh i;
    private final xxh j;

    public rqt(yxc yxcVar, yxy yxyVar, xxh xxhVar, xxh xxhVar2, xxh xxhVar3, yfq yfqVar, ygr ygrVar, xxh xxhVar4, xxh xxhVar5, xxh xxhVar6) {
        this.a = yxcVar;
        this.b = yxyVar;
        this.c = xxhVar;
        this.d = xxhVar2;
        this.e = xxhVar3;
        this.f = yfqVar;
        this.g = ygrVar;
        this.h = xxhVar4;
        this.i = xxhVar5;
        this.j = xxhVar6;
    }

    @Override // defpackage.rqy
    public final xxh a() {
        return this.c;
    }

    @Override // defpackage.rqy
    public final xxh b() {
        return this.d;
    }

    @Override // defpackage.rqy
    public final yfq c() {
        return this.f;
    }

    @Override // defpackage.rqy
    public final ygr d() {
        return this.g;
    }

    @Override // defpackage.rqy
    public final yxc e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rqt) {
            rqt rqtVar = (rqt) obj;
            if (this.a.equals(rqtVar.a) && this.b.equals(rqtVar.b) && this.c.equals(rqtVar.c) && this.d.equals(rqtVar.d) && this.e.equals(rqtVar.e) && yrm.W(this.f, rqtVar.f) && this.g.equals(rqtVar.g) && this.h.equals(rqtVar.h) && this.i.equals(rqtVar.i) && this.j.equals(rqtVar.j)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rqy
    public final yxy f() {
        return this.b;
    }

    @Override // defpackage.rqy
    public final abnp g() {
        abnp abnpVarG = super.g();
        abnp abnpVarN = yyd.a.n();
        xxh xxhVar = this.j;
        if (xxhVar.f()) {
            int i = ((yyb) xxhVar.b()).aW;
            abnpVarN.t();
            yyd yydVar = (yyd) abnpVarN.b;
            yydVar.b |= 4;
            yydVar.e = i;
        }
        xxh xxhVar2 = this.h;
        if (xxhVar2.f()) {
            int i2 = ((yyc) xxhVar2.b()).X;
            abnpVarN.t();
            yyd yydVar2 = (yyd) abnpVarN.b;
            yydVar2.b |= 1;
            yydVar2.c = i2;
        }
        xxh xxhVar3 = this.i;
        if (xxhVar3.f()) {
            int i3 = ((yyc) xxhVar3.b()).X;
            abnpVarN.t();
            yyd yydVar3 = (yyd) abnpVarN.b;
            yydVar3.b |= 2;
            yydVar3.d = i3;
        }
        yyd yydVar4 = (yyd) abnpVarN.q();
        abnpVarG.t();
        yxb yxbVar = (yxb) abnpVarG.b;
        yxb yxbVar2 = yxb.a;
        yydVar4.getClass();
        yxbVar.h = yydVar4;
        yxbVar.b |= 16;
        return abnpVarG;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
        return this.j.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        xxh xxhVar = this.j;
        xxh xxhVar2 = this.i;
        xxh xxhVar3 = this.h;
        ygr ygrVar = this.g;
        yfq yfqVar = this.f;
        xxh xxhVar4 = this.e;
        xxh xxhVar5 = this.d;
        xxh xxhVar6 = this.c;
        yxy yxyVar = this.b;
        return "FrxStateChangeLogEvent{carEventType=" + String.valueOf(this.a) + ", domainIdType=" + String.valueOf(yxyVar) + ", lifetimeId=" + String.valueOf(xxhVar6) + ", sessionId=" + String.valueOf(xxhVar5) + ", gearheadInfo=" + String.valueOf(xxhVar4) + ", domainLifetimeIds=" + String.valueOf(yfqVar) + ", testCodes=" + String.valueOf(ygrVar) + ", fromState=" + String.valueOf(xxhVar3) + ", toState=" + String.valueOf(xxhVar2) + ", frxEvent=" + String.valueOf(xxhVar) + "}";
    }

    public rqt() {
        throw null;
    }
}
