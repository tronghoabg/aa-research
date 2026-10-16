package com.waze.parking;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material.SwitchColors;
import androidx.compose.material.SwitchDefaults;
import androidx.compose.material.SwitchKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.Ref;
import com.waze.R;
import com.waze.car_lib.r.cq;
import com.waze.sharedrive.g.bf;
import com.waze.sharedui.views.ap;
import com.waze.sharedui.web.aq;
import com.waze.sound.bp;
import com.waze.trip_overview.aw;
import com.waze.trip_overview.br;
import com.waze.ui.l.ak;
import com.waze.ui.z.an;
import com.waze.uid.VehicleType;
import com.waze.z.a.ar;
import com.waze.z.a.be;
import h.ab;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class f implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f32956a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32957b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f32958c;

    public /* synthetic */ f(Object obj, Object obj2, int i2) {
        this.f32958c = i2;
        this.f32956a = obj;
        this.f32957b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [com.waze.main_screen.l.b.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v58, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v31, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v54, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v56, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v62, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [androidx.compose.runtime.State, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = 9;
        int i3 = 6;
        byte[] bArr = null;
        int i4 = 2;
        i = 0;
        int i5 = 0;
        switch (this.f32958c) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-34707112, iIntValue, -1, "com.waze.parking.ParkingUpdateLocationActivityExt.setContentWithWazeMapAndCompose.<anonymous>.<anonymous> (ParkingUpdateLocationActivityExt.kt:31)");
                    }
                    Object obj3 = this.f32957b;
                    boolean zChangedInstance = composer.changedInstance(obj3);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new com.waze.car_lib.login.b(obj3, 14);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    q.b((y) this.f32956a, true, (h.g.a.l) objRememberedValue, composer, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return ab.f48028a;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(205783444, iIntValue2, -1, "com.waze.parking.ParkingUpdateLocationActivityExt.setContentWithWazeMapAndCompose.<anonymous> (ParkingUpdateLocationActivityExt.kt:30)");
                    }
                    cq.k(false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-34707112, true, new f(this.f32956a, this.f32957b, z ? 1 : 0), composer2, 54), composer2, 196608);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return ab.f48028a;
            case 2:
                return com.waze.profile.g.g((com.waze.profile.g) this.f32956a, this.f32957b, (Composer) obj, ((Integer) obj2).intValue());
            case 3:
                return com.waze.settings.a.a.b.f.e((com.waze.settings.a.a.b.f) this.f32956a, this.f32957b, (Composer) obj, ((Integer) obj2).intValue());
            case 4:
                return com.waze.settings.a.a.b.f.g((com.waze.settings.a.a.b.f) this.f32956a, this.f32957b, (Composer) obj, ((Integer) obj2).intValue());
            case 5:
                return com.waze.settings.e.b.l.f((com.waze.settings.e.b.l) this.f32956a, this.f32957b, (Composer) obj, ((Integer) obj2).intValue());
            case 6:
                return com.waze.settings.i.a.m.e((com.waze.settings.i.a.m) this.f32956a, this.f32957b, (Composer) obj, ((Integer) obj2).intValue());
            case 7:
                return bf.k(this.f32957b, this.f32956a, (Composer) obj, ((Integer) obj2).intValue());
            case 8:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(998583761, iIntValue3, -1, "com.waze.sharedui.web.WazeWebViewPage.<anonymous> (WazeWebViewPage.kt:69)");
                    }
                    ap.d(((aq) this.f32957b).a(), this.f32956a, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return ab.f48028a;
            case 9:
                return com.waze.sound.e.h.a((bp) this.f32957b, (bp) this.f32956a, (Composer) obj, ((Integer) obj2).intValue());
            case 10:
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (composer4.shouldExecute((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1238825765, iIntValue4, -1, "com.waze.startstate.mobile.ui.StartStateBottomSheet.<anonymous> (StartStateBottomSheet.kt:221)");
                    }
                    com.waze.tide.s sVar = (com.waze.tide.s) ((Ref) this.f32957b).getValue();
                    if (sVar == null) {
                        composer4.startReplaceGroup(795646831);
                        composer4.endReplaceGroup();
                    } else {
                        ?? r0 = this.f32956a;
                        composer4.startReplaceGroup(795646832);
                        com.waze.sharedui.profile.c.n(sVar, r0, composer4, 0);
                        composer4.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return ab.f48028a;
            case 11:
                Composer composer5 = (Composer) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (composer5.shouldExecute((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(534693901, iIntValue5, -1, "com.waze.trip_overview.screen.fragments.TripOverviewRoutesFragment.onViewCreated.<anonymous>.<anonymous> (TripOverviewRoutesFragment.kt:319)");
                    }
                    Modifier modifierM2755padding3ABfNKs = PaddingKt.m2755padding3ABfNKs(Modifier.Companion, 3.0f);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer5, 0);
                    int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer5, modifierM2755padding3ABfNKs);
                    h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    if (!(composer5.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor);
                    } else {
                        composer5.useNode();
                    }
                    Object obj4 = this.f32957b;
                    Updater.m7351setimpl(composer5, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m7351setimpl(composer5, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Updater.m7351setimpl(composer5, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
                    Updater.m7349reconcileimpl(composer5, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                    Updater.m7351setimpl(composer5, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    aw awVar = (aw) obj4;
                    if ((awVar.b() instanceof com.waze.ui.x.f) && ((com.waze.ui.x.f) awVar.b()).a()) {
                        i5 = 1;
                    }
                    if ((awVar.a() instanceof com.waze.ui.x.f) && ((com.waze.ui.x.f) awVar.a()).a()) {
                        i5++;
                    }
                    Object obj5 = this.f32956a;
                    com.waze.ui.r.a.d.c cVar = com.waze.ui.r.a.d.c.D;
                    boolean zChangedInstance2 = composer5.changedInstance(obj5);
                    Object objRememberedValue2 = composer5.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new com.waze.settings.d.a(obj5, 17);
                        composer5.updateRememberedValue(objRememberedValue2);
                    }
                    com.waze.ui.g.w.i(i5, cVar, (h.g.a.a) objRememberedValue2, composer5, 48);
                    composer5.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return ab.f48028a;
            case 12:
                Composer composer6 = (Composer) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (composer6.shouldExecute((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-362094232, iIntValue6, -1, "com.waze.trip_overview.views.trip_details_container.TripOverviewDetailsContainer.bindVehicleTypeSelector.<anonymous> (TripOverviewDetailsContainer.kt:39)");
                    }
                    cq.k(false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1377384668, true, new f(this.f32957b, this.f32956a, 13, bArr), composer6, 54), composer6, 196608);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return ab.f48028a;
            case 13:
                Composer composer7 = (Composer) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (composer7.shouldExecute((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1377384668, iIntValue7, -1, "com.waze.trip_overview.views.trip_details_container.TripOverviewDetailsContainer.bindVehicleTypeSelector.<anonymous>.<anonymous> (TripOverviewDetailsContainer.kt:40)");
                    }
                    Object obj6 = this.f32956a;
                    br brVar = (br) this.f32957b;
                    List listB = brVar.b();
                    int iA = brVar.a();
                    boolean zC = brVar.c();
                    boolean zD = brVar.d();
                    boolean zChangedInstance3 = composer7.changedInstance(obj6);
                    Object objRememberedValue3 = composer7.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = new com.waze.tide.a.c(obj6, 11);
                        composer7.updateRememberedValue(objRememberedValue3);
                    }
                    h.g.a.l lVar = (h.g.a.l) objRememberedValue3;
                    boolean zChangedInstance4 = composer7.changedInstance(obj6);
                    Object objRememberedValue4 = composer7.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                        objRememberedValue4 = new com.waze.settings.g.a.b(obj6, 9);
                        composer7.updateRememberedValue(objRememberedValue4);
                    }
                    h.g.a.a aVar = (h.g.a.a) objRememberedValue4;
                    boolean zChangedInstance5 = composer7.changedInstance(obj6);
                    Object objRememberedValue5 = composer7.rememberedValue();
                    if (zChangedInstance5 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                        objRememberedValue5 = new com.waze.settings.g.a.b(obj6, 10);
                        composer7.updateRememberedValue(objRememberedValue5);
                    }
                    com.waze.trip_overview.views.l.a(listB, iA, lVar, null, zC, zD, aVar, (h.g.a.a) objRememberedValue5, composer7, 0, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return ab.f48028a;
            case 14:
                return com.waze.ui.a.l.a(this.f32957b, this.f32956a, (Composer) obj, ((Integer) obj2).intValue());
            case 15:
                Composer composer8 = (Composer) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (composer8.shouldExecute((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-999972801, iIntValue8, -1, "com.waze.ui.hnc.HncSettingsScreen.<anonymous> (HncSettingsScreen.kt:123)");
                    }
                    Object obj7 = this.f32956a;
                    Object obj8 = this.f32957b;
                    String strB = com.waze.ui.r.a.c.c.b(R.string.HNC_DONE, composer8, 0);
                    ar arVarE = com.waze.z.a.b.n.e(com.waze.design_components.button.g.f23358a, null, null, 6);
                    boolean zD2 = ((com.waze.ui.k.i) obj8).d();
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(WindowInsetsPaddingKt.windowInsetsPadding(PaddingKt.m2755padding3ABfNKs(BackgroundKt.m1972backgroundbw27NRU$default(Modifier.Companion, com.waze.bz.a.d(composer8, 0).h(), null, 2, null), 16.0f), WindowInsetsKt.m2850onlybOOhFvg(WindowInsets_androidKt.getNavigationBars(WindowInsets.Companion, composer8, 6), WindowInsetsSides.Companion.m2868getBottomJoeWqyM())), 0.0f, 1, null);
                    boolean zChanged = composer8.changed(obj7);
                    Object objRememberedValue6 = composer8.rememberedValue();
                    if (zChanged || objRememberedValue6 == Composer.Companion.getEmpty()) {
                        objRememberedValue6 = new com.waze.sharedrive.c.r(obj7, i2);
                        composer8.updateRememberedValue(objRememberedValue6);
                    }
                    be.o((h.g.a.a) objRememberedValue6, modifierFillMaxWidth$default, strB, null, arVarE, null, zD2, false, composer8, 0, 168);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return ab.f48028a;
            case 16:
                return com.waze.ui.l.l.f((ak) this.f32956a, this.f32957b, (Composer) obj, ((Integer) obj2).intValue());
            case 17:
                com.waze.z.a.c.d dVar = (com.waze.z.a.c.d) obj2;
                h.g.b.x.f((com.waze.z.a.c.c) obj, "<unused var>");
                h.g.b.x.f(dVar, "cta");
                boolean zN = h.g.b.x.n(dVar, this.f32957b);
                com.waze.ui.s.d dVar2 = (com.waze.ui.s.d) this.f32956a;
                (zN ? dVar2.c() : dVar2.d()).invoke();
                return ab.f48028a;
            case 18:
                Composer composer9 = (Composer) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (composer9.shouldExecute((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2079925573, iIntValue9, -1, "com.waze.ui.shared_drive.CurrentUserViewerListItem.<anonymous> (LiveShareParticipantListItem.kt:212)");
                    }
                    Object obj9 = this.f32956a;
                    Object obj10 = this.f32957b;
                    Modifier modifierA = com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.dL, null);
                    an anVar = (an) obj10;
                    boolean zC2 = anVar.c();
                    boolean zD3 = anVar.d();
                    SwitchColors switchColorsD = com.waze.ui.r.a.d.d.d(SwitchDefaults.INSTANCE, composer9, SwitchDefaults.$stable);
                    boolean zChanged2 = composer9.changed(obj9);
                    Object objRememberedValue7 = composer9.rememberedValue();
                    if (zChanged2 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                        objRememberedValue7 = new com.waze.ui.x.p(obj9, 4);
                        composer9.updateRememberedValue(objRememberedValue7);
                    }
                    SwitchKt.Switch(zC2, (h.g.a.l) objRememberedValue7, modifierA, zD3, null, switchColorsD, composer9, 384, 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return ab.f48028a;
            case 19:
                return com.waze.uid.c.b.a((com.waze.uid.c.b) this.f32956a, this.f32957b, (Composer) obj, ((Integer) obj2).intValue());
            default:
                Composer composer10 = (Composer) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (composer10.shouldExecute((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(97758548, iIntValue10, -1, "com.waze.uid.fragments.ChooseVehicleTypeFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (ChooseVehicleTypeFragment.kt:67)");
                    }
                    ?? r1 = this.f32957b;
                    Object obj11 = this.f32956a;
                    VehicleType vehicleType = (VehicleType) r1.getValue();
                    boolean zChangedInstance6 = composer10.changedInstance(obj11);
                    Object objRememberedValue8 = composer10.rememberedValue();
                    if (zChangedInstance6 || objRememberedValue8 == Composer.Companion.getEmpty()) {
                        objRememberedValue8 = new com.waze.uid.c.c((com.waze.uid.c.be) obj11, i4);
                        composer10.updateRememberedValue(objRememberedValue8);
                    }
                    h.g.a.l lVar2 = (h.g.a.l) objRememberedValue8;
                    boolean zChangedInstance7 = composer10.changedInstance(obj11);
                    Object objRememberedValue9 = composer10.rememberedValue();
                    if (zChangedInstance7 || objRememberedValue9 == Composer.Companion.getEmpty()) {
                        objRememberedValue9 = new com.waze.uid.c.a((com.waze.uid.c.be) obj11, 5);
                        composer10.updateRememberedValue(objRememberedValue9);
                    }
                    h.g.a.a aVar2 = (h.g.a.a) objRememberedValue9;
                    boolean zChangedInstance8 = composer10.changedInstance(obj11);
                    Object objRememberedValue10 = composer10.rememberedValue();
                    if (zChangedInstance8 || objRememberedValue10 == Composer.Companion.getEmpty()) {
                        objRememberedValue10 = new com.waze.uid.c.a((com.waze.uid.c.be) obj11, i3);
                        composer10.updateRememberedValue(objRememberedValue10);
                    }
                    com.waze.uid.activities.a.f(vehicleType, lVar2, aVar2, (h.g.a.a) objRememberedValue10, composer10, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return ab.f48028a;
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, int i2, byte[] bArr) {
        this.f32958c = i2;
        this.f32957b = obj;
        this.f32956a = obj2;
    }
}
