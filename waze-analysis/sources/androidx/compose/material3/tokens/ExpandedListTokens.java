package androidx.compose.material3.tokens;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ExpandedListTokens {
    public static final int $stable = 0;
    private static final ColorSchemeKeyTokens ExpandedItemContainerColor;
    private static final ColorSchemeKeyTokens ExpandedItemSegmentedContainerColor;
    private static final ColorSchemeKeyTokens ExpandedItemTrailingIconContainerColor;
    private static final ColorSchemeKeyTokens ExpandedItemTrailingIconIconColor;
    private static final ShapeKeyTokens TrailingIconShape;
    public static final ExpandedListTokens INSTANCE = new ExpandedListTokens();
    private static final ColorSchemeKeyTokens CollapsedItemTrailingIconContainerColor = ColorSchemeKeyTokens.Surface;
    private static final ColorSchemeKeyTokens CollapsedItemTrailingIconIconColor = ColorSchemeKeyTokens.OnSurface;
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerLarge;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Surface;
        ExpandedItemContainerColor = colorSchemeKeyTokens;
        ExpandedItemSegmentedContainerColor = colorSchemeKeyTokens;
        ExpandedItemTrailingIconContainerColor = ColorSchemeKeyTokens.SurfaceContainer;
        ExpandedItemTrailingIconIconColor = ColorSchemeKeyTokens.OnSurface;
        TrailingIconShape = ShapeKeyTokens.CornerFull;
    }

    private ExpandedListTokens() {
    }

    public final ColorSchemeKeyTokens getCollapsedItemTrailingIconContainerColor() {
        return CollapsedItemTrailingIconContainerColor;
    }

    public final ColorSchemeKeyTokens getCollapsedItemTrailingIconIconColor() {
        return CollapsedItemTrailingIconIconColor;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getExpandedItemContainerColor() {
        return ExpandedItemContainerColor;
    }

    public final ColorSchemeKeyTokens getExpandedItemSegmentedContainerColor() {
        return ExpandedItemSegmentedContainerColor;
    }

    public final ColorSchemeKeyTokens getExpandedItemTrailingIconContainerColor() {
        return ExpandedItemTrailingIconContainerColor;
    }

    public final ColorSchemeKeyTokens getExpandedItemTrailingIconIconColor() {
        return ExpandedItemTrailingIconIconColor;
    }

    public final ShapeKeyTokens getTrailingIconShape() {
        return TrailingIconShape;
    }
}
