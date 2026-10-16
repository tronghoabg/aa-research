package androidx.compose.material3;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.tokens.BottomAppBarTokens;
import androidx.compose.material3.tokens.DockedToolbarTokens;
import androidx.compose.material3.tokens.FabSecondaryContainerTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class BottomAppBarDefaults {
    public static final int $stable = 0;
    public static final BottomAppBarDefaults INSTANCE = new BottomAppBarDefaults();
    private static final float ContainerElevation = 0.0f;
    private static final PaddingValues ContentPadding = PaddingKt.m2752PaddingValuesa9UjIt4$default(AppBarKt.BottomAppBarHorizontalPadding, AppBarKt.getBottomAppBarVerticalPadding(), AppBarKt.BottomAppBarHorizontalPadding, 0.0f, 8, null);
    private static final PaddingValues FlexibleContentPadding = PaddingKt.m2752PaddingValuesa9UjIt4$default(DockedToolbarTokens.INSTANCE.m6644getContainerLeadingSpaceD9Ej5fM(), 0.0f, DockedToolbarTokens.INSTANCE.m6647getContainerTrailingSpaceD9Ej5fM(), 0.0f, 10, null);
    private static final float FlexibleBottomAppBarHeight = DockedToolbarTokens.INSTANCE.m6643getContainerHeightD9Ej5fM();
    private static final Arrangement.Horizontal FlexibleHorizontalArrangement = Arrangement.INSTANCE.getSpaceBetween();
    private static final Arrangement.Horizontal FlexibleFixedHorizontalArrangement = Arrangement.INSTANCE.m2441spacedByD5KLDUw(DockedToolbarTokens.INSTANCE.m6645getContainerMaxSpacingD9Ej5fM(), Alignment.Companion.getCenterHorizontally());

    public static /* synthetic */ boolean $r8$lambda$RIrcinrowTxv51MOeFXxHimd054() {
        return true;
    }

    private BottomAppBarDefaults() {
    }

    private static final boolean exitAlwaysScrollBehavior$lambda$0$0() {
        return true;
    }

    public final BottomAppBarScrollBehavior exitAlwaysScrollBehavior(BottomAppBarState bottomAppBarState, a<Boolean> aVar, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, Composer composer, int i2, int i3) {
        Composer composer2;
        if ((i3 & 1) != 0) {
            composer2 = composer;
            bottomAppBarState = AppBarKt.rememberBottomAppBarState(0.0f, 0.0f, 0.0f, composer2, 0, 7);
        } else {
            composer2 = composer;
        }
        if ((i3 & 2) != 0) {
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new a() { // from class: androidx.compose.material3.BottomAppBarDefaults$$ExternalSyntheticLambda0
                    @Override // h.g.a.a
                    public final Object invoke() {
                        BottomAppBarDefaults bottomAppBarDefaults = BottomAppBarDefaults.INSTANCE;
                        return true;
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            aVar = (a) objRememberedValue;
        }
        if ((i3 & 4) != 0) {
            animationSpec = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composer2, 6);
        }
        if ((i3 & 8) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer2, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(457144034, i2, -1, "androidx.compose.material3.BottomAppBarDefaults.exitAlwaysScrollBehavior (AppBar.kt:2476)");
        }
        boolean zChanged = ((((i2 & 14) ^ 6) > 4 && composer2.changed(bottomAppBarState)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer2.changed(aVar)) || (i2 & 48) == 32) | composer2.changed(animationSpec) | composer2.changed(decayAnimationSpec);
        Object objRememberedValue2 = composer2.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new ExitAlwaysScrollBehavior(bottomAppBarState, animationSpec, decayAnimationSpec, aVar);
            composer2.updateRememberedValue(objRememberedValue2);
        }
        ExitAlwaysScrollBehavior exitAlwaysScrollBehavior = (ExitAlwaysScrollBehavior) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return exitAlwaysScrollBehavior;
    }

    public final long getBottomAppBarFabColor(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1464561486, i2, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-bottomAppBarFabColor> (AppBar.kt:2419)");
        }
        long value = ColorSchemeKt.getValue(FabSecondaryContainerTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getContainerColor(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-368340078, i2, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-containerColor> (AppBar.kt:2392)");
        }
        long value = ColorSchemeKt.getValue(BottomAppBarTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m4386getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* renamed from: getFlexibleBottomAppBarHeight-D9Ej5fM, reason: not valid java name */
    public final float m4387getFlexibleBottomAppBarHeightD9Ej5fM() {
        return FlexibleBottomAppBarHeight;
    }

    public final PaddingValues getFlexibleContentPadding() {
        return FlexibleContentPadding;
    }

    public final Arrangement.Horizontal getFlexibleFixedHorizontalArrangement() {
        return FlexibleFixedHorizontalArrangement;
    }

    public final Arrangement.Horizontal getFlexibleHorizontalArrangement() {
        return FlexibleHorizontalArrangement;
    }

    public final WindowInsets getWindowInsets(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(688896409, i2, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-windowInsets> (AppBar.kt:2411)");
        }
        WindowInsets windowInsetsM2850onlybOOhFvg = WindowInsetsKt.m2850onlybOOhFvg(SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 6), WindowInsetsSides.m2860plusgK_yJZ4(WindowInsetsSides.Companion.m2870getHorizontalJoeWqyM(), WindowInsetsSides.Companion.m2868getBottomJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsetsM2850onlybOOhFvg;
    }

    /* renamed from: getFlexibleBottomAppBarHeight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4385getFlexibleBottomAppBarHeightD9Ej5fM$annotations() {
    }

    public static /* synthetic */ void getFlexibleContentPadding$annotations() {
    }

    public static /* synthetic */ void getFlexibleFixedHorizontalArrangement$annotations() {
    }

    public static /* synthetic */ void getFlexibleHorizontalArrangement$annotations() {
    }
}
