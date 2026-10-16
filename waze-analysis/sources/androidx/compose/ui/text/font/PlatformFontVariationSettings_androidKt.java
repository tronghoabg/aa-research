package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.fonts.FontVariationAxis;
import android.os.Build;
import androidx.compose.ui.text.font.FontVariation;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.util.ListUtilsKt;
import h.g.a.l;
import h.g.b.x;
import h.k.n;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PlatformFontVariationSettings_androidKt {
    private static final float coerceInWeight(float f2) {
        return n.g(f2, 1.0f, 1000.0f);
    }

    public static final int getFontWeightAdjustment(Context context) {
        if (context == null || Build.VERSION.SDK_INT < 31 || context.getResources().getConfiguration().fontWeightAdjustment == Integer.MAX_VALUE) {
            return 0;
        }
        return context.getResources().getConfiguration().fontWeightAdjustment;
    }

    public static final FontVariationAxis[] toAndroidArray(FontVariation.Settings settings, Density density, int i2) {
        int size;
        FontVariationAxis fontVariationAxis;
        int i3 = 0;
        if (i2 == 0) {
            int size2 = settings.getSettings().size();
            FontVariationAxis[] fontVariationAxisArr = new FontVariationAxis[size2];
            while (i3 < size2) {
                fontVariationAxisArr[i3] = new FontVariationAxis(settings.getSettings().get(i3).getAxisName(), settings.getSettings().get(i3).toVariationValue(density));
                i3++;
            }
            return fontVariationAxisArr;
        }
        int size3 = settings.getSettings().size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                size = settings.getSettings().size() + 1;
                break;
            }
            if (x.n(settings.getSettings().get(i4).getAxisName(), "wght")) {
                size = settings.getSettings().size();
                break;
            }
            i4++;
        }
        FontVariationAxis[] fontVariationAxisArr2 = new FontVariationAxis[size];
        while (i3 < size) {
            if (i3 == settings.getSettings().size()) {
                fontVariationAxis = new FontVariationAxis("wght", coerceInWeight(i2 + 400.0f));
            } else if (x.n(settings.getSettings().get(i3).getAxisName(), "wght")) {
                fontVariationAxis = new FontVariationAxis("wght", coerceInWeight(settings.getSettings().get(i3).toVariationValue(density) + i2));
            } else {
                fontVariationAxis = new FontVariationAxis(settings.getSettings().get(i3).getAxisName(), settings.getSettings().get(i3).toVariationValue(density));
            }
            fontVariationAxisArr2[i3] = fontVariationAxis;
            i3++;
        }
        return fontVariationAxisArr2;
    }

    public static final String toAndroidString(FontVariation.Settings settings, final Density density, int i2) {
        float variationValue;
        if (i2 == 0) {
            return ListUtilsKt.fastJoinToString$default(settings.getSettings(), null, null, null, 0, null, new l() { // from class: androidx.compose.ui.text.font.PlatformFontVariationSettings_androidKt$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return PlatformFontVariationSettings_androidKt.toAndroidString$lambda$0(density, (FontVariation.Setting) obj);
                }
            }, 31, null);
        }
        List<FontVariation.Setting> settings2 = settings.getSettings();
        int size = settings2.size();
        String str = "";
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            FontVariation.Setting setting = settings2.get(i3);
            if (x.n(setting.getAxisName(), "wght")) {
                variationValue = coerceInWeight(setting.toVariationValue(density) + i2);
                z = true;
            } else {
                variationValue = setting.toVariationValue(density);
            }
            if (i3 != 0) {
                str = str + ',';
            }
            str = str + '\'' + setting.getAxisName() + "' " + variationValue;
        }
        if (z) {
            return str;
        }
        float fCoerceInWeight = coerceInWeight(i2 + 400.0f);
        if (!settings.getSettings().isEmpty()) {
            str = str + ',';
        }
        return str + "'wght' " + fCoerceInWeight;
    }

    static final CharSequence toAndroidString$lambda$0(Density density, FontVariation.Setting setting) {
        return "'" + setting.getAxisName() + "' " + setting.toVariationValue(density);
    }

    public static final String toAndroidString(FontVariation.Settings settings, Context context) {
        return toAndroidString(settings, AndroidDensity_androidKt.Density(context), getFontWeightAdjustment(context));
    }
}
