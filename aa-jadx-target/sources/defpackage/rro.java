package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rro extends defpackage.rrr {
    private defpackage.yhx A;
    private final defpackage.xyn B;
    private final defpackage.xyn C;
    private defpackage.ygr D;
    private defpackage.ygw E;
    private defpackage.xyn F;
    public defpackage.yyh a;
    public defpackage.yzd b;
    public defpackage.xyn c;
    public defpackage.ygw d;
    public defpackage.zaa e;
    public defpackage.xyn f;
    public defpackage.yhv g;
    public defpackage.yhx h;
    public defpackage.xyn i;
    public defpackage.xyn j;
    public defpackage.xyn k;
    public defpackage.xyn l;
    public defpackage.xyn m;
    public defpackage.xyn n;
    public int o;
    private final defpackage.xyn p;
    private final defpackage.xyn q;
    private defpackage.yhv r;
    private defpackage.yhx s;
    private defpackage.xyn t;
    private final defpackage.xyn u;
    private final defpackage.xyn v;
    private final defpackage.xyn w;
    private defpackage.xyn x;
    private defpackage.xyn y;
    private defpackage.xyn z;

    public rro() {
        defpackage.xxe xxeVar = defpackage.xxe.a;
        this.p = xxeVar;
        this.c = xxeVar;
        this.q = xxeVar;
        this.f = xxeVar;
        this.t = xxeVar;
        this.u = xxeVar;
        this.v = xxeVar;
        this.w = xxeVar;
        this.x = xxeVar;
        this.y = xxeVar;
        this.i = xxeVar;
        this.z = xxeVar;
        this.j = xxeVar;
        this.B = xxeVar;
        this.C = xxeVar;
        this.k = xxeVar;
        this.F = xxeVar;
        this.l = xxeVar;
        this.m = xxeVar;
        this.n = xxeVar;
    }

    @Override // defpackage.rrr
    protected final /* synthetic */ defpackage.rrs a(defpackage.rrs rrsVar) {
        defpackage.rrp rrpVar = (defpackage.rrp) rrsVar;
        super.a(rrpVar);
        int i = rrpVar.d;
        defpackage.ysr.bk(i != 1, "UNKNOWN_CONTEXT is not a valid context");
        defpackage.zaa zaaVar = rrpVar.b;
        defpackage.ysr.bk(zaaVar != defpackage.zaa.UNKNOWN_ACTION, "UNKNOWN_ACTION is not a valid action");
        defpackage.zaa zaaVar2 = defpackage.zaa.LOG_TESTCODES;
        defpackage.ysr.bk(zaaVar != zaaVar2 || i == 19, "Use LOG_TESTCODES action with context EXPERIMENT");
        defpackage.ysr.bk((zaaVar == zaaVar2 && rrpVar.a.isEmpty()) ? false : true, "No testcodes specified in LOG_TESTCODES event!");
        defpackage.xyn xynVar = rrpVar.c;
        defpackage.ysr.bk((xynVar.f() && xynVar.b() == defpackage.zab.ERROR_UNSPECIFIED) ? false : true, "ERROR_UNSPECIFIED is not a valid error");
        return rrpVar;
    }

    @Override // defpackage.rrr
    protected final /* synthetic */ defpackage.rrs b() {
        defpackage.yzd yzdVar;
        int i;
        defpackage.zaa zaaVar;
        if (this.d == null) {
            int i2 = defpackage.ygw.d;
            this.d = defpackage.ymx.a;
        }
        defpackage.yhv yhvVar = this.r;
        if (yhvVar != null) {
            this.s = yhvVar.g();
        } else if (this.s == null) {
            this.s = defpackage.ynd.a;
        }
        defpackage.yhv yhvVar2 = this.g;
        if (yhvVar2 != null) {
            this.h = yhvVar2.g();
        } else if (this.h == null) {
            this.h = defpackage.ynd.a;
        }
        if (this.A == null) {
            this.A = defpackage.ynd.a;
        }
        defpackage.ygr ygrVar = this.D;
        if (ygrVar != null) {
            this.E = ygrVar.g();
        } else if (this.E == null) {
            int i3 = defpackage.ygw.d;
            this.E = defpackage.ymx.a;
        }
        defpackage.yyh yyhVar = this.a;
        if (yyhVar != null && (yzdVar = this.b) != null && (i = this.o) != 0 && (zaaVar = this.e) != null) {
            return new defpackage.rrp(yyhVar, yzdVar, this.p, this.c, this.q, this.d, this.s, i, zaaVar, this.f, this.t, this.h, this.u, this.v, this.w, this.x, this.y, this.i, this.z, this.A, this.j, this.B, this.C, this.k, this.E, this.F, this.l, this.m, this.n);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == null) {
            sb.append(" carEventType");
        }
        if (this.b == null) {
            sb.append(" domainIdType");
        }
        if (this.o == 0) {
            sb.append(" context");
        }
        if (this.e == null) {
            sb.append(" action");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.rrr
    protected final defpackage.yhv c() {
        if (this.r == null) {
            if (this.s == null) {
                this.r = new defpackage.yhv();
            } else {
                defpackage.yhv yhvVar = new defpackage.yhv();
                this.r = yhvVar;
                yhvVar.k(this.s);
                this.s = null;
            }
        }
        return this.r;
    }

    public final void d(defpackage.zad zadVar) {
        if (this.D == null) {
            if (this.E == null) {
                int i = defpackage.ygw.d;
                this.D = new defpackage.ygr(4);
            } else {
                int i2 = defpackage.ygw.d;
                defpackage.ygr ygrVar = new defpackage.ygr(4);
                this.D = ygrVar;
                ygrVar.k(this.E);
                this.E = null;
            }
        }
        this.D.i(zadVar);
    }

    public final void e(java.lang.String str) {
        this.x = defpackage.xyn.h(str);
    }

    public final void f(defpackage.yyv yyvVar) {
        this.z = defpackage.xyn.h(yyvVar);
    }

    public final void g(java.lang.String str) {
        this.F = defpackage.xyn.h(str);
    }

    public final void h(long j) {
        this.t = new defpackage.xys(java.lang.Long.valueOf(j));
    }

    public final void i(defpackage.zab zabVar) {
        this.y = new defpackage.xys(zabVar);
    }

    public final void j(defpackage.acbk... acbkVarArr) {
        if (this.r != null) {
            throw new java.lang.IllegalStateException("Cannot set testCodes after calling testCodesBuilder()");
        }
        this.s = defpackage.yhx.o(acbkVarArr);
    }

    public final /* bridge */ /* synthetic */ void k(java.util.Collection collection) {
        if (this.r != null) {
            throw new java.lang.IllegalStateException("Cannot set testCodes after calling testCodesBuilder()");
        }
        this.s = defpackage.yhx.n(collection);
    }
}
