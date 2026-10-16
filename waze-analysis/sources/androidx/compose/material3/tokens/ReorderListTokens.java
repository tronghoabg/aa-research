package androidx.compose.material3.tokens;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ReorderListTokens {
    public static final int $stable = 0;
    public static final ReorderListTokens INSTANCE = new ReorderListTokens();
    private static final ColorSchemeKeyTokens ItemContainerColor = ColorSchemeKeyTokens.TertiaryContainer;
    private static final ColorSchemeKeyTokens ItemDropZoneColor = ColorSchemeKeyTokens.SurfaceContainerLow;
    private static final ColorSchemeKeyTokens ItemLabelTextColor;
    private static final ColorSchemeKeyTokens ItemLeadingIconColor;
    private static final ColorSchemeKeyTokens ItemOverlineColor;
    private static final ShapeKeyTokens ItemShape;
    private static final ColorSchemeKeyTokens ItemSupportingTextColor;
    private static final ColorSchemeKeyTokens ItemTrailingIconColor;
    private static final ColorSchemeKeyTokens ItemTrailingSupportingTextColor;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnTertiaryContainer;
        ItemLabelTextColor = colorSchemeKeyTokens;
        ItemLeadingIconColor = colorSchemeKeyTokens;
        ItemOverlineColor = colorSchemeKeyTokens;
        ItemShape = ShapeKeyTokens.CornerLarge;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnTertiaryContainer;
        ItemSupportingTextColor = colorSchemeKeyTokens2;
        ItemTrailingIconColor = colorSchemeKeyTokens2;
        ItemTrailingSupportingTextColor = colorSchemeKeyTokens2;
    }

    private ReorderListTokens() {
    }

    public final ColorSchemeKeyTokens getItemContainerColor() {
        return ItemContainerColor;
    }

    public final ColorSchemeKeyTokens getItemDropZoneColor() {
        return ItemDropZoneColor;
    }

    public final ColorSchemeKeyTokens getItemLabelTextColor() {
        return ItemLabelTextColor;
    }

    public final ColorSchemeKeyTokens getItemLeadingIconColor() {
        return ItemLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getItemOverlineColor() {
        return ItemOverlineColor;
    }

    public final ShapeKeyTokens getItemShape() {
        return ItemShape;
    }

    public final ColorSchemeKeyTokens getItemSupportingTextColor() {
        return ItemSupportingTextColor;
    }

    public final ColorSchemeKeyTokens getItemTrailingIconColor() {
        return ItemTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getItemTrailingSupportingTextColor() {
        return ItemTrailingSupportingTextColor;
    }
}
