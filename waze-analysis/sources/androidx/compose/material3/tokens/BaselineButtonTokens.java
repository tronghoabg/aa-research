package androidx.compose.material3.tokens;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class BaselineButtonTokens {
    public static final int $stable = 0;
    private static final ColorSchemeKeyTokens DisabledIconColor;
    private static final float DisabledIconOpacity;
    private static final ColorSchemeKeyTokens DisabledLabelTextColor;
    private static final float DisabledLabelTextOpacity;
    private static final float FocusedContainerElevation;
    private static final ColorSchemeKeyTokens FocusedIconColor;
    private static final ColorSchemeKeyTokens FocusedLabelTextColor;
    private static final float HoveredContainerElevation;
    private static final ColorSchemeKeyTokens HoveredIconColor;
    private static final ColorSchemeKeyTokens HoveredLabelTextColor;
    private static final ColorSchemeKeyTokens IconColor;
    private static final float IconLabelSpace;
    private static final float IconSize;
    private static final ColorSchemeKeyTokens LabelTextColor;
    private static final ColorSchemeKeyTokens LabelTextSelectedColor;
    private static final ColorSchemeKeyTokens LabelTextUnselectedColor;
    private static final float LeadingSpace;
    private static final float PressedContainerElevation;
    private static final ShapeKeyTokens PressedContainerShape;
    private static final ColorSchemeKeyTokens PressedIconColor;
    private static final ColorSchemeKeyTokens PressedLabelTextColor;
    private static final ColorSchemeKeyTokens SelectedContainerColor;
    private static final ShapeKeyTokens SelectedContainerShapeRound;
    private static final ShapeKeyTokens SelectedContainerShapeSquare;
    private static final ColorSchemeKeyTokens SelectedFocusedIconColor;
    private static final ColorSchemeKeyTokens SelectedFocusedLabelTextColor;
    private static final ColorSchemeKeyTokens SelectedHoveredIconColor;
    private static final ColorSchemeKeyTokens SelectedHoveredLabelTextColor;
    private static final ColorSchemeKeyTokens SelectedIconColor;
    private static final ColorSchemeKeyTokens SelectedPressedIconColor;
    private static final ColorSchemeKeyTokens SelectedPressedLabelTextColor;
    private static final float TrailingSpace;
    private static final ColorSchemeKeyTokens UnselectedContainerColor;
    private static final ColorSchemeKeyTokens UnselectedFocusedIconColor;
    private static final ColorSchemeKeyTokens UnselectedFocusedLabelTextColor;
    private static final ColorSchemeKeyTokens UnselectedHoveredIconColor;
    private static final ColorSchemeKeyTokens UnselectedHoveredLabelTextColor;
    private static final ColorSchemeKeyTokens UnselectedIconColor;
    private static final ColorSchemeKeyTokens UnselectedPressedIconColor;
    private static final ColorSchemeKeyTokens UnselectedPressedLabelTextColor;
    public static final BaselineButtonTokens INSTANCE = new BaselineButtonTokens();
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.Primary;
    private static final float ContainerElevation = ElevationTokens.INSTANCE.m6670getLevel0D9Ej5fM();
    private static final float ContainerHeight = 40.0f;
    private static final ShapeKeyTokens ContainerShapeRound = ShapeKeyTokens.CornerFull;
    private static final ShapeKeyTokens ContainerShapeSquare = ShapeKeyTokens.CornerMedium;
    private static final ColorSchemeKeyTokens DisabledContainerColor = ColorSchemeKeyTokens.OnSurface;
    private static final float DisabledContainerElevation = ElevationTokens.INSTANCE.m6670getLevel0D9Ej5fM();
    private static final float DisabledContainerOpacity = 0.1f;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurfaceVariant;
        DisabledIconColor = colorSchemeKeyTokens;
        DisabledIconOpacity = 0.38f;
        DisabledLabelTextColor = colorSchemeKeyTokens;
        DisabledLabelTextOpacity = 0.38f;
        FocusedContainerElevation = ElevationTokens.INSTANCE.m6670getLevel0D9Ej5fM();
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnPrimary;
        FocusedIconColor = colorSchemeKeyTokens2;
        FocusedLabelTextColor = colorSchemeKeyTokens2;
        HoveredContainerElevation = ElevationTokens.INSTANCE.m6671getLevel1D9Ej5fM();
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnPrimary;
        HoveredIconColor = colorSchemeKeyTokens3;
        HoveredLabelTextColor = colorSchemeKeyTokens3;
        IconColor = colorSchemeKeyTokens3;
        IconLabelSpace = 8.0f;
        IconSize = 20.0f;
        LabelTextColor = colorSchemeKeyTokens3;
        LabelTextSelectedColor = colorSchemeKeyTokens3;
        LabelTextUnselectedColor = ColorSchemeKeyTokens.OnSurfaceVariant;
        LeadingSpace = 24.0f;
        PressedContainerElevation = ElevationTokens.INSTANCE.m6670getLevel0D9Ej5fM();
        PressedContainerShape = ShapeKeyTokens.CornerSmall;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.OnPrimary;
        PressedIconColor = colorSchemeKeyTokens4;
        PressedLabelTextColor = colorSchemeKeyTokens4;
        SelectedContainerColor = ColorSchemeKeyTokens.Primary;
        SelectedContainerShapeRound = ShapeKeyTokens.CornerFull;
        SelectedContainerShapeSquare = ShapeKeyTokens.CornerMedium;
        SelectedFocusedIconColor = colorSchemeKeyTokens4;
        SelectedFocusedLabelTextColor = colorSchemeKeyTokens4;
        SelectedHoveredIconColor = colorSchemeKeyTokens4;
        SelectedHoveredLabelTextColor = colorSchemeKeyTokens4;
        SelectedIconColor = colorSchemeKeyTokens4;
        SelectedPressedIconColor = colorSchemeKeyTokens4;
        SelectedPressedLabelTextColor = colorSchemeKeyTokens4;
        TrailingSpace = 24.0f;
        UnselectedContainerColor = ColorSchemeKeyTokens.SurfaceContainer;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.OnSurfaceVariant;
        UnselectedFocusedIconColor = colorSchemeKeyTokens5;
        UnselectedFocusedLabelTextColor = colorSchemeKeyTokens5;
        UnselectedHoveredIconColor = colorSchemeKeyTokens5;
        UnselectedHoveredLabelTextColor = colorSchemeKeyTokens5;
        UnselectedIconColor = colorSchemeKeyTokens5;
        UnselectedPressedIconColor = colorSchemeKeyTokens5;
        UnselectedPressedLabelTextColor = colorSchemeKeyTokens5;
    }

    private BaselineButtonTokens() {
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m6456getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m6457getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShapeRound() {
        return ContainerShapeRound;
    }

    public final ShapeKeyTokens getContainerShapeSquare() {
        return ContainerShapeSquare;
    }

    public final ColorSchemeKeyTokens getDisabledContainerColor() {
        return DisabledContainerColor;
    }

    /* renamed from: getDisabledContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m6458getDisabledContainerElevationD9Ej5fM() {
        return DisabledContainerElevation;
    }

    public final float getDisabledContainerOpacity() {
        return DisabledContainerOpacity;
    }

    public final ColorSchemeKeyTokens getDisabledIconColor() {
        return DisabledIconColor;
    }

    public final float getDisabledIconOpacity() {
        return DisabledIconOpacity;
    }

    public final ColorSchemeKeyTokens getDisabledLabelTextColor() {
        return DisabledLabelTextColor;
    }

    public final float getDisabledLabelTextOpacity() {
        return DisabledLabelTextOpacity;
    }

    /* renamed from: getFocusedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m6459getFocusedContainerElevationD9Ej5fM() {
        return FocusedContainerElevation;
    }

    public final ColorSchemeKeyTokens getFocusedIconColor() {
        return FocusedIconColor;
    }

    public final ColorSchemeKeyTokens getFocusedLabelTextColor() {
        return FocusedLabelTextColor;
    }

    /* renamed from: getHoveredContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m6460getHoveredContainerElevationD9Ej5fM() {
        return HoveredContainerElevation;
    }

    public final ColorSchemeKeyTokens getHoveredIconColor() {
        return HoveredIconColor;
    }

    public final ColorSchemeKeyTokens getHoveredLabelTextColor() {
        return HoveredLabelTextColor;
    }

    public final ColorSchemeKeyTokens getIconColor() {
        return IconColor;
    }

    /* renamed from: getIconLabelSpace-D9Ej5fM, reason: not valid java name */
    public final float m6461getIconLabelSpaceD9Ej5fM() {
        return IconLabelSpace;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m6462getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final ColorSchemeKeyTokens getLabelTextColor() {
        return LabelTextColor;
    }

    public final ColorSchemeKeyTokens getLabelTextSelectedColor() {
        return LabelTextSelectedColor;
    }

    public final ColorSchemeKeyTokens getLabelTextUnselectedColor() {
        return LabelTextUnselectedColor;
    }

    /* renamed from: getLeadingSpace-D9Ej5fM, reason: not valid java name */
    public final float m6463getLeadingSpaceD9Ej5fM() {
        return LeadingSpace;
    }

    /* renamed from: getPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m6464getPressedContainerElevationD9Ej5fM() {
        return PressedContainerElevation;
    }

    public final ShapeKeyTokens getPressedContainerShape() {
        return PressedContainerShape;
    }

    public final ColorSchemeKeyTokens getPressedIconColor() {
        return PressedIconColor;
    }

    public final ColorSchemeKeyTokens getPressedLabelTextColor() {
        return PressedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getSelectedContainerColor() {
        return SelectedContainerColor;
    }

    public final ShapeKeyTokens getSelectedContainerShapeRound() {
        return SelectedContainerShapeRound;
    }

    public final ShapeKeyTokens getSelectedContainerShapeSquare() {
        return SelectedContainerShapeSquare;
    }

    public final ColorSchemeKeyTokens getSelectedFocusedIconColor() {
        return SelectedFocusedIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedFocusedLabelTextColor() {
        return SelectedFocusedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getSelectedHoveredIconColor() {
        return SelectedHoveredIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedHoveredLabelTextColor() {
        return SelectedHoveredLabelTextColor;
    }

    public final ColorSchemeKeyTokens getSelectedIconColor() {
        return SelectedIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedPressedIconColor() {
        return SelectedPressedIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedPressedLabelTextColor() {
        return SelectedPressedLabelTextColor;
    }

    /* renamed from: getTrailingSpace-D9Ej5fM, reason: not valid java name */
    public final float m6465getTrailingSpaceD9Ej5fM() {
        return TrailingSpace;
    }

    public final ColorSchemeKeyTokens getUnselectedContainerColor() {
        return UnselectedContainerColor;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusedIconColor() {
        return UnselectedFocusedIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusedLabelTextColor() {
        return UnselectedFocusedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getUnselectedHoveredIconColor() {
        return UnselectedHoveredIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedHoveredLabelTextColor() {
        return UnselectedHoveredLabelTextColor;
    }

    public final ColorSchemeKeyTokens getUnselectedIconColor() {
        return UnselectedIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedPressedIconColor() {
        return UnselectedPressedIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedPressedLabelTextColor() {
        return UnselectedPressedLabelTextColor;
    }
}
