package com.waze.av.b;

import android.content.Context;
import com.waze.authentication.AuthNativeManager;
import com.waze.config.dh;
import com.waze.navigate.eo;
import com.waze.network.GrpcCallerNativeManager;
import com.waze.places.PlacesNativeManager;
import com.waze.stats.storage.StatsDatabase;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class ab implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f15848a;

    public /* synthetic */ ab(int i2) {
        this.f15848a = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15848a) {
            case 0:
                org.a.d.k.b bVar = (org.a.d.k.b) obj;
                int i2 = ad.f15850a;
                h.g.b.x.f(bVar, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(kotlinx.coroutines.av.b().plus(kotlinx.coroutines.aj.Q()));
                int i3 = h.g.b.ar.f48106a;
                com.waze.w.r rVar = (com.waze.w.r) bVar.a(new h.g.b.m(com.waze.w.r.class), null, null);
                com.waze.w.n nVar = (com.waze.w.n) bVar.a(new h.g.b.m(com.waze.w.n.class), null, null);
                return new com.waze.av.a.m(rVar, nVar, (com.waze.w.l) bVar.a(new h.g.b.m(com.waze.w.l.class), null, null), afVarE, new ac(bVar.a(new h.g.b.m(PlacesNativeManager.class), null, null), 0));
            case 1:
                org.a.d.k.b bVar2 = (org.a.d.k.b) obj;
                int i4 = ad.f15850a;
                h.g.b.x.f(bVar2, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                h.c.j jVarPlus = kotlinx.coroutines.av.b().plus(kotlinx.coroutines.aj.Q()).plus(new kotlinx.coroutines.ae("WazePlaceRepository"));
                int i5 = h.g.b.ar.f48106a;
                com.waze.w.r rVar2 = (com.waze.w.r) bVar2.a(new h.g.b.m(com.waze.w.r.class), null, null);
                com.waze.w.n nVar2 = (com.waze.w.n) bVar2.a(new h.g.b.m(com.waze.w.n.class), null, null);
                com.waze.w.l lVar = (com.waze.w.l) bVar2.a(new h.g.b.m(com.waze.w.l.class), null, null);
                ac acVar = new ac(bVar2.a(new h.g.b.m(PlacesNativeManager.class), null, null), 1);
                com.waze.places.g gVar = (com.waze.places.g) bVar2.a(new h.g.b.m(com.waze.places.g.class), null, null);
                com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("WazePlaceRepositoryImpl");
                h.g.b.x.e(eVarD, "create(...)");
                return new be(rVar2, nVar2, jVarPlus, lVar, acVar, gVar, eVarD);
            case 2:
                org.a.d.k.b bVar3 = (org.a.d.k.b) obj;
                int i6 = com.waze.modules.a.c.f29797a;
                h.g.b.x.f(bVar3, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i7 = h.g.b.ar.f48106a;
                e.a.i iVarA = ((com.waze.modules.b.i) bVar3.a(new h.g.b.m(com.waze.modules.b.i.class), null, null)).a();
                e.a.h hVar = e.a.h.f47759a;
                h.g.b.x.e(hVar, "DEFAULT");
                return new com.waze.i.c(iVarA, hVar);
            case 3:
                org.a.d.k.b bVar4 = (org.a.d.k.b) obj;
                int i8 = com.waze.modules.a.c.f29797a;
                h.g.b.x.f(bVar4, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                h.f fVarA = h.g.a(new com.waze.car_lib.e.e(bVar4, 18));
                com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("CredentialProviderImpl");
                h.g.b.x.e(eVarD2, "create(...)");
                return new com.waze.modules.a.a(fVarA, eVarD2);
            case 4:
                org.a.d.k.b bVar5 = (org.a.d.k.b) obj;
                int i9 = com.waze.modules.a.c.f29797a;
                h.g.b.x.f(bVar5, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("RevokeCredentialsTokensRequestClient");
                h.g.b.x.e(eVarD3, "create(...)");
                int i10 = h.g.b.ar.f48106a;
                return new com.waze.uid.k((com.waze.authentication.l) bVar5.a(new h.g.b.m(com.waze.authentication.l.class), null, null), com.waze.shared_infra.l.b.e(), eVarD3);
            case 5:
                org.a.d.k.b bVar6 = (org.a.d.k.b) obj;
                int i11 = com.waze.modules.a.c.f29797a;
                h.g.b.x.f(bVar6, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("Authentication");
                h.g.b.x.e(eVarD4, "create(...)");
                int i12 = h.g.b.ar.f48106a;
                com.waze.network.a.c cVar = new com.waze.network.a.c(eVarD4, new com.waze.aa.d(new h.g.b.m(com.waze.i.c.class)), (com.waze.network.a.a) bVar6.a(new h.g.b.m(com.waze.network.a.a.class), null, null));
                com.waze.authentication.a.a aVar = new com.waze.authentication.a.a(((com.waze.be.b) bVar6.a(new h.g.b.m(com.waze.be.b.class), null, null)).a(k.a.k.g(bVar6)), (com.waze.shared_infra.q.e) bVar6.a(new h.g.b.m(com.waze.shared_infra.q.e.class), null, null), new com.waze.car_lib.l());
                com.waze.authentication.l lVar2 = (com.waze.authentication.l) bVar6.a(new h.g.b.m(com.waze.authentication.l.class), null, null);
                com.waze.modules.a.b bVar7 = new com.waze.modules.a.b();
                com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("Authentication");
                h.g.b.x.e(eVarD5, "create(...)");
                return new com.waze.authentication.ah(cVar, aVar, lVar2, bVar7, null, null, eVarD5, 48);
            case 6:
                org.a.d.k.b bVar8 = (org.a.d.k.b) obj;
                int i13 = com.waze.modules.a.c.f29797a;
                h.g.b.x.f(bVar8, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i14 = h.g.b.ar.f48106a;
                return new com.waze.network.d.h((com.waze.authentication.i) bVar8.a(new h.g.b.m(com.waze.authentication.i.class), new org.a.d.i.c(new h.g.b.m(com.waze.authentication.a.class)), null));
            case 7:
                org.a.d.k.b bVar9 = (org.a.d.k.b) obj;
                int i15 = com.waze.modules.a.c.f29797a;
                h.g.b.x.f(bVar9, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i16 = h.g.b.ar.f48106a;
                return new com.waze.modules.a.e((Context) bVar9.a(new h.g.b.m(Context.class), null, null), new com.waze.beacons.g(AuthNativeManager.INSTANCE));
            case 8:
                org.a.d.k.b bVar10 = (org.a.d.k.b) obj;
                int i17 = com.waze.modules.b.e.f29821a;
                h.g.b.x.f(bVar10, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i18 = h.g.b.ar.f48106a;
                dh dhVar = (dh) bVar10.a(new h.g.b.m(dh.class), null, null);
                com.waze.stats.b bVar11 = (com.waze.stats.b) bVar10.a(new h.g.b.m(com.waze.stats.b.class), null, null);
                Context context = (Context) bVar10.a(new h.g.b.m(Context.class), null, null);
                com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("WazeGrpcChannel");
                h.g.b.x.e(eVarD6, "create(...)");
                return new com.waze.modules.b.d(dhVar, bVar11, context, eVarD6);
            case 9:
                org.a.d.k.b bVar12 = (org.a.d.k.b) obj;
                int i19 = com.waze.modules.b.e.f29821a;
                h.g.b.x.f(bVar12, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i20 = h.g.b.ar.f48106a;
                com.waze.modules.b.d dVar = (com.waze.modules.b.d) bVar12.a(new h.g.b.m(com.waze.modules.b.d.class), null, null);
                com.waze.network.d.r rVar3 = (com.waze.network.d.r) bVar12.a(new h.g.b.m(com.waze.network.d.r.class), null, null);
                com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("WazeUnAuthChannelProvider");
                h.g.b.x.e(eVarD7, "create(...)");
                return new com.waze.modules.b.i(dVar, rVar3, eVarD7);
            case 10:
                org.a.d.k.b bVar13 = (org.a.d.k.b) obj;
                int i21 = com.waze.modules.b.e.f29821a;
                h.g.b.x.f(bVar13, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i22 = h.g.b.ar.f48106a;
                com.waze.modules.b.d dVar2 = (com.waze.modules.b.d) bVar13.a(new h.g.b.m(com.waze.modules.b.d.class), null, null);
                com.waze.network.d.r rVar4 = (com.waze.network.d.r) bVar13.a(new h.g.b.m(com.waze.network.d.r.class), null, null);
                com.waze.authentication.i iVar = (com.waze.authentication.i) bVar13.a(new h.g.b.m(com.waze.network.d.h.class), null, null);
                com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("GrpcCallCredentials");
                h.g.b.x.e(eVarD8, "create(...)");
                com.waze.network.d.l lVar3 = new com.waze.network.d.l(iVar, eVarD8);
                com.waze.authentication.i iVar2 = (com.waze.authentication.i) bVar13.a(new h.g.b.m(com.waze.network.d.h.class), null, null);
                com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("AuthRetryInterceptor");
                h.g.b.x.e(eVarD9, "create(...)");
                com.waze.network.d.e eVar = new com.waze.network.d.e(iVar2, eVarD9);
                com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("WazeAuthChannelProvider");
                h.g.b.x.e(eVarD10, "create(...)");
                return new com.waze.modules.b.h(dVar2, rVar4, eVar, lVar3, eVarD10);
            case 11:
                org.a.d.k.b bVar14 = (org.a.d.k.b) obj;
                int i23 = com.waze.modules.b.e.f29821a;
                h.g.b.x.f(bVar14, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i24 = h.g.b.ar.f48106a;
                e.a.i iVarB = ((com.waze.modules.b.h) bVar14.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                e.a.h hVar2 = e.a.h.f47759a;
                h.g.b.x.e(hVar2, "DEFAULT");
                return new com.waze.network.m(iVarB, hVar2);
            case 12:
                org.a.d.k.b bVar15 = (org.a.d.k.b) obj;
                int i25 = com.waze.modules.b.e.f29821a;
                h.g.b.x.f(bVar15, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i26 = h.g.b.ar.f48106a;
                return new GrpcCallerNativeManager((com.waze.network.m) bVar15.a(new h.g.b.m(com.waze.network.m.class), null, null));
            case 13:
                org.a.d.k.b bVar16 = (org.a.d.k.b) obj;
                int i27 = com.waze.modules.b.e.f29821a;
                h.g.b.x.f(bVar16, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i28 = h.g.b.ar.f48106a;
                return com.waze.ap.b.o.a(((com.waze.modules.b.h) bVar16.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b());
            case 14:
                org.a.d.k.b bVar17 = (org.a.d.k.b) obj;
                int i29 = com.waze.modules.d.h.f30227a;
                h.g.b.x.f(bVar17, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i30 = h.g.b.ar.f48106a;
                com.waze.perf.tracer.g gVar2 = (com.waze.perf.tracer.g) bVar17.a(new h.g.b.m(com.waze.perf.tracer.g.class), null, null);
                com.waze.crash.k kVarF = com.waze.copilot.data.b.k.f((com.waze.crash.c) bVar17.a(new h.g.b.m(com.waze.crash.c.class), null, null), (com.waze.shared_infra.i.b) bVar17.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null), "Stats");
                com.waze.main_screen.ae.a.o oVar = new com.waze.main_screen.ae.a.o();
                kotlinx.coroutines.ab abVarB = kotlinx.coroutines.av.b();
                com.waze.shared_infra.i.e eVarD11 = com.waze.shared_infra.i.a.d("FirebaseStatsInterceptor");
                h.g.b.x.e(eVarD11, "create(...)");
                return new com.waze.perf.j(gVar2, kVarF, eVarD11, oVar, abVarB);
            case 15:
                org.a.d.k.b bVar18 = (org.a.d.k.b) obj;
                int i31 = com.waze.modules.d.h.f30227a;
                h.g.b.x.f(bVar18, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i32 = h.g.b.ar.f48106a;
                com.waze.modules.d.x xVar = new com.waze.modules.d.x((com.waze.g.d) bVar18.a(new h.g.b.m(com.waze.g.d.class), null, null), kotlinx.coroutines.aj.f());
                com.waze.modules.d.y yVar = new com.waze.modules.d.y((com.waze.g.d) bVar18.a(new h.g.b.m(com.waze.g.d.class), null, null));
                com.waze.modules.d.f fVar = new com.waze.modules.d.f((com.waze.shared_infra.q.e) bVar18.a(new h.g.b.m(com.waze.shared_infra.q.e.class), null, null), (com.waze.ao) bVar18.a(new h.g.b.m(com.waze.ao.class), null, null), (com.waze.ac) bVar18.a(new h.g.b.m(com.waze.ac.class), null, null), (eo) bVar18.a(new h.g.b.m(eo.class), null, null), (com.waze.modules.d.c) bVar18.a(new h.g.b.m(com.waze.modules.d.c.class), null, null), (com.waze.sharedui.e.g) bVar18.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null));
                com.waze.stats.aw awVar = (com.waze.stats.aw) bVar18.a(new h.g.b.m(com.waze.stats.aw.class), null, null);
                com.waze.stats.at atVar = (com.waze.stats.at) bVar18.a(new h.g.b.m(com.waze.stats.at.class), null, null);
                com.waze.authentication.l lVar4 = (com.waze.authentication.l) bVar18.a(new h.g.b.m(com.waze.authentication.l.class), null, null);
                com.waze.stats.m mVar = (com.waze.stats.m) bVar18.a(new h.g.b.m(com.waze.stats.m.class), null, null);
                com.waze.shared_infra.i.e eVarD12 = com.waze.shared_infra.i.a.d("New stats infra");
                h.g.b.x.e(eVarD12, "create(...)");
                return new com.waze.stats.ba(xVar, yVar, fVar, awVar, atVar, lVar4, eVarD12, mVar);
            case 16:
                int i33 = com.waze.modules.d.h.f30227a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.modules.b.f();
            case 17:
                org.a.d.k.b bVar19 = (org.a.d.k.b) obj;
                h.g.b.x.f(bVar19, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i34 = h.g.b.ar.f48106a;
                com.waze.modules.d.s sVar = new com.waze.modules.d.s((dh) bVar19.a(new h.g.b.m(dh.class), null, null));
                com.waze.shared_infra.i.c cVar2 = new com.waze.shared_infra.i.c("New stats infra StatsReporter");
                cVar2.e(sVar.g());
                com.waze.shared_infra.i.e eVarC = com.waze.shared_infra.i.a.c(cVar2);
                com.waze.modules.b.a.d dVar3 = new com.waze.modules.b.a.d((com.waze.n.ab) bVar19.a(new h.g.b.m(com.waze.n.ab.class), null, null), (com.waze.shared_infra.i.b) bVar19.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null), (com.waze.perf.w) bVar19.a(new h.g.b.m(com.waze.perf.w.class), null, null));
                StatsDatabase statsDatabase = (StatsDatabase) bVar19.a(new h.g.b.m(StatsDatabase.class), null, null);
                com.waze.stats.aa aaVar = com.waze.stats.aa.f40492a;
                com.waze.stats.storage.c cVar3 = new com.waze.stats.storage.c(statsDatabase, aaVar, eVarC);
                com.waze.modules.d.q qVar = new com.waze.modules.d.q((com.waze.g.d) bVar19.a(new h.g.b.m(com.waze.g.d.class), null, null), 1, null);
                return new com.waze.stats.an(dVar3, cVar3, sVar, qVar, (com.waze.stats.z) bVar19.a(new h.g.b.m(com.waze.stats.z.class), null, null), eVarC, kotlinx.coroutines.av.a(), kotlinx.coroutines.av.a(), (com.waze.g.d) bVar19.a(new h.g.b.m(com.waze.g.d.class), null, null), (com.waze.shared_infra.i.b) bVar19.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null), new com.waze.stats.ab(eVarC, 0), aaVar);
            case 18:
                org.a.d.k.b bVar20 = (org.a.d.k.b) obj;
                h.g.b.x.f(bVar20, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i35 = h.g.b.ar.f48106a;
                com.waze.modules.d.aa aaVar2 = new com.waze.modules.d.aa((dh) bVar20.a(new h.g.b.m(dh.class), null, null));
                com.waze.shared_infra.i.c cVar4 = new com.waze.shared_infra.i.c("New stats infra UnauthenticatedStatsReporter");
                cVar4.e(aaVar2.g());
                com.waze.shared_infra.i.e eVarC2 = com.waze.shared_infra.i.a.c(cVar4);
                com.waze.modules.b.a.e eVar2 = new com.waze.modules.b.a.e((com.waze.n.ap) bVar20.a(new h.g.b.m(com.waze.n.ap.class), null, null));
                StatsDatabase statsDatabase2 = (StatsDatabase) bVar20.a(new h.g.b.m(StatsDatabase.class), null, null);
                com.waze.stats.aa aaVar3 = com.waze.stats.aa.f40493b;
                com.waze.stats.storage.c cVar5 = new com.waze.stats.storage.c(statsDatabase2, aaVar3, eVarC2);
                com.waze.modules.d.q qVar2 = new com.waze.modules.d.q((com.waze.g.d) bVar20.a(new h.g.b.m(com.waze.g.d.class), null, null), 0);
                return new com.waze.stats.an(eVar2, cVar5, aaVar2, qVar2, (com.waze.stats.z) bVar20.a(new h.g.b.m(com.waze.stats.z.class), null, null), eVarC2, kotlinx.coroutines.av.a(), kotlinx.coroutines.av.a(), (com.waze.g.d) bVar20.a(new h.g.b.m(com.waze.g.d.class), null, null), (com.waze.shared_infra.i.b) bVar20.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null), new com.waze.stats.ab(eVarC2, 2, (char[]) null), aaVar3);
            case 19:
                org.a.d.k.b bVar21 = (org.a.d.k.b) obj;
                h.g.b.x.f(bVar21, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i36 = h.g.b.ar.f48106a;
                com.waze.modules.d.b bVar22 = new com.waze.modules.d.b((dh) bVar21.a(new h.g.b.m(dh.class), null, null));
                com.waze.shared_infra.i.c cVar6 = new com.waze.shared_infra.i.c("AdEventsReporter");
                cVar6.e(bVar22.g());
                com.waze.shared_infra.i.e eVarC3 = com.waze.shared_infra.i.a.c(cVar6);
                com.waze.modules.b.a.a aVar2 = new com.waze.modules.b.a.a((com.waze.ch.a.a.e) bVar21.a(new h.g.b.m(com.waze.ch.a.a.e.class), null, null), (com.waze.shared_infra.i.b) bVar21.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null), (com.waze.perf.a) bVar21.a(new h.g.b.m(com.waze.perf.a.class), null, null));
                StatsDatabase statsDatabase3 = (StatsDatabase) bVar21.a(new h.g.b.m(StatsDatabase.class), null, null);
                com.waze.stats.aa aaVar4 = com.waze.stats.aa.f40494c;
                com.waze.stats.storage.c cVar7 = new com.waze.stats.storage.c(statsDatabase3, aaVar4, eVarC3);
                com.waze.modules.d.q qVar3 = new com.waze.modules.d.q((com.waze.g.d) bVar21.a(new h.g.b.m(com.waze.g.d.class), null, null), 1, null);
                return new com.waze.stats.an(aVar2, cVar7, bVar22, qVar3, (com.waze.stats.z) bVar21.a(new h.g.b.m(com.waze.stats.z.class), null, null), eVarC3, kotlinx.coroutines.av.a(), kotlinx.coroutines.av.a(), (com.waze.g.d) bVar21.a(new h.g.b.m(com.waze.g.d.class), null, null), (com.waze.shared_infra.i.b) bVar21.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null), new com.waze.stats.ab(eVarC3, 1, (byte[]) null), aaVar4);
            default:
                org.a.d.k.b bVar23 = (org.a.d.k.b) obj;
                h.g.b.x.f(bVar23, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i37 = h.g.b.ar.f48106a;
                com.waze.modules.d.p pVar = new com.waze.modules.d.p((dh) bVar23.a(new h.g.b.m(dh.class), null, null));
                com.waze.shared_infra.i.c cVar8 = new com.waze.shared_infra.i.c("New stats infra MetricsReporter");
                cVar8.e(pVar.a());
                com.waze.shared_infra.i.e eVarC4 = com.waze.shared_infra.i.a.c(cVar8);
                com.waze.modules.b.a.b bVar24 = new com.waze.modules.b.a.b((com.waze.n.ab) bVar23.a(new h.g.b.m(com.waze.n.ab.class), null, null));
                return new com.waze.stats.e(eVarC4, pVar, new com.waze.modules.d.q((com.waze.g.d) bVar23.a(new h.g.b.m(com.waze.g.d.class), null, null), 1, null), (com.waze.stats.z) bVar23.a(new h.g.b.m(com.waze.stats.z.class), null, null), bVar24, kotlinx.coroutines.av.a());
        }
    }
}
