package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.material3.tokens.ShapeTokens;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ShapeDefaults {
    public static final int $stable = 0;
    public static final ShapeDefaults INSTANCE = new ShapeDefaults();
    private static final CornerBasedShape ExtraSmall = ShapeTokens.INSTANCE.getCornerExtraSmall();
    private static final CornerBasedShape Small = ShapeTokens.INSTANCE.getCornerSmall();
    private static final CornerBasedShape Medium = ShapeTokens.INSTANCE.getCornerMedium();
    private static final CornerBasedShape Large = ShapeTokens.INSTANCE.getCornerLarge();
    private static final CornerBasedShape LargeIncreased = ShapeTokens.INSTANCE.getCornerLargeIncreased();
    private static final CornerBasedShape ExtraLarge = ShapeTokens.INSTANCE.getCornerExtraLarge();
    private static final CornerBasedShape ExtraLargeIncreased = ShapeTokens.INSTANCE.getCornerExtraLargeIncreased();
    private static final CornerBasedShape ExtraExtraLarge = ShapeTokens.INSTANCE.getCornerExtraExtraLarge();
    private static final CornerSize CornerNone = ShapeTokens.INSTANCE.getCornerValueNone();
    private static final CornerSize CornerExtraSmall = ShapeTokens.INSTANCE.getCornerValueExtraSmall();
    private static final CornerSize CornerSmall = ShapeTokens.INSTANCE.getCornerValueSmall();
    private static final CornerSize CornerMedium = ShapeTokens.INSTANCE.getCornerValueMedium();
    private static final CornerSize CornerLarge = ShapeTokens.INSTANCE.getCornerValueLarge();
    private static final CornerSize CornerLargeIncreased = ShapeTokens.INSTANCE.getCornerValueLargeIncreased();
    private static final CornerSize CornerExtraLarge = ShapeTokens.INSTANCE.getCornerValueExtraLarge();
    private static final CornerSize CornerExtraLargeIncreased = ShapeTokens.INSTANCE.getCornerValueExtraLargeIncreased();
    private static final CornerSize CornerExtraExtraLarge = ShapeTokens.INSTANCE.getCornerValueExtraExtraLarge();
    private static final CornerSize CornerFull = CornerSizeKt.CornerSize(100);

    private ShapeDefaults() {
    }

    public final CornerSize getCornerExtraExtraLarge$material3() {
        return CornerExtraExtraLarge;
    }

    public final CornerSize getCornerExtraLarge$material3() {
        return CornerExtraLarge;
    }

    public final CornerSize getCornerExtraLargeIncreased$material3() {
        return CornerExtraLargeIncreased;
    }

    public final CornerSize getCornerExtraSmall$material3() {
        return CornerExtraSmall;
    }

    public final CornerSize getCornerFull$material3() {
        return CornerFull;
    }

    public final CornerSize getCornerLarge$material3() {
        return CornerLarge;
    }

    public final CornerSize getCornerLargeIncreased$material3() {
        return CornerLargeIncreased;
    }

    public final CornerSize getCornerMedium$material3() {
        return CornerMedium;
    }

    public final CornerSize getCornerNone$material3() {
        return CornerNone;
    }

    public final CornerSize getCornerSmall$material3() {
        return CornerSmall;
    }

    public final CornerBasedShape getExtraExtraLarge() {
        return ExtraExtraLarge;
    }

    public final CornerBasedShape getExtraLarge() {
        return ExtraLarge;
    }

    public final CornerBasedShape getExtraLargeIncreased() {
        return ExtraLargeIncreased;
    }

    public final CornerBasedShape getExtraSmall() {
        return ExtraSmall;
    }

    public final CornerBasedShape getLarge() {
        return Large;
    }

    public final CornerBasedShape getLargeIncreased() {
        return LargeIncreased;
    }

    public final CornerBasedShape getMedium() {
        return Medium;
    }

    public final CornerBasedShape getSmall() {
        return Small;
    }
}
