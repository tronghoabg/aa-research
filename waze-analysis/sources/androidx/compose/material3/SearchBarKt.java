package androidx.compose.material3;

import androidx.activity.BackEventCompat;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SnapSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.material3.internal.BackEventProgress;
import androidx.compose.material3.internal.BackHandler_androidKt;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.material3.internal.PredictiveBack;
import androidx.compose.material3.internal.PredictiveBackState;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.PlatformTextInputInterceptor;
import androidx.compose.ui.platform.PlatformTextInputModifierNodeKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.a.i;
import h.ab;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.a.r;
import h.g.b.x;
import h.k;
import h.k.n;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SearchBarKt {
    private static final int AnimationDelayMillis = 100;
    private static final int AnimationEnterDurationMillis = 600;
    private static final CubicBezierEasing AnimationEnterEasing;
    private static final FiniteAnimationSpec<Float> AnimationEnterFloatSpec;
    private static final FiniteAnimationSpec<IntSize> AnimationEnterSizeSpec;
    private static final int AnimationExitDurationMillis = 350;
    private static final CubicBezierEasing AnimationExitEasing;
    private static final FiniteAnimationSpec<Float> AnimationExitFloatSpec;
    private static final FiniteAnimationSpec<IntSize> AnimationExitSizeSpec;
    private static final FiniteAnimationSpec<Float> AnimationForContentFadeInSpec;
    private static final FiniteAnimationSpec<Float> AnimationForContentFadeOutSpec;
    private static final FiniteAnimationSpec<Float> AnimationPredictiveBackExitFloatSpec;
    private static final EnterTransition DockedEnterTransition;
    private static final ExitTransition DockedExitTransition;
    private static final float DockedExpandedTableMaxHeightScreenRatio = 0.6666667f;
    private static final float DockedExpandedWithGapTableMaxHeightScreenRatio = 0.5f;
    private static final String LayoutIdInputField = "InputField";
    private static final String LayoutIdSearchContent = "Content";
    private static final String LayoutIdSurface = "Surface";
    private static final float SearchBarPredictiveBackMaxOffsetXRatio = 0.05f;
    private static final float SearchBarPredictiveBackMinScale = 0.9f;
    private static final TextFieldColors UnspecifiedTextFieldColors = new TextFieldColors(Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), new TextSelectionColors(Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), null), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), null);
    private static final float SearchBarAsTopBarPadding = 8.0f;
    private static final float AppBarWithSearchHorizontalPadding = 4.0f;
    private static final float AppBarWithSearchVerticalPadding = 4.0f;
    private static final float SearchBarCornerRadius = SearchBarDefaults.INSTANCE.m5456getInputFieldHeightD9Ej5fM() / 2.0f;
    private static final float FullScreenExpandedHorizontalPadding = 8.0f;
    private static final float DockedExpandedTableMinHeight = 240.0f;
    private static final float SearchBarMinWidth = 360.0f;
    private static final float SearchBarMaxWidth = 720.0f;
    private static final float SearchBarVerticalPadding = 8.0f;
    private static final float SearchBarIconOffsetX = 4.0f;
    private static final float SearchBarPredictiveBackMinMargin = 8.0f;
    private static final float SearchBarPredictiveBackMaxOffsetY = 24.0f;

    static {
        CubicBezierEasing easingEmphasizedDecelerateCubicBezier = MotionTokens.INSTANCE.getEasingEmphasizedDecelerateCubicBezier();
        AnimationEnterEasing = easingEmphasizedDecelerateCubicBezier;
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.0f, 1.0f, 0.0f, 1.0f);
        AnimationExitEasing = cubicBezierEasing;
        TweenSpec tweenSpecTween = AnimationSpecKt.tween(600, 100, easingEmphasizedDecelerateCubicBezier);
        AnimationEnterFloatSpec = tweenSpecTween;
        CubicBezierEasing cubicBezierEasing2 = cubicBezierEasing;
        TweenSpec tweenSpecTween2 = AnimationSpecKt.tween(350, 100, cubicBezierEasing2);
        AnimationExitFloatSpec = tweenSpecTween2;
        AnimationPredictiveBackExitFloatSpec = AnimationSpecKt.tween$default(350, 0, cubicBezierEasing2, 2, null);
        TweenSpec tweenSpecTween3 = AnimationSpecKt.tween(600, 100, easingEmphasizedDecelerateCubicBezier);
        AnimationEnterSizeSpec = tweenSpecTween3;
        TweenSpec tweenSpecTween4 = AnimationSpecKt.tween(350, 100, cubicBezierEasing);
        AnimationExitSizeSpec = tweenSpecTween4;
        DockedEnterTransition = EnterExitTransitionKt.fadeIn$default(tweenSpecTween, 0.0f, 2, null).plus(EnterExitTransitionKt.expandVertically$default(tweenSpecTween3, null, false, null, 14, null));
        DockedExitTransition = EnterExitTransitionKt.fadeOut$default(tweenSpecTween2, 0.0f, 2, null).plus(EnterExitTransitionKt.shrinkVertically$default(tweenSpecTween4, null, false, null, 14, null));
        AnimationForContentFadeInSpec = AnimationSpecKt.tween(100, 50, MotionTokens.INSTANCE.getEasingStandardAccelerateCubicBezier());
        AnimationForContentFadeOutSpec = AnimationSpecKt.tween$default(100, 0, MotionTokens.INSTANCE.getEasingStandardDecelerateCubicBezier(), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0113  */
    /* renamed from: AppBarWithSearch-ii5sN6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5476AppBarWithSearchii5sN6A(final androidx.compose.material3.SearchBarState r37, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r38, androidx.compose.ui.Modifier r39, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r40, h.g.a.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r41, androidx.compose.ui.graphics.Shape r42, androidx.compose.material3.AppBarWithSearchColors r43, float r44, float r45, androidx.compose.foundation.layout.PaddingValues r46, androidx.compose.foundation.layout.WindowInsets r47, androidx.compose.material3.SearchBarScrollBehavior r48, androidx.compose.runtime.Composer r49, final int r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarKt.m5476AppBarWithSearchii5sN6A(androidx.compose.material3.SearchBarState, h.g.a.p, androidx.compose.ui.Modifier, h.g.a.p, h.g.a.q, androidx.compose.ui.graphics.Shape, androidx.compose.material3.AppBarWithSearchColors, float, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.SearchBarScrollBehavior, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k AppBarWithSearch_ii5sN6A$lambda$1$0(SearchBarScrollBehavior searchBarScrollBehavior, AppBarWithSearchColors appBarWithSearchColors) {
        float f2 = (searchBarScrollBehavior != null ? overlappedFraction(searchBarScrollBehavior) : 0.0f) > 0.01f ? 1.0f : 0.0f;
        return new k(Color.m8218boximpl(appBarContainerColor(appBarWithSearchColors, f2)), Color.m8218boximpl(searchBarContainerColor(appBarWithSearchColors, f2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AppBarWithSearch_ii5sN6A$lambda$2(State<Color> state) {
        return state.getValue().m8238unboximpl();
    }

    private static final SearchBarColors AppBarWithSearch_ii5sN6A$lambda$4(MutableState<SearchBarColors> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab AppBarWithSearch_ii5sN6A$lambda$7$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        return ab.f48028a;
    }

    static final ab AppBarWithSearch_ii5sN6A$lambda$8(PaddingValues paddingValues, p pVar, SearchBarState searchBarState, final q qVar, AppBarWithSearchColors appBarWithSearchColors, p pVar2, Shape shape, boolean z, float f2, float f3, MutableState mutableState, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1374718147, i2, -1, "androidx.compose.material3.AppBarWithSearch.<anonymous> (SearchBar.kt:458)");
            }
            Modifier modifierPadding = PaddingKt.padding(Modifier.Companion, paddingValues);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer, 48);
            int iM = SearchBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierPadding);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (pVar == null) {
                composer.startReplaceGroup(-1469475485);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1469475484);
                Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, AppBarWithSearchHorizontalPadding, 0.0f, 0.0f, 0.0f, 14, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int iM2 = SearchBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM2759paddingqDBjuR0$default);
                a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
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
                Updater.m7351setimpl(composer, Integer.valueOf(iM2), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composer, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(appBarWithSearchColors.m4370getAppBarNavigationIconColor0d7_KjU())), (p<? super Composer, ? super Integer, ab>) pVar, composer, ProvidedValue.$stable);
                composer.endNode();
                composer.endReplaceGroup();
            }
            Modifier modifierAlpha = AlphaKt.alpha(RowScope.CC.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null), true != (!searchBarState.getExpandsToFullScreen$material3() || !isExpanded(searchBarState) || searchBarState.getTargetValue() == SearchBarValue.Expanded) ? 0.0f : 1.0f);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM3 = SearchBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierAlpha);
            a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM3), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            m5489SearchBarnbWgWpA(searchBarState, pVar2, BoxScopeInstance.INSTANCE.align(SizeKt.m2828widthInVpY3zN4(PaddingKt.m2756paddingVpY3zN4(Modifier.Companion, SearchBarAsTopBarPadding, AppBarWithSearchVerticalPadding), SearchBarMinWidth, SearchBarMaxWidth), Alignment.Companion.getCenter()), shape, AppBarWithSearch_ii5sN6A$lambda$4(mutableState), !z ? 0.0f : f2, true != z ? 0.0f : f3, composer, 0, 0);
            composer.endNode();
            if (qVar == null) {
                composer.startReplaceGroup(-1468061699);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1468061698);
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(862714396, true, new p() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda49
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return SearchBarKt.AppBarWithSearch_ii5sN6A$lambda$8$0$2$0(qVar, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54);
                Modifier modifierM2759paddingqDBjuR0$default2 = PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, AppBarWithSearchHorizontalPadding, 0.0f, 11, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int iM4 = SearchBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierM2759paddingqDBjuR0$default2);
                a<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor4);
                } else {
                    composer.useNode();
                }
                Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composer, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Updater.m7351setimpl(composer, Integer.valueOf(iM4), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composer, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(appBarWithSearchColors.m4368getAppBarActionIconColor0d7_KjU())), composableLambdaRememberComposableLambda, composer, ProvidedValue.$stable | 48);
                composer.endNode();
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab AppBarWithSearch_ii5sN6A$lambda$8$0$2$0(q qVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(862714396, i2, -1, "androidx.compose.material3.AppBarWithSearch.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchBar.kt:495)");
            }
            Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically, composer, 54);
            int iM = SearchBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            qVar.invoke(RowScopeInstance.INSTANCE, composer, 6);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab AppBarWithSearch_ii5sN6A$lambda$9(SearchBarState searchBarState, p pVar, Modifier modifier, p pVar2, q qVar, Shape shape, AppBarWithSearchColors appBarWithSearchColors, float f2, float f3, PaddingValues paddingValues, WindowInsets windowInsets, SearchBarScrollBehavior searchBarScrollBehavior, int i2, int i3, int i4, Composer composer, int i5) {
        m5476AppBarWithSearchii5sN6A(searchBarState, pVar, modifier, pVar2, qVar, shape, appBarWithSearchColors, f2, f3, paddingValues, windowInsets, searchBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DetectClickFromInteractionSource(final InteractionSource interactionSource, final a<ab> aVar, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-652650823);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(interactionSource) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-652650823, i3, -1, "androidx.compose.material3.DetectClickFromInteractionSource (SearchBar.kt:3707)");
            }
            int i5 = i3 & 14;
            boolean z = i5 == 4;
            boolean z2 = (i3 & 112) == 32;
            SearchBarKt$DetectClickFromInteractionSource$1$1 searchBarKt$DetectClickFromInteractionSource$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | z2) || searchBarKt$DetectClickFromInteractionSource$1$1RememberedValue == Composer.Companion.getEmpty()) {
                searchBarKt$DetectClickFromInteractionSource$1$1RememberedValue = new SearchBarKt$DetectClickFromInteractionSource$1$1(interactionSource, aVar, null);
                composerStartRestartGroup.updateRememberedValue(searchBarKt$DetectClickFromInteractionSource$1$1RememberedValue);
            }
            EffectsKt.LaunchedEffect(interactionSource, (p<? super af, ? super e<? super ab>, ? extends Object>) searchBarKt$DetectClickFromInteractionSource$1$1RememberedValue, composerStartRestartGroup, i5);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda27
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SearchBarKt.DetectClickFromInteractionSource$lambda$1(interactionSource, aVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab DetectClickFromInteractionSource$lambda$1(InteractionSource interactionSource, a aVar, int i2, Composer composer, int i3) {
        DetectClickFromInteractionSource(interactionSource, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    private static final void DisableSoftKeyboard(final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(627989674);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(pVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(627989674, i3, -1, "androidx.compose.material3.DisableSoftKeyboard (SearchBar.kt:3691)");
            }
            SearchBarKt$DisableSoftKeyboard$1$1 searchBarKt$DisableSoftKeyboard$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (searchBarKt$DisableSoftKeyboard$1$1RememberedValue == Composer.Companion.getEmpty()) {
                searchBarKt$DisableSoftKeyboard$1$1RememberedValue = SearchBarKt$DisableSoftKeyboard$1$1.INSTANCE;
                composerStartRestartGroup.updateRememberedValue(searchBarKt$DisableSoftKeyboard$1$1RememberedValue);
            }
            PlatformTextInputModifierNodeKt.InterceptPlatformTextInput((PlatformTextInputInterceptor) searchBarKt$DisableSoftKeyboard$1$1RememberedValue, pVar, composerStartRestartGroup, (i3 << 3) & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda39
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SearchBarKt.DisableSoftKeyboard$lambda$1(pVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab DisableSoftKeyboard$lambda$1(p pVar, int i2, Composer composer, int i3) {
        DisableSoftKeyboard(pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0107  */
    /* renamed from: DockedSearchBar-EQC0FA8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5477DockedSearchBarEQC0FA8(final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r27, final boolean r28, final h.g.a.l<? super java.lang.Boolean, h.ab> r29, androidx.compose.ui.Modifier r30, androidx.compose.ui.graphics.Shape r31, androidx.compose.material3.SearchBarColors r32, float r33, float r34, final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarKt.m5477DockedSearchBarEQC0FA8(h.g.a.p, boolean, h.g.a.l, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, float, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012d  */
    /* renamed from: DockedSearchBar-eWTbjVg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5478DockedSearchBareWTbjVg(final java.lang.String r35, final h.g.a.l<? super java.lang.String, h.ab> r36, final h.g.a.l<? super java.lang.String, h.ab> r37, final boolean r38, final h.g.a.l<? super java.lang.Boolean, h.ab> r39, androidx.compose.ui.Modifier r40, boolean r41, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r42, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r43, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r44, androidx.compose.ui.graphics.Shape r45, androidx.compose.material3.SearchBarColors r46, float r47, float r48, androidx.compose.foundation.interaction.MutableInteractionSource r49, final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r50, androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarKt.m5478DockedSearchBareWTbjVg(java.lang.String, h.g.a.l, h.g.a.l, boolean, h.g.a.l, androidx.compose.ui.Modifier, boolean, h.g.a.p, h.g.a.p, h.g.a.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, float, androidx.compose.foundation.interaction.MutableInteractionSource, h.g.a.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: DockedSearchBarLayout-gLs90yA, reason: not valid java name */
    private static final void m5479DockedSearchBarLayoutgLs90yA(final SearchBarState searchBarState, final p<? super Composer, ? super Integer, ab> pVar, final Modifier modifier, final Shape shape, final Shape shape2, final Dp dp, final SearchBarColors searchBarColors, final float f2, final float f3, final q<? super ColumnScope, ? super Composer, ? super Integer, ab> qVar, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        int i4;
        int i5;
        SearchBarColors searchBarColorsM5438copyjxsXWHM$default;
        int i6 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1524613774);
        if (i6 == 0) {
            i3 = (true != composerStartRestartGroup.changed(searchBarState) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(shape) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changed(shape2) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(dp) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(searchBarColors) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(f2) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(f3) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if ((805306368 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(qVar) ? 268435456 : 536870912;
        }
        if (composerStartRestartGroup.shouldExecute((306783379 & i3) != 306783378, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1524613774, i3, -1, "androidx.compose.material3.DockedSearchBarLayout (SearchBar.kt:3305)");
            }
            Shape rectangleShape = shape2 != null ? RectangleShapeKt.getRectangleShape() : shape;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1590967320, true, new p() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda50
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SearchBarKt.DockedSearchBarLayout_gLs90yA$lambda$0(shape2, searchBarColors, shape, pVar, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54);
            if (shape2 != null) {
                i5 = 54;
                i4 = i3;
                searchBarColorsM5438copyjxsXWHM$default = SearchBarColors.m5438copyjxsXWHM$default(searchBarColors, Color.Companion.m8263getTransparent0d7_KjU(), 0L, null, 6, null);
            } else {
                i4 = i3;
                i5 = 54;
                searchBarColorsM5438copyjxsXWHM$default = searchBarColors;
            }
            boolean z = dp != null;
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-1966576354, true, new p() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda51
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SearchBarKt.DockedSearchBarLayout_gLs90yA$lambda$1(shape2, searchBarState, dp, searchBarColors, qVar, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, i5);
            int i7 = i4 << 3;
            int i8 = i4 >> 6;
            composer2 = composerStartRestartGroup;
            m5480DockedSearchBarLayoutImpl1tP8Re8(rectangleShape, searchBarState, composableLambdaRememberComposableLambda, modifier, searchBarColorsM5438copyjxsXWHM$default, f2, f3, z, composableLambdaRememberComposableLambda2, composer2, (i7 & 7168) | (i7 & 112) | 100663680 | (458752 & i8) | (i8 & 3670016));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda52
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SearchBarKt.DockedSearchBarLayout_gLs90yA$lambda$2(searchBarState, pVar, modifier, shape, shape2, dp, searchBarColors, f2, f3, qVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: DockedSearchBarLayoutImpl-1tP8Re8, reason: not valid java name */
    private static final void m5480DockedSearchBarLayoutImpl1tP8Re8(final Shape shape, final SearchBarState searchBarState, final p<? super Composer, ? super Integer, ab> pVar, final Modifier modifier, final SearchBarColors searchBarColors, final float f2, final float f3, final boolean z, final p<? super Composer, ? super Integer, ab> pVar2, Composer composer, final int i2) {
        Shape shape2;
        int i3;
        SearchBarColors searchBarColors2;
        Composer composer2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2112470650);
        if (i4 == 0) {
            shape2 = shape;
            i3 = (true != composerStartRestartGroup.changed(shape2) ? 2 : 4) | i2;
        } else {
            shape2 = shape;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(searchBarState) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            searchBarColors2 = searchBarColors;
            i3 |= true != composerStartRestartGroup.changed(searchBarColors2) ? 8192 : 16384;
        } else {
            searchBarColors2 = searchBarColors;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(f2) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(f3) ? 524288 : 1048576;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar2) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if (composerStartRestartGroup.shouldExecute((38347923 & i3) != 38347922, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2112470650, i3, -1, "androidx.compose.material3.DockedSearchBarLayoutImpl (SearchBar.kt:3376)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(h.c.k.f48060a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final af afVar = (af) objRememberedValue;
            boolean zIsExpanded = isExpanded(searchBarState);
            int i5 = i3;
            boolean zChangedInstance = ((i3 & 112) == 32) | composerStartRestartGroup.changedInstance(afVar);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new a() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda29
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return SearchBarKt.DockedSearchBarLayoutImpl_1tP8Re8$lambda$0$0(afVar, searchBarState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            BackHandler_androidKt.BackHandler(zIsExpanded, (a) objRememberedValue2, composerStartRestartGroup, 0, 0);
            int i6 = i5 >> 3;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m5669SurfaceT9BRK9s(WindowInsetsPadding_androidKt.imePadding(modifier), shape2, searchBarColors2.m5440getContainerColor0d7_KjU(), ColorSchemeKt.m4593contentColorForek8zF_U(searchBarColors2.m5440getContainerColor0d7_KjU(), composerStartRestartGroup, 0), f2, f3, null, ComposableLambdaKt.rememberComposableLambda(717820257, true, new p() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda30
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SearchBarKt.DockedSearchBarLayoutImpl_1tP8Re8$lambda$1(z, pVar, pVar2, searchBarState, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composer2, ((i5 << 3) & 112) | 12582912 | (57344 & i6) | (i6 & 458752), 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda31
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SearchBarKt.DockedSearchBarLayoutImpl_1tP8Re8$lambda$2(shape, searchBarState, pVar, modifier, searchBarColors, f2, f3, z, pVar2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DockedSearchBarLayoutImpl_1tP8Re8$lambda$0$0(af afVar, SearchBarState searchBarState) {
        aj.z(afVar, null, null, new SearchBarKt$DockedSearchBarLayoutImpl$1$1$1(searchBarState, null), 3);
        return ab.f48028a;
    }

    static final ab DockedSearchBarLayoutImpl_1tP8Re8$lambda$1(boolean z, p pVar, p pVar2, SearchBarState searchBarState, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(717820257, i2, -1, "androidx.compose.material3.DockedSearchBarLayoutImpl.<anonymous> (SearchBar.kt:3388)");
            }
            float windowContainerHeight = SearchBar_androidKt.getWindowContainerHeight(composer, 0) * (true != z ? DockedExpandedTableMaxHeightScreenRatio : 0.5f);
            float fM11178unboximpl = ((Dp) n.p(Dp.m11162boximpl(DockedExpandedTableMinHeight), Dp.m11162boximpl(windowContainerHeight))).m11178unboximpl();
            List listI = i.i(pVar, pVar2);
            boolean zChanged = composer.changed(searchBarState) | composer.changed(windowContainerHeight) | composer.changed(fM11178unboximpl);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (MultiContentMeasurePolicy) new SearchBarKt$DockedSearchBarLayoutImpl$2$1$1(searchBarState, windowContainerHeight, fM11178unboximpl);
                composer.updateRememberedValue(objRememberedValue);
            }
            MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) objRememberedValue;
            Modifier.Companion companion = Modifier.Companion;
            p<Composer, Integer, ab> pVarCombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listI);
            boolean zChanged2 = composer.changed(multiContentMeasurePolicy);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                composer.updateRememberedValue(objRememberedValue2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue2;
            int iM = SearchBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            pVarCombineAsVirtualLayouts.invoke(composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab DockedSearchBarLayoutImpl_1tP8Re8$lambda$2(Shape shape, SearchBarState searchBarState, p pVar, Modifier modifier, SearchBarColors searchBarColors, float f2, float f3, boolean z, p pVar2, int i2, Composer composer, int i3) {
        m5480DockedSearchBarLayoutImpl1tP8Re8(shape, searchBarState, pVar, modifier, searchBarColors, f2, f3, z, pVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab DockedSearchBarLayout_gLs90yA$lambda$0(Shape shape, SearchBarColors searchBarColors, Shape shape2, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1590967320, i2, -1, "androidx.compose.material3.DockedSearchBarLayout.<anonymous> (SearchBar.kt:3309)");
            }
            if (shape != null) {
                composer.startReplaceGroup(1543368331);
                Modifier modifierClip = ClipKt.clip(BackgroundKt.m1971backgroundbw27NRU(Modifier.Companion, searchBarColors.m5440getContainerColor0d7_KjU(), shape2), shape2);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int iM = SearchBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierClip);
                a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
                Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                pVar.invoke(composer, 0);
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1543651454);
                pVar.invoke(composer, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab DockedSearchBarLayout_gLs90yA$lambda$1(Shape shape, SearchBarState searchBarState, Dp dp, SearchBarColors searchBarColors, final q qVar, Composer composer, int i2) {
        boolean z = false;
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1966576354, i2, -1, "androidx.compose.material3.DockedSearchBarLayout.<anonymous> (SearchBar.kt:3328)");
            }
            if (shape != null) {
                composer.startReplaceGroup(1372806238);
                AnimationSpec<Float> animationSpecForExpand$material3 = searchBarState.getAnimationSpecForExpand$material3();
                SnapSpec snapSpecSnap$default = animationSpecForExpand$material3 instanceof FiniteAnimationSpec ? (FiniteAnimationSpec) animationSpecForExpand$material3 : null;
                if (snapSpecSnap$default == null) {
                    snapSpecSnap$default = AnimationSpecKt.snap$default(0, 1, null);
                }
                AnimationSpec<Float> animationSpecForCollapse$material3 = searchBarState.getAnimationSpecForCollapse$material3();
                SnapSpec snapSpecSnap$default2 = animationSpecForCollapse$material3 instanceof FiniteAnimationSpec ? (FiniteAnimationSpec) animationSpecForCollapse$material3 : null;
                if (snapSpecSnap$default2 == null) {
                    snapSpecSnap$default2 = AnimationSpecKt.snap$default(0, 1, null);
                }
                Modifier modifierAlpha = AlphaKt.alpha(ClipKt.clip(BackgroundKt.m1971backgroundbw27NRU(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, dp != null ? dp.m11178unboximpl() : 0.0f, 0.0f, 0.0f, 13, null), searchBarColors.m5440getContainerColor0d7_KjU(), shape), shape), searchBarState.getContentProgress$material3());
                if (searchBarState.getProgress() > 0.1f && searchBarState.getTargetValue() == SearchBarValue.Expanded) {
                    z = true;
                }
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new l() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda12
                        @Override // h.g.a.l
                        public final Object invoke(Object obj) {
                            return SearchBarKt.DockedSearchBarLayout_gLs90yA$lambda$1$0$0((IntSize) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                EnterTransition enterTransitionSlideIn = EnterExitTransitionKt.slideIn(snapSpecSnap$default, (l) objRememberedValue);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new l() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda13
                        @Override // h.g.a.l
                        public final Object invoke(Object obj) {
                            return SearchBarKt.DockedSearchBarLayout_gLs90yA$lambda$1$1$0((IntSize) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                AnimatedVisibilityKt.AnimatedVisibility(z, modifierAlpha, enterTransitionSlideIn, EnterExitTransitionKt.slideOut(snapSpecSnap$default2, (l) objRememberedValue2), (String) null, ComposableLambdaKt.rememberComposableLambda(-1402963311, true, new q() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda14
                    @Override // h.g.a.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return SearchBarKt.DockedSearchBarLayout_gLs90yA$lambda$1$2(qVar, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer, 54), composer, 196608, 16);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1374145097);
                Modifier.Companion companion = Modifier.Companion;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
                int iM = SearchBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
                a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
                Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                DividerKt.m4778HorizontalDivider9IZ8Weo(null, 0.0f, searchBarColors.m5441getDividerColor0d7_KjU(), composer, 0, 3);
                qVar.invoke(columnScopeInstance, composer, 6);
                composer.endNode();
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset DockedSearchBarLayout_gLs90yA$lambda$1$0$0(IntSize intSize) {
        return IntOffset.m11287boximpl(h.h.a.b((-((int) (intSize.m11343unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) / 2.0f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset DockedSearchBarLayout_gLs90yA$lambda$1$1$0(IntSize intSize) {
        return IntOffset.m11287boximpl(h.h.a.b((-((int) (intSize.m11343unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) / 2.0f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DockedSearchBarLayout_gLs90yA$lambda$1$2(q qVar, AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1402963311, i2, -1, "androidx.compose.material3.DockedSearchBarLayout.<anonymous>.<anonymous> (SearchBar.kt:3353)");
        }
        Modifier.Companion companion = Modifier.Companion;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
        int iM = SearchBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
        a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
        Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
        Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
        Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
        qVar.invoke(ColumnScopeInstance.INSTANCE, composer, 6);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    static final ab DockedSearchBarLayout_gLs90yA$lambda$2(SearchBarState searchBarState, p pVar, Modifier modifier, Shape shape, Shape shape2, Dp dp, SearchBarColors searchBarColors, float f2, float f3, q qVar, int i2, Composer composer, int i3) {
        m5479DockedSearchBarLayoutgLs90yA(searchBarState, pVar, modifier, shape, shape2, dp, searchBarColors, f2, f3, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab DockedSearchBar_EQC0FA8$lambda$0(p pVar, boolean z, final SearchBarColors searchBarColors, final q qVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(401953073, i2, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.kt:1061)");
            }
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int iM = SearchBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            pVar.invoke(composer, 0);
            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z, (Modifier) null, DockedEnterTransition, DockedExitTransition, (String) null, ComposableLambdaKt.rememberComposableLambda(-1224554113, true, new q() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda43
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SearchBarKt.DockedSearchBar_EQC0FA8$lambda$0$0$0(searchBarColors, qVar, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 1600518, 18);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DockedSearchBar_EQC0FA8$lambda$0$0$0(SearchBarColors searchBarColors, q qVar, AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1224554113, i2, -1, "androidx.compose.material3.DockedSearchBar.<anonymous>.<anonymous>.<anonymous> (SearchBar.kt:1069)");
        }
        float windowContainerHeight = SearchBar_androidKt.getWindowContainerHeight(composer, 0) * DockedExpandedTableMaxHeightScreenRatio;
        Modifier modifierM2809heightInVpY3zN4 = SizeKt.m2809heightInVpY3zN4(Modifier.Companion, ((Dp) n.p(Dp.m11162boximpl(DockedExpandedTableMinHeight), Dp.m11162boximpl(windowContainerHeight))).m11178unboximpl(), windowContainerHeight);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
        int iM = SearchBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM2809heightInVpY3zN4);
        a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
        Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
        Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
        Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        DividerKt.m4778HorizontalDivider9IZ8Weo(null, 0.0f, searchBarColors.m5441getDividerColor0d7_KjU(), composer, 0, 3);
        qVar.invoke(columnScopeInstance, composer, 6);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DockedSearchBar_EQC0FA8$lambda$1$0(l lVar) {
        lVar.invoke(false);
        return ab.f48028a;
    }

    static final ab DockedSearchBar_EQC0FA8$lambda$2(p pVar, boolean z, l lVar, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f2, float f3, q qVar, int i2, int i3, Composer composer, int i4) {
        m5477DockedSearchBarEQC0FA8(pVar, z, lVar, modifier, shape, searchBarColors, f2, f3, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab DockedSearchBar_eWTbjVg$lambda$0(SearchBarColors searchBarColors, String str, l lVar, l lVar2, boolean z, l lVar3, boolean z2, p pVar, p pVar2, p pVar3, MutableInteractionSource mutableInteractionSource, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1275782414, i2, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.kt:3023)");
            }
            SearchBarDefaults.INSTANCE.InputField(str, lVar, lVar2, z, lVar3, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), z2, pVar, pVar2, pVar3, searchBarColors.getInputFieldColors(), mutableInteractionSource, composer, 196608, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab DockedSearchBar_eWTbjVg$lambda$1(String str, l lVar, l lVar2, boolean z, l lVar3, Modifier modifier, boolean z2, p pVar, p pVar2, p pVar3, Shape shape, SearchBarColors searchBarColors, float f2, float f3, MutableInteractionSource mutableInteractionSource, q qVar, int i2, int i3, int i4, Composer composer, int i5) {
        m5478DockedSearchBareWTbjVg(str, lVar, lVar2, z, lVar3, modifier, z2, pVar, pVar2, pVar3, shape, searchBarColors, f2, f3, mutableInteractionSource, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0107  */
    /* renamed from: ExpandedDockedSearchBar-qKj4JfE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5481ExpandedDockedSearchBarqKj4JfE(final androidx.compose.material3.SearchBarState r24, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r25, androidx.compose.ui.Modifier r26, androidx.compose.ui.graphics.Shape r27, androidx.compose.material3.SearchBarColors r28, float r29, float r30, androidx.compose.ui.window.PopupProperties r31, final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarKt.m5481ExpandedDockedSearchBarqKj4JfE(androidx.compose.material3.SearchBarState, h.g.a.p, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, float, androidx.compose.ui.window.PopupProperties, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: ExpandedDockedSearchBarImpl-FNF3uiM, reason: not valid java name */
    private static final void m5482ExpandedDockedSearchBarImplFNF3uiM(final SearchBarState searchBarState, final PopupProperties popupProperties, final long j2, final q<? super FocusRequester, ? super Composer, ? super Integer, ab> qVar, Composer composer, final int i2) {
        int i3;
        final q<? super FocusRequester, ? super Composer, ? super Integer, ab> qVar2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        p<? super Composer, ? super Integer, ab> pVar;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1062209726);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(searchBarState) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(popupProperties) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(j2) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            qVar2 = qVar;
            i3 |= true != composerStartRestartGroup.changedInstance(qVar2) ? 1024 : 2048;
        } else {
            qVar2 = qVar;
        }
        int i5 = i3;
        if (composerStartRestartGroup.shouldExecute((i5 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1062209726, i5, -1, "androidx.compose.material3.ExpandedDockedSearchBarImpl (SearchBar.kt:834)");
            }
            if (!isExpanded(searchBarState)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    pVar = new p() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda35
                        @Override // h.g.a.p
                        public final Object invoke(Object obj, Object obj2) {
                            return SearchBarKt.ExpandedDockedSearchBarImpl_FNF3uiM$lambda$0(searchBarState, popupProperties, j2, qVar2, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    };
                    scopeUpdateScopeEndRestartGroup.updateScope(pVar);
                }
                return;
            }
            final boolean z = (Color.m8229equalsimpl0(j2, Color.Companion.m8264getUnspecified0d7_KjU()) || Color.m8229equalsimpl0(j2, Color.Companion.m8263getTransparent0d7_KjU())) ? false : true;
            PopupPositionProvider popupPositionProvider = new PopupPositionProvider() { // from class: androidx.compose.material3.SearchBarKt$ExpandedDockedSearchBarImpl$positionProvider$1
                @Override // androidx.compose.ui.window.PopupPositionProvider
                /* renamed from: calculatePosition-llwVHH4 */
                public long mo2094calculatePositionllwVHH4(IntRect intRect, long j3, LayoutDirection layoutDirection, long j4) {
                    return z ? IntOffset.Companion.m11307getZeronOccac() : SearchBarKt.getCollapsedBounds(searchBarState).m11325getTopLeftnOccac();
                }
            };
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(h.c.k.f48060a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final af afVar = (af) objRememberedValue;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(afVar) | ((i5 & 14) == 4);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new a() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda36
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return SearchBarKt.ExpandedDockedSearchBarImpl_FNF3uiM$lambda$1$0(afVar, searchBarState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final a aVar = (a) objRememberedValue2;
            final boolean z2 = z;
            composer2 = composerStartRestartGroup;
            AndroidPopup_androidKt.Popup(popupPositionProvider, aVar, popupProperties, ComposableLambdaKt.rememberComposableLambda(-757931804, true, new p() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda37
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SearchBarKt.ExpandedDockedSearchBarImpl_FNF3uiM$lambda$2(z2, j2, searchBarState, aVar, qVar, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composer2, ((i5 << 3) & DisplayStrings.DS_TAP_TO_VERIFY) | DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            pVar = new p() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda38
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SearchBarKt.ExpandedDockedSearchBarImpl_FNF3uiM$lambda$3(searchBarState, popupProperties, j2, qVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(pVar);
        }
    }

    static final ab ExpandedDockedSearchBarImpl_FNF3uiM$lambda$0(SearchBarState searchBarState, PopupProperties popupProperties, long j2, q qVar, int i2, Composer composer, int i3) {
        m5482ExpandedDockedSearchBarImplFNF3uiM(searchBarState, popupProperties, j2, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ExpandedDockedSearchBarImpl_FNF3uiM$lambda$1$0(af afVar, SearchBarState searchBarState) {
        aj.z(afVar, null, null, new SearchBarKt$ExpandedDockedSearchBarImpl$onDismiss$1$1$1(searchBarState, null), 3);
        return ab.f48028a;
    }

    static final ab ExpandedDockedSearchBarImpl_FNF3uiM$lambda$2(boolean z, long j2, final SearchBarState searchBarState, a aVar, q qVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-757931804, i2, -1, "androidx.compose.material3.ExpandedDockedSearchBarImpl.<anonymous> (SearchBar.kt:855)");
            }
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new FocusRequester();
                composer.updateRememberedValue(objRememberedValue);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            if (z) {
                composer.startReplaceGroup(-903201356);
                Modifier modifierM2007clickableoSLSa3U$default = ClickableKt.m2007clickableoSLSa3U$default(BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Color.m8227copywmQWz5c$default(j2, Color.m8230getAlphaimpl(j2) * searchBarState.getProgress(), 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, null, aVar, 15, null);
                boolean zChanged = composer.changed(searchBarState);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new l() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda55
                        @Override // h.g.a.l
                        public final Object invoke(Object obj) {
                            return SearchBarKt.ExpandedDockedSearchBarImpl_FNF3uiM$lambda$2$1$0(searchBarState, (Density) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierOffset = OffsetKt.offset(modifierM2007clickableoSLSa3U$default, (l) objRememberedValue2);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int iM = SearchBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierOffset);
                a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
                Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                qVar.invoke(focusRequester, composer, 6);
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-902784561);
                qVar.invoke(focusRequester, composer, 6);
                composer.endReplaceGroup();
            }
            ab abVar = ab.f48028a;
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = (p) new SearchBarKt$ExpandedDockedSearchBarImpl$2$3$1(focusRequester, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(abVar, (p<? super af, ? super e<? super ab>, ? extends Object>) objRememberedValue3, composer, 6);
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composer.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            SearchBarValue targetValue = searchBarState.getTargetValue();
            boolean zChanged2 = composer.changed(searchBarState) | composer.changed(softwareKeyboardController);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = (p) new SearchBarKt$ExpandedDockedSearchBarImpl$2$4$1(searchBarState, softwareKeyboardController, null);
                composer.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(targetValue, (p<? super af, ? super e<? super ab>, ? extends Object>) objRememberedValue4, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset ExpandedDockedSearchBarImpl_FNF3uiM$lambda$2$1$0(SearchBarState searchBarState, Density density) {
        return IntOffset.m11287boximpl(getCollapsedBounds(searchBarState).m11325getTopLeftnOccac());
    }

    static final ab ExpandedDockedSearchBarImpl_FNF3uiM$lambda$3(SearchBarState searchBarState, PopupProperties popupProperties, long j2, q qVar, int i2, Composer composer, int i3) {
        m5482ExpandedDockedSearchBarImplFNF3uiM(searchBarState, popupProperties, j2, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* renamed from: ExpandedDockedSearchBarWithGap-AX2PdCw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5483ExpandedDockedSearchBarWithGapAX2PdCw(final androidx.compose.material3.SearchBarState r27, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r28, androidx.compose.ui.Modifier r29, androidx.compose.ui.graphics.Shape r30, androidx.compose.ui.graphics.Shape r31, float r32, long r33, androidx.compose.material3.SearchBarColors r35, float r36, float r37, androidx.compose.ui.window.PopupProperties r38, final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r39, androidx.compose.runtime.Composer r40, final int r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarKt.m5483ExpandedDockedSearchBarWithGapAX2PdCw(androidx.compose.material3.SearchBarState, h.g.a.p, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, androidx.compose.ui.graphics.Shape, float, long, androidx.compose.material3.SearchBarColors, float, float, androidx.compose.ui.window.PopupProperties, h.g.a.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    static final ab ExpandedDockedSearchBarWithGap_AX2PdCw$lambda$0(SearchBarState searchBarState, Modifier modifier, Shape shape, Shape shape2, float f2, SearchBarColors searchBarColors, float f3, float f4, q qVar, final p pVar, final FocusRequester focusRequester, Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = i2 | (true != composer.changed(focusRequester) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(929406661, i3, -1, "androidx.compose.material3.ExpandedDockedSearchBarWithGap.<anonymous> (SearchBar.kt:742)");
            }
            m5479DockedSearchBarLayoutgLs90yA(searchBarState, ComposableLambdaKt.rememberComposableLambda(2021987022, true, new p() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda40
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SearchBarKt.ExpandedDockedSearchBarWithGap_AX2PdCw$lambda$0$0(focusRequester, pVar, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), modifier, shape, shape2, Dp.m11162boximpl(f2), searchBarColors, f3, f4, qVar, composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ExpandedDockedSearchBarWithGap_AX2PdCw$lambda$0$0(FocusRequester focusRequester, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2021987022, i2, -1, "androidx.compose.material3.ExpandedDockedSearchBarWithGap.<anonymous>.<anonymous> (SearchBar.kt:745)");
            }
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(Modifier.Companion, focusRequester);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            int iM = SearchBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFocusRequester);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab ExpandedDockedSearchBarWithGap_AX2PdCw$lambda$1(SearchBarState searchBarState, p pVar, Modifier modifier, Shape shape, Shape shape2, float f2, long j2, SearchBarColors searchBarColors, float f3, float f4, PopupProperties popupProperties, q qVar, int i2, int i3, int i4, Composer composer, int i5) {
        m5483ExpandedDockedSearchBarWithGapAX2PdCw(searchBarState, pVar, modifier, shape, shape2, f2, j2, searchBarColors, f3, f4, popupProperties, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab ExpandedDockedSearchBar_qKj4JfE$lambda$0(SearchBarState searchBarState, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f2, float f3, q qVar, final p pVar, final FocusRequester focusRequester, Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = i2 | (true != composer.changed(focusRequester) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1363493521, i3, -1, "androidx.compose.material3.ExpandedDockedSearchBar.<anonymous> (SearchBar.kt:806)");
            }
            m5479DockedSearchBarLayoutgLs90yA(searchBarState, ComposableLambdaKt.rememberComposableLambda(-1496620198, true, new p() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda28
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SearchBarKt.ExpandedDockedSearchBar_qKj4JfE$lambda$0$0(focusRequester, pVar, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), modifier, shape, null, null, searchBarColors, f2, f3, qVar, composer, 221232);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ExpandedDockedSearchBar_qKj4JfE$lambda$0$0(FocusRequester focusRequester, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1496620198, i2, -1, "androidx.compose.material3.ExpandedDockedSearchBar.<anonymous>.<anonymous> (SearchBar.kt:809)");
            }
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(Modifier.Companion, focusRequester);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            int iM = SearchBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFocusRequester);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab ExpandedDockedSearchBar_qKj4JfE$lambda$1(SearchBarState searchBarState, p pVar, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f2, float f3, PopupProperties popupProperties, q qVar, int i2, int i3, Composer composer, int i4) {
        m5481ExpandedDockedSearchBarqKj4JfE(searchBarState, pVar, modifier, shape, searchBarColors, f2, f3, popupProperties, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0113  */
    /* renamed from: ExpandedFullScreenContainedSearchBar-_UtchM0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5484ExpandedFullScreenContainedSearchBar_UtchM0(final androidx.compose.material3.SearchBarState r21, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r22, androidx.compose.ui.Modifier r23, androidx.compose.ui.graphics.Shape r24, androidx.compose.material3.SearchBarColors r25, float r26, float r27, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.foundation.layout.WindowInsets> r28, androidx.compose.ui.window.DialogProperties r29, final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarKt.m5484ExpandedFullScreenContainedSearchBar_UtchM0(androidx.compose.material3.SearchBarState, h.g.a.p, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, float, h.g.a.p, androidx.compose.ui.window.DialogProperties, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    static final WindowInsets ExpandedFullScreenContainedSearchBar__UtchM0$lambda$0(Composer composer, int i2) {
        composer.startReplaceGroup(-685482430);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-685482430, i2, -1, "androidx.compose.material3.ExpandedFullScreenContainedSearchBar.<anonymous> (SearchBar.kt:551)");
        }
        WindowInsets fullScreenWindowInsets = SearchBarDefaults.INSTANCE.getFullScreenWindowInsets(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return fullScreenWindowInsets;
    }

    static final ab ExpandedFullScreenContainedSearchBar__UtchM0$lambda$1(SearchBarState searchBarState, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f2, float f3, p pVar, q qVar, final p pVar2, final FocusRequester focusRequester, PredictiveBackState predictiveBackState, Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = i2 | (true != composer.changed(focusRequester) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? composer.changed(predictiveBackState) : composer.changedInstance(predictiveBackState)) ? 16 : 32;
        }
        if (composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1513710947, i3, -1, "androidx.compose.material3.ExpandedFullScreenContainedSearchBar.<anonymous> (SearchBar.kt:559)");
            }
            m5486FullScreenSearchBarLayoutBXK5RNM(searchBarState, predictiveBackState, ComposableLambdaKt.rememberComposableLambda(-1926369040, true, new p() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda24
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SearchBarKt.ExpandedFullScreenContainedSearchBar__UtchM0$lambda$1$0(focusRequester, pVar2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), PaddingKt.m2750PaddingValuesYgX7TsA$default(FullScreenExpandedHorizontalPadding, 0.0f, 2, null), modifier, shape, searchBarColors, f2, f3, (WindowInsets) pVar.invoke(composer, 0), true, qVar, composer, (i3 & 112) | DisplayStrings.DS_CATEGORY_SEARCH_AMENITIES_FILTER_CHARGING_STATION, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ExpandedFullScreenContainedSearchBar__UtchM0$lambda$1$0(FocusRequester focusRequester, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1926369040, i2, -1, "androidx.compose.material3.ExpandedFullScreenContainedSearchBar.<anonymous>.<anonymous> (SearchBar.kt:563)");
            }
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(Modifier.Companion, focusRequester);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            int iM = SearchBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFocusRequester);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab ExpandedFullScreenContainedSearchBar__UtchM0$lambda$2(SearchBarState searchBarState, p pVar, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f2, float f3, p pVar2, DialogProperties dialogProperties, q qVar, int i2, int i3, Composer composer, int i4) {
        m5484ExpandedFullScreenContainedSearchBar_UtchM0(searchBarState, pVar, modifier, shape, searchBarColors, f2, f3, pVar2, dialogProperties, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011c  */
    /* renamed from: ExpandedFullScreenSearchBar-_UtchM0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5485ExpandedFullScreenSearchBar_UtchM0(final androidx.compose.material3.SearchBarState r26, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r27, androidx.compose.ui.Modifier r28, androidx.compose.ui.graphics.Shape r29, androidx.compose.material3.SearchBarColors r30, float r31, float r32, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.foundation.layout.WindowInsets> r33, androidx.compose.ui.window.DialogProperties r34, final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarKt.m5485ExpandedFullScreenSearchBar_UtchM0(androidx.compose.material3.SearchBarState, h.g.a.p, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, float, h.g.a.p, androidx.compose.ui.window.DialogProperties, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void ExpandedFullScreenSearchBarImpl(final androidx.compose.material3.SearchBarState r19, androidx.compose.ui.window.DialogProperties r20, final h.g.a.r<? super androidx.compose.ui.focus.FocusRequester, ? super androidx.compose.material3.internal.PredictiveBackState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarKt.ExpandedFullScreenSearchBarImpl(androidx.compose.material3.SearchBarState, androidx.compose.ui.window.DialogProperties, h.g.a.r, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab ExpandedFullScreenSearchBarImpl$lambda$0(SearchBarState searchBarState, DialogProperties dialogProperties, r rVar, int i2, int i3, Composer composer, int i4) {
        ExpandedFullScreenSearchBarImpl(searchBarState, dialogProperties, rVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ExpandedFullScreenSearchBarImpl$lambda$1$0(af afVar, SearchBarState searchBarState) {
        aj.z(afVar, null, null, new SearchBarKt$ExpandedFullScreenSearchBarImpl$2$1$1(searchBarState, null), 3);
        return ab.f48028a;
    }

    static final ab ExpandedFullScreenSearchBarImpl$lambda$2(r rVar, SearchBarState searchBarState, PredictiveBackState predictiveBackState, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= true != ((i2 & 8) == 0 ? composer.changed(predictiveBackState) : composer.changedInstance(predictiveBackState)) ? 2 : 4;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1825392111, i2, -1, "androidx.compose.material3.ExpandedFullScreenSearchBarImpl.<anonymous> (SearchBar.kt:670)");
            }
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new FocusRequester();
                composer.updateRememberedValue(objRememberedValue);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            rVar.invoke(focusRequester, predictiveBackState, composer, Integer.valueOf(((i2 << 3) & 112) | 6));
            ab abVar = ab.f48028a;
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (p) new SearchBarKt$ExpandedFullScreenSearchBarImpl$3$1$1(focusRequester, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(abVar, (p<? super af, ? super e<? super ab>, ? extends Object>) objRememberedValue2, composer, 6);
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composer.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            SearchBarValue targetValue = searchBarState.getTargetValue();
            boolean zChanged = composer.changed(searchBarState) | composer.changed(softwareKeyboardController);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = (p) new SearchBarKt$ExpandedFullScreenSearchBarImpl$3$2$1(searchBarState, softwareKeyboardController, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(targetValue, (p<? super af, ? super e<? super ab>, ? extends Object>) objRememberedValue3, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab ExpandedFullScreenSearchBarImpl$lambda$3(SearchBarState searchBarState, DialogProperties dialogProperties, r rVar, int i2, int i3, Composer composer, int i4) {
        ExpandedFullScreenSearchBarImpl(searchBarState, dialogProperties, rVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final WindowInsets ExpandedFullScreenSearchBar__UtchM0$lambda$0(Composer composer, int i2) {
        composer.startReplaceGroup(-2028768625);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2028768625, i2, -1, "androidx.compose.material3.ExpandedFullScreenSearchBar.<anonymous> (SearchBar.kt:620)");
        }
        WindowInsets fullScreenWindowInsets = SearchBarDefaults.INSTANCE.getFullScreenWindowInsets(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return fullScreenWindowInsets;
    }

    static final ab ExpandedFullScreenSearchBar__UtchM0$lambda$1(SearchBarState searchBarState, Modifier modifier, Shape shape, final SearchBarColors searchBarColors, float f2, float f3, p pVar, final p pVar2, final q qVar, final FocusRequester focusRequester, PredictiveBackState predictiveBackState, Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = i2 | (true != composer.changed(focusRequester) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? composer.changed(predictiveBackState) : composer.changedInstance(predictiveBackState)) ? 16 : 32;
        }
        if (composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1121571796, i3, -1, "androidx.compose.material3.ExpandedFullScreenSearchBar.<anonymous> (SearchBar.kt:628)");
            }
            m5486FullScreenSearchBarLayoutBXK5RNM(searchBarState, predictiveBackState, ComposableLambdaKt.rememberComposableLambda(-1695579103, true, new p() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda18
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SearchBarKt.ExpandedFullScreenSearchBar__UtchM0$lambda$1$0(focusRequester, pVar2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), PaddingKt.m2750PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null), modifier, shape, searchBarColors, f2, f3, (WindowInsets) pVar.invoke(composer, 0), false, ComposableLambdaKt.rememberComposableLambda(577596443, true, new q() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda19
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SearchBarKt.ExpandedFullScreenSearchBar__UtchM0$lambda$1$1(searchBarColors, qVar, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, (i3 & 112) | DisplayStrings.DS_CATEGORY_SEARCH_AMENITIES_FILTER_CHARGING_STATION, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ExpandedFullScreenSearchBar__UtchM0$lambda$1$0(FocusRequester focusRequester, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1695579103, i2, -1, "androidx.compose.material3.ExpandedFullScreenSearchBar.<anonymous>.<anonymous> (SearchBar.kt:632)");
            }
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(Modifier.Companion, focusRequester);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            int iM = SearchBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFocusRequester);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ExpandedFullScreenSearchBar__UtchM0$lambda$1$1(SearchBarColors searchBarColors, q qVar, ColumnScope columnScope, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= true != composer.changed(columnScope) ? 2 : 4;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(577596443, i2, -1, "androidx.compose.material3.ExpandedFullScreenSearchBar.<anonymous>.<anonymous> (SearchBar.kt:648)");
            }
            DividerKt.m4778HorizontalDivider9IZ8Weo(null, 0.0f, searchBarColors.m5441getDividerColor0d7_KjU(), composer, 0, 3);
            qVar.invoke(columnScope, composer, Integer.valueOf(i2 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab ExpandedFullScreenSearchBar__UtchM0$lambda$2(SearchBarState searchBarState, p pVar, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f2, float f3, p pVar2, DialogProperties dialogProperties, q qVar, int i2, int i3, Composer composer, int i4) {
        m5485ExpandedFullScreenSearchBar_UtchM0(searchBarState, pVar, modifier, shape, searchBarColors, f2, f3, pVar2, dialogProperties, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: FullScreenSearchBarLayout-BXK5RNM, reason: not valid java name */
    private static final void m5486FullScreenSearchBarLayoutBXK5RNM(final SearchBarState searchBarState, final PredictiveBackState predictiveBackState, final p<? super Composer, ? super Integer, ab> pVar, final PaddingValues paddingValues, final Modifier modifier, final Shape shape, final SearchBarColors searchBarColors, final float f2, final float f3, final WindowInsets windowInsets, final boolean z, final q<? super ColumnScope, ? super Composer, ? super Integer, ab> qVar, Composer composer, final int i2, final int i3) {
        int i4;
        float f4;
        boolean z2;
        int i5;
        final Shape shape2;
        Composer composer2;
        int i6;
        final MutableState mutableState;
        int i7 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1058700950);
        if (i7 == 0) {
            i4 = (true != composerStartRestartGroup.changed(searchBarState) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != ((i2 & 64) == 0 ? composerStartRestartGroup.changed(predictiveBackState) : composerStartRestartGroup.changedInstance(predictiveBackState)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changed(paddingValues) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != composerStartRestartGroup.changed(modifier) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changed(shape) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changed(searchBarColors) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            f4 = f2;
            i4 |= true != composerStartRestartGroup.changed(f4) ? 4194304 : 8388608;
        } else {
            f4 = f2;
        }
        if ((100663296 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changed(f3) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if ((805306368 & i2) == 0) {
            z2 = true;
            i4 |= true != composerStartRestartGroup.changed(windowInsets) ? 268435456 : 536870912;
        } else {
            z2 = true;
        }
        int i8 = i4;
        if ((i3 & 6) == 0) {
            i5 = i3 | (z2 != composerStartRestartGroup.changed(z) ? 2 : 4);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= z2 != composerStartRestartGroup.changedInstance(qVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute(((i8 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1058700950, i8, i5, "androidx.compose.material3.FullScreenSearchBarLayout (SearchBar.kt:3453)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new a() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda67
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return predictiveBackState.getValue();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            State state = (State) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            int i9 = i5;
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            BackEventProgress backEventProgressFullScreenSearchBarLayout_BXK5RNM$lambda$1 = FullScreenSearchBarLayout_BXK5RNM$lambda$1(state);
            if (backEventProgressFullScreenSearchBarLayout_BXK5RNM$lambda$1 instanceof BackEventProgress.InProgress) {
                if (mutableState2.getValue() == null) {
                    mutableState2.setValue(backEventProgressFullScreenSearchBarLayout_BXK5RNM$lambda$1);
                }
            } else if (x.n(backEventProgressFullScreenSearchBarLayout_BXK5RNM$lambda$1, BackEventProgress.NotRunning.INSTANCE)) {
                mutableState2.setValue(null);
            } else if (!x.n(backEventProgressFullScreenSearchBarLayout_BXK5RNM$lambda$1, BackEventProgress.Completed.INSTANCE)) {
                throw new h.i();
            }
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                objRememberedValue3 = mutableStateMutableStateOf$default;
            }
            MutableState mutableState3 = (MutableState) objRememberedValue3;
            BackEventProgress backEventProgressFullScreenSearchBarLayout_BXK5RNM$lambda$12 = FullScreenSearchBarLayout_BXK5RNM$lambda$1(state);
            if (backEventProgressFullScreenSearchBarLayout_BXK5RNM$lambda$12 instanceof BackEventProgress.InProgress) {
                mutableState3.setValue(backEventProgressFullScreenSearchBarLayout_BXK5RNM$lambda$12);
            } else if (x.n(backEventProgressFullScreenSearchBarLayout_BXK5RNM$lambda$12, BackEventProgress.NotRunning.INSTANCE)) {
                mutableState3.setValue(null);
            } else if (!x.n(backEventProgressFullScreenSearchBarLayout_BXK5RNM$lambda$12, BackEventProgress.Completed.INSTANCE)) {
                throw new h.i();
            }
            final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            final Shape fullScreenShape = SearchBarDefaults.INSTANCE.getFullScreenShape(composerStartRestartGroup, 6);
            boolean zChanged = composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(fullScreenShape);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == Composer.Companion.getEmpty()) {
                i6 = 1;
                mutableState = mutableState3;
                q qVar2 = new q() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda68
                    @Override // h.g.a.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return SearchBarKt.FullScreenSearchBarLayout_BXK5RNM$lambda$6$0(shape, fullScreenShape, density, searchBarState, mutableState, (Path) obj, (Size) obj2, (LayoutDirection) obj3);
                    }
                };
                shape2 = shape;
                objRememberedValue4 = new GenericShape(qVar2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                shape2 = shape;
                mutableState = mutableState3;
                i6 = 1;
            }
            GenericShape genericShape = (GenericShape) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = new MutableWindowInsets(null, i6, 0 == true ? 1 : 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final MutableWindowInsets mutableWindowInsets = (MutableWindowInsets) objRememberedValue5;
            WindowInsets windowInsetsM2850onlybOOhFvg = WindowInsetsKt.m2850onlybOOhFvg(mutableWindowInsets.getInsets(), WindowInsetsSides.m2860plusgK_yJZ4(WindowInsetsSides.Companion.m2870getHorizontalJoeWqyM(), WindowInsetsSides.Companion.m2868getBottomJoeWqyM()));
            int i10 = 1879048192 & i8;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (i10 == 536870912 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = new l() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda69
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return SearchBarKt.FullScreenSearchBarLayout_BXK5RNM$lambda$8$0(mutableWindowInsets, windowInsets, (WindowInsets) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            Modifier modifierConsumeWindowInsets = WindowInsetsPaddingKt.consumeWindowInsets(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(modifier, (l) objRememberedValue6), windowInsets);
            boolean zChanged2 = ((i8 & 7168) == 2048) | composerStartRestartGroup.changed(mutableState) | ((i8 & 14) == 4) | ((i9 & 14) == 4) | composerStartRestartGroup.changed(mutableState2);
            SearchBarKt$FullScreenSearchBarLayout$2$1 searchBarKt$FullScreenSearchBarLayout$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || searchBarKt$FullScreenSearchBarLayout$2$1RememberedValue == Composer.Companion.getEmpty()) {
                searchBarKt$FullScreenSearchBarLayout$2$1RememberedValue = new SearchBarKt$FullScreenSearchBarLayout$2$1(mutableState, searchBarState, z, paddingValues, mutableWindowInsets, mutableState2);
                composerStartRestartGroup.updateRememberedValue(searchBarKt$FullScreenSearchBarLayout$2$1RememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) searchBarKt$FullScreenSearchBarLayout$2$1RememberedValue;
            int iM = SearchBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierConsumeWindowInsets);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            Modifier modifierClip = ClipKt.clip(PaddingKt.padding(LayoutIdKt.layoutId(Modifier.Companion, LayoutIdInputField), WindowInsetsKt.asPaddingValues(WindowInsetsKt.m2850onlybOOhFvg(windowInsetsM2850onlybOOhFvg, WindowInsetsSides.Companion.m2870getHorizontalJoeWqyM()), composerStartRestartGroup, 0)), shape2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            int iM2 = SearchBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierClip);
            a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composerStartRestartGroup, Integer.valueOf((i8 >> 6) & 14));
            composerStartRestartGroup.endNode();
            int i11 = i8 >> 9;
            SurfaceKt.m5669SurfaceT9BRK9s(LayoutIdKt.layoutId(Modifier.Companion, LayoutIdSurface), genericShape, searchBarColors.m5440getContainerColor0d7_KjU(), ColorSchemeKt.m4593contentColorForek8zF_U(searchBarColors.m5440getContainerColor0d7_KjU(), composerStartRestartGroup, 0), f4, f3, null, ComposableSingletons$SearchBarKt.INSTANCE.getLambda$1464724888$material3(), composerStartRestartGroup, (57344 & i11) | 12582918 | (i11 & 458752), 64);
            composer2 = composerStartRestartGroup;
            Modifier modifierPadding = PaddingKt.padding(LayoutIdKt.layoutId(Modifier.Companion, LayoutIdSearchContent), WindowInsetsKt.asPaddingValues(windowInsetsM2850onlybOOhFvg, composer2, 0));
            int i12 = (i9 << 6) & 7168;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
            int iM3 = SearchBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierPadding);
            a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Updater.m7351setimpl(composer2, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer2, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer2, Integer.valueOf(iM3), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer2, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer2, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            qVar.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i12 >> 6) & 112) | 6));
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            shape2 = shape;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda70
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SearchBarKt.FullScreenSearchBarLayout_BXK5RNM$lambda$11(searchBarState, predictiveBackState, pVar, paddingValues, modifier, shape2, searchBarColors, f2, f3, windowInsets, z, qVar, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final BackEventProgress FullScreenSearchBarLayout_BXK5RNM$lambda$1(State<? extends BackEventProgress> state) {
        return state.getValue();
    }

    static final ab FullScreenSearchBarLayout_BXK5RNM$lambda$11(SearchBarState searchBarState, PredictiveBackState predictiveBackState, p pVar, PaddingValues paddingValues, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f2, float f3, WindowInsets windowInsets, boolean z, q qVar, int i2, int i3, Composer composer, int i4) {
        m5486FullScreenSearchBarLayoutBXK5RNM(searchBarState, predictiveBackState, pVar, paddingValues, modifier, shape, searchBarColors, f2, f3, windowInsets, z, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab FullScreenSearchBarLayout_BXK5RNM$lambda$6$0(Shape shape, Shape shape2, Density density, SearchBarState searchBarState, MutableState mutableState, Path path, Size size, LayoutDirection layoutDirection) {
        if (shape == RoundedCornerShapeKt.getCircleShape() && shape2 == RectangleShapeKt.getRectangleShape()) {
            if (density.mo2127toPx0680j_4(SearchBarCornerRadius * Math.max(1.0f - searchBarState.getProgress(), transform((BackEventProgress.InProgress) mutableState.getValue()))) < 0.001d) {
                Path.CC.addRect$default(path, androidx.compose.ui.geometry.SizeKt.m8070toRectuvyYCjk(size.m8054unboximpl()), null, 2, null);
            } else {
                Path.CC.addRoundRect$default(path, RoundRectKt.m8035RoundRectsniSvfs(androidx.compose.ui.geometry.SizeKt.m8070toRectuvyYCjk(size.m8054unboximpl()), (Float.floatToRawIntBits(r4) << 32) | (Float.floatToRawIntBits(r4) & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), null, 2, null);
            }
        } else {
            if (searchBarState.getProgress() >= 0.5f) {
                shape = shape2;
            }
            OutlineKt.addOutline(path, shape.mo2037createOutlinePq9zytI(size.m8054unboximpl(), layoutDirection, density));
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab FullScreenSearchBarLayout_BXK5RNM$lambda$8$0(MutableWindowInsets mutableWindowInsets, WindowInsets windowInsets, WindowInsets windowInsets2) {
        mutableWindowInsets.setInsets(WindowInsetsKt.exclude(windowInsets, windowInsets2));
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:234:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010f  */
    /* renamed from: SearchBar-WuY5d9Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5487SearchBarWuY5d9Q(final java.lang.String r35, final h.g.a.l<? super java.lang.String, h.ab> r36, final h.g.a.l<? super java.lang.String, h.ab> r37, final boolean r38, final h.g.a.l<? super java.lang.Boolean, h.ab> r39, androidx.compose.ui.Modifier r40, boolean r41, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r42, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r43, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r44, androidx.compose.ui.graphics.Shape r45, androidx.compose.material3.SearchBarColors r46, float r47, float r48, androidx.compose.foundation.layout.WindowInsets r49, androidx.compose.foundation.interaction.MutableInteractionSource r50, final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r51, androidx.compose.runtime.Composer r52, final int r53, final int r54, final int r55) {
        /*
            Method dump skipped, instructions count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarKt.m5487SearchBarWuY5d9Q(java.lang.String, h.g.a.l, h.g.a.l, boolean, h.g.a.l, androidx.compose.ui.Modifier, boolean, h.g.a.p, h.g.a.p, h.g.a.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.foundation.interaction.MutableInteractionSource, h.g.a.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0128  */
    /* renamed from: SearchBar-Y92LkZI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5488SearchBarY92LkZI(final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r31, final boolean r32, final h.g.a.l<? super java.lang.Boolean, h.ab> r33, androidx.compose.ui.Modifier r34, androidx.compose.ui.graphics.Shape r35, androidx.compose.material3.SearchBarColors r36, float r37, float r38, androidx.compose.foundation.layout.WindowInsets r39, final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarKt.m5488SearchBarY92LkZI(h.g.a.p, boolean, h.g.a.l, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, float, androidx.compose.foundation.layout.WindowInsets, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d3  */
    /* renamed from: SearchBar-nbWgWpA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5489SearchBarnbWgWpA(final androidx.compose.material3.SearchBarState r24, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r25, androidx.compose.ui.Modifier r26, androidx.compose.ui.graphics.Shape r27, androidx.compose.material3.SearchBarColors r28, float r29, float r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarKt.m5489SearchBarnbWgWpA(androidx.compose.material3.SearchBarState, h.g.a.p, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* renamed from: SearchBarImpl-j1jLAyQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5490SearchBarImplj1jLAyQ(final androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r28, final androidx.compose.runtime.MutableFloatState r29, final androidx.compose.runtime.MutableState<androidx.activity.BackEventCompat> r30, final androidx.compose.runtime.MutableState<androidx.activity.BackEventCompat> r31, androidx.compose.ui.Modifier r32, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r33, androidx.compose.ui.graphics.Shape r34, androidx.compose.material3.SearchBarColors r35, float r36, float r37, androidx.compose.foundation.layout.WindowInsets r38, final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r39, androidx.compose.runtime.Composer r40, final int r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 917
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarKt.m5490SearchBarImplj1jLAyQ(androidx.compose.animation.core.Animatable, androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.ui.Modifier, h.g.a.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, float, androidx.compose.foundation.layout.WindowInsets, h.g.a.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SearchBarImpl_j1jLAyQ$lambda$0$0(Animatable animatable) {
        return ((Number) animatable.getValue()).floatValue() == 1.0f;
    }

    private static final boolean SearchBarImpl_j1jLAyQ$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab SearchBarImpl_j1jLAyQ$lambda$2$0(Density density, Animatable animatable, Path path, Size size, LayoutDirection layoutDirection) {
        float fMo2127toPx0680j_4 = density.mo2127toPx0680j_4(SearchBarCornerRadius * (1.0f - ((Number) animatable.getValue()).floatValue()));
        Path.CC.addRoundRect$default(path, RoundRectKt.m8035RoundRectsniSvfs(androidx.compose.ui.geometry.SizeKt.m8070toRectuvyYCjk(size.m8054unboximpl()), (Float.floatToRawIntBits(fMo2127toPx0680j_4) << 32) | (Float.floatToRawIntBits(fMo2127toPx0680j_4) & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), null, 2, null);
        return ab.f48028a;
    }

    static final ab SearchBarImpl_j1jLAyQ$lambda$3(Shape shape, SearchBarColors searchBarColors, float f2, float f3, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1304392981, i2, -1, "androidx.compose.material3.SearchBarImpl.<anonymous> (SearchBar.kt:3094)");
            }
            SurfaceKt.m5669SurfaceT9BRK9s(null, shape, searchBarColors.m5440getContainerColor0d7_KjU(), ColorSchemeKt.m4593contentColorForek8zF_U(searchBarColors.m5440getContainerColor0d7_KjU(), composer, 0), f2, f3, null, ComposableSingletons$SearchBarKt.INSTANCE.getLambda$1165377840$material3(), composer, 12582912, 65);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SearchBarImpl_j1jLAyQ$lambda$4$0(Animatable animatable) {
        return ((Number) animatable.getValue()).floatValue() > 0.0f;
    }

    private static final boolean SearchBarImpl_j1jLAyQ$lambda$5(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    static final ab SearchBarImpl_j1jLAyQ$lambda$6(final Animatable animatable, SearchBarColors searchBarColors, final q qVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1831594093, i2, -1, "androidx.compose.material3.SearchBarImpl.<anonymous> (SearchBar.kt:3110)");
            }
            Modifier.Companion companion = Modifier.Companion;
            boolean zChangedInstance = composer.changedInstance(animatable);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda41
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return SearchBarKt.SearchBarImpl_j1jLAyQ$lambda$6$0$0(animatable, (GraphicsLayerScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (l) objRememberedValue);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int iM = SearchBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierGraphicsLayer);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            final ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            DividerKt.m4778HorizontalDivider9IZ8Weo(null, 0.0f, searchBarColors.m5441getDividerColor0d7_KjU(), composer, 0, 3);
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(ColorSchemeKt.m4593contentColorForek8zF_U(searchBarColors.m5440getContainerColor0d7_KjU(), composer, 0))), ComposableLambdaKt.rememberComposableLambda(1144253731, true, new p() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda42
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SearchBarKt.SearchBarImpl_j1jLAyQ$lambda$6$1$0(qVar, columnScopeInstance, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, ProvidedValue.$stable | 48);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab SearchBarImpl_j1jLAyQ$lambda$6$0$0(Animatable animatable, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(((Number) animatable.getValue()).floatValue());
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab SearchBarImpl_j1jLAyQ$lambda$6$1$0(q qVar, ColumnScope columnScope, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1144253731, i2, -1, "androidx.compose.material3.SearchBarImpl.<anonymous>.<anonymous>.<anonymous> (SearchBar.kt:3115)");
            }
            qVar.invoke(columnScope, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab SearchBarImpl_j1jLAyQ$lambda$7(Animatable animatable, MutableFloatState mutableFloatState, MutableState mutableState, MutableState mutableState2, Modifier modifier, p pVar, Shape shape, SearchBarColors searchBarColors, float f2, float f3, WindowInsets windowInsets, q qVar, int i2, int i3, int i4, Composer composer, int i5) {
        m5490SearchBarImplj1jLAyQ(animatable, mutableFloatState, mutableState, mutableState2, modifier, pVar, shape, searchBarColors, f2, f3, windowInsets, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void SearchBarLayout(final Animatable<Float, AnimationVector1D> animatable, final MutableFloatState mutableFloatState, final MutableState<BackEventCompat> mutableState, final MutableState<BackEventCompat> mutableState2, final Modifier modifier, final WindowInsets windowInsets, final p<? super Composer, ? super Integer, ab> pVar, final p<? super Composer, ? super Integer, ab> pVar2, final p<? super Composer, ? super Integer, ab> pVar3, Composer composer, final int i2) {
        int i3;
        MutableState<BackEventCompat> mutableState3;
        MutableState<BackEventCompat> mutableState4;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1217602934);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composerStartRestartGroup.changed(animatable) : composerStartRestartGroup.changedInstance(animatable)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(mutableFloatState) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            mutableState3 = mutableState;
            i3 |= true != composerStartRestartGroup.changed(mutableState3) ? 128 : 256;
        } else {
            mutableState3 = mutableState;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            mutableState4 = mutableState2;
            i3 |= true != composerStartRestartGroup.changed(mutableState4) ? 1024 : 2048;
        } else {
            mutableState4 = mutableState2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(windowInsets) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar3) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if (composerStartRestartGroup.shouldExecute((38347923 & i3) != 38347922, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1217602934, i3, -1, "androidx.compose.material3.SearchBarLayout (SearchBar.kt:3146)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new MutableWindowInsets(null, 1, null == true ? 1 : 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableWindowInsets mutableWindowInsets = (MutableWindowInsets) objRememberedValue;
            Modifier modifierZIndex = ZIndexModifierKt.zIndex(modifier, 1.0f);
            int i5 = 458752 & i3;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (i5 == 131072 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new l() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda25
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return SearchBarKt.SearchBarLayout$lambda$1$0(mutableWindowInsets, windowInsets, (WindowInsets) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierConsumeWindowInsets = WindowInsetsPaddingKt.consumeWindowInsets(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(modifierZIndex, (l) objRememberedValue2), windowInsets);
            boolean z = (i3 & 14) == 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(animatable));
            boolean z2 = (i3 & 7168) == 2048;
            boolean z3 = (i3 & 112) == 32;
            int i6 = i3;
            boolean z4 = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            SearchBarKt$SearchBarLayout$2$1 searchBarKt$SearchBarLayout$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z4 | z3 | z | z2) || searchBarKt$SearchBarLayout$2$1RememberedValue == Composer.Companion.getEmpty()) {
                searchBarKt$SearchBarLayout$2$1RememberedValue = new SearchBarKt$SearchBarLayout$2$1(animatable, mutableWindowInsets, mutableState4, mutableFloatState, mutableState3);
                composerStartRestartGroup.updateRememberedValue(searchBarKt$SearchBarLayout$2$1RememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) searchBarKt$SearchBarLayout$2$1RememberedValue;
            int iM = SearchBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierConsumeWindowInsets);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.Companion, LayoutIdSurface);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            int iM2 = SearchBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId);
            a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar2.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 21) & 14));
            composerStartRestartGroup.endNode();
            Modifier modifierLayoutId2 = LayoutIdKt.layoutId(Modifier.Companion, LayoutIdInputField);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            int iM3 = SearchBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId2);
            a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM3), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            pVar.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 18) & 14));
            composerStartRestartGroup.endNode();
            if (pVar3 == null) {
                composerStartRestartGroup.startReplaceGroup(2058820276);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(2058820277);
                Modifier modifierLayoutId3 = LayoutIdKt.layoutId(Modifier.Companion, LayoutIdSearchContent);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
                int iM4 = SearchBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId3);
                a<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM4), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                pVar3.invoke(composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda26
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SearchBarKt.SearchBarLayout$lambda$4(animatable, mutableFloatState, mutableState, mutableState2, modifier, windowInsets, pVar, pVar2, pVar3, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab SearchBarLayout$lambda$1$0(MutableWindowInsets mutableWindowInsets, WindowInsets windowInsets, WindowInsets windowInsets2) {
        mutableWindowInsets.setInsets(WindowInsetsKt.exclude(windowInsets, windowInsets2));
        return ab.f48028a;
    }

    static final ab SearchBarLayout$lambda$4(Animatable animatable, MutableFloatState mutableFloatState, MutableState mutableState, MutableState mutableState2, Modifier modifier, WindowInsets windowInsets, p pVar, p pVar2, p pVar3, int i2, Composer composer, int i3) {
        SearchBarLayout(animatable, mutableFloatState, mutableState, mutableState2, modifier, windowInsets, pVar, pVar2, pVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab SearchBar_WuY5d9Q$lambda$0(SearchBarColors searchBarColors, String str, l lVar, l lVar2, boolean z, l lVar3, boolean z2, p pVar, p pVar2, p pVar3, MutableInteractionSource mutableInteractionSource, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1597173218, i2, -1, "androidx.compose.material3.SearchBar.<anonymous> (SearchBar.kt:2934)");
            }
            SearchBarDefaults.INSTANCE.InputField(str, lVar, lVar2, z, lVar3, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), z2, pVar, pVar2, pVar3, searchBarColors.getInputFieldColors(), mutableInteractionSource, composer, 196608, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab SearchBar_WuY5d9Q$lambda$1(String str, l lVar, l lVar2, boolean z, l lVar3, Modifier modifier, boolean z2, p pVar, p pVar2, p pVar3, Shape shape, SearchBarColors searchBarColors, float f2, float f3, WindowInsets windowInsets, MutableInteractionSource mutableInteractionSource, q qVar, int i2, int i3, int i4, Composer composer, int i5) {
        m5487SearchBarWuY5d9Q(str, lVar, lVar2, z, lVar3, modifier, z2, pVar, pVar2, pVar3, shape, searchBarColors, f2, f3, windowInsets, mutableInteractionSource, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab SearchBar_Y92LkZI$lambda$7(p pVar, boolean z, l lVar, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f2, float f3, WindowInsets windowInsets, q qVar, int i2, int i3, Composer composer, int i4) {
        m5488SearchBarY92LkZI(pVar, z, lVar, modifier, shape, searchBarColors, f2, f3, windowInsets, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab SearchBar_nbWgWpA$lambda$0(Modifier modifier, final SearchBarState searchBarState, Shape shape, SearchBarColors searchBarColors, float f2, float f3, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-615762271, i2, -1, "androidx.compose.material3.SearchBar.<anonymous> (SearchBar.kt:268)");
            }
            boolean zChanged = composer.changed(searchBarState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda62
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return SearchBarKt.SearchBar_nbWgWpA$lambda$0$0$0(searchBarState, (LayoutCoordinates) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            SurfaceKt.m5669SurfaceT9BRK9s(OnGloballyPositionedModifierKt.onGloballyPositioned(modifier, (l) objRememberedValue), shape, searchBarColors.m5440getContainerColor0d7_KjU(), ColorSchemeKt.m4593contentColorForek8zF_U(searchBarColors.m5440getContainerColor0d7_KjU(), composer, 0), f2, f3, null, pVar, composer, 0, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab SearchBar_nbWgWpA$lambda$0$0$0(SearchBarState searchBarState, LayoutCoordinates layoutCoordinates) {
        searchBarState.setCollapsedCoords(layoutCoordinates);
        return ab.f48028a;
    }

    static final ab SearchBar_nbWgWpA$lambda$1(SearchBarState searchBarState, p pVar, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f2, float f3, int i2, int i3, Composer composer, int i4) {
        m5489SearchBarnbWgWpA(searchBarState, pVar, modifier, shape, searchBarColors, f2, f3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010e  */
    /* renamed from: TopSearchBar-qKj4JfE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5491TopSearchBarqKj4JfE(final androidx.compose.material3.SearchBarState r28, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r29, androidx.compose.ui.Modifier r30, androidx.compose.ui.graphics.Shape r31, androidx.compose.material3.SearchBarColors r32, float r33, float r34, androidx.compose.foundation.layout.WindowInsets r35, androidx.compose.material3.SearchBarScrollBehavior r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarKt.m5491TopSearchBarqKj4JfE(androidx.compose.material3.SearchBarState, h.g.a.p, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.SearchBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab TopSearchBar_qKj4JfE$lambda$0(SearchBarState searchBarState, p pVar, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f2, float f3, WindowInsets windowInsets, SearchBarScrollBehavior searchBarScrollBehavior, int i2, int i3, Composer composer, int i4) {
        m5491TopSearchBarqKj4JfE(searchBarState, pVar, modifier, shape, searchBarColors, f2, f3, windowInsets, searchBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    public static final long appBarContainerColor(AppBarWithSearchColors appBarWithSearchColors, float f2) {
        return Color.m8229equalsimpl0(appBarWithSearchColors.m4371getScrolledAppBarContainerColor0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU()) ? appBarWithSearchColors.m4369getAppBarContainerColor0d7_KjU() : ColorKt.m8279lerpjxsXWHM(appBarWithSearchColors.m4369getAppBarContainerColor0d7_KjU(), appBarWithSearchColors.m4371getScrolledAppBarContainerColor0d7_KjU(), EasingKt.getFastOutLinearInEasing().transform(f2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackMultiplier(BackEventCompat backEventCompat, float f2, float f3) {
        if (backEventCompat == null) {
            return 0.0f;
        }
        if (Float.isNaN(f3)) {
            return 1.0f;
        }
        if (f3 <= 0.0f) {
            return 0.0f;
        }
        return f2 / f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculatePredictiveBackOffsetX-rOvwMX4, reason: not valid java name */
    public static final int m5494calculatePredictiveBackOffsetXrOvwMX4(long j2, int i2, BackEventCompat backEventCompat, LayoutDirection layoutDirection, float f2, float f3) {
        if (backEventCompat == null || f3 == 0.0f) {
            return 0;
        }
        return h.h.a.b(((Constraints.m11107getMaxWidthimpl(j2) * SearchBarPredictiveBackMaxOffsetXRatio) - i2) * (1.0f - f2) * f3 * (backEventCompat.getSwipeEdge() == 0 ? 1 : -1) * (layoutDirection != LayoutDirection.Ltr ? -1 : 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculatePredictiveBackOffsetY-dzo92Q0, reason: not valid java name */
    public static final int m5495calculatePredictiveBackOffsetYdzo92Q0(long j2, int i2, BackEventCompat backEventCompat, BackEventCompat backEventCompat2, int i3, int i4, float f2) {
        if (backEventCompat2 == null || backEventCompat == null || f2 == 0.0f) {
            return 0;
        }
        int iMin = Math.min(Math.max(0, ((Constraints.m11106getMaxHeightimpl(j2) - i3) / 2) - i2), i4);
        float touchY = backEventCompat.getTouchY() - backEventCompat2.getTouchY();
        float fAbs = Math.abs(touchY) / Constraints.m11106getMaxHeightimpl(j2);
        return h.h.a.b(MathHelpersKt.lerp(0, iMin, fAbs) * f2 * Math.signum(touchY));
    }

    public static final float getAppBarWithSearchVerticalPadding() {
        return AppBarWithSearchVerticalPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRect getCollapsedBounds(SearchBarState searchBarState) {
        LayoutCoordinates collapsedCoords = searchBarState.getCollapsedCoords();
        if (collapsedCoords != null) {
            if (true != collapsedCoords.isAttached()) {
                collapsedCoords = null;
            }
            if (collapsedCoords != null) {
                return IntRectKt.m11329IntRectVbeCjmY(IntOffsetKt.m11313roundk4lQ0M(LayoutCoordinatesKt.positionInWindow(collapsedCoords)), collapsedCoords.mo9743getSizeYbymL2g());
            }
        }
        return IntRect.Companion.getZero();
    }

    public static final float getDockedExpandedTableMinHeight() {
        return DockedExpandedTableMinHeight;
    }

    public static final float getSearchBarAsTopBarPadding() {
        return SearchBarAsTopBarPadding;
    }

    public static final float getSearchBarMaxWidth() {
        return SearchBarMaxWidth;
    }

    public static final float getSearchBarMinWidth() {
        return SearchBarMinWidth;
    }

    public static final float getSearchBarVerticalPadding() {
        return SearchBarVerticalPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isExpanded(SearchBarState searchBarState) {
        return searchBarState.getCurrentValue() == SearchBarValue.Expanded;
    }

    public static final float overlappedFraction(SearchBarScrollBehavior searchBarScrollBehavior) {
        if (searchBarScrollBehavior.getScrollOffsetLimit() == 0.0f) {
            return 0.0f;
        }
        return 1.0f - (n.g(searchBarScrollBehavior.getScrollOffsetLimit() - searchBarScrollBehavior.getContentOffset(), searchBarScrollBehavior.getScrollOffsetLimit(), 0.0f) / searchBarScrollBehavior.getScrollOffsetLimit());
    }

    public static final SearchBarState rememberContainedSearchBarState(SearchBarValue searchBarValue, AnimationSpec<Float> animationSpec, AnimationSpec<Float> animationSpec2, AnimationSpec<Float> animationSpec3, AnimationSpec<Float> animationSpec4, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            searchBarValue = SearchBarValue.Collapsed;
        }
        final SearchBarValue searchBarValue2 = searchBarValue;
        if ((i3 & 2) != 0) {
            animationSpec = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composer, 6);
        }
        final AnimationSpec<Float> animationSpec5 = animationSpec;
        if ((i3 & 4) != 0) {
            animationSpec2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composer, 6);
        }
        final AnimationSpec<Float> animationSpec6 = animationSpec2;
        if ((i3 & 8) != 0) {
            animationSpec3 = AnimationForContentFadeInSpec;
        }
        final AnimationSpec<Float> animationSpec7 = animationSpec3;
        if ((i3 & 16) != 0) {
            animationSpec4 = AnimationForContentFadeOutSpec;
        }
        final AnimationSpec<Float> animationSpec8 = animationSpec4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2036707626, i2, -1, "androidx.compose.material3.rememberContainedSearchBarState (SearchBar.kt:1342)");
        }
        boolean z = true;
        Object[] objArr = {searchBarValue2, animationSpec5, animationSpec6, animationSpec7, animationSpec8};
        Saver<SearchBarState, ?> Saver = SearchBarState.Companion.Saver(animationSpec5, animationSpec6, animationSpec7, animationSpec8);
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(searchBarValue2.ordinal())) && (i2 & 6) != 4) {
            z = false;
        }
        boolean zChangedInstance = z | composer.changedInstance(animationSpec5) | composer.changedInstance(animationSpec6) | composer.changedInstance(animationSpec7) | composer.changedInstance(animationSpec8);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
            a aVar = new a() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda66
                @Override // h.g.a.a
                public final Object invoke() {
                    return SearchBarKt.rememberContainedSearchBarState$lambda$0$0(searchBarValue2, animationSpec5, animationSpec6, animationSpec7, animationSpec8);
                }
            };
            composer.updateRememberedValue(aVar);
            objRememberedValue = aVar;
        }
        SearchBarState searchBarState = (SearchBarState) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) Saver, (a) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return searchBarState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchBarState rememberContainedSearchBarState$lambda$0$0(SearchBarValue searchBarValue, AnimationSpec animationSpec, AnimationSpec animationSpec2, AnimationSpec animationSpec3, AnimationSpec animationSpec4) {
        return new SearchBarState(searchBarValue, animationSpec, animationSpec2, animationSpec3, animationSpec4);
    }

    public static final SearchBarState rememberSearchBarState(final SearchBarValue searchBarValue, final AnimationSpec<Float> animationSpec, final AnimationSpec<Float> animationSpec2, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            searchBarValue = SearchBarValue.Collapsed;
        }
        if ((i3 & 2) != 0) {
            animationSpec = MotionSchemeKt.value(MotionSchemeKeyTokens.SlowSpatial, composer, 6);
        }
        if ((i3 & 4) != 0) {
            animationSpec2 = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, composer, 6);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-546016819, i2, -1, "androidx.compose.material3.rememberSearchBarState (SearchBar.kt:1303)");
        }
        boolean z = true;
        Object[] objArr = {searchBarValue, animationSpec, animationSpec2};
        Saver<SearchBarState, ?> Saver = SearchBarState.Companion.Saver(animationSpec, animationSpec2);
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(searchBarValue.ordinal())) && (i2 & 6) != 4) {
            z = false;
        }
        boolean zChangedInstance = composer.changedInstance(animationSpec) | z | composer.changedInstance(animationSpec2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new a() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda11
                @Override // h.g.a.a
                public final Object invoke() {
                    return SearchBarKt.rememberSearchBarState$lambda$0$0(searchBarValue, animationSpec, animationSpec2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        SearchBarState searchBarState = (SearchBarState) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) Saver, (a) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return searchBarState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchBarState rememberSearchBarState$lambda$0$0(SearchBarValue searchBarValue, AnimationSpec animationSpec, AnimationSpec animationSpec2) {
        return new SearchBarState(searchBarValue, animationSpec, animationSpec2);
    }

    public static final SearchBarState rememberSearchBarWithGapState(SearchBarValue searchBarValue, AnimationSpec<Float> animationSpec, AnimationSpec<Float> animationSpec2, AnimationSpec<Float> animationSpec3, AnimationSpec<Float> animationSpec4, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            searchBarValue = SearchBarValue.Collapsed;
        }
        final SearchBarValue searchBarValue2 = searchBarValue;
        if ((i3 & 2) != 0) {
            animationSpec = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, composer, 6);
        }
        final AnimationSpec<Float> animationSpec5 = animationSpec;
        if ((i3 & 4) != 0) {
            animationSpec2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composer, 6);
        }
        final AnimationSpec<Float> animationSpec6 = animationSpec2;
        if ((i3 & 8) != 0) {
            animationSpec3 = AnimationForContentFadeInSpec;
        }
        final AnimationSpec<Float> animationSpec7 = animationSpec3;
        if ((i3 & 16) != 0) {
            animationSpec4 = AnimationForContentFadeOutSpec;
        }
        final AnimationSpec<Float> animationSpec8 = animationSpec4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1750686819, i2, -1, "androidx.compose.material3.rememberSearchBarWithGapState (SearchBar.kt:1387)");
        }
        boolean z = true;
        Object[] objArr = {searchBarValue2, animationSpec5, animationSpec6, animationSpec7, animationSpec8};
        Saver<SearchBarState, ?> Saver = SearchBarState.Companion.Saver(animationSpec5, animationSpec6, animationSpec7, animationSpec8);
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(searchBarValue2.ordinal())) && (i2 & 6) != 4) {
            z = false;
        }
        boolean zChangedInstance = z | composer.changedInstance(animationSpec5) | composer.changedInstance(animationSpec6) | composer.changedInstance(animationSpec7) | composer.changedInstance(animationSpec8);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
            a aVar = new a() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda44
                @Override // h.g.a.a
                public final Object invoke() {
                    return SearchBarKt.rememberSearchBarWithGapState$lambda$0$0(searchBarValue2, animationSpec5, animationSpec6, animationSpec7, animationSpec8);
                }
            };
            composer.updateRememberedValue(aVar);
            objRememberedValue = aVar;
        }
        SearchBarState searchBarState = (SearchBarState) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) Saver, (a) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return searchBarState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchBarState rememberSearchBarWithGapState$lambda$0$0(SearchBarValue searchBarValue, AnimationSpec animationSpec, AnimationSpec animationSpec2, AnimationSpec animationSpec3, AnimationSpec animationSpec4) {
        return new SearchBarState(searchBarValue, animationSpec, animationSpec2, animationSpec3, animationSpec4);
    }

    public static final long searchBarContainerColor(AppBarWithSearchColors appBarWithSearchColors, float f2) {
        return Color.m8229equalsimpl0(appBarWithSearchColors.m4372getScrolledSearchBarContainerColor0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU()) ? appBarWithSearchColors.getSearchBarColors().m5440getContainerColor0d7_KjU() : ColorKt.m8279lerpjxsXWHM(appBarWithSearchColors.getSearchBarColors().m5440getContainerColor0d7_KjU(), appBarWithSearchColors.m4372getScrolledSearchBarContainerColor0d7_KjU(), EasingKt.getFastOutLinearInEasing().transform(f2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float transform(BackEventProgress.InProgress inProgress) {
        if (inProgress == null) {
            return 0.0f;
        }
        return PredictiveBack.INSTANCE.transform$material3(inProgress.getProgress());
    }

    private static /* synthetic */ void getSearchBarCornerRadius$annotations() {
    }

    private static /* synthetic */ void getCollapsedBounds$annotations(SearchBarState searchBarState) {
    }

    private static /* synthetic */ void isExpanded$annotations(SearchBarState searchBarState) {
    }
}
