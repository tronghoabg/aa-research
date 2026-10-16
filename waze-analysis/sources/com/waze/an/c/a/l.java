package com.waze.an.c.a;

import com.waze.an.a.u;
import com.waze.an.c.ab;
import com.waze.an.c.ac;
import com.waze.an.c.ad;
import com.waze.an.c.ae;
import com.waze.an.c.af;
import com.waze.an.c.y;
import com.waze.an.c.z;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class l implements af {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.an.a.l f14701a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.af f14702b;

    /* renamed from: c, reason: collision with root package name */
    private final u f14703c;

    /* renamed from: d, reason: collision with root package name */
    private final ae f14704d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f14705e;

    /* renamed from: f, reason: collision with root package name */
    private ac f14706f;

    /* renamed from: g, reason: collision with root package name */
    private final ch f14707g;

    public l(com.waze.an.a.l lVar) {
        x.f(lVar, "descriptor");
        this.f14701a = lVar;
        u uVarM = lVar.m();
        Objects.toString(uVarM);
        kotlinx.coroutines.af afVarP = com.waze.ui.a.l.p(this, "NotificationInsight-".concat(String.valueOf(uVarM)));
        this.f14702b = afVarP;
        this.f14703c = lVar.m();
        lVar.j();
        this.f14704d = ae.f14750b;
        this.f14705e = lVar.m().b() == com.waze.an.a.ae.f14553i;
        this.f14706f = k(null, (com.waze.an.a.k) lVar.b().d());
        kotlinx.coroutines.b.k kVarK = ai.K(new k(lVar.b(), this, 0), new h(this, (h.c.e) null, 0));
        int i2 = bz.f51630a;
        this.f14707g = ai.V(kVarK, afVarP, by.c(), this.f14706f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ac k(ac acVar, com.waze.an.a.k kVar) {
        ab abVarA;
        ac acVar2;
        z zVar;
        z zVarA;
        ArrayList arrayListE;
        ad adVar;
        Integer numB = kVar.b();
        String strD = kVar.d();
        String strC = kVar.c();
        com.waze.an.a.l lVar = this.f14701a;
        com.waze.an.a.ae aeVarB = lVar.m().b();
        com.waze.an.a.ae aeVar = com.waze.an.a.ae.f14549e;
        if (lVar.m().b() == aeVar) {
            zVarA = null;
        } else {
            if (acVar != null) {
                abVarA = acVar.a();
                acVar2 = acVar;
            } else {
                abVarA = null;
                acVar2 = null;
            }
            if (abVarA != null) {
                zVarA = acVar2.a();
            } else {
                com.waze.an.a.j jVarA = kVar.a();
                if (jVarA != null) {
                    c cVar = new c(lVar, 6, (float[]) null);
                    int i2 = h.o.e.f48279a;
                    zVar = new z(cVar, new ad(h.o.e.c(), jVarA.a(), jVarA.b()));
                } else {
                    zVar = null;
                }
                zVarA = zVar;
            }
        }
        if (acVar == null || (arrayListE = acVar.e()) == null) {
            List<com.waze.an.a.i> listE = kVar.e();
            ArrayList arrayList = new ArrayList(h.a.i.q(listE, 10));
            for (com.waze.an.a.i iVar : listE) {
                String strH = iVar.h();
                com.waze.an.a.c cVarD = iVar.d();
                h.g.a.a aVarI = iVar.i();
                com.waze.design_components.b.d dVarB = iVar.b();
                com.waze.an.a.j jVarF = iVar.f();
                if (jVarF != null) {
                    int i3 = h.o.e.f48279a;
                    adVar = new ad(h.o.e.c(), jVarF.a(), jVarF.b());
                } else {
                    adVar = null;
                }
                arrayList.add(new y(strH, cVarD, aVarI, adVar, dVarB));
            }
            arrayListE = arrayList;
        }
        return new ac(numB, strD, strC, zVarA, arrayListE, aeVarB != aeVar, new c((Object) lVar, 4, (int[]) null), new c(lVar, 5, (boolean[]) null));
    }

    @Override // com.waze.an.c.af
    public final ae a() {
        return this.f14704d;
    }

    @Override // com.waze.an.c.af
    public final ch b() {
        return this.f14707g;
    }

    @Override // com.waze.an.c.af
    public final com.waze.an.e.g c(com.waze.an.e.a aVar) {
        x.f(aVar, "<this>");
        return new com.waze.an.e.e(this.f14703c.c(), this.f14701a.m().b());
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    @Override // com.waze.an.c.k
    public final void e() {
        this.f14701a.k();
    }

    @Override // com.waze.an.c.k
    public final void g() {
        this.f14701a.l();
    }

    @Override // com.waze.an.c.k
    public final /* synthetic */ com.waze.location.q h() {
        return this.f14703c;
    }

    public final boolean j() {
        return this.f14705e;
    }
}
