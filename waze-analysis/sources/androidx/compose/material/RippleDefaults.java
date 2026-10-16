package androidx.compose.material;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RippleDefaults {
    public static final int $stable = 0;
    public static final RippleDefaults INSTANCE = new RippleDefaults();

    private RippleDefaults() {
    }

    /* renamed from: rippleAlpha-DxMtmZc, reason: not valid java name */
    public final RippleAlpha m4166rippleAlphaDxMtmZc(long j2, boolean z) {
        return z ? ((double) ColorKt.m8280luminance8_81llA(j2)) > 0.5d ? RippleKt.LightThemeHighContrastRippleAlpha : RippleKt.LightThemeLowContrastRippleAlpha : RippleKt.DarkThemeRippleAlpha;
    }

    /* renamed from: rippleColor-5vOe2sY, reason: not valid java name */
    public final long m4167rippleColor5vOe2sY(long j2, boolean z) {
        return (z || ((double) ColorKt.m8280luminance8_81llA(j2)) >= 0.5d) ? j2 : Color.Companion.m8265getWhite0d7_KjU();
    }
}
