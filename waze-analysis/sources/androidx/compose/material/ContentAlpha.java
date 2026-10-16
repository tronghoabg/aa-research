package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ContentAlpha {
    public static final int $stable = 0;
    public static final ContentAlpha INSTANCE = new ContentAlpha();

    private ContentAlpha() {
    }

    private final float contentAlpha(float f2, float f3, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1528360391, i2, -1, "androidx.compose.material.ContentAlpha.contentAlpha (ContentAlpha.kt:77)");
        }
        long jM8238unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m8238unboximpl();
        if (!MaterialTheme.INSTANCE.getColors(composer, 6).isLight() ? ColorKt.m8280luminance8_81llA(jM8238unboximpl) >= 0.5d : ColorKt.m8280luminance8_81llA(jM8238unboximpl) <= 0.5d) {
            f2 = f3;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return f2;
    }

    public final float getDisabled(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(621183615, i2, -1, "androidx.compose.material.ContentAlpha.<get-disabled> (ContentAlpha.kt:60)");
        }
        float fContentAlpha = contentAlpha(0.38f, 0.38f, composer, ((i2 << 6) & DisplayStrings.DS_TAP_TO_VERIFY) | 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fContentAlpha;
    }

    public final float getHigh(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(629162431, i2, -1, "androidx.compose.material.ContentAlpha.<get-high> (ContentAlpha.kt:36)");
        }
        float fContentAlpha = contentAlpha(1.0f, 0.87f, composer, ((i2 << 6) & DisplayStrings.DS_TAP_TO_VERIFY) | 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fContentAlpha;
    }

    public final float getMedium(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1999054879, i2, -1, "androidx.compose.material.ContentAlpha.<get-medium> (ContentAlpha.kt:48)");
        }
        float fContentAlpha = contentAlpha(0.74f, 0.6f, composer, ((i2 << 6) & DisplayStrings.DS_TAP_TO_VERIFY) | 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fContentAlpha;
    }
}
