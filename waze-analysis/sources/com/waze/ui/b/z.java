package com.waze.ui.b;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.SwitchDefaults;
import androidx.compose.material.SwitchKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.media3.common.util.WavUtil;
import com.waze.R;
import com.waze.strings.DisplayStrings;
import com.waze.z.a.be;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f42115a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final List f42116b;

    /* renamed from: c, reason: collision with root package name */
    private static final List f42117c;

    /* renamed from: d, reason: collision with root package name */
    private static final bc f42118d;

    /* renamed from: e, reason: collision with root package name */
    private static final bc f42119e;

    static {
        List listI = h.a.i.i(new ao("66.67", new com.waze.ui.a.b(3)), new am("Area Name"), new am(null), ad.f42001a, ae.f42002a, af.f42003a, new ah("Area LP"), al.f42009a, new ai("pass"), aj.f42007a, ak.f42008a);
        f42116b = listI;
        List listAm = h.a.i.am(listI, 2);
        f42117c = listAm;
        ay ayVar = new ay(10L);
        bb bbVar = new bb(new ay(10L), new ay(1L));
        au auVar = new au(new r(0));
        ar arVar = new ar("10", com.waze.ui.ae.a.f41787a);
        h.o.c cVar = h.o.a.f48264a;
        as asVar = new as(2, h.o.c.i(3, h.o.d.f48274e), h.o.c.i(1, h.o.d.f48274e), false, new com.waze.ui.a.v(6));
        ba baVar = new ba(h.a.i.i(new com.waze.ui.b.a.l(0.0f, 0.1f, false, h.o.c.i(34, h.o.d.f48274e)), new com.waze.ui.b.a.l(0.3f, 0.88f, true, h.o.c.i(34, h.o.d.f48274e)), new com.waze.ui.b.a.l(0.92f, 0.93f, false, h.o.c.i(34, h.o.d.f48274e)), new com.waze.ui.b.a.l(0.94f, 0.95f, true, h.o.c.i(34, h.o.d.f48274e)), new com.waze.ui.b.a.l(0.95f, 1.0f, false, h.o.c.i(34, h.o.d.f48274e))), h.a.i.i(new com.waze.ui.b.a.c(0.01f, com.waze.ui.b.a.d.f41957a), new com.waze.ui.b.a.c(0.02f, com.waze.ui.b.a.d.m), new com.waze.ui.b.a.c(0.7f, com.waze.ui.b.a.d.f41958b), new com.waze.ui.b.a.c(0.75f, com.waze.ui.b.a.d.f41963g), new com.waze.ui.b.a.c(1.0f, com.waze.ui.b.a.d.f41965i)), null);
        baVar.a().setValue(true);
        bc bcVar = new bc("UUID", ayVar, "10:42", bbVar, auVar, arVar, "Via the Great East Road Long named street that need to be cut", listI, asVar, baVar, new aa(false));
        f42118d = bcVar;
        bc.l(bcVar, null, null, null, "Via Kingsroad", listAm, null, DisplayStrings.DS_PHOTO_PAGER_ADD_PHOTO);
        bc bcVarL = bc.l(bcVar, new ax(66L, 10L), "17:00", new bb(new ay(50L), new ax(1L, 50L)), "Via Kingsroad", h.a.i.h(), null, DisplayStrings.DS_SOUND_ACTIONS_SOUND_ON);
        f42119e = bcVarL;
        bc.l(bcVarL, null, null, null, null, h.a.i.h(), new as(3, h.o.c.i(3, h.o.d.f48274e), h.o.c.i(1, h.o.d.f48274e), true, new com.waze.ui.a.v(7)), DisplayStrings.DS_ENTERING_DANGER_ZONE_ON_NAV1);
    }

    public static /* synthetic */ h.ab a(int i2, AnimatedContentScope animatedContentScope, as asVar, Composer composer, int i3) {
        h.g.b.x.f(animatedContentScope, "$this$AnimatedContent");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(764963198, i3, -1, "com.waze.ui.alternate_routes.RouteCard.<anonymous>.<anonymous>.<anonymous> (RouteCard.kt:303)");
        }
        if (asVar == null) {
            composer.startReplaceGroup(-77817924);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-77817923);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
            DividerKt.m4060DivideroMI9zvI(PaddingKt.m2757paddingVpY3zN4$default(Modifier.Companion, 0.0f, 16.0f, 1, null), com.waze.bz.a.d(composer, 0).K(), 1.0f, 0.0f, composer, DisplayStrings.DS_DICTATION_BOTTOM_SHEET_SPEECH_TIMEOUT, 8);
            k(asVar, i2, composer, 0);
            composer.endNode();
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return h.ab.f48028a;
    }

    static final h.ab b(List list, ac acVar, FlowRowScope flowRowScope, Composer composer, int i2) {
        h.g.b.x.f(flowRowScope, "$this$FlowRow");
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(627645884, i2, -1, "com.waze.ui.alternate_routes.BadgesList.<anonymous> (RouteCard.kt:513)");
            }
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    h.a.i.p();
                }
                n((aq) obj, acVar, com.waze.ui.r.a.d.d.a(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 4.0f, 7, null), com.waze.ui.r.a.d.c.bv, Integer.valueOf(i3)), composer, 0);
                i3 = i4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    static final h.ab c(h.g.a.a aVar, final bc bcVar, final HapticFeedback hapticFeedback, final int i2, final h.g.a.a aVar2, h.g.a.l lVar, Composer composer, int i3) {
        int i4;
        String strB;
        int i5;
        int i6;
        if (composer.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-688795399, i3, -1, "com.waze.ui.alternate_routes.RouteCard.<anonymous> (RouteCard.kt:200)");
            }
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), PaddingKt.m2751PaddingValuesa9UjIt4(16.0f, 16.0f, 16.0f, 16.0f));
            boolean zChanged = composer.changed(aVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.shared_infra.q.h(aVar, 17);
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierJ = be.J(modifierPadding, false, null, (h.g.a.a) objRememberedValue, composer, 48, 14);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierJ);
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
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
            int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
            h.g.a.a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierM2828widthInVpY3zN4 = SizeKt.m2828widthInVpY3zN4(com.waze.ui.r.a.d.d.a(SizeKt.wrapContentHeight$default(Modifier.Companion, null, false, 3, null), com.waze.ui.r.a.d.c.aS, null), 104.0f, 184.0f);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int iB3 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierM2828widthInVpY3zN4);
            h.g.a.a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iB3), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            TextKt.m4275Text4IGK_g(j(bcVar.e(), composer), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer).e(), composer, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            bb bbVarG = bcVar.g();
            if (bbVarG == null) {
                composer.startReplaceGroup(793692855);
            } else {
                composer.startReplaceGroup(793692856);
                l(bbVarG, composer, 0);
            }
            composer.endReplaceGroup();
            composer.endNode();
            Modifier modifierA = com.waze.ui.r.a.d.d.a(SizeKt.wrapContentWidth$default(Modifier.Companion, null, false, 3, null), com.waze.ui.r.a.d.c.aM, null);
            com.waze.z.a.ar arVarE = com.waze.z.a.b.n.e(null, null, null, 7);
            com.waze.z.a.am amVarD = com.waze.z.a.b.n.d(com.waze.design_components.b.d.bu, 6);
            av avVarD = bcVar.d();
            if (ComposerKt.isTraceInProgress()) {
                i4 = -1;
                ComposerKt.traceEventStart(1085359284, 0, -1, "com.waze.ui.alternate_routes.evaluateString (RouteCard.kt:374)");
            } else {
                i4 = -1;
            }
            if (avVarD instanceof at) {
                composer.startReplaceGroup(-646777074);
                strB = com.waze.ui.r.a.c.c.b(R.string.ALT_ROUTES_V2_GO_BUTTON_LABEL, composer, 0);
                composer.endReplaceGroup();
            } else {
                if (!(avVarD instanceof au)) {
                    composer.startReplaceGroup(-646778631);
                    composer.endReplaceGroup();
                    throw new h.i();
                }
                composer.startReplaceGroup(-646773582);
                strB = com.waze.ui.r.a.c.c.b(R.string.ALT_ROUTES_V2_RESUME_BUTTON_LABEL, composer, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            boolean zChangedInstance = composer.changedInstance(hapticFeedback) | composer.changed(bcVar) | composer.changed(i2) | composer.changed(aVar2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new h.g.a.a() { // from class: com.waze.ui.b.u
                    @Override // h.g.a.a
                    public final Object invoke() {
                        int i7 = z.f42115a;
                        hapticFeedback.mo9034performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m9051getTextHandleMove5zf0vsI());
                        bcVar.d().a().invoke(Integer.valueOf(i2));
                        aVar2.invoke();
                        return h.ab.f48028a;
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            int i7 = i4;
            be.o((h.g.a.a) objRememberedValue2, modifierA, strB, amVarD, arVarE, null, false, false, composer, 48, 224);
            composer.endNode();
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer, 0);
            int iB4 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, companion);
            h.g.a.a<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iB4), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            TextKt.m4275Text4IGK_g(bcVar.h(), com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.aT, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer).g(), composer, 48, 0, 65532);
            TextKt.m4275Text4IGK_g(" • ", (Modifier) null, com.waze.bz.a.d(composer, 0).y(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer).g(), composer, 6, 0, 65530);
            composer.startReplaceGroup(1478851934);
            ar arVarB = bcVar.b();
            Modifier modifierA2 = com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.aU, null);
            String strB2 = arVarB.b();
            String strC = arVarB.c();
            com.waze.ui.ae.a aVarA = arVarB.a();
            h.g.b.x.f(aVarA, "<this>");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(453936678, 0, i7, "com.waze.ui.utils.evaluateString (DistanceUnit.kt:16)");
            }
            com.waze.ui.ae.a aVar3 = com.waze.ui.ae.a.f41787a;
            int iOrdinal = aVarA.ordinal();
            if (iOrdinal == 0) {
                i5 = 2;
                i6 = R.string.string_0x7f120fe8;
            } else if (iOrdinal != 1) {
                i5 = 2;
                if (iOrdinal == 2) {
                    i6 = R.string.string_0x7f121067;
                } else {
                    if (iOrdinal != 3) {
                        throw new h.i();
                    }
                    i6 = R.string.feet;
                }
            } else {
                i5 = 2;
                i6 = R.string.meters;
            }
            String strB3 = com.waze.ui.r.a.c.c.b(i6, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Object[] objArr = new Object[i5];
            objArr[0] = strC;
            objArr[1] = strB3;
            String str = String.format(strB2, Arrays.copyOf(objArr, i5));
            h.g.b.x.e(str, "format(...)");
            int i8 = i5;
            TextKt.m4275Text4IGK_g(str, modifierA2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer).g(), composer, 48, 0, 65532);
            Composer composer2 = composer;
            composer2.endReplaceGroup();
            composer2.endNode();
            SpacerKt.Spacer(SizeKt.m2808height3ABfNKs(Modifier.Companion, 4.0f), composer2, 6);
            String strJ = bcVar.j();
            if (strJ == null) {
                composer2.startReplaceGroup(800388593);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(800388594);
                TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.d(R.string.ALT_ROUTES_V2_VIA_FORMAT_PS, new Object[]{strJ}, composer2), com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.aV, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m11069getEllipsisgIe3tQ8(), true, 1, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer2).k(), composer, 48, DisplayStrings.DS_REPORTING_AGENT_CAR_PLAY_IDLE_TITLE, 51196);
                composer2 = composer;
                composer2.endReplaceGroup();
            }
            if (bcVar.k().isEmpty()) {
                composer2.startReplaceGroup(800971859);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(800811372);
                SpacerKt.Spacer(SizeKt.m2808height3ABfNKs(Modifier.Companion, 8.0f), composer2, 6);
                d(bcVar.k(), bcVar.a(), composer2, 0);
                composer2.endReplaceGroup();
            }
            ba baVarF = bcVar.f();
            if (baVarF == null) {
                composer2.startReplaceGroup(801028309);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(801028310);
                boolean zChanged2 = composer2.changed(baVarF.a());
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = baVarF.a();
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                if (((Boolean) ((MutableState) objRememberedValue3).getValue()).booleanValue()) {
                    composer2.startReplaceGroup(-1678940775);
                    Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 12.0f, 0.0f, 0.0f, 13, null);
                    List listD = baVarF.d();
                    List listC = baVarF.c();
                    com.waze.ui.b.a.c cVarB = baVarF.b();
                    h.g.b.x.f(listD, "trafficSegments");
                    h.g.b.x.f(listC, "routeEvents");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1136481335, 0, i7, "com.waze.ui.alternate_routes.timeline.rememberTimeLineComponentState (TimelineComponentState.kt:56)");
                    }
                    boolean zChanged3 = composer2.changed(listD) | composer2.changed(listC) | composer2.changed(cVarB);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                        objRememberedValue4 = new com.waze.reports_v2.presentation.a.ab(listD, listC, cVarB);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    com.waze.reports_v2.presentation.a.ab abVar = (com.waze.reports_v2.presentation.a.ab) objRememberedValue4;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    com.waze.ui.b.a.k.f(abVar, modifierM2759paddingqDBjuR0$default, composer2, 48);
                    boolean zChanged4 = composer2.changed(lVar) | composer2.changed(bcVar);
                    y yVarRememberedValue = composer2.rememberedValue();
                    if (zChanged4 || yVarRememberedValue == Composer.Companion.getEmpty()) {
                        yVarRememberedValue = new y(lVar, bcVar, null);
                        composer2.updateRememberedValue(yVarRememberedValue);
                    }
                    EffectsKt.LaunchedEffect((Object) true, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) yVarRememberedValue, composer2, 6);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-1678487183);
                    composer2.endReplaceGroup();
                }
                composer2.endReplaceGroup();
            }
            as asVarC = bcVar.c();
            Object objRememberedValue5 = composer2.rememberedValue();
            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = new r(i8);
                composer2.updateRememberedValue(objRememberedValue5);
            }
            AnimatedContentKt.AnimatedContent(asVarC, null, null, null, "hovToggleRow", (h.g.a.l) objRememberedValue5, ComposableLambdaKt.rememberComposableLambda(764963198, true, new h.g.a.r() { // from class: com.waze.ui.b.v
                @Override // h.g.a.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj4).intValue();
                    return z.a(i2, (AnimatedContentScope) obj, (as) obj2, (Composer) obj3, iIntValue);
                }
            }, composer2, 54), composer2, 1794048, 14);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    public static final void d(List list, ac acVar, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(list, "badges");
        h.g.b.x.f(acVar, "permitStringType");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-625570985);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(list) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(acVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-625570985, i3, -1, "com.waze.ui.alternate_routes.BadgesList (RouteCard.kt:508)");
            }
            FlowLayoutKt.FlowRow(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Arrangement.INSTANCE.m2440spacedBy0680j_4(4.0f), null, null, 0, 0, ComposableLambdaKt.rememberComposableLambda(627645884, true, new w(list, acVar, 0), composerStartRestartGroup, 54), composerStartRestartGroup, 1572918, 60);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.copilot.presentation.c(list, acVar, i2, 16, null));
        }
    }

    static final h.ab e(int i2, Modifier modifier, int i3, Composer composer) {
        m(i2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return h.ab.f48028a;
    }

    static final h.ab f(as asVar, int i2, int i3, Composer composer) {
        k(asVar, i2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return h.ab.f48028a;
    }

    static final h.ab g(aq aqVar, ac acVar, Modifier modifier, int i2, Composer composer) {
        n(aqVar, acVar, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    public static final void h(int i2, final bc bcVar, Modifier modifier, final h.g.a.a aVar, final h.g.a.a aVar2, h.g.a.l lVar, Composer composer, int i3) {
        final int i4;
        int i5;
        final h.g.a.l lVar2;
        Composer composer2;
        h.g.b.x.f(bcVar, "routeCardState");
        int i6 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-29152298);
        if (i6 == 0) {
            i4 = i2;
            i5 = (true != composerStartRestartGroup.changed(i4) ? 2 : 4) | i3;
        } else {
            i4 = i2;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != composerStartRestartGroup.changed(bcVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i5 |= true != composerStartRestartGroup.changed(modifier) ? 128 : 256;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i5 |= true != composerStartRestartGroup.changedInstance(aVar) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i5 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 8192 : 16384;
        }
        if ((196608 & i3) == 0) {
            lVar2 = lVar;
            i5 |= true != composerStartRestartGroup.changedInstance(lVar2) ? 65536 : 131072;
        } else {
            lVar2 = lVar;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-29152298, i5, -1, "com.waze.ui.alternate_routes.RouteCard (RouteCard.kt:187)");
            }
            final HapticFeedback hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
            long jH = com.waze.bz.a.d(composerStartRestartGroup, 0).h();
            RoundedCornerShape roundedCornerShapeM3086RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(20.0f);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(com.waze.ui.r.a.d.d.a(modifier, com.waze.ui.r.a.d.c.aN, null), 0.0f, 1, null);
            RoundedCornerShape roundedCornerShapeM3086RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(20.0f);
            h.g.b.x.f(modifierFillMaxWidth$default, "<this>");
            h.g.b.x.f(roundedCornerShapeM3086RoundedCornerShape0680j_42, "shape");
            composer2 = composerStartRestartGroup;
            CardKt.m4000CardFjzlyU(ShadowKt.m7823shadows4CzXII$default(modifierFillMaxWidth$default, 8.0f, roundedCornerShapeM3086RoundedCornerShape0680j_42, false, 0L, 0L, 28, null), roundedCornerShapeM3086RoundedCornerShape0680j_4, jH, 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(-688795399, true, new h.g.a.p() { // from class: com.waze.ui.b.x
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return z.c(aVar2, bcVar, hapticFeedback, i4, aVar, lVar2, (Composer) obj, iIntValue);
                }
            }, composerStartRestartGroup, 54), composer2, 1769472, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.c.e.v(i2, bcVar, modifier, aVar, aVar2, lVar, i3, 7));
        }
    }

    static final h.ab i(bb bbVar, int i2, Composer composer) {
        l(bbVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    public static final String j(az azVar, Composer composer) {
        String strD;
        h.g.b.x.f(azVar, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-540191022, 0, -1, "com.waze.ui.alternate_routes.evaluateString (RouteCard.kt:361)");
        }
        if (azVar instanceof aw) {
            composer.startReplaceGroup(567475029);
            strD = com.waze.ui.r.a.c.c.d(R.string.ALT_ROUTES_V2_DURATION_PD_HOURS, new Object[]{Long.valueOf(((aw) azVar).a())}, composer);
            composer.endReplaceGroup();
        } else if (azVar instanceof ax) {
            composer.startReplaceGroup(567479078);
            ax axVar = (ax) azVar;
            strD = com.waze.ui.r.a.c.c.d(R.string.ALT_ROUTES_V2_DURATION_PD_HOURS_PD_MINS, new Object[]{Long.valueOf(axVar.a()), Long.valueOf(axVar.b())}, composer);
            composer.endReplaceGroup();
        } else {
            if (!(azVar instanceof ay)) {
                composer.startReplaceGroup(567473283);
                composer.endReplaceGroup();
                throw new h.i();
            }
            composer.startReplaceGroup(567483478);
            strD = com.waze.ui.r.a.c.c.d(R.string.ALT_ROUTES_V2_DURATION_PD_MINS, new Object[]{Long.valueOf(((ay) azVar).a())}, composer);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strD;
    }

    private static final void k(as asVar, int i2, Composer composer, int i3) {
        int i4;
        Composer composer2;
        int i5;
        int i6;
        int i7 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1234074876);
        if (i7 == 0) {
            i4 = (true != composerStartRestartGroup.changed(asVar) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(i2) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1234074876, i4, -1, "com.waze.ui.alternate_routes.HovToggleRow (RouteCard.kt:319)");
            }
            HapticFeedback hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
            Modifier modifierA = com.waze.ui.r.a.d.d.a(SizeKt.m2808height3ABfNKs(Modifier.Companion, 30.0f), com.waze.ui.r.a.d.c.aQ, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 48);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
            h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            m(asVar.a(), com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.aR, null), composerStartRestartGroup, 48);
            if (h.o.a.c(asVar.b(), asVar.c()) >= 0) {
                composerStartRestartGroup.startReplaceGroup(-356702266);
                i5 = i4;
                i6 = 0;
                TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.d(true != asVar.e() ? R.string.ALT_ROUTES_V2_HOV_WILL_SAVE_TIME_PD : R.string.ALT_ROUTES_V2_HOV_DID_SAVE_TIME_PD, new Object[]{Long.valueOf(h.o.a.n(asVar.b()))}, composerStartRestartGroup), com.waze.ui.r.a.d.d.a(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 16.0f, 0.0f, 0.0f, 0.0f, 14, null), com.waze.ui.r.a.d.c.aO, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, TextStyle.m10559copyp1EtxEg$default(com.waze.bz.a.h(composerStartRestartGroup).k(), com.waze.bz.a.d(composerStartRestartGroup, 0).q(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), composerStartRestartGroup, 48, 0, 65532);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                i5 = i4;
                i6 = 0;
                composerStartRestartGroup.startReplaceGroup(-356214078);
                composerStartRestartGroup.endReplaceGroup();
            }
            SpacerKt.Spacer(RowScope.CC.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null), composerStartRestartGroup, i6);
            boolean zE = asVar.e();
            int i8 = (composerStartRestartGroup.changedInstance(hapticFeedback) ? 1 : 0) | ((i5 & 14) == 4 ? 1 : i6);
            if ((i5 & 112) == 32) {
                i6 = 1;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((i6 | i8) != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.bl.d.a.h(hapticFeedback, asVar, i2, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SwitchKt.Switch(zE, (h.g.a.l) objRememberedValue, com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.aP, null), false, null, com.waze.ui.r.a.d.d.d(SwitchDefaults.INSTANCE, composerStartRestartGroup, SwitchDefaults.$stable), composerStartRestartGroup, 384, 24);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new t(asVar, i2, i3, 1));
        }
    }

    private static final void l(final bb bbVar, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1008579748);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(bbVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1008579748, i3, -1, "com.waze.ui.alternate_routes.WaypointSplitDuration (RouteCard.kt:384)");
            }
            FlowLayoutKt.FlowRow(null, Arrangement.INSTANCE.getStart(), null, null, 0, 0, ComposableLambdaKt.rememberComposableLambda(-1535819319, true, new com.waze.main_screen.c.b.a(bbVar, 17), composerStartRestartGroup, 54), composerStartRestartGroup, 1572912, 61);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.ui.b.q
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return z.i(bbVar, i2, (Composer) obj);
                }
            });
        }
    }

    private static final void m(int i2, Modifier modifier, Composer composer, int i3) {
        int i4;
        int i5 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1808757030);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changed(i2) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1808757030, i4, -1, "com.waze.ui.alternate_routes.HOVBadge (RouteCard.kt:497)");
            }
            com.waze.design_components.g.b.e(com.waze.ui.r.a.c.c.d(R.string.ALT_ROUTES_V2_HOV_MIN_PASSENGERS_PD, new Object[]{Integer.valueOf(i2)}, composerStartRestartGroup), com.waze.z.a.c.f45822h, modifier, new com.waze.ui.ac.f(com.waze.design_components.b.d.v.c(com.waze.design_components.b.e.f23312a)), false, null, null, null, null, null, composerStartRestartGroup, ((i4 << 3) & DisplayStrings.DS_TAP_TO_VERIFY) | 48, 1008);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new t(i2, modifier, i3, 0));
        }
    }

    private static final void n(aq aqVar, ac acVar, Modifier modifier, Composer composer, int i2) {
        int i3;
        int i4;
        String strD;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1385505037);
        if (i5 == 0) {
            i3 = (true != composerStartRestartGroup.changed(aqVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(acVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1385505037, i3, -1, "com.waze.ui.alternate_routes.RouteBadge (RouteCard.kt:402)");
            }
            if (acVar.a()) {
                i4 = R.string.ROUTE_ALERT_NO_PREFIX_PS;
            } else if (acVar instanceof ab) {
                i4 = R.string.ROUTE_ALERT_AREA_PS;
            } else {
                if (!(acVar instanceof aa)) {
                    throw new h.i();
                }
                i4 = R.string.ROUTE_ALERT_PASS_REQUIRED_PS;
            }
            if (h.g.b.x.n(aqVar, ad.f42001a)) {
                int i6 = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) | 48;
                composerStartRestartGroup.startReplaceGroup(-944069968);
                com.waze.design_components.g.b.e(com.waze.ui.r.a.c.c.b(R.string.ROUTE_ALERT_INTERNATIONAL, composerStartRestartGroup, 0), com.waze.z.a.c.f45818d, modifier, null, false, null, null, null, null, null, composerStartRestartGroup, i6, 1016);
                composerStartRestartGroup.endReplaceGroup();
            } else if (h.g.b.x.n(aqVar, af.f42003a)) {
                int i7 = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) | 48;
                composerStartRestartGroup.startReplaceGroup(-943871816);
                com.waze.design_components.g.b.e(com.waze.ui.r.a.c.c.b(R.string.ROUTE_ALERT_FERRY, composerStartRestartGroup, 0), com.waze.z.a.c.f45818d, modifier, null, false, null, null, null, null, null, composerStartRestartGroup, i7, 1016);
                composerStartRestartGroup.endReplaceGroup();
            } else if (h.g.b.x.n(aqVar, aj.f42007a)) {
                int i8 = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) | 48;
                composerStartRestartGroup.startReplaceGroup(-943657358);
                com.waze.design_components.g.b.e(com.waze.ui.r.a.c.c.b(R.string.ROUTE_ALERT_PERSONAL_SAFETY, composerStartRestartGroup, 0), com.waze.z.a.c.f45818d, modifier, new com.waze.ui.ac.f(com.waze.design_components.b.d.cd.c(com.waze.design_components.b.e.f23312a)), false, null, null, null, null, null, composerStartRestartGroup, i8, 1008);
                composerStartRestartGroup.endReplaceGroup();
            } else if (h.g.b.x.n(aqVar, ak.f42008a)) {
                int i9 = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) | 48;
                composerStartRestartGroup.startReplaceGroup(-943224753);
                com.waze.design_components.g.b.e(com.waze.ui.r.a.c.c.b(R.string.ROUTE_ALERT_NO_PERSONAL_SAFETY, composerStartRestartGroup, 0), com.waze.z.a.c.f45819e, modifier, null, false, null, null, null, null, null, composerStartRestartGroup, i9, 1016);
                composerStartRestartGroup.endReplaceGroup();
            } else if (aqVar instanceof ah) {
                int i10 = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) | 48;
                composerStartRestartGroup.startReplaceGroup(-943004219);
                com.waze.design_components.g.b.e(com.waze.ui.r.a.c.c.b(R.string.ROUTE_ALERT_LICENSE_PLATE_RESTRICTED, composerStartRestartGroup, 0), com.waze.z.a.c.f45817c, modifier, null, false, null, null, null, null, null, composerStartRestartGroup, i10, 1016);
                composerStartRestartGroup.endReplaceGroup();
            } else if (aqVar instanceof ai) {
                int i11 = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) | 48;
                composerStartRestartGroup.startReplaceGroup(-942787560);
                com.waze.design_components.g.b.e(com.waze.ui.r.a.c.c.d(i4, new Object[]{((ai) aqVar).a()}, composerStartRestartGroup), com.waze.z.a.c.f45818d, modifier, null, false, null, null, null, null, null, composerStartRestartGroup, i11, 1016);
                composerStartRestartGroup.endReplaceGroup();
            } else if (h.g.b.x.n(aqVar, al.f42009a)) {
                int i12 = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) | 48;
                composerStartRestartGroup.startReplaceGroup(-942581720);
                com.waze.design_components.g.b.e(com.waze.ui.r.a.c.c.b(R.string.ROUTE_ALERT_PUBLIC_TRANSPORTATION, composerStartRestartGroup, 0), com.waze.z.a.c.f45817c, modifier, null, false, null, null, null, null, null, composerStartRestartGroup, i12, 1016);
                composerStartRestartGroup.endReplaceGroup();
            } else if (h.g.b.x.n(aqVar, ae.f42002a)) {
                int i13 = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) | 48;
                composerStartRestartGroup.startReplaceGroup(-942370734);
                com.waze.design_components.g.b.e(com.waze.ui.r.a.c.c.b(R.string.ROUTE_ALERT_DANGER_ZONE, composerStartRestartGroup, 0), com.waze.z.a.c.f45817c, modifier, null, false, null, null, null, null, null, composerStartRestartGroup, i13, 1016);
                composerStartRestartGroup.endReplaceGroup();
            } else if (aqVar instanceof am) {
                int i14 = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) | 48;
                composerStartRestartGroup.startReplaceGroup(-942159562);
                String strA = ((am) aqVar).a();
                if (strA == null) {
                    composerStartRestartGroup.startReplaceGroup(-942089472);
                    composerStartRestartGroup.endReplaceGroup();
                    strD = null;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-942089471);
                    strD = com.waze.ui.r.a.c.c.d(i4, new Object[]{strA}, composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (strD == null) {
                    composerStartRestartGroup.startReplaceGroup(-30387989);
                    strD = com.waze.ui.r.a.c.c.b(R.string.ROUTE_ALERT_RESTRICTED_AREA, composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-30390407);
                }
                composerStartRestartGroup.endReplaceGroup();
                com.waze.design_components.g.b.e(strD, com.waze.z.a.c.f45817c, modifier, null, false, null, null, null, null, null, composerStartRestartGroup, i14, 1016);
                composerStartRestartGroup.endReplaceGroup();
            } else if (aqVar instanceof an) {
                int i15 = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) | 48;
                composerStartRestartGroup.startReplaceGroup(-941863698);
                com.waze.design_components.g.b.e(com.waze.ui.r.a.c.c.b(R.string.ROUTE_ALERT_DYNAMIC_TOLL, composerStartRestartGroup, 0), com.waze.z.a.c.f45822h, modifier, null, false, null, null, null, null, ((an) aqVar).a(), composerStartRestartGroup, i15, 504);
                composerStartRestartGroup.endReplaceGroup();
            } else if (aqVar instanceof ao) {
                int i16 = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) | 48;
                composerStartRestartGroup.startReplaceGroup(-941618860);
                ao aoVar = (ao) aqVar;
                com.waze.design_components.g.b.e(com.waze.ui.r.a.c.c.d(R.string.ROUTE_ALERT_TOLL_BADGE_PS, new Object[]{aoVar.a()}, composerStartRestartGroup), com.waze.z.a.c.f45822h, modifier, null, false, null, null, null, null, aoVar.b(), composerStartRestartGroup, i16, 504);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(aqVar instanceof ag)) {
                    composerStartRestartGroup.startReplaceGroup(-30453213);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new h.i();
                }
                composerStartRestartGroup.startReplaceGroup(-941364691);
                m(((ag) aqVar).a(), modifier, composerStartRestartGroup, (i3 >> 3) & 112);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s(aqVar, acVar, modifier, i2, 0));
        }
    }
}
