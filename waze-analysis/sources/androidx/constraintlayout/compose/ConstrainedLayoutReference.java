package androidx.constraintlayout.compose;

import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ConstrainedLayoutReference extends LayoutReference {
    public static final int $stable = 0;
    private final ConstraintLayoutBaseScope.VerticalAnchor absoluteLeft;
    private final ConstraintLayoutBaseScope.VerticalAnchor absoluteRight;
    private final ConstraintLayoutBaseScope.BaselineAnchor baseline;
    private final ConstraintLayoutBaseScope.HorizontalAnchor bottom;
    private final ConstraintLayoutBaseScope.VerticalAnchor end;
    private final Object id;
    private final ConstraintLayoutBaseScope.VerticalAnchor start;
    private final ConstraintLayoutBaseScope.HorizontalAnchor top;

    public ConstrainedLayoutReference(Object obj) {
        super(obj);
        this.id = obj;
        ConstrainedLayoutReference constrainedLayoutReference = this;
        this.start = new ConstraintLayoutBaseScope.VerticalAnchor(getId$constraintlayout_compose(), -2, constrainedLayoutReference);
        this.absoluteLeft = new ConstraintLayoutBaseScope.VerticalAnchor(getId$constraintlayout_compose(), 0, constrainedLayoutReference);
        this.top = new ConstraintLayoutBaseScope.HorizontalAnchor(getId$constraintlayout_compose(), 0, constrainedLayoutReference);
        this.end = new ConstraintLayoutBaseScope.VerticalAnchor(getId$constraintlayout_compose(), -1, constrainedLayoutReference);
        this.absoluteRight = new ConstraintLayoutBaseScope.VerticalAnchor(getId$constraintlayout_compose(), 1, constrainedLayoutReference);
        this.bottom = new ConstraintLayoutBaseScope.HorizontalAnchor(getId$constraintlayout_compose(), 1, constrainedLayoutReference);
        this.baseline = new ConstraintLayoutBaseScope.BaselineAnchor(getId$constraintlayout_compose(), constrainedLayoutReference);
    }

    public static /* synthetic */ void getAbsoluteLeft$annotations() {
    }

    public static /* synthetic */ void getAbsoluteRight$annotations() {
    }

    public static /* synthetic */ void getBaseline$annotations() {
    }

    public static /* synthetic */ void getBottom$annotations() {
    }

    public static /* synthetic */ void getEnd$annotations() {
    }

    public static /* synthetic */ void getStart$annotations() {
    }

    public static /* synthetic */ void getTop$annotations() {
    }

    public final ConstraintLayoutBaseScope.VerticalAnchor getAbsoluteLeft() {
        return this.absoluteLeft;
    }

    public final ConstraintLayoutBaseScope.VerticalAnchor getAbsoluteRight() {
        return this.absoluteRight;
    }

    public final ConstraintLayoutBaseScope.BaselineAnchor getBaseline() {
        return this.baseline;
    }

    public final ConstraintLayoutBaseScope.HorizontalAnchor getBottom() {
        return this.bottom;
    }

    public final ConstraintLayoutBaseScope.VerticalAnchor getEnd() {
        return this.end;
    }

    @Override // androidx.constraintlayout.compose.LayoutReference
    public Object getId$constraintlayout_compose() {
        return this.id;
    }

    public final ConstraintLayoutBaseScope.VerticalAnchor getStart() {
        return this.start;
    }

    public final ConstraintLayoutBaseScope.HorizontalAnchor getTop() {
        return this.top;
    }
}
