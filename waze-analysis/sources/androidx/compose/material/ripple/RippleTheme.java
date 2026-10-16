package androidx.compose.material.ripple;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface RippleTheme {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* renamed from: defaultRippleAlpha-DxMtmZc, reason: not valid java name */
        public final RippleAlpha m4314defaultRippleAlphaDxMtmZc(long j2, boolean z) {
            return z ? ((double) ColorKt.m8280luminance8_81llA(j2)) > 0.5d ? RippleThemeKt.LightThemeHighContrastRippleAlpha : RippleThemeKt.LightThemeLowContrastRippleAlpha : RippleThemeKt.DarkThemeRippleAlpha;
        }

        /* renamed from: defaultRippleColor-5vOe2sY, reason: not valid java name */
        public final long m4315defaultRippleColor5vOe2sY(long j2, boolean z) {
            return (z || ((double) ColorKt.m8280luminance8_81llA(j2)) >= 0.5d) ? j2 : Color.Companion.m8265getWhite0d7_KjU();
        }
    }

    /* renamed from: defaultColor-WaAFU9c */
    long mo4303defaultColorWaAFU9c(Composer composer, int i2);

    RippleAlpha rippleAlpha(Composer composer, int i2);
}
