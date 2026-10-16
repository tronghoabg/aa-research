package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemKt;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.g.a.l;
import h.g.b.o;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyGridMeasuredItem implements LazyGridItemInfo, LazyLayoutMeasuredItem {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final LazyLayoutItemAnimator<LazyGridMeasuredItem> animator;
    private final int beforeContentPadding;
    private int column;
    private final long constraints;
    private final Object contentType;
    private final int crossAxisSize;
    private final int horizontalAxisSize;
    private final int horizontalAxisSpacing;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final int lane;
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private final int mainAxisSize;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private long offset;
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private int row;
    private final long size;
    private final int span;
    private final int verticalAxisSize;
    private final int verticalAxisSpacing;
    private final long visualOffset;

    /* JADX WARN: Multi-variable type inference failed */
    private LazyGridMeasuredItem(int i2, Object obj, boolean z, int i3, int i4, boolean z2, LayoutDirection layoutDirection, int i5, int i6, List<? extends Placeable> list, long j2, Object obj2, LazyLayoutItemAnimator<LazyGridMeasuredItem> lazyLayoutItemAnimator, long j3, int i7, int i8) {
        int i9;
        this.index = i2;
        this.key = obj;
        this.isVertical = z;
        this.crossAxisSize = i3;
        this.reverseLayout = z2;
        this.layoutDirection = layoutDirection;
        this.beforeContentPadding = i5;
        this.afterContentPadding = i6;
        this.placeables = list;
        this.visualOffset = j2;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j3;
        this.lane = i7;
        this.span = i8;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        List<Placeable> placeables = getPlaceables();
        int size = placeables.size();
        int iMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Placeable placeable = placeables.get(i10);
            iMax = Math.max(iMax, this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        long j4 = iMax;
        this.mainAxisSize = iMax;
        boolean z3 = this.isVertical;
        if (z3) {
            this.verticalAxisSpacing = i4;
            this.verticalAxisSize = iMax;
            i9 = this.crossAxisSize;
            this.horizontalAxisSize = i9;
            this.horizontalAxisSpacing = 0;
        } else {
            this.verticalAxisSpacing = 0;
            int i11 = this.crossAxisSize;
            this.verticalAxisSize = i11;
            this.horizontalAxisSize = iMax;
            this.horizontalAxisSpacing = i4;
            i9 = i11;
        }
        this.size = z3 ? (j4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (i9 << 32) : (j4 << 32) | (i9 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        this.offset = IntOffset.Companion.m11307getZeronOccac();
        this.row = -1;
        this.column = -1;
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m2916copy4Tuh3kE(long j2, l<? super Integer, Integer> lVar) {
        return ((this.isVertical ? IntOffset.m11296getXimpl(j2) : lVar.invoke(Integer.valueOf(IntOffset.m11296getXimpl(j2))).intValue()) << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & (this.isVertical ? lVar.invoke(Integer.valueOf(IntOffset.m11297getYimpl(j2))).intValue() : IntOffset.m11297getYimpl(j2)));
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m2917getMainAxisgyyYBs(long j2) {
        return this.isVertical ? IntOffset.m11297getYimpl(j2) : IntOffset.m11296getXimpl(j2);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }

    public final void applyScrollDelta(int i2, boolean z) {
        if (this.nonScrollableItem) {
            return;
        }
        long jMo2908getOffsetnOccac = mo2908getOffsetnOccac();
        boolean z2 = this.isVertical;
        this.offset = ((z2 ? IntOffset.m11296getXimpl(jMo2908getOffsetnOccac) : IntOffset.m11296getXimpl(jMo2908getOffsetnOccac) + i2) << 32) | ((z2 ? IntOffset.m11297getYimpl(jMo2908getOffsetnOccac) + i2 : IntOffset.m11297getYimpl(jMo2908getOffsetnOccac)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
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

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getColumn() {
        return this.column;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getConstraints-msEJaDk */
    public long mo2887getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
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

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getLane() {
        return this.lane;
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
        return horizontalAxisSize + horizontalAxisSpacing;
    }

    public final boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getOffset-Bjo55l4 */
    public long mo2888getOffsetBjo55l4(int i2) {
        return mo2908getOffsetnOccac();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getOffset-nOcc-ac */
    public long mo2908getOffsetnOccac() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public List<Placeable> getPlaceables() {
        return this.placeables;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getRow() {
        return this.row;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getSize-YbymL2g */
    public long mo2909getSizeYbymL2g() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
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

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void makeNonScrollable() {
        this.nonScrollableItem = true;
    }

    public final void place(Placeable.PlacementScope placementScope, boolean z) {
        GraphicsLayer layer;
        Placeable.PlacementScope placementScope2;
        if (this.mainAxisLayoutSize == Integer.MIN_VALUE) {
            InlineClassHelperKt.throwIllegalArgumentException("position() should be called first");
        }
        int placeablesCount = LazyLayoutMeasuredItemKt.getPlaceablesCount(this);
        int i2 = 0;
        while (i2 < placeablesCount) {
            Placeable placeable = getPlaceables().get(i2);
            int mainAxisSize = this.minMainAxisOffset - getMainAxisSize(placeable);
            int i3 = this.maxMainAxisOffset;
            long jMo2908getOffsetnOccac = mo2908getOffsetnOccac();
            LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i2);
            if (animation != null) {
                if (z) {
                    animation.m2941setLookaheadOffsetgyyYBs(jMo2908getOffsetnOccac);
                } else {
                    long jM11300plusqkQi6aY = IntOffset.m11300plusqkQi6aY(!IntOffset.m11295equalsimpl0(animation.m2937getLookaheadOffsetnOccac(), LazyLayoutItemAnimation.Companion.m2944getNotInitializednOccac()) ? animation.m2937getLookaheadOffsetnOccac() : jMo2908getOffsetnOccac, animation.m2938getPlacementDeltanOccac());
                    if ((m2917getMainAxisgyyYBs(jMo2908getOffsetnOccac) <= mainAxisSize && m2917getMainAxisgyyYBs(jM11300plusqkQi6aY) <= mainAxisSize) || (m2917getMainAxisgyyYBs(jMo2908getOffsetnOccac) >= i3 && m2917getMainAxisgyyYBs(jM11300plusqkQi6aY) >= i3)) {
                        animation.cancelPlacementAnimation();
                    }
                    jMo2908getOffsetnOccac = jM11300plusqkQi6aY;
                }
                layer = animation.getLayer();
            } else {
                layer = null;
            }
            if (this.reverseLayout) {
                jMo2908getOffsetnOccac = ((this.isVertical ? (this.mainAxisLayoutSize - IntOffset.m11297getYimpl(jMo2908getOffsetnOccac)) - getMainAxisSize(placeable) : IntOffset.m11297getYimpl(jMo2908getOffsetnOccac)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | ((this.isVertical ? IntOffset.m11296getXimpl(jMo2908getOffsetnOccac) : (this.mainAxisLayoutSize - IntOffset.m11296getXimpl(jMo2908getOffsetnOccac)) - getMainAxisSize(placeable)) << 32);
            }
            long jM11300plusqkQi6aY2 = IntOffset.m11300plusqkQi6aY(jMo2908getOffsetnOccac, this.visualOffset);
            if (!z && animation != null) {
                animation.m2942setPlacementOffsetgyyYBs(jM11300plusqkQi6aY2);
            }
            if (!this.isVertical) {
                placementScope2 = placementScope;
                GraphicsLayer graphicsLayer = layer;
                if (graphicsLayer != null) {
                    Placeable.PlacementScope.m9816placeRelativeWithLayeraW9wM$default(placementScope2, placeable, jM11300plusqkQi6aY2, graphicsLayer, 0.0f, 4, (Object) null);
                } else {
                    Placeable.PlacementScope.m9815placeRelativeWithLayeraW9wM$default(placementScope2, placeable, jM11300plusqkQi6aY2, 0.0f, (l) null, 6, (Object) null);
                }
            } else if (layer != null) {
                placementScope2 = placementScope;
                Placeable.PlacementScope.m9818placeWithLayeraW9wM$default(placementScope2, placeable, jM11300plusqkQi6aY2, layer, 0.0f, 4, (Object) null);
            } else {
                placementScope2 = placementScope;
                Placeable.PlacementScope.m9817placeWithLayeraW9wM$default(placementScope2, placeable, jM11300plusqkQi6aY2, 0.0f, (l) null, 6, (Object) null);
            }
            i2++;
            placementScope = placementScope2;
        }
    }

    public final void position(int i2, int i3, int i4, int i5, int i6, int i7) {
        long j2;
        long j3;
        boolean z = this.isVertical;
        this.mainAxisLayoutSize = true != z ? i4 : i5;
        if (z && this.layoutDirection == LayoutDirection.Rtl) {
            if (true != this.isVertical) {
                i4 = i5;
            }
            i3 = (i4 - i3) - this.crossAxisSize;
        }
        long j4 = i2;
        long j5 = i3;
        if (this.isVertical) {
            j2 = j5 << 32;
            j3 = j4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        } else {
            j2 = j4 << 32;
            j3 = j5 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        }
        this.offset = j2 | j3;
        this.row = i6;
        this.column = i7;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }

    public final void setNonScrollableItem(boolean z) {
        this.nonScrollableItem = z;
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
        position(i2, i3, i4, i5, -1, -1);
    }

    public /* synthetic */ LazyGridMeasuredItem(int i2, Object obj, boolean z, int i3, int i4, boolean z2, LayoutDirection layoutDirection, int i5, int i6, List list, long j2, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j3, int i7, int i8, o oVar) {
        this(i2, obj, z, i3, i4, z2, layoutDirection, i5, i6, list, j2, obj2, lazyLayoutItemAnimator, j3, i7, i8);
    }
}
