package androidx.compose.material3.tokens;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ShapeKeyTokens {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ShapeKeyTokens[] $VALUES;
    public static final ShapeKeyTokens CornerExtraExtraLarge = new ShapeKeyTokens("CornerExtraExtraLarge", 0);
    public static final ShapeKeyTokens CornerExtraLarge = new ShapeKeyTokens("CornerExtraLarge", 1);
    public static final ShapeKeyTokens CornerExtraLargeIncreased = new ShapeKeyTokens("CornerExtraLargeIncreased", 2);
    public static final ShapeKeyTokens CornerExtraLargeTop = new ShapeKeyTokens("CornerExtraLargeTop", 3);
    public static final ShapeKeyTokens CornerExtraSmall = new ShapeKeyTokens("CornerExtraSmall", 4);
    public static final ShapeKeyTokens CornerExtraSmallTop = new ShapeKeyTokens("CornerExtraSmallTop", 5);
    public static final ShapeKeyTokens CornerFull = new ShapeKeyTokens("CornerFull", 6);
    public static final ShapeKeyTokens CornerLarge = new ShapeKeyTokens("CornerLarge", 7);
    public static final ShapeKeyTokens CornerLargeEnd = new ShapeKeyTokens("CornerLargeEnd", 8);
    public static final ShapeKeyTokens CornerLargeIncreased = new ShapeKeyTokens("CornerLargeIncreased", 9);
    public static final ShapeKeyTokens CornerLargeStart = new ShapeKeyTokens("CornerLargeStart", 10);
    public static final ShapeKeyTokens CornerLargeTop = new ShapeKeyTokens("CornerLargeTop", 11);
    public static final ShapeKeyTokens CornerMedium = new ShapeKeyTokens("CornerMedium", 12);
    public static final ShapeKeyTokens CornerNone = new ShapeKeyTokens("CornerNone", 13);
    public static final ShapeKeyTokens CornerSmall = new ShapeKeyTokens("CornerSmall", 14);

    private static final /* synthetic */ ShapeKeyTokens[] $values() {
        return new ShapeKeyTokens[]{CornerExtraExtraLarge, CornerExtraLarge, CornerExtraLargeIncreased, CornerExtraLargeTop, CornerExtraSmall, CornerExtraSmallTop, CornerFull, CornerLarge, CornerLargeEnd, CornerLargeIncreased, CornerLargeStart, CornerLargeTop, CornerMedium, CornerNone, CornerSmall};
    }

    static {
        ShapeKeyTokens[] shapeKeyTokensArr$values = $values();
        $VALUES = shapeKeyTokensArr$values;
        $ENTRIES = b.a(shapeKeyTokensArr$values);
    }

    private ShapeKeyTokens(String str, int i2) {
    }

    public static a<ShapeKeyTokens> getEntries() {
        return $ENTRIES;
    }

    public static ShapeKeyTokens valueOf(String str) {
        return (ShapeKeyTokens) Enum.valueOf(ShapeKeyTokens.class, str);
    }

    public static ShapeKeyTokens[] values() {
        return (ShapeKeyTokens[]) $VALUES.clone();
    }
}
