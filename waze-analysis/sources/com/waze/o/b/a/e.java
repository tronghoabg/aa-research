package com.waze.o.b.a;

import com.waze.av.b.aa;
import com.waze.av.b.ah;
import com.waze.av.b.at;
import com.waze.car_lib.screens.bx;
import com.waze.modules.c.ct;
import com.waze.modules.c.j;
import com.waze.navigate.cj;
import com.waze.navigate.eo;
import com.waze.o.al;
import com.waze.o.av;
import com.waze.o.aw;
import com.waze.o.bj;
import com.waze.o.bk;
import com.waze.o.bl;
import com.waze.o.bv;
import com.waze.o.bw;
import com.waze.o.c.b.w;
import com.waze.o.t;
import com.waze.o.u;
import com.waze.o.v;
import com.waze.t.a.h;
import com.waze.t.a.k;
import com.waze.t.a.l;
import com.waze.t.a.m;
import com.waze.t.a.n;
import com.waze.t.a.o;
import com.waze.u.a.g;
import h.a.i;
import h.g.b.x;
import i.b.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e implements com.waze.o.c.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.o.c.a.b f32659a;

    /* renamed from: b, reason: collision with root package name */
    private final m f32660b;

    /* renamed from: c, reason: collision with root package name */
    private final o f32661c;

    /* renamed from: d, reason: collision with root package name */
    private final k f32662d;

    /* renamed from: e, reason: collision with root package name */
    private final n f32663e;

    /* renamed from: f, reason: collision with root package name */
    private final l f32664f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.aw.a f32665g;

    /* renamed from: h, reason: collision with root package name */
    private final ah f32666h;

    /* renamed from: i, reason: collision with root package name */
    private final eo f32667i;

    /* renamed from: j, reason: collision with root package name */
    private final cj f32668j;

    /* renamed from: k, reason: collision with root package name */
    private final ab f32669k;

    public e(com.waze.o.c.a.b bVar, m mVar, o oVar, k kVar, n nVar, l lVar, com.waze.aw.a aVar, ah ahVar, eo eoVar, cj cjVar, ab abVar) {
        x.f(bVar, "api");
        x.f(mVar, "streetNameProvider");
        x.f(oVar, "userLocationProvider");
        x.f(kVar, "audioLocaleProvider");
        x.f(nVar, "userFirstNameProvider");
        x.f(lVar, "measurementSystemProvider");
        x.f(aVar, "moodNameProvider");
        x.f(ahVar, "wazePlaceRepository");
        x.f(eoVar, "navigationInfoInterface");
        x.f(cjVar, "etaStateInterface");
        x.f(abVar, "ioDispatcher");
        this.f32659a = bVar;
        this.f32660b = mVar;
        this.f32661c = oVar;
        this.f32662d = kVar;
        this.f32663e = nVar;
        this.f32664f = lVar;
        this.f32665g = aVar;
        this.f32666h = ahVar;
        this.f32667i = eoVar;
        this.f32668j = cjVar;
        this.f32669k = abVar;
    }

    private final u d() {
        com.waze.ca.a aVar;
        t tVarNewBuilder = u.newBuilder();
        x.f(tVarNewBuilder, "builder");
        tVarNewBuilder.f();
        com.waze.u.a.c cVarNewBuilder = g.newBuilder();
        x.f(cVarNewBuilder, "builder");
        com.waze.u.a.d dVar = com.waze.u.a.d.OGG_OPUS;
        x.f(dVar, "value");
        cVarNewBuilder.a(dVar);
        com.waze.u.a.f fVar = com.waze.u.a.f.SAMPLE_RATE_16K;
        x.f(fVar, "value");
        cVarNewBuilder.b(fVar);
        g gVarBuild = cVarNewBuilder.build();
        x.e(gVarBuild, "build(...)");
        g gVar = gVarBuild;
        x.f(gVar, "value");
        tVarNewBuilder.d(gVar);
        String str = (String) this.f32662d.b();
        if (str != null) {
            x.f(str, "value");
            tVarNewBuilder.c(str);
        }
        com.waze.shared_infra.h.c cVar = (com.waze.shared_infra.h.c) this.f32661c.b();
        if (cVar != null) {
            if (true == cVar.g()) {
                cVar = null;
            }
            if (cVar != null) {
                s sVarE = com.waze.sharedui.e.e.e(cVar);
                x.f(sVarE, "value");
                tVarNewBuilder.i(sVarE);
            }
        }
        String str2 = (String) this.f32660b.b();
        if (str2 != null) {
            String str3 = true != h.n.o.G(str2) ? str2 : null;
            if (str3 != null) {
                x.f(str3, "value");
                tVarNewBuilder.e(str3);
            }
        }
        List listA = tVarNewBuilder.a();
        x.e(listA, "getFavoriteList(...)");
        com.google.v.b.a aVar2 = new com.google.v.b.a(listA);
        List listI = at.i(this.f32666h);
        ArrayList arrayList = new ArrayList();
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            i.aD(arrayList, bx.i((aa) it.next()));
        }
        ArrayList arrayList2 = arrayList;
        x.f(aVar2, "<this>");
        x.f(arrayList2, "values");
        tVarNewBuilder.b(arrayList2);
        al alVarF = bx.f(this.f32667i, this.f32668j);
        x.f(alVarF, "value");
        tVarNewBuilder.h(alVarF);
        com.waze.sharedui.utils.e eVar = (com.waze.sharedui.utils.e) this.f32664f.b();
        com.waze.o.c.b.l lVar = com.waze.o.c.b.l.f32804a;
        ct ctVar = ct.f30003a;
        j jVar = j.f30171a;
        int iOrdinal = eVar.ordinal();
        if (iOrdinal == 0) {
            aVar = com.waze.ca.a.METRIC;
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            aVar = com.waze.ca.a.IMPERIAL;
        }
        x.f(aVar, "value");
        tVarNewBuilder.g(aVar);
        u uVarBuild = tVarNewBuilder.build();
        x.e(uVarBuild, "build(...)");
        return uVarBuild;
    }

    @Override // com.waze.t.a.b
    public final kotlinx.coroutines.b.k b(String str, com.waze.t.a.e eVar) {
        x.f(str, "conversationId");
        x.f(eVar, "message");
        v vVarNewBuilder = com.waze.o.x.newBuilder();
        x.f(vVarNewBuilder, "builder");
        x.f(str, "value");
        vVarNewBuilder.c(str);
        u uVarD = d();
        x.f(uVarD, "value");
        vVarNewBuilder.b(uVarD);
        if (eVar instanceof com.waze.t.a.d) {
            com.waze.u.a.s sVarT = a.a.T(((com.waze.t.a.d) eVar).a());
            x.f(sVarT, "value");
            vVarNewBuilder.d(sVarT);
        } else {
            if (!(eVar instanceof com.waze.t.a.c)) {
                throw new h.i();
            }
            com.waze.o.c cVarE = bx.e((w) ((com.waze.t.a.c) eVar).a());
            x.f(cVarE, "value");
            vVarNewBuilder.a(cVarE);
        }
        com.waze.o.c.a.b bVar = this.f32659a;
        com.waze.o.x xVarBuild = vVarNewBuilder.build();
        x.e(xVarBuild, "build(...)");
        return ai.H(new d(bVar.a(xVarBuild), this, 1), this.f32669k);
    }

    @Override // com.waze.t.a.b
    public final kotlinx.coroutines.b.k c(h hVar) {
        x.f(hVar, "trigger");
        av avVarNewBuilder = aw.newBuilder();
        x.f(avVarNewBuilder, "builder");
        u uVarD = d();
        x.f(uVarD, "value");
        avVarNewBuilder.a(uVarD);
        bj bjVarNewBuilder = com.waze.o.bx.newBuilder();
        x.f(bjVarNewBuilder, "builder");
        if (x.n(hVar, com.waze.t.a.f.f40636a)) {
            bk bkVarNewBuilder = bl.newBuilder();
            x.f(bkVarNewBuilder, "builder");
            bl blVarBuild = bkVarNewBuilder.build();
            x.e(blVarBuild, "build(...)");
            bl blVar = blVarBuild;
            x.f(blVar, "value");
            bjVarNewBuilder.a(blVar);
        } else {
            if (!(hVar instanceof com.waze.t.a.g)) {
                throw new h.i();
            }
            bv bvVarNewBuilder = bw.newBuilder();
            x.f(bvVarNewBuilder, "builder");
            com.waze.u.a.s sVarT = a.a.T(((com.waze.t.a.g) hVar).a());
            x.f(sVarT, "value");
            bvVarNewBuilder.a(sVarT);
            bw bwVarBuild = bvVarNewBuilder.build();
            x.e(bwVarBuild, "build(...)");
            bw bwVar = bwVarBuild;
            x.f(bwVar, "value");
            bjVarNewBuilder.b(bwVar);
        }
        com.waze.o.c.a.b bVar = this.f32659a;
        com.waze.o.bx bxVarBuild = bjVarNewBuilder.build();
        x.e(bxVarBuild, "build(...)");
        com.waze.o.bx bxVar = bxVarBuild;
        x.f(bxVar, "value");
        avVarNewBuilder.b(bxVar);
        String str = (String) this.f32663e.b();
        x.f(str, "value");
        avVarNewBuilder.c(str);
        aw awVarBuild = avVarNewBuilder.build();
        x.e(awVarBuild, "build(...)");
        return ai.H(new d(bVar.b(awVarBuild), this, 0), this.f32669k);
    }
}
