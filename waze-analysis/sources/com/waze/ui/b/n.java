package com.waze.ui.b;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.waze.R;
import com.waze.strings.DisplayStrings;
import com.waze.z.a.be;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f42077a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final RoundedCornerShape f42078b = RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(94.0f);

    public static /* synthetic */ h.ab a(o oVar, p pVar, AnimatedContentScope animatedContentScope, o oVar2, Composer composer, int i2) {
        h.g.b.x.f(animatedContentScope, "$this$AnimatedContent");
        h.g.b.x.f(oVar2, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-350776156, i2, -1, "com.waze.ui.alternate_routes.MapListSegmentedSwitch.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MapListSegmentedSwitch.kt:119)");
        }
        g(oVar2 == oVar, pVar, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return h.ab.f48028a;
    }

    static final h.ab b(Transition transition, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1595825286, i2, -1, "com.waze.ui.alternate_routes.MapListSegmentedSwitch.<anonymous> (MapListSegmentedSwitch.kt:103)");
            }
            Modifier modifierM2755padding3ABfNKs = PaddingKt.m2755padding3ABfNKs(Modifier.Companion, 8.0f);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer, 0);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM2755padding3ABfNKs);
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
            Updater.m7351setimpl(composer, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer.startReplaceGroup(1478527756);
            for (o oVar : o.a()) {
                Modifier modifierWidth = IntrinsicKt.width(IntrinsicKt.height(rowScopeInstance.align(Modifier.Companion, Alignment.Companion.getCenterVertically()), IntrinsicSize.Min), IntrinsicSize.Min);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierWidth);
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
                Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composer, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Updater.m7351setimpl(composer, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composer, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                boolean zChanged = composer.changed(pVar);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new com.waze.tide.a.c(pVar, 18);
                    composer.updateRememberedValue(objRememberedValue);
                }
                AnimatedContentKt.AnimatedContent(transition, null, (h.g.a.l) objRememberedValue, null, null, ComposableLambdaKt.rememberComposableLambda(-350776156, true, new com.waze.main_screen.l(oVar, pVar, 5, null), composer, 54), composer, 196608, 13);
                f(transition, oVar, pVar, composer, 0);
                composer.endNode();
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    static final h.ab c(Transition transition, o oVar, p pVar, int i2, Composer composer) {
        f(transition, oVar, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab d(boolean z, p pVar, int i2, Composer composer) {
        g(z, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    public static final void e(final p pVar, Modifier modifier, Composer composer, int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        boolean z;
        h.g.b.x.f(pVar, "state");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1903659709);
        if (i4 == 0) {
            i3 = i2 | (true != composerStartRestartGroup.changed(pVar) ? 2 : 4);
        } else {
            i3 = i2;
        }
        int i5 = i3 | 48;
        if (composerStartRestartGroup.shouldExecute((i5 & 19) != 18, i5 & 1)) {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1903659709, i5, -1, "com.waze.ui.alternate_routes.MapListSegmentedSwitch (MapListSegmentedSwitch.kt:81)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new MutableTransitionState(pVar.a());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableTransitionState mutableTransitionState = (MutableTransitionState) objRememberedValue;
            mutableTransitionState.setTargetState$animation_core(pVar.a());
            final Transition transitionRememberTransition = TransitionKt.rememberTransition(mutableTransitionState, "Switch Toggle Transition", composerStartRestartGroup, MutableTransitionState.$stable | 48, 0);
            RoundedCornerShape roundedCornerShape = f42078b;
            Modifier modifierM2808height3ABfNKs = SizeKt.m2808height3ABfNKs(companion, 50.0f);
            if (!transitionRememberTransition.isRunning() && pVar.h() && pVar.g()) {
                modifier3 = modifierM2808height3ABfNKs;
                z = true;
            } else {
                modifier3 = modifierM2808height3ABfNKs;
                z = false;
            }
            int i6 = i5 & 14;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (i6 == 4 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.shared_infra.q.h(pVar, 16);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            CardKt.m4000CardFjzlyU(com.waze.ui.r.a.d.d.a(be.J(modifier3, z, null, (h.g.a.a) objRememberedValue2, composerStartRestartGroup, 48, 12), com.waze.ui.r.a.d.c.aW, null), roundedCornerShape, com.waze.bz.a.d(composerStartRestartGroup, 0).h(), 0L, null, 4.0f, ComposableLambdaKt.rememberComposableLambda(-1595825286, true, new h.g.a.p() { // from class: com.waze.ui.b.j
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return n.b(transitionRememberTransition, pVar, (Composer) obj, iIntValue);
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1769520, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.copilot.presentation.c(pVar, modifier2, i2, 15, null));
        }
    }

    private static final void f(Transition transition, o oVar, p pVar, Composer composer, int i2) {
        int i3;
        long jR;
        Object currentState;
        int i4;
        long jR2;
        int i5;
        long jR3;
        int i6;
        com.waze.ui.r.a.d.c cVar;
        String strB;
        long jS;
        int i7 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-125604335);
        if (i7 == 0) {
            i3 = (true != composerStartRestartGroup.changed(transition) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(oVar.ordinal()) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(pVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-125604335, i3, -1, "com.waze.ui.alternate_routes.Segment (MapListSegmentedSwitch.kt:133)");
            }
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composerStartRestartGroup, 0);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            com.waze.copilot.presentation.a aVar = new com.waze.copilot.presentation.a(15);
            int i8 = (i3 & 14) | 384;
            o oVar2 = (o) transition.getTargetState();
            composerStartRestartGroup.startReplaceGroup(-863146265);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-863146265, 0, -1, "com.waze.ui.alternate_routes.Segment.<anonymous>.<anonymous> (MapListSegmentedSwitch.kt:140)");
            }
            if (oVar2 == oVar) {
                composerStartRestartGroup.startReplaceGroup(-554869579);
                jR = com.waze.bz.a.d(composerStartRestartGroup, 0).G();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-554867984);
                jR = com.waze.bz.a.d(composerStartRestartGroup, 0).r();
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            ColorSpace colorSpaceM8232getColorSpaceimpl = Color.m8232getColorSpaceimpl(jR);
            boolean zChanged = composerStartRestartGroup.changed(colorSpaceM8232getColorSpaceimpl);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpaceM8232getColorSpaceimpl);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int i9 = (i8 & 14) | DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS;
            int i10 = i9 & 14;
            int i11 = i10 ^ 6;
            TwoWayConverter twoWayConverter = (TwoWayConverter) objRememberedValue;
            if (transition.isSeeking()) {
                composerStartRestartGroup.startReplaceGroup(1666827533);
                composerStartRestartGroup.endReplaceGroup();
                currentState = transition.getCurrentState();
            } else {
                composerStartRestartGroup.startReplaceGroup(1666573488);
                boolean z = (i11 > 4 && composerStartRestartGroup.changed(transition)) || (i9 & 6) == 4;
                currentState = composerStartRestartGroup.rememberedValue();
                if (z || currentState == Composer.Companion.getEmpty()) {
                    Snapshot.Companion companion2 = Snapshot.Companion;
                    Snapshot currentThreadSnapshot = companion2.getCurrentThreadSnapshot();
                    h.g.a.l<Object, h.ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    Snapshot snapshotMakeCurrentNonObservable = companion2.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState2 = transition.getCurrentState();
                        companion2.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        composerStartRestartGroup.updateRememberedValue(currentState2);
                        currentState = currentState2;
                    } catch (Throwable th) {
                        companion2.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        throw th;
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            o oVar3 = (o) currentState;
            composerStartRestartGroup.startReplaceGroup(-863146265);
            if (ComposerKt.isTraceInProgress()) {
                i4 = 0;
                ComposerKt.traceEventStart(-863146265, 0, -1, "com.waze.ui.alternate_routes.Segment.<anonymous>.<anonymous> (MapListSegmentedSwitch.kt:140)");
            } else {
                i4 = 0;
            }
            if (oVar3 == oVar) {
                composerStartRestartGroup.startReplaceGroup(-554869579);
                jR2 = com.waze.bz.a.d(composerStartRestartGroup, i4).G();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-554867984);
                jR2 = com.waze.bz.a.d(composerStartRestartGroup, i4).r();
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Color colorM8218boximpl = Color.m8218boximpl(jR2);
            boolean z2 = (i11 > 4 && composerStartRestartGroup.changed(transition)) || (i9 & 6) == 4;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new l(transition));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            o oVar4 = (o) ((State) objRememberedValue2).getValue();
            composerStartRestartGroup.startReplaceGroup(-863146265);
            if (ComposerKt.isTraceInProgress()) {
                i5 = 0;
                ComposerKt.traceEventStart(-863146265, 0, -1, "com.waze.ui.alternate_routes.Segment.<anonymous>.<anonymous> (MapListSegmentedSwitch.kt:140)");
            } else {
                i5 = 0;
            }
            if (oVar4 == oVar) {
                composerStartRestartGroup.startReplaceGroup(-554869579);
                jR3 = com.waze.bz.a.d(composerStartRestartGroup, i5).G();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-554867984);
                jR3 = com.waze.bz.a.d(composerStartRestartGroup, i5).r();
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Color colorM8218boximpl2 = Color.m8218boximpl(jR3);
            boolean z3 = (i11 > 4 && composerStartRestartGroup.changed(transition)) || (i9 & 6) == 4;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.derivedStateOf(new m(transition));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transition, colorM8218boximpl, colorM8218boximpl2, (FiniteAnimationSpec) aVar.invoke(((State) objRememberedValue3).getValue(), composerStartRestartGroup, 0), twoWayConverter, "Text Color Animation", composerStartRestartGroup, i10 | 196608);
            Modifier modifierM2756paddingVpY3zN4 = PaddingKt.m2756paddingVpY3zN4(Modifier.Companion, 16.0f, 4.0f);
            o oVar5 = o.f42079a;
            int iOrdinal = oVar.ordinal();
            if (iOrdinal != 0) {
                i6 = 1;
                if (iOrdinal != 1) {
                    throw new h.i();
                }
                cVar = com.waze.ui.r.a.d.c.aY;
            } else {
                i6 = 1;
                cVar = com.waze.ui.r.a.d.c.aX;
            }
            Modifier modifierA = com.waze.ui.r.a.d.d.a(modifierM2756paddingVpY3zN4, cVar, null);
            int iOrdinal2 = oVar.ordinal();
            if (iOrdinal2 == 0) {
                composerStartRestartGroup.startReplaceGroup(1923317359);
                strB = com.waze.ui.r.a.c.c.b(R.string.ALT_ROUTES_V2_TOGGLE_TEXT_MAP, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (iOrdinal2 != i6) {
                    composerStartRestartGroup.startReplaceGroup(1923314953);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new h.i();
                }
                composerStartRestartGroup.startReplaceGroup(1923321360);
                strB = com.waze.ui.r.a.c.c.b(R.string.ALT_ROUTES_V2_TOGGLE_TEXT_LIST, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            String str = strB;
            if (pVar.h()) {
                composerStartRestartGroup.startReplaceGroup(-506464910);
                composerStartRestartGroup.endReplaceGroup();
                jS = ((Color) stateCreateTransitionAnimation.getValue()).m8238unboximpl();
            } else {
                composerStartRestartGroup.startReplaceGroup(-506431430);
                jS = com.waze.bz.a.d(composerStartRestartGroup, 0).s();
                composerStartRestartGroup.endReplaceGroup();
            }
            TextKt.m4275Text4IGK_g(str, modifierA, jS, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composerStartRestartGroup).h(), composerStartRestartGroup, 0, 0, 65528);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s(transition, oVar, pVar, i2, 1));
        }
    }

    private static final void g(final boolean z, final p pVar, Composer composer, final int i2) {
        int i3;
        long jU;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(114287918);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(z) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(pVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(114287918, i3, -1, "com.waze.ui.alternate_routes.Toggle (MapListSegmentedSwitch.kt:179)");
            }
            Modifier.Companion companion = Modifier.Companion;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1157570481);
                if (pVar.h()) {
                    composerStartRestartGroup.startReplaceGroup(-1157538241);
                    jU = com.waze.bz.a.d(composerStartRestartGroup, 0).L();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1157479496);
                    jU = com.waze.bz.a.d(composerStartRestartGroup, 0).k();
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1157404414);
                jU = com.waze.bz.a.d(composerStartRestartGroup, 0).U();
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(BackgroundKt.m1971backgroundbw27NRU(companion, jU, f42078b), 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composerStartRestartGroup, 0);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.ui.b.k
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return n.d(z, pVar, i2, (Composer) obj);
                }
            });
        }
    }
}
