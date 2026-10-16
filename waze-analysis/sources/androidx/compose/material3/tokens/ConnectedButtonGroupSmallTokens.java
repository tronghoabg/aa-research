package androidx.compose.material3.tokens;

import androidx.compose.foundation.shape.CornerSize;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ConnectedButtonGroupSmallTokens {
    public static final int $stable = 0;
    public static final ConnectedButtonGroupSmallTokens INSTANCE = new ConnectedButtonGroupSmallTokens();
    private static final float BetweenSpace = 2.0f;
    private static final float ContainerHeight = 40.0f;
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerFull;
    private static final CornerSize InnerCornerCornerSize = ShapeTokens.INSTANCE.getCornerValueSmall();
    private static final CornerSize PressedInnerCornerCornerSize = ShapeTokens.INSTANCE.getCornerValueExtraSmall();
    private static final float SelectedInnerCornerCornerSizePercent = 50.0f;

    private ConnectedButtonGroupSmallTokens() {
    }

    /* renamed from: getBetweenSpace-D9Ej5fM, reason: not valid java name */
    public final float m6616getBetweenSpaceD9Ej5fM() {
        return BetweenSpace;
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m6617getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final CornerSize getInnerCornerCornerSize() {
        return InnerCornerCornerSize;
    }

    public final CornerSize getPressedInnerCornerCornerSize() {
        return PressedInnerCornerCornerSize;
    }

    public final float getSelectedInnerCornerCornerSizePercent() {
        return SelectedInnerCornerCornerSizePercent;
    }
}
