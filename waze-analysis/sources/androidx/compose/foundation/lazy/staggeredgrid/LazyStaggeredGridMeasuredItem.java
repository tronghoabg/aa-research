package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemKt;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.media3.muxer.MuxerUtil;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasuredItem implements LazyStaggeredGridItemInfo, LazyLayoutMeasuredItem {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> animator;
    private final int beforeContentPadding;
    private final long constraints;
    private final Object contentType;
    private final int crossAxisSize;
    private final int horizontalAxisSize;
    private final int horizontalAxisSpacing;
    private final int index;
    private final boolean isVertical;
    private boolean isVisible;
    private final Object key;
    private final int lane;
    private int mainAxisLayoutSize;
    private final int mainAxisSize;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private long offset;
    private final List<Placeable> placeables;
    private final long size;
    private final int span;
    private final int verticalAxisSize;
    private final int verticalAxisSpacing;

    /* JADX WARN: Multi-variable type inference failed */
    private LazyStaggeredGridMeasuredItem(int i2, Object obj, List<? extends Placeable> list, boolean z, int i3, int i4, int i5, int i6, int i7, Object obj2, LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> lazyLayoutItemAnimator, long j2) {
        int height;
        int width;
        int i8;
        this.index = i2;
        this.key = obj;
        this.placeables = list;
        this.isVertical = z;
        this.lane = i4;
        this.span = i5;
        this.beforeContentPadding = i6;
        this.afterContentPadding = i7;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j2;
        int i9 = 1;
        this.isVisible = true;
        List<Placeable> placeables = getPlaceables();
        if (placeables.isEmpty()) {
            height = 0;
        } else {
            Placeable placeable = placeables.get(0);
            height = z ? placeable.getHeight() : placeable.getWidth();
            x.f(placeables, "<this>");
            int size = placeables.size() - 1;
            if (size > 0) {
                int i10 = 1;
                while (true) {
                    Placeable placeable2 = placeables.get(i10);
                    int height2 = this.isVertical ? placeable2.getHeight() : placeable2.getWidth();
                    height = height2 > height ? height2 : height;
                    if (i10 == size) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        this.mainAxisSize = height;
        List<Placeable> placeables2 = getPlaceables();
        if (placeables2.isEmpty()) {
            width = 0;
        } else {
            Placeable placeable3 = placeables2.get(0);
            width = this.isVertical ? placeable3.getWidth() : placeable3.getHeight();
            x.f(placeables2, "<this>");
            int size2 = placeables2.size() - 1;
            if (size2 > 0) {
                while (true) {
                    Placeable placeable4 = placeables2.get(i9);
                    int width2 = this.isVertical ? placeable4.getWidth() : placeable4.getHeight();
                    width = width2 > width ? width2 : width;
                    if (i9 == size2) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
        }
        this.crossAxisSize = width;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        boolean z2 = this.isVertical;
        if (z2) {
            this.verticalAxisSpacing = i3;
            i8 = this.mainAxisSize;
            this.verticalAxisSize = i8;
            this.horizontalAxisSize = width;
            this.horizontalAxisSpacing = 0;
        } else {
            this.verticalAxisSpacing = 0;
            this.verticalAxisSize = width;
            i8 = this.mainAxisSize;
            this.horizontalAxisSize = i8;
            this.horizontalAxisSpacing = i3;
        }
        long j3 = width;
        this.size = z2 ? (i8 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (j3 << 32) : (i8 << 32) | (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        this.offset = IntOffset.Companion.m11307getZeronOccac();
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m3007copy4Tuh3kE(long j2, l<? super Integer, Integer> lVar) {
        return ((this.isVertical ? IntOffset.m11296getXimpl(j2) : lVar.invoke(Integer.valueOf(IntOffset.m11296getXimpl(j2))).intValue()) << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & (this.isVertical ? lVar.invoke(Integer.valueOf(IntOffset.m11297getYimpl(j2))).intValue() : IntOffset.m11297getYimpl(j2)));
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m3008getMainAxisgyyYBs(long j2) {
        return this.isVertical ? IntOffset.m11297getYimpl(j2) : IntOffset.m11296getXimpl(j2);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }

    public final void applyScrollDelta(int i2, boolean z) {
        if (this.nonScrollableItem) {
            return;
        }
        long jMo2989getOffsetnOccac = mo2989getOffsetnOccac();
        boolean z2 = this.isVertical;
        this.offset = ((z2 ? IntOffset.m11296getXimpl(jMo2989getOffsetnOccac) : IntOffset.m11296getXimpl(jMo2989getOffsetnOccac) + i2) << 32) | ((z2 ? IntOffset.m11297getYimpl(jMo2989getOffsetnOccac) + i2 : IntOffset.m11297getYimpl(jMo2989getOffsetnOccac)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        if (z) {
            int placeablesCount = LazyLayoutMeasuredItemKt.getPlaceablesCount(this);
            for (int i3 = 0; i3 < placeablesCount; i3++) {
                LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i3);
                if (animation != null) {
                    boolean z3 = this.isVertical;
                    long jM2940getTargetOffsetnOccac = animation.m2940getTargetOffsetnOccac();
                    animation.m2943setTargetOffsetgyyYBs(((this.isVertical ? Integer.valueOf(IntOffset.m11297getYimpl(jM2940getTargetOffsetnOccac) + i2).intValue() : IntOffset.m11297getYimpl(jM2940getTargetOffsetnOccac)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | ((z3 ? IntOffset.m11296getXimpl(jM2940getTargetOffsetnOccac) : Integer.valueOf(IntOffset.m11296getXimpl(jM2940getTargetOffsetnOccac) + i2).intValue()) << 32));
                }
            }
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getConstraints-msEJaDk */
    public long mo2887getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public Object getContentType() {
        return this.contentType;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getHorizontalAxisSize() {
        return this.horizontalAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getHorizontalAxisSpacing() {
        return this.horizontalAxisSpacing;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getLane() {
        return this.lane;
    }

    public final int getMainAxisOffset() {
        return !this.isVertical ? IntOffset.m11296getXimpl(mo2989getOffsetnOccac()) : IntOffset.m11297getYimpl(mo2989getOffsetnOccac());
    }

    public final int getMainAxisSizeWithSpacings() {
        int horizontalAxisSize;
        int horizontalAxisSpacing;
        if (this.isVertical) {
            horizontalAxisSize = getVerticalAxisSize();
            horizontalAxisSpacing = getVerticalAxisSpacing();
        } else {
            horizontalAxisSize = getHorizontalAxisSize();
            horizontalAxisSpacing = getHorizontalAxisSpacing();
        }
        int i2 = horizontalAxisSize + horizontalAxisSpacing;
        if (i2 < 0) {
            return 0;
        }
        return i2;
    }

    public final boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getOffset-Bjo55l4 */
    public long mo2888getOffsetBjo55l4(int i2) {
        return mo2989getOffsetnOccac();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* renamed from: getOffset-nOcc-ac */
    public long mo2989getOffsetnOccac() {
        return this.offset;
    }

    public final Object getParentData(int i2) {
        return getPlaceables().get(i2).getParentData();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public List<Placeable> getPlaceables() {
        return this.placeables;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* renamed from: getSize-YbymL2g */
    public long mo2990getSizeYbymL2g() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getVerticalAxisSize() {
        return this.verticalAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getVerticalAxisSpacing() {
        return this.verticalAxisSpacing;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void makeNonScrollable() {
        this.nonScrollableItem = true;
    }

    /* renamed from: place-GMOY1bU, reason: not valid java name */
    public final void m3009placeGMOY1bU(Placeable.PlacementScope placementScope, boolean z, long j2, boolean z2) {
        GraphicsLayer layer;
        if (this.mainAxisLayoutSize == Integer.MIN_VALUE) {
            InlineClassHelperKt.throwIllegalArgumentException("position() should be called first");
        }
        List<Placeable> placeables = getPlaceables();
        int size = placeables.size();
        for (int i2 = 0; i2 < size; i2++) {
            Placeable placeable = placeables.get(i2);
            int height = this.minMainAxisOffset - (this.isVertical ? placeable.getHeight() : placeable.getWidth());
            int i3 = this.maxMainAxisOffset;
            long jMo2989getOffsetnOccac = mo2989getOffsetnOccac();
            LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i2);
            if (animation != null) {
                if (z2) {
                    animation.m2941setLookaheadOffsetgyyYBs(jMo2989getOffsetnOccac);
                } else {
                    long jM11300plusqkQi6aY = IntOffset.m11300plusqkQi6aY(!IntOffset.m11295equalsimpl0(animation.m2937getLookaheadOffsetnOccac(), LazyLayoutItemAnimation.Companion.m2944getNotInitializednOccac()) ? animation.m2937getLookaheadOffsetnOccac() : jMo2989getOffsetnOccac, animation.m2938getPlacementDeltanOccac());
                    if ((m3008getMainAxisgyyYBs(jMo2989getOffsetnOccac) <= height && m3008getMainAxisgyyYBs(jM11300plusqkQi6aY) <= height) || (m3008getMainAxisgyyYBs(jMo2989getOffsetnOccac) >= i3 && m3008getMainAxisgyyYBs(jM11300plusqkQi6aY) >= i3)) {
                        animation.cancelPlacementAnimation();
                    }
                    jMo2989getOffsetnOccac = jM11300plusqkQi6aY;
                }
                layer = animation.getLayer();
            } else {
                layer = null;
            }
            if (z) {
                boolean z3 = this.isVertical;
                int iM11296getXimpl = z3 ? IntOffset.m11296getXimpl(jMo2989getOffsetnOccac) : (this.mainAxisLayoutSize - IntOffset.m11296getXimpl(jMo2989getOffsetnOccac)) - (z3 ? placeable.getHeight() : placeable.getWidth());
                boolean z4 = this.isVertical;
                jMo2989getOffsetnOccac = ((z4 ? (this.mainAxisLayoutSize - IntOffset.m11297getYimpl(jMo2989getOffsetnOccac)) - (z4 ? placeable.getHeight() : placeable.getWidth()) : IntOffset.m11297getYimpl(jMo2989getOffsetnOccac)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (iM11296getXimpl << 32);
            }
            long jM11300plusqkQi6aY2 = IntOffset.m11300plusqkQi6aY(jMo2989getOffsetnOccac, j2);
            if (!z2 && animation != null) {
                animation.m2942setPlacementOffsetgyyYBs(jM11300plusqkQi6aY2);
            }
            if (layer != null) {
                Placeable.PlacementScope.m9816placeRelativeWithLayeraW9wM$default(placementScope, placeable, jM11300plusqkQi6aY2, layer, 0.0f, 4, (Object) null);
            } else {
                Placeable.PlacementScope.m9815placeRelativeWithLayeraW9wM$default(placementScope, placeable, jM11300plusqkQi6aY2, 0.0f, (l) null, 6, (Object) null);
            }
        }
    }

    public final void position(int i2, int i3, int i4) {
        long j2;
        this.mainAxisLayoutSize = i4;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = i4 + this.afterContentPadding;
        long j3 = i2;
        long j4 = i3;
        if (this.isVertical) {
            j2 = (j4 << 32) | (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        } else {
            j2 = (j4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (j3 << 32);
        }
        this.offset = j2;
    }

    public final void setNonScrollableItem(boolean z) {
        this.nonScrollableItem = z;
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    public String toString() {
        return super.toString();
    }

    public final void updateMainAxisLayoutSize(int i2) {
        this.mainAxisLayoutSize = i2;
        this.maxMainAxisOffset = i2 + this.afterContentPadding;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void position(int i2, int i3, int i4, int i5) {
        if (true == this.isVertical) {
            i4 = i5;
        }
        position(i2, i3, i4);
    }

    public /* synthetic */ LazyStaggeredGridMeasuredItem(int i2, Object obj, List list, boolean z, int i3, int i4, int i5, int i6, int i7, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2, o oVar) {
        this(i2, obj, list, z, i3, i4, i5, i6, i7, obj2, lazyLayoutItemAnimator, j2);
    }
}
