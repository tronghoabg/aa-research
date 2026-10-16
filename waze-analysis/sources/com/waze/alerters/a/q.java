package com.waze.alerters.a;

import com.waze.config.ConfigValues;
import com.waze.jni.protos.alerters.AlerterInfo;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class q implements c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.k f14182a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.an.a.x f14183b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f14184c;

    /* renamed from: d, reason: collision with root package name */
    private final l f14185d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14186e;

    /* renamed from: f, reason: collision with root package name */
    private final bn f14187f;

    /* renamed from: g, reason: collision with root package name */
    private p f14188g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.i f14189h;

    /* renamed from: i, reason: collision with root package name */
    private final ch f14190i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.asks.ab f14191j;

    static {
        AlerterInfo defaultInstance = AlerterInfo.getDefaultInstance();
        h.g.b.x.e(defaultInstance, "getDefaultInstance(...)");
        com.waze.y.b(defaultInstance);
    }

    public /* synthetic */ q(com.waze.k kVar, com.waze.an.a.x xVar, int i2, com.waze.shared_infra.i.e eVar, com.waze.j jVar, boolean z, l lVar, com.waze.asks.ab abVar) {
        this.f14182a = kVar;
        this.f14183b = xVar;
        this.f14184c = eVar;
        this.f14185d = lVar;
        this.f14191j = abVar;
        this.f14186e = z;
        this.f14188g = new p(jVar, o.f14174a, i2);
        h.o.c cVar = h.o.a.f48264a;
        Long lB = ConfigValues.CONFIG_VALUE_ALERTS_DEFAULT_ALERTER_TIMEOUT.b();
        h.g.b.x.e(lB, "getValue(...)");
        this.f14189h = new com.waze.i(h.o.c.j(lB.longValue(), h.o.d.f48273d), com.waze.h.f24304a);
        bn bnVarB = ck.b(p(this.f14188g, jVar));
        this.f14187f = bnVarB;
        this.f14190i = ai.U(bnVarB);
    }

    private final com.waze.j p(p pVar, com.waze.j jVar) {
        o oVarC = pVar.c();
        o oVar = o.f14174a;
        int iOrdinal = oVarC.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            com.waze.i iVarD = pVar.b().d();
            h.o.a aVarZ = iVarD != null ? h.o.a.z(iVarD.a()) : null;
            h.o.c cVar = h.o.a.f48264a;
            return (aVarZ != null && h.o.a.A(aVarZ.w(), 0L)) ? com.waze.j.z(pVar.b(), null, null, null, null, -16385) : pVar.b();
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return jVar;
            }
            throw new h.i();
        }
        com.waze.j jVarB = pVar.b();
        com.waze.i iVarD2 = pVar.b().d();
        if (iVarD2 == null) {
            iVarD2 = this.f14189h;
        }
        return com.waze.j.z(jVarB, null, null, iVarD2, null, -8404993);
    }

    private final void q(p pVar) {
        Object objD;
        if (this.f14188g.c() != pVar.c()) {
            com.waze.shared_infra.i.e eVar = this.f14184c;
            com.waze.k kVar = this.f14182a;
            eVar.a("updating alert mode alerterId=" + kVar + ", mode=" + pVar.c() + ", prevValidationResult=" + pVar.b().g() + ", triggerDistanceMeters=" + pVar.a());
            if (pVar.c() == o.f14176c) {
                this.f14185d.e(kVar);
            }
        }
        this.f14188g = pVar;
        bn bnVar = this.f14187f;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, p(this.f14188g, (com.waze.j) objD)));
    }

    private final boolean r() {
        if (this.f14188g.b().g().a() != null) {
            if (r0.intValue() - this.f14188g.a() <= this.f14191j.c()) {
                return true;
            }
        }
        return false;
    }

    private final boolean s() {
        com.waze.l lVarG = this.f14188g.b().g();
        return lVarG.a() != null && lVarG.a().intValue() <= this.f14188g.a();
    }

    @Override // com.waze.alerters.a.c
    public final com.waze.k a() {
        return this.f14182a;
    }

    @Override // com.waze.alerters.a.c
    public final b b() {
        boolean zR = this.f14188g.b().r();
        boolean z = false;
        if (r() && !s()) {
            z = true;
        }
        return new b(zR, z, this.f14188g.b().g().a());
    }

    @Override // com.waze.alerters.a.c
    public final com.waze.an.a.x c() {
        return this.f14183b;
    }

    @Override // com.waze.alerters.a.c
    public final ch d() {
        return this.f14190i;
    }

    @Override // com.waze.alerters.a.c
    public final void e(a aVar) {
        h.g.b.x.f(aVar, "action");
        this.f14185d.a(this.f14182a, aVar);
        f();
    }

    @Override // com.waze.alerters.a.c
    public final void f() {
        o oVarC = this.f14188g.c();
        o oVar = o.f14177d;
        if (oVarC != oVar) {
            q(p.e(this.f14188g, null, oVar, 0, 5));
            this.f14185d.b(this.f14182a);
        }
    }

    @Override // com.waze.alerters.a.c
    public final void g() {
    }

    @Override // com.waze.alerters.a.c
    public final void h(com.waze.f fVar) {
        h.g.b.x.f(fVar, "rejectedAlertReason");
        this.f14185d.c(this.f14182a, fVar);
    }

    @Override // com.waze.alerters.a.c
    public final void i() {
        this.f14185d.f(this.f14182a);
    }

    @Override // com.waze.alerters.a.c
    public final void j() {
        q(p.e(this.f14188g, null, o.f14177d, 0, 5));
        this.f14185d.d(this.f14182a);
    }

    @Override // com.waze.alerters.a.c
    public final void k() {
        com.waze.i iVarD = this.f14188g.b().d();
        q(p.e(this.f14188g, null, (iVarD == null || !h.o.a.E(iVarD.a())) ? o.f14175b : o.f14176c, 0, 5));
        this.f14185d.d(this.f14182a);
    }

    public final void l(z zVar) {
        p pVarE;
        o oVar;
        if (zVar != null) {
            this.f14186e = zVar.f();
        }
        p pVar = this.f14188g;
        if (zVar == null) {
            o oVarC = pVar.c();
            o oVar2 = o.f14174a;
            int iOrdinal = oVarC.ordinal();
            if (iOrdinal == 0) {
                oVar = o.f14177d;
                pVarE = p.e(pVar, null, oVar, 0, 5);
            } else if (iOrdinal == 1 || iOrdinal == 2) {
                oVar = o.f14176c;
                pVarE = p.e(pVar, null, oVar, 0, 5);
            } else {
                if (iOrdinal != 3) {
                    throw new h.i();
                }
                oVar = o.f14177d;
                pVarE = p.e(pVar, null, oVar, 0, 5);
            }
        } else {
            o oVarC2 = pVar.c();
            o oVar3 = o.f14176c;
            pVarE = (oVarC2 == oVar3 || this.f14188g.c() == o.f14177d) ? this.f14188g : (this.f14188g.c() != o.f14175b || zVar.b().g().b()) ? p.e(this.f14188g, zVar.b(), null, zVar.a(), 2) : p.d(com.waze.j.z(this.f14188g.b(), null, null, null, zVar.b().g(), Integer.MAX_VALUE), oVar3, zVar.a());
        }
        q(pVarE);
    }

    public final boolean m() {
        return this.f14186e;
    }

    public final boolean n() {
        return this.f14188g.c() == o.f14177d;
    }

    public final boolean o() {
        return (this.f14188g.b().g().b() && (r() || s())) || this.f14188g.c() == o.f14175b || this.f14188g.c() == o.f14176c;
    }
}
