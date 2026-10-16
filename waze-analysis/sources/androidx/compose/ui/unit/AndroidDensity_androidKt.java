package androidx.compose.ui.unit;

import android.content.Context;
import androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidDensity_androidKt {
    public static final Density Density(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        LinearFontScaleConverter linearFontScaleConverterForScale = FontScaleConverterFactory.INSTANCE.forScale(f2);
        if (linearFontScaleConverterForScale == null) {
            linearFontScaleConverterForScale = new LinearFontScaleConverter(f2);
        }
        return new DensityWithConverter(f3, f2, linearFontScaleConverterForScale);
    }
}
