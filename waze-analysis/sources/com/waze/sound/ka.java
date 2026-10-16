package com.waze.sound;

import android.content.Context;
import com.waze.navigate.DriveToNativeManager;
import com.waze.settings.CustomVoicesFallbackVoicePickerActivity;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class ka implements h.g.a.l {
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        org.a.d.g.a aVar = (org.a.d.g.a) obj;
        int i2 = kb.f40359a;
        h.g.b.x.f(aVar, "$this$module");
        final int i3 = 7;
        eq eqVar = new eq(i3);
        org.a.d.i.b bVar = org.a.d.j.a.f56411b;
        org.a.d.c.c cVar = org.a.d.c.c.f56382a;
        List listH = h.a.i.h();
        int i4 = h.g.b.ar.f48106a;
        org.a.d.e.e eVar = new org.a.d.e.e(new org.a.d.c.a(bVar, new h.g.b.m(kc.class), null, eqVar, cVar, listH));
        aVar.f(eVar);
        new org.a.d.c.d(aVar, eVar);
        final int i5 = 9;
        eq eqVar2 = new eq(i5);
        org.a.d.e.e eVar2 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(VoicesNativeManager.class), null, eqVar2, cVar, h.a.i.h()));
        aVar.f(eVar2);
        new org.a.d.c.d(aVar, eVar2);
        final int i6 = 1;
        h.g.a.p pVar = new h.g.a.p() { // from class: com.waze.sound.jz
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i7 = kb.f40359a;
                        h.g.b.x.f(bVar2, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i8 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar2 = (com.waze.sound.a.c) bVar2.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar = (com.waze.sound.a.h) bVar2.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        com.waze.copilot.a.u uVar = (com.waze.copilot.a.u) bVar2.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        kotlinx.coroutines.ab abVarB = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("CustomVoicesFallbackVoicePickerViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.settings.ae(cVar2, hVar, uVar, eVarD, abVarB);
                    case 1:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i9 = kb.f40359a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i10 = h.g.b.ar.f48106a;
                        ik ikVar = (ik) bVar3.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar3 = (com.waze.sound.a.c) bVar3.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        fm fmVar = (fm) bVar3.a(new h.g.b.m(fm.class), null, null);
                        iv ivVar = (iv) bVar3.a(new h.g.b.m(iv.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("VoiceAssetsUseCase");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new ie(ikVar, cVar3, ivVar, fmVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i11 = kb.f40359a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i12 = h.g.b.ar.f48106a;
                        com.waze.sharedui.f.k kVar = (com.waze.sharedui.f.k) bVar4.a(new h.g.b.m(com.waze.sharedui.f.k.class), null, null);
                        com.waze.shared_infra.i.b bVar5 = (com.waze.shared_infra.i.b) bVar4.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("VoiceListDataSource");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new jq(eVarD3, kVar, bVar5);
                    case 3:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i13 = kb.f40359a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i14 = h.g.b.ar.f48106a;
                        return new com.waze.sound.f.k((com.waze.stats.ax) bVar6.a(new h.g.b.m(com.waze.stats.ax.class), null, null));
                    case 4:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i15 = kb.f40359a;
                        h.g.b.x.f(bVar7, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar4 = (com.waze.sound.a.c) bVar7.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar2 = (com.waze.sound.a.h) bVar7.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        bj bjVar = (bj) bVar7.a(new h.g.b.m(bj.class), null, null);
                        com.waze.copilot.a.u uVar2 = (com.waze.copilot.a.u) bVar7.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        bg bgVar = (bg) bVar7.a(new h.g.b.m(bg.class), null, null);
                        hx hxVar = (hx) bVar7.a(new h.g.b.m(hx.class), null, null);
                        com.waze.mywaze.ah ahVar = (com.waze.mywaze.ah) bVar7.a(new h.g.b.m(com.waze.mywaze.ah.class), null, null);
                        com.waze.settings.eb ebVar = (com.waze.settings.eb) bVar7.a(new h.g.b.m(com.waze.settings.eb.class), null, null);
                        com.waze.search.c.m mVar = (com.waze.search.c.m) bVar7.a(new h.g.b.m(com.waze.search.c.m.class), null, null);
                        kotlinx.coroutines.ab abVarB2 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("VoiceSettingsViewModel");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.settings.i.a.q(cVar4, hVar2, bjVar, uVar2, bgVar, hxVar, ahVar, ebVar, mVar, eVarD4, abVarB2);
                    case 5:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i17 = kb.f40359a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = h.g.b.ar.f48106a;
                        return new com.waze.sound.e.k((bs) bVar8.a(new h.g.b.m(bs.class), null, null), (com.waze.settings.eb) bVar8.a(new h.g.b.m(com.waze.settings.eb.class), null, null), (com.waze.sound.a.c) bVar8.a(new h.g.b.m(com.waze.sound.a.c.class), null, null), (bj) bVar8.a(new h.g.b.m(bj.class), null, null));
                    case 6:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i19 = kb.f40359a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.sound.b.a((TtsNativeManager) bVar9.a(new h.g.b.m(TtsNativeManager.class), null, null));
                    case 7:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = kb.f40359a;
                        h.g.b.x.f(bVar10, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        ic icVar = (ic) bVar10.a(new h.g.b.m(ic.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("VoiceAssetsNativeManager");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new VoiceAssetsNativeManager(icVar, eVarD5, null, 4, null);
                    case 8:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i23 = kb.f40359a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar11);
                        int i24 = h.g.b.ar.f48106a;
                        kc kcVar = (kc) bVar11.a(new h.g.b.m(kc.class), null, null);
                        iw iwVar = (iw) bVar11.a(new h.g.b.m(iw.class), null, null);
                        com.waze.sound.f.j jVar = (com.waze.sound.f.j) bVar11.a(new h.g.b.m(com.waze.sound.f.j.class), null, null);
                        em emVar = (em) bVar11.a(new h.g.b.m(em.class), null, null);
                        kotlinx.coroutines.ab abVarB3 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.b bVar12 = (com.waze.shared_infra.i.b) bVar11.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("VoiceFilesProviderImpl");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new jl(contextH, kcVar, eVarD6, iwVar, jVar, emVar, bVar12, abVarB3);
                    case 9:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i25 = kb.f40359a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = h.g.b.ar.f48106a;
                        hz hzVar = (hz) bVar13.a(new h.g.b.m(hz.class), null, null);
                        VoicesNativeManager voicesNativeManager = (VoicesNativeManager) bVar13.a(new h.g.b.m(VoicesNativeManager.class), null, null);
                        iv ivVar2 = (iv) bVar13.a(new h.g.b.m(iv.class), null, null);
                        com.waze.sound.a.d dVar = (com.waze.sound.a.d) bVar13.a(new h.g.b.m(com.waze.sound.a.d.class), null, null);
                        com.waze.sound.a.e eVar3 = (com.waze.sound.a.e) bVar13.a(new h.g.b.m(com.waze.sound.a.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("VoiceRepository");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sound.a.g(hzVar, voicesNativeManager, ivVar2, dVar, eVar3, eVarD7);
                    case 10:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i27 = kb.f40359a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i28 = h.g.b.ar.f48106a;
                        return new com.waze.sound.a.d((em) bVar14.a(new h.g.b.m(em.class), null, null));
                    case 11:
                        int i29 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sound.a.e();
                    case 12:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i30 = kb.f40359a;
                        h.g.b.x.f(bVar15, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        String path = k.a.k.h(bVar15).getCacheDir().getPath();
                        h.g.b.x.e(path, "getPath(...)");
                        com.waze.shared_infra.coordinators.c cVar5 = new com.waze.shared_infra.coordinators.c(new com.waze.shared_infra.b.b(path, "voiceAssetCacheFile"));
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("VoiceAssetProtoCache");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new hz(eVarD8, cVar5);
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i31 = kb.f40359a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i32 = h.g.b.ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar16.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar3 = e.a.h.f47759a;
                        h.g.b.x.e(hVar3, "DEFAULT");
                        return new com.waze.ce.ab(iVarB, hVar3);
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i33 = kb.f40359a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i34 = h.g.b.ar.f48106a;
                        return new ju((com.waze.ce.ab) bVar17.a(new h.g.b.m(com.waze.ce.ab.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i35 = kb.f40359a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new iw((em) bVar18.a(new h.g.b.m(em.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i37 = kb.f40359a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i38 = h.g.b.ar.f48106a;
                        cx cxVar = (cx) bVar19.a(new h.g.b.m(cx.class), null, null);
                        ik ikVar2 = (ik) bVar19.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar6 = (com.waze.sound.a.c) bVar19.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        bs bsVar = (bs) bVar19.a(new h.g.b.m(bs.class), null, null);
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar19.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        com.waze.navigate.dg dgVar = (com.waze.navigate.dg) bVar19.a(new h.g.b.m(com.waze.navigate.dg.class), null, null);
                        com.waze.navigate.gx gxVar = (com.waze.navigate.gx) bVar19.a(new h.g.b.m(com.waze.navigate.gx.class), null, null);
                        com.waze.shared_infra.i.b bVar20 = (com.waze.shared_infra.i.b) bVar19.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        ca caVar = (ca) bVar19.a(new h.g.b.m(ca.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("RouteInstructionVoicesRepository");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new dd(cxVar, eVarD9, gxVar, ikVar2, cVar6, bsVar, dgVar, driveToNativeManager, bVar20, caVar, kotlinx.coroutines.av.b());
                    case 17:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i39 = kb.f40359a;
                        h.g.b.x.f(bVar21, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar7 = (com.waze.sound.a.c) bVar21.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        iv ivVar3 = (iv) bVar21.a(new h.g.b.m(iv.class), null, null);
                        ik ikVar3 = (ik) bVar21.a(new h.g.b.m(ik.class), null, null);
                        dx dxVar = (dx) bVar21.a(new h.g.b.m(dx.class), null, null);
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("RouteInstructionsVoiceAssetsRepository");
                        h.g.b.x.e(eVarD10, "create(...)");
                        int i41 = kotlinx.coroutines.av.f51370a;
                        return new eb(eVarD10, cVar7, ivVar3, ikVar3, dxVar, kotlinx.coroutines.e.ac.f51860a, kotlinx.coroutines.av.b());
                    case 18:
                        int i42 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new dx();
                    case 19:
                        int i43 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cy();
                    default:
                        int i44 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cc();
                }
            }
        };
        org.a.d.e.e eVar3 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(ic.class), null, pVar, cVar, h.a.i.h()));
        aVar.f(eVar3);
        new org.a.d.c.d(aVar, eVar3);
        h.g.a.p pVar2 = new h.g.a.p() { // from class: com.waze.sound.jz
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i7 = kb.f40359a;
                        h.g.b.x.f(bVar2, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i8 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar2 = (com.waze.sound.a.c) bVar2.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar = (com.waze.sound.a.h) bVar2.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        com.waze.copilot.a.u uVar = (com.waze.copilot.a.u) bVar2.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        kotlinx.coroutines.ab abVarB = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("CustomVoicesFallbackVoicePickerViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.settings.ae(cVar2, hVar, uVar, eVarD, abVarB);
                    case 1:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i9 = kb.f40359a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i10 = h.g.b.ar.f48106a;
                        ik ikVar = (ik) bVar3.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar3 = (com.waze.sound.a.c) bVar3.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        fm fmVar = (fm) bVar3.a(new h.g.b.m(fm.class), null, null);
                        iv ivVar = (iv) bVar3.a(new h.g.b.m(iv.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("VoiceAssetsUseCase");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new ie(ikVar, cVar3, ivVar, fmVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i11 = kb.f40359a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i12 = h.g.b.ar.f48106a;
                        com.waze.sharedui.f.k kVar = (com.waze.sharedui.f.k) bVar4.a(new h.g.b.m(com.waze.sharedui.f.k.class), null, null);
                        com.waze.shared_infra.i.b bVar5 = (com.waze.shared_infra.i.b) bVar4.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("VoiceListDataSource");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new jq(eVarD3, kVar, bVar5);
                    case 3:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i13 = kb.f40359a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i14 = h.g.b.ar.f48106a;
                        return new com.waze.sound.f.k((com.waze.stats.ax) bVar6.a(new h.g.b.m(com.waze.stats.ax.class), null, null));
                    case 4:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i15 = kb.f40359a;
                        h.g.b.x.f(bVar7, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar4 = (com.waze.sound.a.c) bVar7.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar2 = (com.waze.sound.a.h) bVar7.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        bj bjVar = (bj) bVar7.a(new h.g.b.m(bj.class), null, null);
                        com.waze.copilot.a.u uVar2 = (com.waze.copilot.a.u) bVar7.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        bg bgVar = (bg) bVar7.a(new h.g.b.m(bg.class), null, null);
                        hx hxVar = (hx) bVar7.a(new h.g.b.m(hx.class), null, null);
                        com.waze.mywaze.ah ahVar = (com.waze.mywaze.ah) bVar7.a(new h.g.b.m(com.waze.mywaze.ah.class), null, null);
                        com.waze.settings.eb ebVar = (com.waze.settings.eb) bVar7.a(new h.g.b.m(com.waze.settings.eb.class), null, null);
                        com.waze.search.c.m mVar = (com.waze.search.c.m) bVar7.a(new h.g.b.m(com.waze.search.c.m.class), null, null);
                        kotlinx.coroutines.ab abVarB2 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("VoiceSettingsViewModel");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.settings.i.a.q(cVar4, hVar2, bjVar, uVar2, bgVar, hxVar, ahVar, ebVar, mVar, eVarD4, abVarB2);
                    case 5:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i17 = kb.f40359a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = h.g.b.ar.f48106a;
                        return new com.waze.sound.e.k((bs) bVar8.a(new h.g.b.m(bs.class), null, null), (com.waze.settings.eb) bVar8.a(new h.g.b.m(com.waze.settings.eb.class), null, null), (com.waze.sound.a.c) bVar8.a(new h.g.b.m(com.waze.sound.a.c.class), null, null), (bj) bVar8.a(new h.g.b.m(bj.class), null, null));
                    case 6:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i19 = kb.f40359a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.sound.b.a((TtsNativeManager) bVar9.a(new h.g.b.m(TtsNativeManager.class), null, null));
                    case 7:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = kb.f40359a;
                        h.g.b.x.f(bVar10, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        ic icVar = (ic) bVar10.a(new h.g.b.m(ic.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("VoiceAssetsNativeManager");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new VoiceAssetsNativeManager(icVar, eVarD5, null, 4, null);
                    case 8:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i23 = kb.f40359a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar11);
                        int i24 = h.g.b.ar.f48106a;
                        kc kcVar = (kc) bVar11.a(new h.g.b.m(kc.class), null, null);
                        iw iwVar = (iw) bVar11.a(new h.g.b.m(iw.class), null, null);
                        com.waze.sound.f.j jVar = (com.waze.sound.f.j) bVar11.a(new h.g.b.m(com.waze.sound.f.j.class), null, null);
                        em emVar = (em) bVar11.a(new h.g.b.m(em.class), null, null);
                        kotlinx.coroutines.ab abVarB3 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.b bVar12 = (com.waze.shared_infra.i.b) bVar11.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("VoiceFilesProviderImpl");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new jl(contextH, kcVar, eVarD6, iwVar, jVar, emVar, bVar12, abVarB3);
                    case 9:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i25 = kb.f40359a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = h.g.b.ar.f48106a;
                        hz hzVar = (hz) bVar13.a(new h.g.b.m(hz.class), null, null);
                        VoicesNativeManager voicesNativeManager = (VoicesNativeManager) bVar13.a(new h.g.b.m(VoicesNativeManager.class), null, null);
                        iv ivVar2 = (iv) bVar13.a(new h.g.b.m(iv.class), null, null);
                        com.waze.sound.a.d dVar = (com.waze.sound.a.d) bVar13.a(new h.g.b.m(com.waze.sound.a.d.class), null, null);
                        com.waze.sound.a.e eVar32 = (com.waze.sound.a.e) bVar13.a(new h.g.b.m(com.waze.sound.a.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("VoiceRepository");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sound.a.g(hzVar, voicesNativeManager, ivVar2, dVar, eVar32, eVarD7);
                    case 10:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i27 = kb.f40359a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i28 = h.g.b.ar.f48106a;
                        return new com.waze.sound.a.d((em) bVar14.a(new h.g.b.m(em.class), null, null));
                    case 11:
                        int i29 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sound.a.e();
                    case 12:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i30 = kb.f40359a;
                        h.g.b.x.f(bVar15, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        String path = k.a.k.h(bVar15).getCacheDir().getPath();
                        h.g.b.x.e(path, "getPath(...)");
                        com.waze.shared_infra.coordinators.c cVar5 = new com.waze.shared_infra.coordinators.c(new com.waze.shared_infra.b.b(path, "voiceAssetCacheFile"));
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("VoiceAssetProtoCache");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new hz(eVarD8, cVar5);
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i31 = kb.f40359a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i32 = h.g.b.ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar16.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar3 = e.a.h.f47759a;
                        h.g.b.x.e(hVar3, "DEFAULT");
                        return new com.waze.ce.ab(iVarB, hVar3);
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i33 = kb.f40359a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i34 = h.g.b.ar.f48106a;
                        return new ju((com.waze.ce.ab) bVar17.a(new h.g.b.m(com.waze.ce.ab.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i35 = kb.f40359a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new iw((em) bVar18.a(new h.g.b.m(em.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i37 = kb.f40359a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i38 = h.g.b.ar.f48106a;
                        cx cxVar = (cx) bVar19.a(new h.g.b.m(cx.class), null, null);
                        ik ikVar2 = (ik) bVar19.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar6 = (com.waze.sound.a.c) bVar19.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        bs bsVar = (bs) bVar19.a(new h.g.b.m(bs.class), null, null);
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar19.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        com.waze.navigate.dg dgVar = (com.waze.navigate.dg) bVar19.a(new h.g.b.m(com.waze.navigate.dg.class), null, null);
                        com.waze.navigate.gx gxVar = (com.waze.navigate.gx) bVar19.a(new h.g.b.m(com.waze.navigate.gx.class), null, null);
                        com.waze.shared_infra.i.b bVar20 = (com.waze.shared_infra.i.b) bVar19.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        ca caVar = (ca) bVar19.a(new h.g.b.m(ca.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("RouteInstructionVoicesRepository");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new dd(cxVar, eVarD9, gxVar, ikVar2, cVar6, bsVar, dgVar, driveToNativeManager, bVar20, caVar, kotlinx.coroutines.av.b());
                    case 17:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i39 = kb.f40359a;
                        h.g.b.x.f(bVar21, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar7 = (com.waze.sound.a.c) bVar21.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        iv ivVar3 = (iv) bVar21.a(new h.g.b.m(iv.class), null, null);
                        ik ikVar3 = (ik) bVar21.a(new h.g.b.m(ik.class), null, null);
                        dx dxVar = (dx) bVar21.a(new h.g.b.m(dx.class), null, null);
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("RouteInstructionsVoiceAssetsRepository");
                        h.g.b.x.e(eVarD10, "create(...)");
                        int i41 = kotlinx.coroutines.av.f51370a;
                        return new eb(eVarD10, cVar7, ivVar3, ikVar3, dxVar, kotlinx.coroutines.e.ac.f51860a, kotlinx.coroutines.av.b());
                    case 18:
                        int i42 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new dx();
                    case 19:
                        int i43 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cy();
                    default:
                        int i44 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cc();
                }
            }
        };
        org.a.d.e.e eVar4 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(VoiceAssetsNativeManager.class), null, pVar2, cVar, h.a.i.h()));
        aVar.f(eVar4);
        new org.a.d.c.d(aVar, eVar4);
        h.g.a.p pVar3 = new h.g.a.p() { // from class: com.waze.sound.jz
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i7 = kb.f40359a;
                        h.g.b.x.f(bVar2, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i8 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar2 = (com.waze.sound.a.c) bVar2.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar = (com.waze.sound.a.h) bVar2.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        com.waze.copilot.a.u uVar = (com.waze.copilot.a.u) bVar2.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        kotlinx.coroutines.ab abVarB = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("CustomVoicesFallbackVoicePickerViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.settings.ae(cVar2, hVar, uVar, eVarD, abVarB);
                    case 1:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i9 = kb.f40359a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i10 = h.g.b.ar.f48106a;
                        ik ikVar = (ik) bVar3.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar3 = (com.waze.sound.a.c) bVar3.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        fm fmVar = (fm) bVar3.a(new h.g.b.m(fm.class), null, null);
                        iv ivVar = (iv) bVar3.a(new h.g.b.m(iv.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("VoiceAssetsUseCase");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new ie(ikVar, cVar3, ivVar, fmVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i11 = kb.f40359a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i12 = h.g.b.ar.f48106a;
                        com.waze.sharedui.f.k kVar = (com.waze.sharedui.f.k) bVar4.a(new h.g.b.m(com.waze.sharedui.f.k.class), null, null);
                        com.waze.shared_infra.i.b bVar5 = (com.waze.shared_infra.i.b) bVar4.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("VoiceListDataSource");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new jq(eVarD3, kVar, bVar5);
                    case 3:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i13 = kb.f40359a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i14 = h.g.b.ar.f48106a;
                        return new com.waze.sound.f.k((com.waze.stats.ax) bVar6.a(new h.g.b.m(com.waze.stats.ax.class), null, null));
                    case 4:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i15 = kb.f40359a;
                        h.g.b.x.f(bVar7, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar4 = (com.waze.sound.a.c) bVar7.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar2 = (com.waze.sound.a.h) bVar7.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        bj bjVar = (bj) bVar7.a(new h.g.b.m(bj.class), null, null);
                        com.waze.copilot.a.u uVar2 = (com.waze.copilot.a.u) bVar7.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        bg bgVar = (bg) bVar7.a(new h.g.b.m(bg.class), null, null);
                        hx hxVar = (hx) bVar7.a(new h.g.b.m(hx.class), null, null);
                        com.waze.mywaze.ah ahVar = (com.waze.mywaze.ah) bVar7.a(new h.g.b.m(com.waze.mywaze.ah.class), null, null);
                        com.waze.settings.eb ebVar = (com.waze.settings.eb) bVar7.a(new h.g.b.m(com.waze.settings.eb.class), null, null);
                        com.waze.search.c.m mVar = (com.waze.search.c.m) bVar7.a(new h.g.b.m(com.waze.search.c.m.class), null, null);
                        kotlinx.coroutines.ab abVarB2 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("VoiceSettingsViewModel");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.settings.i.a.q(cVar4, hVar2, bjVar, uVar2, bgVar, hxVar, ahVar, ebVar, mVar, eVarD4, abVarB2);
                    case 5:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i17 = kb.f40359a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = h.g.b.ar.f48106a;
                        return new com.waze.sound.e.k((bs) bVar8.a(new h.g.b.m(bs.class), null, null), (com.waze.settings.eb) bVar8.a(new h.g.b.m(com.waze.settings.eb.class), null, null), (com.waze.sound.a.c) bVar8.a(new h.g.b.m(com.waze.sound.a.c.class), null, null), (bj) bVar8.a(new h.g.b.m(bj.class), null, null));
                    case 6:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i19 = kb.f40359a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.sound.b.a((TtsNativeManager) bVar9.a(new h.g.b.m(TtsNativeManager.class), null, null));
                    case 7:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = kb.f40359a;
                        h.g.b.x.f(bVar10, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        ic icVar = (ic) bVar10.a(new h.g.b.m(ic.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("VoiceAssetsNativeManager");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new VoiceAssetsNativeManager(icVar, eVarD5, null, 4, null);
                    case 8:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i23 = kb.f40359a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar11);
                        int i24 = h.g.b.ar.f48106a;
                        kc kcVar = (kc) bVar11.a(new h.g.b.m(kc.class), null, null);
                        iw iwVar = (iw) bVar11.a(new h.g.b.m(iw.class), null, null);
                        com.waze.sound.f.j jVar = (com.waze.sound.f.j) bVar11.a(new h.g.b.m(com.waze.sound.f.j.class), null, null);
                        em emVar = (em) bVar11.a(new h.g.b.m(em.class), null, null);
                        kotlinx.coroutines.ab abVarB3 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.b bVar12 = (com.waze.shared_infra.i.b) bVar11.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("VoiceFilesProviderImpl");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new jl(contextH, kcVar, eVarD6, iwVar, jVar, emVar, bVar12, abVarB3);
                    case 9:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i25 = kb.f40359a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = h.g.b.ar.f48106a;
                        hz hzVar = (hz) bVar13.a(new h.g.b.m(hz.class), null, null);
                        VoicesNativeManager voicesNativeManager = (VoicesNativeManager) bVar13.a(new h.g.b.m(VoicesNativeManager.class), null, null);
                        iv ivVar2 = (iv) bVar13.a(new h.g.b.m(iv.class), null, null);
                        com.waze.sound.a.d dVar = (com.waze.sound.a.d) bVar13.a(new h.g.b.m(com.waze.sound.a.d.class), null, null);
                        com.waze.sound.a.e eVar32 = (com.waze.sound.a.e) bVar13.a(new h.g.b.m(com.waze.sound.a.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("VoiceRepository");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sound.a.g(hzVar, voicesNativeManager, ivVar2, dVar, eVar32, eVarD7);
                    case 10:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i27 = kb.f40359a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i28 = h.g.b.ar.f48106a;
                        return new com.waze.sound.a.d((em) bVar14.a(new h.g.b.m(em.class), null, null));
                    case 11:
                        int i29 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sound.a.e();
                    case 12:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i30 = kb.f40359a;
                        h.g.b.x.f(bVar15, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        String path = k.a.k.h(bVar15).getCacheDir().getPath();
                        h.g.b.x.e(path, "getPath(...)");
                        com.waze.shared_infra.coordinators.c cVar5 = new com.waze.shared_infra.coordinators.c(new com.waze.shared_infra.b.b(path, "voiceAssetCacheFile"));
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("VoiceAssetProtoCache");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new hz(eVarD8, cVar5);
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i31 = kb.f40359a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i32 = h.g.b.ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar16.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar3 = e.a.h.f47759a;
                        h.g.b.x.e(hVar3, "DEFAULT");
                        return new com.waze.ce.ab(iVarB, hVar3);
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i33 = kb.f40359a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i34 = h.g.b.ar.f48106a;
                        return new ju((com.waze.ce.ab) bVar17.a(new h.g.b.m(com.waze.ce.ab.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i35 = kb.f40359a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new iw((em) bVar18.a(new h.g.b.m(em.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i37 = kb.f40359a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i38 = h.g.b.ar.f48106a;
                        cx cxVar = (cx) bVar19.a(new h.g.b.m(cx.class), null, null);
                        ik ikVar2 = (ik) bVar19.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar6 = (com.waze.sound.a.c) bVar19.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        bs bsVar = (bs) bVar19.a(new h.g.b.m(bs.class), null, null);
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar19.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        com.waze.navigate.dg dgVar = (com.waze.navigate.dg) bVar19.a(new h.g.b.m(com.waze.navigate.dg.class), null, null);
                        com.waze.navigate.gx gxVar = (com.waze.navigate.gx) bVar19.a(new h.g.b.m(com.waze.navigate.gx.class), null, null);
                        com.waze.shared_infra.i.b bVar20 = (com.waze.shared_infra.i.b) bVar19.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        ca caVar = (ca) bVar19.a(new h.g.b.m(ca.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("RouteInstructionVoicesRepository");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new dd(cxVar, eVarD9, gxVar, ikVar2, cVar6, bsVar, dgVar, driveToNativeManager, bVar20, caVar, kotlinx.coroutines.av.b());
                    case 17:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i39 = kb.f40359a;
                        h.g.b.x.f(bVar21, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar7 = (com.waze.sound.a.c) bVar21.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        iv ivVar3 = (iv) bVar21.a(new h.g.b.m(iv.class), null, null);
                        ik ikVar3 = (ik) bVar21.a(new h.g.b.m(ik.class), null, null);
                        dx dxVar = (dx) bVar21.a(new h.g.b.m(dx.class), null, null);
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("RouteInstructionsVoiceAssetsRepository");
                        h.g.b.x.e(eVarD10, "create(...)");
                        int i41 = kotlinx.coroutines.av.f51370a;
                        return new eb(eVarD10, cVar7, ivVar3, ikVar3, dxVar, kotlinx.coroutines.e.ac.f51860a, kotlinx.coroutines.av.b());
                    case 18:
                        int i42 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new dx();
                    case 19:
                        int i43 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cy();
                    default:
                        int i44 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cc();
                }
            }
        };
        org.a.d.e.e eVar5 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.sound.a.a.class), null, pVar3, cVar, h.a.i.h()));
        aVar.f(eVar5);
        com.waze.web.r.q(new org.a.d.c.d(aVar, eVar5), new h.g.b.m(com.waze.sound.a.c.class));
        final int i7 = 10;
        h.g.a.p pVar4 = new h.g.a.p() { // from class: com.waze.sound.jz
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i7) {
                    case 0:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i72 = kb.f40359a;
                        h.g.b.x.f(bVar2, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i8 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar2 = (com.waze.sound.a.c) bVar2.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar = (com.waze.sound.a.h) bVar2.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        com.waze.copilot.a.u uVar = (com.waze.copilot.a.u) bVar2.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        kotlinx.coroutines.ab abVarB = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("CustomVoicesFallbackVoicePickerViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.settings.ae(cVar2, hVar, uVar, eVarD, abVarB);
                    case 1:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i9 = kb.f40359a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i10 = h.g.b.ar.f48106a;
                        ik ikVar = (ik) bVar3.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar3 = (com.waze.sound.a.c) bVar3.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        fm fmVar = (fm) bVar3.a(new h.g.b.m(fm.class), null, null);
                        iv ivVar = (iv) bVar3.a(new h.g.b.m(iv.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("VoiceAssetsUseCase");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new ie(ikVar, cVar3, ivVar, fmVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i11 = kb.f40359a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i12 = h.g.b.ar.f48106a;
                        com.waze.sharedui.f.k kVar = (com.waze.sharedui.f.k) bVar4.a(new h.g.b.m(com.waze.sharedui.f.k.class), null, null);
                        com.waze.shared_infra.i.b bVar5 = (com.waze.shared_infra.i.b) bVar4.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("VoiceListDataSource");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new jq(eVarD3, kVar, bVar5);
                    case 3:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i13 = kb.f40359a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i14 = h.g.b.ar.f48106a;
                        return new com.waze.sound.f.k((com.waze.stats.ax) bVar6.a(new h.g.b.m(com.waze.stats.ax.class), null, null));
                    case 4:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i15 = kb.f40359a;
                        h.g.b.x.f(bVar7, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar4 = (com.waze.sound.a.c) bVar7.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar2 = (com.waze.sound.a.h) bVar7.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        bj bjVar = (bj) bVar7.a(new h.g.b.m(bj.class), null, null);
                        com.waze.copilot.a.u uVar2 = (com.waze.copilot.a.u) bVar7.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        bg bgVar = (bg) bVar7.a(new h.g.b.m(bg.class), null, null);
                        hx hxVar = (hx) bVar7.a(new h.g.b.m(hx.class), null, null);
                        com.waze.mywaze.ah ahVar = (com.waze.mywaze.ah) bVar7.a(new h.g.b.m(com.waze.mywaze.ah.class), null, null);
                        com.waze.settings.eb ebVar = (com.waze.settings.eb) bVar7.a(new h.g.b.m(com.waze.settings.eb.class), null, null);
                        com.waze.search.c.m mVar = (com.waze.search.c.m) bVar7.a(new h.g.b.m(com.waze.search.c.m.class), null, null);
                        kotlinx.coroutines.ab abVarB2 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("VoiceSettingsViewModel");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.settings.i.a.q(cVar4, hVar2, bjVar, uVar2, bgVar, hxVar, ahVar, ebVar, mVar, eVarD4, abVarB2);
                    case 5:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i17 = kb.f40359a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = h.g.b.ar.f48106a;
                        return new com.waze.sound.e.k((bs) bVar8.a(new h.g.b.m(bs.class), null, null), (com.waze.settings.eb) bVar8.a(new h.g.b.m(com.waze.settings.eb.class), null, null), (com.waze.sound.a.c) bVar8.a(new h.g.b.m(com.waze.sound.a.c.class), null, null), (bj) bVar8.a(new h.g.b.m(bj.class), null, null));
                    case 6:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i19 = kb.f40359a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.sound.b.a((TtsNativeManager) bVar9.a(new h.g.b.m(TtsNativeManager.class), null, null));
                    case 7:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = kb.f40359a;
                        h.g.b.x.f(bVar10, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        ic icVar = (ic) bVar10.a(new h.g.b.m(ic.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("VoiceAssetsNativeManager");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new VoiceAssetsNativeManager(icVar, eVarD5, null, 4, null);
                    case 8:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i23 = kb.f40359a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar11);
                        int i24 = h.g.b.ar.f48106a;
                        kc kcVar = (kc) bVar11.a(new h.g.b.m(kc.class), null, null);
                        iw iwVar = (iw) bVar11.a(new h.g.b.m(iw.class), null, null);
                        com.waze.sound.f.j jVar = (com.waze.sound.f.j) bVar11.a(new h.g.b.m(com.waze.sound.f.j.class), null, null);
                        em emVar = (em) bVar11.a(new h.g.b.m(em.class), null, null);
                        kotlinx.coroutines.ab abVarB3 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.b bVar12 = (com.waze.shared_infra.i.b) bVar11.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("VoiceFilesProviderImpl");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new jl(contextH, kcVar, eVarD6, iwVar, jVar, emVar, bVar12, abVarB3);
                    case 9:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i25 = kb.f40359a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = h.g.b.ar.f48106a;
                        hz hzVar = (hz) bVar13.a(new h.g.b.m(hz.class), null, null);
                        VoicesNativeManager voicesNativeManager = (VoicesNativeManager) bVar13.a(new h.g.b.m(VoicesNativeManager.class), null, null);
                        iv ivVar2 = (iv) bVar13.a(new h.g.b.m(iv.class), null, null);
                        com.waze.sound.a.d dVar = (com.waze.sound.a.d) bVar13.a(new h.g.b.m(com.waze.sound.a.d.class), null, null);
                        com.waze.sound.a.e eVar32 = (com.waze.sound.a.e) bVar13.a(new h.g.b.m(com.waze.sound.a.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("VoiceRepository");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sound.a.g(hzVar, voicesNativeManager, ivVar2, dVar, eVar32, eVarD7);
                    case 10:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i27 = kb.f40359a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i28 = h.g.b.ar.f48106a;
                        return new com.waze.sound.a.d((em) bVar14.a(new h.g.b.m(em.class), null, null));
                    case 11:
                        int i29 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sound.a.e();
                    case 12:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i30 = kb.f40359a;
                        h.g.b.x.f(bVar15, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        String path = k.a.k.h(bVar15).getCacheDir().getPath();
                        h.g.b.x.e(path, "getPath(...)");
                        com.waze.shared_infra.coordinators.c cVar5 = new com.waze.shared_infra.coordinators.c(new com.waze.shared_infra.b.b(path, "voiceAssetCacheFile"));
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("VoiceAssetProtoCache");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new hz(eVarD8, cVar5);
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i31 = kb.f40359a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i32 = h.g.b.ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar16.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar3 = e.a.h.f47759a;
                        h.g.b.x.e(hVar3, "DEFAULT");
                        return new com.waze.ce.ab(iVarB, hVar3);
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i33 = kb.f40359a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i34 = h.g.b.ar.f48106a;
                        return new ju((com.waze.ce.ab) bVar17.a(new h.g.b.m(com.waze.ce.ab.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i35 = kb.f40359a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new iw((em) bVar18.a(new h.g.b.m(em.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i37 = kb.f40359a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i38 = h.g.b.ar.f48106a;
                        cx cxVar = (cx) bVar19.a(new h.g.b.m(cx.class), null, null);
                        ik ikVar2 = (ik) bVar19.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar6 = (com.waze.sound.a.c) bVar19.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        bs bsVar = (bs) bVar19.a(new h.g.b.m(bs.class), null, null);
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar19.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        com.waze.navigate.dg dgVar = (com.waze.navigate.dg) bVar19.a(new h.g.b.m(com.waze.navigate.dg.class), null, null);
                        com.waze.navigate.gx gxVar = (com.waze.navigate.gx) bVar19.a(new h.g.b.m(com.waze.navigate.gx.class), null, null);
                        com.waze.shared_infra.i.b bVar20 = (com.waze.shared_infra.i.b) bVar19.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        ca caVar = (ca) bVar19.a(new h.g.b.m(ca.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("RouteInstructionVoicesRepository");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new dd(cxVar, eVarD9, gxVar, ikVar2, cVar6, bsVar, dgVar, driveToNativeManager, bVar20, caVar, kotlinx.coroutines.av.b());
                    case 17:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i39 = kb.f40359a;
                        h.g.b.x.f(bVar21, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar7 = (com.waze.sound.a.c) bVar21.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        iv ivVar3 = (iv) bVar21.a(new h.g.b.m(iv.class), null, null);
                        ik ikVar3 = (ik) bVar21.a(new h.g.b.m(ik.class), null, null);
                        dx dxVar = (dx) bVar21.a(new h.g.b.m(dx.class), null, null);
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("RouteInstructionsVoiceAssetsRepository");
                        h.g.b.x.e(eVarD10, "create(...)");
                        int i41 = kotlinx.coroutines.av.f51370a;
                        return new eb(eVarD10, cVar7, ivVar3, ikVar3, dxVar, kotlinx.coroutines.e.ac.f51860a, kotlinx.coroutines.av.b());
                    case 18:
                        int i42 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new dx();
                    case 19:
                        int i43 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cy();
                    default:
                        int i44 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cc();
                }
            }
        };
        org.a.d.e.e eVar6 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.sound.a.d.class), null, pVar4, cVar, h.a.i.h()));
        aVar.f(eVar6);
        new org.a.d.c.d(aVar, eVar6);
        final int i8 = 11;
        h.g.a.p pVar5 = new h.g.a.p() { // from class: com.waze.sound.jz
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i8) {
                    case 0:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i72 = kb.f40359a;
                        h.g.b.x.f(bVar2, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar2 = (com.waze.sound.a.c) bVar2.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar = (com.waze.sound.a.h) bVar2.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        com.waze.copilot.a.u uVar = (com.waze.copilot.a.u) bVar2.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        kotlinx.coroutines.ab abVarB = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("CustomVoicesFallbackVoicePickerViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.settings.ae(cVar2, hVar, uVar, eVarD, abVarB);
                    case 1:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i9 = kb.f40359a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i10 = h.g.b.ar.f48106a;
                        ik ikVar = (ik) bVar3.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar3 = (com.waze.sound.a.c) bVar3.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        fm fmVar = (fm) bVar3.a(new h.g.b.m(fm.class), null, null);
                        iv ivVar = (iv) bVar3.a(new h.g.b.m(iv.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("VoiceAssetsUseCase");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new ie(ikVar, cVar3, ivVar, fmVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i11 = kb.f40359a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i12 = h.g.b.ar.f48106a;
                        com.waze.sharedui.f.k kVar = (com.waze.sharedui.f.k) bVar4.a(new h.g.b.m(com.waze.sharedui.f.k.class), null, null);
                        com.waze.shared_infra.i.b bVar5 = (com.waze.shared_infra.i.b) bVar4.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("VoiceListDataSource");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new jq(eVarD3, kVar, bVar5);
                    case 3:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i13 = kb.f40359a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i14 = h.g.b.ar.f48106a;
                        return new com.waze.sound.f.k((com.waze.stats.ax) bVar6.a(new h.g.b.m(com.waze.stats.ax.class), null, null));
                    case 4:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i15 = kb.f40359a;
                        h.g.b.x.f(bVar7, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar4 = (com.waze.sound.a.c) bVar7.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar2 = (com.waze.sound.a.h) bVar7.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        bj bjVar = (bj) bVar7.a(new h.g.b.m(bj.class), null, null);
                        com.waze.copilot.a.u uVar2 = (com.waze.copilot.a.u) bVar7.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        bg bgVar = (bg) bVar7.a(new h.g.b.m(bg.class), null, null);
                        hx hxVar = (hx) bVar7.a(new h.g.b.m(hx.class), null, null);
                        com.waze.mywaze.ah ahVar = (com.waze.mywaze.ah) bVar7.a(new h.g.b.m(com.waze.mywaze.ah.class), null, null);
                        com.waze.settings.eb ebVar = (com.waze.settings.eb) bVar7.a(new h.g.b.m(com.waze.settings.eb.class), null, null);
                        com.waze.search.c.m mVar = (com.waze.search.c.m) bVar7.a(new h.g.b.m(com.waze.search.c.m.class), null, null);
                        kotlinx.coroutines.ab abVarB2 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("VoiceSettingsViewModel");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.settings.i.a.q(cVar4, hVar2, bjVar, uVar2, bgVar, hxVar, ahVar, ebVar, mVar, eVarD4, abVarB2);
                    case 5:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i17 = kb.f40359a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = h.g.b.ar.f48106a;
                        return new com.waze.sound.e.k((bs) bVar8.a(new h.g.b.m(bs.class), null, null), (com.waze.settings.eb) bVar8.a(new h.g.b.m(com.waze.settings.eb.class), null, null), (com.waze.sound.a.c) bVar8.a(new h.g.b.m(com.waze.sound.a.c.class), null, null), (bj) bVar8.a(new h.g.b.m(bj.class), null, null));
                    case 6:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i19 = kb.f40359a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.sound.b.a((TtsNativeManager) bVar9.a(new h.g.b.m(TtsNativeManager.class), null, null));
                    case 7:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = kb.f40359a;
                        h.g.b.x.f(bVar10, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        ic icVar = (ic) bVar10.a(new h.g.b.m(ic.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("VoiceAssetsNativeManager");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new VoiceAssetsNativeManager(icVar, eVarD5, null, 4, null);
                    case 8:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i23 = kb.f40359a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar11);
                        int i24 = h.g.b.ar.f48106a;
                        kc kcVar = (kc) bVar11.a(new h.g.b.m(kc.class), null, null);
                        iw iwVar = (iw) bVar11.a(new h.g.b.m(iw.class), null, null);
                        com.waze.sound.f.j jVar = (com.waze.sound.f.j) bVar11.a(new h.g.b.m(com.waze.sound.f.j.class), null, null);
                        em emVar = (em) bVar11.a(new h.g.b.m(em.class), null, null);
                        kotlinx.coroutines.ab abVarB3 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.b bVar12 = (com.waze.shared_infra.i.b) bVar11.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("VoiceFilesProviderImpl");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new jl(contextH, kcVar, eVarD6, iwVar, jVar, emVar, bVar12, abVarB3);
                    case 9:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i25 = kb.f40359a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = h.g.b.ar.f48106a;
                        hz hzVar = (hz) bVar13.a(new h.g.b.m(hz.class), null, null);
                        VoicesNativeManager voicesNativeManager = (VoicesNativeManager) bVar13.a(new h.g.b.m(VoicesNativeManager.class), null, null);
                        iv ivVar2 = (iv) bVar13.a(new h.g.b.m(iv.class), null, null);
                        com.waze.sound.a.d dVar = (com.waze.sound.a.d) bVar13.a(new h.g.b.m(com.waze.sound.a.d.class), null, null);
                        com.waze.sound.a.e eVar32 = (com.waze.sound.a.e) bVar13.a(new h.g.b.m(com.waze.sound.a.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("VoiceRepository");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sound.a.g(hzVar, voicesNativeManager, ivVar2, dVar, eVar32, eVarD7);
                    case 10:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i27 = kb.f40359a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i28 = h.g.b.ar.f48106a;
                        return new com.waze.sound.a.d((em) bVar14.a(new h.g.b.m(em.class), null, null));
                    case 11:
                        int i29 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sound.a.e();
                    case 12:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i30 = kb.f40359a;
                        h.g.b.x.f(bVar15, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        String path = k.a.k.h(bVar15).getCacheDir().getPath();
                        h.g.b.x.e(path, "getPath(...)");
                        com.waze.shared_infra.coordinators.c cVar5 = new com.waze.shared_infra.coordinators.c(new com.waze.shared_infra.b.b(path, "voiceAssetCacheFile"));
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("VoiceAssetProtoCache");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new hz(eVarD8, cVar5);
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i31 = kb.f40359a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i32 = h.g.b.ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar16.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar3 = e.a.h.f47759a;
                        h.g.b.x.e(hVar3, "DEFAULT");
                        return new com.waze.ce.ab(iVarB, hVar3);
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i33 = kb.f40359a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i34 = h.g.b.ar.f48106a;
                        return new ju((com.waze.ce.ab) bVar17.a(new h.g.b.m(com.waze.ce.ab.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i35 = kb.f40359a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new iw((em) bVar18.a(new h.g.b.m(em.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i37 = kb.f40359a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i38 = h.g.b.ar.f48106a;
                        cx cxVar = (cx) bVar19.a(new h.g.b.m(cx.class), null, null);
                        ik ikVar2 = (ik) bVar19.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar6 = (com.waze.sound.a.c) bVar19.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        bs bsVar = (bs) bVar19.a(new h.g.b.m(bs.class), null, null);
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar19.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        com.waze.navigate.dg dgVar = (com.waze.navigate.dg) bVar19.a(new h.g.b.m(com.waze.navigate.dg.class), null, null);
                        com.waze.navigate.gx gxVar = (com.waze.navigate.gx) bVar19.a(new h.g.b.m(com.waze.navigate.gx.class), null, null);
                        com.waze.shared_infra.i.b bVar20 = (com.waze.shared_infra.i.b) bVar19.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        ca caVar = (ca) bVar19.a(new h.g.b.m(ca.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("RouteInstructionVoicesRepository");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new dd(cxVar, eVarD9, gxVar, ikVar2, cVar6, bsVar, dgVar, driveToNativeManager, bVar20, caVar, kotlinx.coroutines.av.b());
                    case 17:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i39 = kb.f40359a;
                        h.g.b.x.f(bVar21, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar7 = (com.waze.sound.a.c) bVar21.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        iv ivVar3 = (iv) bVar21.a(new h.g.b.m(iv.class), null, null);
                        ik ikVar3 = (ik) bVar21.a(new h.g.b.m(ik.class), null, null);
                        dx dxVar = (dx) bVar21.a(new h.g.b.m(dx.class), null, null);
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("RouteInstructionsVoiceAssetsRepository");
                        h.g.b.x.e(eVarD10, "create(...)");
                        int i41 = kotlinx.coroutines.av.f51370a;
                        return new eb(eVarD10, cVar7, ivVar3, ikVar3, dxVar, kotlinx.coroutines.e.ac.f51860a, kotlinx.coroutines.av.b());
                    case 18:
                        int i42 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new dx();
                    case 19:
                        int i43 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cy();
                    default:
                        int i44 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cc();
                }
            }
        };
        org.a.d.e.e eVar7 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.sound.a.e.class), null, pVar5, cVar, h.a.i.h()));
        aVar.f(eVar7);
        new org.a.d.c.d(aVar, eVar7);
        final int i9 = 12;
        h.g.a.p pVar6 = new h.g.a.p() { // from class: com.waze.sound.jz
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i9) {
                    case 0:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i72 = kb.f40359a;
                        h.g.b.x.f(bVar2, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar2 = (com.waze.sound.a.c) bVar2.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar = (com.waze.sound.a.h) bVar2.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        com.waze.copilot.a.u uVar = (com.waze.copilot.a.u) bVar2.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        kotlinx.coroutines.ab abVarB = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("CustomVoicesFallbackVoicePickerViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.settings.ae(cVar2, hVar, uVar, eVarD, abVarB);
                    case 1:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = kb.f40359a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i10 = h.g.b.ar.f48106a;
                        ik ikVar = (ik) bVar3.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar3 = (com.waze.sound.a.c) bVar3.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        fm fmVar = (fm) bVar3.a(new h.g.b.m(fm.class), null, null);
                        iv ivVar = (iv) bVar3.a(new h.g.b.m(iv.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("VoiceAssetsUseCase");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new ie(ikVar, cVar3, ivVar, fmVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i11 = kb.f40359a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i12 = h.g.b.ar.f48106a;
                        com.waze.sharedui.f.k kVar = (com.waze.sharedui.f.k) bVar4.a(new h.g.b.m(com.waze.sharedui.f.k.class), null, null);
                        com.waze.shared_infra.i.b bVar5 = (com.waze.shared_infra.i.b) bVar4.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("VoiceListDataSource");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new jq(eVarD3, kVar, bVar5);
                    case 3:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i13 = kb.f40359a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i14 = h.g.b.ar.f48106a;
                        return new com.waze.sound.f.k((com.waze.stats.ax) bVar6.a(new h.g.b.m(com.waze.stats.ax.class), null, null));
                    case 4:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i15 = kb.f40359a;
                        h.g.b.x.f(bVar7, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar4 = (com.waze.sound.a.c) bVar7.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar2 = (com.waze.sound.a.h) bVar7.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        bj bjVar = (bj) bVar7.a(new h.g.b.m(bj.class), null, null);
                        com.waze.copilot.a.u uVar2 = (com.waze.copilot.a.u) bVar7.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        bg bgVar = (bg) bVar7.a(new h.g.b.m(bg.class), null, null);
                        hx hxVar = (hx) bVar7.a(new h.g.b.m(hx.class), null, null);
                        com.waze.mywaze.ah ahVar = (com.waze.mywaze.ah) bVar7.a(new h.g.b.m(com.waze.mywaze.ah.class), null, null);
                        com.waze.settings.eb ebVar = (com.waze.settings.eb) bVar7.a(new h.g.b.m(com.waze.settings.eb.class), null, null);
                        com.waze.search.c.m mVar = (com.waze.search.c.m) bVar7.a(new h.g.b.m(com.waze.search.c.m.class), null, null);
                        kotlinx.coroutines.ab abVarB2 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("VoiceSettingsViewModel");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.settings.i.a.q(cVar4, hVar2, bjVar, uVar2, bgVar, hxVar, ahVar, ebVar, mVar, eVarD4, abVarB2);
                    case 5:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i17 = kb.f40359a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = h.g.b.ar.f48106a;
                        return new com.waze.sound.e.k((bs) bVar8.a(new h.g.b.m(bs.class), null, null), (com.waze.settings.eb) bVar8.a(new h.g.b.m(com.waze.settings.eb.class), null, null), (com.waze.sound.a.c) bVar8.a(new h.g.b.m(com.waze.sound.a.c.class), null, null), (bj) bVar8.a(new h.g.b.m(bj.class), null, null));
                    case 6:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i19 = kb.f40359a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.sound.b.a((TtsNativeManager) bVar9.a(new h.g.b.m(TtsNativeManager.class), null, null));
                    case 7:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = kb.f40359a;
                        h.g.b.x.f(bVar10, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        ic icVar = (ic) bVar10.a(new h.g.b.m(ic.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("VoiceAssetsNativeManager");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new VoiceAssetsNativeManager(icVar, eVarD5, null, 4, null);
                    case 8:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i23 = kb.f40359a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar11);
                        int i24 = h.g.b.ar.f48106a;
                        kc kcVar = (kc) bVar11.a(new h.g.b.m(kc.class), null, null);
                        iw iwVar = (iw) bVar11.a(new h.g.b.m(iw.class), null, null);
                        com.waze.sound.f.j jVar = (com.waze.sound.f.j) bVar11.a(new h.g.b.m(com.waze.sound.f.j.class), null, null);
                        em emVar = (em) bVar11.a(new h.g.b.m(em.class), null, null);
                        kotlinx.coroutines.ab abVarB3 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.b bVar12 = (com.waze.shared_infra.i.b) bVar11.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("VoiceFilesProviderImpl");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new jl(contextH, kcVar, eVarD6, iwVar, jVar, emVar, bVar12, abVarB3);
                    case 9:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i25 = kb.f40359a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = h.g.b.ar.f48106a;
                        hz hzVar = (hz) bVar13.a(new h.g.b.m(hz.class), null, null);
                        VoicesNativeManager voicesNativeManager = (VoicesNativeManager) bVar13.a(new h.g.b.m(VoicesNativeManager.class), null, null);
                        iv ivVar2 = (iv) bVar13.a(new h.g.b.m(iv.class), null, null);
                        com.waze.sound.a.d dVar = (com.waze.sound.a.d) bVar13.a(new h.g.b.m(com.waze.sound.a.d.class), null, null);
                        com.waze.sound.a.e eVar32 = (com.waze.sound.a.e) bVar13.a(new h.g.b.m(com.waze.sound.a.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("VoiceRepository");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sound.a.g(hzVar, voicesNativeManager, ivVar2, dVar, eVar32, eVarD7);
                    case 10:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i27 = kb.f40359a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i28 = h.g.b.ar.f48106a;
                        return new com.waze.sound.a.d((em) bVar14.a(new h.g.b.m(em.class), null, null));
                    case 11:
                        int i29 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sound.a.e();
                    case 12:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i30 = kb.f40359a;
                        h.g.b.x.f(bVar15, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        String path = k.a.k.h(bVar15).getCacheDir().getPath();
                        h.g.b.x.e(path, "getPath(...)");
                        com.waze.shared_infra.coordinators.c cVar5 = new com.waze.shared_infra.coordinators.c(new com.waze.shared_infra.b.b(path, "voiceAssetCacheFile"));
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("VoiceAssetProtoCache");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new hz(eVarD8, cVar5);
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i31 = kb.f40359a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i32 = h.g.b.ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar16.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar3 = e.a.h.f47759a;
                        h.g.b.x.e(hVar3, "DEFAULT");
                        return new com.waze.ce.ab(iVarB, hVar3);
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i33 = kb.f40359a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i34 = h.g.b.ar.f48106a;
                        return new ju((com.waze.ce.ab) bVar17.a(new h.g.b.m(com.waze.ce.ab.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i35 = kb.f40359a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new iw((em) bVar18.a(new h.g.b.m(em.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i37 = kb.f40359a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i38 = h.g.b.ar.f48106a;
                        cx cxVar = (cx) bVar19.a(new h.g.b.m(cx.class), null, null);
                        ik ikVar2 = (ik) bVar19.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar6 = (com.waze.sound.a.c) bVar19.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        bs bsVar = (bs) bVar19.a(new h.g.b.m(bs.class), null, null);
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar19.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        com.waze.navigate.dg dgVar = (com.waze.navigate.dg) bVar19.a(new h.g.b.m(com.waze.navigate.dg.class), null, null);
                        com.waze.navigate.gx gxVar = (com.waze.navigate.gx) bVar19.a(new h.g.b.m(com.waze.navigate.gx.class), null, null);
                        com.waze.shared_infra.i.b bVar20 = (com.waze.shared_infra.i.b) bVar19.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        ca caVar = (ca) bVar19.a(new h.g.b.m(ca.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("RouteInstructionVoicesRepository");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new dd(cxVar, eVarD9, gxVar, ikVar2, cVar6, bsVar, dgVar, driveToNativeManager, bVar20, caVar, kotlinx.coroutines.av.b());
                    case 17:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i39 = kb.f40359a;
                        h.g.b.x.f(bVar21, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar7 = (com.waze.sound.a.c) bVar21.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        iv ivVar3 = (iv) bVar21.a(new h.g.b.m(iv.class), null, null);
                        ik ikVar3 = (ik) bVar21.a(new h.g.b.m(ik.class), null, null);
                        dx dxVar = (dx) bVar21.a(new h.g.b.m(dx.class), null, null);
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("RouteInstructionsVoiceAssetsRepository");
                        h.g.b.x.e(eVarD10, "create(...)");
                        int i41 = kotlinx.coroutines.av.f51370a;
                        return new eb(eVarD10, cVar7, ivVar3, ikVar3, dxVar, kotlinx.coroutines.e.ac.f51860a, kotlinx.coroutines.av.b());
                    case 18:
                        int i42 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new dx();
                    case 19:
                        int i43 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cy();
                    default:
                        int i44 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cc();
                }
            }
        };
        org.a.d.e.e eVar8 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(hz.class), null, pVar6, cVar, h.a.i.h()));
        aVar.f(eVar8);
        new org.a.d.c.d(aVar, eVar8);
        final int i10 = 13;
        h.g.a.p pVar7 = new h.g.a.p() { // from class: com.waze.sound.jz
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i10) {
                    case 0:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i72 = kb.f40359a;
                        h.g.b.x.f(bVar2, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar2 = (com.waze.sound.a.c) bVar2.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar = (com.waze.sound.a.h) bVar2.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        com.waze.copilot.a.u uVar = (com.waze.copilot.a.u) bVar2.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        kotlinx.coroutines.ab abVarB = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("CustomVoicesFallbackVoicePickerViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.settings.ae(cVar2, hVar, uVar, eVarD, abVarB);
                    case 1:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = kb.f40359a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        ik ikVar = (ik) bVar3.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar3 = (com.waze.sound.a.c) bVar3.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        fm fmVar = (fm) bVar3.a(new h.g.b.m(fm.class), null, null);
                        iv ivVar = (iv) bVar3.a(new h.g.b.m(iv.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("VoiceAssetsUseCase");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new ie(ikVar, cVar3, ivVar, fmVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i11 = kb.f40359a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i12 = h.g.b.ar.f48106a;
                        com.waze.sharedui.f.k kVar = (com.waze.sharedui.f.k) bVar4.a(new h.g.b.m(com.waze.sharedui.f.k.class), null, null);
                        com.waze.shared_infra.i.b bVar5 = (com.waze.shared_infra.i.b) bVar4.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("VoiceListDataSource");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new jq(eVarD3, kVar, bVar5);
                    case 3:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i13 = kb.f40359a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i14 = h.g.b.ar.f48106a;
                        return new com.waze.sound.f.k((com.waze.stats.ax) bVar6.a(new h.g.b.m(com.waze.stats.ax.class), null, null));
                    case 4:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i15 = kb.f40359a;
                        h.g.b.x.f(bVar7, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar4 = (com.waze.sound.a.c) bVar7.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar2 = (com.waze.sound.a.h) bVar7.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        bj bjVar = (bj) bVar7.a(new h.g.b.m(bj.class), null, null);
                        com.waze.copilot.a.u uVar2 = (com.waze.copilot.a.u) bVar7.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        bg bgVar = (bg) bVar7.a(new h.g.b.m(bg.class), null, null);
                        hx hxVar = (hx) bVar7.a(new h.g.b.m(hx.class), null, null);
                        com.waze.mywaze.ah ahVar = (com.waze.mywaze.ah) bVar7.a(new h.g.b.m(com.waze.mywaze.ah.class), null, null);
                        com.waze.settings.eb ebVar = (com.waze.settings.eb) bVar7.a(new h.g.b.m(com.waze.settings.eb.class), null, null);
                        com.waze.search.c.m mVar = (com.waze.search.c.m) bVar7.a(new h.g.b.m(com.waze.search.c.m.class), null, null);
                        kotlinx.coroutines.ab abVarB2 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("VoiceSettingsViewModel");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.settings.i.a.q(cVar4, hVar2, bjVar, uVar2, bgVar, hxVar, ahVar, ebVar, mVar, eVarD4, abVarB2);
                    case 5:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i17 = kb.f40359a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = h.g.b.ar.f48106a;
                        return new com.waze.sound.e.k((bs) bVar8.a(new h.g.b.m(bs.class), null, null), (com.waze.settings.eb) bVar8.a(new h.g.b.m(com.waze.settings.eb.class), null, null), (com.waze.sound.a.c) bVar8.a(new h.g.b.m(com.waze.sound.a.c.class), null, null), (bj) bVar8.a(new h.g.b.m(bj.class), null, null));
                    case 6:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i19 = kb.f40359a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.sound.b.a((TtsNativeManager) bVar9.a(new h.g.b.m(TtsNativeManager.class), null, null));
                    case 7:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = kb.f40359a;
                        h.g.b.x.f(bVar10, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        ic icVar = (ic) bVar10.a(new h.g.b.m(ic.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("VoiceAssetsNativeManager");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new VoiceAssetsNativeManager(icVar, eVarD5, null, 4, null);
                    case 8:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i23 = kb.f40359a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar11);
                        int i24 = h.g.b.ar.f48106a;
                        kc kcVar = (kc) bVar11.a(new h.g.b.m(kc.class), null, null);
                        iw iwVar = (iw) bVar11.a(new h.g.b.m(iw.class), null, null);
                        com.waze.sound.f.j jVar = (com.waze.sound.f.j) bVar11.a(new h.g.b.m(com.waze.sound.f.j.class), null, null);
                        em emVar = (em) bVar11.a(new h.g.b.m(em.class), null, null);
                        kotlinx.coroutines.ab abVarB3 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.b bVar12 = (com.waze.shared_infra.i.b) bVar11.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("VoiceFilesProviderImpl");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new jl(contextH, kcVar, eVarD6, iwVar, jVar, emVar, bVar12, abVarB3);
                    case 9:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i25 = kb.f40359a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = h.g.b.ar.f48106a;
                        hz hzVar = (hz) bVar13.a(new h.g.b.m(hz.class), null, null);
                        VoicesNativeManager voicesNativeManager = (VoicesNativeManager) bVar13.a(new h.g.b.m(VoicesNativeManager.class), null, null);
                        iv ivVar2 = (iv) bVar13.a(new h.g.b.m(iv.class), null, null);
                        com.waze.sound.a.d dVar = (com.waze.sound.a.d) bVar13.a(new h.g.b.m(com.waze.sound.a.d.class), null, null);
                        com.waze.sound.a.e eVar32 = (com.waze.sound.a.e) bVar13.a(new h.g.b.m(com.waze.sound.a.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("VoiceRepository");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sound.a.g(hzVar, voicesNativeManager, ivVar2, dVar, eVar32, eVarD7);
                    case 10:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i27 = kb.f40359a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i28 = h.g.b.ar.f48106a;
                        return new com.waze.sound.a.d((em) bVar14.a(new h.g.b.m(em.class), null, null));
                    case 11:
                        int i29 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sound.a.e();
                    case 12:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i30 = kb.f40359a;
                        h.g.b.x.f(bVar15, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        String path = k.a.k.h(bVar15).getCacheDir().getPath();
                        h.g.b.x.e(path, "getPath(...)");
                        com.waze.shared_infra.coordinators.c cVar5 = new com.waze.shared_infra.coordinators.c(new com.waze.shared_infra.b.b(path, "voiceAssetCacheFile"));
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("VoiceAssetProtoCache");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new hz(eVarD8, cVar5);
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i31 = kb.f40359a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i32 = h.g.b.ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar16.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar3 = e.a.h.f47759a;
                        h.g.b.x.e(hVar3, "DEFAULT");
                        return new com.waze.ce.ab(iVarB, hVar3);
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i33 = kb.f40359a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i34 = h.g.b.ar.f48106a;
                        return new ju((com.waze.ce.ab) bVar17.a(new h.g.b.m(com.waze.ce.ab.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i35 = kb.f40359a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new iw((em) bVar18.a(new h.g.b.m(em.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i37 = kb.f40359a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i38 = h.g.b.ar.f48106a;
                        cx cxVar = (cx) bVar19.a(new h.g.b.m(cx.class), null, null);
                        ik ikVar2 = (ik) bVar19.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar6 = (com.waze.sound.a.c) bVar19.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        bs bsVar = (bs) bVar19.a(new h.g.b.m(bs.class), null, null);
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar19.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        com.waze.navigate.dg dgVar = (com.waze.navigate.dg) bVar19.a(new h.g.b.m(com.waze.navigate.dg.class), null, null);
                        com.waze.navigate.gx gxVar = (com.waze.navigate.gx) bVar19.a(new h.g.b.m(com.waze.navigate.gx.class), null, null);
                        com.waze.shared_infra.i.b bVar20 = (com.waze.shared_infra.i.b) bVar19.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        ca caVar = (ca) bVar19.a(new h.g.b.m(ca.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("RouteInstructionVoicesRepository");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new dd(cxVar, eVarD9, gxVar, ikVar2, cVar6, bsVar, dgVar, driveToNativeManager, bVar20, caVar, kotlinx.coroutines.av.b());
                    case 17:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i39 = kb.f40359a;
                        h.g.b.x.f(bVar21, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar7 = (com.waze.sound.a.c) bVar21.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        iv ivVar3 = (iv) bVar21.a(new h.g.b.m(iv.class), null, null);
                        ik ikVar3 = (ik) bVar21.a(new h.g.b.m(ik.class), null, null);
                        dx dxVar = (dx) bVar21.a(new h.g.b.m(dx.class), null, null);
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("RouteInstructionsVoiceAssetsRepository");
                        h.g.b.x.e(eVarD10, "create(...)");
                        int i41 = kotlinx.coroutines.av.f51370a;
                        return new eb(eVarD10, cVar7, ivVar3, ikVar3, dxVar, kotlinx.coroutines.e.ac.f51860a, kotlinx.coroutines.av.b());
                    case 18:
                        int i42 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new dx();
                    case 19:
                        int i43 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cy();
                    default:
                        int i44 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cc();
                }
            }
        };
        org.a.d.e.e eVar9 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.ce.ab.class), null, pVar7, cVar, h.a.i.h()));
        aVar.f(eVar9);
        new org.a.d.c.d(aVar, eVar9);
        final int i11 = 14;
        h.g.a.p pVar8 = new h.g.a.p() { // from class: com.waze.sound.jz
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i11) {
                    case 0:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i72 = kb.f40359a;
                        h.g.b.x.f(bVar2, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar2 = (com.waze.sound.a.c) bVar2.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar = (com.waze.sound.a.h) bVar2.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        com.waze.copilot.a.u uVar = (com.waze.copilot.a.u) bVar2.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        kotlinx.coroutines.ab abVarB = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("CustomVoicesFallbackVoicePickerViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.settings.ae(cVar2, hVar, uVar, eVarD, abVarB);
                    case 1:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = kb.f40359a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        ik ikVar = (ik) bVar3.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar3 = (com.waze.sound.a.c) bVar3.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        fm fmVar = (fm) bVar3.a(new h.g.b.m(fm.class), null, null);
                        iv ivVar = (iv) bVar3.a(new h.g.b.m(iv.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("VoiceAssetsUseCase");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new ie(ikVar, cVar3, ivVar, fmVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = kb.f40359a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i12 = h.g.b.ar.f48106a;
                        com.waze.sharedui.f.k kVar = (com.waze.sharedui.f.k) bVar4.a(new h.g.b.m(com.waze.sharedui.f.k.class), null, null);
                        com.waze.shared_infra.i.b bVar5 = (com.waze.shared_infra.i.b) bVar4.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("VoiceListDataSource");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new jq(eVarD3, kVar, bVar5);
                    case 3:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i13 = kb.f40359a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i14 = h.g.b.ar.f48106a;
                        return new com.waze.sound.f.k((com.waze.stats.ax) bVar6.a(new h.g.b.m(com.waze.stats.ax.class), null, null));
                    case 4:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i15 = kb.f40359a;
                        h.g.b.x.f(bVar7, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar4 = (com.waze.sound.a.c) bVar7.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar2 = (com.waze.sound.a.h) bVar7.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        bj bjVar = (bj) bVar7.a(new h.g.b.m(bj.class), null, null);
                        com.waze.copilot.a.u uVar2 = (com.waze.copilot.a.u) bVar7.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        bg bgVar = (bg) bVar7.a(new h.g.b.m(bg.class), null, null);
                        hx hxVar = (hx) bVar7.a(new h.g.b.m(hx.class), null, null);
                        com.waze.mywaze.ah ahVar = (com.waze.mywaze.ah) bVar7.a(new h.g.b.m(com.waze.mywaze.ah.class), null, null);
                        com.waze.settings.eb ebVar = (com.waze.settings.eb) bVar7.a(new h.g.b.m(com.waze.settings.eb.class), null, null);
                        com.waze.search.c.m mVar = (com.waze.search.c.m) bVar7.a(new h.g.b.m(com.waze.search.c.m.class), null, null);
                        kotlinx.coroutines.ab abVarB2 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("VoiceSettingsViewModel");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.settings.i.a.q(cVar4, hVar2, bjVar, uVar2, bgVar, hxVar, ahVar, ebVar, mVar, eVarD4, abVarB2);
                    case 5:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i17 = kb.f40359a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = h.g.b.ar.f48106a;
                        return new com.waze.sound.e.k((bs) bVar8.a(new h.g.b.m(bs.class), null, null), (com.waze.settings.eb) bVar8.a(new h.g.b.m(com.waze.settings.eb.class), null, null), (com.waze.sound.a.c) bVar8.a(new h.g.b.m(com.waze.sound.a.c.class), null, null), (bj) bVar8.a(new h.g.b.m(bj.class), null, null));
                    case 6:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i19 = kb.f40359a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.sound.b.a((TtsNativeManager) bVar9.a(new h.g.b.m(TtsNativeManager.class), null, null));
                    case 7:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = kb.f40359a;
                        h.g.b.x.f(bVar10, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        ic icVar = (ic) bVar10.a(new h.g.b.m(ic.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("VoiceAssetsNativeManager");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new VoiceAssetsNativeManager(icVar, eVarD5, null, 4, null);
                    case 8:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i23 = kb.f40359a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar11);
                        int i24 = h.g.b.ar.f48106a;
                        kc kcVar = (kc) bVar11.a(new h.g.b.m(kc.class), null, null);
                        iw iwVar = (iw) bVar11.a(new h.g.b.m(iw.class), null, null);
                        com.waze.sound.f.j jVar = (com.waze.sound.f.j) bVar11.a(new h.g.b.m(com.waze.sound.f.j.class), null, null);
                        em emVar = (em) bVar11.a(new h.g.b.m(em.class), null, null);
                        kotlinx.coroutines.ab abVarB3 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.b bVar12 = (com.waze.shared_infra.i.b) bVar11.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("VoiceFilesProviderImpl");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new jl(contextH, kcVar, eVarD6, iwVar, jVar, emVar, bVar12, abVarB3);
                    case 9:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i25 = kb.f40359a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = h.g.b.ar.f48106a;
                        hz hzVar = (hz) bVar13.a(new h.g.b.m(hz.class), null, null);
                        VoicesNativeManager voicesNativeManager = (VoicesNativeManager) bVar13.a(new h.g.b.m(VoicesNativeManager.class), null, null);
                        iv ivVar2 = (iv) bVar13.a(new h.g.b.m(iv.class), null, null);
                        com.waze.sound.a.d dVar = (com.waze.sound.a.d) bVar13.a(new h.g.b.m(com.waze.sound.a.d.class), null, null);
                        com.waze.sound.a.e eVar32 = (com.waze.sound.a.e) bVar13.a(new h.g.b.m(com.waze.sound.a.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("VoiceRepository");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sound.a.g(hzVar, voicesNativeManager, ivVar2, dVar, eVar32, eVarD7);
                    case 10:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i27 = kb.f40359a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i28 = h.g.b.ar.f48106a;
                        return new com.waze.sound.a.d((em) bVar14.a(new h.g.b.m(em.class), null, null));
                    case 11:
                        int i29 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sound.a.e();
                    case 12:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i30 = kb.f40359a;
                        h.g.b.x.f(bVar15, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        String path = k.a.k.h(bVar15).getCacheDir().getPath();
                        h.g.b.x.e(path, "getPath(...)");
                        com.waze.shared_infra.coordinators.c cVar5 = new com.waze.shared_infra.coordinators.c(new com.waze.shared_infra.b.b(path, "voiceAssetCacheFile"));
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("VoiceAssetProtoCache");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new hz(eVarD8, cVar5);
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i31 = kb.f40359a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i32 = h.g.b.ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar16.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar3 = e.a.h.f47759a;
                        h.g.b.x.e(hVar3, "DEFAULT");
                        return new com.waze.ce.ab(iVarB, hVar3);
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i33 = kb.f40359a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i34 = h.g.b.ar.f48106a;
                        return new ju((com.waze.ce.ab) bVar17.a(new h.g.b.m(com.waze.ce.ab.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i35 = kb.f40359a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new iw((em) bVar18.a(new h.g.b.m(em.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i37 = kb.f40359a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i38 = h.g.b.ar.f48106a;
                        cx cxVar = (cx) bVar19.a(new h.g.b.m(cx.class), null, null);
                        ik ikVar2 = (ik) bVar19.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar6 = (com.waze.sound.a.c) bVar19.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        bs bsVar = (bs) bVar19.a(new h.g.b.m(bs.class), null, null);
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar19.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        com.waze.navigate.dg dgVar = (com.waze.navigate.dg) bVar19.a(new h.g.b.m(com.waze.navigate.dg.class), null, null);
                        com.waze.navigate.gx gxVar = (com.waze.navigate.gx) bVar19.a(new h.g.b.m(com.waze.navigate.gx.class), null, null);
                        com.waze.shared_infra.i.b bVar20 = (com.waze.shared_infra.i.b) bVar19.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        ca caVar = (ca) bVar19.a(new h.g.b.m(ca.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("RouteInstructionVoicesRepository");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new dd(cxVar, eVarD9, gxVar, ikVar2, cVar6, bsVar, dgVar, driveToNativeManager, bVar20, caVar, kotlinx.coroutines.av.b());
                    case 17:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i39 = kb.f40359a;
                        h.g.b.x.f(bVar21, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar7 = (com.waze.sound.a.c) bVar21.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        iv ivVar3 = (iv) bVar21.a(new h.g.b.m(iv.class), null, null);
                        ik ikVar3 = (ik) bVar21.a(new h.g.b.m(ik.class), null, null);
                        dx dxVar = (dx) bVar21.a(new h.g.b.m(dx.class), null, null);
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("RouteInstructionsVoiceAssetsRepository");
                        h.g.b.x.e(eVarD10, "create(...)");
                        int i41 = kotlinx.coroutines.av.f51370a;
                        return new eb(eVarD10, cVar7, ivVar3, ikVar3, dxVar, kotlinx.coroutines.e.ac.f51860a, kotlinx.coroutines.av.b());
                    case 18:
                        int i42 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new dx();
                    case 19:
                        int i43 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cy();
                    default:
                        int i44 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cc();
                }
            }
        };
        org.a.d.e.e eVar10 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(jt.class), null, pVar8, cVar, h.a.i.h()));
        aVar.f(eVar10);
        new org.a.d.c.d(aVar, eVar10);
        final int i12 = 18;
        eq eqVar3 = new eq(i12);
        org.a.d.e.e eVar11 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(ik.class), null, eqVar3, cVar, h.a.i.h()));
        aVar.f(eVar11);
        new org.a.d.c.d(aVar, eVar11);
        final int i13 = 8;
        h.g.a.p pVar9 = new h.g.a.p() { // from class: com.waze.sound.jz
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i13) {
                    case 0:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i72 = kb.f40359a;
                        h.g.b.x.f(bVar2, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar2 = (com.waze.sound.a.c) bVar2.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar = (com.waze.sound.a.h) bVar2.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        com.waze.copilot.a.u uVar = (com.waze.copilot.a.u) bVar2.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        kotlinx.coroutines.ab abVarB = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("CustomVoicesFallbackVoicePickerViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.settings.ae(cVar2, hVar, uVar, eVarD, abVarB);
                    case 1:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = kb.f40359a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        ik ikVar = (ik) bVar3.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar3 = (com.waze.sound.a.c) bVar3.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        fm fmVar = (fm) bVar3.a(new h.g.b.m(fm.class), null, null);
                        iv ivVar = (iv) bVar3.a(new h.g.b.m(iv.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("VoiceAssetsUseCase");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new ie(ikVar, cVar3, ivVar, fmVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = kb.f40359a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        com.waze.sharedui.f.k kVar = (com.waze.sharedui.f.k) bVar4.a(new h.g.b.m(com.waze.sharedui.f.k.class), null, null);
                        com.waze.shared_infra.i.b bVar5 = (com.waze.shared_infra.i.b) bVar4.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("VoiceListDataSource");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new jq(eVarD3, kVar, bVar5);
                    case 3:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i132 = kb.f40359a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i14 = h.g.b.ar.f48106a;
                        return new com.waze.sound.f.k((com.waze.stats.ax) bVar6.a(new h.g.b.m(com.waze.stats.ax.class), null, null));
                    case 4:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i15 = kb.f40359a;
                        h.g.b.x.f(bVar7, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar4 = (com.waze.sound.a.c) bVar7.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar2 = (com.waze.sound.a.h) bVar7.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        bj bjVar = (bj) bVar7.a(new h.g.b.m(bj.class), null, null);
                        com.waze.copilot.a.u uVar2 = (com.waze.copilot.a.u) bVar7.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        bg bgVar = (bg) bVar7.a(new h.g.b.m(bg.class), null, null);
                        hx hxVar = (hx) bVar7.a(new h.g.b.m(hx.class), null, null);
                        com.waze.mywaze.ah ahVar = (com.waze.mywaze.ah) bVar7.a(new h.g.b.m(com.waze.mywaze.ah.class), null, null);
                        com.waze.settings.eb ebVar = (com.waze.settings.eb) bVar7.a(new h.g.b.m(com.waze.settings.eb.class), null, null);
                        com.waze.search.c.m mVar = (com.waze.search.c.m) bVar7.a(new h.g.b.m(com.waze.search.c.m.class), null, null);
                        kotlinx.coroutines.ab abVarB2 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("VoiceSettingsViewModel");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.settings.i.a.q(cVar4, hVar2, bjVar, uVar2, bgVar, hxVar, ahVar, ebVar, mVar, eVarD4, abVarB2);
                    case 5:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i17 = kb.f40359a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = h.g.b.ar.f48106a;
                        return new com.waze.sound.e.k((bs) bVar8.a(new h.g.b.m(bs.class), null, null), (com.waze.settings.eb) bVar8.a(new h.g.b.m(com.waze.settings.eb.class), null, null), (com.waze.sound.a.c) bVar8.a(new h.g.b.m(com.waze.sound.a.c.class), null, null), (bj) bVar8.a(new h.g.b.m(bj.class), null, null));
                    case 6:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i19 = kb.f40359a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.sound.b.a((TtsNativeManager) bVar9.a(new h.g.b.m(TtsNativeManager.class), null, null));
                    case 7:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = kb.f40359a;
                        h.g.b.x.f(bVar10, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        ic icVar = (ic) bVar10.a(new h.g.b.m(ic.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("VoiceAssetsNativeManager");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new VoiceAssetsNativeManager(icVar, eVarD5, null, 4, null);
                    case 8:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i23 = kb.f40359a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar11);
                        int i24 = h.g.b.ar.f48106a;
                        kc kcVar = (kc) bVar11.a(new h.g.b.m(kc.class), null, null);
                        iw iwVar = (iw) bVar11.a(new h.g.b.m(iw.class), null, null);
                        com.waze.sound.f.j jVar = (com.waze.sound.f.j) bVar11.a(new h.g.b.m(com.waze.sound.f.j.class), null, null);
                        em emVar = (em) bVar11.a(new h.g.b.m(em.class), null, null);
                        kotlinx.coroutines.ab abVarB3 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.b bVar12 = (com.waze.shared_infra.i.b) bVar11.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("VoiceFilesProviderImpl");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new jl(contextH, kcVar, eVarD6, iwVar, jVar, emVar, bVar12, abVarB3);
                    case 9:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i25 = kb.f40359a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = h.g.b.ar.f48106a;
                        hz hzVar = (hz) bVar13.a(new h.g.b.m(hz.class), null, null);
                        VoicesNativeManager voicesNativeManager = (VoicesNativeManager) bVar13.a(new h.g.b.m(VoicesNativeManager.class), null, null);
                        iv ivVar2 = (iv) bVar13.a(new h.g.b.m(iv.class), null, null);
                        com.waze.sound.a.d dVar = (com.waze.sound.a.d) bVar13.a(new h.g.b.m(com.waze.sound.a.d.class), null, null);
                        com.waze.sound.a.e eVar32 = (com.waze.sound.a.e) bVar13.a(new h.g.b.m(com.waze.sound.a.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("VoiceRepository");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sound.a.g(hzVar, voicesNativeManager, ivVar2, dVar, eVar32, eVarD7);
                    case 10:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i27 = kb.f40359a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i28 = h.g.b.ar.f48106a;
                        return new com.waze.sound.a.d((em) bVar14.a(new h.g.b.m(em.class), null, null));
                    case 11:
                        int i29 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sound.a.e();
                    case 12:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i30 = kb.f40359a;
                        h.g.b.x.f(bVar15, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        String path = k.a.k.h(bVar15).getCacheDir().getPath();
                        h.g.b.x.e(path, "getPath(...)");
                        com.waze.shared_infra.coordinators.c cVar5 = new com.waze.shared_infra.coordinators.c(new com.waze.shared_infra.b.b(path, "voiceAssetCacheFile"));
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("VoiceAssetProtoCache");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new hz(eVarD8, cVar5);
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i31 = kb.f40359a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i32 = h.g.b.ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar16.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar3 = e.a.h.f47759a;
                        h.g.b.x.e(hVar3, "DEFAULT");
                        return new com.waze.ce.ab(iVarB, hVar3);
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i33 = kb.f40359a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i34 = h.g.b.ar.f48106a;
                        return new ju((com.waze.ce.ab) bVar17.a(new h.g.b.m(com.waze.ce.ab.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i35 = kb.f40359a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new iw((em) bVar18.a(new h.g.b.m(em.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i37 = kb.f40359a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i38 = h.g.b.ar.f48106a;
                        cx cxVar = (cx) bVar19.a(new h.g.b.m(cx.class), null, null);
                        ik ikVar2 = (ik) bVar19.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar6 = (com.waze.sound.a.c) bVar19.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        bs bsVar = (bs) bVar19.a(new h.g.b.m(bs.class), null, null);
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar19.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        com.waze.navigate.dg dgVar = (com.waze.navigate.dg) bVar19.a(new h.g.b.m(com.waze.navigate.dg.class), null, null);
                        com.waze.navigate.gx gxVar = (com.waze.navigate.gx) bVar19.a(new h.g.b.m(com.waze.navigate.gx.class), null, null);
                        com.waze.shared_infra.i.b bVar20 = (com.waze.shared_infra.i.b) bVar19.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        ca caVar = (ca) bVar19.a(new h.g.b.m(ca.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("RouteInstructionVoicesRepository");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new dd(cxVar, eVarD9, gxVar, ikVar2, cVar6, bsVar, dgVar, driveToNativeManager, bVar20, caVar, kotlinx.coroutines.av.b());
                    case 17:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i39 = kb.f40359a;
                        h.g.b.x.f(bVar21, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar7 = (com.waze.sound.a.c) bVar21.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        iv ivVar3 = (iv) bVar21.a(new h.g.b.m(iv.class), null, null);
                        ik ikVar3 = (ik) bVar21.a(new h.g.b.m(ik.class), null, null);
                        dx dxVar = (dx) bVar21.a(new h.g.b.m(dx.class), null, null);
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("RouteInstructionsVoiceAssetsRepository");
                        h.g.b.x.e(eVarD10, "create(...)");
                        int i41 = kotlinx.coroutines.av.f51370a;
                        return new eb(eVarD10, cVar7, ivVar3, ikVar3, dxVar, kotlinx.coroutines.e.ac.f51860a, kotlinx.coroutines.av.b());
                    case 18:
                        int i42 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new dx();
                    case 19:
                        int i43 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cy();
                    default:
                        int i44 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cc();
                }
            }
        };
        org.a.d.e.e eVar12 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(iv.class), null, pVar9, cVar, h.a.i.h()));
        aVar.f(eVar12);
        new org.a.d.c.d(aVar, eVar12);
        final int i14 = 15;
        h.g.a.p pVar10 = new h.g.a.p() { // from class: com.waze.sound.jz
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i14) {
                    case 0:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i72 = kb.f40359a;
                        h.g.b.x.f(bVar2, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar2 = (com.waze.sound.a.c) bVar2.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar = (com.waze.sound.a.h) bVar2.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        com.waze.copilot.a.u uVar = (com.waze.copilot.a.u) bVar2.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        kotlinx.coroutines.ab abVarB = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("CustomVoicesFallbackVoicePickerViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.settings.ae(cVar2, hVar, uVar, eVarD, abVarB);
                    case 1:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = kb.f40359a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        ik ikVar = (ik) bVar3.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar3 = (com.waze.sound.a.c) bVar3.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        fm fmVar = (fm) bVar3.a(new h.g.b.m(fm.class), null, null);
                        iv ivVar = (iv) bVar3.a(new h.g.b.m(iv.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("VoiceAssetsUseCase");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new ie(ikVar, cVar3, ivVar, fmVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = kb.f40359a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        com.waze.sharedui.f.k kVar = (com.waze.sharedui.f.k) bVar4.a(new h.g.b.m(com.waze.sharedui.f.k.class), null, null);
                        com.waze.shared_infra.i.b bVar5 = (com.waze.shared_infra.i.b) bVar4.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("VoiceListDataSource");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new jq(eVarD3, kVar, bVar5);
                    case 3:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i132 = kb.f40359a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new com.waze.sound.f.k((com.waze.stats.ax) bVar6.a(new h.g.b.m(com.waze.stats.ax.class), null, null));
                    case 4:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i15 = kb.f40359a;
                        h.g.b.x.f(bVar7, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar4 = (com.waze.sound.a.c) bVar7.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar2 = (com.waze.sound.a.h) bVar7.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        bj bjVar = (bj) bVar7.a(new h.g.b.m(bj.class), null, null);
                        com.waze.copilot.a.u uVar2 = (com.waze.copilot.a.u) bVar7.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        bg bgVar = (bg) bVar7.a(new h.g.b.m(bg.class), null, null);
                        hx hxVar = (hx) bVar7.a(new h.g.b.m(hx.class), null, null);
                        com.waze.mywaze.ah ahVar = (com.waze.mywaze.ah) bVar7.a(new h.g.b.m(com.waze.mywaze.ah.class), null, null);
                        com.waze.settings.eb ebVar = (com.waze.settings.eb) bVar7.a(new h.g.b.m(com.waze.settings.eb.class), null, null);
                        com.waze.search.c.m mVar = (com.waze.search.c.m) bVar7.a(new h.g.b.m(com.waze.search.c.m.class), null, null);
                        kotlinx.coroutines.ab abVarB2 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("VoiceSettingsViewModel");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.settings.i.a.q(cVar4, hVar2, bjVar, uVar2, bgVar, hxVar, ahVar, ebVar, mVar, eVarD4, abVarB2);
                    case 5:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i17 = kb.f40359a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = h.g.b.ar.f48106a;
                        return new com.waze.sound.e.k((bs) bVar8.a(new h.g.b.m(bs.class), null, null), (com.waze.settings.eb) bVar8.a(new h.g.b.m(com.waze.settings.eb.class), null, null), (com.waze.sound.a.c) bVar8.a(new h.g.b.m(com.waze.sound.a.c.class), null, null), (bj) bVar8.a(new h.g.b.m(bj.class), null, null));
                    case 6:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i19 = kb.f40359a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.sound.b.a((TtsNativeManager) bVar9.a(new h.g.b.m(TtsNativeManager.class), null, null));
                    case 7:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = kb.f40359a;
                        h.g.b.x.f(bVar10, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        ic icVar = (ic) bVar10.a(new h.g.b.m(ic.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("VoiceAssetsNativeManager");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new VoiceAssetsNativeManager(icVar, eVarD5, null, 4, null);
                    case 8:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i23 = kb.f40359a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar11);
                        int i24 = h.g.b.ar.f48106a;
                        kc kcVar = (kc) bVar11.a(new h.g.b.m(kc.class), null, null);
                        iw iwVar = (iw) bVar11.a(new h.g.b.m(iw.class), null, null);
                        com.waze.sound.f.j jVar = (com.waze.sound.f.j) bVar11.a(new h.g.b.m(com.waze.sound.f.j.class), null, null);
                        em emVar = (em) bVar11.a(new h.g.b.m(em.class), null, null);
                        kotlinx.coroutines.ab abVarB3 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.b bVar12 = (com.waze.shared_infra.i.b) bVar11.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("VoiceFilesProviderImpl");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new jl(contextH, kcVar, eVarD6, iwVar, jVar, emVar, bVar12, abVarB3);
                    case 9:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i25 = kb.f40359a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = h.g.b.ar.f48106a;
                        hz hzVar = (hz) bVar13.a(new h.g.b.m(hz.class), null, null);
                        VoicesNativeManager voicesNativeManager = (VoicesNativeManager) bVar13.a(new h.g.b.m(VoicesNativeManager.class), null, null);
                        iv ivVar2 = (iv) bVar13.a(new h.g.b.m(iv.class), null, null);
                        com.waze.sound.a.d dVar = (com.waze.sound.a.d) bVar13.a(new h.g.b.m(com.waze.sound.a.d.class), null, null);
                        com.waze.sound.a.e eVar32 = (com.waze.sound.a.e) bVar13.a(new h.g.b.m(com.waze.sound.a.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("VoiceRepository");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sound.a.g(hzVar, voicesNativeManager, ivVar2, dVar, eVar32, eVarD7);
                    case 10:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i27 = kb.f40359a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i28 = h.g.b.ar.f48106a;
                        return new com.waze.sound.a.d((em) bVar14.a(new h.g.b.m(em.class), null, null));
                    case 11:
                        int i29 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sound.a.e();
                    case 12:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i30 = kb.f40359a;
                        h.g.b.x.f(bVar15, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        String path = k.a.k.h(bVar15).getCacheDir().getPath();
                        h.g.b.x.e(path, "getPath(...)");
                        com.waze.shared_infra.coordinators.c cVar5 = new com.waze.shared_infra.coordinators.c(new com.waze.shared_infra.b.b(path, "voiceAssetCacheFile"));
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("VoiceAssetProtoCache");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new hz(eVarD8, cVar5);
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i31 = kb.f40359a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i32 = h.g.b.ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar16.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar3 = e.a.h.f47759a;
                        h.g.b.x.e(hVar3, "DEFAULT");
                        return new com.waze.ce.ab(iVarB, hVar3);
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i33 = kb.f40359a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i34 = h.g.b.ar.f48106a;
                        return new ju((com.waze.ce.ab) bVar17.a(new h.g.b.m(com.waze.ce.ab.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i35 = kb.f40359a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new iw((em) bVar18.a(new h.g.b.m(em.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i37 = kb.f40359a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i38 = h.g.b.ar.f48106a;
                        cx cxVar = (cx) bVar19.a(new h.g.b.m(cx.class), null, null);
                        ik ikVar2 = (ik) bVar19.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar6 = (com.waze.sound.a.c) bVar19.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        bs bsVar = (bs) bVar19.a(new h.g.b.m(bs.class), null, null);
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar19.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        com.waze.navigate.dg dgVar = (com.waze.navigate.dg) bVar19.a(new h.g.b.m(com.waze.navigate.dg.class), null, null);
                        com.waze.navigate.gx gxVar = (com.waze.navigate.gx) bVar19.a(new h.g.b.m(com.waze.navigate.gx.class), null, null);
                        com.waze.shared_infra.i.b bVar20 = (com.waze.shared_infra.i.b) bVar19.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        ca caVar = (ca) bVar19.a(new h.g.b.m(ca.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("RouteInstructionVoicesRepository");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new dd(cxVar, eVarD9, gxVar, ikVar2, cVar6, bsVar, dgVar, driveToNativeManager, bVar20, caVar, kotlinx.coroutines.av.b());
                    case 17:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i39 = kb.f40359a;
                        h.g.b.x.f(bVar21, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar7 = (com.waze.sound.a.c) bVar21.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        iv ivVar3 = (iv) bVar21.a(new h.g.b.m(iv.class), null, null);
                        ik ikVar3 = (ik) bVar21.a(new h.g.b.m(ik.class), null, null);
                        dx dxVar = (dx) bVar21.a(new h.g.b.m(dx.class), null, null);
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("RouteInstructionsVoiceAssetsRepository");
                        h.g.b.x.e(eVarD10, "create(...)");
                        int i41 = kotlinx.coroutines.av.f51370a;
                        return new eb(eVarD10, cVar7, ivVar3, ikVar3, dxVar, kotlinx.coroutines.e.ac.f51860a, kotlinx.coroutines.av.b());
                    case 18:
                        int i42 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new dx();
                    case 19:
                        int i43 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cy();
                    default:
                        int i44 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cc();
                }
            }
        };
        org.a.d.e.e eVar13 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(iw.class), null, pVar10, cVar, h.a.i.h()));
        aVar.f(eVar13);
        new org.a.d.c.d(aVar, eVar13);
        final int i15 = 16;
        h.g.a.p pVar11 = new h.g.a.p() { // from class: com.waze.sound.jz
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i15) {
                    case 0:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i72 = kb.f40359a;
                        h.g.b.x.f(bVar2, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar2 = (com.waze.sound.a.c) bVar2.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar = (com.waze.sound.a.h) bVar2.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        com.waze.copilot.a.u uVar = (com.waze.copilot.a.u) bVar2.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        kotlinx.coroutines.ab abVarB = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("CustomVoicesFallbackVoicePickerViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.settings.ae(cVar2, hVar, uVar, eVarD, abVarB);
                    case 1:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = kb.f40359a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        ik ikVar = (ik) bVar3.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar3 = (com.waze.sound.a.c) bVar3.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        fm fmVar = (fm) bVar3.a(new h.g.b.m(fm.class), null, null);
                        iv ivVar = (iv) bVar3.a(new h.g.b.m(iv.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("VoiceAssetsUseCase");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new ie(ikVar, cVar3, ivVar, fmVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = kb.f40359a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        com.waze.sharedui.f.k kVar = (com.waze.sharedui.f.k) bVar4.a(new h.g.b.m(com.waze.sharedui.f.k.class), null, null);
                        com.waze.shared_infra.i.b bVar5 = (com.waze.shared_infra.i.b) bVar4.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("VoiceListDataSource");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new jq(eVarD3, kVar, bVar5);
                    case 3:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i132 = kb.f40359a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new com.waze.sound.f.k((com.waze.stats.ax) bVar6.a(new h.g.b.m(com.waze.stats.ax.class), null, null));
                    case 4:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i152 = kb.f40359a;
                        h.g.b.x.f(bVar7, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar4 = (com.waze.sound.a.c) bVar7.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar2 = (com.waze.sound.a.h) bVar7.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        bj bjVar = (bj) bVar7.a(new h.g.b.m(bj.class), null, null);
                        com.waze.copilot.a.u uVar2 = (com.waze.copilot.a.u) bVar7.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        bg bgVar = (bg) bVar7.a(new h.g.b.m(bg.class), null, null);
                        hx hxVar = (hx) bVar7.a(new h.g.b.m(hx.class), null, null);
                        com.waze.mywaze.ah ahVar = (com.waze.mywaze.ah) bVar7.a(new h.g.b.m(com.waze.mywaze.ah.class), null, null);
                        com.waze.settings.eb ebVar = (com.waze.settings.eb) bVar7.a(new h.g.b.m(com.waze.settings.eb.class), null, null);
                        com.waze.search.c.m mVar = (com.waze.search.c.m) bVar7.a(new h.g.b.m(com.waze.search.c.m.class), null, null);
                        kotlinx.coroutines.ab abVarB2 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("VoiceSettingsViewModel");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.settings.i.a.q(cVar4, hVar2, bjVar, uVar2, bgVar, hxVar, ahVar, ebVar, mVar, eVarD4, abVarB2);
                    case 5:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i17 = kb.f40359a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = h.g.b.ar.f48106a;
                        return new com.waze.sound.e.k((bs) bVar8.a(new h.g.b.m(bs.class), null, null), (com.waze.settings.eb) bVar8.a(new h.g.b.m(com.waze.settings.eb.class), null, null), (com.waze.sound.a.c) bVar8.a(new h.g.b.m(com.waze.sound.a.c.class), null, null), (bj) bVar8.a(new h.g.b.m(bj.class), null, null));
                    case 6:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i19 = kb.f40359a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.sound.b.a((TtsNativeManager) bVar9.a(new h.g.b.m(TtsNativeManager.class), null, null));
                    case 7:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = kb.f40359a;
                        h.g.b.x.f(bVar10, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        ic icVar = (ic) bVar10.a(new h.g.b.m(ic.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("VoiceAssetsNativeManager");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new VoiceAssetsNativeManager(icVar, eVarD5, null, 4, null);
                    case 8:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i23 = kb.f40359a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar11);
                        int i24 = h.g.b.ar.f48106a;
                        kc kcVar = (kc) bVar11.a(new h.g.b.m(kc.class), null, null);
                        iw iwVar = (iw) bVar11.a(new h.g.b.m(iw.class), null, null);
                        com.waze.sound.f.j jVar = (com.waze.sound.f.j) bVar11.a(new h.g.b.m(com.waze.sound.f.j.class), null, null);
                        em emVar = (em) bVar11.a(new h.g.b.m(em.class), null, null);
                        kotlinx.coroutines.ab abVarB3 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.b bVar12 = (com.waze.shared_infra.i.b) bVar11.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("VoiceFilesProviderImpl");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new jl(contextH, kcVar, eVarD6, iwVar, jVar, emVar, bVar12, abVarB3);
                    case 9:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i25 = kb.f40359a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = h.g.b.ar.f48106a;
                        hz hzVar = (hz) bVar13.a(new h.g.b.m(hz.class), null, null);
                        VoicesNativeManager voicesNativeManager = (VoicesNativeManager) bVar13.a(new h.g.b.m(VoicesNativeManager.class), null, null);
                        iv ivVar2 = (iv) bVar13.a(new h.g.b.m(iv.class), null, null);
                        com.waze.sound.a.d dVar = (com.waze.sound.a.d) bVar13.a(new h.g.b.m(com.waze.sound.a.d.class), null, null);
                        com.waze.sound.a.e eVar32 = (com.waze.sound.a.e) bVar13.a(new h.g.b.m(com.waze.sound.a.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("VoiceRepository");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sound.a.g(hzVar, voicesNativeManager, ivVar2, dVar, eVar32, eVarD7);
                    case 10:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i27 = kb.f40359a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i28 = h.g.b.ar.f48106a;
                        return new com.waze.sound.a.d((em) bVar14.a(new h.g.b.m(em.class), null, null));
                    case 11:
                        int i29 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sound.a.e();
                    case 12:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i30 = kb.f40359a;
                        h.g.b.x.f(bVar15, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        String path = k.a.k.h(bVar15).getCacheDir().getPath();
                        h.g.b.x.e(path, "getPath(...)");
                        com.waze.shared_infra.coordinators.c cVar5 = new com.waze.shared_infra.coordinators.c(new com.waze.shared_infra.b.b(path, "voiceAssetCacheFile"));
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("VoiceAssetProtoCache");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new hz(eVarD8, cVar5);
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i31 = kb.f40359a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i32 = h.g.b.ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar16.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar3 = e.a.h.f47759a;
                        h.g.b.x.e(hVar3, "DEFAULT");
                        return new com.waze.ce.ab(iVarB, hVar3);
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i33 = kb.f40359a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i34 = h.g.b.ar.f48106a;
                        return new ju((com.waze.ce.ab) bVar17.a(new h.g.b.m(com.waze.ce.ab.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i35 = kb.f40359a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new iw((em) bVar18.a(new h.g.b.m(em.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i37 = kb.f40359a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i38 = h.g.b.ar.f48106a;
                        cx cxVar = (cx) bVar19.a(new h.g.b.m(cx.class), null, null);
                        ik ikVar2 = (ik) bVar19.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar6 = (com.waze.sound.a.c) bVar19.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        bs bsVar = (bs) bVar19.a(new h.g.b.m(bs.class), null, null);
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar19.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        com.waze.navigate.dg dgVar = (com.waze.navigate.dg) bVar19.a(new h.g.b.m(com.waze.navigate.dg.class), null, null);
                        com.waze.navigate.gx gxVar = (com.waze.navigate.gx) bVar19.a(new h.g.b.m(com.waze.navigate.gx.class), null, null);
                        com.waze.shared_infra.i.b bVar20 = (com.waze.shared_infra.i.b) bVar19.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        ca caVar = (ca) bVar19.a(new h.g.b.m(ca.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("RouteInstructionVoicesRepository");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new dd(cxVar, eVarD9, gxVar, ikVar2, cVar6, bsVar, dgVar, driveToNativeManager, bVar20, caVar, kotlinx.coroutines.av.b());
                    case 17:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i39 = kb.f40359a;
                        h.g.b.x.f(bVar21, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar7 = (com.waze.sound.a.c) bVar21.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        iv ivVar3 = (iv) bVar21.a(new h.g.b.m(iv.class), null, null);
                        ik ikVar3 = (ik) bVar21.a(new h.g.b.m(ik.class), null, null);
                        dx dxVar = (dx) bVar21.a(new h.g.b.m(dx.class), null, null);
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("RouteInstructionsVoiceAssetsRepository");
                        h.g.b.x.e(eVarD10, "create(...)");
                        int i41 = kotlinx.coroutines.av.f51370a;
                        return new eb(eVarD10, cVar7, ivVar3, ikVar3, dxVar, kotlinx.coroutines.e.ac.f51860a, kotlinx.coroutines.av.b());
                    case 18:
                        int i42 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new dx();
                    case 19:
                        int i43 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cy();
                    default:
                        int i44 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cc();
                }
            }
        };
        org.a.d.e.e eVar14 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(dd.class), null, pVar11, cVar, h.a.i.h()));
        aVar.f(eVar14);
        new org.a.d.c.d(aVar, eVar14);
        final int i16 = 17;
        h.g.a.p pVar12 = new h.g.a.p() { // from class: com.waze.sound.jz
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i16) {
                    case 0:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i72 = kb.f40359a;
                        h.g.b.x.f(bVar2, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar2 = (com.waze.sound.a.c) bVar2.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar = (com.waze.sound.a.h) bVar2.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        com.waze.copilot.a.u uVar = (com.waze.copilot.a.u) bVar2.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        kotlinx.coroutines.ab abVarB = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("CustomVoicesFallbackVoicePickerViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.settings.ae(cVar2, hVar, uVar, eVarD, abVarB);
                    case 1:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = kb.f40359a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        ik ikVar = (ik) bVar3.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar3 = (com.waze.sound.a.c) bVar3.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        fm fmVar = (fm) bVar3.a(new h.g.b.m(fm.class), null, null);
                        iv ivVar = (iv) bVar3.a(new h.g.b.m(iv.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("VoiceAssetsUseCase");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new ie(ikVar, cVar3, ivVar, fmVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = kb.f40359a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        com.waze.sharedui.f.k kVar = (com.waze.sharedui.f.k) bVar4.a(new h.g.b.m(com.waze.sharedui.f.k.class), null, null);
                        com.waze.shared_infra.i.b bVar5 = (com.waze.shared_infra.i.b) bVar4.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("VoiceListDataSource");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new jq(eVarD3, kVar, bVar5);
                    case 3:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i132 = kb.f40359a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new com.waze.sound.f.k((com.waze.stats.ax) bVar6.a(new h.g.b.m(com.waze.stats.ax.class), null, null));
                    case 4:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i152 = kb.f40359a;
                        h.g.b.x.f(bVar7, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar4 = (com.waze.sound.a.c) bVar7.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar2 = (com.waze.sound.a.h) bVar7.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        bj bjVar = (bj) bVar7.a(new h.g.b.m(bj.class), null, null);
                        com.waze.copilot.a.u uVar2 = (com.waze.copilot.a.u) bVar7.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        bg bgVar = (bg) bVar7.a(new h.g.b.m(bg.class), null, null);
                        hx hxVar = (hx) bVar7.a(new h.g.b.m(hx.class), null, null);
                        com.waze.mywaze.ah ahVar = (com.waze.mywaze.ah) bVar7.a(new h.g.b.m(com.waze.mywaze.ah.class), null, null);
                        com.waze.settings.eb ebVar = (com.waze.settings.eb) bVar7.a(new h.g.b.m(com.waze.settings.eb.class), null, null);
                        com.waze.search.c.m mVar = (com.waze.search.c.m) bVar7.a(new h.g.b.m(com.waze.search.c.m.class), null, null);
                        kotlinx.coroutines.ab abVarB2 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("VoiceSettingsViewModel");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.settings.i.a.q(cVar4, hVar2, bjVar, uVar2, bgVar, hxVar, ahVar, ebVar, mVar, eVarD4, abVarB2);
                    case 5:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i17 = kb.f40359a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = h.g.b.ar.f48106a;
                        return new com.waze.sound.e.k((bs) bVar8.a(new h.g.b.m(bs.class), null, null), (com.waze.settings.eb) bVar8.a(new h.g.b.m(com.waze.settings.eb.class), null, null), (com.waze.sound.a.c) bVar8.a(new h.g.b.m(com.waze.sound.a.c.class), null, null), (bj) bVar8.a(new h.g.b.m(bj.class), null, null));
                    case 6:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i19 = kb.f40359a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.sound.b.a((TtsNativeManager) bVar9.a(new h.g.b.m(TtsNativeManager.class), null, null));
                    case 7:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = kb.f40359a;
                        h.g.b.x.f(bVar10, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        ic icVar = (ic) bVar10.a(new h.g.b.m(ic.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("VoiceAssetsNativeManager");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new VoiceAssetsNativeManager(icVar, eVarD5, null, 4, null);
                    case 8:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i23 = kb.f40359a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar11);
                        int i24 = h.g.b.ar.f48106a;
                        kc kcVar = (kc) bVar11.a(new h.g.b.m(kc.class), null, null);
                        iw iwVar = (iw) bVar11.a(new h.g.b.m(iw.class), null, null);
                        com.waze.sound.f.j jVar = (com.waze.sound.f.j) bVar11.a(new h.g.b.m(com.waze.sound.f.j.class), null, null);
                        em emVar = (em) bVar11.a(new h.g.b.m(em.class), null, null);
                        kotlinx.coroutines.ab abVarB3 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.b bVar12 = (com.waze.shared_infra.i.b) bVar11.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("VoiceFilesProviderImpl");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new jl(contextH, kcVar, eVarD6, iwVar, jVar, emVar, bVar12, abVarB3);
                    case 9:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i25 = kb.f40359a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = h.g.b.ar.f48106a;
                        hz hzVar = (hz) bVar13.a(new h.g.b.m(hz.class), null, null);
                        VoicesNativeManager voicesNativeManager = (VoicesNativeManager) bVar13.a(new h.g.b.m(VoicesNativeManager.class), null, null);
                        iv ivVar2 = (iv) bVar13.a(new h.g.b.m(iv.class), null, null);
                        com.waze.sound.a.d dVar = (com.waze.sound.a.d) bVar13.a(new h.g.b.m(com.waze.sound.a.d.class), null, null);
                        com.waze.sound.a.e eVar32 = (com.waze.sound.a.e) bVar13.a(new h.g.b.m(com.waze.sound.a.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("VoiceRepository");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sound.a.g(hzVar, voicesNativeManager, ivVar2, dVar, eVar32, eVarD7);
                    case 10:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i27 = kb.f40359a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i28 = h.g.b.ar.f48106a;
                        return new com.waze.sound.a.d((em) bVar14.a(new h.g.b.m(em.class), null, null));
                    case 11:
                        int i29 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sound.a.e();
                    case 12:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i30 = kb.f40359a;
                        h.g.b.x.f(bVar15, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        String path = k.a.k.h(bVar15).getCacheDir().getPath();
                        h.g.b.x.e(path, "getPath(...)");
                        com.waze.shared_infra.coordinators.c cVar5 = new com.waze.shared_infra.coordinators.c(new com.waze.shared_infra.b.b(path, "voiceAssetCacheFile"));
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("VoiceAssetProtoCache");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new hz(eVarD8, cVar5);
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i31 = kb.f40359a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i32 = h.g.b.ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar16.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar3 = e.a.h.f47759a;
                        h.g.b.x.e(hVar3, "DEFAULT");
                        return new com.waze.ce.ab(iVarB, hVar3);
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i33 = kb.f40359a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i34 = h.g.b.ar.f48106a;
                        return new ju((com.waze.ce.ab) bVar17.a(new h.g.b.m(com.waze.ce.ab.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i35 = kb.f40359a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new iw((em) bVar18.a(new h.g.b.m(em.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i37 = kb.f40359a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i38 = h.g.b.ar.f48106a;
                        cx cxVar = (cx) bVar19.a(new h.g.b.m(cx.class), null, null);
                        ik ikVar2 = (ik) bVar19.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar6 = (com.waze.sound.a.c) bVar19.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        bs bsVar = (bs) bVar19.a(new h.g.b.m(bs.class), null, null);
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar19.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        com.waze.navigate.dg dgVar = (com.waze.navigate.dg) bVar19.a(new h.g.b.m(com.waze.navigate.dg.class), null, null);
                        com.waze.navigate.gx gxVar = (com.waze.navigate.gx) bVar19.a(new h.g.b.m(com.waze.navigate.gx.class), null, null);
                        com.waze.shared_infra.i.b bVar20 = (com.waze.shared_infra.i.b) bVar19.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        ca caVar = (ca) bVar19.a(new h.g.b.m(ca.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("RouteInstructionVoicesRepository");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new dd(cxVar, eVarD9, gxVar, ikVar2, cVar6, bsVar, dgVar, driveToNativeManager, bVar20, caVar, kotlinx.coroutines.av.b());
                    case 17:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i39 = kb.f40359a;
                        h.g.b.x.f(bVar21, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar7 = (com.waze.sound.a.c) bVar21.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        iv ivVar3 = (iv) bVar21.a(new h.g.b.m(iv.class), null, null);
                        ik ikVar3 = (ik) bVar21.a(new h.g.b.m(ik.class), null, null);
                        dx dxVar = (dx) bVar21.a(new h.g.b.m(dx.class), null, null);
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("RouteInstructionsVoiceAssetsRepository");
                        h.g.b.x.e(eVarD10, "create(...)");
                        int i41 = kotlinx.coroutines.av.f51370a;
                        return new eb(eVarD10, cVar7, ivVar3, ikVar3, dxVar, kotlinx.coroutines.e.ac.f51860a, kotlinx.coroutines.av.b());
                    case 18:
                        int i42 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new dx();
                    case 19:
                        int i43 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cy();
                    default:
                        int i44 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cc();
                }
            }
        };
        org.a.d.e.e eVar15 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(eb.class), null, pVar12, cVar, h.a.i.h()));
        aVar.f(eVar15);
        new org.a.d.c.d(aVar, eVar15);
        h.g.a.p pVar13 = new h.g.a.p() { // from class: com.waze.sound.jz
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i12) {
                    case 0:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i72 = kb.f40359a;
                        h.g.b.x.f(bVar2, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar2 = (com.waze.sound.a.c) bVar2.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar = (com.waze.sound.a.h) bVar2.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        com.waze.copilot.a.u uVar = (com.waze.copilot.a.u) bVar2.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        kotlinx.coroutines.ab abVarB = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("CustomVoicesFallbackVoicePickerViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.settings.ae(cVar2, hVar, uVar, eVarD, abVarB);
                    case 1:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = kb.f40359a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        ik ikVar = (ik) bVar3.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar3 = (com.waze.sound.a.c) bVar3.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        fm fmVar = (fm) bVar3.a(new h.g.b.m(fm.class), null, null);
                        iv ivVar = (iv) bVar3.a(new h.g.b.m(iv.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("VoiceAssetsUseCase");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new ie(ikVar, cVar3, ivVar, fmVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = kb.f40359a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        com.waze.sharedui.f.k kVar = (com.waze.sharedui.f.k) bVar4.a(new h.g.b.m(com.waze.sharedui.f.k.class), null, null);
                        com.waze.shared_infra.i.b bVar5 = (com.waze.shared_infra.i.b) bVar4.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("VoiceListDataSource");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new jq(eVarD3, kVar, bVar5);
                    case 3:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i132 = kb.f40359a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new com.waze.sound.f.k((com.waze.stats.ax) bVar6.a(new h.g.b.m(com.waze.stats.ax.class), null, null));
                    case 4:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i152 = kb.f40359a;
                        h.g.b.x.f(bVar7, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar4 = (com.waze.sound.a.c) bVar7.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar2 = (com.waze.sound.a.h) bVar7.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        bj bjVar = (bj) bVar7.a(new h.g.b.m(bj.class), null, null);
                        com.waze.copilot.a.u uVar2 = (com.waze.copilot.a.u) bVar7.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        bg bgVar = (bg) bVar7.a(new h.g.b.m(bg.class), null, null);
                        hx hxVar = (hx) bVar7.a(new h.g.b.m(hx.class), null, null);
                        com.waze.mywaze.ah ahVar = (com.waze.mywaze.ah) bVar7.a(new h.g.b.m(com.waze.mywaze.ah.class), null, null);
                        com.waze.settings.eb ebVar = (com.waze.settings.eb) bVar7.a(new h.g.b.m(com.waze.settings.eb.class), null, null);
                        com.waze.search.c.m mVar = (com.waze.search.c.m) bVar7.a(new h.g.b.m(com.waze.search.c.m.class), null, null);
                        kotlinx.coroutines.ab abVarB2 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("VoiceSettingsViewModel");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.settings.i.a.q(cVar4, hVar2, bjVar, uVar2, bgVar, hxVar, ahVar, ebVar, mVar, eVarD4, abVarB2);
                    case 5:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i17 = kb.f40359a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = h.g.b.ar.f48106a;
                        return new com.waze.sound.e.k((bs) bVar8.a(new h.g.b.m(bs.class), null, null), (com.waze.settings.eb) bVar8.a(new h.g.b.m(com.waze.settings.eb.class), null, null), (com.waze.sound.a.c) bVar8.a(new h.g.b.m(com.waze.sound.a.c.class), null, null), (bj) bVar8.a(new h.g.b.m(bj.class), null, null));
                    case 6:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i19 = kb.f40359a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.sound.b.a((TtsNativeManager) bVar9.a(new h.g.b.m(TtsNativeManager.class), null, null));
                    case 7:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = kb.f40359a;
                        h.g.b.x.f(bVar10, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        ic icVar = (ic) bVar10.a(new h.g.b.m(ic.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("VoiceAssetsNativeManager");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new VoiceAssetsNativeManager(icVar, eVarD5, null, 4, null);
                    case 8:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i23 = kb.f40359a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar11);
                        int i24 = h.g.b.ar.f48106a;
                        kc kcVar = (kc) bVar11.a(new h.g.b.m(kc.class), null, null);
                        iw iwVar = (iw) bVar11.a(new h.g.b.m(iw.class), null, null);
                        com.waze.sound.f.j jVar = (com.waze.sound.f.j) bVar11.a(new h.g.b.m(com.waze.sound.f.j.class), null, null);
                        em emVar = (em) bVar11.a(new h.g.b.m(em.class), null, null);
                        kotlinx.coroutines.ab abVarB3 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.b bVar12 = (com.waze.shared_infra.i.b) bVar11.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("VoiceFilesProviderImpl");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new jl(contextH, kcVar, eVarD6, iwVar, jVar, emVar, bVar12, abVarB3);
                    case 9:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i25 = kb.f40359a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = h.g.b.ar.f48106a;
                        hz hzVar = (hz) bVar13.a(new h.g.b.m(hz.class), null, null);
                        VoicesNativeManager voicesNativeManager = (VoicesNativeManager) bVar13.a(new h.g.b.m(VoicesNativeManager.class), null, null);
                        iv ivVar2 = (iv) bVar13.a(new h.g.b.m(iv.class), null, null);
                        com.waze.sound.a.d dVar = (com.waze.sound.a.d) bVar13.a(new h.g.b.m(com.waze.sound.a.d.class), null, null);
                        com.waze.sound.a.e eVar32 = (com.waze.sound.a.e) bVar13.a(new h.g.b.m(com.waze.sound.a.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("VoiceRepository");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sound.a.g(hzVar, voicesNativeManager, ivVar2, dVar, eVar32, eVarD7);
                    case 10:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i27 = kb.f40359a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i28 = h.g.b.ar.f48106a;
                        return new com.waze.sound.a.d((em) bVar14.a(new h.g.b.m(em.class), null, null));
                    case 11:
                        int i29 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sound.a.e();
                    case 12:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i30 = kb.f40359a;
                        h.g.b.x.f(bVar15, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        String path = k.a.k.h(bVar15).getCacheDir().getPath();
                        h.g.b.x.e(path, "getPath(...)");
                        com.waze.shared_infra.coordinators.c cVar5 = new com.waze.shared_infra.coordinators.c(new com.waze.shared_infra.b.b(path, "voiceAssetCacheFile"));
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("VoiceAssetProtoCache");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new hz(eVarD8, cVar5);
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i31 = kb.f40359a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i32 = h.g.b.ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar16.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar3 = e.a.h.f47759a;
                        h.g.b.x.e(hVar3, "DEFAULT");
                        return new com.waze.ce.ab(iVarB, hVar3);
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i33 = kb.f40359a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i34 = h.g.b.ar.f48106a;
                        return new ju((com.waze.ce.ab) bVar17.a(new h.g.b.m(com.waze.ce.ab.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i35 = kb.f40359a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new iw((em) bVar18.a(new h.g.b.m(em.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i37 = kb.f40359a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i38 = h.g.b.ar.f48106a;
                        cx cxVar = (cx) bVar19.a(new h.g.b.m(cx.class), null, null);
                        ik ikVar2 = (ik) bVar19.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar6 = (com.waze.sound.a.c) bVar19.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        bs bsVar = (bs) bVar19.a(new h.g.b.m(bs.class), null, null);
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar19.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        com.waze.navigate.dg dgVar = (com.waze.navigate.dg) bVar19.a(new h.g.b.m(com.waze.navigate.dg.class), null, null);
                        com.waze.navigate.gx gxVar = (com.waze.navigate.gx) bVar19.a(new h.g.b.m(com.waze.navigate.gx.class), null, null);
                        com.waze.shared_infra.i.b bVar20 = (com.waze.shared_infra.i.b) bVar19.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        ca caVar = (ca) bVar19.a(new h.g.b.m(ca.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("RouteInstructionVoicesRepository");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new dd(cxVar, eVarD9, gxVar, ikVar2, cVar6, bsVar, dgVar, driveToNativeManager, bVar20, caVar, kotlinx.coroutines.av.b());
                    case 17:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i39 = kb.f40359a;
                        h.g.b.x.f(bVar21, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar7 = (com.waze.sound.a.c) bVar21.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        iv ivVar3 = (iv) bVar21.a(new h.g.b.m(iv.class), null, null);
                        ik ikVar3 = (ik) bVar21.a(new h.g.b.m(ik.class), null, null);
                        dx dxVar = (dx) bVar21.a(new h.g.b.m(dx.class), null, null);
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("RouteInstructionsVoiceAssetsRepository");
                        h.g.b.x.e(eVarD10, "create(...)");
                        int i41 = kotlinx.coroutines.av.f51370a;
                        return new eb(eVarD10, cVar7, ivVar3, ikVar3, dxVar, kotlinx.coroutines.e.ac.f51860a, kotlinx.coroutines.av.b());
                    case 18:
                        int i42 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new dx();
                    case 19:
                        int i43 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cy();
                    default:
                        int i44 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cc();
                }
            }
        };
        org.a.d.e.e eVar16 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(dx.class), null, pVar13, cVar, h.a.i.h()));
        aVar.f(eVar16);
        new org.a.d.c.d(aVar, eVar16);
        final int i17 = 19;
        h.g.a.p pVar14 = new h.g.a.p() { // from class: com.waze.sound.jz
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i17) {
                    case 0:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i72 = kb.f40359a;
                        h.g.b.x.f(bVar2, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar2 = (com.waze.sound.a.c) bVar2.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar = (com.waze.sound.a.h) bVar2.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        com.waze.copilot.a.u uVar = (com.waze.copilot.a.u) bVar2.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        kotlinx.coroutines.ab abVarB = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("CustomVoicesFallbackVoicePickerViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.settings.ae(cVar2, hVar, uVar, eVarD, abVarB);
                    case 1:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = kb.f40359a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        ik ikVar = (ik) bVar3.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar3 = (com.waze.sound.a.c) bVar3.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        fm fmVar = (fm) bVar3.a(new h.g.b.m(fm.class), null, null);
                        iv ivVar = (iv) bVar3.a(new h.g.b.m(iv.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("VoiceAssetsUseCase");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new ie(ikVar, cVar3, ivVar, fmVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = kb.f40359a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        com.waze.sharedui.f.k kVar = (com.waze.sharedui.f.k) bVar4.a(new h.g.b.m(com.waze.sharedui.f.k.class), null, null);
                        com.waze.shared_infra.i.b bVar5 = (com.waze.shared_infra.i.b) bVar4.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("VoiceListDataSource");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new jq(eVarD3, kVar, bVar5);
                    case 3:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i132 = kb.f40359a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new com.waze.sound.f.k((com.waze.stats.ax) bVar6.a(new h.g.b.m(com.waze.stats.ax.class), null, null));
                    case 4:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i152 = kb.f40359a;
                        h.g.b.x.f(bVar7, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar4 = (com.waze.sound.a.c) bVar7.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar2 = (com.waze.sound.a.h) bVar7.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        bj bjVar = (bj) bVar7.a(new h.g.b.m(bj.class), null, null);
                        com.waze.copilot.a.u uVar2 = (com.waze.copilot.a.u) bVar7.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        bg bgVar = (bg) bVar7.a(new h.g.b.m(bg.class), null, null);
                        hx hxVar = (hx) bVar7.a(new h.g.b.m(hx.class), null, null);
                        com.waze.mywaze.ah ahVar = (com.waze.mywaze.ah) bVar7.a(new h.g.b.m(com.waze.mywaze.ah.class), null, null);
                        com.waze.settings.eb ebVar = (com.waze.settings.eb) bVar7.a(new h.g.b.m(com.waze.settings.eb.class), null, null);
                        com.waze.search.c.m mVar = (com.waze.search.c.m) bVar7.a(new h.g.b.m(com.waze.search.c.m.class), null, null);
                        kotlinx.coroutines.ab abVarB2 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("VoiceSettingsViewModel");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.settings.i.a.q(cVar4, hVar2, bjVar, uVar2, bgVar, hxVar, ahVar, ebVar, mVar, eVarD4, abVarB2);
                    case 5:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i172 = kb.f40359a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = h.g.b.ar.f48106a;
                        return new com.waze.sound.e.k((bs) bVar8.a(new h.g.b.m(bs.class), null, null), (com.waze.settings.eb) bVar8.a(new h.g.b.m(com.waze.settings.eb.class), null, null), (com.waze.sound.a.c) bVar8.a(new h.g.b.m(com.waze.sound.a.c.class), null, null), (bj) bVar8.a(new h.g.b.m(bj.class), null, null));
                    case 6:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i19 = kb.f40359a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.sound.b.a((TtsNativeManager) bVar9.a(new h.g.b.m(TtsNativeManager.class), null, null));
                    case 7:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = kb.f40359a;
                        h.g.b.x.f(bVar10, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        ic icVar = (ic) bVar10.a(new h.g.b.m(ic.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("VoiceAssetsNativeManager");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new VoiceAssetsNativeManager(icVar, eVarD5, null, 4, null);
                    case 8:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i23 = kb.f40359a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar11);
                        int i24 = h.g.b.ar.f48106a;
                        kc kcVar = (kc) bVar11.a(new h.g.b.m(kc.class), null, null);
                        iw iwVar = (iw) bVar11.a(new h.g.b.m(iw.class), null, null);
                        com.waze.sound.f.j jVar = (com.waze.sound.f.j) bVar11.a(new h.g.b.m(com.waze.sound.f.j.class), null, null);
                        em emVar = (em) bVar11.a(new h.g.b.m(em.class), null, null);
                        kotlinx.coroutines.ab abVarB3 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.b bVar12 = (com.waze.shared_infra.i.b) bVar11.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("VoiceFilesProviderImpl");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new jl(contextH, kcVar, eVarD6, iwVar, jVar, emVar, bVar12, abVarB3);
                    case 9:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i25 = kb.f40359a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = h.g.b.ar.f48106a;
                        hz hzVar = (hz) bVar13.a(new h.g.b.m(hz.class), null, null);
                        VoicesNativeManager voicesNativeManager = (VoicesNativeManager) bVar13.a(new h.g.b.m(VoicesNativeManager.class), null, null);
                        iv ivVar2 = (iv) bVar13.a(new h.g.b.m(iv.class), null, null);
                        com.waze.sound.a.d dVar = (com.waze.sound.a.d) bVar13.a(new h.g.b.m(com.waze.sound.a.d.class), null, null);
                        com.waze.sound.a.e eVar32 = (com.waze.sound.a.e) bVar13.a(new h.g.b.m(com.waze.sound.a.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("VoiceRepository");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sound.a.g(hzVar, voicesNativeManager, ivVar2, dVar, eVar32, eVarD7);
                    case 10:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i27 = kb.f40359a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i28 = h.g.b.ar.f48106a;
                        return new com.waze.sound.a.d((em) bVar14.a(new h.g.b.m(em.class), null, null));
                    case 11:
                        int i29 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sound.a.e();
                    case 12:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i30 = kb.f40359a;
                        h.g.b.x.f(bVar15, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        String path = k.a.k.h(bVar15).getCacheDir().getPath();
                        h.g.b.x.e(path, "getPath(...)");
                        com.waze.shared_infra.coordinators.c cVar5 = new com.waze.shared_infra.coordinators.c(new com.waze.shared_infra.b.b(path, "voiceAssetCacheFile"));
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("VoiceAssetProtoCache");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new hz(eVarD8, cVar5);
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i31 = kb.f40359a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i32 = h.g.b.ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar16.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar3 = e.a.h.f47759a;
                        h.g.b.x.e(hVar3, "DEFAULT");
                        return new com.waze.ce.ab(iVarB, hVar3);
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i33 = kb.f40359a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i34 = h.g.b.ar.f48106a;
                        return new ju((com.waze.ce.ab) bVar17.a(new h.g.b.m(com.waze.ce.ab.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i35 = kb.f40359a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new iw((em) bVar18.a(new h.g.b.m(em.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i37 = kb.f40359a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i38 = h.g.b.ar.f48106a;
                        cx cxVar = (cx) bVar19.a(new h.g.b.m(cx.class), null, null);
                        ik ikVar2 = (ik) bVar19.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar6 = (com.waze.sound.a.c) bVar19.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        bs bsVar = (bs) bVar19.a(new h.g.b.m(bs.class), null, null);
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar19.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        com.waze.navigate.dg dgVar = (com.waze.navigate.dg) bVar19.a(new h.g.b.m(com.waze.navigate.dg.class), null, null);
                        com.waze.navigate.gx gxVar = (com.waze.navigate.gx) bVar19.a(new h.g.b.m(com.waze.navigate.gx.class), null, null);
                        com.waze.shared_infra.i.b bVar20 = (com.waze.shared_infra.i.b) bVar19.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        ca caVar = (ca) bVar19.a(new h.g.b.m(ca.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("RouteInstructionVoicesRepository");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new dd(cxVar, eVarD9, gxVar, ikVar2, cVar6, bsVar, dgVar, driveToNativeManager, bVar20, caVar, kotlinx.coroutines.av.b());
                    case 17:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i39 = kb.f40359a;
                        h.g.b.x.f(bVar21, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar7 = (com.waze.sound.a.c) bVar21.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        iv ivVar3 = (iv) bVar21.a(new h.g.b.m(iv.class), null, null);
                        ik ikVar3 = (ik) bVar21.a(new h.g.b.m(ik.class), null, null);
                        dx dxVar = (dx) bVar21.a(new h.g.b.m(dx.class), null, null);
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("RouteInstructionsVoiceAssetsRepository");
                        h.g.b.x.e(eVarD10, "create(...)");
                        int i41 = kotlinx.coroutines.av.f51370a;
                        return new eb(eVarD10, cVar7, ivVar3, ikVar3, dxVar, kotlinx.coroutines.e.ac.f51860a, kotlinx.coroutines.av.b());
                    case 18:
                        int i42 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new dx();
                    case 19:
                        int i43 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cy();
                    default:
                        int i44 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cc();
                }
            }
        };
        org.a.d.e.e eVar17 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(cx.class), null, pVar14, cVar, h.a.i.h()));
        aVar.f(eVar17);
        new org.a.d.c.d(aVar, eVar17);
        final int i18 = 20;
        h.g.a.p pVar15 = new h.g.a.p() { // from class: com.waze.sound.jz
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i18) {
                    case 0:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i72 = kb.f40359a;
                        h.g.b.x.f(bVar2, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar2 = (com.waze.sound.a.c) bVar2.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar = (com.waze.sound.a.h) bVar2.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        com.waze.copilot.a.u uVar = (com.waze.copilot.a.u) bVar2.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        kotlinx.coroutines.ab abVarB = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("CustomVoicesFallbackVoicePickerViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.settings.ae(cVar2, hVar, uVar, eVarD, abVarB);
                    case 1:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = kb.f40359a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        ik ikVar = (ik) bVar3.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar3 = (com.waze.sound.a.c) bVar3.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        fm fmVar = (fm) bVar3.a(new h.g.b.m(fm.class), null, null);
                        iv ivVar = (iv) bVar3.a(new h.g.b.m(iv.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("VoiceAssetsUseCase");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new ie(ikVar, cVar3, ivVar, fmVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = kb.f40359a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        com.waze.sharedui.f.k kVar = (com.waze.sharedui.f.k) bVar4.a(new h.g.b.m(com.waze.sharedui.f.k.class), null, null);
                        com.waze.shared_infra.i.b bVar5 = (com.waze.shared_infra.i.b) bVar4.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("VoiceListDataSource");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new jq(eVarD3, kVar, bVar5);
                    case 3:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i132 = kb.f40359a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new com.waze.sound.f.k((com.waze.stats.ax) bVar6.a(new h.g.b.m(com.waze.stats.ax.class), null, null));
                    case 4:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i152 = kb.f40359a;
                        h.g.b.x.f(bVar7, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar4 = (com.waze.sound.a.c) bVar7.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar2 = (com.waze.sound.a.h) bVar7.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        bj bjVar = (bj) bVar7.a(new h.g.b.m(bj.class), null, null);
                        com.waze.copilot.a.u uVar2 = (com.waze.copilot.a.u) bVar7.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        bg bgVar = (bg) bVar7.a(new h.g.b.m(bg.class), null, null);
                        hx hxVar = (hx) bVar7.a(new h.g.b.m(hx.class), null, null);
                        com.waze.mywaze.ah ahVar = (com.waze.mywaze.ah) bVar7.a(new h.g.b.m(com.waze.mywaze.ah.class), null, null);
                        com.waze.settings.eb ebVar = (com.waze.settings.eb) bVar7.a(new h.g.b.m(com.waze.settings.eb.class), null, null);
                        com.waze.search.c.m mVar = (com.waze.search.c.m) bVar7.a(new h.g.b.m(com.waze.search.c.m.class), null, null);
                        kotlinx.coroutines.ab abVarB2 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("VoiceSettingsViewModel");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.settings.i.a.q(cVar4, hVar2, bjVar, uVar2, bgVar, hxVar, ahVar, ebVar, mVar, eVarD4, abVarB2);
                    case 5:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i172 = kb.f40359a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i182 = h.g.b.ar.f48106a;
                        return new com.waze.sound.e.k((bs) bVar8.a(new h.g.b.m(bs.class), null, null), (com.waze.settings.eb) bVar8.a(new h.g.b.m(com.waze.settings.eb.class), null, null), (com.waze.sound.a.c) bVar8.a(new h.g.b.m(com.waze.sound.a.c.class), null, null), (bj) bVar8.a(new h.g.b.m(bj.class), null, null));
                    case 6:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i19 = kb.f40359a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.sound.b.a((TtsNativeManager) bVar9.a(new h.g.b.m(TtsNativeManager.class), null, null));
                    case 7:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = kb.f40359a;
                        h.g.b.x.f(bVar10, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        ic icVar = (ic) bVar10.a(new h.g.b.m(ic.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("VoiceAssetsNativeManager");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new VoiceAssetsNativeManager(icVar, eVarD5, null, 4, null);
                    case 8:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i23 = kb.f40359a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar11);
                        int i24 = h.g.b.ar.f48106a;
                        kc kcVar = (kc) bVar11.a(new h.g.b.m(kc.class), null, null);
                        iw iwVar = (iw) bVar11.a(new h.g.b.m(iw.class), null, null);
                        com.waze.sound.f.j jVar = (com.waze.sound.f.j) bVar11.a(new h.g.b.m(com.waze.sound.f.j.class), null, null);
                        em emVar = (em) bVar11.a(new h.g.b.m(em.class), null, null);
                        kotlinx.coroutines.ab abVarB3 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.b bVar12 = (com.waze.shared_infra.i.b) bVar11.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("VoiceFilesProviderImpl");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new jl(contextH, kcVar, eVarD6, iwVar, jVar, emVar, bVar12, abVarB3);
                    case 9:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i25 = kb.f40359a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = h.g.b.ar.f48106a;
                        hz hzVar = (hz) bVar13.a(new h.g.b.m(hz.class), null, null);
                        VoicesNativeManager voicesNativeManager = (VoicesNativeManager) bVar13.a(new h.g.b.m(VoicesNativeManager.class), null, null);
                        iv ivVar2 = (iv) bVar13.a(new h.g.b.m(iv.class), null, null);
                        com.waze.sound.a.d dVar = (com.waze.sound.a.d) bVar13.a(new h.g.b.m(com.waze.sound.a.d.class), null, null);
                        com.waze.sound.a.e eVar32 = (com.waze.sound.a.e) bVar13.a(new h.g.b.m(com.waze.sound.a.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("VoiceRepository");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sound.a.g(hzVar, voicesNativeManager, ivVar2, dVar, eVar32, eVarD7);
                    case 10:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i27 = kb.f40359a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i28 = h.g.b.ar.f48106a;
                        return new com.waze.sound.a.d((em) bVar14.a(new h.g.b.m(em.class), null, null));
                    case 11:
                        int i29 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sound.a.e();
                    case 12:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i30 = kb.f40359a;
                        h.g.b.x.f(bVar15, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        String path = k.a.k.h(bVar15).getCacheDir().getPath();
                        h.g.b.x.e(path, "getPath(...)");
                        com.waze.shared_infra.coordinators.c cVar5 = new com.waze.shared_infra.coordinators.c(new com.waze.shared_infra.b.b(path, "voiceAssetCacheFile"));
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("VoiceAssetProtoCache");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new hz(eVarD8, cVar5);
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i31 = kb.f40359a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i32 = h.g.b.ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar16.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar3 = e.a.h.f47759a;
                        h.g.b.x.e(hVar3, "DEFAULT");
                        return new com.waze.ce.ab(iVarB, hVar3);
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i33 = kb.f40359a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i34 = h.g.b.ar.f48106a;
                        return new ju((com.waze.ce.ab) bVar17.a(new h.g.b.m(com.waze.ce.ab.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i35 = kb.f40359a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new iw((em) bVar18.a(new h.g.b.m(em.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i37 = kb.f40359a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i38 = h.g.b.ar.f48106a;
                        cx cxVar = (cx) bVar19.a(new h.g.b.m(cx.class), null, null);
                        ik ikVar2 = (ik) bVar19.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar6 = (com.waze.sound.a.c) bVar19.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        bs bsVar = (bs) bVar19.a(new h.g.b.m(bs.class), null, null);
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar19.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        com.waze.navigate.dg dgVar = (com.waze.navigate.dg) bVar19.a(new h.g.b.m(com.waze.navigate.dg.class), null, null);
                        com.waze.navigate.gx gxVar = (com.waze.navigate.gx) bVar19.a(new h.g.b.m(com.waze.navigate.gx.class), null, null);
                        com.waze.shared_infra.i.b bVar20 = (com.waze.shared_infra.i.b) bVar19.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        ca caVar = (ca) bVar19.a(new h.g.b.m(ca.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("RouteInstructionVoicesRepository");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new dd(cxVar, eVarD9, gxVar, ikVar2, cVar6, bsVar, dgVar, driveToNativeManager, bVar20, caVar, kotlinx.coroutines.av.b());
                    case 17:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i39 = kb.f40359a;
                        h.g.b.x.f(bVar21, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar7 = (com.waze.sound.a.c) bVar21.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        iv ivVar3 = (iv) bVar21.a(new h.g.b.m(iv.class), null, null);
                        ik ikVar3 = (ik) bVar21.a(new h.g.b.m(ik.class), null, null);
                        dx dxVar = (dx) bVar21.a(new h.g.b.m(dx.class), null, null);
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("RouteInstructionsVoiceAssetsRepository");
                        h.g.b.x.e(eVarD10, "create(...)");
                        int i41 = kotlinx.coroutines.av.f51370a;
                        return new eb(eVarD10, cVar7, ivVar3, ikVar3, dxVar, kotlinx.coroutines.e.ac.f51860a, kotlinx.coroutines.av.b());
                    case 18:
                        int i42 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new dx();
                    case 19:
                        int i43 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cy();
                    default:
                        int i44 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cc();
                }
            }
        };
        org.a.d.e.e eVar18 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(ca.class), null, pVar15, cVar, h.a.i.h()));
        aVar.f(eVar18);
        new org.a.d.c.d(aVar, eVar18);
        com.waze.sound.e.a aVar2 = new com.waze.sound.e.a(i6);
        org.a.d.e.e eVar19 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(cj.class), null, aVar2, cVar, h.a.i.h()));
        aVar.f(eVar19);
        new org.a.d.c.d(aVar, eVar19);
        eq eqVar4 = new eq(i13);
        org.a.d.e.e eVar20 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(dr.class), null, eqVar4, cVar, h.a.i.h()));
        aVar.f(eVar20);
        new org.a.d.c.d(aVar, eVar20);
        eq eqVar5 = new eq(i7);
        org.a.d.e.e eVar21 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(SoundConfigNativeManager.class), null, eqVar5, cVar, h.a.i.h()));
        aVar.f(eVar21);
        com.waze.web.r.q(new org.a.d.c.d(aVar, eVar21), new h.g.b.m(em.class));
        eq eqVar6 = new eq(i8);
        org.a.d.e.e eVar22 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(gf.class), null, eqVar6, cVar, h.a.i.h()));
        aVar.f(eVar22);
        new org.a.d.c.d(aVar, eVar22);
        eq eqVar7 = new eq(i9);
        org.a.d.e.e eVar23 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(es.class), null, eqVar7, cVar, h.a.i.h()));
        aVar.f(eVar23);
        com.waze.web.r.q(new org.a.d.c.d(aVar, eVar23), new h.g.b.m(fm.class));
        eq eqVar8 = new eq(i10);
        org.a.d.e.e eVar24 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(TtsNativeManager.class), null, eqVar8, cVar, h.a.i.h()));
        aVar.f(eVar24);
        new org.a.d.c.d(aVar, eVar24);
        eq eqVar9 = new eq(i11);
        org.a.d.i.b bVar2 = org.a.d.j.a.f56411b;
        org.a.d.c.c cVar2 = org.a.d.c.c.f56383b;
        org.a.d.e.a aVar3 = new org.a.d.e.a(new org.a.d.c.a(bVar2, new h.g.b.m(com.waze.sound.a.h.class), null, eqVar9, cVar2, h.a.i.h()));
        aVar.f(aVar3);
        new org.a.d.c.d(aVar, aVar3);
        eq eqVar10 = new eq(15);
        org.a.d.e.a aVar4 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(bl.class), null, eqVar10, cVar2, h.a.i.h()));
        aVar.f(aVar4);
        new org.a.d.c.d(aVar, aVar4);
        eq eqVar11 = new eq(16);
        org.a.d.e.a aVar5 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(co.class), null, eqVar11, cVar2, h.a.i.h()));
        aVar.f(aVar5);
        new org.a.d.c.d(aVar, aVar5);
        eq eqVar12 = new eq(17);
        org.a.d.e.a aVar6 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.settings.x.class), null, eqVar12, cVar2, h.a.i.h()));
        aVar.f(aVar6);
        new org.a.d.c.d(aVar, aVar6);
        eq eqVar13 = new eq(i17);
        org.a.d.e.a aVar7 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.settings.v.class), null, eqVar13, cVar2, h.a.i.h()));
        aVar.f(aVar7);
        new org.a.d.c.d(aVar, aVar7);
        eq eqVar14 = new eq(20);
        org.a.d.e.e eVar25 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(bg.class), null, eqVar14, cVar, h.a.i.h()));
        aVar.f(eVar25);
        new org.a.d.c.d(aVar, eVar25);
        org.a.d.i.c cVar3 = new org.a.d.i.c(new h.g.b.m(CustomVoicesFallbackVoicePickerActivity.class));
        e.a.dx dxVar = new e.a.dx(cVar3, aVar);
        final int i19 = 0;
        h.g.a.p pVar16 = new h.g.a.p() { // from class: com.waze.sound.jz
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i19) {
                    case 0:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i72 = kb.f40359a;
                        h.g.b.x.f(bVar22, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar22 = (com.waze.sound.a.c) bVar22.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar = (com.waze.sound.a.h) bVar22.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        com.waze.copilot.a.u uVar = (com.waze.copilot.a.u) bVar22.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        kotlinx.coroutines.ab abVarB = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("CustomVoicesFallbackVoicePickerViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.settings.ae(cVar22, hVar, uVar, eVarD, abVarB);
                    case 1:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = kb.f40359a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        ik ikVar = (ik) bVar3.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar32 = (com.waze.sound.a.c) bVar3.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        fm fmVar = (fm) bVar3.a(new h.g.b.m(fm.class), null, null);
                        iv ivVar = (iv) bVar3.a(new h.g.b.m(iv.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("VoiceAssetsUseCase");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new ie(ikVar, cVar32, ivVar, fmVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = kb.f40359a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        com.waze.sharedui.f.k kVar = (com.waze.sharedui.f.k) bVar4.a(new h.g.b.m(com.waze.sharedui.f.k.class), null, null);
                        com.waze.shared_infra.i.b bVar5 = (com.waze.shared_infra.i.b) bVar4.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("VoiceListDataSource");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new jq(eVarD3, kVar, bVar5);
                    case 3:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i132 = kb.f40359a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new com.waze.sound.f.k((com.waze.stats.ax) bVar6.a(new h.g.b.m(com.waze.stats.ax.class), null, null));
                    case 4:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i152 = kb.f40359a;
                        h.g.b.x.f(bVar7, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar4 = (com.waze.sound.a.c) bVar7.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar2 = (com.waze.sound.a.h) bVar7.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        bj bjVar = (bj) bVar7.a(new h.g.b.m(bj.class), null, null);
                        com.waze.copilot.a.u uVar2 = (com.waze.copilot.a.u) bVar7.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        bg bgVar = (bg) bVar7.a(new h.g.b.m(bg.class), null, null);
                        hx hxVar = (hx) bVar7.a(new h.g.b.m(hx.class), null, null);
                        com.waze.mywaze.ah ahVar = (com.waze.mywaze.ah) bVar7.a(new h.g.b.m(com.waze.mywaze.ah.class), null, null);
                        com.waze.settings.eb ebVar = (com.waze.settings.eb) bVar7.a(new h.g.b.m(com.waze.settings.eb.class), null, null);
                        com.waze.search.c.m mVar = (com.waze.search.c.m) bVar7.a(new h.g.b.m(com.waze.search.c.m.class), null, null);
                        kotlinx.coroutines.ab abVarB2 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("VoiceSettingsViewModel");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.settings.i.a.q(cVar4, hVar2, bjVar, uVar2, bgVar, hxVar, ahVar, ebVar, mVar, eVarD4, abVarB2);
                    case 5:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i172 = kb.f40359a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i182 = h.g.b.ar.f48106a;
                        return new com.waze.sound.e.k((bs) bVar8.a(new h.g.b.m(bs.class), null, null), (com.waze.settings.eb) bVar8.a(new h.g.b.m(com.waze.settings.eb.class), null, null), (com.waze.sound.a.c) bVar8.a(new h.g.b.m(com.waze.sound.a.c.class), null, null), (bj) bVar8.a(new h.g.b.m(bj.class), null, null));
                    case 6:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i192 = kb.f40359a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.sound.b.a((TtsNativeManager) bVar9.a(new h.g.b.m(TtsNativeManager.class), null, null));
                    case 7:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = kb.f40359a;
                        h.g.b.x.f(bVar10, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        ic icVar = (ic) bVar10.a(new h.g.b.m(ic.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("VoiceAssetsNativeManager");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new VoiceAssetsNativeManager(icVar, eVarD5, null, 4, null);
                    case 8:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i23 = kb.f40359a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar11);
                        int i24 = h.g.b.ar.f48106a;
                        kc kcVar = (kc) bVar11.a(new h.g.b.m(kc.class), null, null);
                        iw iwVar = (iw) bVar11.a(new h.g.b.m(iw.class), null, null);
                        com.waze.sound.f.j jVar = (com.waze.sound.f.j) bVar11.a(new h.g.b.m(com.waze.sound.f.j.class), null, null);
                        em emVar = (em) bVar11.a(new h.g.b.m(em.class), null, null);
                        kotlinx.coroutines.ab abVarB3 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.b bVar12 = (com.waze.shared_infra.i.b) bVar11.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("VoiceFilesProviderImpl");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new jl(contextH, kcVar, eVarD6, iwVar, jVar, emVar, bVar12, abVarB3);
                    case 9:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i25 = kb.f40359a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = h.g.b.ar.f48106a;
                        hz hzVar = (hz) bVar13.a(new h.g.b.m(hz.class), null, null);
                        VoicesNativeManager voicesNativeManager = (VoicesNativeManager) bVar13.a(new h.g.b.m(VoicesNativeManager.class), null, null);
                        iv ivVar2 = (iv) bVar13.a(new h.g.b.m(iv.class), null, null);
                        com.waze.sound.a.d dVar = (com.waze.sound.a.d) bVar13.a(new h.g.b.m(com.waze.sound.a.d.class), null, null);
                        com.waze.sound.a.e eVar32 = (com.waze.sound.a.e) bVar13.a(new h.g.b.m(com.waze.sound.a.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("VoiceRepository");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sound.a.g(hzVar, voicesNativeManager, ivVar2, dVar, eVar32, eVarD7);
                    case 10:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i27 = kb.f40359a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i28 = h.g.b.ar.f48106a;
                        return new com.waze.sound.a.d((em) bVar14.a(new h.g.b.m(em.class), null, null));
                    case 11:
                        int i29 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sound.a.e();
                    case 12:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i30 = kb.f40359a;
                        h.g.b.x.f(bVar15, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        String path = k.a.k.h(bVar15).getCacheDir().getPath();
                        h.g.b.x.e(path, "getPath(...)");
                        com.waze.shared_infra.coordinators.c cVar5 = new com.waze.shared_infra.coordinators.c(new com.waze.shared_infra.b.b(path, "voiceAssetCacheFile"));
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("VoiceAssetProtoCache");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new hz(eVarD8, cVar5);
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i31 = kb.f40359a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i32 = h.g.b.ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar16.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar3 = e.a.h.f47759a;
                        h.g.b.x.e(hVar3, "DEFAULT");
                        return new com.waze.ce.ab(iVarB, hVar3);
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i33 = kb.f40359a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i34 = h.g.b.ar.f48106a;
                        return new ju((com.waze.ce.ab) bVar17.a(new h.g.b.m(com.waze.ce.ab.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i35 = kb.f40359a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new iw((em) bVar18.a(new h.g.b.m(em.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i37 = kb.f40359a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i38 = h.g.b.ar.f48106a;
                        cx cxVar = (cx) bVar19.a(new h.g.b.m(cx.class), null, null);
                        ik ikVar2 = (ik) bVar19.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar6 = (com.waze.sound.a.c) bVar19.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        bs bsVar = (bs) bVar19.a(new h.g.b.m(bs.class), null, null);
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar19.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        com.waze.navigate.dg dgVar = (com.waze.navigate.dg) bVar19.a(new h.g.b.m(com.waze.navigate.dg.class), null, null);
                        com.waze.navigate.gx gxVar = (com.waze.navigate.gx) bVar19.a(new h.g.b.m(com.waze.navigate.gx.class), null, null);
                        com.waze.shared_infra.i.b bVar20 = (com.waze.shared_infra.i.b) bVar19.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        ca caVar = (ca) bVar19.a(new h.g.b.m(ca.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("RouteInstructionVoicesRepository");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new dd(cxVar, eVarD9, gxVar, ikVar2, cVar6, bsVar, dgVar, driveToNativeManager, bVar20, caVar, kotlinx.coroutines.av.b());
                    case 17:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i39 = kb.f40359a;
                        h.g.b.x.f(bVar21, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar7 = (com.waze.sound.a.c) bVar21.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        iv ivVar3 = (iv) bVar21.a(new h.g.b.m(iv.class), null, null);
                        ik ikVar3 = (ik) bVar21.a(new h.g.b.m(ik.class), null, null);
                        dx dxVar2 = (dx) bVar21.a(new h.g.b.m(dx.class), null, null);
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("RouteInstructionsVoiceAssetsRepository");
                        h.g.b.x.e(eVarD10, "create(...)");
                        int i41 = kotlinx.coroutines.av.f51370a;
                        return new eb(eVarD10, cVar7, ivVar3, ikVar3, dxVar2, kotlinx.coroutines.e.ac.f51860a, kotlinx.coroutines.av.b());
                    case 18:
                        int i42 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new dx();
                    case 19:
                        int i43 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cy();
                    default:
                        int i44 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cc();
                }
            }
        };
        org.a.d.g.a aVarJ = dxVar.j();
        org.a.d.e.a aVar8 = new org.a.d.e.a(new org.a.d.c.a(dxVar.k(), new h.g.b.m(com.waze.settings.ae.class), null, pVar16, cVar2, h.a.i.h()));
        aVarJ.f(aVar8);
        new org.a.d.c.d(aVarJ, aVar8);
        aVar.c().add(cVar3);
        final int i20 = 2;
        h.g.a.p pVar17 = new h.g.a.p() { // from class: com.waze.sound.jz
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i20) {
                    case 0:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i72 = kb.f40359a;
                        h.g.b.x.f(bVar22, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar22 = (com.waze.sound.a.c) bVar22.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar = (com.waze.sound.a.h) bVar22.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        com.waze.copilot.a.u uVar = (com.waze.copilot.a.u) bVar22.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        kotlinx.coroutines.ab abVarB = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("CustomVoicesFallbackVoicePickerViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.settings.ae(cVar22, hVar, uVar, eVarD, abVarB);
                    case 1:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = kb.f40359a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        ik ikVar = (ik) bVar3.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar32 = (com.waze.sound.a.c) bVar3.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        fm fmVar = (fm) bVar3.a(new h.g.b.m(fm.class), null, null);
                        iv ivVar = (iv) bVar3.a(new h.g.b.m(iv.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("VoiceAssetsUseCase");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new ie(ikVar, cVar32, ivVar, fmVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = kb.f40359a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        com.waze.sharedui.f.k kVar = (com.waze.sharedui.f.k) bVar4.a(new h.g.b.m(com.waze.sharedui.f.k.class), null, null);
                        com.waze.shared_infra.i.b bVar5 = (com.waze.shared_infra.i.b) bVar4.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("VoiceListDataSource");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new jq(eVarD3, kVar, bVar5);
                    case 3:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i132 = kb.f40359a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new com.waze.sound.f.k((com.waze.stats.ax) bVar6.a(new h.g.b.m(com.waze.stats.ax.class), null, null));
                    case 4:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i152 = kb.f40359a;
                        h.g.b.x.f(bVar7, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar4 = (com.waze.sound.a.c) bVar7.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar2 = (com.waze.sound.a.h) bVar7.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        bj bjVar = (bj) bVar7.a(new h.g.b.m(bj.class), null, null);
                        com.waze.copilot.a.u uVar2 = (com.waze.copilot.a.u) bVar7.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        bg bgVar = (bg) bVar7.a(new h.g.b.m(bg.class), null, null);
                        hx hxVar = (hx) bVar7.a(new h.g.b.m(hx.class), null, null);
                        com.waze.mywaze.ah ahVar = (com.waze.mywaze.ah) bVar7.a(new h.g.b.m(com.waze.mywaze.ah.class), null, null);
                        com.waze.settings.eb ebVar = (com.waze.settings.eb) bVar7.a(new h.g.b.m(com.waze.settings.eb.class), null, null);
                        com.waze.search.c.m mVar = (com.waze.search.c.m) bVar7.a(new h.g.b.m(com.waze.search.c.m.class), null, null);
                        kotlinx.coroutines.ab abVarB2 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("VoiceSettingsViewModel");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.settings.i.a.q(cVar4, hVar2, bjVar, uVar2, bgVar, hxVar, ahVar, ebVar, mVar, eVarD4, abVarB2);
                    case 5:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i172 = kb.f40359a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i182 = h.g.b.ar.f48106a;
                        return new com.waze.sound.e.k((bs) bVar8.a(new h.g.b.m(bs.class), null, null), (com.waze.settings.eb) bVar8.a(new h.g.b.m(com.waze.settings.eb.class), null, null), (com.waze.sound.a.c) bVar8.a(new h.g.b.m(com.waze.sound.a.c.class), null, null), (bj) bVar8.a(new h.g.b.m(bj.class), null, null));
                    case 6:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i192 = kb.f40359a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i202 = h.g.b.ar.f48106a;
                        return new com.waze.sound.b.a((TtsNativeManager) bVar9.a(new h.g.b.m(TtsNativeManager.class), null, null));
                    case 7:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = kb.f40359a;
                        h.g.b.x.f(bVar10, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        ic icVar = (ic) bVar10.a(new h.g.b.m(ic.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("VoiceAssetsNativeManager");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new VoiceAssetsNativeManager(icVar, eVarD5, null, 4, null);
                    case 8:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i23 = kb.f40359a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar11);
                        int i24 = h.g.b.ar.f48106a;
                        kc kcVar = (kc) bVar11.a(new h.g.b.m(kc.class), null, null);
                        iw iwVar = (iw) bVar11.a(new h.g.b.m(iw.class), null, null);
                        com.waze.sound.f.j jVar = (com.waze.sound.f.j) bVar11.a(new h.g.b.m(com.waze.sound.f.j.class), null, null);
                        em emVar = (em) bVar11.a(new h.g.b.m(em.class), null, null);
                        kotlinx.coroutines.ab abVarB3 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.b bVar12 = (com.waze.shared_infra.i.b) bVar11.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("VoiceFilesProviderImpl");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new jl(contextH, kcVar, eVarD6, iwVar, jVar, emVar, bVar12, abVarB3);
                    case 9:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i25 = kb.f40359a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = h.g.b.ar.f48106a;
                        hz hzVar = (hz) bVar13.a(new h.g.b.m(hz.class), null, null);
                        VoicesNativeManager voicesNativeManager = (VoicesNativeManager) bVar13.a(new h.g.b.m(VoicesNativeManager.class), null, null);
                        iv ivVar2 = (iv) bVar13.a(new h.g.b.m(iv.class), null, null);
                        com.waze.sound.a.d dVar = (com.waze.sound.a.d) bVar13.a(new h.g.b.m(com.waze.sound.a.d.class), null, null);
                        com.waze.sound.a.e eVar32 = (com.waze.sound.a.e) bVar13.a(new h.g.b.m(com.waze.sound.a.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("VoiceRepository");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sound.a.g(hzVar, voicesNativeManager, ivVar2, dVar, eVar32, eVarD7);
                    case 10:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i27 = kb.f40359a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i28 = h.g.b.ar.f48106a;
                        return new com.waze.sound.a.d((em) bVar14.a(new h.g.b.m(em.class), null, null));
                    case 11:
                        int i29 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sound.a.e();
                    case 12:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i30 = kb.f40359a;
                        h.g.b.x.f(bVar15, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        String path = k.a.k.h(bVar15).getCacheDir().getPath();
                        h.g.b.x.e(path, "getPath(...)");
                        com.waze.shared_infra.coordinators.c cVar5 = new com.waze.shared_infra.coordinators.c(new com.waze.shared_infra.b.b(path, "voiceAssetCacheFile"));
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("VoiceAssetProtoCache");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new hz(eVarD8, cVar5);
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i31 = kb.f40359a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i32 = h.g.b.ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar16.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar3 = e.a.h.f47759a;
                        h.g.b.x.e(hVar3, "DEFAULT");
                        return new com.waze.ce.ab(iVarB, hVar3);
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i33 = kb.f40359a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i34 = h.g.b.ar.f48106a;
                        return new ju((com.waze.ce.ab) bVar17.a(new h.g.b.m(com.waze.ce.ab.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i35 = kb.f40359a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new iw((em) bVar18.a(new h.g.b.m(em.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i37 = kb.f40359a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i38 = h.g.b.ar.f48106a;
                        cx cxVar = (cx) bVar19.a(new h.g.b.m(cx.class), null, null);
                        ik ikVar2 = (ik) bVar19.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar6 = (com.waze.sound.a.c) bVar19.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        bs bsVar = (bs) bVar19.a(new h.g.b.m(bs.class), null, null);
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar19.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        com.waze.navigate.dg dgVar = (com.waze.navigate.dg) bVar19.a(new h.g.b.m(com.waze.navigate.dg.class), null, null);
                        com.waze.navigate.gx gxVar = (com.waze.navigate.gx) bVar19.a(new h.g.b.m(com.waze.navigate.gx.class), null, null);
                        com.waze.shared_infra.i.b bVar20 = (com.waze.shared_infra.i.b) bVar19.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        ca caVar = (ca) bVar19.a(new h.g.b.m(ca.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("RouteInstructionVoicesRepository");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new dd(cxVar, eVarD9, gxVar, ikVar2, cVar6, bsVar, dgVar, driveToNativeManager, bVar20, caVar, kotlinx.coroutines.av.b());
                    case 17:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i39 = kb.f40359a;
                        h.g.b.x.f(bVar21, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar7 = (com.waze.sound.a.c) bVar21.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        iv ivVar3 = (iv) bVar21.a(new h.g.b.m(iv.class), null, null);
                        ik ikVar3 = (ik) bVar21.a(new h.g.b.m(ik.class), null, null);
                        dx dxVar2 = (dx) bVar21.a(new h.g.b.m(dx.class), null, null);
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("RouteInstructionsVoiceAssetsRepository");
                        h.g.b.x.e(eVarD10, "create(...)");
                        int i41 = kotlinx.coroutines.av.f51370a;
                        return new eb(eVarD10, cVar7, ivVar3, ikVar3, dxVar2, kotlinx.coroutines.e.ac.f51860a, kotlinx.coroutines.av.b());
                    case 18:
                        int i42 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new dx();
                    case 19:
                        int i43 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cy();
                    default:
                        int i44 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cc();
                }
            }
        };
        org.a.d.e.e eVar26 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(jq.class), null, pVar17, cVar, h.a.i.h()));
        aVar.f(eVar26);
        new org.a.d.c.d(aVar, eVar26);
        final int i21 = 3;
        h.g.a.p pVar18 = new h.g.a.p() { // from class: com.waze.sound.jz
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i72 = kb.f40359a;
                        h.g.b.x.f(bVar22, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar22 = (com.waze.sound.a.c) bVar22.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar = (com.waze.sound.a.h) bVar22.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        com.waze.copilot.a.u uVar = (com.waze.copilot.a.u) bVar22.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        kotlinx.coroutines.ab abVarB = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("CustomVoicesFallbackVoicePickerViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.settings.ae(cVar22, hVar, uVar, eVarD, abVarB);
                    case 1:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = kb.f40359a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        ik ikVar = (ik) bVar3.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar32 = (com.waze.sound.a.c) bVar3.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        fm fmVar = (fm) bVar3.a(new h.g.b.m(fm.class), null, null);
                        iv ivVar = (iv) bVar3.a(new h.g.b.m(iv.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("VoiceAssetsUseCase");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new ie(ikVar, cVar32, ivVar, fmVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = kb.f40359a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        com.waze.sharedui.f.k kVar = (com.waze.sharedui.f.k) bVar4.a(new h.g.b.m(com.waze.sharedui.f.k.class), null, null);
                        com.waze.shared_infra.i.b bVar5 = (com.waze.shared_infra.i.b) bVar4.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("VoiceListDataSource");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new jq(eVarD3, kVar, bVar5);
                    case 3:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i132 = kb.f40359a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new com.waze.sound.f.k((com.waze.stats.ax) bVar6.a(new h.g.b.m(com.waze.stats.ax.class), null, null));
                    case 4:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i152 = kb.f40359a;
                        h.g.b.x.f(bVar7, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar4 = (com.waze.sound.a.c) bVar7.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar2 = (com.waze.sound.a.h) bVar7.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        bj bjVar = (bj) bVar7.a(new h.g.b.m(bj.class), null, null);
                        com.waze.copilot.a.u uVar2 = (com.waze.copilot.a.u) bVar7.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        bg bgVar = (bg) bVar7.a(new h.g.b.m(bg.class), null, null);
                        hx hxVar = (hx) bVar7.a(new h.g.b.m(hx.class), null, null);
                        com.waze.mywaze.ah ahVar = (com.waze.mywaze.ah) bVar7.a(new h.g.b.m(com.waze.mywaze.ah.class), null, null);
                        com.waze.settings.eb ebVar = (com.waze.settings.eb) bVar7.a(new h.g.b.m(com.waze.settings.eb.class), null, null);
                        com.waze.search.c.m mVar = (com.waze.search.c.m) bVar7.a(new h.g.b.m(com.waze.search.c.m.class), null, null);
                        kotlinx.coroutines.ab abVarB2 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("VoiceSettingsViewModel");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.settings.i.a.q(cVar4, hVar2, bjVar, uVar2, bgVar, hxVar, ahVar, ebVar, mVar, eVarD4, abVarB2);
                    case 5:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i172 = kb.f40359a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i182 = h.g.b.ar.f48106a;
                        return new com.waze.sound.e.k((bs) bVar8.a(new h.g.b.m(bs.class), null, null), (com.waze.settings.eb) bVar8.a(new h.g.b.m(com.waze.settings.eb.class), null, null), (com.waze.sound.a.c) bVar8.a(new h.g.b.m(com.waze.sound.a.c.class), null, null), (bj) bVar8.a(new h.g.b.m(bj.class), null, null));
                    case 6:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i192 = kb.f40359a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i202 = h.g.b.ar.f48106a;
                        return new com.waze.sound.b.a((TtsNativeManager) bVar9.a(new h.g.b.m(TtsNativeManager.class), null, null));
                    case 7:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i212 = kb.f40359a;
                        h.g.b.x.f(bVar10, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        ic icVar = (ic) bVar10.a(new h.g.b.m(ic.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("VoiceAssetsNativeManager");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new VoiceAssetsNativeManager(icVar, eVarD5, null, 4, null);
                    case 8:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i23 = kb.f40359a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar11);
                        int i24 = h.g.b.ar.f48106a;
                        kc kcVar = (kc) bVar11.a(new h.g.b.m(kc.class), null, null);
                        iw iwVar = (iw) bVar11.a(new h.g.b.m(iw.class), null, null);
                        com.waze.sound.f.j jVar = (com.waze.sound.f.j) bVar11.a(new h.g.b.m(com.waze.sound.f.j.class), null, null);
                        em emVar = (em) bVar11.a(new h.g.b.m(em.class), null, null);
                        kotlinx.coroutines.ab abVarB3 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.b bVar12 = (com.waze.shared_infra.i.b) bVar11.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("VoiceFilesProviderImpl");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new jl(contextH, kcVar, eVarD6, iwVar, jVar, emVar, bVar12, abVarB3);
                    case 9:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i25 = kb.f40359a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = h.g.b.ar.f48106a;
                        hz hzVar = (hz) bVar13.a(new h.g.b.m(hz.class), null, null);
                        VoicesNativeManager voicesNativeManager = (VoicesNativeManager) bVar13.a(new h.g.b.m(VoicesNativeManager.class), null, null);
                        iv ivVar2 = (iv) bVar13.a(new h.g.b.m(iv.class), null, null);
                        com.waze.sound.a.d dVar = (com.waze.sound.a.d) bVar13.a(new h.g.b.m(com.waze.sound.a.d.class), null, null);
                        com.waze.sound.a.e eVar32 = (com.waze.sound.a.e) bVar13.a(new h.g.b.m(com.waze.sound.a.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("VoiceRepository");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sound.a.g(hzVar, voicesNativeManager, ivVar2, dVar, eVar32, eVarD7);
                    case 10:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i27 = kb.f40359a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i28 = h.g.b.ar.f48106a;
                        return new com.waze.sound.a.d((em) bVar14.a(new h.g.b.m(em.class), null, null));
                    case 11:
                        int i29 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sound.a.e();
                    case 12:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i30 = kb.f40359a;
                        h.g.b.x.f(bVar15, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        String path = k.a.k.h(bVar15).getCacheDir().getPath();
                        h.g.b.x.e(path, "getPath(...)");
                        com.waze.shared_infra.coordinators.c cVar5 = new com.waze.shared_infra.coordinators.c(new com.waze.shared_infra.b.b(path, "voiceAssetCacheFile"));
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("VoiceAssetProtoCache");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new hz(eVarD8, cVar5);
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i31 = kb.f40359a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i32 = h.g.b.ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar16.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar3 = e.a.h.f47759a;
                        h.g.b.x.e(hVar3, "DEFAULT");
                        return new com.waze.ce.ab(iVarB, hVar3);
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i33 = kb.f40359a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i34 = h.g.b.ar.f48106a;
                        return new ju((com.waze.ce.ab) bVar17.a(new h.g.b.m(com.waze.ce.ab.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i35 = kb.f40359a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new iw((em) bVar18.a(new h.g.b.m(em.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i37 = kb.f40359a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i38 = h.g.b.ar.f48106a;
                        cx cxVar = (cx) bVar19.a(new h.g.b.m(cx.class), null, null);
                        ik ikVar2 = (ik) bVar19.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar6 = (com.waze.sound.a.c) bVar19.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        bs bsVar = (bs) bVar19.a(new h.g.b.m(bs.class), null, null);
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar19.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        com.waze.navigate.dg dgVar = (com.waze.navigate.dg) bVar19.a(new h.g.b.m(com.waze.navigate.dg.class), null, null);
                        com.waze.navigate.gx gxVar = (com.waze.navigate.gx) bVar19.a(new h.g.b.m(com.waze.navigate.gx.class), null, null);
                        com.waze.shared_infra.i.b bVar20 = (com.waze.shared_infra.i.b) bVar19.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        ca caVar = (ca) bVar19.a(new h.g.b.m(ca.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("RouteInstructionVoicesRepository");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new dd(cxVar, eVarD9, gxVar, ikVar2, cVar6, bsVar, dgVar, driveToNativeManager, bVar20, caVar, kotlinx.coroutines.av.b());
                    case 17:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i39 = kb.f40359a;
                        h.g.b.x.f(bVar21, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar7 = (com.waze.sound.a.c) bVar21.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        iv ivVar3 = (iv) bVar21.a(new h.g.b.m(iv.class), null, null);
                        ik ikVar3 = (ik) bVar21.a(new h.g.b.m(ik.class), null, null);
                        dx dxVar2 = (dx) bVar21.a(new h.g.b.m(dx.class), null, null);
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("RouteInstructionsVoiceAssetsRepository");
                        h.g.b.x.e(eVarD10, "create(...)");
                        int i41 = kotlinx.coroutines.av.f51370a;
                        return new eb(eVarD10, cVar7, ivVar3, ikVar3, dxVar2, kotlinx.coroutines.e.ac.f51860a, kotlinx.coroutines.av.b());
                    case 18:
                        int i42 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new dx();
                    case 19:
                        int i43 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cy();
                    default:
                        int i44 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cc();
                }
            }
        };
        org.a.d.e.a aVar9 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.sound.f.j.class), null, pVar18, cVar2, h.a.i.h()));
        aVar.f(aVar9);
        new org.a.d.c.d(aVar, aVar9);
        org.a.d.i.c cVar4 = new org.a.d.i.c(new h.g.b.m(com.waze.settings.i.a.m.class));
        e.a.dx dxVar2 = new e.a.dx(cVar4, aVar);
        final int i22 = 4;
        h.g.a.p pVar19 = new h.g.a.p() { // from class: com.waze.sound.jz
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i22) {
                    case 0:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i72 = kb.f40359a;
                        h.g.b.x.f(bVar22, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar22 = (com.waze.sound.a.c) bVar22.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar = (com.waze.sound.a.h) bVar22.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        com.waze.copilot.a.u uVar = (com.waze.copilot.a.u) bVar22.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        kotlinx.coroutines.ab abVarB = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("CustomVoicesFallbackVoicePickerViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.settings.ae(cVar22, hVar, uVar, eVarD, abVarB);
                    case 1:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = kb.f40359a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        ik ikVar = (ik) bVar3.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar32 = (com.waze.sound.a.c) bVar3.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        fm fmVar = (fm) bVar3.a(new h.g.b.m(fm.class), null, null);
                        iv ivVar = (iv) bVar3.a(new h.g.b.m(iv.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("VoiceAssetsUseCase");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new ie(ikVar, cVar32, ivVar, fmVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = kb.f40359a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        com.waze.sharedui.f.k kVar = (com.waze.sharedui.f.k) bVar4.a(new h.g.b.m(com.waze.sharedui.f.k.class), null, null);
                        com.waze.shared_infra.i.b bVar5 = (com.waze.shared_infra.i.b) bVar4.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("VoiceListDataSource");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new jq(eVarD3, kVar, bVar5);
                    case 3:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i132 = kb.f40359a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new com.waze.sound.f.k((com.waze.stats.ax) bVar6.a(new h.g.b.m(com.waze.stats.ax.class), null, null));
                    case 4:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i152 = kb.f40359a;
                        h.g.b.x.f(bVar7, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar42 = (com.waze.sound.a.c) bVar7.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar2 = (com.waze.sound.a.h) bVar7.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        bj bjVar = (bj) bVar7.a(new h.g.b.m(bj.class), null, null);
                        com.waze.copilot.a.u uVar2 = (com.waze.copilot.a.u) bVar7.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        bg bgVar = (bg) bVar7.a(new h.g.b.m(bg.class), null, null);
                        hx hxVar = (hx) bVar7.a(new h.g.b.m(hx.class), null, null);
                        com.waze.mywaze.ah ahVar = (com.waze.mywaze.ah) bVar7.a(new h.g.b.m(com.waze.mywaze.ah.class), null, null);
                        com.waze.settings.eb ebVar = (com.waze.settings.eb) bVar7.a(new h.g.b.m(com.waze.settings.eb.class), null, null);
                        com.waze.search.c.m mVar = (com.waze.search.c.m) bVar7.a(new h.g.b.m(com.waze.search.c.m.class), null, null);
                        kotlinx.coroutines.ab abVarB2 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("VoiceSettingsViewModel");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.settings.i.a.q(cVar42, hVar2, bjVar, uVar2, bgVar, hxVar, ahVar, ebVar, mVar, eVarD4, abVarB2);
                    case 5:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i172 = kb.f40359a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i182 = h.g.b.ar.f48106a;
                        return new com.waze.sound.e.k((bs) bVar8.a(new h.g.b.m(bs.class), null, null), (com.waze.settings.eb) bVar8.a(new h.g.b.m(com.waze.settings.eb.class), null, null), (com.waze.sound.a.c) bVar8.a(new h.g.b.m(com.waze.sound.a.c.class), null, null), (bj) bVar8.a(new h.g.b.m(bj.class), null, null));
                    case 6:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i192 = kb.f40359a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i202 = h.g.b.ar.f48106a;
                        return new com.waze.sound.b.a((TtsNativeManager) bVar9.a(new h.g.b.m(TtsNativeManager.class), null, null));
                    case 7:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i212 = kb.f40359a;
                        h.g.b.x.f(bVar10, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i222 = h.g.b.ar.f48106a;
                        ic icVar = (ic) bVar10.a(new h.g.b.m(ic.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("VoiceAssetsNativeManager");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new VoiceAssetsNativeManager(icVar, eVarD5, null, 4, null);
                    case 8:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i23 = kb.f40359a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar11);
                        int i24 = h.g.b.ar.f48106a;
                        kc kcVar = (kc) bVar11.a(new h.g.b.m(kc.class), null, null);
                        iw iwVar = (iw) bVar11.a(new h.g.b.m(iw.class), null, null);
                        com.waze.sound.f.j jVar = (com.waze.sound.f.j) bVar11.a(new h.g.b.m(com.waze.sound.f.j.class), null, null);
                        em emVar = (em) bVar11.a(new h.g.b.m(em.class), null, null);
                        kotlinx.coroutines.ab abVarB3 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.b bVar12 = (com.waze.shared_infra.i.b) bVar11.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("VoiceFilesProviderImpl");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new jl(contextH, kcVar, eVarD6, iwVar, jVar, emVar, bVar12, abVarB3);
                    case 9:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i25 = kb.f40359a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = h.g.b.ar.f48106a;
                        hz hzVar = (hz) bVar13.a(new h.g.b.m(hz.class), null, null);
                        VoicesNativeManager voicesNativeManager = (VoicesNativeManager) bVar13.a(new h.g.b.m(VoicesNativeManager.class), null, null);
                        iv ivVar2 = (iv) bVar13.a(new h.g.b.m(iv.class), null, null);
                        com.waze.sound.a.d dVar = (com.waze.sound.a.d) bVar13.a(new h.g.b.m(com.waze.sound.a.d.class), null, null);
                        com.waze.sound.a.e eVar32 = (com.waze.sound.a.e) bVar13.a(new h.g.b.m(com.waze.sound.a.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("VoiceRepository");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sound.a.g(hzVar, voicesNativeManager, ivVar2, dVar, eVar32, eVarD7);
                    case 10:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i27 = kb.f40359a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i28 = h.g.b.ar.f48106a;
                        return new com.waze.sound.a.d((em) bVar14.a(new h.g.b.m(em.class), null, null));
                    case 11:
                        int i29 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sound.a.e();
                    case 12:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i30 = kb.f40359a;
                        h.g.b.x.f(bVar15, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        String path = k.a.k.h(bVar15).getCacheDir().getPath();
                        h.g.b.x.e(path, "getPath(...)");
                        com.waze.shared_infra.coordinators.c cVar5 = new com.waze.shared_infra.coordinators.c(new com.waze.shared_infra.b.b(path, "voiceAssetCacheFile"));
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("VoiceAssetProtoCache");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new hz(eVarD8, cVar5);
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i31 = kb.f40359a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i32 = h.g.b.ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar16.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar3 = e.a.h.f47759a;
                        h.g.b.x.e(hVar3, "DEFAULT");
                        return new com.waze.ce.ab(iVarB, hVar3);
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i33 = kb.f40359a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i34 = h.g.b.ar.f48106a;
                        return new ju((com.waze.ce.ab) bVar17.a(new h.g.b.m(com.waze.ce.ab.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i35 = kb.f40359a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new iw((em) bVar18.a(new h.g.b.m(em.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i37 = kb.f40359a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i38 = h.g.b.ar.f48106a;
                        cx cxVar = (cx) bVar19.a(new h.g.b.m(cx.class), null, null);
                        ik ikVar2 = (ik) bVar19.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar6 = (com.waze.sound.a.c) bVar19.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        bs bsVar = (bs) bVar19.a(new h.g.b.m(bs.class), null, null);
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar19.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        com.waze.navigate.dg dgVar = (com.waze.navigate.dg) bVar19.a(new h.g.b.m(com.waze.navigate.dg.class), null, null);
                        com.waze.navigate.gx gxVar = (com.waze.navigate.gx) bVar19.a(new h.g.b.m(com.waze.navigate.gx.class), null, null);
                        com.waze.shared_infra.i.b bVar20 = (com.waze.shared_infra.i.b) bVar19.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        ca caVar = (ca) bVar19.a(new h.g.b.m(ca.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("RouteInstructionVoicesRepository");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new dd(cxVar, eVarD9, gxVar, ikVar2, cVar6, bsVar, dgVar, driveToNativeManager, bVar20, caVar, kotlinx.coroutines.av.b());
                    case 17:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i39 = kb.f40359a;
                        h.g.b.x.f(bVar21, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar7 = (com.waze.sound.a.c) bVar21.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        iv ivVar3 = (iv) bVar21.a(new h.g.b.m(iv.class), null, null);
                        ik ikVar3 = (ik) bVar21.a(new h.g.b.m(ik.class), null, null);
                        dx dxVar22 = (dx) bVar21.a(new h.g.b.m(dx.class), null, null);
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("RouteInstructionsVoiceAssetsRepository");
                        h.g.b.x.e(eVarD10, "create(...)");
                        int i41 = kotlinx.coroutines.av.f51370a;
                        return new eb(eVarD10, cVar7, ivVar3, ikVar3, dxVar22, kotlinx.coroutines.e.ac.f51860a, kotlinx.coroutines.av.b());
                    case 18:
                        int i42 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new dx();
                    case 19:
                        int i43 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cy();
                    default:
                        int i44 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cc();
                }
            }
        };
        org.a.d.g.a aVarJ2 = dxVar2.j();
        org.a.d.e.a aVar10 = new org.a.d.e.a(new org.a.d.c.a(dxVar2.k(), new h.g.b.m(com.waze.settings.i.a.q.class), null, pVar19, cVar2, h.a.i.h()));
        aVarJ2.f(aVar10);
        new org.a.d.c.d(aVarJ2, aVar10);
        aVar.c().add(cVar4);
        final int i23 = 5;
        h.g.a.p pVar20 = new h.g.a.p() { // from class: com.waze.sound.jz
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i23) {
                    case 0:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i72 = kb.f40359a;
                        h.g.b.x.f(bVar22, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar22 = (com.waze.sound.a.c) bVar22.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar = (com.waze.sound.a.h) bVar22.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        com.waze.copilot.a.u uVar = (com.waze.copilot.a.u) bVar22.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        kotlinx.coroutines.ab abVarB = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("CustomVoicesFallbackVoicePickerViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.settings.ae(cVar22, hVar, uVar, eVarD, abVarB);
                    case 1:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = kb.f40359a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        ik ikVar = (ik) bVar3.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar32 = (com.waze.sound.a.c) bVar3.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        fm fmVar = (fm) bVar3.a(new h.g.b.m(fm.class), null, null);
                        iv ivVar = (iv) bVar3.a(new h.g.b.m(iv.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("VoiceAssetsUseCase");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new ie(ikVar, cVar32, ivVar, fmVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = kb.f40359a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        com.waze.sharedui.f.k kVar = (com.waze.sharedui.f.k) bVar4.a(new h.g.b.m(com.waze.sharedui.f.k.class), null, null);
                        com.waze.shared_infra.i.b bVar5 = (com.waze.shared_infra.i.b) bVar4.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("VoiceListDataSource");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new jq(eVarD3, kVar, bVar5);
                    case 3:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i132 = kb.f40359a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new com.waze.sound.f.k((com.waze.stats.ax) bVar6.a(new h.g.b.m(com.waze.stats.ax.class), null, null));
                    case 4:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i152 = kb.f40359a;
                        h.g.b.x.f(bVar7, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar42 = (com.waze.sound.a.c) bVar7.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar2 = (com.waze.sound.a.h) bVar7.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        bj bjVar = (bj) bVar7.a(new h.g.b.m(bj.class), null, null);
                        com.waze.copilot.a.u uVar2 = (com.waze.copilot.a.u) bVar7.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        bg bgVar = (bg) bVar7.a(new h.g.b.m(bg.class), null, null);
                        hx hxVar = (hx) bVar7.a(new h.g.b.m(hx.class), null, null);
                        com.waze.mywaze.ah ahVar = (com.waze.mywaze.ah) bVar7.a(new h.g.b.m(com.waze.mywaze.ah.class), null, null);
                        com.waze.settings.eb ebVar = (com.waze.settings.eb) bVar7.a(new h.g.b.m(com.waze.settings.eb.class), null, null);
                        com.waze.search.c.m mVar = (com.waze.search.c.m) bVar7.a(new h.g.b.m(com.waze.search.c.m.class), null, null);
                        kotlinx.coroutines.ab abVarB2 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("VoiceSettingsViewModel");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.settings.i.a.q(cVar42, hVar2, bjVar, uVar2, bgVar, hxVar, ahVar, ebVar, mVar, eVarD4, abVarB2);
                    case 5:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i172 = kb.f40359a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i182 = h.g.b.ar.f48106a;
                        return new com.waze.sound.e.k((bs) bVar8.a(new h.g.b.m(bs.class), null, null), (com.waze.settings.eb) bVar8.a(new h.g.b.m(com.waze.settings.eb.class), null, null), (com.waze.sound.a.c) bVar8.a(new h.g.b.m(com.waze.sound.a.c.class), null, null), (bj) bVar8.a(new h.g.b.m(bj.class), null, null));
                    case 6:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i192 = kb.f40359a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i202 = h.g.b.ar.f48106a;
                        return new com.waze.sound.b.a((TtsNativeManager) bVar9.a(new h.g.b.m(TtsNativeManager.class), null, null));
                    case 7:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i212 = kb.f40359a;
                        h.g.b.x.f(bVar10, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i222 = h.g.b.ar.f48106a;
                        ic icVar = (ic) bVar10.a(new h.g.b.m(ic.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("VoiceAssetsNativeManager");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new VoiceAssetsNativeManager(icVar, eVarD5, null, 4, null);
                    case 8:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i232 = kb.f40359a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar11);
                        int i24 = h.g.b.ar.f48106a;
                        kc kcVar = (kc) bVar11.a(new h.g.b.m(kc.class), null, null);
                        iw iwVar = (iw) bVar11.a(new h.g.b.m(iw.class), null, null);
                        com.waze.sound.f.j jVar = (com.waze.sound.f.j) bVar11.a(new h.g.b.m(com.waze.sound.f.j.class), null, null);
                        em emVar = (em) bVar11.a(new h.g.b.m(em.class), null, null);
                        kotlinx.coroutines.ab abVarB3 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.b bVar12 = (com.waze.shared_infra.i.b) bVar11.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("VoiceFilesProviderImpl");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new jl(contextH, kcVar, eVarD6, iwVar, jVar, emVar, bVar12, abVarB3);
                    case 9:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i25 = kb.f40359a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = h.g.b.ar.f48106a;
                        hz hzVar = (hz) bVar13.a(new h.g.b.m(hz.class), null, null);
                        VoicesNativeManager voicesNativeManager = (VoicesNativeManager) bVar13.a(new h.g.b.m(VoicesNativeManager.class), null, null);
                        iv ivVar2 = (iv) bVar13.a(new h.g.b.m(iv.class), null, null);
                        com.waze.sound.a.d dVar = (com.waze.sound.a.d) bVar13.a(new h.g.b.m(com.waze.sound.a.d.class), null, null);
                        com.waze.sound.a.e eVar32 = (com.waze.sound.a.e) bVar13.a(new h.g.b.m(com.waze.sound.a.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("VoiceRepository");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sound.a.g(hzVar, voicesNativeManager, ivVar2, dVar, eVar32, eVarD7);
                    case 10:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i27 = kb.f40359a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i28 = h.g.b.ar.f48106a;
                        return new com.waze.sound.a.d((em) bVar14.a(new h.g.b.m(em.class), null, null));
                    case 11:
                        int i29 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sound.a.e();
                    case 12:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i30 = kb.f40359a;
                        h.g.b.x.f(bVar15, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        String path = k.a.k.h(bVar15).getCacheDir().getPath();
                        h.g.b.x.e(path, "getPath(...)");
                        com.waze.shared_infra.coordinators.c cVar5 = new com.waze.shared_infra.coordinators.c(new com.waze.shared_infra.b.b(path, "voiceAssetCacheFile"));
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("VoiceAssetProtoCache");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new hz(eVarD8, cVar5);
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i31 = kb.f40359a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i32 = h.g.b.ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar16.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar3 = e.a.h.f47759a;
                        h.g.b.x.e(hVar3, "DEFAULT");
                        return new com.waze.ce.ab(iVarB, hVar3);
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i33 = kb.f40359a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i34 = h.g.b.ar.f48106a;
                        return new ju((com.waze.ce.ab) bVar17.a(new h.g.b.m(com.waze.ce.ab.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i35 = kb.f40359a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new iw((em) bVar18.a(new h.g.b.m(em.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i37 = kb.f40359a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i38 = h.g.b.ar.f48106a;
                        cx cxVar = (cx) bVar19.a(new h.g.b.m(cx.class), null, null);
                        ik ikVar2 = (ik) bVar19.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar6 = (com.waze.sound.a.c) bVar19.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        bs bsVar = (bs) bVar19.a(new h.g.b.m(bs.class), null, null);
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar19.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        com.waze.navigate.dg dgVar = (com.waze.navigate.dg) bVar19.a(new h.g.b.m(com.waze.navigate.dg.class), null, null);
                        com.waze.navigate.gx gxVar = (com.waze.navigate.gx) bVar19.a(new h.g.b.m(com.waze.navigate.gx.class), null, null);
                        com.waze.shared_infra.i.b bVar20 = (com.waze.shared_infra.i.b) bVar19.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        ca caVar = (ca) bVar19.a(new h.g.b.m(ca.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("RouteInstructionVoicesRepository");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new dd(cxVar, eVarD9, gxVar, ikVar2, cVar6, bsVar, dgVar, driveToNativeManager, bVar20, caVar, kotlinx.coroutines.av.b());
                    case 17:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i39 = kb.f40359a;
                        h.g.b.x.f(bVar21, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar7 = (com.waze.sound.a.c) bVar21.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        iv ivVar3 = (iv) bVar21.a(new h.g.b.m(iv.class), null, null);
                        ik ikVar3 = (ik) bVar21.a(new h.g.b.m(ik.class), null, null);
                        dx dxVar22 = (dx) bVar21.a(new h.g.b.m(dx.class), null, null);
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("RouteInstructionsVoiceAssetsRepository");
                        h.g.b.x.e(eVarD10, "create(...)");
                        int i41 = kotlinx.coroutines.av.f51370a;
                        return new eb(eVarD10, cVar7, ivVar3, ikVar3, dxVar22, kotlinx.coroutines.e.ac.f51860a, kotlinx.coroutines.av.b());
                    case 18:
                        int i42 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new dx();
                    case 19:
                        int i43 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cy();
                    default:
                        int i44 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cc();
                }
            }
        };
        org.a.d.e.e eVar27 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.sound.e.k.class), null, pVar20, cVar, h.a.i.h()));
        aVar.f(eVar27);
        new org.a.d.c.d(aVar, eVar27);
        final int i24 = 6;
        h.g.a.p pVar21 = new h.g.a.p() { // from class: com.waze.sound.jz
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i24) {
                    case 0:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i72 = kb.f40359a;
                        h.g.b.x.f(bVar22, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar22 = (com.waze.sound.a.c) bVar22.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar = (com.waze.sound.a.h) bVar22.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        com.waze.copilot.a.u uVar = (com.waze.copilot.a.u) bVar22.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        kotlinx.coroutines.ab abVarB = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("CustomVoicesFallbackVoicePickerViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.settings.ae(cVar22, hVar, uVar, eVarD, abVarB);
                    case 1:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = kb.f40359a;
                        h.g.b.x.f(bVar3, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        ik ikVar = (ik) bVar3.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar32 = (com.waze.sound.a.c) bVar3.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        fm fmVar = (fm) bVar3.a(new h.g.b.m(fm.class), null, null);
                        iv ivVar = (iv) bVar3.a(new h.g.b.m(iv.class), null, null);
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("VoiceAssetsUseCase");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new ie(ikVar, cVar32, ivVar, fmVar, eVarD2);
                    case 2:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = kb.f40359a;
                        h.g.b.x.f(bVar4, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        com.waze.sharedui.f.k kVar = (com.waze.sharedui.f.k) bVar4.a(new h.g.b.m(com.waze.sharedui.f.k.class), null, null);
                        com.waze.shared_infra.i.b bVar5 = (com.waze.shared_infra.i.b) bVar4.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("VoiceListDataSource");
                        h.g.b.x.e(eVarD3, "create(...)");
                        return new jq(eVarD3, kVar, bVar5);
                    case 3:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i132 = kb.f40359a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new com.waze.sound.f.k((com.waze.stats.ax) bVar6.a(new h.g.b.m(com.waze.stats.ax.class), null, null));
                    case 4:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i152 = kb.f40359a;
                        h.g.b.x.f(bVar7, "$this$viewModel");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar42 = (com.waze.sound.a.c) bVar7.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        com.waze.sound.a.h hVar2 = (com.waze.sound.a.h) bVar7.a(new h.g.b.m(com.waze.sound.a.h.class), null, null);
                        bj bjVar = (bj) bVar7.a(new h.g.b.m(bj.class), null, null);
                        com.waze.copilot.a.u uVar2 = (com.waze.copilot.a.u) bVar7.a(new h.g.b.m(com.waze.copilot.a.u.class), null, null);
                        bg bgVar = (bg) bVar7.a(new h.g.b.m(bg.class), null, null);
                        hx hxVar = (hx) bVar7.a(new h.g.b.m(hx.class), null, null);
                        com.waze.mywaze.ah ahVar = (com.waze.mywaze.ah) bVar7.a(new h.g.b.m(com.waze.mywaze.ah.class), null, null);
                        com.waze.settings.eb ebVar = (com.waze.settings.eb) bVar7.a(new h.g.b.m(com.waze.settings.eb.class), null, null);
                        com.waze.search.c.m mVar = (com.waze.search.c.m) bVar7.a(new h.g.b.m(com.waze.search.c.m.class), null, null);
                        kotlinx.coroutines.ab abVarB2 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("VoiceSettingsViewModel");
                        h.g.b.x.e(eVarD4, "create(...)");
                        return new com.waze.settings.i.a.q(cVar42, hVar2, bjVar, uVar2, bgVar, hxVar, ahVar, ebVar, mVar, eVarD4, abVarB2);
                    case 5:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i172 = kb.f40359a;
                        h.g.b.x.f(bVar8, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i182 = h.g.b.ar.f48106a;
                        return new com.waze.sound.e.k((bs) bVar8.a(new h.g.b.m(bs.class), null, null), (com.waze.settings.eb) bVar8.a(new h.g.b.m(com.waze.settings.eb.class), null, null), (com.waze.sound.a.c) bVar8.a(new h.g.b.m(com.waze.sound.a.c.class), null, null), (bj) bVar8.a(new h.g.b.m(bj.class), null, null));
                    case 6:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i192 = kb.f40359a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i202 = h.g.b.ar.f48106a;
                        return new com.waze.sound.b.a((TtsNativeManager) bVar9.a(new h.g.b.m(TtsNativeManager.class), null, null));
                    case 7:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i212 = kb.f40359a;
                        h.g.b.x.f(bVar10, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i222 = h.g.b.ar.f48106a;
                        ic icVar = (ic) bVar10.a(new h.g.b.m(ic.class), null, null);
                        com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("VoiceAssetsNativeManager");
                        h.g.b.x.e(eVarD5, "create(...)");
                        return new VoiceAssetsNativeManager(icVar, eVarD5, null, 4, null);
                    case 8:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i232 = kb.f40359a;
                        h.g.b.x.f(bVar11, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        Context contextH = k.a.k.h(bVar11);
                        int i242 = h.g.b.ar.f48106a;
                        kc kcVar = (kc) bVar11.a(new h.g.b.m(kc.class), null, null);
                        iw iwVar = (iw) bVar11.a(new h.g.b.m(iw.class), null, null);
                        com.waze.sound.f.j jVar = (com.waze.sound.f.j) bVar11.a(new h.g.b.m(com.waze.sound.f.j.class), null, null);
                        em emVar = (em) bVar11.a(new h.g.b.m(em.class), null, null);
                        kotlinx.coroutines.ab abVarB3 = kotlinx.coroutines.av.b();
                        com.waze.shared_infra.i.b bVar12 = (com.waze.shared_infra.i.b) bVar11.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("VoiceFilesProviderImpl");
                        h.g.b.x.e(eVarD6, "create(...)");
                        return new jl(contextH, kcVar, eVarD6, iwVar, jVar, emVar, bVar12, abVarB3);
                    case 9:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i25 = kb.f40359a;
                        h.g.b.x.f(bVar13, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i26 = h.g.b.ar.f48106a;
                        hz hzVar = (hz) bVar13.a(new h.g.b.m(hz.class), null, null);
                        VoicesNativeManager voicesNativeManager = (VoicesNativeManager) bVar13.a(new h.g.b.m(VoicesNativeManager.class), null, null);
                        iv ivVar2 = (iv) bVar13.a(new h.g.b.m(iv.class), null, null);
                        com.waze.sound.a.d dVar = (com.waze.sound.a.d) bVar13.a(new h.g.b.m(com.waze.sound.a.d.class), null, null);
                        com.waze.sound.a.e eVar32 = (com.waze.sound.a.e) bVar13.a(new h.g.b.m(com.waze.sound.a.e.class), null, null);
                        com.waze.shared_infra.i.e eVarD7 = com.waze.shared_infra.i.a.d("VoiceRepository");
                        h.g.b.x.e(eVarD7, "create(...)");
                        return new com.waze.sound.a.g(hzVar, voicesNativeManager, ivVar2, dVar, eVar32, eVarD7);
                    case 10:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i27 = kb.f40359a;
                        h.g.b.x.f(bVar14, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i28 = h.g.b.ar.f48106a;
                        return new com.waze.sound.a.d((em) bVar14.a(new h.g.b.m(em.class), null, null));
                    case 11:
                        int i29 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.sound.a.e();
                    case 12:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i30 = kb.f40359a;
                        h.g.b.x.f(bVar15, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        String path = k.a.k.h(bVar15).getCacheDir().getPath();
                        h.g.b.x.e(path, "getPath(...)");
                        com.waze.shared_infra.coordinators.c cVar5 = new com.waze.shared_infra.coordinators.c(new com.waze.shared_infra.b.b(path, "voiceAssetCacheFile"));
                        com.waze.shared_infra.i.e eVarD8 = com.waze.shared_infra.i.a.d("VoiceAssetProtoCache");
                        h.g.b.x.e(eVarD8, "create(...)");
                        return new hz(eVarD8, cVar5);
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i31 = kb.f40359a;
                        h.g.b.x.f(bVar16, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i32 = h.g.b.ar.f48106a;
                        e.a.i iVarB = ((com.waze.modules.b.h) bVar16.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                        e.a.h hVar3 = e.a.h.f47759a;
                        h.g.b.x.e(hVar3, "DEFAULT");
                        return new com.waze.ce.ab(iVarB, hVar3);
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i33 = kb.f40359a;
                        h.g.b.x.f(bVar17, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i34 = h.g.b.ar.f48106a;
                        return new ju((com.waze.ce.ab) bVar17.a(new h.g.b.m(com.waze.ce.ab.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i35 = kb.f40359a;
                        h.g.b.x.f(bVar18, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new iw((em) bVar18.a(new h.g.b.m(em.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i37 = kb.f40359a;
                        h.g.b.x.f(bVar19, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i38 = h.g.b.ar.f48106a;
                        cx cxVar = (cx) bVar19.a(new h.g.b.m(cx.class), null, null);
                        ik ikVar2 = (ik) bVar19.a(new h.g.b.m(ik.class), null, null);
                        com.waze.sound.a.c cVar6 = (com.waze.sound.a.c) bVar19.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        bs bsVar = (bs) bVar19.a(new h.g.b.m(bs.class), null, null);
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar19.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        com.waze.navigate.dg dgVar = (com.waze.navigate.dg) bVar19.a(new h.g.b.m(com.waze.navigate.dg.class), null, null);
                        com.waze.navigate.gx gxVar = (com.waze.navigate.gx) bVar19.a(new h.g.b.m(com.waze.navigate.gx.class), null, null);
                        com.waze.shared_infra.i.b bVar20 = (com.waze.shared_infra.i.b) bVar19.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        ca caVar = (ca) bVar19.a(new h.g.b.m(ca.class), null, null);
                        com.waze.shared_infra.i.e eVarD9 = com.waze.shared_infra.i.a.d("RouteInstructionVoicesRepository");
                        h.g.b.x.e(eVarD9, "create(...)");
                        return new dd(cxVar, eVarD9, gxVar, ikVar2, cVar6, bsVar, dgVar, driveToNativeManager, bVar20, caVar, kotlinx.coroutines.av.b());
                    case 17:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i39 = kb.f40359a;
                        h.g.b.x.f(bVar21, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        com.waze.sound.a.c cVar7 = (com.waze.sound.a.c) bVar21.a(new h.g.b.m(com.waze.sound.a.c.class), null, null);
                        iv ivVar3 = (iv) bVar21.a(new h.g.b.m(iv.class), null, null);
                        ik ikVar3 = (ik) bVar21.a(new h.g.b.m(ik.class), null, null);
                        dx dxVar22 = (dx) bVar21.a(new h.g.b.m(dx.class), null, null);
                        com.waze.shared_infra.i.e eVarD10 = com.waze.shared_infra.i.a.d("RouteInstructionsVoiceAssetsRepository");
                        h.g.b.x.e(eVarD10, "create(...)");
                        int i41 = kotlinx.coroutines.av.f51370a;
                        return new eb(eVarD10, cVar7, ivVar3, ikVar3, dxVar22, kotlinx.coroutines.e.ac.f51860a, kotlinx.coroutines.av.b());
                    case 18:
                        int i42 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new dx();
                    case 19:
                        int i43 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cy();
                    default:
                        int i44 = kb.f40359a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$single");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new cc();
                }
            }
        };
        org.a.d.e.a aVar11 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.sound.b.a.class), null, pVar21, cVar2, h.a.i.h()));
        aVar.f(aVar11);
        new org.a.d.c.d(aVar, aVar11);
        return h.ab.f48028a;
    }
}
