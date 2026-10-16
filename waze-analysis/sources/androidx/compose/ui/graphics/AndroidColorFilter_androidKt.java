package androidx.compose.ui.graphics;

import android.support.v7.app.an$$ExternalSyntheticApiModelOutline1;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidColorFilter_androidKt {
    /* renamed from: actualColorMatrixColorFilter-jHG-Opc, reason: not valid java name */
    public static final android.graphics.ColorFilter m8086actualColorMatrixColorFilterjHGOpc(float[] fArr) {
        return new android.graphics.ColorMatrixColorFilter(fArr);
    }

    public static final float[] actualColorMatrixFromFilter(android.graphics.ColorFilter colorFilter) {
        if (colorFilter instanceof android.graphics.ColorMatrixColorFilter) {
            return ColorMatrixFilterHelper.INSTANCE.m8307getColorMatrix8unuwjk((android.graphics.ColorMatrixColorFilter) colorFilter);
        }
        throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
    }

    /* renamed from: actualLightingColorFilter--OWjLjI, reason: not valid java name */
    public static final android.graphics.ColorFilter m8087actualLightingColorFilterOWjLjI(long j2, long j3) {
        return new android.graphics.LightingColorFilter(ColorKt.m8282toArgb8_81llA(j2), ColorKt.m8282toArgb8_81llA(j3));
    }

    /* renamed from: actualTintColorFilter-xETnrds, reason: not valid java name */
    public static final android.graphics.ColorFilter m8088actualTintColorFilterxETnrds(long j2, int i2) {
        return BlendModeColorFilterHelper.INSTANCE.m8172BlendModeColorFilterxETnrds(j2, i2);
    }

    public static final android.graphics.ColorFilter asAndroidColorFilter(ColorFilter colorFilter) {
        return colorFilter.getNativeColorFilter$ui_graphics();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ColorFilter asComposeColorFilter(android.graphics.ColorFilter colorFilter) {
        if (an$$ExternalSyntheticApiModelOutline1.m90m((Object) colorFilter)) {
            return BlendModeColorFilterHelper.INSTANCE.createBlendModeColorFilter(an$$ExternalSyntheticApiModelOutline1.m((Object) colorFilter));
        }
        if (!(colorFilter instanceof android.graphics.LightingColorFilter)) {
            return colorFilter instanceof android.graphics.ColorMatrixColorFilter ? new ColorMatrixColorFilter(null, colorFilter, 0 == true ? 1 : 0) : new ColorFilter(colorFilter);
        }
        android.graphics.LightingColorFilter lightingColorFilter = (android.graphics.LightingColorFilter) colorFilter;
        return new LightingColorFilter(ColorKt.Color(lightingColorFilter.getColorMultiply()), ColorKt.Color(lightingColorFilter.getColorAdd()), colorFilter, null);
    }

    public static final boolean supportsColorMatrixQuery() {
        return true;
    }

    public static final boolean supportsLightingColorFilterQuery() {
        return true;
    }
}
