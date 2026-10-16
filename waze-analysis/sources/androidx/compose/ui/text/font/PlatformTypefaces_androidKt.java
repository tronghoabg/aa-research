package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.FontVariation;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PlatformTypefaces_androidKt {
    public static final PlatformTypefaces PlatformTypefaces() {
        return new PlatformTypefacesApi28();
    }

    public static final String getWeightSuffixForFallbackFamilyName(String str, FontWeight fontWeight) {
        String strValueOf;
        String str2;
        int weight = fontWeight.getWeight() / 100;
        if (weight >= 0 && weight < 2) {
            strValueOf = String.valueOf(str);
            str2 = "-thin";
        } else {
            if (weight < 2 || weight >= 4) {
                if (weight != 4) {
                    if (weight == 5) {
                        strValueOf = String.valueOf(str);
                        str2 = "-medium";
                    } else if ((weight < 6 || weight >= 8) && weight >= 8 && weight < 11) {
                        strValueOf = String.valueOf(str);
                        str2 = "-black";
                    }
                }
                return str;
            }
            strValueOf = String.valueOf(str);
            str2 = "-light";
        }
        return strValueOf.concat(str2);
    }

    public static final android.graphics.Typeface setFontVariationSettings(android.graphics.Typeface typeface, FontVariation.Settings settings, Context context) {
        return TypefaceCompatApi26.INSTANCE.setFontVariationSettings(typeface, settings, context);
    }
}
