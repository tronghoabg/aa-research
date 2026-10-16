package androidx.compose.material3.tokens;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RevealListTokens {
    public static final int $stable = 0;
    public static final RevealListTokens INSTANCE = new RevealListTokens();
    private static final ColorSchemeKeyTokens ItemActionButtonIconIconColor = ColorSchemeKeyTokens.OnPrimary;
    private static final ColorSchemeKeyTokens ItemActionIconButtonContainerColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens ItemButtonIconIconColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens ItemContainerColor = ColorSchemeKeyTokens.Surface;
    private static final ShapeKeyTokens ItemContainerShape;
    private static final ShapeKeyTokens ItemIconButtonActionContainerShape;
    private static final ColorSchemeKeyTokens ItemIconButtonContainerColor;
    private static final ShapeKeyTokens ItemIconButtonContainerShape;
    private static final ShapeKeyTokens ItemSegmentedContainerShape;

    static {
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerLarge;
        ItemContainerShape = shapeKeyTokens;
        ItemIconButtonActionContainerShape = shapeKeyTokens;
        ItemIconButtonContainerColor = ColorSchemeKeyTokens.SecondaryContainer;
        ItemIconButtonContainerShape = ShapeKeyTokens.CornerFull;
        ItemSegmentedContainerShape = shapeKeyTokens;
    }

    private RevealListTokens() {
    }

    public final ColorSchemeKeyTokens getItemActionButtonIconIconColor() {
        return ItemActionButtonIconIconColor;
    }

    public final ColorSchemeKeyTokens getItemActionIconButtonContainerColor() {
        return ItemActionIconButtonContainerColor;
    }

    public final ColorSchemeKeyTokens getItemButtonIconIconColor() {
        return ItemButtonIconIconColor;
    }

    public final ColorSchemeKeyTokens getItemContainerColor() {
        return ItemContainerColor;
    }

    public final ShapeKeyTokens getItemContainerShape() {
        return ItemContainerShape;
    }

    public final ShapeKeyTokens getItemIconButtonActionContainerShape() {
        return ItemIconButtonActionContainerShape;
    }

    public final ColorSchemeKeyTokens getItemIconButtonContainerColor() {
        return ItemIconButtonContainerColor;
    }

    public final ShapeKeyTokens getItemIconButtonContainerShape() {
        return ItemIconButtonContainerShape;
    }

    public final ShapeKeyTokens getItemSegmentedContainerShape() {
        return ItemSegmentedContainerShape;
    }
}
