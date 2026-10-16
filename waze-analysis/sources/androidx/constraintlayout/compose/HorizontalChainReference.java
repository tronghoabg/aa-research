package androidx.constraintlayout.compose;

import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class HorizontalChainReference extends LayoutReference {
    public static final int $stable = 0;
    private final ConstraintLayoutBaseScope.VerticalAnchor absoluteLeft;
    private final ConstraintLayoutBaseScope.VerticalAnchor absoluteRight;
    private final ConstraintLayoutBaseScope.VerticalAnchor end;
    private final ConstraintLayoutBaseScope.VerticalAnchor start;

    public HorizontalChainReference(Object obj) {
        super(obj);
        HorizontalChainReference horizontalChainReference = this;
        this.start = new ConstraintLayoutBaseScope.VerticalAnchor(obj, -2, horizontalChainReference);
        this.absoluteLeft = new ConstraintLayoutBaseScope.VerticalAnchor(obj, 0, horizontalChainReference);
        this.end = new ConstraintLayoutBaseScope.VerticalAnchor(obj, -1, horizontalChainReference);
        this.absoluteRight = new ConstraintLayoutBaseScope.VerticalAnchor(obj, 1, horizontalChainReference);
    }

    public static /* synthetic */ void getAbsoluteLeft$annotations() {
    }

    public static /* synthetic */ void getAbsoluteRight$annotations() {
    }

    public static /* synthetic */ void getEnd$annotations() {
    }

    public static /* synthetic */ void getStart$annotations() {
    }

    public final ConstraintLayoutBaseScope.VerticalAnchor getAbsoluteLeft() {
        return this.absoluteLeft;
    }

    public final ConstraintLayoutBaseScope.VerticalAnchor getAbsoluteRight() {
        return this.absoluteRight;
    }

    public final ConstraintLayoutBaseScope.VerticalAnchor getEnd() {
        return this.end;
    }

    public final ConstraintLayoutBaseScope.VerticalAnchor getStart() {
        return this.start;
    }
}
