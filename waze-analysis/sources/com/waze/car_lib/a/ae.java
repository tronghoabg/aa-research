package com.waze.car_lib.a;

import com.waze.modules.navigation.at;
import com.waze.navigate.db;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    private final db f18820a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ads.a.a f18821b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.ads.d.i f18822c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.ads.d.b f18823d;

    /* renamed from: e, reason: collision with root package name */
    private final af f18824e;

    /* renamed from: f, reason: collision with root package name */
    private e f18825f;

    /* renamed from: g, reason: collision with root package name */
    private final bn f18826g;

    /* renamed from: h, reason: collision with root package name */
    private final ch f18827h;

    public ae(db dbVar, com.waze.ads.a.a aVar, com.waze.ads.d.i iVar, com.waze.ads.d.b bVar, af afVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(dbVar, "navigationController");
        h.g.b.x.f(aVar, "adRepository");
        h.g.b.x.f(iVar, "statsSender");
        h.g.b.x.f(bVar, "adTracking");
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(eVar, "logger");
        this.f18820a = dbVar;
        this.f18821b = aVar;
        this.f18822c = iVar;
        this.f18823d = bVar;
        this.f18824e = afVar;
        bn bnVarB = ck.b(new ab());
        this.f18826g = bnVarB;
        kotlinx.coroutines.b.k kVarR = ai.r(bnVarB, dbVar.d(), dbVar.e(), new ad(this, null));
        int i2 = bz.f51630a;
        this.f18827h = ai.V(kVarR, afVar, by.a(5000L, 2), aa.f18807a);
    }

    private final void q(String str) {
        aj.z(this.f18824e, null, null, new ac(this, str, (h.c.e) null, 1), 3);
    }

    public final ch g() {
        return this.f18827h;
    }

    public final void h() {
        aj.h(this.f18824e, null);
    }

    public final void i() {
        com.waze.ads.a.f fVarA = ((ab) this.f18826g.d()).a();
        if (fVarA != null) {
            this.f18822c.a(fVarA, com.waze.ads.d.c.f14001d);
        }
        e eVar = this.f18825f;
        if (eVar == null) {
            h.g.b.x.j("controller");
            eVar = null;
        }
        eVar.H(j.f18837a);
    }

    public final void j() {
        bn bnVar = this.f18826g;
        com.waze.ads.a.f fVarA = ((ab) bnVar.d()).a();
        if (fVarA == null) {
            return;
        }
        this.f18822c.a(fVarA, com.waze.ads.d.c.f13999b);
        String strM = fVarA.m();
        if (strM != null) {
            q(strM);
        }
        com.waze.av.d.k kVarB = ((ab) bnVar.d()).b();
        com.waze.av.b.m mVarE = kVarB != null ? com.waze.ad.c.b.e(kVarB) : a.a.F(fVarA);
        e eVar = this.f18825f;
        if (eVar == null) {
            h.g.b.x.j("controller");
            eVar = null;
        }
        eVar.b(mVarE, at.f30322b);
    }

    public final void k() {
        com.waze.ads.a.f fVarA = ((ab) this.f18826g.d()).a();
        if (fVarA != null) {
            this.f18822c.c(fVarA, com.waze.ads.d.d.f14008e);
        }
    }

    public final void l() {
        com.waze.ads.a.f fVarA = ((ab) this.f18826g.d()).a();
        if (fVarA != null) {
            this.f18822c.c(fVarA, com.waze.ads.d.d.f14007d);
        }
        e eVar = this.f18825f;
        if (eVar == null) {
            h.g.b.x.j("controller");
            eVar = null;
        }
        eVar.a();
    }

    public final void m() {
        bn bnVar = this.f18826g;
        com.waze.ads.a.f fVarA = ((ab) bnVar.d()).a();
        if (fVarA == null) {
            return;
        }
        String strM = fVarA.m();
        if (strM != null) {
            q(strM);
        }
        this.f18822c.a(fVarA, com.waze.ads.d.c.f14002e);
        com.waze.av.d.k kVarB = ((ab) bnVar.d()).b();
        com.waze.av.b.m mVarE = kVarB != null ? com.waze.ad.c.b.e(kVarB) : a.a.F(fVarA);
        e eVar = this.f18825f;
        if (eVar == null) {
            h.g.b.x.j("controller");
            eVar = null;
        }
        eVar.b(mVarE, at.f30321a);
    }

    public final void n() {
        e eVar = this.f18825f;
        if (eVar == null) {
            h.g.b.x.j("controller");
            eVar = null;
        }
        eVar.H(h.f18835a);
    }

    public final void o(e eVar) {
        h.g.b.x.f(eVar, "controller");
        this.f18825f = eVar;
    }

    public final void p(String str) {
        h.g.b.x.f(str, "adId");
        aj.z(this.f18824e, null, null, new ac(this, str, (h.c.e) null, 3, (byte[]) null), 3);
    }
}
