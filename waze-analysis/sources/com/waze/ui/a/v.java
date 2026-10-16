package com.waze.ui.a;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.waze.R;
import com.waze.strings.DisplayStrings;
import com.waze.ui.f.ab;
import com.waze.ui.f.ac;
import com.waze.ui.f.ad;
import com.waze.ui.f.ae;
import com.waze.ui.f.ag;
import com.waze.ui.f.ah;
import com.waze.ui.f.ai;
import com.waze.ui.f.aj;
import com.waze.ui.m.ci;
import com.waze.ui.m.dc;
import com.waze.ui.w.b.au;
import com.waze.ui.w.b.bj;
import j$.time.Instant;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class v implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f41700a;

    public /* synthetic */ v(int i2) {
        this.f41700a = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        final int i2 = 0;
        switch (this.f41700a) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i3 = iIntValue & 3;
                int i4 = iIntValue & 1;
                int i5 = w.f41701a;
                if (composer.shouldExecute(i3 != 2, i4)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(677561043, iIntValue, -1, "com.waze.ui.ads.ComposableSingletons$AdHeaderKt.lambda$677561043.<anonymous> (AdHeader.kt:313)");
                    }
                    BoxKt.Box(BackgroundKt.m1972backgroundbw27NRU$default(Modifier.Companion, com.waze.bz.a.d(composer, 0).h(), null, 2, null), composer, 0);
                    l.w(u.i(l.f(), "Very very long title that needs more than two lines requiring ellipsis", DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_5), composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i6 = iIntValue2 & 3;
                int i7 = iIntValue2 & 1;
                int i8 = w.f41701a;
                if (composer2.shouldExecute(i6 != 2, i7)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1508216809, iIntValue2, -1, "com.waze.ui.ads.ComposableSingletons$AdHeaderKt.lambda$1508216809.<anonymous> (AdHeader.kt:301)");
                    }
                    BoxKt.Box(BackgroundKt.m1972backgroundbw27NRU$default(Modifier.Companion, com.waze.bz.a.d(composer2, 0).h(), null, 2, null), composer2, 0);
                    l.w(u.i(l.f(), "Very long title that needs at most two lines", DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_5), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i9 = iIntValue3 & 3;
                int i10 = iIntValue3 & 1;
                int i11 = w.f41701a;
                if (composer3.shouldExecute(i9 != 2, i10)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(73777624, iIntValue3, -1, "com.waze.ui.ads.ComposableSingletons$AdHeaderKt.lambda$73777624.<anonymous> (AdHeader.kt:328)");
                    }
                    BoxKt.Box(BackgroundKt.m1972backgroundbw27NRU$default(Modifier.Companion, com.waze.bz.a.d(composer3, 0).h(), null, 2, null), composer3, 0);
                    l.w(u.i(l.f(), "Waze Eats", DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_2W_2), composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                break;
            case 3:
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i12 = iIntValue4 & 3;
                int i13 = iIntValue4 & 1;
                int i14 = w.f41701a;
                if (composer4.shouldExecute(i12 != 2, i13)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(704733934, iIntValue4, -1, "com.waze.ui.ads.ComposableSingletons$AdHeaderKt.lambda$704733934.<anonymous> (AdHeader.kt:337)");
                    }
                    BoxKt.Box(BackgroundKt.m1972backgroundbw27NRU$default(Modifier.Companion, com.waze.bz.a.d(composer4, 0).h(), null, 2, null), composer4, 0);
                    l.w(u.i(l.f(), "Waze Eats", DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_2W_2), composer4, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                break;
            case 4:
                h.g.b.x.f((com.waze.ui.b.e) obj, "<unused var>");
                h.g.b.x.f((com.waze.ui.b.e) obj2, "<unused var>");
                break;
            case 5:
                com.waze.ui.b.p pVar = (com.waze.ui.b.p) obj2;
                int i15 = com.waze.ui.b.n.f42077a;
                h.g.b.x.f((SaverScope) obj, "$this$listSaver");
                h.g.b.x.f(pVar, "state");
                break;
            case 6:
                ((Boolean) obj).booleanValue();
                ((Integer) obj2).intValue();
                int i16 = com.waze.ui.b.z.f42115a;
                break;
            case 7:
                ((Boolean) obj).booleanValue();
                ((Integer) obj2).intValue();
                int i17 = com.waze.ui.b.z.f42115a;
                break;
            case 8:
                ((Integer) obj).intValue();
                ((Integer) obj2).intValue();
                break;
            case 9:
                Composer composer5 = (Composer) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i18 = iIntValue5 & 3;
                int i19 = iIntValue5 & 1;
                int i20 = com.waze.ui.d.a.f42131a;
                if (composer5.shouldExecute(i18 != 2, i19)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-476229947, iIntValue5, -1, "com.waze.ui.asks.ComposableSingletons$WazeAsksLayoutsKt.lambda$-476229947.<anonymous> (WazeAsksLayouts.kt:131)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                break;
            case 10:
                Composer composer6 = (Composer) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i21 = iIntValue6 & 1;
                boolean z = (iIntValue6 & 3) != 2;
                int i22 = com.waze.ui.d.a.f42131a;
                if (composer6.shouldExecute(z, i21)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-48067045, iIntValue6, -1, "com.waze.ui.asks.ComposableSingletons$WazeAsksLayoutsKt.lambda$-48067045.<anonymous> (WazeAsksLayouts.kt:237)");
                    }
                    com.waze.ui.ac.j jVar = new com.waze.ui.ac.j(R.string.WAZE_ASKS_ENRICH_ALERT_TITLE_WHAT_DO_YOU_SEE);
                    bj bjVar = bj.m;
                    bj bjVar2 = bj.o;
                    com.waze.ui.d.f fVar = new com.waze.ui.d.f(jVar, h.a.i.i(new com.waze.ui.d.b(0, "token_0", new com.waze.ui.d.d(new au(bjVar, R.drawable.icon_report_hazard_object_vector, R.string.REPORT_MENU_V2_HAZARD_OBJECT_LABEL, bjVar)), 5), new com.waze.ui.d.b(1, "token_1", new com.waze.ui.d.d(new au(bjVar2, R.drawable.icon_report_hazard_construction_vector, R.string.REPORT_MENU_V2_HAZARD_CONSTRUCTION_LABEL, bjVar2)), 5), new com.waze.ui.d.b(2, "token_2", new com.waze.ui.d.c(R.string.ALERTER_NOT_THERE), 5)));
                    Instant instantNow = Instant.now();
                    h.g.b.x.e(instantNow, "now(...)");
                    com.waze.ui.d.t tVar = new com.waze.ui.d.t(fVar, instantNow, h.o.c.i(7, h.o.d.f48273d));
                    Object objRememberedValue = composer6.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(tVar, null, 2, null);
                        composer6.updateRememberedValue(objRememberedValue);
                    }
                    com.waze.ui.d.t tVar2 = (com.waze.ui.d.t) ((MutableState) objRememberedValue).getValue();
                    Object objRememberedValue2 = composer6.rememberedValue();
                    if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new com.waze.ui.b.r(4);
                        composer6.updateRememberedValue(objRememberedValue2);
                    }
                    com.waze.ui.d.s.f(tVar2, (h.g.a.l) objRememberedValue2, PaddingKt.m2752PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, 48.0f, 7, null), composer6, DisplayStrings.DS_DIRT_ROADS, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                break;
            case 11:
                Composer composer7 = (Composer) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i23 = iIntValue7 & 1;
                boolean z2 = (iIntValue7 & 3) != 2;
                int i24 = com.waze.ui.d.a.f42131a;
                if (composer7.shouldExecute(z2, i23)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(995713514, iIntValue7, -1, "com.waze.ui.asks.ComposableSingletons$WazeAsksLayoutsKt.lambda$995713514.<anonymous> (WazeAsksLayouts.kt:296)");
                    }
                    com.waze.ui.ac.j jVar2 = new com.waze.ui.ac.j(R.string.WAZE_ASKS_ENRICH_ALERT_TITLE_WHAT_DO_YOU_SEE);
                    bj bjVar3 = bj.m;
                    bj bjVar4 = bj.o;
                    bj bjVar5 = bj.n;
                    com.waze.ui.d.f fVar2 = new com.waze.ui.d.f(jVar2, h.a.i.i(new com.waze.ui.d.b(0, "token_0", new com.waze.ui.d.d(new au(bjVar3, R.drawable.icon_report_hazard_object_vector, R.string.REPORT_MENU_V2_HAZARD_OBJECT_LABEL, bjVar3)), 5), new com.waze.ui.d.b(1, "token_1", new com.waze.ui.d.d(new au(bjVar4, R.drawable.icon_report_hazard_construction_vector, R.string.REPORT_MENU_V2_HAZARD_CONSTRUCTION_LABEL, bjVar4)), 5), new com.waze.ui.d.b(2, "token_2", new com.waze.ui.d.d(new au(bjVar5, R.drawable.icon_report_hazard_vehicle_stopped_vector, R.string.REPORT_MENU_V2_HAZARD_VEHICLE_STOPPED_LABEL, bjVar5)), 5)));
                    Instant instantNow2 = Instant.now();
                    h.g.b.x.e(instantNow2, "now(...)");
                    com.waze.ui.d.t tVar3 = new com.waze.ui.d.t(fVar2, instantNow2, h.o.c.i(7, h.o.d.f48273d));
                    Object objRememberedValue3 = composer7.rememberedValue();
                    if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(tVar3, null, 2, null);
                        composer7.updateRememberedValue(objRememberedValue3);
                    }
                    com.waze.ui.d.t tVar4 = (com.waze.ui.d.t) ((MutableState) objRememberedValue3).getValue();
                    Object objRememberedValue4 = composer7.rememberedValue();
                    if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                        objRememberedValue4 = new com.waze.ui.b.r(3);
                        composer7.updateRememberedValue(objRememberedValue4);
                    }
                    com.waze.ui.d.s.f(tVar4, (h.g.a.l) objRememberedValue4, null, composer7, 48, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                break;
            case 12:
                Composer composer8 = (Composer) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                int i25 = iIntValue8 & 3;
                int i26 = iIntValue8 & 1;
                int i27 = com.waze.ui.f.b.f42288a;
                if (composer8.shouldExecute(i25 != 2, i26)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1170050119, iIntValue8, -1, "com.waze.ui.conversation.ComposableSingletons$ConversationLayoutKt.lambda$1170050119.<anonymous> (ConversationLayout.kt:244)");
                    }
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Modifier.Companion, ScrollKt.rememberScrollState(0, composer8, 0, 1), false, null, false, 14, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m2440spacedBy0680j_4(10.0f), Alignment.Companion.getStart(), composer8, 6);
                    int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer8, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer8.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer8, modifierVerticalScroll$default);
                    h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    if (!(composer8.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer8.startReusableNode();
                    if (composer8.getInserting()) {
                        composer8.createNode(constructor);
                    } else {
                        composer8.useNode();
                    }
                    Updater.m7351setimpl(composer8, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m7351setimpl(composer8, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Updater.m7351setimpl(composer8, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
                    Updater.m7349reconcileimpl(composer8, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                    Updater.m7351setimpl(composer8, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    com.waze.ui.e.w.c(ad.f42276a, null, null, null, composer8, 6, 14);
                    com.waze.ui.e.w.c(new ae(null), null, null, null, composer8, 0, 14);
                    com.waze.ui.e.w.c(ah.f42280a, null, null, null, composer8, 6, 14);
                    com.waze.ui.e.w.c(new ai("Agent Speaking Text"), null, null, null, composer8, 0, 14);
                    com.waze.ui.e.w.c(new ac("Hint Message"), null, null, null, composer8, 0, 14);
                    com.waze.ui.e.w.c(new aj("Success Message"), null, null, null, composer8, 0, 14);
                    com.waze.ui.e.w.c(new ag(com.waze.ui.f.y.f42315a), null, null, null, composer8, 0, 14);
                    com.waze.ui.e.w.c(new ab(com.waze.ui.f.p.f42309a), null, null, null, composer8, 0, 14);
                    composer8.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                break;
            case 13:
                Composer composer9 = (Composer) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                int i28 = iIntValue9 & 3;
                int i29 = iIntValue9 & 1;
                int i30 = com.waze.ui.m.m.f43018a;
                if (composer9.shouldExecute(i28 != 2, i29)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-621835064, iIntValue9, -1, "com.waze.ui.location_preview.ComposableSingletons$LocationPreviewDialogsKt.lambda$-621835064.<anonymous> (LocationPreviewDialogs.kt:93)");
                    }
                    IconKt.m4110Iconww6aTOc(PainterResources_androidKt.painterResource(com.waze.design_components.b.d.ae.b(), composer9, 0), (String) null, (Modifier) null, com.waze.bz.a.d(composer9, 0).o(), composer9, Painter.$stable | 48, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                break;
            case 14:
                Composer composer10 = (Composer) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                int i31 = iIntValue10 & 3;
                int i32 = iIntValue10 & 1;
                int i33 = com.waze.ui.m.m.f43018a;
                if (composer10.shouldExecute(i31 != 2, i32)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(624280535, iIntValue10, -1, "com.waze.ui.location_preview.ComposableSingletons$LocationPreviewDialogsKt.lambda$624280535.<anonymous> (LocationPreviewDialogs.kt:136)");
                    }
                    com.waze.ui.ac.m mVar = new com.waze.ui.ac.m("Give it a name");
                    Object objRememberedValue5 = composer10.rememberedValue();
                    if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                        objRememberedValue5 = new com.waze.ui.b.r(9);
                        composer10.updateRememberedValue(objRememberedValue5);
                    }
                    h.g.a.l lVar = (h.g.a.l) objRememberedValue5;
                    Object objRememberedValue6 = composer10.rememberedValue();
                    if (objRememberedValue6 == Composer.Companion.getEmpty()) {
                        objRememberedValue6 = new b(12);
                        composer10.updateRememberedValue(objRememberedValue6);
                    }
                    h.g.a.a aVar = (h.g.a.a) objRememberedValue6;
                    Object objRememberedValue7 = composer10.rememberedValue();
                    if (objRememberedValue7 == Composer.Companion.getEmpty()) {
                        objRememberedValue7 = new b(13);
                        composer10.updateRememberedValue(objRememberedValue7);
                    }
                    h.g.a.a aVar2 = (h.g.a.a) objRememberedValue7;
                    Object objRememberedValue8 = composer10.rememberedValue();
                    if (objRememberedValue8 == Composer.Companion.getEmpty()) {
                        objRememberedValue8 = new b(14);
                        composer10.updateRememberedValue(objRememberedValue8);
                    }
                    dc.P(new com.waze.ui.m.ad(mVar, "הבית של פיסטוק", true, true, lVar, aVar, aVar2, (h.g.a.a) objRememberedValue8), composer10, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                break;
            case 15:
                Composer composer11 = (Composer) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                int i34 = iIntValue11 & 3;
                int i35 = iIntValue11 & 1;
                int i36 = com.waze.ui.m.m.f43018a;
                if (composer11.shouldExecute(i34 != 2, i35)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1250024919, iIntValue11, -1, "com.waze.ui.location_preview.ComposableSingletons$LocationPreviewDialogsKt.lambda$-1250024919.<anonymous> (LocationPreviewDialogs.kt:155)");
                    }
                    com.waze.ui.ac.m mVar2 = new com.waze.ui.ac.m("Dialog Title!");
                    com.waze.z.a.c.b bVar = new com.waze.z.a.c.b(new com.waze.z.a.c.d("OK", com.waze.z.a.b.n.e(null, null, null, 7), false, null, 12));
                    Object objRememberedValue9 = composer11.rememberedValue();
                    if (objRememberedValue9 == Composer.Companion.getEmpty()) {
                        objRememberedValue9 = new com.waze.z.a.c.g() { // from class: com.waze.ui.m.l
                            @Override // h.g.a.p
                            public final Object invoke(Object obj3, Object obj4) {
                                if (i2 != 0) {
                                    int i37 = m.f43018a;
                                    h.g.b.x.f((com.waze.z.a.c.c) obj3, "<unused var>");
                                    h.g.b.x.f((com.waze.z.a.c.d) obj4, "<unused var>");
                                    return h.ab.f48028a;
                                }
                                int i38 = m.f43018a;
                                h.g.b.x.f((com.waze.z.a.c.c) obj3, "<unused var>");
                                h.g.b.x.f((com.waze.z.a.c.d) obj4, "<unused var>");
                                return h.ab.f48028a;
                            }
                        };
                        composer11.updateRememberedValue(objRememberedValue9);
                    }
                    dc.P(new com.waze.ui.m.ac(mVar2, new com.waze.ui.ac.m("This is the dialog text"), (com.waze.z.a.c.g) objRememberedValue9, bVar), composer11, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                break;
            case 16:
                Composer composer12 = (Composer) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                int i37 = iIntValue12 & 3;
                int i38 = iIntValue12 & 1;
                int i39 = com.waze.ui.m.m.f43018a;
                if (composer12.shouldExecute(i37 != 2, i38)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-994332523, iIntValue12, -1, "com.waze.ui.location_preview.ComposableSingletons$LocationPreviewDialogsKt.lambda$-994332523.<anonymous> (LocationPreviewDialogs.kt:171)");
                    }
                    com.waze.ui.ac.m mVar3 = new com.waze.ui.ac.m("Dialog Title!");
                    com.waze.z.a.c.a aVar3 = new com.waze.z.a.c.a(new com.waze.z.a.c.d("OK", com.waze.z.a.b.n.e(null, null, null, 7), false, null, 12), new com.waze.z.a.c.d("Cancel", com.waze.z.a.b.n.e(com.waze.design_components.button.g.f23359b, null, null, 6), false, null, 12));
                    Object objRememberedValue10 = composer12.rememberedValue();
                    if (objRememberedValue10 == Composer.Companion.getEmpty()) {
                        final int i40 = true ? 1 : 0;
                        objRememberedValue10 = new com.waze.z.a.c.g() { // from class: com.waze.ui.m.l
                            @Override // h.g.a.p
                            public final Object invoke(Object obj3, Object obj4) {
                                if (i40 != 0) {
                                    int i372 = m.f43018a;
                                    h.g.b.x.f((com.waze.z.a.c.c) obj3, "<unused var>");
                                    h.g.b.x.f((com.waze.z.a.c.d) obj4, "<unused var>");
                                    return h.ab.f48028a;
                                }
                                int i382 = m.f43018a;
                                h.g.b.x.f((com.waze.z.a.c.c) obj3, "<unused var>");
                                h.g.b.x.f((com.waze.z.a.c.d) obj4, "<unused var>");
                                return h.ab.f48028a;
                            }
                        };
                        composer12.updateRememberedValue(objRememberedValue10);
                    }
                    dc.P(new com.waze.ui.m.ac(mVar3, new com.waze.ui.ac.m("This is the dialog text"), (com.waze.z.a.c.g) objRememberedValue10, aVar3), composer12, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                break;
            case 17:
                Composer composer13 = (Composer) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                int i41 = iIntValue13 & 3;
                int i42 = iIntValue13 & 1;
                int i43 = com.waze.ui.m.n.f43020a;
                if (composer13.shouldExecute(i41 != 2, i42)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-441528995, iIntValue13, -1, "com.waze.ui.location_preview.ComposableSingletons$LocationPreviewHeaderKt.lambda$-441528995.<anonymous> (LocationPreviewHeader.kt:223)");
                    }
                    BoxKt.Box(BackgroundKt.m1972backgroundbw27NRU$default(Modifier.Companion, com.waze.bz.a.d(composer13, 0).h(), null, 2, null), composer13, 0);
                    ci ciVarH = ci.h(com.waze.ui.ai.i().j(), null, true, 119);
                    Object objRememberedValue11 = composer13.rememberedValue();
                    if (objRememberedValue11 == Composer.Companion.getEmpty()) {
                        objRememberedValue11 = new b(16);
                        composer13.updateRememberedValue(objRememberedValue11);
                    }
                    h.g.a.a aVar4 = (h.g.a.a) objRememberedValue11;
                    Object objRememberedValue12 = composer13.rememberedValue();
                    if (objRememberedValue12 == Composer.Companion.getEmpty()) {
                        objRememberedValue12 = new com.waze.ui.b.r(10);
                        composer13.updateRememberedValue(objRememberedValue12);
                    }
                    h.g.a.l lVar2 = (h.g.a.l) objRememberedValue12;
                    Object objRememberedValue13 = composer13.rememberedValue();
                    if (objRememberedValue13 == Composer.Companion.getEmpty()) {
                        objRememberedValue13 = new com.waze.ui.b.r(11);
                        composer13.updateRememberedValue(objRememberedValue13);
                    }
                    dc.D(ciVarH, aVar4, lVar2, (h.g.a.l) objRememberedValue13, composer13, DisplayStrings.DS_REPORTING_AGENT_CAR_PLAY_IDLE_TITLE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                break;
            case 18:
                Composer composer14 = (Composer) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                int i44 = iIntValue14 & 3;
                int i45 = iIntValue14 & 1;
                int i46 = com.waze.ui.m.n.f43020a;
                if (composer14.shouldExecute(i44 != 2, i45)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(251715182, iIntValue14, -1, "com.waze.ui.location_preview.ComposableSingletons$LocationPreviewHeaderKt.lambda$251715182.<anonymous> (LocationPreviewHeader.kt:232)");
                    }
                    BoxKt.Box(BackgroundKt.m1972backgroundbw27NRU$default(Modifier.Companion, com.waze.bz.a.d(composer14, 0).h(), null, 2, null), composer14, 0);
                    ci ciVarH2 = ci.h(com.waze.ui.ai.i().j(), "Very long title that needs at least two lines", false, 126);
                    Object objRememberedValue14 = composer14.rememberedValue();
                    if (objRememberedValue14 == Composer.Companion.getEmpty()) {
                        objRememberedValue14 = new b(17);
                        composer14.updateRememberedValue(objRememberedValue14);
                    }
                    h.g.a.a aVar5 = (h.g.a.a) objRememberedValue14;
                    Object objRememberedValue15 = composer14.rememberedValue();
                    if (objRememberedValue15 == Composer.Companion.getEmpty()) {
                        objRememberedValue15 = new com.waze.ui.b.r(14);
                        composer14.updateRememberedValue(objRememberedValue15);
                    }
                    h.g.a.l lVar3 = (h.g.a.l) objRememberedValue15;
                    Object objRememberedValue16 = composer14.rememberedValue();
                    if (objRememberedValue16 == Composer.Companion.getEmpty()) {
                        objRememberedValue16 = new com.waze.ui.b.r(15);
                        composer14.updateRememberedValue(objRememberedValue16);
                    }
                    dc.D(ciVarH2, aVar5, lVar3, (h.g.a.l) objRememberedValue16, composer14, DisplayStrings.DS_REPORTING_AGENT_CAR_PLAY_IDLE_TITLE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                break;
            case 19:
                Composer composer15 = (Composer) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                int i47 = iIntValue15 & 3;
                int i48 = iIntValue15 & 1;
                int i49 = com.waze.ui.m.n.f43020a;
                if (composer15.shouldExecute(i47 != 2, i48)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1790437483, iIntValue15, -1, "com.waze.ui.location_preview.ComposableSingletons$LocationPreviewHeaderKt.lambda$1790437483.<anonymous> (LocationPreviewHeader.kt:245)");
                    }
                    BoxKt.Box(BackgroundKt.m1972backgroundbw27NRU$default(Modifier.Companion, com.waze.bz.a.d(composer15, 0).h(), null, 2, null), composer15, 0);
                    ci ciVarH3 = ci.h(com.waze.ui.ai.i().j(), "Very long title that needs at least two lines", false, 94);
                    Object objRememberedValue17 = composer15.rememberedValue();
                    if (objRememberedValue17 == Composer.Companion.getEmpty()) {
                        objRememberedValue17 = new b(15);
                        composer15.updateRememberedValue(objRememberedValue17);
                    }
                    h.g.a.a aVar6 = (h.g.a.a) objRememberedValue17;
                    Object objRememberedValue18 = composer15.rememberedValue();
                    if (objRememberedValue18 == Composer.Companion.getEmpty()) {
                        objRememberedValue18 = new com.waze.ui.b.r(12);
                        composer15.updateRememberedValue(objRememberedValue18);
                    }
                    h.g.a.l lVar4 = (h.g.a.l) objRememberedValue18;
                    Object objRememberedValue19 = composer15.rememberedValue();
                    if (objRememberedValue19 == Composer.Companion.getEmpty()) {
                        objRememberedValue19 = new com.waze.ui.b.r(13);
                        composer15.updateRememberedValue(objRememberedValue19);
                    }
                    dc.D(ciVarH3, aVar6, lVar4, (h.g.a.l) objRememberedValue19, composer15, DisplayStrings.DS_REPORTING_AGENT_CAR_PLAY_IDLE_TITLE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                break;
            default:
                Composer composer16 = (Composer) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                int i50 = iIntValue16 & 3;
                int i51 = iIntValue16 & 1;
                int i52 = com.waze.ui.o.a.f43112a;
                if (composer16.shouldExecute(i50 != 2, i51)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-256028019, iIntValue16, -1, "com.waze.ui.main_menu.ComposableSingletons$MainMenuHeaderKt.lambda$-256028019.<anonymous> (MainMenuHeader.kt:146)");
                    }
                    IconKt.m4110Iconww6aTOc(PainterResources_androidKt.painterResource(com.waze.design_components.b.d.n.c(com.waze.design_components.b.e.f23312a), composer16, 0), (String) null, (Modifier) null, com.waze.bz.a.d(composer16, 0).q(), composer16, Painter.$stable | 48, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer16.skipToGroupEnd();
                }
                break;
        }
        return h.ab.f48028a;
    }
}
