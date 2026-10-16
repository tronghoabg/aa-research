package androidx.compose.material3;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.material3.RippleThemeConfiguration;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RippleDefaults {
    public static final int $stable = 0;
    private static final RippleThemeConfiguration InsetFocusRingRippleThemeConfiguration;
    private static final RippleThemeConfiguration OpacityFocusRippleThemeConfiguration;
    private static final RippleThemeConfiguration ThemeConfiguration;
    public static final RippleDefaults INSTANCE = new RippleDefaults();
    private static final RippleAlpha RippleAlpha = new RippleAlpha(0.16f, 0.1f, 0.08f, 0.1f);

    static {
        RippleThemeConfiguration rippleThemeConfiguration = new RippleThemeConfiguration(new RippleThemeConfiguration.Focus.Opacity());
        OpacityFocusRippleThemeConfiguration = rippleThemeConfiguration;
        InsetFocusRingRippleThemeConfiguration = new RippleThemeConfiguration(new RippleThemeConfiguration.Focus.InsetRing(0.0f, 2.0f, 1.0f, 3.0f, null));
        ThemeConfiguration = rippleThemeConfiguration;
    }

    private RippleDefaults() {
    }

    public final RippleThemeConfiguration getInsetFocusRingRippleThemeConfiguration() {
        return InsetFocusRingRippleThemeConfiguration;
    }

    public final RippleThemeConfiguration getOpacityFocusRippleThemeConfiguration() {
        return OpacityFocusRippleThemeConfiguration;
    }

    public final RippleAlpha getRippleAlpha() {
        return RippleAlpha;
    }

    public final RippleThemeConfiguration getThemeConfiguration() {
        return ThemeConfiguration;
    }

    public static /* synthetic */ void getRippleAlpha$annotations() {
    }
}
