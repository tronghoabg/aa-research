package androidx.constraintlayout.compose;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class CarouselState {
    private boolean animating;
    private MotionCarouselDirection direction;
    private int index;
    private boolean snapping;
    private int targetIndex;

    public CarouselState(MotionCarouselDirection motionCarouselDirection, int i2, int i3, boolean z, boolean z2) {
        this.direction = motionCarouselDirection;
        this.index = i2;
        this.targetIndex = i3;
        this.snapping = z;
        this.animating = z2;
    }

    public static /* synthetic */ CarouselState copy$default(CarouselState carouselState, MotionCarouselDirection motionCarouselDirection, int i2, int i3, boolean z, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            motionCarouselDirection = carouselState.direction;
        }
        if ((i4 & 2) != 0) {
            i2 = carouselState.index;
        }
        if ((i4 & 4) != 0) {
            i3 = carouselState.targetIndex;
        }
        if ((i4 & 8) != 0) {
            z = carouselState.snapping;
        }
        if ((i4 & 16) != 0) {
            z2 = carouselState.animating;
        }
        boolean z3 = z2;
        int i5 = i3;
        return carouselState.copy(motionCarouselDirection, i2, i5, z, z3);
    }

    public final MotionCarouselDirection component1() {
        return this.direction;
    }

    public final int component2() {
        return this.index;
    }

    public final int component3() {
        return this.targetIndex;
    }

    public final boolean component4() {
        return this.snapping;
    }

    public final boolean component5() {
        return this.animating;
    }

    public final CarouselState copy(MotionCarouselDirection motionCarouselDirection, int i2, int i3, boolean z, boolean z2) {
        return new CarouselState(motionCarouselDirection, i2, i3, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarouselState)) {
            return false;
        }
        CarouselState carouselState = (CarouselState) obj;
        return this.direction == carouselState.direction && this.index == carouselState.index && this.targetIndex == carouselState.targetIndex && this.snapping == carouselState.snapping && this.animating == carouselState.animating;
    }

    public final boolean getAnimating() {
        return this.animating;
    }

    public final MotionCarouselDirection getDirection() {
        return this.direction;
    }

    public final int getIndex() {
        return this.index;
    }

    public final boolean getSnapping() {
        return this.snapping;
    }

    public final int getTargetIndex() {
        return this.targetIndex;
    }

    public int hashCode() {
        int iHashCode = (((this.direction.hashCode() * 31) + this.index) * 31) + this.targetIndex;
        return (((iHashCode * 31) + CarouselState$$ExternalSyntheticBackport0.m(this.snapping)) * 31) + CarouselState$$ExternalSyntheticBackport0.m(this.animating);
    }

    public final void setAnimating(boolean z) {
        this.animating = z;
    }

    public final void setDirection(MotionCarouselDirection motionCarouselDirection) {
        this.direction = motionCarouselDirection;
    }

    public final void setIndex(int i2) {
        this.index = i2;
    }

    public final void setSnapping(boolean z) {
        this.snapping = z;
    }

    public final void setTargetIndex(int i2) {
        this.targetIndex = i2;
    }

    public String toString() {
        return "CarouselState(direction=" + this.direction + ", index=" + this.index + ", targetIndex=" + this.targetIndex + ", snapping=" + this.snapping + ", animating=" + this.animating + ')';
    }
}
