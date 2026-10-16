package com.waze.network.e;

import com.waze.network.b.bl;
import com.waze.network.f.af;
import com.waze.network.f.ag;
import h.g.b.x;
import kotlinx.coroutines.aj;
import okhttp3.ac;
import okhttp3.ak;
import okhttp3.al;
import okhttp3.aq;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class m implements ac {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32257a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f32258b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f32259c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f32260d;

    public m(com.waze.aq.o oVar, com.waze.shared_infra.i.e eVar, b bVar, int i2) {
        this.f32258b = i2;
        x.f(oVar, "integrityApiManager");
        x.f(eVar, "logger");
        x.f(bVar, "config");
        this.f32260d = oVar;
        this.f32257a = eVar;
        this.f32259c = bVar;
    }

    public static final /* synthetic */ ag a(m mVar) {
        return (ag) mVar.f32259c;
    }

    public static final /* synthetic */ b e(m mVar) {
        return (b) mVar.f32259c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.waze.network.b.bl, java.lang.Object] */
    private final Object g(okhttp3.internal.d.g gVar, af afVar) {
        aq aqVarG = gVar.g(this.f32260d.c(gVar.f(), afVar));
        x.f(aqVarG, "<this>");
        String strP = aq.p(aqVarG, "X-Waze-Error-Code");
        if (strP == null || Integer.parseInt(strP) != 501) {
            return aqVarG;
        }
        aj.t(h.c.k.f48060a, new l(this, afVar, null));
        aqVarG.close();
        return e.b.c.a(new n());
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.waze.network.b.bl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20, types: [com.waze.network.b.bl, java.lang.Object] */
    @Override // okhttp3.ac
    public final aq c(okhttp3.internal.d.g gVar) {
        com.waze.sharedui.f.c cVarE;
        Object objA;
        Object objA2;
        Object objA3;
        if (this.f32258b != 0) {
            x.f(gVar, "chain");
            al alVarF = gVar.f();
            if (((com.waze.aq.l) alVarF.a(com.waze.aq.l.class)) != null) {
                this.f32257a.e("Integrity token required for request: " + alVarF.g() + " ");
                alVarF = (al) aj.t(h.c.k.f48060a, new c(this, alVarF, null));
            }
            return gVar.g(alVarF);
        }
        x.f(gVar, "chain");
        com.waze.network.g.a aVar = (com.waze.network.g.a) gVar.f().a(com.waze.network.g.a.class);
        if (aVar == null || (cVarE = aVar.e()) == null) {
            cVarE = com.waze.sharedui.f.c.f38889c;
        }
        int iOrdinal = cVarE.ordinal();
        if (iOrdinal == 0) {
            try {
                m mVar = this;
                objA = (af) aj.t(h.c.k.f48060a, new k(this, null, 0));
            } catch (Throwable th) {
                objA = e.b.c.a(th);
            }
            Throwable thC = h.m.c(objA);
            if (thC == null) {
                af afVar = (af) objA;
                this.f32257a.a("got a session token: token=" + afVar.c() + ", userId=" + afVar.d());
                objA2 = g(gVar, afVar);
            } else {
                this.f32257a.g("failed to get token: ".concat(String.valueOf(thC.getMessage())));
                objA2 = e.b.c.a(new n());
            }
            e.b.c.b(objA2);
            return (aq) objA2;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return gVar.g(this.f32260d.b(gVar.f()));
            }
            throw new h.i();
        }
        af afVar2 = (af) ((ag) this.f32259c).d().d();
        if (afVar2 != null) {
            objA3 = g(gVar, afVar2);
        } else {
            int iE = h.a.i.e(gVar.f().g().l());
            Object objA4 = this.f32260d.a(iE > 0 ? new ak(gVar.f()).j(gVar.f().g().m().e(iE).n().g()).k() : gVar.f());
            Throwable thC2 = h.m.c(objA4);
            if (thC2 == null) {
                aq aqVarG = gVar.g((al) objA4);
                x.f(aqVarG, "<this>");
                String strP = aq.p(aqVarG, "X-Waze-Error-Code");
                objA3 = aqVarG;
                if (strP != null) {
                    objA3 = aqVarG;
                    if (Integer.parseInt(strP) == 511) {
                        objA3 = e.b.c.a(new a());
                    }
                }
            } else {
                this.f32257a.g("failed to offline authenticate request: ".concat(String.valueOf(thC2.getMessage())));
                objA3 = e.b.c.a(new n());
            }
        }
        e.b.c.b(objA3);
        return (aq) objA3;
    }

    public m(ag agVar, bl blVar, com.waze.shared_infra.i.e eVar, int i2) {
        this.f32258b = i2;
        x.f(agVar, "sessionTokenRepository");
        x.f(blVar, "authenticator");
        x.f(eVar, "logger");
        this.f32259c = agVar;
        this.f32260d = blVar;
        this.f32257a = eVar;
    }
}
