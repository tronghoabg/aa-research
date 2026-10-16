package androidx.compose.foundation.gestures;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AnchoredDraggableState$anchoredDragScope$1 implements AnchoredDragScope {
    private float distance = Float.NaN;
    private T leftBound;
    private T rightBound;
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    AnchoredDraggableState$anchoredDragScope$1(AnchoredDraggableState<T> anchoredDraggableState) {
        this.this$0 = anchoredDraggableState;
    }

    @Override // androidx.compose.foundation.gestures.AnchoredDragScope
    public void dragTo(float f2, float f3) {
        AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
        float offset = anchoredDraggableState.getOffset();
        anchoredDraggableState.setOffset(f2);
        this.this$0.setLastVelocity(f3);
        if (Float.isNaN(offset)) {
            return;
        }
        updateIfNeeded(f2 >= offset);
    }

    public final float getDistance() {
        return this.distance;
    }

    public final T getLeftBound() {
        return this.leftBound;
    }

    public final T getRightBound() {
        return this.rightBound;
    }

    public final void setDistance(float f2) {
        this.distance = f2;
    }

    public final void setLeftBound(T t) {
        this.leftBound = t;
    }

    public final void setRightBound(T t) {
        this.rightBound = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14, types: [T, java.lang.Object] */
    public final void updateBounds(boolean z) {
        AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
        float fPositionOf = anchoredDraggableState.getAnchors().positionOf(anchoredDraggableState.getCurrentValue());
        float offset = this.this$0.getOffset();
        AnchoredDraggableState<T> anchoredDraggableState2 = this.this$0;
        if (offset == fPositionOf) {
            Object objClosestAnchor = this.this$0.getAnchors().closestAnchor(anchoredDraggableState2.getOffset() + (true != z ? -1.0f : 1.0f), z);
            T currentValue = objClosestAnchor;
            if (objClosestAnchor == null) {
                currentValue = this.this$0.getCurrentValue();
            }
            if (z) {
                this.leftBound = this.this$0.getCurrentValue();
                this.rightBound = currentValue;
            } else {
                this.leftBound = currentValue;
                this.rightBound = this.this$0.getCurrentValue();
            }
        } else {
            Object objClosestAnchor2 = anchoredDraggableState2.getAnchors().closestAnchor(anchoredDraggableState2.getOffset(), false);
            T currentValue2 = objClosestAnchor2;
            if (objClosestAnchor2 == null) {
                currentValue2 = this.this$0.getCurrentValue();
            }
            AnchoredDraggableState<T> anchoredDraggableState3 = this.this$0;
            Object objClosestAnchor3 = anchoredDraggableState3.getAnchors().closestAnchor(anchoredDraggableState3.getOffset(), true);
            T currentValue3 = objClosestAnchor3;
            if (objClosestAnchor3 == null) {
                currentValue3 = this.this$0.getCurrentValue();
            }
            this.leftBound = currentValue2;
            this.rightBound = currentValue3;
        }
        DraggableAnchors anchors = this.this$0.getAnchors();
        T t = this.leftBound;
        if (t == 0) {
            x.g();
        }
        float fPositionOf2 = anchors.positionOf(t);
        DraggableAnchors anchors2 = this.this$0.getAnchors();
        T t2 = this.rightBound;
        if (t2 == 0) {
            x.g();
        }
        this.distance = Math.abs(fPositionOf2 - anchors2.positionOf(t2));
    }

    public final void updateIfNeeded(boolean z) {
        updateBounds(z);
        AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
        if (Math.abs(anchoredDraggableState.getOffset() - anchoredDraggableState.getAnchors().positionOf(anchoredDraggableState.getCurrentValue())) >= this.distance / 2.0f) {
            Object currentValue = z ? this.rightBound : this.leftBound;
            if (currentValue == null) {
                currentValue = this.this$0.getCurrentValue();
            }
            if (((Boolean) this.this$0.getConfirmValueChange$foundation().invoke(currentValue)).booleanValue()) {
                this.this$0.setCurrentValue(currentValue);
            }
        }
    }
}
