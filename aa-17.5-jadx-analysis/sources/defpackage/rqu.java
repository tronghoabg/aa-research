package defpackage;

import java.util.Collection;

/* loaded from: classes.dex */
public final class rqu extends rqx {
    private ygr A;
    private final xxh B;
    private final xxh C;
    private yfl D;
    private yfq E;
    private xxh F;
    public yxc a;
    public yxy b;
    public xxh c;
    public yfq d;
    public yyv e;
    public xxh f;
    public ygp g;
    public ygr h;
    public xxh i;
    public xxh j;
    public xxh k;
    public xxh l;
    public xxh m;
    public xxh n;
    public int o;
    private final xxh p;
    private final xxh q;
    private ygp r;
    private ygr s;
    private xxh t;
    private final xxh u;
    private final xxh v;
    private final xxh w;
    private xxh x;
    private xxh y;
    private xxh z;

    public rqu() {
        xvy xvyVar = xvy.a;
        this.p = xvyVar;
        this.c = xvyVar;
        this.q = xvyVar;
        this.f = xvyVar;
        this.t = xvyVar;
        this.u = xvyVar;
        this.v = xvyVar;
        this.w = xvyVar;
        this.x = xvyVar;
        this.y = xvyVar;
        this.i = xvyVar;
        this.z = xvyVar;
        this.j = xvyVar;
        this.B = xvyVar;
        this.C = xvyVar;
        this.k = xvyVar;
        this.F = xvyVar;
        this.l = xvyVar;
        this.m = xvyVar;
        this.n = xvyVar;
    }

    @Override // defpackage.rqx
    protected final /* synthetic */ rqy a(rqy rqyVar) {
        rqv rqvVar = (rqv) rqyVar;
        super.a(rqvVar);
        int i = rqvVar.d;
        woy.aa(i != 1, "UNKNOWN_CONTEXT is not a valid context");
        yyv yyvVar = rqvVar.b;
        woy.aa(yyvVar != yyv.UNKNOWN_ACTION, "UNKNOWN_ACTION is not a valid action");
        yyv yyvVar2 = yyv.LOG_TESTCODES;
        woy.aa(yyvVar != yyvVar2 || i == 19, "Use LOG_TESTCODES action with context EXPERIMENT");
        woy.aa((yyvVar == yyvVar2 && rqvVar.a.isEmpty()) ? false : true, "No testcodes specified in LOG_TESTCODES event!");
        xxh xxhVar = rqvVar.c;
        woy.aa((xxhVar.f() && xxhVar.b() == yyw.ERROR_UNSPECIFIED) ? false : true, "ERROR_UNSPECIFIED is not a valid error");
        return rqvVar;
    }

    @Override // defpackage.rqx
    protected final /* synthetic */ rqy b() {
        yxy yxyVar;
        int i;
        yyv yyvVar;
        if (this.d == null) {
            int i2 = yfq.d;
            this.d = yls.a;
        }
        ygp ygpVar = this.r;
        if (ygpVar != null) {
            this.s = ygpVar.g();
        } else if (this.s == null) {
            this.s = yly.a;
        }
        ygp ygpVar2 = this.g;
        if (ygpVar2 != null) {
            this.h = ygpVar2.g();
        } else if (this.h == null) {
            this.h = yly.a;
        }
        if (this.A == null) {
            this.A = yly.a;
        }
        yfl yflVar = this.D;
        if (yflVar != null) {
            this.E = yflVar.g();
        } else if (this.E == null) {
            int i3 = yfq.d;
            this.E = yls.a;
        }
        yxc yxcVar = this.a;
        if (yxcVar != null && (yxyVar = this.b) != null && (i = this.o) != 0 && (yyvVar = this.e) != null) {
            return new rqv(yxcVar, yxyVar, this.p, this.c, this.q, this.d, this.s, i, yyvVar, this.f, this.t, this.h, this.u, this.v, this.w, this.x, this.y, this.i, this.z, this.A, this.j, this.B, this.C, this.k, this.E, this.F, this.l, this.m, this.n);
        }
        StringBuilder sb = new StringBuilder();
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
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.rqx
    protected final ygp c() {
        if (this.r == null) {
            if (this.s == null) {
                this.r = new ygp();
            } else {
                ygp ygpVar = new ygp();
                this.r = ygpVar;
                ygpVar.k(this.s);
                this.s = null;
            }
        }
        return this.r;
    }

    public final void d(yyy yyyVar) {
        if (this.D == null) {
            if (this.E == null) {
                int i = yfq.d;
                this.D = new yfl(4);
            } else {
                int i2 = yfq.d;
                yfl yflVar = new yfl(4);
                this.D = yflVar;
                yflVar.k(this.E);
                this.E = null;
            }
        }
        this.D.i(yyyVar);
    }

    public final void e(String str) {
        this.x = xxh.h(str);
    }

    public final void f(yxq yxqVar) {
        this.z = xxh.h(yxqVar);
    }

    public final void g(String str) {
        this.F = xxh.h(str);
    }

    public final void h(long j) {
        this.t = new xxm(Long.valueOf(j));
    }

    public final void i(yyw yywVar) {
        this.y = new xxm(yywVar);
    }

    public final void j(acai... acaiVarArr) {
        if (this.r != null) {
            throw new IllegalStateException("Cannot set testCodes after calling testCodesBuilder()");
        }
        this.s = ygr.o(acaiVarArr);
    }

    public final /* bridge */ /* synthetic */ void k(Collection collection) {
        if (this.r != null) {
            throw new IllegalStateException("Cannot set testCodes after calling testCodesBuilder()");
        }
        this.s = ygr.n(collection);
    }
}
