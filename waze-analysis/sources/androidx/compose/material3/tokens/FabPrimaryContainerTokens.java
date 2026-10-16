package androidx.compose.material3.tokens;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FabPrimaryContainerTokens {
    public static final int $stable = 0;
    private static final ColorSchemeKeyTokens HoveredIconColor;
    private static final ColorSchemeKeyTokens IconColor;
    private static final float PressedContainerElevation;
    private static final ColorSchemeKeyTokens PressedIconColor;
    public static final FabPrimaryContainerTokens INSTANCE = new FabPrimaryContainerTokens();
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.PrimaryContainer;
    private static final float ContainerElevation = ElevationTokens.INSTANCE.m6673getLevel3D9Ej5fM();
    private static final float FocusedContainerElevation = ElevationTokens.INSTANCE.m6673getLevel3D9Ej5fM();
    private static final ColorSchemeKeyTokens FocusedIconColor = ColorSchemeKeyTokens.OnPrimaryContainer;
    private static final float HoveredContainerElevation = ElevationTokens.INSTANCE.m6674getLevel4D9Ej5fM();

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnPrimaryContainer;
        HoveredIconColor = colorSchemeKeyTokens;
        IconColor = colorSchemeKeyTokens;
        PressedContainerElevation = ElevationTokens.INSTANCE.m6673getLevel3D9Ej5fM();
        PressedIconColor = ColorSchemeKeyTokens.OnPrimaryContainer;
    }

    private FabPrimaryContainerTokens() {
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m6722getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* renamed from: getFocusedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m6723getFocusedContainerElevationD9Ej5fM() {
        return FocusedContainerElevation;
    }

    public final ColorSchemeKeyTokens getFocusedIconColor() {
        return FocusedIconColor;
    }

    /* renamed from: getHoveredContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m6724getHoveredContainerElevationD9Ej5fM() {
        return HoveredContainerElevation;
    }

    public final ColorSchemeKeyTokens getHoveredIconColor() {
        return HoveredIconColor;
    }

    public final ColorSchemeKeyTokens getIconColor() {
        return IconColor;
    }

    /* renamed from: getPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m6725getPressedContainerElevationD9Ej5fM() {
        return PressedContainerElevation;
    }

    public final ColorSchemeKeyTokens getPressedIconColor() {
        return PressedIconColor;
    }
}
