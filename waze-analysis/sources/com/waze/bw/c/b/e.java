package com.waze.bw.c.b;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.waze.R;
import com.waze.ag;
import com.waze.av.b.ah;
import com.waze.b.u;
import com.waze.bw.b.b.h;
import com.waze.bw.c.a.j;
import com.waze.bw.c.c.am;
import com.waze.bw.c.d.bn;
import com.waze.bw.c.d.bo;
import com.waze.bw.c.d.cf;
import com.waze.bw.c.d.ct;
import com.waze.bw.c.d.cu;
import com.waze.bw.c.d.cv;
import com.waze.bw.c.d.cw;
import com.waze.bw.c.d.dj;
import com.waze.bw.c.d.f;
import com.waze.bw.c.d.v;
import com.waze.bw.c.d.w;
import com.waze.navigate.en;
import com.waze.network.b.al;
import com.waze.network.z;
import com.waze.sharedui.e.g;
import com.waze.sound.df;
import com.waze.sound.hn;
import com.waze.sound.jr;
import com.waze.stats.ax;
import com.waze.strings.DisplayStrings;
import com.waze.tide.r;
import com.waze.tide.t;
import com.waze.tide.y;
import com.waze.z.a.b.ad;
import com.waze.z.a.be;
import com.waze.z.a.d.ai;
import com.waze.z.a.s;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class e implements p {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f17766a;

    public /* synthetic */ e(int i2) {
        this.f17766a = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = 3;
        int i3 = 2;
        int i4 = 0;
        switch (this.f17766a) {
            case 0:
                x.f((org.a.d.k.b) obj, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                return new d();
            case 1:
                org.a.d.k.b bVar = (org.a.d.k.b) obj;
                x.f(bVar, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i5 = ar.f48106a;
                return new b((ag) bVar.a(new m(ag.class), null, null));
            case 2:
                org.a.d.k.b bVar2 = (org.a.d.k.b) obj;
                x.f(bVar2, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i6 = ar.f48106a;
                j jVar = (j) bVar2.a(new m(j.class), null, null);
                ah ahVar = (ah) bVar2.a(new m(ah.class), null, null);
                u uVar = (u) bVar2.a(new m(u.class), null, null);
                com.waze.bw.c.a.c cVar = (com.waze.bw.c.a.c) bVar2.a(new m(com.waze.bw.c.a.c.class), null, null);
                a aVar = (a) bVar2.a(new m(a.class), null, null);
                c cVar2 = (c) bVar2.a(new m(c.class), null, null);
                com.waze.bn.b bVar3 = (com.waze.bn.b) bVar2.a(new m(com.waze.bn.b.class), null, null);
                jr jrVar = (jr) bVar2.a(new m(jr.class), null, null);
                hn hnVar = (hn) bVar2.a(new m(hn.class), null, null);
                g gVar = (g) bVar2.a(new m(g.class), null, null);
                com.waze.shared_infra.q.e eVar = (com.waze.shared_infra.q.e) bVar2.a(new m(com.waze.shared_infra.q.e.class), null, null);
                com.waze.bw.b.a.p pVar = (com.waze.bw.b.a.p) bVar2.a(new m(com.waze.bw.b.a.p.class), null, null);
                en enVar = (en) bVar2.a(new m(en.class), null, null);
                z zVar = (z) bVar2.a(new m(z.class), null, null);
                al alVar = (al) bVar2.a(new m(al.class), null, null);
                h hVar = (h) bVar2.a(new m(h.class), null, null);
                com.waze.br.c.e eVar2 = (com.waze.br.c.e) bVar2.a(new m(com.waze.br.c.e.class), null, null);
                com.waze.br.b.p pVar2 = (com.waze.br.b.p) bVar2.a(new m(com.waze.br.b.p.class), null, null);
                com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("StartStateMobileStateHolder");
                x.e(eVarD, "create(...)");
                return new am(jVar, ahVar, uVar, cVar, aVar, cVar2, bVar3, jrVar, hnVar, gVar, pVar, enVar, eVar, zVar, alVar, eVarD, hVar, eVar2, pVar2);
            case 3:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i7 = iIntValue & 1;
                boolean z = (iIntValue & 3) != 2;
                int i8 = com.waze.bw.c.d.b.f17977a;
                if (composer.shouldExecute(z, i7)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(656350355, iIntValue, -1, "com.waze.startstate.mobile.ui.ComposableSingletons$FavoritesCarouselKt.lambda$656350355.<anonymous> (FavoritesCarousel.kt:267)");
                    }
                    Modifier modifierM1972backgroundbw27NRU$default = BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), com.waze.bz.a.d(composer, 0).h(), null, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
                    Updater.m7351setimpl(composer, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Updater.m7351setimpl(composer, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
                    Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                    Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    bo boVar = new bo(true, false, true, false, i.i(new bn(1L, "Parents"), new bn(1L, "Gym"), new bn(1L, "Center"), new bn(1L, "Grandma")));
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new df(20);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    v.A(boVar, (l) objRememberedValue, composer, 54);
                    bo boVar2 = new bo(true, false, true, false, i.i(new bn(1L, "Parents"), new bn(1L, "Gym"), new bn(1L, "Center"), new bn(1L, "Grandma")));
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new com.waze.bw.c.d.a(z ? 1 : 0);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    v.A(boVar2, (l) objRememberedValue2, composer, 54);
                    bo boVar3 = new bo(true, false, true, false, i.h());
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = new com.waze.bw.c.d.a(i4);
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    v.A(boVar3, (l) objRememberedValue3, composer, 48);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return ab.f48028a;
            case 4:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i9 = iIntValue2 & 3;
                int i10 = iIntValue2 & 1;
                int i11 = com.waze.bw.c.d.c.f18008a;
                if (composer2.shouldExecute(i9 != 2, i10)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(227851546, iIntValue2, -1, "com.waze.startstate.mobile.ui.ComposableSingletons$RecentDriveCellKt.lambda$227851546.<anonymous> (RecentDriveCell.kt:32)");
                    }
                    be.d(com.waze.design_components.b.d.H.b(), SizeKt.m2822size3ABfNKs(Modifier.Companion, 24.0f), s.g(s.f46181a, null, ColorFilter.Companion.m8269tintxETnrds$default(ColorFilter.Companion, com.waze.bz.a.d(composer2, 0).o(), 0, 2, null), null, 47), composer2, 48, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return ab.f48028a;
            case 5:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i12 = iIntValue3 & 3;
                int i13 = iIntValue3 & 1;
                int i14 = com.waze.bw.c.d.c.f18008a;
                if (composer3.shouldExecute(i12 != 2, i13)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1854562591, iIntValue3, -1, "com.waze.startstate.mobile.ui.ComposableSingletons$RecentDriveCellKt.lambda$1854562591.<anonymous> (RecentDriveCell.kt:67)");
                    }
                    Modifier modifierM1972backgroundbw27NRU$default2 = BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), com.waze.bz.a.d(composer3, 0).h(), null, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer3, 0);
                    int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM1972backgroundbw27NRU$default2);
                    h.g.a.a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Updater.m7351setimpl(composer3, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m7351setimpl(composer3, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Updater.m7351setimpl(composer3, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
                    Updater.m7349reconcileimpl(composer3, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                    Updater.m7351setimpl(composer3, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    cv cvVar = new cv(new cu(1, "USA", "New York City", "Bleecker", "177A", "NY", null, new dj("Sanctum Sanctorom")), null);
                    Object objRememberedValue4 = composer3.rememberedValue();
                    if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                        objRememberedValue4 = new com.waze.sound.en(9);
                        composer3.updateRememberedValue(objRememberedValue4);
                    }
                    h.g.a.a aVar2 = (h.g.a.a) objRememberedValue4;
                    Object objRememberedValue5 = composer3.rememberedValue();
                    if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                        objRememberedValue5 = new com.waze.sound.en(10);
                        composer3.updateRememberedValue(objRememberedValue5);
                    }
                    v.x(cvVar, null, aVar2, (h.g.a.a) objRememberedValue5, composer3, DisplayStrings.DS_CATEGORY_SEARCH_AMENITIES_FILTER_CHARGING_STATION, 2);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return ab.f48028a;
            case 6:
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i15 = iIntValue4 & 3;
                int i16 = iIntValue4 & 1;
                int i17 = com.waze.bw.c.d.e.f18097a;
                if (composer4.shouldExecute(i15 != 2, i16)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1412901339, iIntValue4, -1, "com.waze.startstate.mobile.ui.ComposableSingletons$SearchHeaderKt.lambda$-1412901339.<anonymous> (SearchHeader.kt:107)");
                    }
                    IconKt.m4110Iconww6aTOc(PainterResources_androidKt.painterResource(com.waze.design_components.b.d.aj.b(), composer4, 0), (String) null, SizeKt.m2822size3ABfNKs(Modifier.Companion, 26.0f), com.waze.bz.a.d(composer4, 0).C(), composer4, Painter.$stable | DisplayStrings.DS_DIRT_ROADS, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return ab.f48028a;
            case 7:
                Composer composer5 = (Composer) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i18 = iIntValue5 & 3;
                int i19 = iIntValue5 & 1;
                int i20 = f.f18109a;
                if (composer5.shouldExecute(i18 != 2, i19)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-61247966, iIntValue5, -1, "com.waze.startstate.mobile.ui.ComposableSingletons$StartStateSheetContentKt.lambda$-61247966.<anonymous> (StartStateSheetContent.kt:568)");
                    }
                    be.e(new com.waze.ui.ac.f(com.waze.design_components.b.d.S.b()), SizeKt.m2822size3ABfNKs(Modifier.Companion, 24.0f), s.g(s.f46181a, null, ColorFilter.Companion.m8269tintxETnrds$default(ColorFilter.Companion, com.waze.bz.a.d(composer5, 0).o(), 0, 2, null), null, 47), null, null, composer5, 48, 24);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return ab.f48028a;
            case 8:
                Composer composer6 = (Composer) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i21 = iIntValue6 & 3;
                int i22 = iIntValue6 & 1;
                int i23 = f.f18109a;
                if (composer6.shouldExecute(i21 != 2, i22)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-795894422, iIntValue6, -1, "com.waze.startstate.mobile.ui.ComposableSingletons$StartStateSheetContentKt.lambda$-795894422.<anonymous> (StartStateSheetContent.kt:604)");
                    }
                    be.e(new com.waze.ui.ac.f(com.waze.design_components.b.d.ab.b()), SizeKt.m2822size3ABfNKs(Modifier.Companion, 24.0f), s.g(s.f46181a, null, ColorFilter.Companion.m8269tintxETnrds$default(ColorFilter.Companion, com.waze.bz.a.d(composer6, 0).o(), 0, 2, null), null, 47), null, null, composer6, 48, 24);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return ab.f48028a;
            case 9:
                Composer composer7 = (Composer) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i24 = iIntValue7 & 3;
                int i25 = iIntValue7 & 1;
                int i26 = f.f18109a;
                if (composer7.shouldExecute(i24 != 2, i25)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(924375581, iIntValue7, -1, "com.waze.startstate.mobile.ui.ComposableSingletons$StartStateSheetContentKt.lambda$924375581.<anonymous> (StartStateSheetContent.kt:659)");
                    }
                    Modifier modifierM1972backgroundbw27NRU$default3 = BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), com.waze.bz.a.d(composer7, 0).h(), null, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer7, 0);
                    int iB3 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = composer7.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer7, modifierM1972backgroundbw27NRU$default3);
                    h.g.a.a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                    if (!(composer7.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer7.startReusableNode();
                    if (composer7.getInserting()) {
                        composer7.createNode(constructor3);
                    } else {
                        composer7.useNode();
                    }
                    Updater.m7351setimpl(composer7, measurePolicyColumnMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m7351setimpl(composer7, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Updater.m7351setimpl(composer7, Integer.valueOf(iB3), ComposeUiNode.Companion.getSetCompositeKeyHash());
                    Updater.m7349reconcileimpl(composer7, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                    Updater.m7351setimpl(composer7, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    int i27 = w.f18173a;
                    cf cfVarA = w.a();
                    com.waze.z.a.b.ab abVarP = ai.p(ad.f45734b, null, composer7, 6, 2);
                    Object objRememberedValue6 = composer7.rememberedValue();
                    if (objRememberedValue6 == Composer.Companion.getEmpty()) {
                        objRememberedValue6 = new com.waze.bw.c.d.a(i3);
                        composer7.updateRememberedValue(objRememberedValue6);
                    }
                    ct.c(cfVarA, abVarP, (l) objRememberedValue6, null, null, composer7, DisplayStrings.DS_DICTATION_BOTTOM_SHEET_SPEECH_TIMEOUT, 24);
                    composer7.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return ab.f48028a;
            case 10:
                Composer composer8 = (Composer) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                int i28 = iIntValue8 & 3;
                int i29 = iIntValue8 & 1;
                int i30 = com.waze.bw.c.d.g.f18116a;
                if (composer8.shouldExecute(i28 != 2, i29)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(59291638, iIntValue8, -1, "com.waze.startstate.mobile.ui.ComposableSingletons$UpcomingDriveCellKt.lambda$59291638.<anonymous> (UpcomingDriveCell.kt:41)");
                    }
                    be.d(com.waze.design_components.b.d.ab.b(), SizeKt.m2822size3ABfNKs(Modifier.Companion, 24.0f), s.g(s.f46181a, null, ColorFilter.Companion.m8269tintxETnrds$default(ColorFilter.Companion, com.waze.bz.a.d(composer8, 0).o(), 0, 2, null), null, 47), composer8, 48, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return ab.f48028a;
            case 11:
                int iIntValue9 = ((Integer) obj).intValue();
                x.f((bn) obj2, "<unused var>");
                return "NAMED_CELL_KEY" + iIntValue9;
            case 12:
                int iIntValue10 = ((Integer) obj).intValue();
                int i31 = ct.f18062a;
                x.f((cw) obj2, "<unused var>");
                return "UPCOMING_ITEM_" + iIntValue10;
            case 13:
                int iIntValue11 = ((Integer) obj).intValue();
                int i32 = ct.f18062a;
                x.f((cv) obj2, "<unused var>");
                return "RECENT_ITEM_" + iIntValue11;
            case 14:
                Composer composer9 = (Composer) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                int i33 = iIntValue12 & 3;
                int i34 = iIntValue12 & 1;
                int i35 = com.waze.bw.c.d.a.a.f17872a;
                if (composer9.shouldExecute(i33 != 2, i34)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1768927891, iIntValue12, -1, "com.waze.startstate.mobile.ui.options.ComposableSingletons$StartStateOptionsMenuKt.lambda$1768927891.<anonymous> (StartStateOptionsMenu.kt:322)");
                    }
                    TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.NAME_THIS_FAVORITE_LOCATION, composer9, 0), (Modifier) null, com.waze.bz.a.d(composer9, 0).s(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composer9).l(), composer9, 0, 0, 65530);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return ab.f48028a;
            case 15:
                Composer composer10 = (Composer) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                int i36 = iIntValue13 & 3;
                int i37 = iIntValue13 & 1;
                int i38 = com.waze.bw.c.d.a.a.f17872a;
                if (composer10.shouldExecute(i36 != 2, i37)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1798947532, iIntValue13, -1, "com.waze.startstate.mobile.ui.options.ComposableSingletons$StartStateOptionsMenuKt.lambda$1798947532.<anonymous> (StartStateOptionsMenu.kt:339)");
                    }
                    IconKt.m4110Iconww6aTOc(PainterResources_androidKt.painterResource(com.waze.design_components.b.d.ae.b(), composer10, 0), (String) null, (Modifier) null, com.waze.bz.a.d(composer10, 0).o(), composer10, Painter.$stable | 48, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return ab.f48028a;
            case 16:
                Composer composer11 = (Composer) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                int i39 = iIntValue14 & 3;
                int i40 = iIntValue14 & 1;
                int i41 = com.waze.bw.c.d.a.a.f17872a;
                if (composer11.shouldExecute(i39 != 2, i40)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-415509804, iIntValue14, -1, "com.waze.startstate.mobile.ui.options.ComposableSingletons$StartStateOptionsMenuKt.lambda$-415509804.<anonymous> (StartStateOptionsMenu.kt:381)");
                    }
                    Modifier modifierM1972backgroundbw27NRU$default4 = BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), com.waze.bz.a.d(composer11, 0).h(), null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    int iB4 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer11, 0));
                    CompositionLocalMap currentCompositionLocalMap4 = composer11.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer11, modifierM1972backgroundbw27NRU$default4);
                    h.g.a.a<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
                    if (!(composer11.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer11.startReusableNode();
                    if (composer11.getInserting()) {
                        composer11.createNode(constructor4);
                    } else {
                        composer11.useNode();
                    }
                    Updater.m7351setimpl(composer11, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m7351setimpl(composer11, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Updater.m7351setimpl(composer11, Integer.valueOf(iB4), ComposeUiNode.Companion.getSetCompositeKeyHash());
                    Updater.m7349reconcileimpl(composer11, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                    Updater.m7351setimpl(composer11, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Object objRememberedValue7 = composer11.rememberedValue();
                    if (objRememberedValue7 == Composer.Companion.getEmpty()) {
                        objRememberedValue7 = new com.waze.sound.en(13);
                        composer11.updateRememberedValue(objRememberedValue7);
                    }
                    h.g.a.a aVar3 = (h.g.a.a) objRememberedValue7;
                    Object objRememberedValue8 = composer11.rememberedValue();
                    if (objRememberedValue8 == Composer.Companion.getEmpty()) {
                        objRememberedValue8 = new com.waze.bw.c.d.a(i2);
                        composer11.updateRememberedValue(objRememberedValue8);
                    }
                    com.waze.sharedui.profile.c.m(null, "Tel Aviv", aVar3, (l) objRememberedValue8, composer11, DisplayStrings.DS_REPORTING_AGENT_CAR_PLAY_IDLE_TITLE);
                    composer11.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return ab.f48028a;
            case 17:
                int i42 = r.f40957a;
                x.f((org.a.d.k.b) obj, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.tide.h();
            case 18:
                org.a.d.k.b bVar4 = (org.a.d.k.b) obj;
                int i43 = r.f40957a;
                x.f(bVar4, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i44 = ar.f48106a;
                return new y((ax) bVar4.a(new m(ax.class), null, null), (com.waze.shared_infra.q.e) bVar4.a(new m(com.waze.shared_infra.q.e.class), null, null));
            case 19:
                int i45 = r.f40957a;
                x.f((org.a.d.k.b) obj, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.tide.f(com.waze.shared_infra.l.b.e());
            default:
                int i46 = r.f40957a;
                x.f((org.a.d.k.b) obj, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                return new t();
        }
    }
}
