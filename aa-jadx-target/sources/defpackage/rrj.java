package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rrj extends defpackage.rrs {
    public final defpackage.xyn a;
    public final int b;
    public final defpackage.xyn c;
    public final int d;
    private final defpackage.yyh e;
    private final defpackage.yzd f;
    private final defpackage.xyn g;
    private final defpackage.xyn h;
    private final defpackage.ygw i;
    private final defpackage.yhx j;
    private final defpackage.xyn k;
    private final defpackage.xyn l;
    private final defpackage.xyn m;

    public rrj(defpackage.yyh yyhVar, defpackage.yzd yzdVar, defpackage.xyn xynVar, defpackage.xyn xynVar2, defpackage.xyn xynVar3, defpackage.ygw ygwVar, defpackage.yhx yhxVar, int i, defpackage.xyn xynVar4, defpackage.xyn xynVar5, int i2, defpackage.xyn xynVar6, defpackage.xyn xynVar7) {
        this.e = yyhVar;
        this.f = yzdVar;
        this.a = xynVar;
        this.g = xynVar2;
        this.h = xynVar3;
        this.i = ygwVar;
        this.j = yhxVar;
        this.b = i;
        this.k = xynVar4;
        this.c = xynVar5;
        this.d = i2;
        this.l = xynVar6;
        this.m = xynVar7;
    }

    @Override // defpackage.rrs
    public final defpackage.xyn a() {
        return this.a;
    }

    @Override // defpackage.rrs
    public final defpackage.xyn b() {
        return this.g;
    }

    @Override // defpackage.rrs
    public final defpackage.ygw c() {
        return this.i;
    }

    @Override // defpackage.rrs
    public final defpackage.yhx d() {
        return this.j;
    }

    @Override // defpackage.rrs
    public final defpackage.yyh e() {
        return this.e;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.rrj) {
            defpackage.rrj rrjVar = (defpackage.rrj) obj;
            if (this.e.equals(rrjVar.e) && this.f.equals(rrjVar.f) && this.a.equals(rrjVar.a) && this.g.equals(rrjVar.g) && this.h.equals(rrjVar.h) && defpackage.ysr.W(this.i, rrjVar.i) && this.j.equals(rrjVar.j) && this.b == rrjVar.b && this.k.equals(rrjVar.k) && this.c.equals(rrjVar.c) && this.d == rrjVar.d && this.l.equals(rrjVar.l) && this.m.equals(rrjVar.m)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rrs
    public final defpackage.yzd f() {
        return this.f;
    }

    @Override // defpackage.rrs
    public final defpackage.abor g() {
        defpackage.abor aborVarG = super.g();
        defpackage.abor aborVarN = defpackage.yyr.a.n();
        aborVarN.t();
        defpackage.yyr yyrVar = (defpackage.yyr) aborVarN.b;
        yyrVar.b |= 1;
        yyrVar.c = this.b;
        aborVarN.t();
        defpackage.yyr yyrVar2 = (defpackage.yyr) aborVarN.b;
        yyrVar2.b |= 4;
        yyrVar2.d = this.d;
        defpackage.xyn xynVar = this.l;
        if (xynVar.f()) {
            int iIntValue = ((java.lang.Integer) xynVar.b()).intValue();
            aborVarN.t();
            defpackage.yyr yyrVar3 = (defpackage.yyr) aborVarN.b;
            yyrVar3.b |= 32;
            yyrVar3.g = iIntValue;
        }
        defpackage.xyn xynVar2 = this.c;
        if (xynVar2.f()) {
            long jLongValue = ((java.lang.Long) xynVar2.b()).longValue();
            aborVarN.t();
            defpackage.yyr yyrVar4 = (defpackage.yyr) aborVarN.b;
            yyrVar4.b |= 8;
            yyrVar4.e = jLongValue;
        }
        defpackage.xyn xynVar3 = this.m;
        if (xynVar3.f()) {
            java.lang.Object objB = xynVar3.b();
            aborVarN.t();
            defpackage.yyr yyrVar5 = (defpackage.yyr) aborVarN.b;
            yyrVar5.f = (defpackage.yyq) objB;
            yyrVar5.b |= 16;
        }
        aborVarG.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarG.b;
        defpackage.yyr yyrVar6 = (defpackage.yyr) aborVarN.q();
        defpackage.yyg yygVar2 = defpackage.yyg.a;
        yyrVar6.getClass();
        yygVar.I = yyrVar6;
        yygVar.c |= 512;
        return aborVarG;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((this.e.hashCode() ^ 1000003) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.a.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.b) * 1000003) ^ 2040732332) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.l.hashCode();
        return this.m.hashCode() ^ (iHashCode * 1000003);
    }

    public final java.lang.String toString() {
        defpackage.xyn xynVar = this.m;
        defpackage.xyn xynVar2 = this.l;
        defpackage.xyn xynVar3 = this.c;
        defpackage.xyn xynVar4 = this.k;
        defpackage.yhx yhxVar = this.j;
        defpackage.ygw ygwVar = this.i;
        defpackage.xyn xynVar5 = this.h;
        defpackage.xyn xynVar6 = this.g;
        defpackage.xyn xynVar7 = this.a;
        defpackage.yzd yzdVar = this.f;
        return "ConnectivityLogEvent{carEventType=" + java.lang.String.valueOf(this.e) + ", domainIdType=" + java.lang.String.valueOf(yzdVar) + ", lifetimeId=" + java.lang.String.valueOf(xynVar7) + ", sessionId=" + java.lang.String.valueOf(xynVar6) + ", gearheadInfo=" + java.lang.String.valueOf(xynVar5) + ", domainLifetimeIds=" + java.lang.String.valueOf(ygwVar) + ", testCodes=" + java.lang.String.valueOf(yhxVar) + ", connectionEventType=" + this.b + ", timeSinceSessionStartMillis=" + java.lang.String.valueOf(xynVar4) + ", timeSinceBootMillis=" + java.lang.String.valueOf(xynVar3) + ", eventIndex=" + this.d + ", eventDetail=" + java.lang.String.valueOf(xynVar2) + ", connectionStatus=" + java.lang.String.valueOf(xynVar) + "}";
    }

    public rrj() {
        throw null;
    }
}
