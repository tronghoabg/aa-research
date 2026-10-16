package com.waze.main_screen.c;

import com.waze.sdk.bd;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.b.bl;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ai implements t {

    /* renamed from: a, reason: collision with root package name */
    private final a f26096a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.main_screen.b.a.d f26097b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.main_screen.ae.a.a f26098c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.main_screen.j.a.g f26099d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.main_screen.c.f.h f26100e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.nav_connect.b.g f26101f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.main_screen.c.e.h f26102g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.o.d.b.a.b f26103h;

    /* renamed from: i, reason: collision with root package name */
    private final bd f26104i;

    /* renamed from: j, reason: collision with root package name */
    private final kotlinx.coroutines.af f26105j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.nav_connect.b.d f26106k;

    /* renamed from: l, reason: collision with root package name */
    private final ch f26107l;
    private final ch m;
    private final ch n;
    private final ch o;
    private final ch p;
    private final bq q;
    private final j r;

    public ai(a aVar, com.waze.main_screen.b.a.d dVar, com.waze.main_screen.ae.a.a aVar2, com.waze.main_screen.j.a.g gVar, com.waze.main_screen.c.f.h hVar, com.waze.nav_connect.b.g gVar2, com.waze.nav_connect.b.b bVar, com.waze.main_screen.c.e.h hVar2, com.waze.o.d.b.a.b bVar2, bd bdVar) {
        h.g.b.x.f(aVar, "config");
        h.g.b.x.f(dVar, "audioSdkButtonStateHolderFactory");
        h.g.b.x.f(aVar2, "transportSdkButtonStateHolderFactory");
        h.g.b.x.f(gVar, "googleAssistantButtonStateHolderFactory");
        h.g.b.x.f(hVar, "soundButtonStateHolderFactory");
        h.g.b.x.f(gVar2, "navConnectButtonStateHolderFactory");
        h.g.b.x.f(bVar, "navConnectButtonFteTooltipStateHolderFactory");
        h.g.b.x.f(hVar2, "shareDriveButtonStateHolderFactory");
        h.g.b.x.f(bVar2, "companinioButtonStateHolderFactory");
        h.g.b.x.f(bdVar, "sdkManager");
        this.f26096a = aVar;
        this.f26097b = dVar;
        this.f26098c = aVar2;
        this.f26099d = gVar;
        this.f26100e = hVar;
        this.f26101f = gVar2;
        this.f26102g = hVar2;
        this.f26103h = bVar2;
        this.f26104i = bdVar;
        kotlinx.coroutines.af afVarP = com.waze.ui.a.l.p(this, "ButtonPackStateHolder");
        this.f26105j = afVarP;
        this.f26106k = bVar.a();
        al alVar = new al((kotlinx.coroutines.b.k[]) h.a.i.ao(h.a.i.i(dVar.a(), aVar2.b(), gVar.b(), hVar.c(), gVar2.b(), hVar2.c())).toArray(new kotlinx.coroutines.b.k[0]), new v(this, null));
        int i2 = bz.f51630a;
        ch chVarV = kotlinx.coroutines.b.ai.V(alVar, afVarP, by.c(), new u(null));
        this.f26107l = chVarV;
        ch chVarV2 = kotlinx.coroutines.b.ai.V(new ab(chVarV, this), afVarP, by.b(), h.a.i.h());
        this.m = chVarV2;
        ch chVarV3 = kotlinx.coroutines.b.ai.V(new ae(chVarV2, this), afVarP, by.b(), h.a.i.h());
        this.n = chVarV3;
        this.o = kotlinx.coroutines.b.ai.V(l(chVarV3), afVarP, by.b(), null);
        this.p = kotlinx.coroutines.b.ai.V(l(chVarV2), afVarP, by.b(), null);
        this.q = bl.b(kotlinx.coroutines.b.ai.R(kotlinx.coroutines.b.ai.y(new ah(chVarV)), new y(null)), afVarP, by.b(), 0);
        this.r = aVar.c();
    }

    public static final /* synthetic */ List k(ai aiVar, u uVar) {
        List listB = h.a.i.b();
        com.waze.main_screen.c.e.i iVarB = uVar.b();
        if (iVarB != null) {
            listB.add(new o(iVarB));
        }
        com.waze.nav_connect.b.j jVarE = uVar.e();
        if (jVarE != null) {
            listB.add(new n(jVarE));
        }
        com.waze.main_screen.ae.a.d dVarD = uVar.d();
        if (dVarD != null) {
            listB.add(new q(dVarD));
        }
        if (uVar.g() != null) {
            listB.add(new m(uVar.g()));
        } else if (uVar.c() != null) {
            listB.add(new k(uVar.c()));
        }
        com.waze.main_screen.b.a.f fVarA = uVar.a();
        if (fVarA != null) {
            listB.add(new l(fVarA));
        }
        com.waze.main_screen.c.f.i iVarF = uVar.f();
        if (iVarF != null) {
            listB.add(new p(iVarF));
        }
        List listA = h.a.i.a(listB);
        if (listA.size() <= aiVar.f26096a.a()) {
            return listA;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            com.waze.location.q qVar = (com.waze.location.q) obj;
            if (!(qVar instanceof k) && !(qVar instanceof m)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final kotlinx.coroutines.b.k l(ch chVar) {
        bn bnVar = this.f26104i.f35311b;
        h.g.b.x.e(bnVar, "getTooltipFlow(...)");
        return kotlinx.coroutines.b.ai.r(bnVar, this.f26106k.a(), chVar, new x(this, null));
    }

    @Override // com.waze.main_screen.c.t
    public final a a() {
        return this.f26096a;
    }

    @Override // com.waze.main_screen.c.t
    public final j b() {
        return this.r;
    }

    @Override // com.waze.main_screen.c.t
    public final bq c() {
        return this.q;
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        u uVar = (u) this.f26107l.d();
        com.waze.main_screen.b.a.f fVarA = uVar.a();
        if (fVarA != null) {
            fVarA.close();
        }
        com.waze.main_screen.ae.a.d dVarD = uVar.d();
        if (dVarD != null) {
            dVarD.close();
        }
        uVar.c();
        com.waze.main_screen.c.f.i iVarF = uVar.f();
        if (iVarF != null) {
            iVarF.close();
        }
        com.waze.nav_connect.b.j jVarE = uVar.e();
        if (jVarE != null) {
            jVarE.close();
        }
        com.waze.main_screen.c.e.i iVarB = uVar.b();
        if (iVarB != null) {
            iVarB.close();
        }
        uVar.g();
        this.f26106k.close();
        kotlinx.coroutines.aj.h(this.f26105j, null);
    }

    @Override // com.waze.main_screen.c.t
    public final ch d() {
        return this.m;
    }

    @Override // com.waze.main_screen.c.t
    public final ch e() {
        return this.n;
    }

    @Override // com.waze.main_screen.c.t
    public final ch f() {
        return this.p;
    }

    @Override // com.waze.main_screen.c.t
    public final ch g() {
        return this.o;
    }
}
