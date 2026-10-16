package androidx.compose.material3.tokens;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TypefaceTokens {
    public static final int $stable = 0;
    public static final TypefaceTokens INSTANCE = new TypefaceTokens();
    private static final GenericFontFamily Brand = FontFamily.Companion.getSansSerif();
    private static final GenericFontFamily Plain = FontFamily.Companion.getSansSerif();
    private static final FontWeight WeightBold = FontWeight.Companion.getBold();
    private static final FontWeight WeightMedium = FontWeight.Companion.getMedium();
    private static final FontWeight WeightRegular = FontWeight.Companion.getNormal();

    private TypefaceTokens() {
    }

    public final GenericFontFamily getBrand() {
        return Brand;
    }

    public final GenericFontFamily getPlain() {
        return Plain;
    }

    public final FontWeight getWeightBold() {
        return WeightBold;
    }

    public final FontWeight getWeightMedium() {
        return WeightMedium;
    }

    public final FontWeight getWeightRegular() {
        return WeightRegular;
    }
}
