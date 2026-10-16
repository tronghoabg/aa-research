package androidx.compose.material3;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.FabBaselineTokens;
import androidx.compose.material3.tokens.FabMediumTokens;
import androidx.compose.material3.tokens.FloatingToolbarTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.c.e;
import h.g.a.a;
import h.g.a.p;
import h.g.b.o;
import h.k.f;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FloatingToolbarDefaults {
    public static final int $stable = 0;
    public static final FloatingToolbarDefaults INSTANCE = new FloatingToolbarDefaults();
    private static final float ContainerSize = FloatingToolbarTokens.INSTANCE.m6784getContainerHeightD9Ej5fM();
    private static final float ContainerExpandedElevation = ElevationTokens.INSTANCE.m6670getLevel0D9Ej5fM();
    private static final float ContainerCollapsedElevation = ElevationTokens.INSTANCE.m6670getLevel0D9Ej5fM();
    private static final float ContainerExpandedElevationWithFab = ElevationTokens.INSTANCE.m6671getLevel1D9Ej5fM();
    private static final float ContainerCollapsedElevationWithFab = ElevationTokens.INSTANCE.m6670getLevel0D9Ej5fM();
    private static final PaddingValues ContentPadding = PaddingKt.m2751PaddingValuesa9UjIt4(FloatingToolbarTokens.INSTANCE.m6785getContainerLeadingSpaceD9Ej5fM(), FloatingToolbarTokens.INSTANCE.m6785getContainerLeadingSpaceD9Ej5fM(), FloatingToolbarTokens.INSTANCE.m6786getContainerTrailingSpaceD9Ej5fM(), FloatingToolbarTokens.INSTANCE.m6786getContainerTrailingSpaceD9Ej5fM());
    private static final float ScreenOffset = FloatingToolbarTokens.INSTANCE.m6783getContainerExternalPaddingD9Ej5fM();
    private static final float ScrollDistanceThreshold = 40.0f;
    private static final f<Dp> FabSizeRange = n.c(Dp.m11162boximpl(FabBaselineTokens.INSTANCE.m6702getContainerWidthD9Ej5fM()), Dp.m11162boximpl(FabMediumTokens.INSTANCE.m6708getContainerWidthD9Ej5fM()));
    private static final float ToolbarToFabGap = 8.0f;

    private FloatingToolbarDefaults() {
    }

    static final ab StandardFloatingActionButton_vRFhKjU$lambda$0(FloatingToolbarDefaults floatingToolbarDefaults, a aVar, Modifier modifier, Shape shape, long j2, long j3, MutableInteractionSource mutableInteractionSource, p pVar, int i2, int i3, Composer composer, int i4) {
        floatingToolbarDefaults.m4897StandardFloatingActionButtonvRFhKjU(aVar, modifier, shape, j2, j3, mutableInteractionSource, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab VibrantFloatingActionButton_vRFhKjU$lambda$0(FloatingToolbarDefaults floatingToolbarDefaults, a aVar, Modifier modifier, Shape shape, long j2, long j3, MutableInteractionSource mutableInteractionSource, p pVar, int i2, int i3, Composer composer, int i4) {
        floatingToolbarDefaults.m4898VibrantFloatingActionButtonvRFhKjU(aVar, modifier, shape, j2, j3, mutableInteractionSource, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* renamed from: floatingToolbarVerticalNestedScroll-gKdo67w$default, reason: not valid java name */
    public static /* synthetic */ Modifier m4896floatingToolbarVerticalNestedScrollgKdo67w$default(FloatingToolbarDefaults floatingToolbarDefaults, Modifier modifier, boolean z, a aVar, a aVar2, float f2, float f3, boolean z2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            f2 = ScrollDistanceThreshold;
        }
        float f4 = f2;
        if ((i2 & 16) != 0) {
            f3 = ScrollDistanceThreshold;
        }
        return floatingToolbarDefaults.m4900floatingToolbarVerticalNestedScrollgKdo67w(modifier, z, aVar, aVar2, f4, f3, ((i2 & 32) == 0) & z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e9  */
    /* renamed from: StandardFloatingActionButton-vRFhKjU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4897StandardFloatingActionButtonvRFhKjU(final h.g.a.a<h.ab> r26, androidx.compose.ui.Modifier r27, androidx.compose.ui.graphics.Shape r28, long r29, long r31, androidx.compose.foundation.interaction.MutableInteractionSource r33, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingToolbarDefaults.m4897StandardFloatingActionButtonvRFhKjU(h.g.a.a, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.interaction.MutableInteractionSource, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e9  */
    /* renamed from: VibrantFloatingActionButton-vRFhKjU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4898VibrantFloatingActionButtonvRFhKjU(final h.g.a.a<h.ab> r26, androidx.compose.ui.Modifier r27, androidx.compose.ui.graphics.Shape r28, long r29, long r31, androidx.compose.foundation.interaction.MutableInteractionSource r33, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingToolbarDefaults.m4898VibrantFloatingActionButtonvRFhKjU(h.g.a.a, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.interaction.MutableInteractionSource, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    public final <T> FiniteAnimationSpec<T> animationSpec(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1357414174, i2, -1, "androidx.compose.material3.FloatingToolbarDefaults.animationSpec (FloatingToolbar.kt:795)");
        }
        FiniteAnimationSpec<T> finiteAnimationSpecValue = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return finiteAnimationSpecValue;
    }

    /* renamed from: exitAlwaysScrollBehavior-YyGo6vs, reason: not valid java name */
    public final FloatingToolbarScrollBehavior m4899exitAlwaysScrollBehaviorYyGo6vs(int i2, FloatingToolbarState floatingToolbarState, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, Composer composer, int i3, int i4) {
        if ((i4 & 2) != 0) {
            floatingToolbarState = FloatingToolbarKt.rememberFloatingToolbarState(0.0f, 0.0f, 0.0f, composer, 0, 7);
        }
        FloatingToolbarState floatingToolbarState2 = floatingToolbarState;
        if ((i4 & 4) != 0) {
            animationSpec = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer, 6);
        }
        AnimationSpec<Float> animationSpec2 = animationSpec;
        if ((i4 & 8) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        DecayAnimationSpec<Float> decayAnimationSpec2 = decayAnimationSpec;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(735238945, i3, -1, "androidx.compose.material3.FloatingToolbarDefaults.exitAlwaysScrollBehavior (FloatingToolbar.kt:829)");
        }
        boolean zChanged = ((((i3 & 14) ^ 6) > 4 && composer.changed(i2)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && composer.changed(floatingToolbarState2)) || (i3 & 48) == 32) | composer.changed(animationSpec2) | composer.changed(decayAnimationSpec2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            ExitAlwaysFloatingToolbarScrollBehavior exitAlwaysFloatingToolbarScrollBehavior = new ExitAlwaysFloatingToolbarScrollBehavior(i2, floatingToolbarState2, animationSpec2, decayAnimationSpec2, null);
            composer.updateRememberedValue(exitAlwaysFloatingToolbarScrollBehavior);
            objRememberedValue = exitAlwaysFloatingToolbarScrollBehavior;
        }
        ExitAlwaysFloatingToolbarScrollBehavior exitAlwaysFloatingToolbarScrollBehavior2 = (ExitAlwaysFloatingToolbarScrollBehavior) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return exitAlwaysFloatingToolbarScrollBehavior2;
    }

    /* renamed from: floatingToolbarVerticalNestedScroll-gKdo67w, reason: not valid java name */
    public final Modifier m4900floatingToolbarVerticalNestedScrollgKdo67w(Modifier modifier, boolean z, a<ab> aVar, a<ab> aVar2, float f2, float f3, boolean z2) {
        return modifier.then(new VerticalNestedScrollExpansionElement(z, aVar, aVar2, z2, f2, f3, null));
    }

    /* renamed from: getContainerCollapsedElevation-D9Ej5fM, reason: not valid java name */
    public final float m4901getContainerCollapsedElevationD9Ej5fM() {
        return ContainerCollapsedElevation;
    }

    /* renamed from: getContainerCollapsedElevationWithFab-D9Ej5fM, reason: not valid java name */
    public final float m4902getContainerCollapsedElevationWithFabD9Ej5fM() {
        return ContainerCollapsedElevationWithFab;
    }

    /* renamed from: getContainerExpandedElevation-D9Ej5fM, reason: not valid java name */
    public final float m4903getContainerExpandedElevationD9Ej5fM() {
        return ContainerExpandedElevation;
    }

    /* renamed from: getContainerExpandedElevationWithFab-D9Ej5fM, reason: not valid java name */
    public final float m4904getContainerExpandedElevationWithFabD9Ej5fM() {
        return ContainerExpandedElevationWithFab;
    }

    public final Shape getContainerShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(177994961, i2, -1, "androidx.compose.material3.FloatingToolbarDefaults.<get-ContainerShape> (FloatingToolbar.kt:769)");
        }
        Shape value = ShapesKt.getValue(FloatingToolbarTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getContainerSize-D9Ej5fM, reason: not valid java name */
    public final float m4905getContainerSizeD9Ej5fM() {
        return ContainerSize;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    public final FloatingToolbarColors getDefaultFloatingToolbarStandardColors$material3(ColorScheme colorScheme) {
        FloatingToolbarColors defaultFloatingToolbarStandardColorsCached$material3 = colorScheme.getDefaultFloatingToolbarStandardColorsCached$material3();
        if (defaultFloatingToolbarStandardColorsCached$material3 != null) {
            return defaultFloatingToolbarStandardColorsCached$material3;
        }
        FloatingToolbarColors floatingToolbarColors = new FloatingToolbarColors(ColorSchemeKt.fromToken(colorScheme, FloatingToolbarTokens.INSTANCE.getStandardContainerColor()), ColorSchemeKt.m4592contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, FloatingToolbarTokens.INSTANCE.getStandardContainerColor())), ColorSchemeKt.fromToken(colorScheme, ColorSchemeKeyTokens.PrimaryContainer), ColorSchemeKt.m4592contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, ColorSchemeKeyTokens.PrimaryContainer)), null);
        colorScheme.setDefaultFloatingToolbarStandardColorsCached$material3(floatingToolbarColors);
        return floatingToolbarColors;
    }

    public final FloatingToolbarColors getDefaultFloatingToolbarVibrantColors$material3(ColorScheme colorScheme) {
        FloatingToolbarColors defaultFloatingToolbarVibrantColorsCached$material3 = colorScheme.getDefaultFloatingToolbarVibrantColorsCached$material3();
        if (defaultFloatingToolbarVibrantColorsCached$material3 != null) {
            return defaultFloatingToolbarVibrantColorsCached$material3;
        }
        FloatingToolbarColors floatingToolbarColors = new FloatingToolbarColors(ColorSchemeKt.fromToken(colorScheme, FloatingToolbarTokens.INSTANCE.getVibrantContainerColor()), ColorSchemeKt.m4592contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, FloatingToolbarTokens.INSTANCE.getVibrantContainerColor())), ColorSchemeKt.fromToken(colorScheme, ColorSchemeKeyTokens.TertiaryContainer), ColorSchemeKt.m4592contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, ColorSchemeKeyTokens.TertiaryContainer)), null);
        colorScheme.setDefaultFloatingToolbarVibrantColorsCached$material3(floatingToolbarColors);
        return floatingToolbarColors;
    }

    public final f<Dp> getFabSizeRange$material3() {
        return FabSizeRange;
    }

    /* renamed from: getScreenOffset-D9Ej5fM, reason: not valid java name */
    public final float m4906getScreenOffsetD9Ej5fM() {
        return ScreenOffset;
    }

    /* renamed from: getScrollDistanceThreshold-D9Ej5fM, reason: not valid java name */
    public final float m4907getScrollDistanceThresholdD9Ej5fM() {
        return ScrollDistanceThreshold;
    }

    /* renamed from: getToolbarToFabGap-D9Ej5fM$material3, reason: not valid java name */
    public final float m4908getToolbarToFabGapD9Ej5fM$material3() {
        return ToolbarToFabGap;
    }

    public final EnterTransition horizontalEnterTransition(Alignment.Horizontal horizontal, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(206634759, i2, -1, "androidx.compose.material3.FloatingToolbarDefaults.horizontalEnterTransition (FloatingToolbar.kt:841)");
        }
        EnterTransition enterTransitionExpandHorizontally$default = EnterExitTransitionKt.expandHorizontally$default(animationSpec(composer, (i2 >> 3) & 14), horizontal, false, null, 12, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return enterTransitionExpandHorizontally$default;
    }

    public final ExitTransition horizontalExitTransition(Alignment.Horizontal horizontal, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1906978713, i2, -1, "androidx.compose.material3.FloatingToolbarDefaults.horizontalExitTransition (FloatingToolbar.kt:851)");
        }
        ExitTransition exitTransitionShrinkHorizontally$default = EnterExitTransitionKt.shrinkHorizontally$default(animationSpec(composer, (i2 >> 3) & 14), horizontal, false, null, 12, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return exitTransitionShrinkHorizontally$default;
    }

    public final FloatingToolbarColors standardFloatingToolbarColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1804011246, i2, -1, "androidx.compose.material3.FloatingToolbarDefaults.standardFloatingToolbarColors (FloatingToolbar.kt:864)");
        }
        FloatingToolbarColors defaultFloatingToolbarStandardColors$material3 = getDefaultFloatingToolbarStandardColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFloatingToolbarStandardColors$material3;
    }

    /* renamed from: standardFloatingToolbarColors-ro_MJ88, reason: not valid java name */
    public final FloatingToolbarColors m4909standardFloatingToolbarColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            j2 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            j3 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if ((i3 & 4) != 0) {
            j4 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if ((i3 & 8) != 0) {
            j5 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1582276582, i2, -1, "androidx.compose.material3.FloatingToolbarDefaults.standardFloatingToolbarColors (FloatingToolbar.kt:890)");
        }
        long j6 = j3;
        long j7 = j2;
        FloatingToolbarColors floatingToolbarColorsM4891copyjRlVdoo = getDefaultFloatingToolbarStandardColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m4891copyjRlVdoo(j7, j6, j4, j5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return floatingToolbarColorsM4891copyjRlVdoo;
    }

    public final EnterTransition verticalEnterTransition(Alignment.Vertical vertical, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-319808989, i2, -1, "androidx.compose.material3.FloatingToolbarDefaults.verticalEnterTransition (FloatingToolbar.kt:846)");
        }
        EnterTransition enterTransitionExpandVertically$default = EnterExitTransitionKt.expandVertically$default(animationSpec(composer, (i2 >> 3) & 14), vertical, false, null, 12, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return enterTransitionExpandVertically$default;
    }

    public final ExitTransition verticalExitTransition(Alignment.Vertical vertical, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1329237351, i2, -1, "androidx.compose.material3.FloatingToolbarDefaults.verticalExitTransition (FloatingToolbar.kt:856)");
        }
        ExitTransition exitTransitionShrinkVertically$default = EnterExitTransitionKt.shrinkVertically$default(animationSpec(composer, (i2 >> 3) & 14), vertical, false, null, 12, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return exitTransitionShrinkVertically$default;
    }

    public final FloatingToolbarColors vibrantFloatingToolbarColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1253239623, i2, -1, "androidx.compose.material3.FloatingToolbarDefaults.vibrantFloatingToolbarColors (FloatingToolbar.kt:872)");
        }
        FloatingToolbarColors defaultFloatingToolbarVibrantColors$material3 = getDefaultFloatingToolbarVibrantColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFloatingToolbarVibrantColors$material3;
    }

    /* renamed from: vibrantFloatingToolbarColors-ro_MJ88, reason: not valid java name */
    public final FloatingToolbarColors m4910vibrantFloatingToolbarColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            j2 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            j3 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if ((i3 & 4) != 0) {
            j4 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if ((i3 & 8) != 0) {
            j5 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1566048785, i2, -1, "androidx.compose.material3.FloatingToolbarDefaults.vibrantFloatingToolbarColors (FloatingToolbar.kt:913)");
        }
        long j6 = j3;
        long j7 = j2;
        FloatingToolbarColors floatingToolbarColorsM4891copyjRlVdoo = getDefaultFloatingToolbarVibrantColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m4891copyjRlVdoo(j7, j6, j4, j5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return floatingToolbarColorsM4891copyjRlVdoo;
    }

    /* compiled from: WazeSource */
    public final class VerticalNestedScrollExpansionElement extends ModifierNodeElement<VerticalNestedScrollExpansionNode> {
        public static final int $stable = 0;
        private final float collapseScrollThreshold;
        private final float expandScrollThreshold;
        private final boolean expanded;
        private final a<ab> onCollapse;
        private final a<ab> onExpand;
        private final boolean reverseLayout;

        private VerticalNestedScrollExpansionElement(boolean z, a<ab> aVar, a<ab> aVar2, boolean z2, float f2, float f3) {
            this.expanded = z;
            this.onExpand = aVar;
            this.onCollapse = aVar2;
            this.reverseLayout = z2;
            this.expandScrollThreshold = f2;
            this.collapseScrollThreshold = f3;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public VerticalNestedScrollExpansionNode create() {
            return new VerticalNestedScrollExpansionNode(this.expanded, this.onExpand, this.onCollapse, this.reverseLayout, this.expandScrollThreshold, this.collapseScrollThreshold, null);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VerticalNestedScrollExpansionElement)) {
                return false;
            }
            VerticalNestedScrollExpansionElement verticalNestedScrollExpansionElement = (VerticalNestedScrollExpansionElement) obj;
            return this.expanded == verticalNestedScrollExpansionElement.expanded && this.reverseLayout == verticalNestedScrollExpansionElement.reverseLayout && this.onExpand == verticalNestedScrollExpansionElement.onExpand && this.onCollapse == verticalNestedScrollExpansionElement.onCollapse && Dp.m11169equalsimpl0(this.expandScrollThreshold, verticalNestedScrollExpansionElement.expandScrollThreshold) && Dp.m11169equalsimpl0(this.collapseScrollThreshold, verticalNestedScrollExpansionElement.collapseScrollThreshold);
        }

        /* renamed from: getCollapseScrollThreshold-D9Ej5fM, reason: not valid java name */
        public final float m4911getCollapseScrollThresholdD9Ej5fM() {
            return this.collapseScrollThreshold;
        }

        /* renamed from: getExpandScrollThreshold-D9Ej5fM, reason: not valid java name */
        public final float m4912getExpandScrollThresholdD9Ej5fM() {
            return this.expandScrollThreshold;
        }

        public final boolean getExpanded() {
            return this.expanded;
        }

        public final a<ab> getOnCollapse() {
            return this.onCollapse;
        }

        public final a<ab> getOnExpand() {
            return this.onExpand;
        }

        public final boolean getReverseLayout() {
            return this.reverseLayout;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return (((((((((FloatingToolbarDefaults$VerticalNestedScrollExpansionElement$$ExternalSyntheticBackport0.m(this.expanded) * 31) + FloatingToolbarDefaults$VerticalNestedScrollExpansionElement$$ExternalSyntheticBackport0.m(this.reverseLayout)) * 31) + this.onExpand.hashCode()) * 31) + this.onCollapse.hashCode()) * 31) + Dp.m11170hashCodeimpl(this.expandScrollThreshold)) * 31) + Dp.m11170hashCodeimpl(this.collapseScrollThreshold);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("floatingToolbarVerticalNestedScroll");
            inspectorInfo.getProperties().set("expanded", Boolean.valueOf(this.expanded));
            inspectorInfo.getProperties().set("expandScrollThreshold", Dp.m11162boximpl(this.expandScrollThreshold));
            inspectorInfo.getProperties().set("collapseScrollThreshold", Dp.m11162boximpl(this.collapseScrollThreshold));
            inspectorInfo.getProperties().set("reverseLayout", Boolean.valueOf(this.reverseLayout));
            inspectorInfo.getProperties().set("onExpand", this.onExpand);
            inspectorInfo.getProperties().set("onCollapse", this.onCollapse);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(VerticalNestedScrollExpansionNode verticalNestedScrollExpansionNode) {
            verticalNestedScrollExpansionNode.m4917updateNodeKr38dQ(this.expanded, this.onExpand, this.onCollapse, this.reverseLayout, this.expandScrollThreshold, this.collapseScrollThreshold);
        }

        public /* synthetic */ VerticalNestedScrollExpansionElement(boolean z, a aVar, a aVar2, boolean z2, float f2, float f3, o oVar) {
            this(z, aVar, aVar2, z2, f2, f3);
        }
    }

    /* compiled from: WazeSource */
    public final class VerticalNestedScrollExpansionNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, NestedScrollConnection {
        public static final int $stable = 8;
        private float collapseScrollThreshold;
        private float collapseScrollThresholdPx;
        private float contentOffset;
        private float expandScrollThreshold;
        private float expandScrollThresholdPx;
        private boolean expanded;
        private DelegatableNode nestedScrollNode;
        private a<ab> onCollapse;
        private a<ab> onExpand;
        private boolean reverseLayout;
        private int reverseLayoutFactor;
        private float threshold;

        private VerticalNestedScrollExpansionNode(boolean z, a<ab> aVar, a<ab> aVar2, boolean z2, float f2, float f3) {
            this.expanded = z;
            this.onExpand = aVar;
            this.onCollapse = aVar2;
            this.reverseLayout = z2;
            this.expandScrollThreshold = f2;
            this.collapseScrollThreshold = f3;
            this.reverseLayoutFactor = true == z2 ? -1 : 1;
            this.nestedScrollNode = NestedScrollNodeKt.nestedScrollModifierNode(this, null);
        }

        private final void updateThreshold() {
            boolean z = this.expanded;
            float f2 = this.contentOffset;
            this.threshold = z ? f2 - this.collapseScrollThresholdPx : f2 + this.expandScrollThresholdPx;
        }

        /* renamed from: getCollapseScrollThreshold-D9Ej5fM, reason: not valid java name */
        public final float m4913getCollapseScrollThresholdD9Ej5fM() {
            return this.collapseScrollThreshold;
        }

        /* renamed from: getExpandScrollThreshold-D9Ej5fM, reason: not valid java name */
        public final float m4914getExpandScrollThresholdD9Ej5fM() {
            return this.expandScrollThreshold;
        }

        public final boolean getExpanded() {
            return this.expanded;
        }

        public final a<ab> getOnCollapse() {
            return this.onCollapse;
        }

        public final a<ab> getOnExpand() {
            return this.onExpand;
        }

        public final boolean getReverseLayout() {
            return this.reverseLayout;
        }

        @Override // androidx.compose.ui.Modifier.Node
        public boolean getShouldAutoInvalidate() {
            return false;
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onAttach() {
            delegate(this.nestedScrollNode);
            Density densityRequireDensity = DelegatableNodeKt.requireDensity(this.nestedScrollNode);
            this.expandScrollThresholdPx = densityRequireDensity.mo2127toPx0680j_4(this.expandScrollThreshold);
            this.collapseScrollThresholdPx = densityRequireDensity.mo2127toPx0680j_4(this.collapseScrollThreshold);
            updateThreshold();
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostFling-RZ2iAVY */
        public /* synthetic */ Object mo2297onPostFlingRZ2iAVY(long j2, long j3, e eVar) {
            return NestedScrollConnection.CC.m9451onPostFlingRZ2iAVY$suspendImpl(this, j2, j3, eVar);
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostScroll-DzOQY0M */
        public long mo2298onPostScrollDzOQY0M(long j2, long j3, int i2) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) * this.reverseLayoutFactor;
            float f2 = this.contentOffset + fIntBitsToFloat;
            this.contentOffset = f2;
            if (fIntBitsToFloat < 0.0f && f2 <= this.threshold) {
                this.threshold = f2 + this.expandScrollThresholdPx;
                this.onCollapse.invoke();
            } else if (fIntBitsToFloat > 0.0f && f2 >= this.threshold) {
                this.threshold = f2 - this.collapseScrollThresholdPx;
                this.onExpand.invoke();
            }
            return Offset.Companion.m7996getZeroF1C5BW0();
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPreFling-QWom1Mo */
        public /* synthetic */ Object mo2299onPreFlingQWom1Mo(long j2, e eVar) {
            return NestedScrollConnection.CC.m9452onPreFlingQWom1Mo$suspendImpl(this, j2, eVar);
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPreScroll-OzD1aCk */
        public /* synthetic */ long mo2300onPreScrollOzD1aCk(long j2, int i2) {
            return NestedScrollConnection.CC.m9446$default$onPreScrollOzD1aCk(this, j2, i2);
        }

        /* renamed from: setCollapseScrollThreshold-0680j_4, reason: not valid java name */
        public final void m4915setCollapseScrollThreshold0680j_4(float f2) {
            this.collapseScrollThreshold = f2;
        }

        /* renamed from: setExpandScrollThreshold-0680j_4, reason: not valid java name */
        public final void m4916setExpandScrollThreshold0680j_4(float f2) {
            this.expandScrollThreshold = f2;
        }

        public final void setExpanded(boolean z) {
            this.expanded = z;
        }

        public final void setOnCollapse(a<ab> aVar) {
            this.onCollapse = aVar;
        }

        public final void setOnExpand(a<ab> aVar) {
            this.onExpand = aVar;
        }

        public final void setReverseLayout(boolean z) {
            this.reverseLayout = z;
        }

        /* renamed from: updateNode-Kr38-dQ, reason: not valid java name */
        public final void m4917updateNodeKr38dQ(boolean z, a<ab> aVar, a<ab> aVar2, boolean z2, float f2, float f3) {
            if (!Dp.m11169equalsimpl0(this.expandScrollThreshold, f2) || !Dp.m11169equalsimpl0(this.collapseScrollThreshold, f3)) {
                this.expandScrollThreshold = f2;
                this.collapseScrollThreshold = f3;
                Density densityRequireDensity = DelegatableNodeKt.requireDensity(this.nestedScrollNode);
                this.expandScrollThresholdPx = densityRequireDensity.mo2127toPx0680j_4(f2);
                this.collapseScrollThresholdPx = densityRequireDensity.mo2127toPx0680j_4(f3);
                updateThreshold();
            }
            if (this.reverseLayout != z2) {
                this.reverseLayout = z2;
                this.reverseLayoutFactor = true == z2 ? -1 : 1;
            }
            this.onExpand = aVar;
            this.onCollapse = aVar2;
            if (this.expanded != z) {
                this.expanded = z;
                updateThreshold();
            }
        }

        public /* synthetic */ VerticalNestedScrollExpansionNode(boolean z, a aVar, a aVar2, boolean z2, float f2, float f3, o oVar) {
            this(z, aVar, aVar2, z2, f2, f3);
        }
    }
}
