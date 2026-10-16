package androidx.constraintlayout.compose;

import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class VerticalChainReference extends LayoutReference {
    public static final int $stable = 0;
    private final ConstraintLayoutBaseScope.HorizontalAnchor bottom;
    private final ConstraintLayoutBaseScope.HorizontalAnchor top;

    public VerticalChainReference(Object obj) {
        super(obj);
        VerticalChainReference verticalChainReference = this;
        this.top = new ConstraintLayoutBaseScope.HorizontalAnchor(obj, 0, verticalChainReference);
        this.bottom = new ConstraintLayoutBaseScope.HorizontalAnchor(obj, 1, verticalChainReference);
    }

    public static /* synthetic */ void getBottom$annotations() {
    }

    public static /* synthetic */ void getTop$annotations() {
    }

    public final ConstraintLayoutBaseScope.HorizontalAnchor getBottom() {
        return this.bottom;
    }

    public final ConstraintLayoutBaseScope.HorizontalAnchor getTop() {
        return this.top;
    }
}
