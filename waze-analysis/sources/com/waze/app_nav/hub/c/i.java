package com.waze.app_nav.hub.c;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.waze.NativeManager;
import com.waze.au;
import com.waze.av.b.ah;
import com.waze.calendar.CalendarNativeManager;
import com.waze.car_lib.b.ap;
import com.waze.car_lib.b.bo;
import com.waze.car_lib.n.w;
import com.waze.car_lib.r.ae;
import com.waze.car_lib.r.ao;
import com.waze.car_lib.r.bn;
import com.waze.car_lib.r.bp;
import com.waze.car_lib.r.bq;
import com.waze.car_lib.r.bz;
import com.waze.car_lib.r.ck;
import com.waze.car_lib.r.cn;
import com.waze.car_lib.r.dt;
import com.waze.car_lib.r.eh;
import com.waze.car_lib.r.em;
import com.waze.car_lib.r.en;
import com.waze.car_lib.r.ez;
import com.waze.car_lib.r.ff;
import com.waze.car_lib.z;
import com.waze.config.ConfigValues;
import com.waze.iw;
import com.waze.mo;
import com.waze.mywaze.MyWazeNativeManager;
import com.waze.navigate.DriveToNativeManager;
import com.waze.navigate.bw;
import com.waze.navigate.cj;
import com.waze.navigate.cr;
import com.waze.navigate.db;
import com.waze.navigate.dg;
import com.waze.navigate.eo;
import com.waze.navigate.gb;
import com.waze.network.b.al;
import com.waze.network.b.y;
import com.waze.realtime.RealtimeNativeManager;
import com.waze.settings.SettingsNativeManager;
import com.waze.settings.ds;
import com.waze.settings.eb;
import com.waze.sound.bs;
import h.ab;
import h.g.b.ar;
import h.g.b.x;
import kotlinx.coroutines.av;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class i implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f15305a;

    public /* synthetic */ i(int i2) {
        this.f15305a = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15305a) {
            case 0:
                k kVar = (k) obj;
                k kVar2 = (k) obj2;
                Integer numValueOf = Integer.valueOf(x.a(kVar.c().ordinal(), kVar2.c().ordinal()));
                Integer num = numValueOf.intValue() != 0 ? numValueOf : null;
                return Integer.valueOf(num != null ? num.intValue() : x.b(kVar.a(), kVar2.a()));
            case 1:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = iIntValue & 3;
                int i3 = iIntValue & 1;
                int i4 = com.waze.l.s.f25119a;
                if (composer.shouldExecute(i2 != 2, i3)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2067565277, iIntValue, -1, "com.waze.bluetooth.ComposableSingletons$BluetoothPermissionDialogKt.lambda$-2067565277.<anonymous> (BluetoothPermissionDialog.kt:405)");
                    }
                    Modifier modifierM1972backgroundbw27NRU$default = BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Color.Companion.m8258getGray0d7_KjU(), null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM1972backgroundbw27NRU$default);
                    h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Updater.m7351setimpl(composer, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
                    Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                    Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new mo(14);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    h.g.a.l lVar = (h.g.a.l) objRememberedValue;
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new iw(8);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    h.g.a.a aVar = (h.g.a.a) objRememberedValue2;
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = new iw(9);
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    h.g.a.a aVar2 = (h.g.a.a) objRememberedValue3;
                    Object objRememberedValue4 = composer.rememberedValue();
                    if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                        objRememberedValue4 = new iw(10);
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    com.waze.l.m.p(false, lVar, aVar, aVar2, (h.g.a.a) objRememberedValue4, composer, 28086);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return ab.f48028a;
            case 2:
                org.a.d.k.b bVar = (org.a.d.k.b) obj;
                x.f(bVar, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i5 = ar.f48106a;
                return new CalendarNativeManager((com.waze.calendar.e) bVar.a(new h.g.b.m(com.waze.calendar.e.class), null, null), av.b());
            case 3:
                org.a.d.k.b bVar2 = (org.a.d.k.b) obj;
                int i6 = z.f22053a;
                x.f(bVar2, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i7 = ar.f48106a;
                com.waze.settings.e.a.e eVar = (com.waze.settings.e.a.e) bVar2.a(new h.g.b.m(com.waze.settings.e.a.e.class), null, null);
                com.waze.settings.e.c.a aVar3 = (com.waze.settings.e.c.a) bVar2.a(new h.g.b.m(com.waze.settings.e.c.a.class), null, null);
                com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("HncSettingsStateHolder");
                x.e(eVarD, "create(...)");
                return new com.waze.car_lib.r.b.d(eVar, aVar3, eVarD);
            case 4:
                org.a.d.k.b bVar3 = (org.a.d.k.b) obj;
                int i8 = z.f22053a;
                x.f(bVar3, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i9 = ar.f48106a;
                return new em((com.waze.shared_infra.o.a) bVar3.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (ds) bVar3.a(new h.g.b.m(ds.class), null, null), (com.waze.car_lib.c.n) bVar3.a(new h.g.b.m(com.waze.car_lib.c.n.class), null, null), (eb) bVar3.a(new h.g.b.m(eb.class), null, null), (MyWazeNativeManager) bVar3.a(new h.g.b.m(MyWazeNativeManager.class), null, null), (RealtimeNativeManager) bVar3.a(new h.g.b.m(RealtimeNativeManager.class), null, null), (NativeManager) bVar3.a(new h.g.b.m(NativeManager.class), null, null), (SettingsNativeManager) bVar3.a(new h.g.b.m(SettingsNativeManager.class), null, null), (com.waze.car_lib.c.a) bVar3.a(new h.g.b.m(com.waze.car_lib.c.a.class), null, null), (com.waze.sharedui.b.d) bVar3.a(new h.g.b.m(com.waze.sharedui.b.d.class), null, null), (com.waze.ev.n) bVar3.a(new h.g.b.m(com.waze.ev.n.class), null, null), (com.waze.google_assistant.c) bVar3.a(new h.g.b.m(com.waze.google_assistant.c.class), null, null), (com.waze.settings.d.f) bVar3.a(new h.g.b.m(com.waze.settings.d.f.class), null, null), (com.waze.reports_v2.e) bVar3.a(new h.g.b.m(com.waze.reports_v2.e.class), com.waze.ch.a.a.f.f("CarConversationalModeProvider"), null), (com.waze.car_lib.r.b.b) bVar3.a(new h.g.b.m(com.waze.car_lib.r.b.b.class), null, null));
            case 5:
                org.a.d.k.b bVar4 = (org.a.d.k.b) obj;
                int i10 = z.f22053a;
                x.f(bVar4, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i11 = ar.f48106a;
                return new en((com.waze.shared_infra.o.a) bVar4.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (ds) bVar4.a(new h.g.b.m(ds.class), null, null));
            case 6:
                org.a.d.k.b bVar5 = (org.a.d.k.b) obj;
                int i12 = z.f22053a;
                x.f(bVar5, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i13 = ar.f48106a;
                ck ckVar = (ck) bVar5.a(new h.g.b.m(ck.class), null, null);
                db dbVar = (db) bVar5.a(new h.g.b.m(db.class), null, null);
                com.waze.car_lib.b.f fVar = (com.waze.car_lib.b.f) bVar5.a(new h.g.b.m(com.waze.car_lib.b.f.class), null, null);
                bs bsVar = (bs) bVar5.a(new h.g.b.m(bs.class), null, null);
                com.waze.config.d dVar = ConfigValues.CONFIG_VALUE_NAVIGATION_GUIDANCE_MODE;
                x.e(dVar, "CONFIG_VALUE_NAVIGATION_GUIDANCE_MODE");
                com.waze.config.b bVar6 = ConfigValues.CONFIG_VALUE_AAOS_ETA_IN_TRIP_TEXT_ENABLED;
                x.e(bVar6, "CONFIG_VALUE_AAOS_ETA_IN_TRIP_TEXT_ENABLED");
                com.waze.config.b bVar7 = ConfigValues.CONFIG_VALUE_AAOS_TIME_TO_DESTINATION_IN_TRIP_TEXT_ENABLED;
                x.e(bVar7, "CONFIG_VALUE_AAOS_TIME_T…TION_IN_TRIP_TEXT_ENABLED");
                return new bz(ckVar, dbVar, fVar, bsVar, dVar, bVar6, bVar7, (bo) bVar5.a(new h.g.b.m(bo.class), null, null), (ap) bVar5.a(new h.g.b.m(ap.class), null, null), (com.waze.map.b.n) bVar5.a(new h.g.b.m(com.waze.map.b.n.class), null, null), (com.waze.shared_infra.o.a) bVar5.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (com.waze.z) bVar5.a(new h.g.b.m(com.waze.z.class), null, null), (al) bVar5.a(new h.g.b.m(al.class), null, null), (eo) bVar5.a(new h.g.b.m(eo.class), null, null), (y) bVar5.a(new h.g.b.m(y.class), null, null), (com.waze.car_lib.c.i) bVar5.a(new h.g.b.m(com.waze.car_lib.c.i.class), null, null), (com.waze.o.c.c.b) bVar5.a(new h.g.b.m(com.waze.o.c.c.b.class), null, null));
            case 7:
                org.a.d.k.b bVar8 = (org.a.d.k.b) obj;
                int i14 = z.f22053a;
                x.f(bVar8, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i15 = ar.f48106a;
                return new bn((cj) bVar8.a(new h.g.b.m(cj.class), null, null));
            case 8:
                int i16 = z.f22053a;
                x.f((org.a.d.k.b) obj, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                return new bq();
            case 9:
                org.a.d.k.b bVar9 = (org.a.d.k.b) obj;
                int i17 = z.f22053a;
                x.f(bVar9, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i18 = ar.f48106a;
                return new com.waze.car_lib.j.a((com.waze.bn.b) bVar9.a(new h.g.b.m(com.waze.bn.b.class), null, null), (db) bVar9.a(new h.g.b.m(db.class), null, null));
            case 10:
                org.a.d.k.b bVar10 = (org.a.d.k.b) obj;
                int i19 = z.f22053a;
                x.f(bVar10, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i20 = ar.f48106a;
                return new bp((cr) bVar10.a(new h.g.b.m(cr.class), null, null), (bw) bVar10.a(new h.g.b.m(bw.class), null, null), (bq) bVar10.a(new h.g.b.m(bq.class), null, null));
            case 11:
                org.a.d.k.b bVar11 = (org.a.d.k.b) obj;
                int i21 = z.f22053a;
                x.f(bVar11, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i22 = ar.f48106a;
                return new ff((gb) bVar11.a(new h.g.b.m(gb.class), null, null), (com.waze.shared_infra.o.a) bVar11.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
            case 12:
                org.a.d.k.b bVar12 = (org.a.d.k.b) obj;
                int i23 = z.f22053a;
                x.f(bVar12, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i24 = ar.f48106a;
                return new ck((bn) bVar12.a(new h.g.b.m(bn.class), null, null), (bp) bVar12.a(new h.g.b.m(bp.class), null, null), (ff) bVar12.a(new h.g.b.m(ff.class), null, null), (db) bVar12.a(new h.g.b.m(db.class), null, null), (eo) bVar12.a(new h.g.b.m(eo.class), null, null));
            case 13:
                org.a.d.k.b bVar13 = (org.a.d.k.b) obj;
                int i25 = z.f22053a;
                x.f(bVar13, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i26 = ar.f48106a;
                return new com.waze.car_lib.r.cr((com.waze.shared_infra.o.a) bVar13.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
            case 14:
                org.a.d.k.b bVar14 = (org.a.d.k.b) obj;
                int i27 = z.f22053a;
                x.f(bVar14, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i28 = ar.f48106a;
                com.waze.shared_infra.o.a aVar4 = (com.waze.shared_infra.o.a) bVar14.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                com.waze.car_lib.n.al alVar = (com.waze.car_lib.n.al) bVar14.a(new h.g.b.m(com.waze.car_lib.n.al.class), null, null);
                w wVar = (w) bVar14.a(new h.g.b.m(w.class), null, null);
                com.waze.config.b bVar15 = ConfigValues.CONFIG_VALUE_ND4C_ALGO_TRANSPARENCY_FEATURE_ENABLED;
                x.e(bVar15, "CONFIG_VALUE_ND4C_ALGO_T…NSPARENCY_FEATURE_ENABLED");
                return new ez(aVar4, alVar, wVar, bVar15, (com.waze.car_lib.q.h) bVar14.a(new h.g.b.m(com.waze.car_lib.q.h.class), null, null));
            case 15:
                org.a.d.k.b bVar16 = (org.a.d.k.b) obj;
                int i29 = z.f22053a;
                x.f(bVar16, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i30 = ar.f48106a;
                com.waze.settings.f.b.b bVar17 = (com.waze.settings.f.b.b) bVar16.a(new h.g.b.m(com.waze.settings.f.b.b.class), null, null);
                DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar16.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                eb ebVar = (eb) bVar16.a(new h.g.b.m(eb.class), null, null);
                com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar16.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("HovSettingsViewModel"));
                x.e(eVarA, "provide(...)");
                return new ae(bVar17, driveToNativeManager, ebVar, eVarA);
            case 16:
                org.a.d.k.b bVar18 = (org.a.d.k.b) obj;
                int i31 = z.f22053a;
                x.f(bVar18, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i32 = ar.f48106a;
                return new ao((com.waze.settings.g.a.a) bVar18.a(new h.g.b.m(com.waze.settings.g.a.a.class), null, null), (com.waze.settings.g.b.a) bVar18.a(new h.g.b.m(com.waze.settings.g.b.a.class), null, null), (com.waze.shared_infra.o.a) bVar18.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
            case 17:
                org.a.d.k.b bVar19 = (org.a.d.k.b) obj;
                int i33 = z.f22053a;
                x.f(bVar19, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i34 = ar.f48106a;
                return new com.waze.car_lib.r.f((com.waze.shared_infra.o.a) bVar19.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (com.waze.car_lib.n.j) bVar19.a(new h.g.b.m(com.waze.car_lib.n.j.class), null, null));
            case 18:
                org.a.d.k.b bVar20 = (org.a.d.k.b) obj;
                int i35 = z.f22053a;
                x.f(bVar20, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i36 = ar.f48106a;
                return new eh((com.waze.shared_infra.o.a) bVar20.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (com.waze.car_lib.n.r) bVar20.a(new h.g.b.m(com.waze.car_lib.n.r.class), null, null), (com.waze.car_lib.n.j) bVar20.a(new h.g.b.m(com.waze.car_lib.n.j.class), null, null), (com.waze.location.y) bVar20.a(new h.g.b.m(com.waze.location.y.class), null, null), (com.waze.ev.n) bVar20.a(new h.g.b.m(com.waze.ev.n.class), null, null), (com.waze.map.b.cj) bVar20.a(new h.g.b.m(com.waze.map.b.cj.class), null, null), new au(3), new au(4), (com.waze.search.stats.s) bVar20.a(new h.g.b.m(com.waze.search.stats.s.class), null, null), (com.waze.car_lib.c.l) bVar20.a(new h.g.b.m(com.waze.car_lib.c.l.class), null, null), (dg) bVar20.a(new h.g.b.m(dg.class), null, null), (com.waze.search.b.d) bVar20.a(new h.g.b.m(com.waze.search.b.d.class), null, null), (com.waze.search.v2.p) bVar20.a(new h.g.b.m(com.waze.search.v2.p.class), null, null), (com.waze.shared_infra.q.j) bVar20.a(new h.g.b.m(com.waze.shared_infra.q.j.class), null, null), (com.waze.shared_infra.q.e) bVar20.a(new h.g.b.m(com.waze.shared_infra.q.e.class), null, null), (com.waze.shared_infra.q.r) bVar20.a(new h.g.b.m(com.waze.shared_infra.q.r.class), null, null), (cj) bVar20.a(new h.g.b.m(cj.class), null, null), (com.waze.z) bVar20.a(new h.g.b.m(com.waze.z.class), null, null));
            case 19:
                org.a.d.k.b bVar21 = (org.a.d.k.b) obj;
                int i37 = z.f22053a;
                x.f(bVar21, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i38 = ar.f48106a;
                return new dt((ah) bVar21.a(new h.g.b.m(ah.class), null, null), (com.waze.shared_infra.o.a) bVar21.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
            default:
                org.a.d.k.b bVar22 = (org.a.d.k.b) obj;
                int i39 = z.f22053a;
                x.f(bVar22, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i40 = ar.f48106a;
                return new cn((com.waze.shared_infra.o.a) bVar22.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
        }
    }
}
