package androidx.compose.material3.carousel;

import androidx.compose.foundation.gestures.Orientation;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class MultiAspectCarouselItemDrawInfoImpl implements MultiAspectCarouselItemDrawInfo {
    private final MultiAspectCarouselContainerState containerState;
    private final int index;
    private final MultiAspectCarouselItemInfoState itemState;

    public MultiAspectCarouselItemDrawInfoImpl(int i2, MultiAspectCarouselContainerState multiAspectCarouselContainerState, MultiAspectCarouselItemInfoState multiAspectCarouselItemInfoState) {
        this.index = i2;
        this.containerState = multiAspectCarouselContainerState;
        this.itemState = multiAspectCarouselItemInfoState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiAspectCarouselItemDrawInfoImpl)) {
            return false;
        }
        MultiAspectCarouselItemDrawInfoImpl multiAspectCarouselItemDrawInfoImpl = (MultiAspectCarouselItemDrawInfoImpl) obj;
        return getIndex() == multiAspectCarouselItemDrawInfoImpl.getIndex() && getSize() == multiAspectCarouselItemDrawInfoImpl.getSize() && getMinSize() == multiAspectCarouselItemDrawInfoImpl.getMinSize() && getMaxSize() == multiAspectCarouselItemDrawInfoImpl.getMaxSize() && getMaskStart() == multiAspectCarouselItemDrawInfoImpl.getMaskStart() && getMaskEnd() == multiAspectCarouselItemDrawInfoImpl.getMaskEnd() && getParallax() == multiAspectCarouselItemDrawInfoImpl.getParallax() && isHorizontal() == multiAspectCarouselItemDrawInfoImpl.isHorizontal();
    }

    @Override // androidx.compose.material3.carousel.MultiAspectCarouselItemDrawInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.material3.carousel.MultiAspectCarouselItemDrawInfo
    public float getMaskEnd() {
        return Float.intBitsToFloat((int) (MultiAspectCarouselKt.getMask(this.containerState, this.itemState) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    @Override // androidx.compose.material3.carousel.MultiAspectCarouselItemDrawInfo
    public float getMaskStart() {
        return Float.intBitsToFloat((int) (MultiAspectCarouselKt.getMask(this.containerState, this.itemState) >> 32));
    }

    @Override // androidx.compose.material3.carousel.MultiAspectCarouselItemDrawInfo
    public float getMaxSize() {
        return this.itemState.getMainAxisSize();
    }

    @Override // androidx.compose.material3.carousel.MultiAspectCarouselItemDrawInfo
    public float getMinSize() {
        return MultiAspectCarouselKt.getMinSize(this.itemState);
    }

    @Override // androidx.compose.material3.carousel.MultiAspectCarouselItemDrawInfo
    public float getParallax() {
        return MultiAspectCarouselKt.getParallax(this.containerState, this.itemState);
    }

    @Override // androidx.compose.material3.carousel.MultiAspectCarouselItemDrawInfo
    public float getSize() {
        return getMaskEnd() - getMaskStart();
    }

    public int hashCode() {
        return (((((((((((((getIndex() * 31) + Float.floatToIntBits(getSize())) * 31) + Float.floatToIntBits(getMinSize())) * 31) + Float.floatToIntBits(getMaxSize())) * 31) + Float.floatToIntBits(getMaskStart())) * 31) + Float.floatToIntBits(getMaskEnd())) * 31) + Float.floatToIntBits(getParallax())) * 31) + MultiAspectCarouselItemDrawInfoImpl$$ExternalSyntheticBackport0.m(isHorizontal());
    }

    @Override // androidx.compose.material3.carousel.MultiAspectCarouselItemDrawInfo
    public boolean isHorizontal() {
        return this.containerState.getOrientation() == Orientation.Horizontal;
    }

    public String toString() {
        return "MultiAspectCarouselItemDrawInfoImpl(size=" + getSize() + ",minSize=" + getMinSize() + ",maxSize=" + getMaxSize() + ",maskStart=" + getMaskStart() + ",maskEnd=" + getMaskEnd() + ",parallax=" + getParallax() + ",isHorizontal=" + isHorizontal() + ",)";
    }
}
