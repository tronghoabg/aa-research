package androidx.constraintlayout.compose;

import androidx.constraintlayout.compose.SwipeMode;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class OnSwipe {
    public static final int $stable = 0;
    private final ConstrainedLayoutReference anchor;
    private final SwipeDirection direction;
    private final ConstrainedLayoutReference dragAround;
    private final float dragScale;
    private final float dragThreshold;
    private final ConstrainedLayoutReference limitBoundsTo;
    private final SwipeMode mode;
    private final SwipeTouchUp onTouchUp;
    private final SwipeSide side;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OnSwipe(ConstrainedLayoutReference constrainedLayoutReference, SwipeSide swipeSide, SwipeDirection swipeDirection, float f2, float f3, ConstrainedLayoutReference constrainedLayoutReference2, ConstrainedLayoutReference constrainedLayoutReference3, SwipeTouchUp swipeTouchUp, SwipeMode swipeMode, int i2, o oVar) {
        SwipeTouchUp autoComplete = (i2 & 128) != 0 ? SwipeTouchUp.Companion.getAutoComplete() : swipeTouchUp;
        SwipeMode swipeModeVelocity$default = (i2 & 256) != 0 ? SwipeMode.Companion.velocity$default(SwipeMode.Companion, 0.0f, 0.0f, 3, null) : swipeMode;
        int i3 = i2 & 32;
        int i4 = i2 & 16;
        int i5 = i2 & 8;
        ConstrainedLayoutReference constrainedLayoutReference4 = (i2 & 64) != 0 ? null : constrainedLayoutReference3;
        ConstrainedLayoutReference constrainedLayoutReference5 = i3 != 0 ? null : constrainedLayoutReference2;
        this(constrainedLayoutReference, swipeSide, swipeDirection, i5 != 0 ? 1.0f : f2, i4 != 0 ? 10.0f : f3, constrainedLayoutReference5, constrainedLayoutReference4, autoComplete, swipeModeVelocity$default);
    }

    public final ConstrainedLayoutReference getAnchor() {
        return this.anchor;
    }

    public final SwipeDirection getDirection() {
        return this.direction;
    }

    public final ConstrainedLayoutReference getDragAround() {
        return this.dragAround;
    }

    public final float getDragScale() {
        return this.dragScale;
    }

    public final float getDragThreshold() {
        return this.dragThreshold;
    }

    public final ConstrainedLayoutReference getLimitBoundsTo() {
        return this.limitBoundsTo;
    }

    public final SwipeMode getMode() {
        return this.mode;
    }

    public final SwipeTouchUp getOnTouchUp() {
        return this.onTouchUp;
    }

    public final SwipeSide getSide() {
        return this.side;
    }

    public OnSwipe(ConstrainedLayoutReference constrainedLayoutReference, SwipeSide swipeSide, SwipeDirection swipeDirection, float f2, float f3, ConstrainedLayoutReference constrainedLayoutReference2, ConstrainedLayoutReference constrainedLayoutReference3, SwipeTouchUp swipeTouchUp, SwipeMode swipeMode) {
        this.anchor = constrainedLayoutReference;
        this.side = swipeSide;
        this.direction = swipeDirection;
        this.dragScale = f2;
        this.dragThreshold = f3;
        this.dragAround = constrainedLayoutReference2;
        this.limitBoundsTo = constrainedLayoutReference3;
        this.onTouchUp = swipeTouchUp;
        this.mode = swipeMode;
    }
}
