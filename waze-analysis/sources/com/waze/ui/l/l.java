package com.waze.ui.l;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.waze.strings.DisplayStrings;
import com.waze.trip_overview.cl;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f42701a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final RoundedCornerShape f42702b = RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(40.0f);

    /* renamed from: c, reason: collision with root package name */
    private static final EnterTransition f42703c = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.slideInVertically(AnimationSpecKt.tween(DisplayStrings.DS_ROUTE_SETTINGS_AVOID_FERRIES_OPTION_TITLE, 100, EasingFunctionsKt.getEaseOutExpo()), new com.waze.ui.b.r(7)));

    /* renamed from: d, reason: collision with root package name */
    private static final ExitTransition f42704d = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.slideOutVertically$default(null, new com.waze.ui.b.r(8), 1, null)).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));

    /* renamed from: e, reason: collision with root package name */
    private static final EnterTransition f42705e = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(DisplayStrings.DS_NIGHT, 50, null, 4, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m1752scaleInL8ZKhE$default(AnimationSpecKt.tween(DisplayStrings.DS_NIGHT, 100, EasingFunctionsKt.getEaseOutExpo()), 0.0f, 0, 6, null));

    /* renamed from: f, reason: collision with root package name */
    private static final ExitTransition f42706f = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(DisplayStrings.DS_ROUTE_SETTINGS_AVOID_FERRIES_OPTION_TITLE, 0, null, 6, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m1754scaleOutL8ZKhE$default(AnimationSpecKt.tween$default(0, 0, null, 6, null), 0.0f, 0, 6, null));

    /* renamed from: g, reason: collision with root package name */
    private static final EnterTransition f42707g = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(DisplayStrings.DS_NIGHT, 50, null, 4, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m1752scaleInL8ZKhE$default(AnimationSpecKt.tween(DisplayStrings.DS_NIGHT, 100, EasingFunctionsKt.getEaseOutExpo()), 0.0f, 0, 6, null));

    /* renamed from: h, reason: collision with root package name */
    private static final ExitTransition f42708h = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(0, 0, null, 6, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m1754scaleOutL8ZKhE$default(AnimationSpecKt.tween$default(0, 0, null, 6, null), 0.0f, 0, 6, null));

    /* renamed from: i, reason: collision with root package name */
    private static final float f42709i = 48.0f;

    /* renamed from: j, reason: collision with root package name */
    private static final float f42710j = 48.0f;

    /* renamed from: k, reason: collision with root package name */
    private static final float f42711k = 9.0f;

    /* renamed from: l, reason: collision with root package name */
    private static final float f42712l = 12.0f;
    private static final float m = 8.0f;
    private static final float n = 64.0f;
    private static final float o = 180.0f;
    private static final float p = 96.0f;
    private static final float q = 48.0f;
    private static final float r = 64.0f;
    private static final float s = 64.0f;
    private static final float t = 180.0f;
    private static final float u = 64.0f;
    private static final float v = 72.0f;

    public static final float d() {
        return v;
    }

    public static final w e(ad adVar) {
        h.g.b.x.f(adVar, "<this>");
        if (adVar instanceof x) {
            return null;
        }
        if (adVar instanceof r) {
            return ((r) adVar).b();
        }
        if (adVar instanceof t) {
            return ((t) adVar).c();
        }
        if (adVar instanceof z) {
            return ((z) adVar).b();
        }
        if (adVar instanceof ab) {
            return ((ab) adVar).c();
        }
        if (adVar instanceof aa) {
            return ((aa) adVar).c();
        }
        throw new h.i();
    }

    public static /* synthetic */ h.ab f(ak akVar, Modifier modifier, Composer composer, int i2) {
        ad adVarB;
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1813444140, i2, -1, "com.waze.ui.insight.StagedAnimationInsightCard.<anonymous>.<anonymous>.<anonymous> (InsightCard.kt:130)");
            }
            if (akVar != null) {
                akVar.c().invoke();
            }
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getBottomCenter(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
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
            ad adVar = null;
            if (akVar != null && (adVarB = akVar.b()) != null && adVarB.e()) {
                adVar = adVarB;
            }
            if (adVar == null) {
                composer.startReplaceGroup(1025288467);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1025288468);
                q(Modifier.Companion, adVar, true, composer, DisplayStrings.DS_DICTATION_BOTTOM_SHEET_SPEECH_TIMEOUT);
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    static final h.ab g(ad adVar, ba baVar, h.g.a.a aVar, Composer composer, int i2) {
        Composer composer2;
        Modifier.Companion companionJ;
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2074053152, i2, -1, "com.waze.ui.insight.StagedAnimationInsightCard.<anonymous> (InsightCard.kt:176)");
            }
            if (adVar == null) {
                composer.startReplaceGroup(-717595400);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-717595399);
                composer.startReplaceGroup(-300240997);
                Modifier.Companion companion = Modifier.Companion;
                if (aVar == null) {
                    composer.startReplaceGroup(-1506149054);
                    composer.endReplaceGroup();
                    companionJ = null;
                    composer2 = composer;
                } else {
                    composer.startReplaceGroup(-1506149053);
                    Modifier modifierClip = ClipKt.clip(companion, f42702b);
                    boolean zChanged = composer.changed(aVar);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new com.waze.sharedrive.c.r(aVar, 14);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer2 = composer;
                    companionJ = com.waze.z.a.be.J(modifierClip, false, null, (h.g.a.a) objRememberedValue, composer2, 0, 15);
                    composer2.endReplaceGroup();
                }
                if (companionJ == null) {
                    companionJ = companion;
                }
                composer2.endReplaceGroup();
                boolean zChanged2 = composer2.changed(baVar);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new cl(baVar, 6);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                q(GraphicsLayerModifierKt.graphicsLayer(companionJ, (h.g.a.l) objRememberedValue2), adVar, false, composer2, 384);
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    public static final boolean h(ad adVar) {
        h.g.b.x.f(adVar, "<this>");
        boolean z = false;
        if (!(adVar instanceof x)) {
            if (adVar instanceof z) {
                return false;
            }
            z = true;
            if (!(adVar instanceof r) && !(adVar instanceof t) && !(adVar instanceof aa)) {
                if (adVar instanceof ab) {
                    return true;
                }
                throw new h.i();
            }
        }
        return z;
    }

    public static final boolean i(ad adVar) {
        h.g.b.x.f(adVar, "<this>");
        boolean z = false;
        if (!(adVar instanceof aa) && !(adVar instanceof x) && !(adVar instanceof z)) {
            if (adVar instanceof r) {
                return false;
            }
            z = true;
            if (!(adVar instanceof t)) {
                if (adVar instanceof ab) {
                    return true;
                }
                throw new h.i();
            }
        }
        return z;
    }

    public static final void j(ba baVar, Modifier modifier, Composer composer, int i2) {
        int i3;
        h.g.a.a aVarF;
        h.g.b.x.f(baVar, "stateSwitcher");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1729181555);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(baVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        int i5 = 3;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1729181555, i3, -1, "com.waze.ui.insight.InsightCard (InsightCard.kt:68)");
            }
            boolean zChanged = composerStartRestartGroup.changed(baVar.k());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                ad adVarK = baVar.k();
                if (adVarK instanceof r) {
                    aVarF = ((r) adVarK).c();
                } else if (adVarK instanceof z) {
                    aVarF = ((z) adVarK).f();
                } else {
                    if (!(adVarK instanceof x) && !(adVarK instanceof aa) && !(adVarK instanceof ab) && !(adVarK instanceof t) && adVarK != null) {
                        throw new h.i();
                    }
                    objRememberedValue = null;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                objRememberedValue = aVarF;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            s(modifier, baVar, (h.g.a.a) objRememberedValue, composerStartRestartGroup, ((i3 << 3) & 112) | ((i3 >> 3) & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.z.a.d.ad((Object) baVar, modifier, i2, i5));
        }
    }

    static final h.ab k(Modifier modifier, ad adVar, boolean z, int i2, Composer composer) {
        q(modifier, adVar, z, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab l(q qVar, boolean z, int i2, Composer composer) {
        r(qVar, z, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab m(Modifier modifier, ba baVar, h.g.a.a aVar, int i2, Composer composer) {
        s(modifier, baVar, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    private static final q o(ad adVar) {
        if ((adVar instanceof r) || (adVar instanceof x) || (adVar instanceof z)) {
            return null;
        }
        if (adVar instanceof aa) {
            return ((aa) adVar).b();
        }
        if (adVar instanceof t) {
            return ((t) adVar).b();
        }
        if (adVar instanceof ab) {
            return ((ab) adVar).b();
        }
        throw new h.i();
    }

    private static final String p(ad adVar) {
        if (adVar instanceof r) {
            return null;
        }
        if (adVar instanceof z) {
            return ((z) adVar).c();
        }
        if (adVar instanceof t) {
            return ((t) adVar).g();
        }
        if (adVar instanceof ab) {
            return ((ab) adVar).g();
        }
        if (adVar instanceof aa) {
            return ((aa) adVar).f();
        }
        if (adVar instanceof x) {
            return ((x) adVar).a();
        }
        throw new h.i();
    }

    private static final void q(final Modifier modifier, final ad adVar, final boolean z, Composer composer, final int i2) {
        int i3;
        Modifier modifierM2756paddingVpY3zN4;
        int i4;
        String str;
        String strF;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-849953145);
        if (i5 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(adVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-849953145, i3, -1, "com.waze.ui.insight.InsightCardContent (InsightCard.kt:200)");
            }
            boolean z2 = adVar instanceof r;
            if (z2) {
                float f2 = u;
                modifierM2756paddingVpY3zN4 = PaddingKt.m2756paddingVpY3zN4(SizeKt.m2809heightInVpY3zN4(modifier, f2, f2), 8.0f, 8.0f);
            } else if (adVar instanceof aa) {
                modifierM2756paddingVpY3zN4 = PaddingKt.m2756paddingVpY3zN4(SizeKt.fillMaxWidth$default(SizeKt.m2810heightInVpY3zN4$default(modifier, n, 0.0f, 2, null), 0.0f, 1, null), 16.0f, 8.0f);
            } else if (adVar instanceof z) {
                modifierM2756paddingVpY3zN4 = PaddingKt.m2756paddingVpY3zN4(SizeKt.m2829widthInVpY3zN4$default(SizeKt.m2808height3ABfNKs(modifier, n), 0.0f, o, 1, null), 16.0f, 8.0f);
            } else if ((adVar instanceof t) || (adVar instanceof ab)) {
                modifierM2756paddingVpY3zN4 = PaddingKt.m2756paddingVpY3zN4(SizeKt.fillMaxWidth$default(SizeKt.m2810heightInVpY3zN4$default(modifier, p, 0.0f, 2, null), 0.0f, 1, null), 16.0f, 16.0f);
            } else {
                if (!(adVar instanceof x)) {
                    throw new h.i();
                }
                modifierM2756paddingVpY3zN4 = PaddingKt.m2756paddingVpY3zN4(SizeKt.m2809heightInVpY3zN4(SizeKt.m2828widthInVpY3zN4(modifier, s, t), q, r), 16.0f, 8.0f);
            }
            boolean z3 = adVar instanceof x;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), z3 ? Alignment.Companion.getCenterHorizontally() : Alignment.Companion.getStart(), composerStartRestartGroup, 6);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2756paddingVpY3zN4);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 54);
            int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            h.g.a.a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            w wVarE = e(adVar);
            EnterTransition enterTransition = f42707g;
            ExitTransition exitTransition = f42708h;
            Modifier.Companion companion2 = Modifier.Companion;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Ref();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Ref ref = (Ref) objRememberedValue;
            ref.setValue(wVarE == null ? ref.getValue() : wVarE);
            AnimatedVisibilityKt.AnimatedVisibility(wVarE != null, companion2, enterTransition, exitTransition, (String) null, ComposableLambdaKt.rememberComposableLambda(-559889238, true, new i(ref, enterTransition, exitTransition), composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 16);
            if (p(adVar) == null || e(adVar) == null) {
                composerStartRestartGroup.startReplaceGroup(-1005152703);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1005207480);
                SpacerKt.Spacer(SizeKt.m2827width3ABfNKs(Modifier.Companion, 8.0f), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            Alignment.Horizontal start = Alignment.Companion.getStart();
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier.Companion companionWeight$default = o(adVar) != null ? RowScope.CC.weight$default(rowScopeInstance, companion3, 1.0f, false, 2, null) : companion3;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(top, start, composerStartRestartGroup, 54);
            int iB3 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companionWeight$default);
            h.g.a.a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB3), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            com.waze.ui.r.a.e.c.b bVarH = com.waze.bz.a.h(composerStartRestartGroup);
            int i6 = i3 & 112;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (i6 == 32 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (i(adVar) && o(adVar) == null) ? bVarH.f() : (!i(adVar) || o(adVar) == null) ? bVarH.h() : bVarH.g();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            TextStyle textStyle = (TextStyle) objRememberedValue2;
            String strP = p(adVar);
            if (strP == null) {
                strP = "";
            }
            String str2 = strP;
            if (z2 || z3 || (adVar instanceof z)) {
                i4 = 2;
            } else {
                if (!(adVar instanceof t) && !(adVar instanceof aa) && !(adVar instanceof ab)) {
                    throw new h.i();
                }
                i4 = 3;
            }
            int iM11069getEllipsisgIe3tQ8 = TextOverflow.Companion.m11069getEllipsisgIe3tQ8();
            boolean z4 = adVar instanceof z;
            int iM11011getCentere0LSkKk = (z4 || z3) ? TextAlign.Companion.m11011getCentere0LSkKk() : TextAlign.Companion.m11016getStarte0LSkKk();
            boolean z5 = false;
            TextKt.m4275Text4IGK_g(str2, com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.cA, null), com.waze.bz.a.d(composerStartRestartGroup, 0).o(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m11004boximpl(iM11011getCentere0LSkKk), 0L, iM11069getEllipsisgIe3tQ8, false, i4, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, textStyle, composerStartRestartGroup, 48, 48, 54776);
            composerStartRestartGroup = composerStartRestartGroup;
            if (z2 || z4 || z3 || (adVar instanceof aa)) {
                str = null;
            } else {
                if (adVar instanceof t) {
                    strF = ((t) adVar).f();
                } else {
                    if (!(adVar instanceof ab)) {
                        throw new h.i();
                    }
                    strF = ((ab) adVar).f();
                }
                str = strF;
            }
            if (str == null) {
                composerStartRestartGroup.startReplaceGroup(1651556444);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1651556445);
                TextKt.m4275Text4IGK_g(str, PaddingKt.m2759paddingqDBjuR0$default(com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.cB, null), 0.0f, 4.0f, 0.0f, 0.0f, 13, null), com.waze.bz.a.d(composerStartRestartGroup, 0).o(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m11069getEllipsisgIe3tQ8(), false, 1, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composerStartRestartGroup).m(), composerStartRestartGroup, 48, DisplayStrings.DS_AAOS_PRIVACY_SETTINGS_DELETE_RECENT_DESTINATION_MESSAGE, 55288);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            q qVarO = o(adVar);
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 8.0f, 0.0f, 0.0f, 0.0f, 14, null);
            EnterTransition enterTransition2 = f42705e;
            ExitTransition exitTransition2 = f42706f;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new Ref();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Ref ref2 = (Ref) objRememberedValue3;
            ref2.setValue(qVarO == null ? ref2.getValue() : qVarO);
            AnimatedVisibilityKt.AnimatedVisibility(qVarO != null, modifierM2759paddingqDBjuR0$default, enterTransition2, exitTransition2, (String) null, ComposableLambdaKt.rememberComposableLambda(-559889238, true, new j(ref2, z), composerStartRestartGroup, 54), composerStartRestartGroup, 200112, 16);
            composerStartRestartGroup.endNode();
            t tVar = adVar instanceof t ? (t) adVar : null;
            EnterTransition enterTransition3 = f42703c;
            t tVar2 = tVar;
            ExitTransition exitTransition3 = f42704d;
            Modifier.Companion companion4 = Modifier.Companion;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new Ref();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Ref ref3 = (Ref) objRememberedValue4;
            ref3.setValue(tVar2 == null ? ref3.getValue() : tVar2);
            if (tVar2 != null) {
                z5 = true;
            }
            AnimatedVisibilityKt.AnimatedVisibility(z5, companion4, enterTransition3, exitTransition3, (String) null, ComposableLambdaKt.rememberComposableLambda(-559889238, true, new f(ref3), composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 16);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.ui.l.c
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return l.k(modifier, adVar, z, i2, (Composer) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public static final void r(final q qVar, final boolean z, Composer composer, final int i2) {
        int i3;
        Modifier modifierJ;
        int i4;
        boolean z2;
        boolean z3;
        Composer composer2;
        int i5;
        float f2;
        int i6;
        int i7 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-677313524);
        if (i7 == 0) {
            i3 = (true != composerStartRestartGroup.changed(qVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            int i8 = i3 & 14;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-677313524, i3, -1, "com.waze.ui.insight.InsightClose (InsightCard.kt:346)");
            }
            ac acVarA = qVar.a();
            composerStartRestartGroup.startReplaceGroup(1936743936);
            boolean z4 = qVar instanceof p;
            Modifier modifierClip = ClipKt.clip(PaddingKt.m2755padding3ABfNKs(SizeKt.m2822size3ABfNKs(Modifier.Companion, f42709i), z4 ? f42711k : 0.0f), RoundedCornerShapeKt.getCircleShape());
            boolean z5 = qVar instanceof o;
            if (z5) {
                composerStartRestartGroup.startReplaceGroup(-384883285);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (i8 == 4 || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new com.waze.sharedrive.c.r(qVar, 13);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                z2 = z4;
                i4 = i8;
                z3 = z5;
                composer2 = composerStartRestartGroup;
                f2 = 0.0f;
                i5 = 0;
                modifierJ = com.waze.z.a.be.J(modifierClip, false, null, (h.g.a.a) objRememberedValue, composer2, 0, 15);
                composer2.endReplaceGroup();
            } else {
                modifierJ = modifierClip;
                i4 = i8;
                z2 = z4;
                z3 = z5;
                composer2 = composerStartRestartGroup;
                i5 = 0;
                f2 = 0.0f;
                composer2.startReplaceGroup(-384881688);
                composer2.endReplaceGroup();
            }
            composer2.endReplaceGroup();
            Modifier modifierA = com.waze.ui.r.a.d.d.a(modifierJ, z2 ? com.waze.ui.r.a.d.c.cG : com.waze.ui.r.a.d.c.cF, null);
            composer2.startReplaceGroup(-90067237);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = AnimatableKt.Animatable$default(f2, f2, 2, null);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            Animatable animatable = (Animatable) objRememberedValue2;
            Object objRememberedValue3 = composer2.rememberedValue();
            if (i4 == 4 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = Boolean.valueOf(!(qVar instanceof n));
                composer2.updateRememberedValue(objRememberedValue3);
            }
            Boolean bool = (Boolean) objRememberedValue3;
            boolean zBooleanValue = bool.booleanValue();
            if (z) {
                composer2.startReplaceGroup(1173781929);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(1172917029);
                boolean zChanged = composer2.changed(acVarA) | composer2.changedInstance(animatable);
                k kVarRememberedValue = composer2.rememberedValue();
                if (zChanged || kVarRememberedValue == Composer.Companion.getEmpty()) {
                    kVarRememberedValue = new k(acVarA, animatable, null);
                    composer2.updateRememberedValue(kVarRememberedValue);
                }
                EffectsKt.LaunchedEffect(acVarA, bool, (h.g.a.p) kVarRememberedValue, composer2, i5);
                composer2.endReplaceGroup();
            }
            if (zBooleanValue) {
                composer2.startReplaceGroup(1173828801);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), i5);
                int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, i5));
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierA);
                h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Updater.m7351setimpl(composer2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composer2, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Updater.m7351setimpl(composer2, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composer2, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composer2, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (h.o.a.E(acVarA.a())) {
                    composer2.startReplaceGroup(-1072420149);
                    composerStartRestartGroup = composer2;
                    i6 = i5;
                    ProgressIndicatorKt.m4150CircularProgressIndicatorDUhRLBM(((Number) animatable.getValue()).floatValue(), SizeKt.m2822size3ABfNKs(Modifier.Companion, 40.0f), com.waze.bz.a.d(composer2, i5).q(), 2.0f, com.waze.bz.a.d(composer2, i5).y(), StrokeCap.Companion.m8633getRoundKaPHkGw(), composerStartRestartGroup, DisplayStrings.DS_AAOS_PRIVACY_SETTINGS_DELETE_RECENT_DESTINATION_MESSAGE, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup = composer2;
                    i6 = i5;
                    composerStartRestartGroup.startReplaceGroup(-1072112319);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (z3) {
                    composerStartRestartGroup.startReplaceGroup(-1072026666);
                    com.waze.z.a.be.g(com.waze.design_components.b.d.n, null, com.waze.design_components.b.e.f23312a, com.waze.bz.a.d(composerStartRestartGroup, i6).q(), composerStartRestartGroup, DisplayStrings.DS_DICTATION_BOTTOM_SHEET_SPEECH_TIMEOUT, 2);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1071852415);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup = composer2;
                composerStartRestartGroup.startReplaceGroup(1174574537);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1936757158);
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.ui.l.d
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return l.l(qVar, z, i2, (Composer) obj);
                }
            });
        }
    }

    private static final void s(final Modifier modifier, final ba baVar, final h.g.a.a aVar, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Modifier modifierA;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(178505533);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(baVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(178505533, i3, -1, "com.waze.ui.insight.StagedAnimationInsightCard (InsightCard.kt:111)");
            }
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            final ad adVarJ = baVar.j();
            Modifier.Companion companion = Modifier.Companion;
            boolean zChanged = ((i3 & 14) == 4) | ((i3 & 112) == 32) | composerStartRestartGroup.changed(density);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                com.waze.c.e.x xVar = new com.waze.c.e.x(baVar, density, modifier, 14, (byte[]) null);
                composerStartRestartGroup.updateRememberedValue(xVar);
                objRememberedValue = xVar;
            }
            SubcomposeLayoutKt.SubcomposeLayout(companion, (h.g.a.p) objRememberedValue, composerStartRestartGroup, 6, 0);
            if (adVarJ == null || (modifierA = com.waze.ui.r.a.d.d.a(modifier, com.waze.ui.r.a.d.c.cz, null)) == null) {
                modifierA = modifier;
            }
            composer2 = composerStartRestartGroup;
            CardKt.m4000CardFjzlyU(SizeKt.m2827width3ABfNKs(SizeKt.m2808height3ABfNKs(modifierA, ((Dp) baVar.a().getValue()).m11178unboximpl()), ((Dp) baVar.b().getValue()).m11178unboximpl()), f42702b, com.waze.bz.a.d(composerStartRestartGroup, 0).j(), 0L, null, 10.0f, ComposableLambdaKt.rememberComposableLambda(-2074053152, true, new h.g.a.p() { // from class: com.waze.ui.l.a
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return l.g(adVarJ, baVar, aVar, (Composer) obj, iIntValue);
                }
            }, composerStartRestartGroup, 54), composer2, 1769520, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.ui.l.b
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return l.m(modifier, baVar, aVar, i2, (Composer) obj);
                }
            });
        }
    }
}
