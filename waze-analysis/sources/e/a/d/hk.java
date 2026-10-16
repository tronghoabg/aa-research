package e.a.d;

import java.util.List;
import java.util.Random;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class hk extends e.a.bt {

    /* renamed from: f, reason: collision with root package name */
    private final e.a.bl f47094f;

    /* renamed from: g, reason: collision with root package name */
    private e.a.bq f47095g;

    /* renamed from: h, reason: collision with root package name */
    private e.a.w f47096h = e.a.w.f47854d;

    hk(e.a.bl blVar) {
        this.f47094f = blVar;
    }

    static /* bridge */ /* synthetic */ void f(hk hkVar, e.a.bq bqVar, e.a.x xVar) {
        e.a.br bkVar;
        e.a.w wVarA = xVar.a();
        if (wVarA == e.a.w.f47855e) {
            return;
        }
        e.a.w wVar = e.a.w.f47853c;
        if (wVarA == wVar || wVarA == e.a.w.f47854d) {
            hkVar.f47094f.e();
        }
        if (hkVar.f47096h == wVar) {
            if (wVarA == e.a.w.f47851a) {
                return;
            }
            if (wVarA == e.a.w.f47854d) {
                hkVar.c();
                return;
            }
        }
        int iOrdinal = wVarA.ordinal();
        if (iOrdinal == 0) {
            bkVar = new e.a.bk(e.a.bn.c());
        } else if (iOrdinal == 1) {
            bkVar = new e.a.bk(e.a.bn.d(bqVar));
        } else if (iOrdinal == 2) {
            bkVar = new e.a.bk(e.a.bn.b(xVar.d()));
        } else {
            if (iOrdinal != 3) {
                throw new IllegalArgumentException("Unsupported state:".concat(wVarA.toString()));
            }
            bkVar = new hj(hkVar);
        }
        hkVar.g(wVarA, bkVar);
    }

    private final void g(e.a.w wVar, e.a.br brVar) {
        this.f47096h = wVar;
        this.f47094f.f(wVar, brVar);
    }

    @Override // e.a.bt
    public final e.a.ee a(e.a.bp bpVar) {
        hh hhVar;
        Boolean bool;
        List listC = bpVar.c();
        if (listC.isEmpty()) {
            e.a.ee eeVarG = e.a.ee.f47411k.g("NameResolver returned no usable address. addrs=" + String.valueOf(bpVar.c()) + ", attrs=" + bpVar.a().toString());
            b(eeVarG);
            return eeVarG;
        }
        if ((bpVar.b() instanceof hh) && (bool = (hhVar = (hh) bpVar.b()).f47089a) != null && bool.booleanValue()) {
            Long l2 = hhVar.f47090b;
            listC = hf.g(listC, new Random());
        }
        e.a.bq bqVar = this.f47095g;
        if (bqVar == null) {
            e.a.bl blVar = this.f47094f;
            e.a.bg bgVarB = e.a.bi.b();
            bgVarB.c(listC);
            e.a.bq bqVarB = blVar.b(bgVarB.a());
            bqVarB.d(new hg(this, bqVarB));
            this.f47095g = bqVarB;
            g(e.a.w.f47851a, new e.a.bk(e.a.bn.c()));
            bqVarB.b();
        } else {
            bqVar.e(listC);
        }
        return e.a.ee.f47401a;
    }

    @Override // e.a.bt
    public final void b(e.a.ee eeVar) {
        e.a.bq bqVar = this.f47095g;
        if (bqVar != null) {
            bqVar.c();
            this.f47095g = null;
        }
        g(e.a.w.f47853c, new e.a.bk(e.a.bn.b(eeVar)));
    }

    @Override // e.a.bt
    public final void c() {
        e.a.bq bqVar = this.f47095g;
        if (bqVar != null) {
            bqVar.b();
        }
    }

    @Override // e.a.bt
    public final void d() {
        e.a.bq bqVar = this.f47095g;
        if (bqVar != null) {
            bqVar.c();
        }
    }
}
