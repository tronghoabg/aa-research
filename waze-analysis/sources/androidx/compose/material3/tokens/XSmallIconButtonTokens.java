package androidx.compose.material3.tokens;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class XSmallIconButtonTokens {
    public static final int $stable = 0;
    private static final ShapeKeyTokens ContainerShapeRound;
    private static final ShapeKeyTokens ContainerShapeSquare;
    private static final float DefaultLeadingSpace;
    private static final float DefaultTrailingSpace;
    private static final float IconSize;
    private static final float NarrowLeadingSpace;
    private static final float NarrowTrailingSpace;
    private static final float OutlinedOutlineWidth;
    private static final ShapeKeyTokens PressedContainerShape;
    private static final ShapeKeyTokens SelectedContainerShapeRound;
    private static final ShapeKeyTokens SelectedContainerShapeSquare;
    private static final float WideLeadingSpace;
    private static final float WideTrailingSpace;
    public static final XSmallIconButtonTokens INSTANCE = new XSmallIconButtonTokens();
    private static final float ContainerHeight = 32.0f;

    static {
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        ContainerShapeRound = shapeKeyTokens;
        ShapeKeyTokens shapeKeyTokens2 = ShapeKeyTokens.CornerMedium;
        ContainerShapeSquare = shapeKeyTokens2;
        DefaultLeadingSpace = 6.0f;
        DefaultTrailingSpace = 6.0f;
        IconSize = 20.0f;
        NarrowLeadingSpace = 4.0f;
        NarrowTrailingSpace = 4.0f;
        OutlinedOutlineWidth = 1.0f;
        PressedContainerShape = ShapeKeyTokens.CornerSmall;
        SelectedContainerShapeRound = shapeKeyTokens2;
        SelectedContainerShapeSquare = shapeKeyTokens;
        WideLeadingSpace = 10.0f;
        WideTrailingSpace = 10.0f;
    }

    private XSmallIconButtonTokens() {
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m7275getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShapeRound() {
        return ContainerShapeRound;
    }

    public final ShapeKeyTokens getContainerShapeSquare() {
        return ContainerShapeSquare;
    }

    /* renamed from: getDefaultLeadingSpace-D9Ej5fM, reason: not valid java name */
    public final float m7276getDefaultLeadingSpaceD9Ej5fM() {
        return DefaultLeadingSpace;
    }

    /* renamed from: getDefaultTrailingSpace-D9Ej5fM, reason: not valid java name */
    public final float m7277getDefaultTrailingSpaceD9Ej5fM() {
        return DefaultTrailingSpace;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m7278getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getNarrowLeadingSpace-D9Ej5fM, reason: not valid java name */
    public final float m7279getNarrowLeadingSpaceD9Ej5fM() {
        return NarrowLeadingSpace;
    }

    /* renamed from: getNarrowTrailingSpace-D9Ej5fM, reason: not valid java name */
    public final float m7280getNarrowTrailingSpaceD9Ej5fM() {
        return NarrowTrailingSpace;
    }

    /* renamed from: getOutlinedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m7281getOutlinedOutlineWidthD9Ej5fM() {
        return OutlinedOutlineWidth;
    }

    public final ShapeKeyTokens getPressedContainerShape() {
        return PressedContainerShape;
    }

    public final ShapeKeyTokens getSelectedContainerShapeRound() {
        return SelectedContainerShapeRound;
    }

    public final ShapeKeyTokens getSelectedContainerShapeSquare() {
        return SelectedContainerShapeSquare;
    }

    /* renamed from: getWideLeadingSpace-D9Ej5fM, reason: not valid java name */
    public final float m7282getWideLeadingSpaceD9Ej5fM() {
        return WideLeadingSpace;
    }

    /* renamed from: getWideTrailingSpace-D9Ej5fM, reason: not valid java name */
    public final float m7283getWideTrailingSpaceD9Ej5fM() {
        return WideTrailingSpace;
    }
}
