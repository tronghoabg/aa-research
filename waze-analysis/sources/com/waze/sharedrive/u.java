package com.waze.sharedrive;

import android.content.Context;
import androidx.asynclayoutinflater.view.AsyncLayoutInflater;
import com.waze.MoodManager;
import com.waze.ao;
import com.waze.map.b.ai;
import com.waze.modules.navigation.bp;
import com.waze.navigate.dg;
import com.waze.navigate.en;
import com.waze.sharedrive.a.ac;
import com.waze.sharedrive.d.as;
import com.waze.sharedrive.e.at;
import com.waze.sharedrive.e.au;
import com.waze.sharedrive.e.bc;
import com.waze.sharedrive.e.bf;
import com.waze.sharedrive.e.bo;
import com.waze.sharedrive.e.bq;
import com.waze.sharedrive.e.bw;
import com.waze.sharedrive.e.cn;
import com.waze.sharedrive.e.co;
import com.waze.sharedrive.e.cr;
import h.g.b.ar;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;
import kotlinx.coroutines.cj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class u implements h.g.a.l {
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        org.a.d.g.a aVar = (org.a.d.g.a) obj;
        int i2 = v.f38772a;
        h.g.b.x.f(aVar, "$this$module");
        final int i3 = 1;
        h.g.a.p pVar = new h.g.a.p() { // from class: com.waze.sharedrive.t
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                byte[] bArr = null;
                switch (i3) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i4 = v.f38772a;
                        h.g.b.x.f(bVar, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i5 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar2 = (com.waze.sharedrive.d.a) bVar.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ShareDriveDeeplinkReceiver");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new as(aVar2, eVarD);
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i6 = v.f38772a;
                        h.g.b.x.f(bVar2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i7 = ar.f48106a;
                        com.waze.map.d dVar = (com.waze.map.d) bVar2.a(new h.g.b.m(com.waze.map.d.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("ShareDriveDataConverter");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.sharedrive.c.q(dVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i8 = v.f38772a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i9 = ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar3.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar = e.a.h.f47759a;
                        h.g.b.x.e(hVar, "DEFAULT");
                        return new ac(iVarB, hVar);
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i10 = v.f38772a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i11 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar3 = (com.waze.sharedrive.b.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.d.a aVar4 = (com.waze.sharedrive.d.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        ao aoVar = (ao) bVar4.a(new h.g.b.m(ao.class), null, null);
                        dg dgVar = (dg) bVar4.a(new h.g.b.m(dg.class), null, null);
                        af afVarE = aj.e(av.a().plus(aj.Q()));
                        com.waze.sharedrive.e.i iVar = com.waze.sharedrive.e.i.f38533a;
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("ShareDriveInterceptor");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new bf(aVar3, aVar4, aoVar, dgVar, afVarE, iVar, eVarD3);
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i12 = v.f38772a;
                        h.g.b.x.f(bVar5, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i13 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar5 = (com.waze.sharedrive.b.a) bVar5.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        ac acVar = (ac) bVar5.a(new h.g.b.m(ac.class), null, null);
                        com.waze.sharedrive.c.q qVar = (com.waze.sharedrive.c.q) bVar5.a(new h.g.b.m(com.waze.sharedrive.c.q.class), null, null);
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("ShareDriveApi");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.sharedrive.c.e(aVar5, acVar, qVar, eVarD4);
                    case 5:
                        int i14 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.b.a();
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i15 = v.f38772a;
                        h.g.b.x.f(bVar6, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar6 = (com.waze.sharedrive.b.a) bVar6.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.c.e eVar = (com.waze.sharedrive.c.e) bVar6.a(new h.g.b.m(com.waze.sharedrive.c.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("ShareDriveService");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new com.waze.sharedrive.c.s(aVar6, eVar, eVarD5);
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i17 = v.f38772a;
                        h.g.b.x.f(bVar7, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar7 = (com.waze.sharedrive.d.a) bVar7.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("EtaDrawerShareButtonStateHolder");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new com.waze.sharedrive.e.j(aVar7, eVarD6);
                    case 8:
                        int i19 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new au(bArr);
                    case 9:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i20 = v.f38772a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i21 = ar.f48106a;
                        com.waze.sharedrive.c.s sVar = (com.waze.sharedrive.c.s) bVar8.a(new h.g.b.m(com.waze.sharedrive.c.s.class), null, null);
                        com.waze.sharedrive.b.a aVar8 = (com.waze.sharedrive.b.a) bVar8.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        dg dgVar2 = (dg) bVar8.a(new h.g.b.m(dg.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar8.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        h.c.j jVarPlus = av.a().plus(aj.Q());
                        com.waze.sharedui.profile.b bVar9 = (com.waze.sharedui.profile.b) bVar8.a(new h.g.b.m(com.waze.sharedui.profile.b.class), null, null);
                        com.waze.location.b.d dVar2 = (com.waze.location.b.d) bVar8.a(new h.g.b.m(com.waze.location.b.d.class), null, new com.waze.settings.ao(8));
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("ShareDriveController");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sharedrive.d.b(aVar8, sVar, dgVar2, gVar, bVar9, jVarPlus, dVar2, eVarD7);
                    case 10:
                        int i22 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new s(ShareDriveNativeManager.INSTANCE);
                    case 11:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i23 = v.f38772a;
                        h.g.b.x.f(bVar10, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i24 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar9 = (com.waze.sharedrive.d.a) bVar10.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        com.waze.main_screen.p.b.a.b.c cVar = (com.waze.main_screen.p.b.a.b.c) bVar10.a(new h.g.b.m(com.waze.main_screen.p.b.a.b.c.class), null, null);
                        com.waze.main_screen.l.b.e eVar2 = (com.waze.main_screen.l.b.e) bVar10.a(new h.g.b.m(com.waze.main_screen.l.b.e.class), null, null);
                        com.waze.sharedrive.e.w wVar = (com.waze.sharedrive.e.w) bVar10.a(new h.g.b.m(com.waze.sharedrive.e.w.class), null, null);
                        cn cnVar = (cn) bVar10.a(new h.g.b.m(cn.class), null, null);
                        bo boVar = (bo) bVar10.a(new h.g.b.m(bo.class), null, null);
                        bp bpVar = (bp) bVar10.a(new h.g.b.m(bp.class), null, null);
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("LiveShareDriveViewModel");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new at(aVar9, wVar, enVar, cVar, eVar2, cnVar, boVar, bpVar, eVarD8);
                    case 12:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i25 = v.f38772a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar10 = (com.waze.sharedrive.d.a) bVar11.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        s sVar2 = (s) bVar11.a(new h.g.b.m(s.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("ShareDriveMapIndicationStateHolder");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new bq(aVar10, sVar2, eVarD9);
                    case 13:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i27 = v.f38772a;
                        h.g.b.x.f(bVar12, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar12);
                        int i28 = av.f51370a;
                        cj cjVar = kotlinx.coroutines.e.ac.f51860a;
                        AsyncLayoutInflater asyncLayoutInflater = new AsyncLayoutInflater(k.a.k.h(bVar12));
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("ViewBitmapRenderer");
                        h.g.b.x.e(eVarD10, "create(...)");
                        return new cr(contextH, cjVar, asyncLayoutInflater, eVarD10);
                    case 14:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i29 = v.f38772a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.e.p(k.a.k.h(bVar13), av.b());
                    case 15:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = v.f38772a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = ar.f48106a;
                        co coVar = (co) bVar14.a(new h.g.b.m(co.class), null, null);
                        com.waze.sharedrive.e.a aVar11 = (com.waze.sharedrive.e.a) bVar14.a(new h.g.b.m(com.waze.sharedrive.e.a.class), null, null);
                        MoodManager moodManager = (MoodManager) bVar14.a(new h.g.b.m(MoodManager.class), null, null);
                        kotlinx.coroutines.ab abVarB = av.b();
                        com.waze.shared_infra.i.e eVarD11 = com.waze.shared_infra.i.a.d("ParticipantPinRenderer");
                        h.g.b.x.e(eVarD11, "create(...)");
                        return new bc(coVar, aVar11, moodManager, abVarB, eVarD11, h.o.g.f48282a);
                    case 16:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = v.f38772a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = ar.f48106a;
                        ai aiVar = (ai) bVar15.a(new h.g.b.m(ai.class), null, null);
                        com.waze.map.b.cj cjVar2 = (com.waze.map.b.cj) bVar15.a(new h.g.b.m(com.waze.map.b.cj.class), null, null);
                        com.waze.sharedrive.d.a aVar12 = (com.waze.sharedrive.d.a) bVar15.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.sharedrive.e.av avVar = (com.waze.sharedrive.e.av) bVar15.a(new h.g.b.m(com.waze.sharedrive.e.av.class), null, null);
                        com.waze.shared_infra.i.e eVarD12 = com.waze.shared_infra.i.a.d("LiveDriveMapStateHolder");
                        h.g.b.x.e(eVarD12, "create(...)");
                        return new com.waze.sharedrive.e.x(aiVar, cjVar2, aVar12, avVar, eVarD12);
                    case 17:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = v.f38772a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = ar.f48106a;
                        return new cn((MoodManager) bVar16.a(new h.g.b.m(MoodManager.class), null, null), (com.waze.shared_infra.q.j) bVar16.a(new h.g.b.m(com.waze.shared_infra.q.j.class), null, null));
                    case 18:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = v.f38772a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar13 = (com.waze.sharedrive.d.a) bVar17.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar2 = (cn) bVar17.a(new h.g.b.m(cn.class), null, null);
                        com.waze.mywaze.n nVar = (com.waze.mywaze.n) bVar17.a(new h.g.b.m(com.waze.mywaze.n.class), null, null);
                        com.waze.shared_infra.i.e eVarD13 = com.waze.shared_infra.i.a.d("CreateSharePreviewStateHolder");
                        h.g.b.x.e(eVarD13, "create(...)");
                        return new com.waze.sharedrive.e.e(aVar13, cnVar2, nVar, eVarD13);
                    case 19:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = v.f38772a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar14 = (com.waze.sharedrive.d.a) bVar18.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar3 = (cn) bVar18.a(new h.g.b.m(cn.class), null, null);
                        com.waze.shared_infra.i.e eVarD14 = com.waze.shared_infra.i.a.d("JoinSharePreviewStateHolder");
                        h.g.b.x.e(eVarD14, "create(...)");
                        return new com.waze.sharedrive.e.q(aVar14, cnVar3, eVarD14);
                    default:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = v.f38772a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = ar.f48106a;
                        com.waze.sharedrive.e.e eVar3 = (com.waze.sharedrive.e.e) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.e.class), null, null);
                        com.waze.sharedrive.e.q qVar2 = (com.waze.sharedrive.e.q) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.q.class), null, null);
                        com.waze.sharedrive.d.a aVar15 = (com.waze.sharedrive.d.a) bVar19.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD15 = com.waze.shared_infra.i.a.d("ShareDriveStateHolder");
                        h.g.b.x.e(eVarD15, "create(...)");
                        return new bw(eVar3, qVar2, aVar15, eVarD15);
                }
            }
        };
        org.a.d.i.b bVar = org.a.d.j.a.f56411b;
        org.a.d.c.c cVar = org.a.d.c.c.f56382a;
        List listH = h.a.i.h();
        int i4 = ar.f48106a;
        org.a.d.e.e eVar = new org.a.d.e.e(new org.a.d.c.a(bVar, new h.g.b.m(com.waze.sharedrive.c.q.class), null, pVar, cVar, listH));
        aVar.f(eVar);
        new org.a.d.c.d(aVar, eVar);
        final int i5 = 2;
        h.g.a.p pVar2 = new h.g.a.p() { // from class: com.waze.sharedrive.t
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                byte[] bArr = null;
                switch (i5) {
                    case 0:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i42 = v.f38772a;
                        h.g.b.x.f(bVar2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i52 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar2 = (com.waze.sharedrive.d.a) bVar2.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ShareDriveDeeplinkReceiver");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new as(aVar2, eVarD);
                    case 1:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i6 = v.f38772a;
                        h.g.b.x.f(bVar22, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i7 = ar.f48106a;
                        com.waze.map.d dVar = (com.waze.map.d) bVar22.a(new h.g.b.m(com.waze.map.d.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("ShareDriveDataConverter");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.sharedrive.c.q(dVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i8 = v.f38772a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i9 = ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar3.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar = e.a.h.f47759a;
                        h.g.b.x.e(hVar, "DEFAULT");
                        return new ac(iVarB, hVar);
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i10 = v.f38772a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i11 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar3 = (com.waze.sharedrive.b.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.d.a aVar4 = (com.waze.sharedrive.d.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        ao aoVar = (ao) bVar4.a(new h.g.b.m(ao.class), null, null);
                        dg dgVar = (dg) bVar4.a(new h.g.b.m(dg.class), null, null);
                        af afVarE = aj.e(av.a().plus(aj.Q()));
                        com.waze.sharedrive.e.i iVar = com.waze.sharedrive.e.i.f38533a;
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("ShareDriveInterceptor");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new bf(aVar3, aVar4, aoVar, dgVar, afVarE, iVar, eVarD3);
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i12 = v.f38772a;
                        h.g.b.x.f(bVar5, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i13 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar5 = (com.waze.sharedrive.b.a) bVar5.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        ac acVar = (ac) bVar5.a(new h.g.b.m(ac.class), null, null);
                        com.waze.sharedrive.c.q qVar = (com.waze.sharedrive.c.q) bVar5.a(new h.g.b.m(com.waze.sharedrive.c.q.class), null, null);
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("ShareDriveApi");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.sharedrive.c.e(aVar5, acVar, qVar, eVarD4);
                    case 5:
                        int i14 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.b.a();
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i15 = v.f38772a;
                        h.g.b.x.f(bVar6, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar6 = (com.waze.sharedrive.b.a) bVar6.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.c.e eVar2 = (com.waze.sharedrive.c.e) bVar6.a(new h.g.b.m(com.waze.sharedrive.c.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("ShareDriveService");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new com.waze.sharedrive.c.s(aVar6, eVar2, eVarD5);
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i17 = v.f38772a;
                        h.g.b.x.f(bVar7, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar7 = (com.waze.sharedrive.d.a) bVar7.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("EtaDrawerShareButtonStateHolder");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new com.waze.sharedrive.e.j(aVar7, eVarD6);
                    case 8:
                        int i19 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new au(bArr);
                    case 9:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i20 = v.f38772a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i21 = ar.f48106a;
                        com.waze.sharedrive.c.s sVar = (com.waze.sharedrive.c.s) bVar8.a(new h.g.b.m(com.waze.sharedrive.c.s.class), null, null);
                        com.waze.sharedrive.b.a aVar8 = (com.waze.sharedrive.b.a) bVar8.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        dg dgVar2 = (dg) bVar8.a(new h.g.b.m(dg.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar8.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        h.c.j jVarPlus = av.a().plus(aj.Q());
                        com.waze.sharedui.profile.b bVar9 = (com.waze.sharedui.profile.b) bVar8.a(new h.g.b.m(com.waze.sharedui.profile.b.class), null, null);
                        com.waze.location.b.d dVar2 = (com.waze.location.b.d) bVar8.a(new h.g.b.m(com.waze.location.b.d.class), null, new com.waze.settings.ao(8));
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("ShareDriveController");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sharedrive.d.b(aVar8, sVar, dgVar2, gVar, bVar9, jVarPlus, dVar2, eVarD7);
                    case 10:
                        int i22 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new s(ShareDriveNativeManager.INSTANCE);
                    case 11:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i23 = v.f38772a;
                        h.g.b.x.f(bVar10, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i24 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar9 = (com.waze.sharedrive.d.a) bVar10.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        com.waze.main_screen.p.b.a.b.c cVar2 = (com.waze.main_screen.p.b.a.b.c) bVar10.a(new h.g.b.m(com.waze.main_screen.p.b.a.b.c.class), null, null);
                        com.waze.main_screen.l.b.e eVar22 = (com.waze.main_screen.l.b.e) bVar10.a(new h.g.b.m(com.waze.main_screen.l.b.e.class), null, null);
                        com.waze.sharedrive.e.w wVar = (com.waze.sharedrive.e.w) bVar10.a(new h.g.b.m(com.waze.sharedrive.e.w.class), null, null);
                        cn cnVar = (cn) bVar10.a(new h.g.b.m(cn.class), null, null);
                        bo boVar = (bo) bVar10.a(new h.g.b.m(bo.class), null, null);
                        bp bpVar = (bp) bVar10.a(new h.g.b.m(bp.class), null, null);
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("LiveShareDriveViewModel");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new at(aVar9, wVar, enVar, cVar2, eVar22, cnVar, boVar, bpVar, eVarD8);
                    case 12:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i25 = v.f38772a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar10 = (com.waze.sharedrive.d.a) bVar11.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        s sVar2 = (s) bVar11.a(new h.g.b.m(s.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("ShareDriveMapIndicationStateHolder");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new bq(aVar10, sVar2, eVarD9);
                    case 13:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i27 = v.f38772a;
                        h.g.b.x.f(bVar12, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar12);
                        int i28 = av.f51370a;
                        cj cjVar = kotlinx.coroutines.e.ac.f51860a;
                        AsyncLayoutInflater asyncLayoutInflater = new AsyncLayoutInflater(k.a.k.h(bVar12));
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("ViewBitmapRenderer");
                        h.g.b.x.e(eVarD10, "create(...)");
                        return new cr(contextH, cjVar, asyncLayoutInflater, eVarD10);
                    case 14:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i29 = v.f38772a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.e.p(k.a.k.h(bVar13), av.b());
                    case 15:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = v.f38772a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = ar.f48106a;
                        co coVar = (co) bVar14.a(new h.g.b.m(co.class), null, null);
                        com.waze.sharedrive.e.a aVar11 = (com.waze.sharedrive.e.a) bVar14.a(new h.g.b.m(com.waze.sharedrive.e.a.class), null, null);
                        MoodManager moodManager = (MoodManager) bVar14.a(new h.g.b.m(MoodManager.class), null, null);
                        kotlinx.coroutines.ab abVarB = av.b();
                        com.waze.shared_infra.i.e eVarD11 = com.waze.shared_infra.i.a.d("ParticipantPinRenderer");
                        h.g.b.x.e(eVarD11, "create(...)");
                        return new bc(coVar, aVar11, moodManager, abVarB, eVarD11, h.o.g.f48282a);
                    case 16:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = v.f38772a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = ar.f48106a;
                        ai aiVar = (ai) bVar15.a(new h.g.b.m(ai.class), null, null);
                        com.waze.map.b.cj cjVar2 = (com.waze.map.b.cj) bVar15.a(new h.g.b.m(com.waze.map.b.cj.class), null, null);
                        com.waze.sharedrive.d.a aVar12 = (com.waze.sharedrive.d.a) bVar15.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.sharedrive.e.av avVar = (com.waze.sharedrive.e.av) bVar15.a(new h.g.b.m(com.waze.sharedrive.e.av.class), null, null);
                        com.waze.shared_infra.i.e eVarD12 = com.waze.shared_infra.i.a.d("LiveDriveMapStateHolder");
                        h.g.b.x.e(eVarD12, "create(...)");
                        return new com.waze.sharedrive.e.x(aiVar, cjVar2, aVar12, avVar, eVarD12);
                    case 17:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = v.f38772a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = ar.f48106a;
                        return new cn((MoodManager) bVar16.a(new h.g.b.m(MoodManager.class), null, null), (com.waze.shared_infra.q.j) bVar16.a(new h.g.b.m(com.waze.shared_infra.q.j.class), null, null));
                    case 18:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = v.f38772a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar13 = (com.waze.sharedrive.d.a) bVar17.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar2 = (cn) bVar17.a(new h.g.b.m(cn.class), null, null);
                        com.waze.mywaze.n nVar = (com.waze.mywaze.n) bVar17.a(new h.g.b.m(com.waze.mywaze.n.class), null, null);
                        com.waze.shared_infra.i.e eVarD13 = com.waze.shared_infra.i.a.d("CreateSharePreviewStateHolder");
                        h.g.b.x.e(eVarD13, "create(...)");
                        return new com.waze.sharedrive.e.e(aVar13, cnVar2, nVar, eVarD13);
                    case 19:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = v.f38772a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar14 = (com.waze.sharedrive.d.a) bVar18.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar3 = (cn) bVar18.a(new h.g.b.m(cn.class), null, null);
                        com.waze.shared_infra.i.e eVarD14 = com.waze.shared_infra.i.a.d("JoinSharePreviewStateHolder");
                        h.g.b.x.e(eVarD14, "create(...)");
                        return new com.waze.sharedrive.e.q(aVar14, cnVar3, eVarD14);
                    default:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = v.f38772a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = ar.f48106a;
                        com.waze.sharedrive.e.e eVar3 = (com.waze.sharedrive.e.e) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.e.class), null, null);
                        com.waze.sharedrive.e.q qVar2 = (com.waze.sharedrive.e.q) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.q.class), null, null);
                        com.waze.sharedrive.d.a aVar15 = (com.waze.sharedrive.d.a) bVar19.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD15 = com.waze.shared_infra.i.a.d("ShareDriveStateHolder");
                        h.g.b.x.e(eVarD15, "create(...)");
                        return new bw(eVar3, qVar2, aVar15, eVarD15);
                }
            }
        };
        org.a.d.e.e eVar2 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(ac.class), null, pVar2, cVar, h.a.i.h()));
        aVar.f(eVar2);
        new org.a.d.c.d(aVar, eVar2);
        final int i6 = 4;
        h.g.a.p pVar3 = new h.g.a.p() { // from class: com.waze.sharedrive.t
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                byte[] bArr = null;
                switch (i6) {
                    case 0:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i42 = v.f38772a;
                        h.g.b.x.f(bVar2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i52 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar2 = (com.waze.sharedrive.d.a) bVar2.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ShareDriveDeeplinkReceiver");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new as(aVar2, eVarD);
                    case 1:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i62 = v.f38772a;
                        h.g.b.x.f(bVar22, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i7 = ar.f48106a;
                        com.waze.map.d dVar = (com.waze.map.d) bVar22.a(new h.g.b.m(com.waze.map.d.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("ShareDriveDataConverter");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.sharedrive.c.q(dVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i8 = v.f38772a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i9 = ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar3.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar = e.a.h.f47759a;
                        h.g.b.x.e(hVar, "DEFAULT");
                        return new ac(iVarB, hVar);
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i10 = v.f38772a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i11 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar3 = (com.waze.sharedrive.b.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.d.a aVar4 = (com.waze.sharedrive.d.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        ao aoVar = (ao) bVar4.a(new h.g.b.m(ao.class), null, null);
                        dg dgVar = (dg) bVar4.a(new h.g.b.m(dg.class), null, null);
                        af afVarE = aj.e(av.a().plus(aj.Q()));
                        com.waze.sharedrive.e.i iVar = com.waze.sharedrive.e.i.f38533a;
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("ShareDriveInterceptor");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new bf(aVar3, aVar4, aoVar, dgVar, afVarE, iVar, eVarD3);
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i12 = v.f38772a;
                        h.g.b.x.f(bVar5, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i13 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar5 = (com.waze.sharedrive.b.a) bVar5.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        ac acVar = (ac) bVar5.a(new h.g.b.m(ac.class), null, null);
                        com.waze.sharedrive.c.q qVar = (com.waze.sharedrive.c.q) bVar5.a(new h.g.b.m(com.waze.sharedrive.c.q.class), null, null);
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("ShareDriveApi");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.sharedrive.c.e(aVar5, acVar, qVar, eVarD4);
                    case 5:
                        int i14 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.b.a();
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i15 = v.f38772a;
                        h.g.b.x.f(bVar6, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar6 = (com.waze.sharedrive.b.a) bVar6.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.c.e eVar22 = (com.waze.sharedrive.c.e) bVar6.a(new h.g.b.m(com.waze.sharedrive.c.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("ShareDriveService");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new com.waze.sharedrive.c.s(aVar6, eVar22, eVarD5);
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i17 = v.f38772a;
                        h.g.b.x.f(bVar7, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar7 = (com.waze.sharedrive.d.a) bVar7.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("EtaDrawerShareButtonStateHolder");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new com.waze.sharedrive.e.j(aVar7, eVarD6);
                    case 8:
                        int i19 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new au(bArr);
                    case 9:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i20 = v.f38772a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i21 = ar.f48106a;
                        com.waze.sharedrive.c.s sVar = (com.waze.sharedrive.c.s) bVar8.a(new h.g.b.m(com.waze.sharedrive.c.s.class), null, null);
                        com.waze.sharedrive.b.a aVar8 = (com.waze.sharedrive.b.a) bVar8.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        dg dgVar2 = (dg) bVar8.a(new h.g.b.m(dg.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar8.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        h.c.j jVarPlus = av.a().plus(aj.Q());
                        com.waze.sharedui.profile.b bVar9 = (com.waze.sharedui.profile.b) bVar8.a(new h.g.b.m(com.waze.sharedui.profile.b.class), null, null);
                        com.waze.location.b.d dVar2 = (com.waze.location.b.d) bVar8.a(new h.g.b.m(com.waze.location.b.d.class), null, new com.waze.settings.ao(8));
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("ShareDriveController");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sharedrive.d.b(aVar8, sVar, dgVar2, gVar, bVar9, jVarPlus, dVar2, eVarD7);
                    case 10:
                        int i22 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new s(ShareDriveNativeManager.INSTANCE);
                    case 11:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i23 = v.f38772a;
                        h.g.b.x.f(bVar10, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i24 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar9 = (com.waze.sharedrive.d.a) bVar10.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        com.waze.main_screen.p.b.a.b.c cVar2 = (com.waze.main_screen.p.b.a.b.c) bVar10.a(new h.g.b.m(com.waze.main_screen.p.b.a.b.c.class), null, null);
                        com.waze.main_screen.l.b.e eVar222 = (com.waze.main_screen.l.b.e) bVar10.a(new h.g.b.m(com.waze.main_screen.l.b.e.class), null, null);
                        com.waze.sharedrive.e.w wVar = (com.waze.sharedrive.e.w) bVar10.a(new h.g.b.m(com.waze.sharedrive.e.w.class), null, null);
                        cn cnVar = (cn) bVar10.a(new h.g.b.m(cn.class), null, null);
                        bo boVar = (bo) bVar10.a(new h.g.b.m(bo.class), null, null);
                        bp bpVar = (bp) bVar10.a(new h.g.b.m(bp.class), null, null);
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("LiveShareDriveViewModel");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new at(aVar9, wVar, enVar, cVar2, eVar222, cnVar, boVar, bpVar, eVarD8);
                    case 12:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i25 = v.f38772a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar10 = (com.waze.sharedrive.d.a) bVar11.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        s sVar2 = (s) bVar11.a(new h.g.b.m(s.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("ShareDriveMapIndicationStateHolder");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new bq(aVar10, sVar2, eVarD9);
                    case 13:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i27 = v.f38772a;
                        h.g.b.x.f(bVar12, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar12);
                        int i28 = av.f51370a;
                        cj cjVar = kotlinx.coroutines.e.ac.f51860a;
                        AsyncLayoutInflater asyncLayoutInflater = new AsyncLayoutInflater(k.a.k.h(bVar12));
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("ViewBitmapRenderer");
                        h.g.b.x.e(eVarD10, "create(...)");
                        return new cr(contextH, cjVar, asyncLayoutInflater, eVarD10);
                    case 14:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i29 = v.f38772a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.e.p(k.a.k.h(bVar13), av.b());
                    case 15:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = v.f38772a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = ar.f48106a;
                        co coVar = (co) bVar14.a(new h.g.b.m(co.class), null, null);
                        com.waze.sharedrive.e.a aVar11 = (com.waze.sharedrive.e.a) bVar14.a(new h.g.b.m(com.waze.sharedrive.e.a.class), null, null);
                        MoodManager moodManager = (MoodManager) bVar14.a(new h.g.b.m(MoodManager.class), null, null);
                        kotlinx.coroutines.ab abVarB = av.b();
                        com.waze.shared_infra.i.e eVarD11 = com.waze.shared_infra.i.a.d("ParticipantPinRenderer");
                        h.g.b.x.e(eVarD11, "create(...)");
                        return new bc(coVar, aVar11, moodManager, abVarB, eVarD11, h.o.g.f48282a);
                    case 16:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = v.f38772a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = ar.f48106a;
                        ai aiVar = (ai) bVar15.a(new h.g.b.m(ai.class), null, null);
                        com.waze.map.b.cj cjVar2 = (com.waze.map.b.cj) bVar15.a(new h.g.b.m(com.waze.map.b.cj.class), null, null);
                        com.waze.sharedrive.d.a aVar12 = (com.waze.sharedrive.d.a) bVar15.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.sharedrive.e.av avVar = (com.waze.sharedrive.e.av) bVar15.a(new h.g.b.m(com.waze.sharedrive.e.av.class), null, null);
                        com.waze.shared_infra.i.e eVarD12 = com.waze.shared_infra.i.a.d("LiveDriveMapStateHolder");
                        h.g.b.x.e(eVarD12, "create(...)");
                        return new com.waze.sharedrive.e.x(aiVar, cjVar2, aVar12, avVar, eVarD12);
                    case 17:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = v.f38772a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = ar.f48106a;
                        return new cn((MoodManager) bVar16.a(new h.g.b.m(MoodManager.class), null, null), (com.waze.shared_infra.q.j) bVar16.a(new h.g.b.m(com.waze.shared_infra.q.j.class), null, null));
                    case 18:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = v.f38772a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar13 = (com.waze.sharedrive.d.a) bVar17.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar2 = (cn) bVar17.a(new h.g.b.m(cn.class), null, null);
                        com.waze.mywaze.n nVar = (com.waze.mywaze.n) bVar17.a(new h.g.b.m(com.waze.mywaze.n.class), null, null);
                        com.waze.shared_infra.i.e eVarD13 = com.waze.shared_infra.i.a.d("CreateSharePreviewStateHolder");
                        h.g.b.x.e(eVarD13, "create(...)");
                        return new com.waze.sharedrive.e.e(aVar13, cnVar2, nVar, eVarD13);
                    case 19:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = v.f38772a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar14 = (com.waze.sharedrive.d.a) bVar18.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar3 = (cn) bVar18.a(new h.g.b.m(cn.class), null, null);
                        com.waze.shared_infra.i.e eVarD14 = com.waze.shared_infra.i.a.d("JoinSharePreviewStateHolder");
                        h.g.b.x.e(eVarD14, "create(...)");
                        return new com.waze.sharedrive.e.q(aVar14, cnVar3, eVarD14);
                    default:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = v.f38772a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = ar.f48106a;
                        com.waze.sharedrive.e.e eVar3 = (com.waze.sharedrive.e.e) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.e.class), null, null);
                        com.waze.sharedrive.e.q qVar2 = (com.waze.sharedrive.e.q) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.q.class), null, null);
                        com.waze.sharedrive.d.a aVar15 = (com.waze.sharedrive.d.a) bVar19.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD15 = com.waze.shared_infra.i.a.d("ShareDriveStateHolder");
                        h.g.b.x.e(eVarD15, "create(...)");
                        return new bw(eVar3, qVar2, aVar15, eVarD15);
                }
            }
        };
        org.a.d.e.e eVar3 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.sharedrive.c.e.class), null, pVar3, cVar, h.a.i.h()));
        aVar.f(eVar3);
        new org.a.d.c.d(aVar, eVar3);
        final int i7 = 5;
        h.g.a.p pVar4 = new h.g.a.p() { // from class: com.waze.sharedrive.t
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                byte[] bArr = null;
                switch (i7) {
                    case 0:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i42 = v.f38772a;
                        h.g.b.x.f(bVar2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i52 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar2 = (com.waze.sharedrive.d.a) bVar2.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ShareDriveDeeplinkReceiver");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new as(aVar2, eVarD);
                    case 1:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i62 = v.f38772a;
                        h.g.b.x.f(bVar22, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i72 = ar.f48106a;
                        com.waze.map.d dVar = (com.waze.map.d) bVar22.a(new h.g.b.m(com.waze.map.d.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("ShareDriveDataConverter");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.sharedrive.c.q(dVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i8 = v.f38772a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i9 = ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar3.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar = e.a.h.f47759a;
                        h.g.b.x.e(hVar, "DEFAULT");
                        return new ac(iVarB, hVar);
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i10 = v.f38772a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i11 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar3 = (com.waze.sharedrive.b.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.d.a aVar4 = (com.waze.sharedrive.d.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        ao aoVar = (ao) bVar4.a(new h.g.b.m(ao.class), null, null);
                        dg dgVar = (dg) bVar4.a(new h.g.b.m(dg.class), null, null);
                        af afVarE = aj.e(av.a().plus(aj.Q()));
                        com.waze.sharedrive.e.i iVar = com.waze.sharedrive.e.i.f38533a;
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("ShareDriveInterceptor");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new bf(aVar3, aVar4, aoVar, dgVar, afVarE, iVar, eVarD3);
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i12 = v.f38772a;
                        h.g.b.x.f(bVar5, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i13 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar5 = (com.waze.sharedrive.b.a) bVar5.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        ac acVar = (ac) bVar5.a(new h.g.b.m(ac.class), null, null);
                        com.waze.sharedrive.c.q qVar = (com.waze.sharedrive.c.q) bVar5.a(new h.g.b.m(com.waze.sharedrive.c.q.class), null, null);
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("ShareDriveApi");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.sharedrive.c.e(aVar5, acVar, qVar, eVarD4);
                    case 5:
                        int i14 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.b.a();
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i15 = v.f38772a;
                        h.g.b.x.f(bVar6, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar6 = (com.waze.sharedrive.b.a) bVar6.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.c.e eVar22 = (com.waze.sharedrive.c.e) bVar6.a(new h.g.b.m(com.waze.sharedrive.c.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("ShareDriveService");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new com.waze.sharedrive.c.s(aVar6, eVar22, eVarD5);
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i17 = v.f38772a;
                        h.g.b.x.f(bVar7, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar7 = (com.waze.sharedrive.d.a) bVar7.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("EtaDrawerShareButtonStateHolder");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new com.waze.sharedrive.e.j(aVar7, eVarD6);
                    case 8:
                        int i19 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new au(bArr);
                    case 9:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i20 = v.f38772a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i21 = ar.f48106a;
                        com.waze.sharedrive.c.s sVar = (com.waze.sharedrive.c.s) bVar8.a(new h.g.b.m(com.waze.sharedrive.c.s.class), null, null);
                        com.waze.sharedrive.b.a aVar8 = (com.waze.sharedrive.b.a) bVar8.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        dg dgVar2 = (dg) bVar8.a(new h.g.b.m(dg.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar8.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        h.c.j jVarPlus = av.a().plus(aj.Q());
                        com.waze.sharedui.profile.b bVar9 = (com.waze.sharedui.profile.b) bVar8.a(new h.g.b.m(com.waze.sharedui.profile.b.class), null, null);
                        com.waze.location.b.d dVar2 = (com.waze.location.b.d) bVar8.a(new h.g.b.m(com.waze.location.b.d.class), null, new com.waze.settings.ao(8));
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("ShareDriveController");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sharedrive.d.b(aVar8, sVar, dgVar2, gVar, bVar9, jVarPlus, dVar2, eVarD7);
                    case 10:
                        int i22 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new s(ShareDriveNativeManager.INSTANCE);
                    case 11:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i23 = v.f38772a;
                        h.g.b.x.f(bVar10, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i24 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar9 = (com.waze.sharedrive.d.a) bVar10.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        com.waze.main_screen.p.b.a.b.c cVar2 = (com.waze.main_screen.p.b.a.b.c) bVar10.a(new h.g.b.m(com.waze.main_screen.p.b.a.b.c.class), null, null);
                        com.waze.main_screen.l.b.e eVar222 = (com.waze.main_screen.l.b.e) bVar10.a(new h.g.b.m(com.waze.main_screen.l.b.e.class), null, null);
                        com.waze.sharedrive.e.w wVar = (com.waze.sharedrive.e.w) bVar10.a(new h.g.b.m(com.waze.sharedrive.e.w.class), null, null);
                        cn cnVar = (cn) bVar10.a(new h.g.b.m(cn.class), null, null);
                        bo boVar = (bo) bVar10.a(new h.g.b.m(bo.class), null, null);
                        bp bpVar = (bp) bVar10.a(new h.g.b.m(bp.class), null, null);
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("LiveShareDriveViewModel");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new at(aVar9, wVar, enVar, cVar2, eVar222, cnVar, boVar, bpVar, eVarD8);
                    case 12:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i25 = v.f38772a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar10 = (com.waze.sharedrive.d.a) bVar11.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        s sVar2 = (s) bVar11.a(new h.g.b.m(s.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("ShareDriveMapIndicationStateHolder");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new bq(aVar10, sVar2, eVarD9);
                    case 13:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i27 = v.f38772a;
                        h.g.b.x.f(bVar12, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar12);
                        int i28 = av.f51370a;
                        cj cjVar = kotlinx.coroutines.e.ac.f51860a;
                        AsyncLayoutInflater asyncLayoutInflater = new AsyncLayoutInflater(k.a.k.h(bVar12));
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("ViewBitmapRenderer");
                        h.g.b.x.e(eVarD10, "create(...)");
                        return new cr(contextH, cjVar, asyncLayoutInflater, eVarD10);
                    case 14:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i29 = v.f38772a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.e.p(k.a.k.h(bVar13), av.b());
                    case 15:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = v.f38772a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = ar.f48106a;
                        co coVar = (co) bVar14.a(new h.g.b.m(co.class), null, null);
                        com.waze.sharedrive.e.a aVar11 = (com.waze.sharedrive.e.a) bVar14.a(new h.g.b.m(com.waze.sharedrive.e.a.class), null, null);
                        MoodManager moodManager = (MoodManager) bVar14.a(new h.g.b.m(MoodManager.class), null, null);
                        kotlinx.coroutines.ab abVarB = av.b();
                        com.waze.shared_infra.i.e eVarD11 = com.waze.shared_infra.i.a.d("ParticipantPinRenderer");
                        h.g.b.x.e(eVarD11, "create(...)");
                        return new bc(coVar, aVar11, moodManager, abVarB, eVarD11, h.o.g.f48282a);
                    case 16:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = v.f38772a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = ar.f48106a;
                        ai aiVar = (ai) bVar15.a(new h.g.b.m(ai.class), null, null);
                        com.waze.map.b.cj cjVar2 = (com.waze.map.b.cj) bVar15.a(new h.g.b.m(com.waze.map.b.cj.class), null, null);
                        com.waze.sharedrive.d.a aVar12 = (com.waze.sharedrive.d.a) bVar15.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.sharedrive.e.av avVar = (com.waze.sharedrive.e.av) bVar15.a(new h.g.b.m(com.waze.sharedrive.e.av.class), null, null);
                        com.waze.shared_infra.i.e eVarD12 = com.waze.shared_infra.i.a.d("LiveDriveMapStateHolder");
                        h.g.b.x.e(eVarD12, "create(...)");
                        return new com.waze.sharedrive.e.x(aiVar, cjVar2, aVar12, avVar, eVarD12);
                    case 17:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = v.f38772a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = ar.f48106a;
                        return new cn((MoodManager) bVar16.a(new h.g.b.m(MoodManager.class), null, null), (com.waze.shared_infra.q.j) bVar16.a(new h.g.b.m(com.waze.shared_infra.q.j.class), null, null));
                    case 18:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = v.f38772a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar13 = (com.waze.sharedrive.d.a) bVar17.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar2 = (cn) bVar17.a(new h.g.b.m(cn.class), null, null);
                        com.waze.mywaze.n nVar = (com.waze.mywaze.n) bVar17.a(new h.g.b.m(com.waze.mywaze.n.class), null, null);
                        com.waze.shared_infra.i.e eVarD13 = com.waze.shared_infra.i.a.d("CreateSharePreviewStateHolder");
                        h.g.b.x.e(eVarD13, "create(...)");
                        return new com.waze.sharedrive.e.e(aVar13, cnVar2, nVar, eVarD13);
                    case 19:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = v.f38772a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar14 = (com.waze.sharedrive.d.a) bVar18.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar3 = (cn) bVar18.a(new h.g.b.m(cn.class), null, null);
                        com.waze.shared_infra.i.e eVarD14 = com.waze.shared_infra.i.a.d("JoinSharePreviewStateHolder");
                        h.g.b.x.e(eVarD14, "create(...)");
                        return new com.waze.sharedrive.e.q(aVar14, cnVar3, eVarD14);
                    default:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = v.f38772a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = ar.f48106a;
                        com.waze.sharedrive.e.e eVar32 = (com.waze.sharedrive.e.e) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.e.class), null, null);
                        com.waze.sharedrive.e.q qVar2 = (com.waze.sharedrive.e.q) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.q.class), null, null);
                        com.waze.sharedrive.d.a aVar15 = (com.waze.sharedrive.d.a) bVar19.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD15 = com.waze.shared_infra.i.a.d("ShareDriveStateHolder");
                        h.g.b.x.e(eVarD15, "create(...)");
                        return new bw(eVar32, qVar2, aVar15, eVarD15);
                }
            }
        };
        org.a.d.e.e eVar4 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.sharedrive.b.a.class), null, pVar4, cVar, h.a.i.h()));
        aVar.f(eVar4);
        new org.a.d.c.d(aVar, eVar4);
        final int i8 = 6;
        h.g.a.p pVar5 = new h.g.a.p() { // from class: com.waze.sharedrive.t
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                byte[] bArr = null;
                switch (i8) {
                    case 0:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i42 = v.f38772a;
                        h.g.b.x.f(bVar2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i52 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar2 = (com.waze.sharedrive.d.a) bVar2.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ShareDriveDeeplinkReceiver");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new as(aVar2, eVarD);
                    case 1:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i62 = v.f38772a;
                        h.g.b.x.f(bVar22, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i72 = ar.f48106a;
                        com.waze.map.d dVar = (com.waze.map.d) bVar22.a(new h.g.b.m(com.waze.map.d.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("ShareDriveDataConverter");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.sharedrive.c.q(dVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i82 = v.f38772a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i9 = ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar3.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar = e.a.h.f47759a;
                        h.g.b.x.e(hVar, "DEFAULT");
                        return new ac(iVarB, hVar);
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i10 = v.f38772a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i11 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar3 = (com.waze.sharedrive.b.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.d.a aVar4 = (com.waze.sharedrive.d.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        ao aoVar = (ao) bVar4.a(new h.g.b.m(ao.class), null, null);
                        dg dgVar = (dg) bVar4.a(new h.g.b.m(dg.class), null, null);
                        af afVarE = aj.e(av.a().plus(aj.Q()));
                        com.waze.sharedrive.e.i iVar = com.waze.sharedrive.e.i.f38533a;
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("ShareDriveInterceptor");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new bf(aVar3, aVar4, aoVar, dgVar, afVarE, iVar, eVarD3);
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i12 = v.f38772a;
                        h.g.b.x.f(bVar5, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i13 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar5 = (com.waze.sharedrive.b.a) bVar5.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        ac acVar = (ac) bVar5.a(new h.g.b.m(ac.class), null, null);
                        com.waze.sharedrive.c.q qVar = (com.waze.sharedrive.c.q) bVar5.a(new h.g.b.m(com.waze.sharedrive.c.q.class), null, null);
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("ShareDriveApi");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.sharedrive.c.e(aVar5, acVar, qVar, eVarD4);
                    case 5:
                        int i14 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.b.a();
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i15 = v.f38772a;
                        h.g.b.x.f(bVar6, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar6 = (com.waze.sharedrive.b.a) bVar6.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.c.e eVar22 = (com.waze.sharedrive.c.e) bVar6.a(new h.g.b.m(com.waze.sharedrive.c.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("ShareDriveService");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new com.waze.sharedrive.c.s(aVar6, eVar22, eVarD5);
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i17 = v.f38772a;
                        h.g.b.x.f(bVar7, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar7 = (com.waze.sharedrive.d.a) bVar7.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("EtaDrawerShareButtonStateHolder");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new com.waze.sharedrive.e.j(aVar7, eVarD6);
                    case 8:
                        int i19 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new au(bArr);
                    case 9:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i20 = v.f38772a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i21 = ar.f48106a;
                        com.waze.sharedrive.c.s sVar = (com.waze.sharedrive.c.s) bVar8.a(new h.g.b.m(com.waze.sharedrive.c.s.class), null, null);
                        com.waze.sharedrive.b.a aVar8 = (com.waze.sharedrive.b.a) bVar8.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        dg dgVar2 = (dg) bVar8.a(new h.g.b.m(dg.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar8.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        h.c.j jVarPlus = av.a().plus(aj.Q());
                        com.waze.sharedui.profile.b bVar9 = (com.waze.sharedui.profile.b) bVar8.a(new h.g.b.m(com.waze.sharedui.profile.b.class), null, null);
                        com.waze.location.b.d dVar2 = (com.waze.location.b.d) bVar8.a(new h.g.b.m(com.waze.location.b.d.class), null, new com.waze.settings.ao(8));
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("ShareDriveController");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sharedrive.d.b(aVar8, sVar, dgVar2, gVar, bVar9, jVarPlus, dVar2, eVarD7);
                    case 10:
                        int i22 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new s(ShareDriveNativeManager.INSTANCE);
                    case 11:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i23 = v.f38772a;
                        h.g.b.x.f(bVar10, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i24 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar9 = (com.waze.sharedrive.d.a) bVar10.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        com.waze.main_screen.p.b.a.b.c cVar2 = (com.waze.main_screen.p.b.a.b.c) bVar10.a(new h.g.b.m(com.waze.main_screen.p.b.a.b.c.class), null, null);
                        com.waze.main_screen.l.b.e eVar222 = (com.waze.main_screen.l.b.e) bVar10.a(new h.g.b.m(com.waze.main_screen.l.b.e.class), null, null);
                        com.waze.sharedrive.e.w wVar = (com.waze.sharedrive.e.w) bVar10.a(new h.g.b.m(com.waze.sharedrive.e.w.class), null, null);
                        cn cnVar = (cn) bVar10.a(new h.g.b.m(cn.class), null, null);
                        bo boVar = (bo) bVar10.a(new h.g.b.m(bo.class), null, null);
                        bp bpVar = (bp) bVar10.a(new h.g.b.m(bp.class), null, null);
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("LiveShareDriveViewModel");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new at(aVar9, wVar, enVar, cVar2, eVar222, cnVar, boVar, bpVar, eVarD8);
                    case 12:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i25 = v.f38772a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar10 = (com.waze.sharedrive.d.a) bVar11.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        s sVar2 = (s) bVar11.a(new h.g.b.m(s.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("ShareDriveMapIndicationStateHolder");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new bq(aVar10, sVar2, eVarD9);
                    case 13:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i27 = v.f38772a;
                        h.g.b.x.f(bVar12, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar12);
                        int i28 = av.f51370a;
                        cj cjVar = kotlinx.coroutines.e.ac.f51860a;
                        AsyncLayoutInflater asyncLayoutInflater = new AsyncLayoutInflater(k.a.k.h(bVar12));
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("ViewBitmapRenderer");
                        h.g.b.x.e(eVarD10, "create(...)");
                        return new cr(contextH, cjVar, asyncLayoutInflater, eVarD10);
                    case 14:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i29 = v.f38772a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.e.p(k.a.k.h(bVar13), av.b());
                    case 15:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = v.f38772a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = ar.f48106a;
                        co coVar = (co) bVar14.a(new h.g.b.m(co.class), null, null);
                        com.waze.sharedrive.e.a aVar11 = (com.waze.sharedrive.e.a) bVar14.a(new h.g.b.m(com.waze.sharedrive.e.a.class), null, null);
                        MoodManager moodManager = (MoodManager) bVar14.a(new h.g.b.m(MoodManager.class), null, null);
                        kotlinx.coroutines.ab abVarB = av.b();
                        com.waze.shared_infra.i.e eVarD11 = com.waze.shared_infra.i.a.d("ParticipantPinRenderer");
                        h.g.b.x.e(eVarD11, "create(...)");
                        return new bc(coVar, aVar11, moodManager, abVarB, eVarD11, h.o.g.f48282a);
                    case 16:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = v.f38772a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = ar.f48106a;
                        ai aiVar = (ai) bVar15.a(new h.g.b.m(ai.class), null, null);
                        com.waze.map.b.cj cjVar2 = (com.waze.map.b.cj) bVar15.a(new h.g.b.m(com.waze.map.b.cj.class), null, null);
                        com.waze.sharedrive.d.a aVar12 = (com.waze.sharedrive.d.a) bVar15.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.sharedrive.e.av avVar = (com.waze.sharedrive.e.av) bVar15.a(new h.g.b.m(com.waze.sharedrive.e.av.class), null, null);
                        com.waze.shared_infra.i.e eVarD12 = com.waze.shared_infra.i.a.d("LiveDriveMapStateHolder");
                        h.g.b.x.e(eVarD12, "create(...)");
                        return new com.waze.sharedrive.e.x(aiVar, cjVar2, aVar12, avVar, eVarD12);
                    case 17:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = v.f38772a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = ar.f48106a;
                        return new cn((MoodManager) bVar16.a(new h.g.b.m(MoodManager.class), null, null), (com.waze.shared_infra.q.j) bVar16.a(new h.g.b.m(com.waze.shared_infra.q.j.class), null, null));
                    case 18:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = v.f38772a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar13 = (com.waze.sharedrive.d.a) bVar17.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar2 = (cn) bVar17.a(new h.g.b.m(cn.class), null, null);
                        com.waze.mywaze.n nVar = (com.waze.mywaze.n) bVar17.a(new h.g.b.m(com.waze.mywaze.n.class), null, null);
                        com.waze.shared_infra.i.e eVarD13 = com.waze.shared_infra.i.a.d("CreateSharePreviewStateHolder");
                        h.g.b.x.e(eVarD13, "create(...)");
                        return new com.waze.sharedrive.e.e(aVar13, cnVar2, nVar, eVarD13);
                    case 19:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = v.f38772a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar14 = (com.waze.sharedrive.d.a) bVar18.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar3 = (cn) bVar18.a(new h.g.b.m(cn.class), null, null);
                        com.waze.shared_infra.i.e eVarD14 = com.waze.shared_infra.i.a.d("JoinSharePreviewStateHolder");
                        h.g.b.x.e(eVarD14, "create(...)");
                        return new com.waze.sharedrive.e.q(aVar14, cnVar3, eVarD14);
                    default:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = v.f38772a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = ar.f48106a;
                        com.waze.sharedrive.e.e eVar32 = (com.waze.sharedrive.e.e) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.e.class), null, null);
                        com.waze.sharedrive.e.q qVar2 = (com.waze.sharedrive.e.q) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.q.class), null, null);
                        com.waze.sharedrive.d.a aVar15 = (com.waze.sharedrive.d.a) bVar19.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD15 = com.waze.shared_infra.i.a.d("ShareDriveStateHolder");
                        h.g.b.x.e(eVarD15, "create(...)");
                        return new bw(eVar32, qVar2, aVar15, eVarD15);
                }
            }
        };
        org.a.d.e.e eVar5 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.sharedrive.c.s.class), null, pVar5, cVar, h.a.i.h()));
        aVar.f(eVar5);
        new org.a.d.c.d(aVar, eVar5);
        final int i9 = 7;
        h.g.a.p pVar6 = new h.g.a.p() { // from class: com.waze.sharedrive.t
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                byte[] bArr = null;
                switch (i9) {
                    case 0:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i42 = v.f38772a;
                        h.g.b.x.f(bVar2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i52 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar2 = (com.waze.sharedrive.d.a) bVar2.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ShareDriveDeeplinkReceiver");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new as(aVar2, eVarD);
                    case 1:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i62 = v.f38772a;
                        h.g.b.x.f(bVar22, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i72 = ar.f48106a;
                        com.waze.map.d dVar = (com.waze.map.d) bVar22.a(new h.g.b.m(com.waze.map.d.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("ShareDriveDataConverter");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.sharedrive.c.q(dVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i82 = v.f38772a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i92 = ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar3.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar = e.a.h.f47759a;
                        h.g.b.x.e(hVar, "DEFAULT");
                        return new ac(iVarB, hVar);
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i10 = v.f38772a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i11 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar3 = (com.waze.sharedrive.b.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.d.a aVar4 = (com.waze.sharedrive.d.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        ao aoVar = (ao) bVar4.a(new h.g.b.m(ao.class), null, null);
                        dg dgVar = (dg) bVar4.a(new h.g.b.m(dg.class), null, null);
                        af afVarE = aj.e(av.a().plus(aj.Q()));
                        com.waze.sharedrive.e.i iVar = com.waze.sharedrive.e.i.f38533a;
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("ShareDriveInterceptor");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new bf(aVar3, aVar4, aoVar, dgVar, afVarE, iVar, eVarD3);
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i12 = v.f38772a;
                        h.g.b.x.f(bVar5, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i13 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar5 = (com.waze.sharedrive.b.a) bVar5.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        ac acVar = (ac) bVar5.a(new h.g.b.m(ac.class), null, null);
                        com.waze.sharedrive.c.q qVar = (com.waze.sharedrive.c.q) bVar5.a(new h.g.b.m(com.waze.sharedrive.c.q.class), null, null);
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("ShareDriveApi");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.sharedrive.c.e(aVar5, acVar, qVar, eVarD4);
                    case 5:
                        int i14 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.b.a();
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i15 = v.f38772a;
                        h.g.b.x.f(bVar6, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar6 = (com.waze.sharedrive.b.a) bVar6.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.c.e eVar22 = (com.waze.sharedrive.c.e) bVar6.a(new h.g.b.m(com.waze.sharedrive.c.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("ShareDriveService");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new com.waze.sharedrive.c.s(aVar6, eVar22, eVarD5);
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i17 = v.f38772a;
                        h.g.b.x.f(bVar7, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar7 = (com.waze.sharedrive.d.a) bVar7.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("EtaDrawerShareButtonStateHolder");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new com.waze.sharedrive.e.j(aVar7, eVarD6);
                    case 8:
                        int i19 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new au(bArr);
                    case 9:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i20 = v.f38772a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i21 = ar.f48106a;
                        com.waze.sharedrive.c.s sVar = (com.waze.sharedrive.c.s) bVar8.a(new h.g.b.m(com.waze.sharedrive.c.s.class), null, null);
                        com.waze.sharedrive.b.a aVar8 = (com.waze.sharedrive.b.a) bVar8.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        dg dgVar2 = (dg) bVar8.a(new h.g.b.m(dg.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar8.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        h.c.j jVarPlus = av.a().plus(aj.Q());
                        com.waze.sharedui.profile.b bVar9 = (com.waze.sharedui.profile.b) bVar8.a(new h.g.b.m(com.waze.sharedui.profile.b.class), null, null);
                        com.waze.location.b.d dVar2 = (com.waze.location.b.d) bVar8.a(new h.g.b.m(com.waze.location.b.d.class), null, new com.waze.settings.ao(8));
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("ShareDriveController");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sharedrive.d.b(aVar8, sVar, dgVar2, gVar, bVar9, jVarPlus, dVar2, eVarD7);
                    case 10:
                        int i22 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new s(ShareDriveNativeManager.INSTANCE);
                    case 11:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i23 = v.f38772a;
                        h.g.b.x.f(bVar10, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i24 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar9 = (com.waze.sharedrive.d.a) bVar10.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        com.waze.main_screen.p.b.a.b.c cVar2 = (com.waze.main_screen.p.b.a.b.c) bVar10.a(new h.g.b.m(com.waze.main_screen.p.b.a.b.c.class), null, null);
                        com.waze.main_screen.l.b.e eVar222 = (com.waze.main_screen.l.b.e) bVar10.a(new h.g.b.m(com.waze.main_screen.l.b.e.class), null, null);
                        com.waze.sharedrive.e.w wVar = (com.waze.sharedrive.e.w) bVar10.a(new h.g.b.m(com.waze.sharedrive.e.w.class), null, null);
                        cn cnVar = (cn) bVar10.a(new h.g.b.m(cn.class), null, null);
                        bo boVar = (bo) bVar10.a(new h.g.b.m(bo.class), null, null);
                        bp bpVar = (bp) bVar10.a(new h.g.b.m(bp.class), null, null);
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("LiveShareDriveViewModel");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new at(aVar9, wVar, enVar, cVar2, eVar222, cnVar, boVar, bpVar, eVarD8);
                    case 12:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i25 = v.f38772a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar10 = (com.waze.sharedrive.d.a) bVar11.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        s sVar2 = (s) bVar11.a(new h.g.b.m(s.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("ShareDriveMapIndicationStateHolder");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new bq(aVar10, sVar2, eVarD9);
                    case 13:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i27 = v.f38772a;
                        h.g.b.x.f(bVar12, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar12);
                        int i28 = av.f51370a;
                        cj cjVar = kotlinx.coroutines.e.ac.f51860a;
                        AsyncLayoutInflater asyncLayoutInflater = new AsyncLayoutInflater(k.a.k.h(bVar12));
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("ViewBitmapRenderer");
                        h.g.b.x.e(eVarD10, "create(...)");
                        return new cr(contextH, cjVar, asyncLayoutInflater, eVarD10);
                    case 14:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i29 = v.f38772a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.e.p(k.a.k.h(bVar13), av.b());
                    case 15:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = v.f38772a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = ar.f48106a;
                        co coVar = (co) bVar14.a(new h.g.b.m(co.class), null, null);
                        com.waze.sharedrive.e.a aVar11 = (com.waze.sharedrive.e.a) bVar14.a(new h.g.b.m(com.waze.sharedrive.e.a.class), null, null);
                        MoodManager moodManager = (MoodManager) bVar14.a(new h.g.b.m(MoodManager.class), null, null);
                        kotlinx.coroutines.ab abVarB = av.b();
                        com.waze.shared_infra.i.e eVarD11 = com.waze.shared_infra.i.a.d("ParticipantPinRenderer");
                        h.g.b.x.e(eVarD11, "create(...)");
                        return new bc(coVar, aVar11, moodManager, abVarB, eVarD11, h.o.g.f48282a);
                    case 16:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = v.f38772a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = ar.f48106a;
                        ai aiVar = (ai) bVar15.a(new h.g.b.m(ai.class), null, null);
                        com.waze.map.b.cj cjVar2 = (com.waze.map.b.cj) bVar15.a(new h.g.b.m(com.waze.map.b.cj.class), null, null);
                        com.waze.sharedrive.d.a aVar12 = (com.waze.sharedrive.d.a) bVar15.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.sharedrive.e.av avVar = (com.waze.sharedrive.e.av) bVar15.a(new h.g.b.m(com.waze.sharedrive.e.av.class), null, null);
                        com.waze.shared_infra.i.e eVarD12 = com.waze.shared_infra.i.a.d("LiveDriveMapStateHolder");
                        h.g.b.x.e(eVarD12, "create(...)");
                        return new com.waze.sharedrive.e.x(aiVar, cjVar2, aVar12, avVar, eVarD12);
                    case 17:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = v.f38772a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = ar.f48106a;
                        return new cn((MoodManager) bVar16.a(new h.g.b.m(MoodManager.class), null, null), (com.waze.shared_infra.q.j) bVar16.a(new h.g.b.m(com.waze.shared_infra.q.j.class), null, null));
                    case 18:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = v.f38772a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar13 = (com.waze.sharedrive.d.a) bVar17.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar2 = (cn) bVar17.a(new h.g.b.m(cn.class), null, null);
                        com.waze.mywaze.n nVar = (com.waze.mywaze.n) bVar17.a(new h.g.b.m(com.waze.mywaze.n.class), null, null);
                        com.waze.shared_infra.i.e eVarD13 = com.waze.shared_infra.i.a.d("CreateSharePreviewStateHolder");
                        h.g.b.x.e(eVarD13, "create(...)");
                        return new com.waze.sharedrive.e.e(aVar13, cnVar2, nVar, eVarD13);
                    case 19:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = v.f38772a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar14 = (com.waze.sharedrive.d.a) bVar18.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar3 = (cn) bVar18.a(new h.g.b.m(cn.class), null, null);
                        com.waze.shared_infra.i.e eVarD14 = com.waze.shared_infra.i.a.d("JoinSharePreviewStateHolder");
                        h.g.b.x.e(eVarD14, "create(...)");
                        return new com.waze.sharedrive.e.q(aVar14, cnVar3, eVarD14);
                    default:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = v.f38772a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = ar.f48106a;
                        com.waze.sharedrive.e.e eVar32 = (com.waze.sharedrive.e.e) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.e.class), null, null);
                        com.waze.sharedrive.e.q qVar2 = (com.waze.sharedrive.e.q) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.q.class), null, null);
                        com.waze.sharedrive.d.a aVar15 = (com.waze.sharedrive.d.a) bVar19.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD15 = com.waze.shared_infra.i.a.d("ShareDriveStateHolder");
                        h.g.b.x.e(eVarD15, "create(...)");
                        return new bw(eVar32, qVar2, aVar15, eVarD15);
                }
            }
        };
        org.a.d.e.e eVar6 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.sharedrive.e.j.class), null, pVar6, cVar, h.a.i.h()));
        aVar.f(eVar6);
        new org.a.d.c.d(aVar, eVar6);
        final int i10 = 8;
        h.g.a.p pVar7 = new h.g.a.p() { // from class: com.waze.sharedrive.t
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                byte[] bArr = null;
                switch (i10) {
                    case 0:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i42 = v.f38772a;
                        h.g.b.x.f(bVar2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i52 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar2 = (com.waze.sharedrive.d.a) bVar2.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ShareDriveDeeplinkReceiver");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new as(aVar2, eVarD);
                    case 1:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i62 = v.f38772a;
                        h.g.b.x.f(bVar22, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i72 = ar.f48106a;
                        com.waze.map.d dVar = (com.waze.map.d) bVar22.a(new h.g.b.m(com.waze.map.d.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("ShareDriveDataConverter");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.sharedrive.c.q(dVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i82 = v.f38772a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i92 = ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar3.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar = e.a.h.f47759a;
                        h.g.b.x.e(hVar, "DEFAULT");
                        return new ac(iVarB, hVar);
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i102 = v.f38772a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i11 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar3 = (com.waze.sharedrive.b.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.d.a aVar4 = (com.waze.sharedrive.d.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        ao aoVar = (ao) bVar4.a(new h.g.b.m(ao.class), null, null);
                        dg dgVar = (dg) bVar4.a(new h.g.b.m(dg.class), null, null);
                        af afVarE = aj.e(av.a().plus(aj.Q()));
                        com.waze.sharedrive.e.i iVar = com.waze.sharedrive.e.i.f38533a;
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("ShareDriveInterceptor");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new bf(aVar3, aVar4, aoVar, dgVar, afVarE, iVar, eVarD3);
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i12 = v.f38772a;
                        h.g.b.x.f(bVar5, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i13 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar5 = (com.waze.sharedrive.b.a) bVar5.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        ac acVar = (ac) bVar5.a(new h.g.b.m(ac.class), null, null);
                        com.waze.sharedrive.c.q qVar = (com.waze.sharedrive.c.q) bVar5.a(new h.g.b.m(com.waze.sharedrive.c.q.class), null, null);
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("ShareDriveApi");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.sharedrive.c.e(aVar5, acVar, qVar, eVarD4);
                    case 5:
                        int i14 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.b.a();
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i15 = v.f38772a;
                        h.g.b.x.f(bVar6, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar6 = (com.waze.sharedrive.b.a) bVar6.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.c.e eVar22 = (com.waze.sharedrive.c.e) bVar6.a(new h.g.b.m(com.waze.sharedrive.c.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("ShareDriveService");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new com.waze.sharedrive.c.s(aVar6, eVar22, eVarD5);
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i17 = v.f38772a;
                        h.g.b.x.f(bVar7, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar7 = (com.waze.sharedrive.d.a) bVar7.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("EtaDrawerShareButtonStateHolder");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new com.waze.sharedrive.e.j(aVar7, eVarD6);
                    case 8:
                        int i19 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new au(bArr);
                    case 9:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i20 = v.f38772a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i21 = ar.f48106a;
                        com.waze.sharedrive.c.s sVar = (com.waze.sharedrive.c.s) bVar8.a(new h.g.b.m(com.waze.sharedrive.c.s.class), null, null);
                        com.waze.sharedrive.b.a aVar8 = (com.waze.sharedrive.b.a) bVar8.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        dg dgVar2 = (dg) bVar8.a(new h.g.b.m(dg.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar8.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        h.c.j jVarPlus = av.a().plus(aj.Q());
                        com.waze.sharedui.profile.b bVar9 = (com.waze.sharedui.profile.b) bVar8.a(new h.g.b.m(com.waze.sharedui.profile.b.class), null, null);
                        com.waze.location.b.d dVar2 = (com.waze.location.b.d) bVar8.a(new h.g.b.m(com.waze.location.b.d.class), null, new com.waze.settings.ao(8));
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("ShareDriveController");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sharedrive.d.b(aVar8, sVar, dgVar2, gVar, bVar9, jVarPlus, dVar2, eVarD7);
                    case 10:
                        int i22 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new s(ShareDriveNativeManager.INSTANCE);
                    case 11:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i23 = v.f38772a;
                        h.g.b.x.f(bVar10, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i24 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar9 = (com.waze.sharedrive.d.a) bVar10.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        com.waze.main_screen.p.b.a.b.c cVar2 = (com.waze.main_screen.p.b.a.b.c) bVar10.a(new h.g.b.m(com.waze.main_screen.p.b.a.b.c.class), null, null);
                        com.waze.main_screen.l.b.e eVar222 = (com.waze.main_screen.l.b.e) bVar10.a(new h.g.b.m(com.waze.main_screen.l.b.e.class), null, null);
                        com.waze.sharedrive.e.w wVar = (com.waze.sharedrive.e.w) bVar10.a(new h.g.b.m(com.waze.sharedrive.e.w.class), null, null);
                        cn cnVar = (cn) bVar10.a(new h.g.b.m(cn.class), null, null);
                        bo boVar = (bo) bVar10.a(new h.g.b.m(bo.class), null, null);
                        bp bpVar = (bp) bVar10.a(new h.g.b.m(bp.class), null, null);
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("LiveShareDriveViewModel");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new at(aVar9, wVar, enVar, cVar2, eVar222, cnVar, boVar, bpVar, eVarD8);
                    case 12:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i25 = v.f38772a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar10 = (com.waze.sharedrive.d.a) bVar11.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        s sVar2 = (s) bVar11.a(new h.g.b.m(s.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("ShareDriveMapIndicationStateHolder");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new bq(aVar10, sVar2, eVarD9);
                    case 13:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i27 = v.f38772a;
                        h.g.b.x.f(bVar12, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar12);
                        int i28 = av.f51370a;
                        cj cjVar = kotlinx.coroutines.e.ac.f51860a;
                        AsyncLayoutInflater asyncLayoutInflater = new AsyncLayoutInflater(k.a.k.h(bVar12));
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("ViewBitmapRenderer");
                        h.g.b.x.e(eVarD10, "create(...)");
                        return new cr(contextH, cjVar, asyncLayoutInflater, eVarD10);
                    case 14:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i29 = v.f38772a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.e.p(k.a.k.h(bVar13), av.b());
                    case 15:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = v.f38772a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = ar.f48106a;
                        co coVar = (co) bVar14.a(new h.g.b.m(co.class), null, null);
                        com.waze.sharedrive.e.a aVar11 = (com.waze.sharedrive.e.a) bVar14.a(new h.g.b.m(com.waze.sharedrive.e.a.class), null, null);
                        MoodManager moodManager = (MoodManager) bVar14.a(new h.g.b.m(MoodManager.class), null, null);
                        kotlinx.coroutines.ab abVarB = av.b();
                        com.waze.shared_infra.i.e eVarD11 = com.waze.shared_infra.i.a.d("ParticipantPinRenderer");
                        h.g.b.x.e(eVarD11, "create(...)");
                        return new bc(coVar, aVar11, moodManager, abVarB, eVarD11, h.o.g.f48282a);
                    case 16:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = v.f38772a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = ar.f48106a;
                        ai aiVar = (ai) bVar15.a(new h.g.b.m(ai.class), null, null);
                        com.waze.map.b.cj cjVar2 = (com.waze.map.b.cj) bVar15.a(new h.g.b.m(com.waze.map.b.cj.class), null, null);
                        com.waze.sharedrive.d.a aVar12 = (com.waze.sharedrive.d.a) bVar15.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.sharedrive.e.av avVar = (com.waze.sharedrive.e.av) bVar15.a(new h.g.b.m(com.waze.sharedrive.e.av.class), null, null);
                        com.waze.shared_infra.i.e eVarD12 = com.waze.shared_infra.i.a.d("LiveDriveMapStateHolder");
                        h.g.b.x.e(eVarD12, "create(...)");
                        return new com.waze.sharedrive.e.x(aiVar, cjVar2, aVar12, avVar, eVarD12);
                    case 17:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = v.f38772a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = ar.f48106a;
                        return new cn((MoodManager) bVar16.a(new h.g.b.m(MoodManager.class), null, null), (com.waze.shared_infra.q.j) bVar16.a(new h.g.b.m(com.waze.shared_infra.q.j.class), null, null));
                    case 18:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = v.f38772a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar13 = (com.waze.sharedrive.d.a) bVar17.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar2 = (cn) bVar17.a(new h.g.b.m(cn.class), null, null);
                        com.waze.mywaze.n nVar = (com.waze.mywaze.n) bVar17.a(new h.g.b.m(com.waze.mywaze.n.class), null, null);
                        com.waze.shared_infra.i.e eVarD13 = com.waze.shared_infra.i.a.d("CreateSharePreviewStateHolder");
                        h.g.b.x.e(eVarD13, "create(...)");
                        return new com.waze.sharedrive.e.e(aVar13, cnVar2, nVar, eVarD13);
                    case 19:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = v.f38772a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar14 = (com.waze.sharedrive.d.a) bVar18.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar3 = (cn) bVar18.a(new h.g.b.m(cn.class), null, null);
                        com.waze.shared_infra.i.e eVarD14 = com.waze.shared_infra.i.a.d("JoinSharePreviewStateHolder");
                        h.g.b.x.e(eVarD14, "create(...)");
                        return new com.waze.sharedrive.e.q(aVar14, cnVar3, eVarD14);
                    default:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = v.f38772a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = ar.f48106a;
                        com.waze.sharedrive.e.e eVar32 = (com.waze.sharedrive.e.e) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.e.class), null, null);
                        com.waze.sharedrive.e.q qVar2 = (com.waze.sharedrive.e.q) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.q.class), null, null);
                        com.waze.sharedrive.d.a aVar15 = (com.waze.sharedrive.d.a) bVar19.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD15 = com.waze.shared_infra.i.a.d("ShareDriveStateHolder");
                        h.g.b.x.e(eVarD15, "create(...)");
                        return new bw(eVar32, qVar2, aVar15, eVarD15);
                }
            }
        };
        org.a.d.e.e eVar7 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(au.class), null, pVar7, cVar, h.a.i.h()));
        aVar.f(eVar7);
        new org.a.d.c.d(aVar, eVar7);
        final int i11 = 9;
        h.g.a.p pVar8 = new h.g.a.p() { // from class: com.waze.sharedrive.t
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                byte[] bArr = null;
                switch (i11) {
                    case 0:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i42 = v.f38772a;
                        h.g.b.x.f(bVar2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i52 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar2 = (com.waze.sharedrive.d.a) bVar2.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ShareDriveDeeplinkReceiver");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new as(aVar2, eVarD);
                    case 1:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i62 = v.f38772a;
                        h.g.b.x.f(bVar22, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i72 = ar.f48106a;
                        com.waze.map.d dVar = (com.waze.map.d) bVar22.a(new h.g.b.m(com.waze.map.d.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("ShareDriveDataConverter");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.sharedrive.c.q(dVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i82 = v.f38772a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i92 = ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar3.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar = e.a.h.f47759a;
                        h.g.b.x.e(hVar, "DEFAULT");
                        return new ac(iVarB, hVar);
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i102 = v.f38772a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i112 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar3 = (com.waze.sharedrive.b.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.d.a aVar4 = (com.waze.sharedrive.d.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        ao aoVar = (ao) bVar4.a(new h.g.b.m(ao.class), null, null);
                        dg dgVar = (dg) bVar4.a(new h.g.b.m(dg.class), null, null);
                        af afVarE = aj.e(av.a().plus(aj.Q()));
                        com.waze.sharedrive.e.i iVar = com.waze.sharedrive.e.i.f38533a;
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("ShareDriveInterceptor");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new bf(aVar3, aVar4, aoVar, dgVar, afVarE, iVar, eVarD3);
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i12 = v.f38772a;
                        h.g.b.x.f(bVar5, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i13 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar5 = (com.waze.sharedrive.b.a) bVar5.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        ac acVar = (ac) bVar5.a(new h.g.b.m(ac.class), null, null);
                        com.waze.sharedrive.c.q qVar = (com.waze.sharedrive.c.q) bVar5.a(new h.g.b.m(com.waze.sharedrive.c.q.class), null, null);
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("ShareDriveApi");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.sharedrive.c.e(aVar5, acVar, qVar, eVarD4);
                    case 5:
                        int i14 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.b.a();
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i15 = v.f38772a;
                        h.g.b.x.f(bVar6, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar6 = (com.waze.sharedrive.b.a) bVar6.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.c.e eVar22 = (com.waze.sharedrive.c.e) bVar6.a(new h.g.b.m(com.waze.sharedrive.c.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("ShareDriveService");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new com.waze.sharedrive.c.s(aVar6, eVar22, eVarD5);
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i17 = v.f38772a;
                        h.g.b.x.f(bVar7, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar7 = (com.waze.sharedrive.d.a) bVar7.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("EtaDrawerShareButtonStateHolder");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new com.waze.sharedrive.e.j(aVar7, eVarD6);
                    case 8:
                        int i19 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new au(bArr);
                    case 9:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i20 = v.f38772a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i21 = ar.f48106a;
                        com.waze.sharedrive.c.s sVar = (com.waze.sharedrive.c.s) bVar8.a(new h.g.b.m(com.waze.sharedrive.c.s.class), null, null);
                        com.waze.sharedrive.b.a aVar8 = (com.waze.sharedrive.b.a) bVar8.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        dg dgVar2 = (dg) bVar8.a(new h.g.b.m(dg.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar8.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        h.c.j jVarPlus = av.a().plus(aj.Q());
                        com.waze.sharedui.profile.b bVar9 = (com.waze.sharedui.profile.b) bVar8.a(new h.g.b.m(com.waze.sharedui.profile.b.class), null, null);
                        com.waze.location.b.d dVar2 = (com.waze.location.b.d) bVar8.a(new h.g.b.m(com.waze.location.b.d.class), null, new com.waze.settings.ao(8));
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("ShareDriveController");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sharedrive.d.b(aVar8, sVar, dgVar2, gVar, bVar9, jVarPlus, dVar2, eVarD7);
                    case 10:
                        int i22 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new s(ShareDriveNativeManager.INSTANCE);
                    case 11:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i23 = v.f38772a;
                        h.g.b.x.f(bVar10, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i24 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar9 = (com.waze.sharedrive.d.a) bVar10.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        com.waze.main_screen.p.b.a.b.c cVar2 = (com.waze.main_screen.p.b.a.b.c) bVar10.a(new h.g.b.m(com.waze.main_screen.p.b.a.b.c.class), null, null);
                        com.waze.main_screen.l.b.e eVar222 = (com.waze.main_screen.l.b.e) bVar10.a(new h.g.b.m(com.waze.main_screen.l.b.e.class), null, null);
                        com.waze.sharedrive.e.w wVar = (com.waze.sharedrive.e.w) bVar10.a(new h.g.b.m(com.waze.sharedrive.e.w.class), null, null);
                        cn cnVar = (cn) bVar10.a(new h.g.b.m(cn.class), null, null);
                        bo boVar = (bo) bVar10.a(new h.g.b.m(bo.class), null, null);
                        bp bpVar = (bp) bVar10.a(new h.g.b.m(bp.class), null, null);
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("LiveShareDriveViewModel");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new at(aVar9, wVar, enVar, cVar2, eVar222, cnVar, boVar, bpVar, eVarD8);
                    case 12:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i25 = v.f38772a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar10 = (com.waze.sharedrive.d.a) bVar11.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        s sVar2 = (s) bVar11.a(new h.g.b.m(s.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("ShareDriveMapIndicationStateHolder");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new bq(aVar10, sVar2, eVarD9);
                    case 13:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i27 = v.f38772a;
                        h.g.b.x.f(bVar12, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar12);
                        int i28 = av.f51370a;
                        cj cjVar = kotlinx.coroutines.e.ac.f51860a;
                        AsyncLayoutInflater asyncLayoutInflater = new AsyncLayoutInflater(k.a.k.h(bVar12));
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("ViewBitmapRenderer");
                        h.g.b.x.e(eVarD10, "create(...)");
                        return new cr(contextH, cjVar, asyncLayoutInflater, eVarD10);
                    case 14:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i29 = v.f38772a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.e.p(k.a.k.h(bVar13), av.b());
                    case 15:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = v.f38772a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = ar.f48106a;
                        co coVar = (co) bVar14.a(new h.g.b.m(co.class), null, null);
                        com.waze.sharedrive.e.a aVar11 = (com.waze.sharedrive.e.a) bVar14.a(new h.g.b.m(com.waze.sharedrive.e.a.class), null, null);
                        MoodManager moodManager = (MoodManager) bVar14.a(new h.g.b.m(MoodManager.class), null, null);
                        kotlinx.coroutines.ab abVarB = av.b();
                        com.waze.shared_infra.i.e eVarD11 = com.waze.shared_infra.i.a.d("ParticipantPinRenderer");
                        h.g.b.x.e(eVarD11, "create(...)");
                        return new bc(coVar, aVar11, moodManager, abVarB, eVarD11, h.o.g.f48282a);
                    case 16:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = v.f38772a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = ar.f48106a;
                        ai aiVar = (ai) bVar15.a(new h.g.b.m(ai.class), null, null);
                        com.waze.map.b.cj cjVar2 = (com.waze.map.b.cj) bVar15.a(new h.g.b.m(com.waze.map.b.cj.class), null, null);
                        com.waze.sharedrive.d.a aVar12 = (com.waze.sharedrive.d.a) bVar15.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.sharedrive.e.av avVar = (com.waze.sharedrive.e.av) bVar15.a(new h.g.b.m(com.waze.sharedrive.e.av.class), null, null);
                        com.waze.shared_infra.i.e eVarD12 = com.waze.shared_infra.i.a.d("LiveDriveMapStateHolder");
                        h.g.b.x.e(eVarD12, "create(...)");
                        return new com.waze.sharedrive.e.x(aiVar, cjVar2, aVar12, avVar, eVarD12);
                    case 17:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = v.f38772a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = ar.f48106a;
                        return new cn((MoodManager) bVar16.a(new h.g.b.m(MoodManager.class), null, null), (com.waze.shared_infra.q.j) bVar16.a(new h.g.b.m(com.waze.shared_infra.q.j.class), null, null));
                    case 18:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = v.f38772a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar13 = (com.waze.sharedrive.d.a) bVar17.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar2 = (cn) bVar17.a(new h.g.b.m(cn.class), null, null);
                        com.waze.mywaze.n nVar = (com.waze.mywaze.n) bVar17.a(new h.g.b.m(com.waze.mywaze.n.class), null, null);
                        com.waze.shared_infra.i.e eVarD13 = com.waze.shared_infra.i.a.d("CreateSharePreviewStateHolder");
                        h.g.b.x.e(eVarD13, "create(...)");
                        return new com.waze.sharedrive.e.e(aVar13, cnVar2, nVar, eVarD13);
                    case 19:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = v.f38772a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar14 = (com.waze.sharedrive.d.a) bVar18.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar3 = (cn) bVar18.a(new h.g.b.m(cn.class), null, null);
                        com.waze.shared_infra.i.e eVarD14 = com.waze.shared_infra.i.a.d("JoinSharePreviewStateHolder");
                        h.g.b.x.e(eVarD14, "create(...)");
                        return new com.waze.sharedrive.e.q(aVar14, cnVar3, eVarD14);
                    default:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = v.f38772a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = ar.f48106a;
                        com.waze.sharedrive.e.e eVar32 = (com.waze.sharedrive.e.e) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.e.class), null, null);
                        com.waze.sharedrive.e.q qVar2 = (com.waze.sharedrive.e.q) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.q.class), null, null);
                        com.waze.sharedrive.d.a aVar15 = (com.waze.sharedrive.d.a) bVar19.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD15 = com.waze.shared_infra.i.a.d("ShareDriveStateHolder");
                        h.g.b.x.e(eVarD15, "create(...)");
                        return new bw(eVar32, qVar2, aVar15, eVarD15);
                }
            }
        };
        org.a.d.e.e eVar8 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.sharedrive.d.a.class), null, pVar8, cVar, h.a.i.h()));
        aVar.f(eVar8);
        new org.a.d.c.d(aVar, eVar8);
        final int i12 = 10;
        h.g.a.p pVar9 = new h.g.a.p() { // from class: com.waze.sharedrive.t
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                byte[] bArr = null;
                switch (i12) {
                    case 0:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i42 = v.f38772a;
                        h.g.b.x.f(bVar2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i52 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar2 = (com.waze.sharedrive.d.a) bVar2.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ShareDriveDeeplinkReceiver");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new as(aVar2, eVarD);
                    case 1:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i62 = v.f38772a;
                        h.g.b.x.f(bVar22, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i72 = ar.f48106a;
                        com.waze.map.d dVar = (com.waze.map.d) bVar22.a(new h.g.b.m(com.waze.map.d.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("ShareDriveDataConverter");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.sharedrive.c.q(dVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i82 = v.f38772a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i92 = ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar3.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar = e.a.h.f47759a;
                        h.g.b.x.e(hVar, "DEFAULT");
                        return new ac(iVarB, hVar);
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i102 = v.f38772a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i112 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar3 = (com.waze.sharedrive.b.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.d.a aVar4 = (com.waze.sharedrive.d.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        ao aoVar = (ao) bVar4.a(new h.g.b.m(ao.class), null, null);
                        dg dgVar = (dg) bVar4.a(new h.g.b.m(dg.class), null, null);
                        af afVarE = aj.e(av.a().plus(aj.Q()));
                        com.waze.sharedrive.e.i iVar = com.waze.sharedrive.e.i.f38533a;
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("ShareDriveInterceptor");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new bf(aVar3, aVar4, aoVar, dgVar, afVarE, iVar, eVarD3);
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i122 = v.f38772a;
                        h.g.b.x.f(bVar5, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i13 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar5 = (com.waze.sharedrive.b.a) bVar5.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        ac acVar = (ac) bVar5.a(new h.g.b.m(ac.class), null, null);
                        com.waze.sharedrive.c.q qVar = (com.waze.sharedrive.c.q) bVar5.a(new h.g.b.m(com.waze.sharedrive.c.q.class), null, null);
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("ShareDriveApi");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.sharedrive.c.e(aVar5, acVar, qVar, eVarD4);
                    case 5:
                        int i14 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.b.a();
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i15 = v.f38772a;
                        h.g.b.x.f(bVar6, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar6 = (com.waze.sharedrive.b.a) bVar6.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.c.e eVar22 = (com.waze.sharedrive.c.e) bVar6.a(new h.g.b.m(com.waze.sharedrive.c.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("ShareDriveService");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new com.waze.sharedrive.c.s(aVar6, eVar22, eVarD5);
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i17 = v.f38772a;
                        h.g.b.x.f(bVar7, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar7 = (com.waze.sharedrive.d.a) bVar7.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("EtaDrawerShareButtonStateHolder");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new com.waze.sharedrive.e.j(aVar7, eVarD6);
                    case 8:
                        int i19 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new au(bArr);
                    case 9:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i20 = v.f38772a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i21 = ar.f48106a;
                        com.waze.sharedrive.c.s sVar = (com.waze.sharedrive.c.s) bVar8.a(new h.g.b.m(com.waze.sharedrive.c.s.class), null, null);
                        com.waze.sharedrive.b.a aVar8 = (com.waze.sharedrive.b.a) bVar8.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        dg dgVar2 = (dg) bVar8.a(new h.g.b.m(dg.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar8.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        h.c.j jVarPlus = av.a().plus(aj.Q());
                        com.waze.sharedui.profile.b bVar9 = (com.waze.sharedui.profile.b) bVar8.a(new h.g.b.m(com.waze.sharedui.profile.b.class), null, null);
                        com.waze.location.b.d dVar2 = (com.waze.location.b.d) bVar8.a(new h.g.b.m(com.waze.location.b.d.class), null, new com.waze.settings.ao(8));
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("ShareDriveController");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sharedrive.d.b(aVar8, sVar, dgVar2, gVar, bVar9, jVarPlus, dVar2, eVarD7);
                    case 10:
                        int i22 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new s(ShareDriveNativeManager.INSTANCE);
                    case 11:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i23 = v.f38772a;
                        h.g.b.x.f(bVar10, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i24 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar9 = (com.waze.sharedrive.d.a) bVar10.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        com.waze.main_screen.p.b.a.b.c cVar2 = (com.waze.main_screen.p.b.a.b.c) bVar10.a(new h.g.b.m(com.waze.main_screen.p.b.a.b.c.class), null, null);
                        com.waze.main_screen.l.b.e eVar222 = (com.waze.main_screen.l.b.e) bVar10.a(new h.g.b.m(com.waze.main_screen.l.b.e.class), null, null);
                        com.waze.sharedrive.e.w wVar = (com.waze.sharedrive.e.w) bVar10.a(new h.g.b.m(com.waze.sharedrive.e.w.class), null, null);
                        cn cnVar = (cn) bVar10.a(new h.g.b.m(cn.class), null, null);
                        bo boVar = (bo) bVar10.a(new h.g.b.m(bo.class), null, null);
                        bp bpVar = (bp) bVar10.a(new h.g.b.m(bp.class), null, null);
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("LiveShareDriveViewModel");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new at(aVar9, wVar, enVar, cVar2, eVar222, cnVar, boVar, bpVar, eVarD8);
                    case 12:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i25 = v.f38772a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar10 = (com.waze.sharedrive.d.a) bVar11.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        s sVar2 = (s) bVar11.a(new h.g.b.m(s.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("ShareDriveMapIndicationStateHolder");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new bq(aVar10, sVar2, eVarD9);
                    case 13:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i27 = v.f38772a;
                        h.g.b.x.f(bVar12, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar12);
                        int i28 = av.f51370a;
                        cj cjVar = kotlinx.coroutines.e.ac.f51860a;
                        AsyncLayoutInflater asyncLayoutInflater = new AsyncLayoutInflater(k.a.k.h(bVar12));
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("ViewBitmapRenderer");
                        h.g.b.x.e(eVarD10, "create(...)");
                        return new cr(contextH, cjVar, asyncLayoutInflater, eVarD10);
                    case 14:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i29 = v.f38772a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.e.p(k.a.k.h(bVar13), av.b());
                    case 15:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = v.f38772a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = ar.f48106a;
                        co coVar = (co) bVar14.a(new h.g.b.m(co.class), null, null);
                        com.waze.sharedrive.e.a aVar11 = (com.waze.sharedrive.e.a) bVar14.a(new h.g.b.m(com.waze.sharedrive.e.a.class), null, null);
                        MoodManager moodManager = (MoodManager) bVar14.a(new h.g.b.m(MoodManager.class), null, null);
                        kotlinx.coroutines.ab abVarB = av.b();
                        com.waze.shared_infra.i.e eVarD11 = com.waze.shared_infra.i.a.d("ParticipantPinRenderer");
                        h.g.b.x.e(eVarD11, "create(...)");
                        return new bc(coVar, aVar11, moodManager, abVarB, eVarD11, h.o.g.f48282a);
                    case 16:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = v.f38772a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = ar.f48106a;
                        ai aiVar = (ai) bVar15.a(new h.g.b.m(ai.class), null, null);
                        com.waze.map.b.cj cjVar2 = (com.waze.map.b.cj) bVar15.a(new h.g.b.m(com.waze.map.b.cj.class), null, null);
                        com.waze.sharedrive.d.a aVar12 = (com.waze.sharedrive.d.a) bVar15.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.sharedrive.e.av avVar = (com.waze.sharedrive.e.av) bVar15.a(new h.g.b.m(com.waze.sharedrive.e.av.class), null, null);
                        com.waze.shared_infra.i.e eVarD12 = com.waze.shared_infra.i.a.d("LiveDriveMapStateHolder");
                        h.g.b.x.e(eVarD12, "create(...)");
                        return new com.waze.sharedrive.e.x(aiVar, cjVar2, aVar12, avVar, eVarD12);
                    case 17:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = v.f38772a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = ar.f48106a;
                        return new cn((MoodManager) bVar16.a(new h.g.b.m(MoodManager.class), null, null), (com.waze.shared_infra.q.j) bVar16.a(new h.g.b.m(com.waze.shared_infra.q.j.class), null, null));
                    case 18:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = v.f38772a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar13 = (com.waze.sharedrive.d.a) bVar17.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar2 = (cn) bVar17.a(new h.g.b.m(cn.class), null, null);
                        com.waze.mywaze.n nVar = (com.waze.mywaze.n) bVar17.a(new h.g.b.m(com.waze.mywaze.n.class), null, null);
                        com.waze.shared_infra.i.e eVarD13 = com.waze.shared_infra.i.a.d("CreateSharePreviewStateHolder");
                        h.g.b.x.e(eVarD13, "create(...)");
                        return new com.waze.sharedrive.e.e(aVar13, cnVar2, nVar, eVarD13);
                    case 19:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = v.f38772a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar14 = (com.waze.sharedrive.d.a) bVar18.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar3 = (cn) bVar18.a(new h.g.b.m(cn.class), null, null);
                        com.waze.shared_infra.i.e eVarD14 = com.waze.shared_infra.i.a.d("JoinSharePreviewStateHolder");
                        h.g.b.x.e(eVarD14, "create(...)");
                        return new com.waze.sharedrive.e.q(aVar14, cnVar3, eVarD14);
                    default:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = v.f38772a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = ar.f48106a;
                        com.waze.sharedrive.e.e eVar32 = (com.waze.sharedrive.e.e) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.e.class), null, null);
                        com.waze.sharedrive.e.q qVar2 = (com.waze.sharedrive.e.q) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.q.class), null, null);
                        com.waze.sharedrive.d.a aVar15 = (com.waze.sharedrive.d.a) bVar19.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD15 = com.waze.shared_infra.i.a.d("ShareDriveStateHolder");
                        h.g.b.x.e(eVarD15, "create(...)");
                        return new bw(eVar32, qVar2, aVar15, eVarD15);
                }
            }
        };
        org.a.d.e.e eVar9 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(s.class), null, pVar9, cVar, h.a.i.h()));
        aVar.f(eVar9);
        new org.a.d.c.d(aVar, eVar9);
        final int i13 = 12;
        h.g.a.p pVar10 = new h.g.a.p() { // from class: com.waze.sharedrive.t
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                byte[] bArr = null;
                switch (i13) {
                    case 0:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i42 = v.f38772a;
                        h.g.b.x.f(bVar2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i52 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar2 = (com.waze.sharedrive.d.a) bVar2.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ShareDriveDeeplinkReceiver");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new as(aVar2, eVarD);
                    case 1:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i62 = v.f38772a;
                        h.g.b.x.f(bVar22, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i72 = ar.f48106a;
                        com.waze.map.d dVar = (com.waze.map.d) bVar22.a(new h.g.b.m(com.waze.map.d.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("ShareDriveDataConverter");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.sharedrive.c.q(dVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i82 = v.f38772a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i92 = ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar3.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar = e.a.h.f47759a;
                        h.g.b.x.e(hVar, "DEFAULT");
                        return new ac(iVarB, hVar);
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i102 = v.f38772a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i112 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar3 = (com.waze.sharedrive.b.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.d.a aVar4 = (com.waze.sharedrive.d.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        ao aoVar = (ao) bVar4.a(new h.g.b.m(ao.class), null, null);
                        dg dgVar = (dg) bVar4.a(new h.g.b.m(dg.class), null, null);
                        af afVarE = aj.e(av.a().plus(aj.Q()));
                        com.waze.sharedrive.e.i iVar = com.waze.sharedrive.e.i.f38533a;
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("ShareDriveInterceptor");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new bf(aVar3, aVar4, aoVar, dgVar, afVarE, iVar, eVarD3);
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i122 = v.f38772a;
                        h.g.b.x.f(bVar5, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i132 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar5 = (com.waze.sharedrive.b.a) bVar5.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        ac acVar = (ac) bVar5.a(new h.g.b.m(ac.class), null, null);
                        com.waze.sharedrive.c.q qVar = (com.waze.sharedrive.c.q) bVar5.a(new h.g.b.m(com.waze.sharedrive.c.q.class), null, null);
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("ShareDriveApi");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.sharedrive.c.e(aVar5, acVar, qVar, eVarD4);
                    case 5:
                        int i14 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.b.a();
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i15 = v.f38772a;
                        h.g.b.x.f(bVar6, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar6 = (com.waze.sharedrive.b.a) bVar6.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.c.e eVar22 = (com.waze.sharedrive.c.e) bVar6.a(new h.g.b.m(com.waze.sharedrive.c.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("ShareDriveService");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new com.waze.sharedrive.c.s(aVar6, eVar22, eVarD5);
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i17 = v.f38772a;
                        h.g.b.x.f(bVar7, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar7 = (com.waze.sharedrive.d.a) bVar7.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("EtaDrawerShareButtonStateHolder");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new com.waze.sharedrive.e.j(aVar7, eVarD6);
                    case 8:
                        int i19 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new au(bArr);
                    case 9:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i20 = v.f38772a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i21 = ar.f48106a;
                        com.waze.sharedrive.c.s sVar = (com.waze.sharedrive.c.s) bVar8.a(new h.g.b.m(com.waze.sharedrive.c.s.class), null, null);
                        com.waze.sharedrive.b.a aVar8 = (com.waze.sharedrive.b.a) bVar8.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        dg dgVar2 = (dg) bVar8.a(new h.g.b.m(dg.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar8.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        h.c.j jVarPlus = av.a().plus(aj.Q());
                        com.waze.sharedui.profile.b bVar9 = (com.waze.sharedui.profile.b) bVar8.a(new h.g.b.m(com.waze.sharedui.profile.b.class), null, null);
                        com.waze.location.b.d dVar2 = (com.waze.location.b.d) bVar8.a(new h.g.b.m(com.waze.location.b.d.class), null, new com.waze.settings.ao(8));
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("ShareDriveController");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sharedrive.d.b(aVar8, sVar, dgVar2, gVar, bVar9, jVarPlus, dVar2, eVarD7);
                    case 10:
                        int i22 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new s(ShareDriveNativeManager.INSTANCE);
                    case 11:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i23 = v.f38772a;
                        h.g.b.x.f(bVar10, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i24 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar9 = (com.waze.sharedrive.d.a) bVar10.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        com.waze.main_screen.p.b.a.b.c cVar2 = (com.waze.main_screen.p.b.a.b.c) bVar10.a(new h.g.b.m(com.waze.main_screen.p.b.a.b.c.class), null, null);
                        com.waze.main_screen.l.b.e eVar222 = (com.waze.main_screen.l.b.e) bVar10.a(new h.g.b.m(com.waze.main_screen.l.b.e.class), null, null);
                        com.waze.sharedrive.e.w wVar = (com.waze.sharedrive.e.w) bVar10.a(new h.g.b.m(com.waze.sharedrive.e.w.class), null, null);
                        cn cnVar = (cn) bVar10.a(new h.g.b.m(cn.class), null, null);
                        bo boVar = (bo) bVar10.a(new h.g.b.m(bo.class), null, null);
                        bp bpVar = (bp) bVar10.a(new h.g.b.m(bp.class), null, null);
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("LiveShareDriveViewModel");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new at(aVar9, wVar, enVar, cVar2, eVar222, cnVar, boVar, bpVar, eVarD8);
                    case 12:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i25 = v.f38772a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar10 = (com.waze.sharedrive.d.a) bVar11.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        s sVar2 = (s) bVar11.a(new h.g.b.m(s.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("ShareDriveMapIndicationStateHolder");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new bq(aVar10, sVar2, eVarD9);
                    case 13:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i27 = v.f38772a;
                        h.g.b.x.f(bVar12, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar12);
                        int i28 = av.f51370a;
                        cj cjVar = kotlinx.coroutines.e.ac.f51860a;
                        AsyncLayoutInflater asyncLayoutInflater = new AsyncLayoutInflater(k.a.k.h(bVar12));
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("ViewBitmapRenderer");
                        h.g.b.x.e(eVarD10, "create(...)");
                        return new cr(contextH, cjVar, asyncLayoutInflater, eVarD10);
                    case 14:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i29 = v.f38772a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.e.p(k.a.k.h(bVar13), av.b());
                    case 15:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = v.f38772a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = ar.f48106a;
                        co coVar = (co) bVar14.a(new h.g.b.m(co.class), null, null);
                        com.waze.sharedrive.e.a aVar11 = (com.waze.sharedrive.e.a) bVar14.a(new h.g.b.m(com.waze.sharedrive.e.a.class), null, null);
                        MoodManager moodManager = (MoodManager) bVar14.a(new h.g.b.m(MoodManager.class), null, null);
                        kotlinx.coroutines.ab abVarB = av.b();
                        com.waze.shared_infra.i.e eVarD11 = com.waze.shared_infra.i.a.d("ParticipantPinRenderer");
                        h.g.b.x.e(eVarD11, "create(...)");
                        return new bc(coVar, aVar11, moodManager, abVarB, eVarD11, h.o.g.f48282a);
                    case 16:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = v.f38772a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = ar.f48106a;
                        ai aiVar = (ai) bVar15.a(new h.g.b.m(ai.class), null, null);
                        com.waze.map.b.cj cjVar2 = (com.waze.map.b.cj) bVar15.a(new h.g.b.m(com.waze.map.b.cj.class), null, null);
                        com.waze.sharedrive.d.a aVar12 = (com.waze.sharedrive.d.a) bVar15.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.sharedrive.e.av avVar = (com.waze.sharedrive.e.av) bVar15.a(new h.g.b.m(com.waze.sharedrive.e.av.class), null, null);
                        com.waze.shared_infra.i.e eVarD12 = com.waze.shared_infra.i.a.d("LiveDriveMapStateHolder");
                        h.g.b.x.e(eVarD12, "create(...)");
                        return new com.waze.sharedrive.e.x(aiVar, cjVar2, aVar12, avVar, eVarD12);
                    case 17:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = v.f38772a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = ar.f48106a;
                        return new cn((MoodManager) bVar16.a(new h.g.b.m(MoodManager.class), null, null), (com.waze.shared_infra.q.j) bVar16.a(new h.g.b.m(com.waze.shared_infra.q.j.class), null, null));
                    case 18:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = v.f38772a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar13 = (com.waze.sharedrive.d.a) bVar17.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar2 = (cn) bVar17.a(new h.g.b.m(cn.class), null, null);
                        com.waze.mywaze.n nVar = (com.waze.mywaze.n) bVar17.a(new h.g.b.m(com.waze.mywaze.n.class), null, null);
                        com.waze.shared_infra.i.e eVarD13 = com.waze.shared_infra.i.a.d("CreateSharePreviewStateHolder");
                        h.g.b.x.e(eVarD13, "create(...)");
                        return new com.waze.sharedrive.e.e(aVar13, cnVar2, nVar, eVarD13);
                    case 19:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = v.f38772a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar14 = (com.waze.sharedrive.d.a) bVar18.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar3 = (cn) bVar18.a(new h.g.b.m(cn.class), null, null);
                        com.waze.shared_infra.i.e eVarD14 = com.waze.shared_infra.i.a.d("JoinSharePreviewStateHolder");
                        h.g.b.x.e(eVarD14, "create(...)");
                        return new com.waze.sharedrive.e.q(aVar14, cnVar3, eVarD14);
                    default:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = v.f38772a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = ar.f48106a;
                        com.waze.sharedrive.e.e eVar32 = (com.waze.sharedrive.e.e) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.e.class), null, null);
                        com.waze.sharedrive.e.q qVar2 = (com.waze.sharedrive.e.q) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.q.class), null, null);
                        com.waze.sharedrive.d.a aVar15 = (com.waze.sharedrive.d.a) bVar19.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD15 = com.waze.shared_infra.i.a.d("ShareDriveStateHolder");
                        h.g.b.x.e(eVarD15, "create(...)");
                        return new bw(eVar32, qVar2, aVar15, eVarD15);
                }
            }
        };
        org.a.d.e.e eVar10 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(bo.class), null, pVar10, cVar, h.a.i.h()));
        aVar.f(eVar10);
        new org.a.d.c.d(aVar, eVar10);
        final int i14 = 11;
        h.g.a.p pVar11 = new h.g.a.p() { // from class: com.waze.sharedrive.t
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                byte[] bArr = null;
                switch (i14) {
                    case 0:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i42 = v.f38772a;
                        h.g.b.x.f(bVar2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i52 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar2 = (com.waze.sharedrive.d.a) bVar2.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ShareDriveDeeplinkReceiver");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new as(aVar2, eVarD);
                    case 1:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i62 = v.f38772a;
                        h.g.b.x.f(bVar22, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i72 = ar.f48106a;
                        com.waze.map.d dVar = (com.waze.map.d) bVar22.a(new h.g.b.m(com.waze.map.d.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("ShareDriveDataConverter");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.sharedrive.c.q(dVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i82 = v.f38772a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i92 = ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar3.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar = e.a.h.f47759a;
                        h.g.b.x.e(hVar, "DEFAULT");
                        return new ac(iVarB, hVar);
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i102 = v.f38772a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i112 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar3 = (com.waze.sharedrive.b.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.d.a aVar4 = (com.waze.sharedrive.d.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        ao aoVar = (ao) bVar4.a(new h.g.b.m(ao.class), null, null);
                        dg dgVar = (dg) bVar4.a(new h.g.b.m(dg.class), null, null);
                        af afVarE = aj.e(av.a().plus(aj.Q()));
                        com.waze.sharedrive.e.i iVar = com.waze.sharedrive.e.i.f38533a;
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("ShareDriveInterceptor");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new bf(aVar3, aVar4, aoVar, dgVar, afVarE, iVar, eVarD3);
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i122 = v.f38772a;
                        h.g.b.x.f(bVar5, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i132 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar5 = (com.waze.sharedrive.b.a) bVar5.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        ac acVar = (ac) bVar5.a(new h.g.b.m(ac.class), null, null);
                        com.waze.sharedrive.c.q qVar = (com.waze.sharedrive.c.q) bVar5.a(new h.g.b.m(com.waze.sharedrive.c.q.class), null, null);
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("ShareDriveApi");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.sharedrive.c.e(aVar5, acVar, qVar, eVarD4);
                    case 5:
                        int i142 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.b.a();
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i15 = v.f38772a;
                        h.g.b.x.f(bVar6, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar6 = (com.waze.sharedrive.b.a) bVar6.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.c.e eVar22 = (com.waze.sharedrive.c.e) bVar6.a(new h.g.b.m(com.waze.sharedrive.c.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("ShareDriveService");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new com.waze.sharedrive.c.s(aVar6, eVar22, eVarD5);
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i17 = v.f38772a;
                        h.g.b.x.f(bVar7, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar7 = (com.waze.sharedrive.d.a) bVar7.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("EtaDrawerShareButtonStateHolder");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new com.waze.sharedrive.e.j(aVar7, eVarD6);
                    case 8:
                        int i19 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new au(bArr);
                    case 9:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i20 = v.f38772a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i21 = ar.f48106a;
                        com.waze.sharedrive.c.s sVar = (com.waze.sharedrive.c.s) bVar8.a(new h.g.b.m(com.waze.sharedrive.c.s.class), null, null);
                        com.waze.sharedrive.b.a aVar8 = (com.waze.sharedrive.b.a) bVar8.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        dg dgVar2 = (dg) bVar8.a(new h.g.b.m(dg.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar8.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        h.c.j jVarPlus = av.a().plus(aj.Q());
                        com.waze.sharedui.profile.b bVar9 = (com.waze.sharedui.profile.b) bVar8.a(new h.g.b.m(com.waze.sharedui.profile.b.class), null, null);
                        com.waze.location.b.d dVar2 = (com.waze.location.b.d) bVar8.a(new h.g.b.m(com.waze.location.b.d.class), null, new com.waze.settings.ao(8));
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("ShareDriveController");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sharedrive.d.b(aVar8, sVar, dgVar2, gVar, bVar9, jVarPlus, dVar2, eVarD7);
                    case 10:
                        int i22 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new s(ShareDriveNativeManager.INSTANCE);
                    case 11:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i23 = v.f38772a;
                        h.g.b.x.f(bVar10, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i24 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar9 = (com.waze.sharedrive.d.a) bVar10.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        com.waze.main_screen.p.b.a.b.c cVar2 = (com.waze.main_screen.p.b.a.b.c) bVar10.a(new h.g.b.m(com.waze.main_screen.p.b.a.b.c.class), null, null);
                        com.waze.main_screen.l.b.e eVar222 = (com.waze.main_screen.l.b.e) bVar10.a(new h.g.b.m(com.waze.main_screen.l.b.e.class), null, null);
                        com.waze.sharedrive.e.w wVar = (com.waze.sharedrive.e.w) bVar10.a(new h.g.b.m(com.waze.sharedrive.e.w.class), null, null);
                        cn cnVar = (cn) bVar10.a(new h.g.b.m(cn.class), null, null);
                        bo boVar = (bo) bVar10.a(new h.g.b.m(bo.class), null, null);
                        bp bpVar = (bp) bVar10.a(new h.g.b.m(bp.class), null, null);
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("LiveShareDriveViewModel");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new at(aVar9, wVar, enVar, cVar2, eVar222, cnVar, boVar, bpVar, eVarD8);
                    case 12:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i25 = v.f38772a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar10 = (com.waze.sharedrive.d.a) bVar11.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        s sVar2 = (s) bVar11.a(new h.g.b.m(s.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("ShareDriveMapIndicationStateHolder");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new bq(aVar10, sVar2, eVarD9);
                    case 13:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i27 = v.f38772a;
                        h.g.b.x.f(bVar12, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar12);
                        int i28 = av.f51370a;
                        cj cjVar = kotlinx.coroutines.e.ac.f51860a;
                        AsyncLayoutInflater asyncLayoutInflater = new AsyncLayoutInflater(k.a.k.h(bVar12));
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("ViewBitmapRenderer");
                        h.g.b.x.e(eVarD10, "create(...)");
                        return new cr(contextH, cjVar, asyncLayoutInflater, eVarD10);
                    case 14:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i29 = v.f38772a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.e.p(k.a.k.h(bVar13), av.b());
                    case 15:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = v.f38772a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = ar.f48106a;
                        co coVar = (co) bVar14.a(new h.g.b.m(co.class), null, null);
                        com.waze.sharedrive.e.a aVar11 = (com.waze.sharedrive.e.a) bVar14.a(new h.g.b.m(com.waze.sharedrive.e.a.class), null, null);
                        MoodManager moodManager = (MoodManager) bVar14.a(new h.g.b.m(MoodManager.class), null, null);
                        kotlinx.coroutines.ab abVarB = av.b();
                        com.waze.shared_infra.i.e eVarD11 = com.waze.shared_infra.i.a.d("ParticipantPinRenderer");
                        h.g.b.x.e(eVarD11, "create(...)");
                        return new bc(coVar, aVar11, moodManager, abVarB, eVarD11, h.o.g.f48282a);
                    case 16:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = v.f38772a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = ar.f48106a;
                        ai aiVar = (ai) bVar15.a(new h.g.b.m(ai.class), null, null);
                        com.waze.map.b.cj cjVar2 = (com.waze.map.b.cj) bVar15.a(new h.g.b.m(com.waze.map.b.cj.class), null, null);
                        com.waze.sharedrive.d.a aVar12 = (com.waze.sharedrive.d.a) bVar15.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.sharedrive.e.av avVar = (com.waze.sharedrive.e.av) bVar15.a(new h.g.b.m(com.waze.sharedrive.e.av.class), null, null);
                        com.waze.shared_infra.i.e eVarD12 = com.waze.shared_infra.i.a.d("LiveDriveMapStateHolder");
                        h.g.b.x.e(eVarD12, "create(...)");
                        return new com.waze.sharedrive.e.x(aiVar, cjVar2, aVar12, avVar, eVarD12);
                    case 17:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = v.f38772a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = ar.f48106a;
                        return new cn((MoodManager) bVar16.a(new h.g.b.m(MoodManager.class), null, null), (com.waze.shared_infra.q.j) bVar16.a(new h.g.b.m(com.waze.shared_infra.q.j.class), null, null));
                    case 18:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = v.f38772a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar13 = (com.waze.sharedrive.d.a) bVar17.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar2 = (cn) bVar17.a(new h.g.b.m(cn.class), null, null);
                        com.waze.mywaze.n nVar = (com.waze.mywaze.n) bVar17.a(new h.g.b.m(com.waze.mywaze.n.class), null, null);
                        com.waze.shared_infra.i.e eVarD13 = com.waze.shared_infra.i.a.d("CreateSharePreviewStateHolder");
                        h.g.b.x.e(eVarD13, "create(...)");
                        return new com.waze.sharedrive.e.e(aVar13, cnVar2, nVar, eVarD13);
                    case 19:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = v.f38772a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar14 = (com.waze.sharedrive.d.a) bVar18.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar3 = (cn) bVar18.a(new h.g.b.m(cn.class), null, null);
                        com.waze.shared_infra.i.e eVarD14 = com.waze.shared_infra.i.a.d("JoinSharePreviewStateHolder");
                        h.g.b.x.e(eVarD14, "create(...)");
                        return new com.waze.sharedrive.e.q(aVar14, cnVar3, eVarD14);
                    default:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = v.f38772a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = ar.f48106a;
                        com.waze.sharedrive.e.e eVar32 = (com.waze.sharedrive.e.e) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.e.class), null, null);
                        com.waze.sharedrive.e.q qVar2 = (com.waze.sharedrive.e.q) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.q.class), null, null);
                        com.waze.sharedrive.d.a aVar15 = (com.waze.sharedrive.d.a) bVar19.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD15 = com.waze.shared_infra.i.a.d("ShareDriveStateHolder");
                        h.g.b.x.e(eVarD15, "create(...)");
                        return new bw(eVar32, qVar2, aVar15, eVarD15);
                }
            }
        };
        org.a.d.i.b bVar2 = org.a.d.j.a.f56411b;
        org.a.d.c.c cVar2 = org.a.d.c.c.f56383b;
        org.a.d.e.a aVar2 = new org.a.d.e.a(new org.a.d.c.a(bVar2, new h.g.b.m(at.class), null, pVar11, cVar2, h.a.i.h()));
        aVar.f(aVar2);
        new org.a.d.c.d(aVar, aVar2);
        final int i15 = 13;
        h.g.a.p pVar12 = new h.g.a.p() { // from class: com.waze.sharedrive.t
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                byte[] bArr = null;
                switch (i15) {
                    case 0:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i42 = v.f38772a;
                        h.g.b.x.f(bVar22, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i52 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar22 = (com.waze.sharedrive.d.a) bVar22.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ShareDriveDeeplinkReceiver");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new as(aVar22, eVarD);
                    case 1:
                        org.a.d.k.b bVar222 = (org.a.d.k.b) obj2;
                        int i62 = v.f38772a;
                        h.g.b.x.f(bVar222, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i72 = ar.f48106a;
                        com.waze.map.d dVar = (com.waze.map.d) bVar222.a(new h.g.b.m(com.waze.map.d.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("ShareDriveDataConverter");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.sharedrive.c.q(dVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i82 = v.f38772a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i92 = ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar3.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar = e.a.h.f47759a;
                        h.g.b.x.e(hVar, "DEFAULT");
                        return new ac(iVarB, hVar);
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i102 = v.f38772a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i112 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar3 = (com.waze.sharedrive.b.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.d.a aVar4 = (com.waze.sharedrive.d.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        ao aoVar = (ao) bVar4.a(new h.g.b.m(ao.class), null, null);
                        dg dgVar = (dg) bVar4.a(new h.g.b.m(dg.class), null, null);
                        af afVarE = aj.e(av.a().plus(aj.Q()));
                        com.waze.sharedrive.e.i iVar = com.waze.sharedrive.e.i.f38533a;
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("ShareDriveInterceptor");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new bf(aVar3, aVar4, aoVar, dgVar, afVarE, iVar, eVarD3);
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i122 = v.f38772a;
                        h.g.b.x.f(bVar5, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i132 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar5 = (com.waze.sharedrive.b.a) bVar5.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        ac acVar = (ac) bVar5.a(new h.g.b.m(ac.class), null, null);
                        com.waze.sharedrive.c.q qVar = (com.waze.sharedrive.c.q) bVar5.a(new h.g.b.m(com.waze.sharedrive.c.q.class), null, null);
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("ShareDriveApi");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.sharedrive.c.e(aVar5, acVar, qVar, eVarD4);
                    case 5:
                        int i142 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.b.a();
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i152 = v.f38772a;
                        h.g.b.x.f(bVar6, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar6 = (com.waze.sharedrive.b.a) bVar6.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.c.e eVar22 = (com.waze.sharedrive.c.e) bVar6.a(new h.g.b.m(com.waze.sharedrive.c.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("ShareDriveService");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new com.waze.sharedrive.c.s(aVar6, eVar22, eVarD5);
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i17 = v.f38772a;
                        h.g.b.x.f(bVar7, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar7 = (com.waze.sharedrive.d.a) bVar7.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("EtaDrawerShareButtonStateHolder");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new com.waze.sharedrive.e.j(aVar7, eVarD6);
                    case 8:
                        int i19 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new au(bArr);
                    case 9:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i20 = v.f38772a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i21 = ar.f48106a;
                        com.waze.sharedrive.c.s sVar = (com.waze.sharedrive.c.s) bVar8.a(new h.g.b.m(com.waze.sharedrive.c.s.class), null, null);
                        com.waze.sharedrive.b.a aVar8 = (com.waze.sharedrive.b.a) bVar8.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        dg dgVar2 = (dg) bVar8.a(new h.g.b.m(dg.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar8.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        h.c.j jVarPlus = av.a().plus(aj.Q());
                        com.waze.sharedui.profile.b bVar9 = (com.waze.sharedui.profile.b) bVar8.a(new h.g.b.m(com.waze.sharedui.profile.b.class), null, null);
                        com.waze.location.b.d dVar2 = (com.waze.location.b.d) bVar8.a(new h.g.b.m(com.waze.location.b.d.class), null, new com.waze.settings.ao(8));
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("ShareDriveController");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sharedrive.d.b(aVar8, sVar, dgVar2, gVar, bVar9, jVarPlus, dVar2, eVarD7);
                    case 10:
                        int i22 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new s(ShareDriveNativeManager.INSTANCE);
                    case 11:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i23 = v.f38772a;
                        h.g.b.x.f(bVar10, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i24 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar9 = (com.waze.sharedrive.d.a) bVar10.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        com.waze.main_screen.p.b.a.b.c cVar22 = (com.waze.main_screen.p.b.a.b.c) bVar10.a(new h.g.b.m(com.waze.main_screen.p.b.a.b.c.class), null, null);
                        com.waze.main_screen.l.b.e eVar222 = (com.waze.main_screen.l.b.e) bVar10.a(new h.g.b.m(com.waze.main_screen.l.b.e.class), null, null);
                        com.waze.sharedrive.e.w wVar = (com.waze.sharedrive.e.w) bVar10.a(new h.g.b.m(com.waze.sharedrive.e.w.class), null, null);
                        cn cnVar = (cn) bVar10.a(new h.g.b.m(cn.class), null, null);
                        bo boVar = (bo) bVar10.a(new h.g.b.m(bo.class), null, null);
                        bp bpVar = (bp) bVar10.a(new h.g.b.m(bp.class), null, null);
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("LiveShareDriveViewModel");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new at(aVar9, wVar, enVar, cVar22, eVar222, cnVar, boVar, bpVar, eVarD8);
                    case 12:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i25 = v.f38772a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar10 = (com.waze.sharedrive.d.a) bVar11.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        s sVar2 = (s) bVar11.a(new h.g.b.m(s.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("ShareDriveMapIndicationStateHolder");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new bq(aVar10, sVar2, eVarD9);
                    case 13:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i27 = v.f38772a;
                        h.g.b.x.f(bVar12, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar12);
                        int i28 = av.f51370a;
                        cj cjVar = kotlinx.coroutines.e.ac.f51860a;
                        AsyncLayoutInflater asyncLayoutInflater = new AsyncLayoutInflater(k.a.k.h(bVar12));
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("ViewBitmapRenderer");
                        h.g.b.x.e(eVarD10, "create(...)");
                        return new cr(contextH, cjVar, asyncLayoutInflater, eVarD10);
                    case 14:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i29 = v.f38772a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.e.p(k.a.k.h(bVar13), av.b());
                    case 15:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = v.f38772a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = ar.f48106a;
                        co coVar = (co) bVar14.a(new h.g.b.m(co.class), null, null);
                        com.waze.sharedrive.e.a aVar11 = (com.waze.sharedrive.e.a) bVar14.a(new h.g.b.m(com.waze.sharedrive.e.a.class), null, null);
                        MoodManager moodManager = (MoodManager) bVar14.a(new h.g.b.m(MoodManager.class), null, null);
                        kotlinx.coroutines.ab abVarB = av.b();
                        com.waze.shared_infra.i.e eVarD11 = com.waze.shared_infra.i.a.d("ParticipantPinRenderer");
                        h.g.b.x.e(eVarD11, "create(...)");
                        return new bc(coVar, aVar11, moodManager, abVarB, eVarD11, h.o.g.f48282a);
                    case 16:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = v.f38772a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = ar.f48106a;
                        ai aiVar = (ai) bVar15.a(new h.g.b.m(ai.class), null, null);
                        com.waze.map.b.cj cjVar2 = (com.waze.map.b.cj) bVar15.a(new h.g.b.m(com.waze.map.b.cj.class), null, null);
                        com.waze.sharedrive.d.a aVar12 = (com.waze.sharedrive.d.a) bVar15.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.sharedrive.e.av avVar = (com.waze.sharedrive.e.av) bVar15.a(new h.g.b.m(com.waze.sharedrive.e.av.class), null, null);
                        com.waze.shared_infra.i.e eVarD12 = com.waze.shared_infra.i.a.d("LiveDriveMapStateHolder");
                        h.g.b.x.e(eVarD12, "create(...)");
                        return new com.waze.sharedrive.e.x(aiVar, cjVar2, aVar12, avVar, eVarD12);
                    case 17:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = v.f38772a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = ar.f48106a;
                        return new cn((MoodManager) bVar16.a(new h.g.b.m(MoodManager.class), null, null), (com.waze.shared_infra.q.j) bVar16.a(new h.g.b.m(com.waze.shared_infra.q.j.class), null, null));
                    case 18:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = v.f38772a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar13 = (com.waze.sharedrive.d.a) bVar17.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar2 = (cn) bVar17.a(new h.g.b.m(cn.class), null, null);
                        com.waze.mywaze.n nVar = (com.waze.mywaze.n) bVar17.a(new h.g.b.m(com.waze.mywaze.n.class), null, null);
                        com.waze.shared_infra.i.e eVarD13 = com.waze.shared_infra.i.a.d("CreateSharePreviewStateHolder");
                        h.g.b.x.e(eVarD13, "create(...)");
                        return new com.waze.sharedrive.e.e(aVar13, cnVar2, nVar, eVarD13);
                    case 19:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = v.f38772a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar14 = (com.waze.sharedrive.d.a) bVar18.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar3 = (cn) bVar18.a(new h.g.b.m(cn.class), null, null);
                        com.waze.shared_infra.i.e eVarD14 = com.waze.shared_infra.i.a.d("JoinSharePreviewStateHolder");
                        h.g.b.x.e(eVarD14, "create(...)");
                        return new com.waze.sharedrive.e.q(aVar14, cnVar3, eVarD14);
                    default:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = v.f38772a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = ar.f48106a;
                        com.waze.sharedrive.e.e eVar32 = (com.waze.sharedrive.e.e) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.e.class), null, null);
                        com.waze.sharedrive.e.q qVar2 = (com.waze.sharedrive.e.q) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.q.class), null, null);
                        com.waze.sharedrive.d.a aVar15 = (com.waze.sharedrive.d.a) bVar19.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD15 = com.waze.shared_infra.i.a.d("ShareDriveStateHolder");
                        h.g.b.x.e(eVarD15, "create(...)");
                        return new bw(eVar32, qVar2, aVar15, eVarD15);
                }
            }
        };
        org.a.d.e.e eVar11 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(co.class), null, pVar12, cVar, h.a.i.h()));
        aVar.f(eVar11);
        new org.a.d.c.d(aVar, eVar11);
        final int i16 = 14;
        h.g.a.p pVar13 = new h.g.a.p() { // from class: com.waze.sharedrive.t
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                byte[] bArr = null;
                switch (i16) {
                    case 0:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i42 = v.f38772a;
                        h.g.b.x.f(bVar22, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i52 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar22 = (com.waze.sharedrive.d.a) bVar22.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ShareDriveDeeplinkReceiver");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new as(aVar22, eVarD);
                    case 1:
                        org.a.d.k.b bVar222 = (org.a.d.k.b) obj2;
                        int i62 = v.f38772a;
                        h.g.b.x.f(bVar222, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i72 = ar.f48106a;
                        com.waze.map.d dVar = (com.waze.map.d) bVar222.a(new h.g.b.m(com.waze.map.d.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("ShareDriveDataConverter");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.sharedrive.c.q(dVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i82 = v.f38772a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i92 = ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar3.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar = e.a.h.f47759a;
                        h.g.b.x.e(hVar, "DEFAULT");
                        return new ac(iVarB, hVar);
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i102 = v.f38772a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i112 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar3 = (com.waze.sharedrive.b.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.d.a aVar4 = (com.waze.sharedrive.d.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        ao aoVar = (ao) bVar4.a(new h.g.b.m(ao.class), null, null);
                        dg dgVar = (dg) bVar4.a(new h.g.b.m(dg.class), null, null);
                        af afVarE = aj.e(av.a().plus(aj.Q()));
                        com.waze.sharedrive.e.i iVar = com.waze.sharedrive.e.i.f38533a;
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("ShareDriveInterceptor");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new bf(aVar3, aVar4, aoVar, dgVar, afVarE, iVar, eVarD3);
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i122 = v.f38772a;
                        h.g.b.x.f(bVar5, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i132 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar5 = (com.waze.sharedrive.b.a) bVar5.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        ac acVar = (ac) bVar5.a(new h.g.b.m(ac.class), null, null);
                        com.waze.sharedrive.c.q qVar = (com.waze.sharedrive.c.q) bVar5.a(new h.g.b.m(com.waze.sharedrive.c.q.class), null, null);
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("ShareDriveApi");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.sharedrive.c.e(aVar5, acVar, qVar, eVarD4);
                    case 5:
                        int i142 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.b.a();
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i152 = v.f38772a;
                        h.g.b.x.f(bVar6, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar6 = (com.waze.sharedrive.b.a) bVar6.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.c.e eVar22 = (com.waze.sharedrive.c.e) bVar6.a(new h.g.b.m(com.waze.sharedrive.c.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("ShareDriveService");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new com.waze.sharedrive.c.s(aVar6, eVar22, eVarD5);
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i17 = v.f38772a;
                        h.g.b.x.f(bVar7, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar7 = (com.waze.sharedrive.d.a) bVar7.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("EtaDrawerShareButtonStateHolder");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new com.waze.sharedrive.e.j(aVar7, eVarD6);
                    case 8:
                        int i19 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new au(bArr);
                    case 9:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i20 = v.f38772a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i21 = ar.f48106a;
                        com.waze.sharedrive.c.s sVar = (com.waze.sharedrive.c.s) bVar8.a(new h.g.b.m(com.waze.sharedrive.c.s.class), null, null);
                        com.waze.sharedrive.b.a aVar8 = (com.waze.sharedrive.b.a) bVar8.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        dg dgVar2 = (dg) bVar8.a(new h.g.b.m(dg.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar8.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        h.c.j jVarPlus = av.a().plus(aj.Q());
                        com.waze.sharedui.profile.b bVar9 = (com.waze.sharedui.profile.b) bVar8.a(new h.g.b.m(com.waze.sharedui.profile.b.class), null, null);
                        com.waze.location.b.d dVar2 = (com.waze.location.b.d) bVar8.a(new h.g.b.m(com.waze.location.b.d.class), null, new com.waze.settings.ao(8));
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("ShareDriveController");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sharedrive.d.b(aVar8, sVar, dgVar2, gVar, bVar9, jVarPlus, dVar2, eVarD7);
                    case 10:
                        int i22 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new s(ShareDriveNativeManager.INSTANCE);
                    case 11:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i23 = v.f38772a;
                        h.g.b.x.f(bVar10, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i24 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar9 = (com.waze.sharedrive.d.a) bVar10.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        com.waze.main_screen.p.b.a.b.c cVar22 = (com.waze.main_screen.p.b.a.b.c) bVar10.a(new h.g.b.m(com.waze.main_screen.p.b.a.b.c.class), null, null);
                        com.waze.main_screen.l.b.e eVar222 = (com.waze.main_screen.l.b.e) bVar10.a(new h.g.b.m(com.waze.main_screen.l.b.e.class), null, null);
                        com.waze.sharedrive.e.w wVar = (com.waze.sharedrive.e.w) bVar10.a(new h.g.b.m(com.waze.sharedrive.e.w.class), null, null);
                        cn cnVar = (cn) bVar10.a(new h.g.b.m(cn.class), null, null);
                        bo boVar = (bo) bVar10.a(new h.g.b.m(bo.class), null, null);
                        bp bpVar = (bp) bVar10.a(new h.g.b.m(bp.class), null, null);
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("LiveShareDriveViewModel");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new at(aVar9, wVar, enVar, cVar22, eVar222, cnVar, boVar, bpVar, eVarD8);
                    case 12:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i25 = v.f38772a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar10 = (com.waze.sharedrive.d.a) bVar11.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        s sVar2 = (s) bVar11.a(new h.g.b.m(s.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("ShareDriveMapIndicationStateHolder");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new bq(aVar10, sVar2, eVarD9);
                    case 13:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i27 = v.f38772a;
                        h.g.b.x.f(bVar12, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar12);
                        int i28 = av.f51370a;
                        cj cjVar = kotlinx.coroutines.e.ac.f51860a;
                        AsyncLayoutInflater asyncLayoutInflater = new AsyncLayoutInflater(k.a.k.h(bVar12));
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("ViewBitmapRenderer");
                        h.g.b.x.e(eVarD10, "create(...)");
                        return new cr(contextH, cjVar, asyncLayoutInflater, eVarD10);
                    case 14:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i29 = v.f38772a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.e.p(k.a.k.h(bVar13), av.b());
                    case 15:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = v.f38772a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = ar.f48106a;
                        co coVar = (co) bVar14.a(new h.g.b.m(co.class), null, null);
                        com.waze.sharedrive.e.a aVar11 = (com.waze.sharedrive.e.a) bVar14.a(new h.g.b.m(com.waze.sharedrive.e.a.class), null, null);
                        MoodManager moodManager = (MoodManager) bVar14.a(new h.g.b.m(MoodManager.class), null, null);
                        kotlinx.coroutines.ab abVarB = av.b();
                        com.waze.shared_infra.i.e eVarD11 = com.waze.shared_infra.i.a.d("ParticipantPinRenderer");
                        h.g.b.x.e(eVarD11, "create(...)");
                        return new bc(coVar, aVar11, moodManager, abVarB, eVarD11, h.o.g.f48282a);
                    case 16:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = v.f38772a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = ar.f48106a;
                        ai aiVar = (ai) bVar15.a(new h.g.b.m(ai.class), null, null);
                        com.waze.map.b.cj cjVar2 = (com.waze.map.b.cj) bVar15.a(new h.g.b.m(com.waze.map.b.cj.class), null, null);
                        com.waze.sharedrive.d.a aVar12 = (com.waze.sharedrive.d.a) bVar15.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.sharedrive.e.av avVar = (com.waze.sharedrive.e.av) bVar15.a(new h.g.b.m(com.waze.sharedrive.e.av.class), null, null);
                        com.waze.shared_infra.i.e eVarD12 = com.waze.shared_infra.i.a.d("LiveDriveMapStateHolder");
                        h.g.b.x.e(eVarD12, "create(...)");
                        return new com.waze.sharedrive.e.x(aiVar, cjVar2, aVar12, avVar, eVarD12);
                    case 17:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = v.f38772a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = ar.f48106a;
                        return new cn((MoodManager) bVar16.a(new h.g.b.m(MoodManager.class), null, null), (com.waze.shared_infra.q.j) bVar16.a(new h.g.b.m(com.waze.shared_infra.q.j.class), null, null));
                    case 18:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = v.f38772a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar13 = (com.waze.sharedrive.d.a) bVar17.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar2 = (cn) bVar17.a(new h.g.b.m(cn.class), null, null);
                        com.waze.mywaze.n nVar = (com.waze.mywaze.n) bVar17.a(new h.g.b.m(com.waze.mywaze.n.class), null, null);
                        com.waze.shared_infra.i.e eVarD13 = com.waze.shared_infra.i.a.d("CreateSharePreviewStateHolder");
                        h.g.b.x.e(eVarD13, "create(...)");
                        return new com.waze.sharedrive.e.e(aVar13, cnVar2, nVar, eVarD13);
                    case 19:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = v.f38772a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar14 = (com.waze.sharedrive.d.a) bVar18.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar3 = (cn) bVar18.a(new h.g.b.m(cn.class), null, null);
                        com.waze.shared_infra.i.e eVarD14 = com.waze.shared_infra.i.a.d("JoinSharePreviewStateHolder");
                        h.g.b.x.e(eVarD14, "create(...)");
                        return new com.waze.sharedrive.e.q(aVar14, cnVar3, eVarD14);
                    default:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = v.f38772a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = ar.f48106a;
                        com.waze.sharedrive.e.e eVar32 = (com.waze.sharedrive.e.e) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.e.class), null, null);
                        com.waze.sharedrive.e.q qVar2 = (com.waze.sharedrive.e.q) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.q.class), null, null);
                        com.waze.sharedrive.d.a aVar15 = (com.waze.sharedrive.d.a) bVar19.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD15 = com.waze.shared_infra.i.a.d("ShareDriveStateHolder");
                        h.g.b.x.e(eVarD15, "create(...)");
                        return new bw(eVar32, qVar2, aVar15, eVarD15);
                }
            }
        };
        org.a.d.e.e eVar12 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.sharedrive.e.a.class), null, pVar13, cVar, h.a.i.h()));
        aVar.f(eVar12);
        new org.a.d.c.d(aVar, eVar12);
        final int i17 = 15;
        h.g.a.p pVar14 = new h.g.a.p() { // from class: com.waze.sharedrive.t
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                byte[] bArr = null;
                switch (i17) {
                    case 0:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i42 = v.f38772a;
                        h.g.b.x.f(bVar22, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i52 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar22 = (com.waze.sharedrive.d.a) bVar22.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ShareDriveDeeplinkReceiver");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new as(aVar22, eVarD);
                    case 1:
                        org.a.d.k.b bVar222 = (org.a.d.k.b) obj2;
                        int i62 = v.f38772a;
                        h.g.b.x.f(bVar222, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i72 = ar.f48106a;
                        com.waze.map.d dVar = (com.waze.map.d) bVar222.a(new h.g.b.m(com.waze.map.d.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("ShareDriveDataConverter");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.sharedrive.c.q(dVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i82 = v.f38772a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i92 = ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar3.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar = e.a.h.f47759a;
                        h.g.b.x.e(hVar, "DEFAULT");
                        return new ac(iVarB, hVar);
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i102 = v.f38772a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i112 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar3 = (com.waze.sharedrive.b.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.d.a aVar4 = (com.waze.sharedrive.d.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        ao aoVar = (ao) bVar4.a(new h.g.b.m(ao.class), null, null);
                        dg dgVar = (dg) bVar4.a(new h.g.b.m(dg.class), null, null);
                        af afVarE = aj.e(av.a().plus(aj.Q()));
                        com.waze.sharedrive.e.i iVar = com.waze.sharedrive.e.i.f38533a;
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("ShareDriveInterceptor");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new bf(aVar3, aVar4, aoVar, dgVar, afVarE, iVar, eVarD3);
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i122 = v.f38772a;
                        h.g.b.x.f(bVar5, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i132 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar5 = (com.waze.sharedrive.b.a) bVar5.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        ac acVar = (ac) bVar5.a(new h.g.b.m(ac.class), null, null);
                        com.waze.sharedrive.c.q qVar = (com.waze.sharedrive.c.q) bVar5.a(new h.g.b.m(com.waze.sharedrive.c.q.class), null, null);
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("ShareDriveApi");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.sharedrive.c.e(aVar5, acVar, qVar, eVarD4);
                    case 5:
                        int i142 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.b.a();
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i152 = v.f38772a;
                        h.g.b.x.f(bVar6, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar6 = (com.waze.sharedrive.b.a) bVar6.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.c.e eVar22 = (com.waze.sharedrive.c.e) bVar6.a(new h.g.b.m(com.waze.sharedrive.c.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("ShareDriveService");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new com.waze.sharedrive.c.s(aVar6, eVar22, eVarD5);
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i172 = v.f38772a;
                        h.g.b.x.f(bVar7, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar7 = (com.waze.sharedrive.d.a) bVar7.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("EtaDrawerShareButtonStateHolder");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new com.waze.sharedrive.e.j(aVar7, eVarD6);
                    case 8:
                        int i19 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new au(bArr);
                    case 9:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i20 = v.f38772a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i21 = ar.f48106a;
                        com.waze.sharedrive.c.s sVar = (com.waze.sharedrive.c.s) bVar8.a(new h.g.b.m(com.waze.sharedrive.c.s.class), null, null);
                        com.waze.sharedrive.b.a aVar8 = (com.waze.sharedrive.b.a) bVar8.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        dg dgVar2 = (dg) bVar8.a(new h.g.b.m(dg.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar8.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        h.c.j jVarPlus = av.a().plus(aj.Q());
                        com.waze.sharedui.profile.b bVar9 = (com.waze.sharedui.profile.b) bVar8.a(new h.g.b.m(com.waze.sharedui.profile.b.class), null, null);
                        com.waze.location.b.d dVar2 = (com.waze.location.b.d) bVar8.a(new h.g.b.m(com.waze.location.b.d.class), null, new com.waze.settings.ao(8));
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("ShareDriveController");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sharedrive.d.b(aVar8, sVar, dgVar2, gVar, bVar9, jVarPlus, dVar2, eVarD7);
                    case 10:
                        int i22 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new s(ShareDriveNativeManager.INSTANCE);
                    case 11:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i23 = v.f38772a;
                        h.g.b.x.f(bVar10, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i24 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar9 = (com.waze.sharedrive.d.a) bVar10.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        com.waze.main_screen.p.b.a.b.c cVar22 = (com.waze.main_screen.p.b.a.b.c) bVar10.a(new h.g.b.m(com.waze.main_screen.p.b.a.b.c.class), null, null);
                        com.waze.main_screen.l.b.e eVar222 = (com.waze.main_screen.l.b.e) bVar10.a(new h.g.b.m(com.waze.main_screen.l.b.e.class), null, null);
                        com.waze.sharedrive.e.w wVar = (com.waze.sharedrive.e.w) bVar10.a(new h.g.b.m(com.waze.sharedrive.e.w.class), null, null);
                        cn cnVar = (cn) bVar10.a(new h.g.b.m(cn.class), null, null);
                        bo boVar = (bo) bVar10.a(new h.g.b.m(bo.class), null, null);
                        bp bpVar = (bp) bVar10.a(new h.g.b.m(bp.class), null, null);
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("LiveShareDriveViewModel");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new at(aVar9, wVar, enVar, cVar22, eVar222, cnVar, boVar, bpVar, eVarD8);
                    case 12:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i25 = v.f38772a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar10 = (com.waze.sharedrive.d.a) bVar11.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        s sVar2 = (s) bVar11.a(new h.g.b.m(s.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("ShareDriveMapIndicationStateHolder");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new bq(aVar10, sVar2, eVarD9);
                    case 13:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i27 = v.f38772a;
                        h.g.b.x.f(bVar12, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar12);
                        int i28 = av.f51370a;
                        cj cjVar = kotlinx.coroutines.e.ac.f51860a;
                        AsyncLayoutInflater asyncLayoutInflater = new AsyncLayoutInflater(k.a.k.h(bVar12));
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("ViewBitmapRenderer");
                        h.g.b.x.e(eVarD10, "create(...)");
                        return new cr(contextH, cjVar, asyncLayoutInflater, eVarD10);
                    case 14:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i29 = v.f38772a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.e.p(k.a.k.h(bVar13), av.b());
                    case 15:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = v.f38772a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = ar.f48106a;
                        co coVar = (co) bVar14.a(new h.g.b.m(co.class), null, null);
                        com.waze.sharedrive.e.a aVar11 = (com.waze.sharedrive.e.a) bVar14.a(new h.g.b.m(com.waze.sharedrive.e.a.class), null, null);
                        MoodManager moodManager = (MoodManager) bVar14.a(new h.g.b.m(MoodManager.class), null, null);
                        kotlinx.coroutines.ab abVarB = av.b();
                        com.waze.shared_infra.i.e eVarD11 = com.waze.shared_infra.i.a.d("ParticipantPinRenderer");
                        h.g.b.x.e(eVarD11, "create(...)");
                        return new bc(coVar, aVar11, moodManager, abVarB, eVarD11, h.o.g.f48282a);
                    case 16:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = v.f38772a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = ar.f48106a;
                        ai aiVar = (ai) bVar15.a(new h.g.b.m(ai.class), null, null);
                        com.waze.map.b.cj cjVar2 = (com.waze.map.b.cj) bVar15.a(new h.g.b.m(com.waze.map.b.cj.class), null, null);
                        com.waze.sharedrive.d.a aVar12 = (com.waze.sharedrive.d.a) bVar15.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.sharedrive.e.av avVar = (com.waze.sharedrive.e.av) bVar15.a(new h.g.b.m(com.waze.sharedrive.e.av.class), null, null);
                        com.waze.shared_infra.i.e eVarD12 = com.waze.shared_infra.i.a.d("LiveDriveMapStateHolder");
                        h.g.b.x.e(eVarD12, "create(...)");
                        return new com.waze.sharedrive.e.x(aiVar, cjVar2, aVar12, avVar, eVarD12);
                    case 17:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = v.f38772a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = ar.f48106a;
                        return new cn((MoodManager) bVar16.a(new h.g.b.m(MoodManager.class), null, null), (com.waze.shared_infra.q.j) bVar16.a(new h.g.b.m(com.waze.shared_infra.q.j.class), null, null));
                    case 18:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = v.f38772a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar13 = (com.waze.sharedrive.d.a) bVar17.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar2 = (cn) bVar17.a(new h.g.b.m(cn.class), null, null);
                        com.waze.mywaze.n nVar = (com.waze.mywaze.n) bVar17.a(new h.g.b.m(com.waze.mywaze.n.class), null, null);
                        com.waze.shared_infra.i.e eVarD13 = com.waze.shared_infra.i.a.d("CreateSharePreviewStateHolder");
                        h.g.b.x.e(eVarD13, "create(...)");
                        return new com.waze.sharedrive.e.e(aVar13, cnVar2, nVar, eVarD13);
                    case 19:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = v.f38772a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar14 = (com.waze.sharedrive.d.a) bVar18.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar3 = (cn) bVar18.a(new h.g.b.m(cn.class), null, null);
                        com.waze.shared_infra.i.e eVarD14 = com.waze.shared_infra.i.a.d("JoinSharePreviewStateHolder");
                        h.g.b.x.e(eVarD14, "create(...)");
                        return new com.waze.sharedrive.e.q(aVar14, cnVar3, eVarD14);
                    default:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = v.f38772a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = ar.f48106a;
                        com.waze.sharedrive.e.e eVar32 = (com.waze.sharedrive.e.e) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.e.class), null, null);
                        com.waze.sharedrive.e.q qVar2 = (com.waze.sharedrive.e.q) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.q.class), null, null);
                        com.waze.sharedrive.d.a aVar15 = (com.waze.sharedrive.d.a) bVar19.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD15 = com.waze.shared_infra.i.a.d("ShareDriveStateHolder");
                        h.g.b.x.e(eVarD15, "create(...)");
                        return new bw(eVar32, qVar2, aVar15, eVarD15);
                }
            }
        };
        org.a.d.e.e eVar13 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.sharedrive.e.av.class), null, pVar14, cVar, h.a.i.h()));
        aVar.f(eVar13);
        new org.a.d.c.d(aVar, eVar13);
        final int i18 = 16;
        h.g.a.p pVar15 = new h.g.a.p() { // from class: com.waze.sharedrive.t
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                byte[] bArr = null;
                switch (i18) {
                    case 0:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i42 = v.f38772a;
                        h.g.b.x.f(bVar22, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i52 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar22 = (com.waze.sharedrive.d.a) bVar22.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ShareDriveDeeplinkReceiver");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new as(aVar22, eVarD);
                    case 1:
                        org.a.d.k.b bVar222 = (org.a.d.k.b) obj2;
                        int i62 = v.f38772a;
                        h.g.b.x.f(bVar222, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i72 = ar.f48106a;
                        com.waze.map.d dVar = (com.waze.map.d) bVar222.a(new h.g.b.m(com.waze.map.d.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("ShareDriveDataConverter");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.sharedrive.c.q(dVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i82 = v.f38772a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i92 = ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar3.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar = e.a.h.f47759a;
                        h.g.b.x.e(hVar, "DEFAULT");
                        return new ac(iVarB, hVar);
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i102 = v.f38772a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i112 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar3 = (com.waze.sharedrive.b.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.d.a aVar4 = (com.waze.sharedrive.d.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        ao aoVar = (ao) bVar4.a(new h.g.b.m(ao.class), null, null);
                        dg dgVar = (dg) bVar4.a(new h.g.b.m(dg.class), null, null);
                        af afVarE = aj.e(av.a().plus(aj.Q()));
                        com.waze.sharedrive.e.i iVar = com.waze.sharedrive.e.i.f38533a;
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("ShareDriveInterceptor");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new bf(aVar3, aVar4, aoVar, dgVar, afVarE, iVar, eVarD3);
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i122 = v.f38772a;
                        h.g.b.x.f(bVar5, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i132 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar5 = (com.waze.sharedrive.b.a) bVar5.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        ac acVar = (ac) bVar5.a(new h.g.b.m(ac.class), null, null);
                        com.waze.sharedrive.c.q qVar = (com.waze.sharedrive.c.q) bVar5.a(new h.g.b.m(com.waze.sharedrive.c.q.class), null, null);
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("ShareDriveApi");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.sharedrive.c.e(aVar5, acVar, qVar, eVarD4);
                    case 5:
                        int i142 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.b.a();
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i152 = v.f38772a;
                        h.g.b.x.f(bVar6, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar6 = (com.waze.sharedrive.b.a) bVar6.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.c.e eVar22 = (com.waze.sharedrive.c.e) bVar6.a(new h.g.b.m(com.waze.sharedrive.c.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("ShareDriveService");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new com.waze.sharedrive.c.s(aVar6, eVar22, eVarD5);
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i172 = v.f38772a;
                        h.g.b.x.f(bVar7, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i182 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar7 = (com.waze.sharedrive.d.a) bVar7.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("EtaDrawerShareButtonStateHolder");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new com.waze.sharedrive.e.j(aVar7, eVarD6);
                    case 8:
                        int i19 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new au(bArr);
                    case 9:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i20 = v.f38772a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i21 = ar.f48106a;
                        com.waze.sharedrive.c.s sVar = (com.waze.sharedrive.c.s) bVar8.a(new h.g.b.m(com.waze.sharedrive.c.s.class), null, null);
                        com.waze.sharedrive.b.a aVar8 = (com.waze.sharedrive.b.a) bVar8.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        dg dgVar2 = (dg) bVar8.a(new h.g.b.m(dg.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar8.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        h.c.j jVarPlus = av.a().plus(aj.Q());
                        com.waze.sharedui.profile.b bVar9 = (com.waze.sharedui.profile.b) bVar8.a(new h.g.b.m(com.waze.sharedui.profile.b.class), null, null);
                        com.waze.location.b.d dVar2 = (com.waze.location.b.d) bVar8.a(new h.g.b.m(com.waze.location.b.d.class), null, new com.waze.settings.ao(8));
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("ShareDriveController");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sharedrive.d.b(aVar8, sVar, dgVar2, gVar, bVar9, jVarPlus, dVar2, eVarD7);
                    case 10:
                        int i22 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new s(ShareDriveNativeManager.INSTANCE);
                    case 11:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i23 = v.f38772a;
                        h.g.b.x.f(bVar10, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i24 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar9 = (com.waze.sharedrive.d.a) bVar10.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        com.waze.main_screen.p.b.a.b.c cVar22 = (com.waze.main_screen.p.b.a.b.c) bVar10.a(new h.g.b.m(com.waze.main_screen.p.b.a.b.c.class), null, null);
                        com.waze.main_screen.l.b.e eVar222 = (com.waze.main_screen.l.b.e) bVar10.a(new h.g.b.m(com.waze.main_screen.l.b.e.class), null, null);
                        com.waze.sharedrive.e.w wVar = (com.waze.sharedrive.e.w) bVar10.a(new h.g.b.m(com.waze.sharedrive.e.w.class), null, null);
                        cn cnVar = (cn) bVar10.a(new h.g.b.m(cn.class), null, null);
                        bo boVar = (bo) bVar10.a(new h.g.b.m(bo.class), null, null);
                        bp bpVar = (bp) bVar10.a(new h.g.b.m(bp.class), null, null);
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("LiveShareDriveViewModel");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new at(aVar9, wVar, enVar, cVar22, eVar222, cnVar, boVar, bpVar, eVarD8);
                    case 12:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i25 = v.f38772a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar10 = (com.waze.sharedrive.d.a) bVar11.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        s sVar2 = (s) bVar11.a(new h.g.b.m(s.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("ShareDriveMapIndicationStateHolder");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new bq(aVar10, sVar2, eVarD9);
                    case 13:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i27 = v.f38772a;
                        h.g.b.x.f(bVar12, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar12);
                        int i28 = av.f51370a;
                        cj cjVar = kotlinx.coroutines.e.ac.f51860a;
                        AsyncLayoutInflater asyncLayoutInflater = new AsyncLayoutInflater(k.a.k.h(bVar12));
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("ViewBitmapRenderer");
                        h.g.b.x.e(eVarD10, "create(...)");
                        return new cr(contextH, cjVar, asyncLayoutInflater, eVarD10);
                    case 14:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i29 = v.f38772a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.e.p(k.a.k.h(bVar13), av.b());
                    case 15:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = v.f38772a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = ar.f48106a;
                        co coVar = (co) bVar14.a(new h.g.b.m(co.class), null, null);
                        com.waze.sharedrive.e.a aVar11 = (com.waze.sharedrive.e.a) bVar14.a(new h.g.b.m(com.waze.sharedrive.e.a.class), null, null);
                        MoodManager moodManager = (MoodManager) bVar14.a(new h.g.b.m(MoodManager.class), null, null);
                        kotlinx.coroutines.ab abVarB = av.b();
                        com.waze.shared_infra.i.e eVarD11 = com.waze.shared_infra.i.a.d("ParticipantPinRenderer");
                        h.g.b.x.e(eVarD11, "create(...)");
                        return new bc(coVar, aVar11, moodManager, abVarB, eVarD11, h.o.g.f48282a);
                    case 16:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = v.f38772a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = ar.f48106a;
                        ai aiVar = (ai) bVar15.a(new h.g.b.m(ai.class), null, null);
                        com.waze.map.b.cj cjVar2 = (com.waze.map.b.cj) bVar15.a(new h.g.b.m(com.waze.map.b.cj.class), null, null);
                        com.waze.sharedrive.d.a aVar12 = (com.waze.sharedrive.d.a) bVar15.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.sharedrive.e.av avVar = (com.waze.sharedrive.e.av) bVar15.a(new h.g.b.m(com.waze.sharedrive.e.av.class), null, null);
                        com.waze.shared_infra.i.e eVarD12 = com.waze.shared_infra.i.a.d("LiveDriveMapStateHolder");
                        h.g.b.x.e(eVarD12, "create(...)");
                        return new com.waze.sharedrive.e.x(aiVar, cjVar2, aVar12, avVar, eVarD12);
                    case 17:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = v.f38772a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = ar.f48106a;
                        return new cn((MoodManager) bVar16.a(new h.g.b.m(MoodManager.class), null, null), (com.waze.shared_infra.q.j) bVar16.a(new h.g.b.m(com.waze.shared_infra.q.j.class), null, null));
                    case 18:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = v.f38772a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar13 = (com.waze.sharedrive.d.a) bVar17.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar2 = (cn) bVar17.a(new h.g.b.m(cn.class), null, null);
                        com.waze.mywaze.n nVar = (com.waze.mywaze.n) bVar17.a(new h.g.b.m(com.waze.mywaze.n.class), null, null);
                        com.waze.shared_infra.i.e eVarD13 = com.waze.shared_infra.i.a.d("CreateSharePreviewStateHolder");
                        h.g.b.x.e(eVarD13, "create(...)");
                        return new com.waze.sharedrive.e.e(aVar13, cnVar2, nVar, eVarD13);
                    case 19:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = v.f38772a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar14 = (com.waze.sharedrive.d.a) bVar18.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar3 = (cn) bVar18.a(new h.g.b.m(cn.class), null, null);
                        com.waze.shared_infra.i.e eVarD14 = com.waze.shared_infra.i.a.d("JoinSharePreviewStateHolder");
                        h.g.b.x.e(eVarD14, "create(...)");
                        return new com.waze.sharedrive.e.q(aVar14, cnVar3, eVarD14);
                    default:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = v.f38772a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = ar.f48106a;
                        com.waze.sharedrive.e.e eVar32 = (com.waze.sharedrive.e.e) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.e.class), null, null);
                        com.waze.sharedrive.e.q qVar2 = (com.waze.sharedrive.e.q) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.q.class), null, null);
                        com.waze.sharedrive.d.a aVar15 = (com.waze.sharedrive.d.a) bVar19.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD15 = com.waze.shared_infra.i.a.d("ShareDriveStateHolder");
                        h.g.b.x.e(eVarD15, "create(...)");
                        return new bw(eVar32, qVar2, aVar15, eVarD15);
                }
            }
        };
        org.a.d.e.a aVar3 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.sharedrive.e.w.class), null, pVar15, cVar2, h.a.i.h()));
        aVar.f(aVar3);
        new org.a.d.c.d(aVar, aVar3);
        final int i19 = 17;
        h.g.a.p pVar16 = new h.g.a.p() { // from class: com.waze.sharedrive.t
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                byte[] bArr = null;
                switch (i19) {
                    case 0:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i42 = v.f38772a;
                        h.g.b.x.f(bVar22, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i52 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar22 = (com.waze.sharedrive.d.a) bVar22.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ShareDriveDeeplinkReceiver");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new as(aVar22, eVarD);
                    case 1:
                        org.a.d.k.b bVar222 = (org.a.d.k.b) obj2;
                        int i62 = v.f38772a;
                        h.g.b.x.f(bVar222, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i72 = ar.f48106a;
                        com.waze.map.d dVar = (com.waze.map.d) bVar222.a(new h.g.b.m(com.waze.map.d.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("ShareDriveDataConverter");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.sharedrive.c.q(dVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i82 = v.f38772a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i92 = ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar3.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar = e.a.h.f47759a;
                        h.g.b.x.e(hVar, "DEFAULT");
                        return new ac(iVarB, hVar);
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i102 = v.f38772a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i112 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar32 = (com.waze.sharedrive.b.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.d.a aVar4 = (com.waze.sharedrive.d.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        ao aoVar = (ao) bVar4.a(new h.g.b.m(ao.class), null, null);
                        dg dgVar = (dg) bVar4.a(new h.g.b.m(dg.class), null, null);
                        af afVarE = aj.e(av.a().plus(aj.Q()));
                        com.waze.sharedrive.e.i iVar = com.waze.sharedrive.e.i.f38533a;
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("ShareDriveInterceptor");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new bf(aVar32, aVar4, aoVar, dgVar, afVarE, iVar, eVarD3);
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i122 = v.f38772a;
                        h.g.b.x.f(bVar5, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i132 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar5 = (com.waze.sharedrive.b.a) bVar5.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        ac acVar = (ac) bVar5.a(new h.g.b.m(ac.class), null, null);
                        com.waze.sharedrive.c.q qVar = (com.waze.sharedrive.c.q) bVar5.a(new h.g.b.m(com.waze.sharedrive.c.q.class), null, null);
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("ShareDriveApi");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.sharedrive.c.e(aVar5, acVar, qVar, eVarD4);
                    case 5:
                        int i142 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.b.a();
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i152 = v.f38772a;
                        h.g.b.x.f(bVar6, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar6 = (com.waze.sharedrive.b.a) bVar6.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.c.e eVar22 = (com.waze.sharedrive.c.e) bVar6.a(new h.g.b.m(com.waze.sharedrive.c.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("ShareDriveService");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new com.waze.sharedrive.c.s(aVar6, eVar22, eVarD5);
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i172 = v.f38772a;
                        h.g.b.x.f(bVar7, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i182 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar7 = (com.waze.sharedrive.d.a) bVar7.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("EtaDrawerShareButtonStateHolder");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new com.waze.sharedrive.e.j(aVar7, eVarD6);
                    case 8:
                        int i192 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new au(bArr);
                    case 9:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i20 = v.f38772a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i21 = ar.f48106a;
                        com.waze.sharedrive.c.s sVar = (com.waze.sharedrive.c.s) bVar8.a(new h.g.b.m(com.waze.sharedrive.c.s.class), null, null);
                        com.waze.sharedrive.b.a aVar8 = (com.waze.sharedrive.b.a) bVar8.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        dg dgVar2 = (dg) bVar8.a(new h.g.b.m(dg.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar8.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        h.c.j jVarPlus = av.a().plus(aj.Q());
                        com.waze.sharedui.profile.b bVar9 = (com.waze.sharedui.profile.b) bVar8.a(new h.g.b.m(com.waze.sharedui.profile.b.class), null, null);
                        com.waze.location.b.d dVar2 = (com.waze.location.b.d) bVar8.a(new h.g.b.m(com.waze.location.b.d.class), null, new com.waze.settings.ao(8));
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("ShareDriveController");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sharedrive.d.b(aVar8, sVar, dgVar2, gVar, bVar9, jVarPlus, dVar2, eVarD7);
                    case 10:
                        int i22 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new s(ShareDriveNativeManager.INSTANCE);
                    case 11:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i23 = v.f38772a;
                        h.g.b.x.f(bVar10, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i24 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar9 = (com.waze.sharedrive.d.a) bVar10.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        com.waze.main_screen.p.b.a.b.c cVar22 = (com.waze.main_screen.p.b.a.b.c) bVar10.a(new h.g.b.m(com.waze.main_screen.p.b.a.b.c.class), null, null);
                        com.waze.main_screen.l.b.e eVar222 = (com.waze.main_screen.l.b.e) bVar10.a(new h.g.b.m(com.waze.main_screen.l.b.e.class), null, null);
                        com.waze.sharedrive.e.w wVar = (com.waze.sharedrive.e.w) bVar10.a(new h.g.b.m(com.waze.sharedrive.e.w.class), null, null);
                        cn cnVar = (cn) bVar10.a(new h.g.b.m(cn.class), null, null);
                        bo boVar = (bo) bVar10.a(new h.g.b.m(bo.class), null, null);
                        bp bpVar = (bp) bVar10.a(new h.g.b.m(bp.class), null, null);
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("LiveShareDriveViewModel");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new at(aVar9, wVar, enVar, cVar22, eVar222, cnVar, boVar, bpVar, eVarD8);
                    case 12:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i25 = v.f38772a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar10 = (com.waze.sharedrive.d.a) bVar11.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        s sVar2 = (s) bVar11.a(new h.g.b.m(s.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("ShareDriveMapIndicationStateHolder");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new bq(aVar10, sVar2, eVarD9);
                    case 13:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i27 = v.f38772a;
                        h.g.b.x.f(bVar12, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar12);
                        int i28 = av.f51370a;
                        cj cjVar = kotlinx.coroutines.e.ac.f51860a;
                        AsyncLayoutInflater asyncLayoutInflater = new AsyncLayoutInflater(k.a.k.h(bVar12));
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("ViewBitmapRenderer");
                        h.g.b.x.e(eVarD10, "create(...)");
                        return new cr(contextH, cjVar, asyncLayoutInflater, eVarD10);
                    case 14:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i29 = v.f38772a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.e.p(k.a.k.h(bVar13), av.b());
                    case 15:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = v.f38772a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = ar.f48106a;
                        co coVar = (co) bVar14.a(new h.g.b.m(co.class), null, null);
                        com.waze.sharedrive.e.a aVar11 = (com.waze.sharedrive.e.a) bVar14.a(new h.g.b.m(com.waze.sharedrive.e.a.class), null, null);
                        MoodManager moodManager = (MoodManager) bVar14.a(new h.g.b.m(MoodManager.class), null, null);
                        kotlinx.coroutines.ab abVarB = av.b();
                        com.waze.shared_infra.i.e eVarD11 = com.waze.shared_infra.i.a.d("ParticipantPinRenderer");
                        h.g.b.x.e(eVarD11, "create(...)");
                        return new bc(coVar, aVar11, moodManager, abVarB, eVarD11, h.o.g.f48282a);
                    case 16:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = v.f38772a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = ar.f48106a;
                        ai aiVar = (ai) bVar15.a(new h.g.b.m(ai.class), null, null);
                        com.waze.map.b.cj cjVar2 = (com.waze.map.b.cj) bVar15.a(new h.g.b.m(com.waze.map.b.cj.class), null, null);
                        com.waze.sharedrive.d.a aVar12 = (com.waze.sharedrive.d.a) bVar15.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.sharedrive.e.av avVar = (com.waze.sharedrive.e.av) bVar15.a(new h.g.b.m(com.waze.sharedrive.e.av.class), null, null);
                        com.waze.shared_infra.i.e eVarD12 = com.waze.shared_infra.i.a.d("LiveDriveMapStateHolder");
                        h.g.b.x.e(eVarD12, "create(...)");
                        return new com.waze.sharedrive.e.x(aiVar, cjVar2, aVar12, avVar, eVarD12);
                    case 17:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = v.f38772a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = ar.f48106a;
                        return new cn((MoodManager) bVar16.a(new h.g.b.m(MoodManager.class), null, null), (com.waze.shared_infra.q.j) bVar16.a(new h.g.b.m(com.waze.shared_infra.q.j.class), null, null));
                    case 18:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = v.f38772a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar13 = (com.waze.sharedrive.d.a) bVar17.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar2 = (cn) bVar17.a(new h.g.b.m(cn.class), null, null);
                        com.waze.mywaze.n nVar = (com.waze.mywaze.n) bVar17.a(new h.g.b.m(com.waze.mywaze.n.class), null, null);
                        com.waze.shared_infra.i.e eVarD13 = com.waze.shared_infra.i.a.d("CreateSharePreviewStateHolder");
                        h.g.b.x.e(eVarD13, "create(...)");
                        return new com.waze.sharedrive.e.e(aVar13, cnVar2, nVar, eVarD13);
                    case 19:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = v.f38772a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar14 = (com.waze.sharedrive.d.a) bVar18.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar3 = (cn) bVar18.a(new h.g.b.m(cn.class), null, null);
                        com.waze.shared_infra.i.e eVarD14 = com.waze.shared_infra.i.a.d("JoinSharePreviewStateHolder");
                        h.g.b.x.e(eVarD14, "create(...)");
                        return new com.waze.sharedrive.e.q(aVar14, cnVar3, eVarD14);
                    default:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = v.f38772a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = ar.f48106a;
                        com.waze.sharedrive.e.e eVar32 = (com.waze.sharedrive.e.e) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.e.class), null, null);
                        com.waze.sharedrive.e.q qVar2 = (com.waze.sharedrive.e.q) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.q.class), null, null);
                        com.waze.sharedrive.d.a aVar15 = (com.waze.sharedrive.d.a) bVar19.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD15 = com.waze.shared_infra.i.a.d("ShareDriveStateHolder");
                        h.g.b.x.e(eVarD15, "create(...)");
                        return new bw(eVar32, qVar2, aVar15, eVarD15);
                }
            }
        };
        org.a.d.e.e eVar14 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(cn.class), null, pVar16, cVar, h.a.i.h()));
        aVar.f(eVar14);
        new org.a.d.c.d(aVar, eVar14);
        final int i20 = 18;
        h.g.a.p pVar17 = new h.g.a.p() { // from class: com.waze.sharedrive.t
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                byte[] bArr = null;
                switch (i20) {
                    case 0:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i42 = v.f38772a;
                        h.g.b.x.f(bVar22, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i52 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar22 = (com.waze.sharedrive.d.a) bVar22.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ShareDriveDeeplinkReceiver");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new as(aVar22, eVarD);
                    case 1:
                        org.a.d.k.b bVar222 = (org.a.d.k.b) obj2;
                        int i62 = v.f38772a;
                        h.g.b.x.f(bVar222, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i72 = ar.f48106a;
                        com.waze.map.d dVar = (com.waze.map.d) bVar222.a(new h.g.b.m(com.waze.map.d.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("ShareDriveDataConverter");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.sharedrive.c.q(dVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i82 = v.f38772a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i92 = ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar3.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar = e.a.h.f47759a;
                        h.g.b.x.e(hVar, "DEFAULT");
                        return new ac(iVarB, hVar);
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i102 = v.f38772a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i112 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar32 = (com.waze.sharedrive.b.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.d.a aVar4 = (com.waze.sharedrive.d.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        ao aoVar = (ao) bVar4.a(new h.g.b.m(ao.class), null, null);
                        dg dgVar = (dg) bVar4.a(new h.g.b.m(dg.class), null, null);
                        af afVarE = aj.e(av.a().plus(aj.Q()));
                        com.waze.sharedrive.e.i iVar = com.waze.sharedrive.e.i.f38533a;
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("ShareDriveInterceptor");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new bf(aVar32, aVar4, aoVar, dgVar, afVarE, iVar, eVarD3);
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i122 = v.f38772a;
                        h.g.b.x.f(bVar5, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i132 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar5 = (com.waze.sharedrive.b.a) bVar5.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        ac acVar = (ac) bVar5.a(new h.g.b.m(ac.class), null, null);
                        com.waze.sharedrive.c.q qVar = (com.waze.sharedrive.c.q) bVar5.a(new h.g.b.m(com.waze.sharedrive.c.q.class), null, null);
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("ShareDriveApi");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.sharedrive.c.e(aVar5, acVar, qVar, eVarD4);
                    case 5:
                        int i142 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.b.a();
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i152 = v.f38772a;
                        h.g.b.x.f(bVar6, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar6 = (com.waze.sharedrive.b.a) bVar6.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.c.e eVar22 = (com.waze.sharedrive.c.e) bVar6.a(new h.g.b.m(com.waze.sharedrive.c.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("ShareDriveService");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new com.waze.sharedrive.c.s(aVar6, eVar22, eVarD5);
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i172 = v.f38772a;
                        h.g.b.x.f(bVar7, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i182 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar7 = (com.waze.sharedrive.d.a) bVar7.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("EtaDrawerShareButtonStateHolder");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new com.waze.sharedrive.e.j(aVar7, eVarD6);
                    case 8:
                        int i192 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new au(bArr);
                    case 9:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i202 = v.f38772a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i21 = ar.f48106a;
                        com.waze.sharedrive.c.s sVar = (com.waze.sharedrive.c.s) bVar8.a(new h.g.b.m(com.waze.sharedrive.c.s.class), null, null);
                        com.waze.sharedrive.b.a aVar8 = (com.waze.sharedrive.b.a) bVar8.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        dg dgVar2 = (dg) bVar8.a(new h.g.b.m(dg.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar8.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        h.c.j jVarPlus = av.a().plus(aj.Q());
                        com.waze.sharedui.profile.b bVar9 = (com.waze.sharedui.profile.b) bVar8.a(new h.g.b.m(com.waze.sharedui.profile.b.class), null, null);
                        com.waze.location.b.d dVar2 = (com.waze.location.b.d) bVar8.a(new h.g.b.m(com.waze.location.b.d.class), null, new com.waze.settings.ao(8));
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("ShareDriveController");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sharedrive.d.b(aVar8, sVar, dgVar2, gVar, bVar9, jVarPlus, dVar2, eVarD7);
                    case 10:
                        int i22 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new s(ShareDriveNativeManager.INSTANCE);
                    case 11:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i23 = v.f38772a;
                        h.g.b.x.f(bVar10, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i24 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar9 = (com.waze.sharedrive.d.a) bVar10.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        com.waze.main_screen.p.b.a.b.c cVar22 = (com.waze.main_screen.p.b.a.b.c) bVar10.a(new h.g.b.m(com.waze.main_screen.p.b.a.b.c.class), null, null);
                        com.waze.main_screen.l.b.e eVar222 = (com.waze.main_screen.l.b.e) bVar10.a(new h.g.b.m(com.waze.main_screen.l.b.e.class), null, null);
                        com.waze.sharedrive.e.w wVar = (com.waze.sharedrive.e.w) bVar10.a(new h.g.b.m(com.waze.sharedrive.e.w.class), null, null);
                        cn cnVar = (cn) bVar10.a(new h.g.b.m(cn.class), null, null);
                        bo boVar = (bo) bVar10.a(new h.g.b.m(bo.class), null, null);
                        bp bpVar = (bp) bVar10.a(new h.g.b.m(bp.class), null, null);
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("LiveShareDriveViewModel");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new at(aVar9, wVar, enVar, cVar22, eVar222, cnVar, boVar, bpVar, eVarD8);
                    case 12:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i25 = v.f38772a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar10 = (com.waze.sharedrive.d.a) bVar11.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        s sVar2 = (s) bVar11.a(new h.g.b.m(s.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("ShareDriveMapIndicationStateHolder");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new bq(aVar10, sVar2, eVarD9);
                    case 13:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i27 = v.f38772a;
                        h.g.b.x.f(bVar12, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar12);
                        int i28 = av.f51370a;
                        cj cjVar = kotlinx.coroutines.e.ac.f51860a;
                        AsyncLayoutInflater asyncLayoutInflater = new AsyncLayoutInflater(k.a.k.h(bVar12));
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("ViewBitmapRenderer");
                        h.g.b.x.e(eVarD10, "create(...)");
                        return new cr(contextH, cjVar, asyncLayoutInflater, eVarD10);
                    case 14:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i29 = v.f38772a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.e.p(k.a.k.h(bVar13), av.b());
                    case 15:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = v.f38772a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = ar.f48106a;
                        co coVar = (co) bVar14.a(new h.g.b.m(co.class), null, null);
                        com.waze.sharedrive.e.a aVar11 = (com.waze.sharedrive.e.a) bVar14.a(new h.g.b.m(com.waze.sharedrive.e.a.class), null, null);
                        MoodManager moodManager = (MoodManager) bVar14.a(new h.g.b.m(MoodManager.class), null, null);
                        kotlinx.coroutines.ab abVarB = av.b();
                        com.waze.shared_infra.i.e eVarD11 = com.waze.shared_infra.i.a.d("ParticipantPinRenderer");
                        h.g.b.x.e(eVarD11, "create(...)");
                        return new bc(coVar, aVar11, moodManager, abVarB, eVarD11, h.o.g.f48282a);
                    case 16:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = v.f38772a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = ar.f48106a;
                        ai aiVar = (ai) bVar15.a(new h.g.b.m(ai.class), null, null);
                        com.waze.map.b.cj cjVar2 = (com.waze.map.b.cj) bVar15.a(new h.g.b.m(com.waze.map.b.cj.class), null, null);
                        com.waze.sharedrive.d.a aVar12 = (com.waze.sharedrive.d.a) bVar15.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.sharedrive.e.av avVar = (com.waze.sharedrive.e.av) bVar15.a(new h.g.b.m(com.waze.sharedrive.e.av.class), null, null);
                        com.waze.shared_infra.i.e eVarD12 = com.waze.shared_infra.i.a.d("LiveDriveMapStateHolder");
                        h.g.b.x.e(eVarD12, "create(...)");
                        return new com.waze.sharedrive.e.x(aiVar, cjVar2, aVar12, avVar, eVarD12);
                    case 17:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = v.f38772a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = ar.f48106a;
                        return new cn((MoodManager) bVar16.a(new h.g.b.m(MoodManager.class), null, null), (com.waze.shared_infra.q.j) bVar16.a(new h.g.b.m(com.waze.shared_infra.q.j.class), null, null));
                    case 18:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = v.f38772a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar13 = (com.waze.sharedrive.d.a) bVar17.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar2 = (cn) bVar17.a(new h.g.b.m(cn.class), null, null);
                        com.waze.mywaze.n nVar = (com.waze.mywaze.n) bVar17.a(new h.g.b.m(com.waze.mywaze.n.class), null, null);
                        com.waze.shared_infra.i.e eVarD13 = com.waze.shared_infra.i.a.d("CreateSharePreviewStateHolder");
                        h.g.b.x.e(eVarD13, "create(...)");
                        return new com.waze.sharedrive.e.e(aVar13, cnVar2, nVar, eVarD13);
                    case 19:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = v.f38772a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar14 = (com.waze.sharedrive.d.a) bVar18.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar3 = (cn) bVar18.a(new h.g.b.m(cn.class), null, null);
                        com.waze.shared_infra.i.e eVarD14 = com.waze.shared_infra.i.a.d("JoinSharePreviewStateHolder");
                        h.g.b.x.e(eVarD14, "create(...)");
                        return new com.waze.sharedrive.e.q(aVar14, cnVar3, eVarD14);
                    default:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = v.f38772a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = ar.f48106a;
                        com.waze.sharedrive.e.e eVar32 = (com.waze.sharedrive.e.e) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.e.class), null, null);
                        com.waze.sharedrive.e.q qVar2 = (com.waze.sharedrive.e.q) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.q.class), null, null);
                        com.waze.sharedrive.d.a aVar15 = (com.waze.sharedrive.d.a) bVar19.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD15 = com.waze.shared_infra.i.a.d("ShareDriveStateHolder");
                        h.g.b.x.e(eVarD15, "create(...)");
                        return new bw(eVar32, qVar2, aVar15, eVarD15);
                }
            }
        };
        org.a.d.e.e eVar15 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.sharedrive.e.e.class), null, pVar17, cVar, h.a.i.h()));
        aVar.f(eVar15);
        new org.a.d.c.d(aVar, eVar15);
        final int i21 = 19;
        h.g.a.p pVar18 = new h.g.a.p() { // from class: com.waze.sharedrive.t
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                byte[] bArr = null;
                switch (i21) {
                    case 0:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i42 = v.f38772a;
                        h.g.b.x.f(bVar22, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i52 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar22 = (com.waze.sharedrive.d.a) bVar22.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ShareDriveDeeplinkReceiver");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new as(aVar22, eVarD);
                    case 1:
                        org.a.d.k.b bVar222 = (org.a.d.k.b) obj2;
                        int i62 = v.f38772a;
                        h.g.b.x.f(bVar222, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i72 = ar.f48106a;
                        com.waze.map.d dVar = (com.waze.map.d) bVar222.a(new h.g.b.m(com.waze.map.d.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("ShareDriveDataConverter");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.sharedrive.c.q(dVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i82 = v.f38772a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i92 = ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar3.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar = e.a.h.f47759a;
                        h.g.b.x.e(hVar, "DEFAULT");
                        return new ac(iVarB, hVar);
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i102 = v.f38772a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i112 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar32 = (com.waze.sharedrive.b.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.d.a aVar4 = (com.waze.sharedrive.d.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        ao aoVar = (ao) bVar4.a(new h.g.b.m(ao.class), null, null);
                        dg dgVar = (dg) bVar4.a(new h.g.b.m(dg.class), null, null);
                        af afVarE = aj.e(av.a().plus(aj.Q()));
                        com.waze.sharedrive.e.i iVar = com.waze.sharedrive.e.i.f38533a;
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("ShareDriveInterceptor");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new bf(aVar32, aVar4, aoVar, dgVar, afVarE, iVar, eVarD3);
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i122 = v.f38772a;
                        h.g.b.x.f(bVar5, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i132 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar5 = (com.waze.sharedrive.b.a) bVar5.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        ac acVar = (ac) bVar5.a(new h.g.b.m(ac.class), null, null);
                        com.waze.sharedrive.c.q qVar = (com.waze.sharedrive.c.q) bVar5.a(new h.g.b.m(com.waze.sharedrive.c.q.class), null, null);
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("ShareDriveApi");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.sharedrive.c.e(aVar5, acVar, qVar, eVarD4);
                    case 5:
                        int i142 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.b.a();
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i152 = v.f38772a;
                        h.g.b.x.f(bVar6, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar6 = (com.waze.sharedrive.b.a) bVar6.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.c.e eVar22 = (com.waze.sharedrive.c.e) bVar6.a(new h.g.b.m(com.waze.sharedrive.c.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("ShareDriveService");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new com.waze.sharedrive.c.s(aVar6, eVar22, eVarD5);
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i172 = v.f38772a;
                        h.g.b.x.f(bVar7, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i182 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar7 = (com.waze.sharedrive.d.a) bVar7.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("EtaDrawerShareButtonStateHolder");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new com.waze.sharedrive.e.j(aVar7, eVarD6);
                    case 8:
                        int i192 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new au(bArr);
                    case 9:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i202 = v.f38772a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i212 = ar.f48106a;
                        com.waze.sharedrive.c.s sVar = (com.waze.sharedrive.c.s) bVar8.a(new h.g.b.m(com.waze.sharedrive.c.s.class), null, null);
                        com.waze.sharedrive.b.a aVar8 = (com.waze.sharedrive.b.a) bVar8.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        dg dgVar2 = (dg) bVar8.a(new h.g.b.m(dg.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar8.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        h.c.j jVarPlus = av.a().plus(aj.Q());
                        com.waze.sharedui.profile.b bVar9 = (com.waze.sharedui.profile.b) bVar8.a(new h.g.b.m(com.waze.sharedui.profile.b.class), null, null);
                        com.waze.location.b.d dVar2 = (com.waze.location.b.d) bVar8.a(new h.g.b.m(com.waze.location.b.d.class), null, new com.waze.settings.ao(8));
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("ShareDriveController");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sharedrive.d.b(aVar8, sVar, dgVar2, gVar, bVar9, jVarPlus, dVar2, eVarD7);
                    case 10:
                        int i22 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new s(ShareDriveNativeManager.INSTANCE);
                    case 11:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i23 = v.f38772a;
                        h.g.b.x.f(bVar10, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i24 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar9 = (com.waze.sharedrive.d.a) bVar10.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        com.waze.main_screen.p.b.a.b.c cVar22 = (com.waze.main_screen.p.b.a.b.c) bVar10.a(new h.g.b.m(com.waze.main_screen.p.b.a.b.c.class), null, null);
                        com.waze.main_screen.l.b.e eVar222 = (com.waze.main_screen.l.b.e) bVar10.a(new h.g.b.m(com.waze.main_screen.l.b.e.class), null, null);
                        com.waze.sharedrive.e.w wVar = (com.waze.sharedrive.e.w) bVar10.a(new h.g.b.m(com.waze.sharedrive.e.w.class), null, null);
                        cn cnVar = (cn) bVar10.a(new h.g.b.m(cn.class), null, null);
                        bo boVar = (bo) bVar10.a(new h.g.b.m(bo.class), null, null);
                        bp bpVar = (bp) bVar10.a(new h.g.b.m(bp.class), null, null);
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("LiveShareDriveViewModel");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new at(aVar9, wVar, enVar, cVar22, eVar222, cnVar, boVar, bpVar, eVarD8);
                    case 12:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i25 = v.f38772a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar10 = (com.waze.sharedrive.d.a) bVar11.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        s sVar2 = (s) bVar11.a(new h.g.b.m(s.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("ShareDriveMapIndicationStateHolder");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new bq(aVar10, sVar2, eVarD9);
                    case 13:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i27 = v.f38772a;
                        h.g.b.x.f(bVar12, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar12);
                        int i28 = av.f51370a;
                        cj cjVar = kotlinx.coroutines.e.ac.f51860a;
                        AsyncLayoutInflater asyncLayoutInflater = new AsyncLayoutInflater(k.a.k.h(bVar12));
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("ViewBitmapRenderer");
                        h.g.b.x.e(eVarD10, "create(...)");
                        return new cr(contextH, cjVar, asyncLayoutInflater, eVarD10);
                    case 14:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i29 = v.f38772a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.e.p(k.a.k.h(bVar13), av.b());
                    case 15:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = v.f38772a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = ar.f48106a;
                        co coVar = (co) bVar14.a(new h.g.b.m(co.class), null, null);
                        com.waze.sharedrive.e.a aVar11 = (com.waze.sharedrive.e.a) bVar14.a(new h.g.b.m(com.waze.sharedrive.e.a.class), null, null);
                        MoodManager moodManager = (MoodManager) bVar14.a(new h.g.b.m(MoodManager.class), null, null);
                        kotlinx.coroutines.ab abVarB = av.b();
                        com.waze.shared_infra.i.e eVarD11 = com.waze.shared_infra.i.a.d("ParticipantPinRenderer");
                        h.g.b.x.e(eVarD11, "create(...)");
                        return new bc(coVar, aVar11, moodManager, abVarB, eVarD11, h.o.g.f48282a);
                    case 16:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = v.f38772a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = ar.f48106a;
                        ai aiVar = (ai) bVar15.a(new h.g.b.m(ai.class), null, null);
                        com.waze.map.b.cj cjVar2 = (com.waze.map.b.cj) bVar15.a(new h.g.b.m(com.waze.map.b.cj.class), null, null);
                        com.waze.sharedrive.d.a aVar12 = (com.waze.sharedrive.d.a) bVar15.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.sharedrive.e.av avVar = (com.waze.sharedrive.e.av) bVar15.a(new h.g.b.m(com.waze.sharedrive.e.av.class), null, null);
                        com.waze.shared_infra.i.e eVarD12 = com.waze.shared_infra.i.a.d("LiveDriveMapStateHolder");
                        h.g.b.x.e(eVarD12, "create(...)");
                        return new com.waze.sharedrive.e.x(aiVar, cjVar2, aVar12, avVar, eVarD12);
                    case 17:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = v.f38772a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = ar.f48106a;
                        return new cn((MoodManager) bVar16.a(new h.g.b.m(MoodManager.class), null, null), (com.waze.shared_infra.q.j) bVar16.a(new h.g.b.m(com.waze.shared_infra.q.j.class), null, null));
                    case 18:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = v.f38772a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar13 = (com.waze.sharedrive.d.a) bVar17.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar2 = (cn) bVar17.a(new h.g.b.m(cn.class), null, null);
                        com.waze.mywaze.n nVar = (com.waze.mywaze.n) bVar17.a(new h.g.b.m(com.waze.mywaze.n.class), null, null);
                        com.waze.shared_infra.i.e eVarD13 = com.waze.shared_infra.i.a.d("CreateSharePreviewStateHolder");
                        h.g.b.x.e(eVarD13, "create(...)");
                        return new com.waze.sharedrive.e.e(aVar13, cnVar2, nVar, eVarD13);
                    case 19:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = v.f38772a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar14 = (com.waze.sharedrive.d.a) bVar18.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar3 = (cn) bVar18.a(new h.g.b.m(cn.class), null, null);
                        com.waze.shared_infra.i.e eVarD14 = com.waze.shared_infra.i.a.d("JoinSharePreviewStateHolder");
                        h.g.b.x.e(eVarD14, "create(...)");
                        return new com.waze.sharedrive.e.q(aVar14, cnVar3, eVarD14);
                    default:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = v.f38772a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = ar.f48106a;
                        com.waze.sharedrive.e.e eVar32 = (com.waze.sharedrive.e.e) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.e.class), null, null);
                        com.waze.sharedrive.e.q qVar2 = (com.waze.sharedrive.e.q) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.q.class), null, null);
                        com.waze.sharedrive.d.a aVar15 = (com.waze.sharedrive.d.a) bVar19.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD15 = com.waze.shared_infra.i.a.d("ShareDriveStateHolder");
                        h.g.b.x.e(eVarD15, "create(...)");
                        return new bw(eVar32, qVar2, aVar15, eVarD15);
                }
            }
        };
        org.a.d.e.e eVar16 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.sharedrive.e.q.class), null, pVar18, cVar, h.a.i.h()));
        aVar.f(eVar16);
        new org.a.d.c.d(aVar, eVar16);
        final int i22 = 20;
        h.g.a.p pVar19 = new h.g.a.p() { // from class: com.waze.sharedrive.t
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                byte[] bArr = null;
                switch (i22) {
                    case 0:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i42 = v.f38772a;
                        h.g.b.x.f(bVar22, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i52 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar22 = (com.waze.sharedrive.d.a) bVar22.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ShareDriveDeeplinkReceiver");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new as(aVar22, eVarD);
                    case 1:
                        org.a.d.k.b bVar222 = (org.a.d.k.b) obj2;
                        int i62 = v.f38772a;
                        h.g.b.x.f(bVar222, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i72 = ar.f48106a;
                        com.waze.map.d dVar = (com.waze.map.d) bVar222.a(new h.g.b.m(com.waze.map.d.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("ShareDriveDataConverter");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.sharedrive.c.q(dVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i82 = v.f38772a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i92 = ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar3.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar = e.a.h.f47759a;
                        h.g.b.x.e(hVar, "DEFAULT");
                        return new ac(iVarB, hVar);
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i102 = v.f38772a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i112 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar32 = (com.waze.sharedrive.b.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.d.a aVar4 = (com.waze.sharedrive.d.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        ao aoVar = (ao) bVar4.a(new h.g.b.m(ao.class), null, null);
                        dg dgVar = (dg) bVar4.a(new h.g.b.m(dg.class), null, null);
                        af afVarE = aj.e(av.a().plus(aj.Q()));
                        com.waze.sharedrive.e.i iVar = com.waze.sharedrive.e.i.f38533a;
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("ShareDriveInterceptor");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new bf(aVar32, aVar4, aoVar, dgVar, afVarE, iVar, eVarD3);
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i122 = v.f38772a;
                        h.g.b.x.f(bVar5, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i132 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar5 = (com.waze.sharedrive.b.a) bVar5.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        ac acVar = (ac) bVar5.a(new h.g.b.m(ac.class), null, null);
                        com.waze.sharedrive.c.q qVar = (com.waze.sharedrive.c.q) bVar5.a(new h.g.b.m(com.waze.sharedrive.c.q.class), null, null);
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("ShareDriveApi");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.sharedrive.c.e(aVar5, acVar, qVar, eVarD4);
                    case 5:
                        int i142 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.b.a();
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i152 = v.f38772a;
                        h.g.b.x.f(bVar6, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar6 = (com.waze.sharedrive.b.a) bVar6.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.c.e eVar22 = (com.waze.sharedrive.c.e) bVar6.a(new h.g.b.m(com.waze.sharedrive.c.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("ShareDriveService");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new com.waze.sharedrive.c.s(aVar6, eVar22, eVarD5);
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i172 = v.f38772a;
                        h.g.b.x.f(bVar7, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i182 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar7 = (com.waze.sharedrive.d.a) bVar7.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("EtaDrawerShareButtonStateHolder");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new com.waze.sharedrive.e.j(aVar7, eVarD6);
                    case 8:
                        int i192 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new au(bArr);
                    case 9:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i202 = v.f38772a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i212 = ar.f48106a;
                        com.waze.sharedrive.c.s sVar = (com.waze.sharedrive.c.s) bVar8.a(new h.g.b.m(com.waze.sharedrive.c.s.class), null, null);
                        com.waze.sharedrive.b.a aVar8 = (com.waze.sharedrive.b.a) bVar8.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        dg dgVar2 = (dg) bVar8.a(new h.g.b.m(dg.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar8.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        h.c.j jVarPlus = av.a().plus(aj.Q());
                        com.waze.sharedui.profile.b bVar9 = (com.waze.sharedui.profile.b) bVar8.a(new h.g.b.m(com.waze.sharedui.profile.b.class), null, null);
                        com.waze.location.b.d dVar2 = (com.waze.location.b.d) bVar8.a(new h.g.b.m(com.waze.location.b.d.class), null, new com.waze.settings.ao(8));
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("ShareDriveController");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sharedrive.d.b(aVar8, sVar, dgVar2, gVar, bVar9, jVarPlus, dVar2, eVarD7);
                    case 10:
                        int i222 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new s(ShareDriveNativeManager.INSTANCE);
                    case 11:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i23 = v.f38772a;
                        h.g.b.x.f(bVar10, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i24 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar9 = (com.waze.sharedrive.d.a) bVar10.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        com.waze.main_screen.p.b.a.b.c cVar22 = (com.waze.main_screen.p.b.a.b.c) bVar10.a(new h.g.b.m(com.waze.main_screen.p.b.a.b.c.class), null, null);
                        com.waze.main_screen.l.b.e eVar222 = (com.waze.main_screen.l.b.e) bVar10.a(new h.g.b.m(com.waze.main_screen.l.b.e.class), null, null);
                        com.waze.sharedrive.e.w wVar = (com.waze.sharedrive.e.w) bVar10.a(new h.g.b.m(com.waze.sharedrive.e.w.class), null, null);
                        cn cnVar = (cn) bVar10.a(new h.g.b.m(cn.class), null, null);
                        bo boVar = (bo) bVar10.a(new h.g.b.m(bo.class), null, null);
                        bp bpVar = (bp) bVar10.a(new h.g.b.m(bp.class), null, null);
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("LiveShareDriveViewModel");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new at(aVar9, wVar, enVar, cVar22, eVar222, cnVar, boVar, bpVar, eVarD8);
                    case 12:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i25 = v.f38772a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar10 = (com.waze.sharedrive.d.a) bVar11.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        s sVar2 = (s) bVar11.a(new h.g.b.m(s.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("ShareDriveMapIndicationStateHolder");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new bq(aVar10, sVar2, eVarD9);
                    case 13:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i27 = v.f38772a;
                        h.g.b.x.f(bVar12, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar12);
                        int i28 = av.f51370a;
                        cj cjVar = kotlinx.coroutines.e.ac.f51860a;
                        AsyncLayoutInflater asyncLayoutInflater = new AsyncLayoutInflater(k.a.k.h(bVar12));
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("ViewBitmapRenderer");
                        h.g.b.x.e(eVarD10, "create(...)");
                        return new cr(contextH, cjVar, asyncLayoutInflater, eVarD10);
                    case 14:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i29 = v.f38772a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.e.p(k.a.k.h(bVar13), av.b());
                    case 15:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = v.f38772a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = ar.f48106a;
                        co coVar = (co) bVar14.a(new h.g.b.m(co.class), null, null);
                        com.waze.sharedrive.e.a aVar11 = (com.waze.sharedrive.e.a) bVar14.a(new h.g.b.m(com.waze.sharedrive.e.a.class), null, null);
                        MoodManager moodManager = (MoodManager) bVar14.a(new h.g.b.m(MoodManager.class), null, null);
                        kotlinx.coroutines.ab abVarB = av.b();
                        com.waze.shared_infra.i.e eVarD11 = com.waze.shared_infra.i.a.d("ParticipantPinRenderer");
                        h.g.b.x.e(eVarD11, "create(...)");
                        return new bc(coVar, aVar11, moodManager, abVarB, eVarD11, h.o.g.f48282a);
                    case 16:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = v.f38772a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = ar.f48106a;
                        ai aiVar = (ai) bVar15.a(new h.g.b.m(ai.class), null, null);
                        com.waze.map.b.cj cjVar2 = (com.waze.map.b.cj) bVar15.a(new h.g.b.m(com.waze.map.b.cj.class), null, null);
                        com.waze.sharedrive.d.a aVar12 = (com.waze.sharedrive.d.a) bVar15.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.sharedrive.e.av avVar = (com.waze.sharedrive.e.av) bVar15.a(new h.g.b.m(com.waze.sharedrive.e.av.class), null, null);
                        com.waze.shared_infra.i.e eVarD12 = com.waze.shared_infra.i.a.d("LiveDriveMapStateHolder");
                        h.g.b.x.e(eVarD12, "create(...)");
                        return new com.waze.sharedrive.e.x(aiVar, cjVar2, aVar12, avVar, eVarD12);
                    case 17:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = v.f38772a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = ar.f48106a;
                        return new cn((MoodManager) bVar16.a(new h.g.b.m(MoodManager.class), null, null), (com.waze.shared_infra.q.j) bVar16.a(new h.g.b.m(com.waze.shared_infra.q.j.class), null, null));
                    case 18:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = v.f38772a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar13 = (com.waze.sharedrive.d.a) bVar17.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar2 = (cn) bVar17.a(new h.g.b.m(cn.class), null, null);
                        com.waze.mywaze.n nVar = (com.waze.mywaze.n) bVar17.a(new h.g.b.m(com.waze.mywaze.n.class), null, null);
                        com.waze.shared_infra.i.e eVarD13 = com.waze.shared_infra.i.a.d("CreateSharePreviewStateHolder");
                        h.g.b.x.e(eVarD13, "create(...)");
                        return new com.waze.sharedrive.e.e(aVar13, cnVar2, nVar, eVarD13);
                    case 19:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = v.f38772a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar14 = (com.waze.sharedrive.d.a) bVar18.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar3 = (cn) bVar18.a(new h.g.b.m(cn.class), null, null);
                        com.waze.shared_infra.i.e eVarD14 = com.waze.shared_infra.i.a.d("JoinSharePreviewStateHolder");
                        h.g.b.x.e(eVarD14, "create(...)");
                        return new com.waze.sharedrive.e.q(aVar14, cnVar3, eVarD14);
                    default:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = v.f38772a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = ar.f48106a;
                        com.waze.sharedrive.e.e eVar32 = (com.waze.sharedrive.e.e) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.e.class), null, null);
                        com.waze.sharedrive.e.q qVar2 = (com.waze.sharedrive.e.q) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.q.class), null, null);
                        com.waze.sharedrive.d.a aVar15 = (com.waze.sharedrive.d.a) bVar19.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD15 = com.waze.shared_infra.i.a.d("ShareDriveStateHolder");
                        h.g.b.x.e(eVarD15, "create(...)");
                        return new bw(eVar32, qVar2, aVar15, eVarD15);
                }
            }
        };
        org.a.d.e.e eVar17 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(bw.class), null, pVar19, cVar, h.a.i.h()));
        aVar.f(eVar17);
        new org.a.d.c.d(aVar, eVar17);
        final int i23 = 0;
        h.g.a.p pVar20 = new h.g.a.p() { // from class: com.waze.sharedrive.t
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                byte[] bArr = null;
                switch (i23) {
                    case 0:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i42 = v.f38772a;
                        h.g.b.x.f(bVar22, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i52 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar22 = (com.waze.sharedrive.d.a) bVar22.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ShareDriveDeeplinkReceiver");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new as(aVar22, eVarD);
                    case 1:
                        org.a.d.k.b bVar222 = (org.a.d.k.b) obj2;
                        int i62 = v.f38772a;
                        h.g.b.x.f(bVar222, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i72 = ar.f48106a;
                        com.waze.map.d dVar = (com.waze.map.d) bVar222.a(new h.g.b.m(com.waze.map.d.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("ShareDriveDataConverter");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.sharedrive.c.q(dVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i82 = v.f38772a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i92 = ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar3.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar = e.a.h.f47759a;
                        h.g.b.x.e(hVar, "DEFAULT");
                        return new ac(iVarB, hVar);
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i102 = v.f38772a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i112 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar32 = (com.waze.sharedrive.b.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.d.a aVar4 = (com.waze.sharedrive.d.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        ao aoVar = (ao) bVar4.a(new h.g.b.m(ao.class), null, null);
                        dg dgVar = (dg) bVar4.a(new h.g.b.m(dg.class), null, null);
                        af afVarE = aj.e(av.a().plus(aj.Q()));
                        com.waze.sharedrive.e.i iVar = com.waze.sharedrive.e.i.f38533a;
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("ShareDriveInterceptor");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new bf(aVar32, aVar4, aoVar, dgVar, afVarE, iVar, eVarD3);
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i122 = v.f38772a;
                        h.g.b.x.f(bVar5, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i132 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar5 = (com.waze.sharedrive.b.a) bVar5.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        ac acVar = (ac) bVar5.a(new h.g.b.m(ac.class), null, null);
                        com.waze.sharedrive.c.q qVar = (com.waze.sharedrive.c.q) bVar5.a(new h.g.b.m(com.waze.sharedrive.c.q.class), null, null);
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("ShareDriveApi");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.sharedrive.c.e(aVar5, acVar, qVar, eVarD4);
                    case 5:
                        int i142 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.b.a();
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i152 = v.f38772a;
                        h.g.b.x.f(bVar6, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar6 = (com.waze.sharedrive.b.a) bVar6.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.c.e eVar22 = (com.waze.sharedrive.c.e) bVar6.a(new h.g.b.m(com.waze.sharedrive.c.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("ShareDriveService");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new com.waze.sharedrive.c.s(aVar6, eVar22, eVarD5);
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i172 = v.f38772a;
                        h.g.b.x.f(bVar7, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i182 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar7 = (com.waze.sharedrive.d.a) bVar7.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("EtaDrawerShareButtonStateHolder");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new com.waze.sharedrive.e.j(aVar7, eVarD6);
                    case 8:
                        int i192 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new au(bArr);
                    case 9:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i202 = v.f38772a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i212 = ar.f48106a;
                        com.waze.sharedrive.c.s sVar = (com.waze.sharedrive.c.s) bVar8.a(new h.g.b.m(com.waze.sharedrive.c.s.class), null, null);
                        com.waze.sharedrive.b.a aVar8 = (com.waze.sharedrive.b.a) bVar8.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        dg dgVar2 = (dg) bVar8.a(new h.g.b.m(dg.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar8.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        h.c.j jVarPlus = av.a().plus(aj.Q());
                        com.waze.sharedui.profile.b bVar9 = (com.waze.sharedui.profile.b) bVar8.a(new h.g.b.m(com.waze.sharedui.profile.b.class), null, null);
                        com.waze.location.b.d dVar2 = (com.waze.location.b.d) bVar8.a(new h.g.b.m(com.waze.location.b.d.class), null, new com.waze.settings.ao(8));
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("ShareDriveController");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sharedrive.d.b(aVar8, sVar, dgVar2, gVar, bVar9, jVarPlus, dVar2, eVarD7);
                    case 10:
                        int i222 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new s(ShareDriveNativeManager.INSTANCE);
                    case 11:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i232 = v.f38772a;
                        h.g.b.x.f(bVar10, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i24 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar9 = (com.waze.sharedrive.d.a) bVar10.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        com.waze.main_screen.p.b.a.b.c cVar22 = (com.waze.main_screen.p.b.a.b.c) bVar10.a(new h.g.b.m(com.waze.main_screen.p.b.a.b.c.class), null, null);
                        com.waze.main_screen.l.b.e eVar222 = (com.waze.main_screen.l.b.e) bVar10.a(new h.g.b.m(com.waze.main_screen.l.b.e.class), null, null);
                        com.waze.sharedrive.e.w wVar = (com.waze.sharedrive.e.w) bVar10.a(new h.g.b.m(com.waze.sharedrive.e.w.class), null, null);
                        cn cnVar = (cn) bVar10.a(new h.g.b.m(cn.class), null, null);
                        bo boVar = (bo) bVar10.a(new h.g.b.m(bo.class), null, null);
                        bp bpVar = (bp) bVar10.a(new h.g.b.m(bp.class), null, null);
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("LiveShareDriveViewModel");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new at(aVar9, wVar, enVar, cVar22, eVar222, cnVar, boVar, bpVar, eVarD8);
                    case 12:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i25 = v.f38772a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar10 = (com.waze.sharedrive.d.a) bVar11.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        s sVar2 = (s) bVar11.a(new h.g.b.m(s.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("ShareDriveMapIndicationStateHolder");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new bq(aVar10, sVar2, eVarD9);
                    case 13:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i27 = v.f38772a;
                        h.g.b.x.f(bVar12, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar12);
                        int i28 = av.f51370a;
                        cj cjVar = kotlinx.coroutines.e.ac.f51860a;
                        AsyncLayoutInflater asyncLayoutInflater = new AsyncLayoutInflater(k.a.k.h(bVar12));
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("ViewBitmapRenderer");
                        h.g.b.x.e(eVarD10, "create(...)");
                        return new cr(contextH, cjVar, asyncLayoutInflater, eVarD10);
                    case 14:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i29 = v.f38772a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.e.p(k.a.k.h(bVar13), av.b());
                    case 15:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = v.f38772a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = ar.f48106a;
                        co coVar = (co) bVar14.a(new h.g.b.m(co.class), null, null);
                        com.waze.sharedrive.e.a aVar11 = (com.waze.sharedrive.e.a) bVar14.a(new h.g.b.m(com.waze.sharedrive.e.a.class), null, null);
                        MoodManager moodManager = (MoodManager) bVar14.a(new h.g.b.m(MoodManager.class), null, null);
                        kotlinx.coroutines.ab abVarB = av.b();
                        com.waze.shared_infra.i.e eVarD11 = com.waze.shared_infra.i.a.d("ParticipantPinRenderer");
                        h.g.b.x.e(eVarD11, "create(...)");
                        return new bc(coVar, aVar11, moodManager, abVarB, eVarD11, h.o.g.f48282a);
                    case 16:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = v.f38772a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = ar.f48106a;
                        ai aiVar = (ai) bVar15.a(new h.g.b.m(ai.class), null, null);
                        com.waze.map.b.cj cjVar2 = (com.waze.map.b.cj) bVar15.a(new h.g.b.m(com.waze.map.b.cj.class), null, null);
                        com.waze.sharedrive.d.a aVar12 = (com.waze.sharedrive.d.a) bVar15.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.sharedrive.e.av avVar = (com.waze.sharedrive.e.av) bVar15.a(new h.g.b.m(com.waze.sharedrive.e.av.class), null, null);
                        com.waze.shared_infra.i.e eVarD12 = com.waze.shared_infra.i.a.d("LiveDriveMapStateHolder");
                        h.g.b.x.e(eVarD12, "create(...)");
                        return new com.waze.sharedrive.e.x(aiVar, cjVar2, aVar12, avVar, eVarD12);
                    case 17:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = v.f38772a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = ar.f48106a;
                        return new cn((MoodManager) bVar16.a(new h.g.b.m(MoodManager.class), null, null), (com.waze.shared_infra.q.j) bVar16.a(new h.g.b.m(com.waze.shared_infra.q.j.class), null, null));
                    case 18:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = v.f38772a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar13 = (com.waze.sharedrive.d.a) bVar17.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar2 = (cn) bVar17.a(new h.g.b.m(cn.class), null, null);
                        com.waze.mywaze.n nVar = (com.waze.mywaze.n) bVar17.a(new h.g.b.m(com.waze.mywaze.n.class), null, null);
                        com.waze.shared_infra.i.e eVarD13 = com.waze.shared_infra.i.a.d("CreateSharePreviewStateHolder");
                        h.g.b.x.e(eVarD13, "create(...)");
                        return new com.waze.sharedrive.e.e(aVar13, cnVar2, nVar, eVarD13);
                    case 19:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = v.f38772a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar14 = (com.waze.sharedrive.d.a) bVar18.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar3 = (cn) bVar18.a(new h.g.b.m(cn.class), null, null);
                        com.waze.shared_infra.i.e eVarD14 = com.waze.shared_infra.i.a.d("JoinSharePreviewStateHolder");
                        h.g.b.x.e(eVarD14, "create(...)");
                        return new com.waze.sharedrive.e.q(aVar14, cnVar3, eVarD14);
                    default:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = v.f38772a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = ar.f48106a;
                        com.waze.sharedrive.e.e eVar32 = (com.waze.sharedrive.e.e) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.e.class), null, null);
                        com.waze.sharedrive.e.q qVar2 = (com.waze.sharedrive.e.q) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.q.class), null, null);
                        com.waze.sharedrive.d.a aVar15 = (com.waze.sharedrive.d.a) bVar19.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD15 = com.waze.shared_infra.i.a.d("ShareDriveStateHolder");
                        h.g.b.x.e(eVarD15, "create(...)");
                        return new bw(eVar32, qVar2, aVar15, eVarD15);
                }
            }
        };
        org.a.d.e.e eVar18 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(as.class), null, pVar20, cVar, h.a.i.h()));
        aVar.f(eVar18);
        new org.a.d.c.d(aVar, eVar18);
        final int i24 = 3;
        h.g.a.p pVar21 = new h.g.a.p() { // from class: com.waze.sharedrive.t
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                byte[] bArr = null;
                switch (i24) {
                    case 0:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i42 = v.f38772a;
                        h.g.b.x.f(bVar22, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i52 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar22 = (com.waze.sharedrive.d.a) bVar22.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ShareDriveDeeplinkReceiver");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new as(aVar22, eVarD);
                    case 1:
                        org.a.d.k.b bVar222 = (org.a.d.k.b) obj2;
                        int i62 = v.f38772a;
                        h.g.b.x.f(bVar222, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i72 = ar.f48106a;
                        com.waze.map.d dVar = (com.waze.map.d) bVar222.a(new h.g.b.m(com.waze.map.d.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("ShareDriveDataConverter");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.sharedrive.c.q(dVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i82 = v.f38772a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i92 = ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar3.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar = e.a.h.f47759a;
                        h.g.b.x.e(hVar, "DEFAULT");
                        return new ac(iVarB, hVar);
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i102 = v.f38772a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i112 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar32 = (com.waze.sharedrive.b.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.d.a aVar4 = (com.waze.sharedrive.d.a) bVar4.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        ao aoVar = (ao) bVar4.a(new h.g.b.m(ao.class), null, null);
                        dg dgVar = (dg) bVar4.a(new h.g.b.m(dg.class), null, null);
                        af afVarE = aj.e(av.a().plus(aj.Q()));
                        com.waze.sharedrive.e.i iVar = com.waze.sharedrive.e.i.f38533a;
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("ShareDriveInterceptor");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new bf(aVar32, aVar4, aoVar, dgVar, afVarE, iVar, eVarD3);
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i122 = v.f38772a;
                        h.g.b.x.f(bVar5, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i132 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar5 = (com.waze.sharedrive.b.a) bVar5.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        ac acVar = (ac) bVar5.a(new h.g.b.m(ac.class), null, null);
                        com.waze.sharedrive.c.q qVar = (com.waze.sharedrive.c.q) bVar5.a(new h.g.b.m(com.waze.sharedrive.c.q.class), null, null);
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("ShareDriveApi");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.sharedrive.c.e(aVar5, acVar, qVar, eVarD4);
                    case 5:
                        int i142 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.b.a();
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i152 = v.f38772a;
                        h.g.b.x.f(bVar6, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = ar.f48106a;
                        com.waze.sharedrive.b.a aVar6 = (com.waze.sharedrive.b.a) bVar6.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        com.waze.sharedrive.c.e eVar22 = (com.waze.sharedrive.c.e) bVar6.a(new h.g.b.m(com.waze.sharedrive.c.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("ShareDriveService");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new com.waze.sharedrive.c.s(aVar6, eVar22, eVarD5);
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i172 = v.f38772a;
                        h.g.b.x.f(bVar7, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i182 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar7 = (com.waze.sharedrive.d.a) bVar7.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("EtaDrawerShareButtonStateHolder");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new com.waze.sharedrive.e.j(aVar7, eVarD6);
                    case 8:
                        int i192 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new au(bArr);
                    case 9:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i202 = v.f38772a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i212 = ar.f48106a;
                        com.waze.sharedrive.c.s sVar = (com.waze.sharedrive.c.s) bVar8.a(new h.g.b.m(com.waze.sharedrive.c.s.class), null, null);
                        com.waze.sharedrive.b.a aVar8 = (com.waze.sharedrive.b.a) bVar8.a(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
                        dg dgVar2 = (dg) bVar8.a(new h.g.b.m(dg.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar8.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        h.c.j jVarPlus = av.a().plus(aj.Q());
                        com.waze.sharedui.profile.b bVar9 = (com.waze.sharedui.profile.b) bVar8.a(new h.g.b.m(com.waze.sharedui.profile.b.class), null, null);
                        com.waze.location.b.d dVar2 = (com.waze.location.b.d) bVar8.a(new h.g.b.m(com.waze.location.b.d.class), null, new com.waze.settings.ao(8));
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("ShareDriveController");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sharedrive.d.b(aVar8, sVar, dgVar2, gVar, bVar9, jVarPlus, dVar2, eVarD7);
                    case 10:
                        int i222 = v.f38772a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new s(ShareDriveNativeManager.INSTANCE);
                    case 11:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i232 = v.f38772a;
                        h.g.b.x.f(bVar10, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i242 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar9 = (com.waze.sharedrive.d.a) bVar10.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        com.waze.main_screen.p.b.a.b.c cVar22 = (com.waze.main_screen.p.b.a.b.c) bVar10.a(new h.g.b.m(com.waze.main_screen.p.b.a.b.c.class), null, null);
                        com.waze.main_screen.l.b.e eVar222 = (com.waze.main_screen.l.b.e) bVar10.a(new h.g.b.m(com.waze.main_screen.l.b.e.class), null, null);
                        com.waze.sharedrive.e.w wVar = (com.waze.sharedrive.e.w) bVar10.a(new h.g.b.m(com.waze.sharedrive.e.w.class), null, null);
                        cn cnVar = (cn) bVar10.a(new h.g.b.m(cn.class), null, null);
                        bo boVar = (bo) bVar10.a(new h.g.b.m(bo.class), null, null);
                        bp bpVar = (bp) bVar10.a(new h.g.b.m(bp.class), null, null);
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("LiveShareDriveViewModel");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new at(aVar9, wVar, enVar, cVar22, eVar222, cnVar, boVar, bpVar, eVarD8);
                    case 12:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i25 = v.f38772a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar10 = (com.waze.sharedrive.d.a) bVar11.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        s sVar2 = (s) bVar11.a(new h.g.b.m(s.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("ShareDriveMapIndicationStateHolder");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new bq(aVar10, sVar2, eVarD9);
                    case 13:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i27 = v.f38772a;
                        h.g.b.x.f(bVar12, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar12);
                        int i28 = av.f51370a;
                        cj cjVar = kotlinx.coroutines.e.ac.f51860a;
                        AsyncLayoutInflater asyncLayoutInflater = new AsyncLayoutInflater(k.a.k.h(bVar12));
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("ViewBitmapRenderer");
                        h.g.b.x.e(eVarD10, "create(...)");
                        return new cr(contextH, cjVar, asyncLayoutInflater, eVarD10);
                    case 14:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i29 = v.f38772a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sharedrive.e.p(k.a.k.h(bVar13), av.b());
                    case 15:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = v.f38772a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = ar.f48106a;
                        co coVar = (co) bVar14.a(new h.g.b.m(co.class), null, null);
                        com.waze.sharedrive.e.a aVar11 = (com.waze.sharedrive.e.a) bVar14.a(new h.g.b.m(com.waze.sharedrive.e.a.class), null, null);
                        MoodManager moodManager = (MoodManager) bVar14.a(new h.g.b.m(MoodManager.class), null, null);
                        kotlinx.coroutines.ab abVarB = av.b();
                        com.waze.shared_infra.i.e eVarD11 = com.waze.shared_infra.i.a.d("ParticipantPinRenderer");
                        h.g.b.x.e(eVarD11, "create(...)");
                        return new bc(coVar, aVar11, moodManager, abVarB, eVarD11, h.o.g.f48282a);
                    case 16:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = v.f38772a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = ar.f48106a;
                        ai aiVar = (ai) bVar15.a(new h.g.b.m(ai.class), null, null);
                        com.waze.map.b.cj cjVar2 = (com.waze.map.b.cj) bVar15.a(new h.g.b.m(com.waze.map.b.cj.class), null, null);
                        com.waze.sharedrive.d.a aVar12 = (com.waze.sharedrive.d.a) bVar15.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.sharedrive.e.av avVar = (com.waze.sharedrive.e.av) bVar15.a(new h.g.b.m(com.waze.sharedrive.e.av.class), null, null);
                        com.waze.shared_infra.i.e eVarD12 = com.waze.shared_infra.i.a.d("LiveDriveMapStateHolder");
                        h.g.b.x.e(eVarD12, "create(...)");
                        return new com.waze.sharedrive.e.x(aiVar, cjVar2, aVar12, avVar, eVarD12);
                    case 17:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = v.f38772a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = ar.f48106a;
                        return new cn((MoodManager) bVar16.a(new h.g.b.m(MoodManager.class), null, null), (com.waze.shared_infra.q.j) bVar16.a(new h.g.b.m(com.waze.shared_infra.q.j.class), null, null));
                    case 18:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = v.f38772a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar13 = (com.waze.sharedrive.d.a) bVar17.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar2 = (cn) bVar17.a(new h.g.b.m(cn.class), null, null);
                        com.waze.mywaze.n nVar = (com.waze.mywaze.n) bVar17.a(new h.g.b.m(com.waze.mywaze.n.class), null, null);
                        com.waze.shared_infra.i.e eVarD13 = com.waze.shared_infra.i.a.d("CreateSharePreviewStateHolder");
                        h.g.b.x.e(eVarD13, "create(...)");
                        return new com.waze.sharedrive.e.e(aVar13, cnVar2, nVar, eVarD13);
                    case 19:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = v.f38772a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = ar.f48106a;
                        com.waze.sharedrive.d.a aVar14 = (com.waze.sharedrive.d.a) bVar18.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        cn cnVar3 = (cn) bVar18.a(new h.g.b.m(cn.class), null, null);
                        com.waze.shared_infra.i.e eVarD14 = com.waze.shared_infra.i.a.d("JoinSharePreviewStateHolder");
                        h.g.b.x.e(eVarD14, "create(...)");
                        return new com.waze.sharedrive.e.q(aVar14, cnVar3, eVarD14);
                    default:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = v.f38772a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = ar.f48106a;
                        com.waze.sharedrive.e.e eVar32 = (com.waze.sharedrive.e.e) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.e.class), null, null);
                        com.waze.sharedrive.e.q qVar2 = (com.waze.sharedrive.e.q) bVar19.a(new h.g.b.m(com.waze.sharedrive.e.q.class), null, null);
                        com.waze.sharedrive.d.a aVar15 = (com.waze.sharedrive.d.a) bVar19.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                        com.waze.shared_infra.i.e eVarD15 = com.waze.shared_infra.i.a.d("ShareDriveStateHolder");
                        h.g.b.x.e(eVarD15, "create(...)");
                        return new bw(eVar32, qVar2, aVar15, eVarD15);
                }
            }
        };
        org.a.d.e.e eVar19 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(bf.class), null, pVar21, cVar, h.a.i.h()));
        aVar.f(eVar19);
        new org.a.d.c.d(aVar, eVar19);
        return h.ab.f48028a;
    }
}
