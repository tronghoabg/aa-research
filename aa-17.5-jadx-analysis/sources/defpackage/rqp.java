package defpackage;

/* loaded from: classes.dex */
public final class rqp extends rqy {
    public final xxh a;
    public final int b;
    public final xxh c;
    public final int d;
    private final yxc e;
    private final yxy f;
    private final xxh g;
    private final xxh h;
    private final yfq i;
    private final ygr j;
    private final xxh k;
    private final xxh l;
    private final xxh m;

    public rqp(yxc yxcVar, yxy yxyVar, xxh xxhVar, xxh xxhVar2, xxh xxhVar3, yfq yfqVar, ygr ygrVar, int i, xxh xxhVar4, xxh xxhVar5, int i2, xxh xxhVar6, xxh xxhVar7) {
        this.e = yxcVar;
        this.f = yxyVar;
        this.a = xxhVar;
        this.g = xxhVar2;
        this.h = xxhVar3;
        this.i = yfqVar;
        this.j = ygrVar;
        this.b = i;
        this.k = xxhVar4;
        this.c = xxhVar5;
        this.d = i2;
        this.l = xxhVar6;
        this.m = xxhVar7;
    }

    @Override // defpackage.rqy
    public final xxh a() {
        return this.a;
    }

    @Override // defpackage.rqy
    public final xxh b() {
        return this.g;
    }

    @Override // defpackage.rqy
    public final yfq c() {
        return this.i;
    }

    @Override // defpackage.rqy
    public final ygr d() {
        return this.j;
    }

    @Override // defpackage.rqy
    public final yxc e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rqp) {
            rqp rqpVar = (rqp) obj;
            if (this.e.equals(rqpVar.e) && this.f.equals(rqpVar.f) && this.a.equals(rqpVar.a) && this.g.equals(rqpVar.g) && this.h.equals(rqpVar.h) && yrm.W(this.i, rqpVar.i) && this.j.equals(rqpVar.j) && this.b == rqpVar.b && this.k.equals(rqpVar.k) && this.c.equals(rqpVar.c) && this.d == rqpVar.d && this.l.equals(rqpVar.l) && this.m.equals(rqpVar.m)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rqy
    public final yxy f() {
        return this.f;
    }

    @Override // defpackage.rqy
    public final abnp g() {
        abnp abnpVarG = super.g();
        abnp abnpVarN = yxm.a.n();
        abnpVarN.t();
        yxm yxmVar = (yxm) abnpVarN.b;
        yxmVar.b |= 1;
        yxmVar.c = this.b;
        abnpVarN.t();
        yxm yxmVar2 = (yxm) abnpVarN.b;
        yxmVar2.b |= 4;
        yxmVar2.d = this.d;
        xxh xxhVar = this.l;
        if (xxhVar.f()) {
            int iIntValue = ((Integer) xxhVar.b()).intValue();
            abnpVarN.t();
            yxm yxmVar3 = (yxm) abnpVarN.b;
            yxmVar3.b |= 32;
            yxmVar3.g = iIntValue;
        }
        xxh xxhVar2 = this.c;
        if (xxhVar2.f()) {
            long jLongValue = ((Long) xxhVar2.b()).longValue();
            abnpVarN.t();
            yxm yxmVar4 = (yxm) abnpVarN.b;
            yxmVar4.b |= 8;
            yxmVar4.e = jLongValue;
        }
        xxh xxhVar3 = this.m;
        if (xxhVar3.f()) {
            Object objB = xxhVar3.b();
            abnpVarN.t();
            yxm yxmVar5 = (yxm) abnpVarN.b;
            yxmVar5.f = (yxl) objB;
            yxmVar5.b |= 16;
        }
        abnpVarG.t();
        yxb yxbVar = (yxb) abnpVarG.b;
        yxm yxmVar6 = (yxm) abnpVarN.q();
        yxb yxbVar2 = yxb.a;
        yxmVar6.getClass();
        yxbVar.I = yxmVar6;
        yxbVar.c |= sk.AUDIO_CONTENT_BUFFER_SIZE;
        return abnpVarG;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((this.e.hashCode() ^ 1000003) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.a.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.b) * 1000003) ^ 2040732332) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.l.hashCode();
        return this.m.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        xxh xxhVar = this.m;
        xxh xxhVar2 = this.l;
        xxh xxhVar3 = this.c;
        xxh xxhVar4 = this.k;
        ygr ygrVar = this.j;
        yfq yfqVar = this.i;
        xxh xxhVar5 = this.h;
        xxh xxhVar6 = this.g;
        xxh xxhVar7 = this.a;
        yxy yxyVar = this.f;
        return "ConnectivityLogEvent{carEventType=" + String.valueOf(this.e) + ", domainIdType=" + String.valueOf(yxyVar) + ", lifetimeId=" + String.valueOf(xxhVar7) + ", sessionId=" + String.valueOf(xxhVar6) + ", gearheadInfo=" + String.valueOf(xxhVar5) + ", domainLifetimeIds=" + String.valueOf(yfqVar) + ", testCodes=" + String.valueOf(ygrVar) + ", connectionEventType=" + this.b + ", timeSinceSessionStartMillis=" + String.valueOf(xxhVar4) + ", timeSinceBootMillis=" + String.valueOf(xxhVar3) + ", eventIndex=" + this.d + ", eventDetail=" + String.valueOf(xxhVar2) + ", connectionStatus=" + String.valueOf(xxhVar) + "}";
    }

    public rqp() {
        throw null;
    }
}
