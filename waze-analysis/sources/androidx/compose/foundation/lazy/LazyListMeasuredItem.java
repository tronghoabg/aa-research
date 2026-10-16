package androidx.compose.foundation.lazy;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.e;
import h.g.a.l;
import h.g.b.o;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyListMeasuredItem implements LazyListItemInfo, LazyLayoutMeasuredItem {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final LazyLayoutItemAnimator<LazyListMeasuredItem> animator;
    private final int beforeContentPadding;
    private final long constraints;
    private final Object contentType;
    private final int crossAxisSize;
    private final Alignment.Horizontal horizontalAlignment;
    private final int horizontalAxisSize;
    private final int horizontalAxisSpacing;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final int lane;
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private int offset;
    private final int[] placeableOffsets;
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private final int size;
    private final int spacing;
    private final int span;
    private final Alignment.Vertical verticalAlignment;
    private final int verticalAxisSize;
    private final int verticalAxisSpacing;
    private final long visualOffset;

    /* JADX WARN: Multi-variable type inference failed */
    private LazyListMeasuredItem(int i2, List<? extends Placeable> list, boolean z, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z2, int i3, int i4, int i5, long j2, Object obj, Object obj2, LazyLayoutItemAnimator<LazyListMeasuredItem> lazyLayoutItemAnimator, long j3) {
        this.index = i2;
        this.placeables = list;
        this.isVertical = z;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = z2;
        this.beforeContentPadding = i3;
        this.afterContentPadding = i4;
        this.spacing = i5;
        this.visualOffset = j2;
        this.key = obj;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j3;
        this.span = 1;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        List<Placeable> placeables = getPlaceables();
        int size = placeables.size();
        int height = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            Placeable placeable = placeables.get(i6);
            height += this.isVertical ? placeable.getHeight() : placeable.getWidth();
            iMax = Math.max(iMax, !this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.size = height;
        this.crossAxisSize = iMax;
        int size2 = getPlaceables().size();
        this.placeableOffsets = new int[size2 + size2];
        if (this.isVertical) {
            this.verticalAxisSpacing = this.spacing;
            this.verticalAxisSize = getSize();
            this.horizontalAxisSize = iMax;
            this.horizontalAxisSpacing = 0;
            return;
        }
        this.verticalAxisSpacing = 0;
        this.verticalAxisSize = iMax;
        this.horizontalAxisSize = getSize();
        this.horizontalAxisSpacing = this.spacing;
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m2885copy4Tuh3kE(long j2, l<? super Integer, Integer> lVar) {
        int iIntValue;
        int iM11297getYimpl;
        if (this.isVertical) {
            iIntValue = IntOffset.m11296getXimpl(j2);
            iM11297getYimpl = lVar.invoke(Integer.valueOf(IntOffset.m11297getYimpl(j2))).intValue();
        } else {
            iIntValue = lVar.invoke(Integer.valueOf(IntOffset.m11296getXimpl(j2))).intValue();
            iM11297getYimpl = IntOffset.m11297getYimpl(j2);
        }
        return (iM11297getYimpl & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (iIntValue << 32);
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m2886getMainAxisgyyYBs(long j2) {
        return this.isVertical ? IntOffset.m11297getYimpl(j2) : IntOffset.m11296getXimpl(j2);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }

    public final void applyScrollDelta(int i2, boolean z) {
        int iIntValue;
        int iM11297getYimpl;
        if (this.nonScrollableItem) {
            return;
        }
        this.offset = getOffset() + i2;
        int length = this.placeableOffsets.length;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i3 & 1;
            boolean z2 = this.isVertical;
            if (z2) {
                if (i4 == 0) {
                    i4 = 0;
                    if (z2) {
                    }
                }
                int[] iArr = this.placeableOffsets;
                iArr[i3] = iArr[i3] + i2;
            } else if (z2 && i4 == 0) {
                int[] iArr2 = this.placeableOffsets;
                iArr2[i3] = iArr2[i3] + i2;
            }
        }
        if (z) {
            int placeablesCount = LazyLayoutMeasuredItemKt.getPlaceablesCount(this);
            for (int i5 = 0; i5 < placeablesCount; i5++) {
                LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i5);
                if (animation != null) {
                    boolean z3 = this.isVertical;
                    long jM2940getTargetOffsetnOccac = animation.m2940getTargetOffsetnOccac();
                    if (z3) {
                        iIntValue = IntOffset.m11296getXimpl(jM2940getTargetOffsetnOccac);
                        iM11297getYimpl = Integer.valueOf(IntOffset.m11297getYimpl(jM2940getTargetOffsetnOccac) + i2).intValue();
                    } else {
                        iIntValue = Integer.valueOf(IntOffset.m11296getXimpl(jM2940getTargetOffsetnOccac) + i2).intValue();
                        iM11297getYimpl = IntOffset.m11297getYimpl(jM2940getTargetOffsetnOccac);
                    }
                    animation.m2943setTargetOffsetgyyYBs((iM11297getYimpl & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (iIntValue << 32));
                }
            }
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public long mo2887getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
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

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
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
        int i2 = horizontalAxisSize + horizontalAxisSpacing;
        if (i2 < 0) {
            return 0;
        }
        return i2;
    }

    public final boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getOffset() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getOffset-Bjo55l4, reason: not valid java name */
    public long mo2888getOffsetBjo55l4(int i2) {
        if (i2 == 0) {
            if (LazyLayoutMeasuredItemKt.getPlaceablesCount(this) == 0) {
                boolean z = this.isVertical;
                int offset = getOffset();
                return z ? offset & MuxerUtil.UNSIGNED_INT_MAX_VALUE : offset << 32;
            }
            i2 = 0;
        }
        int[] iArr = this.placeableOffsets;
        int i3 = i2 + i2;
        return (iArr[i3 + 1] & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (iArr[i3] << 32);
    }

    public final Object getParentData(int i2) {
        return getPlaceables().get(i2).getParentData();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public List<Placeable> getPlaceables() {
        return this.placeables;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getSize() {
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
            long jMo2888getOffsetBjo55l4 = mo2888getOffsetBjo55l4(i2);
            LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i2);
            if (animation != null) {
                if (z) {
                    animation.m2941setLookaheadOffsetgyyYBs(jMo2888getOffsetBjo55l4);
                } else {
                    if (!IntOffset.m11295equalsimpl0(animation.m2937getLookaheadOffsetnOccac(), LazyLayoutItemAnimation.Companion.m2944getNotInitializednOccac())) {
                        jMo2888getOffsetBjo55l4 = animation.m2937getLookaheadOffsetnOccac();
                    }
                    long jM11300plusqkQi6aY = IntOffset.m11300plusqkQi6aY(jMo2888getOffsetBjo55l4, animation.m2938getPlacementDeltanOccac());
                    if ((m2886getMainAxisgyyYBs(jMo2888getOffsetBjo55l4) <= mainAxisSize && m2886getMainAxisgyyYBs(jM11300plusqkQi6aY) <= mainAxisSize) || (m2886getMainAxisgyyYBs(jMo2888getOffsetBjo55l4) >= i3 && m2886getMainAxisgyyYBs(jM11300plusqkQi6aY) >= i3)) {
                        animation.cancelPlacementAnimation();
                    }
                    jMo2888getOffsetBjo55l4 = jM11300plusqkQi6aY;
                }
                layer = animation.getLayer();
            } else {
                layer = null;
            }
            if (this.reverseLayout) {
                if (this.isVertical) {
                    jMo2888getOffsetBjo55l4 = (((this.mainAxisLayoutSize - IntOffset.m11297getYimpl(jMo2888getOffsetBjo55l4)) - getMainAxisSize(placeable)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (IntOffset.m11296getXimpl(jMo2888getOffsetBjo55l4) << 32);
                } else {
                    jMo2888getOffsetBjo55l4 = (((this.mainAxisLayoutSize - IntOffset.m11296getXimpl(jMo2888getOffsetBjo55l4)) - getMainAxisSize(placeable)) << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & IntOffset.m11297getYimpl(jMo2888getOffsetBjo55l4));
                }
            }
            long jM11300plusqkQi6aY2 = IntOffset.m11300plusqkQi6aY(jMo2888getOffsetBjo55l4, this.visualOffset);
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

    public final void position(int i2, int i3, int i4) {
        int width;
        this.offset = i2;
        this.mainAxisLayoutSize = true != this.isVertical ? i3 : i4;
        List<Placeable> placeables = getPlaceables();
        int size = placeables.size();
        for (int i5 = 0; i5 < size; i5++) {
            Placeable placeable = placeables.get(i5);
            boolean z = this.isVertical;
            int i6 = i5 + i5;
            int[] iArr = this.placeableOffsets;
            if (z) {
                Alignment.Horizontal horizontal = this.horizontalAlignment;
                if (horizontal == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalAlignment when isVertical == true");
                    throw new e();
                }
                iArr[i6] = horizontal.align(placeable.getWidth(), i3, this.layoutDirection);
                this.placeableOffsets[i6 + 1] = i2;
                width = placeable.getHeight();
            } else {
                int i7 = i6 + 1;
                iArr[i6] = i2;
                Alignment.Vertical vertical = this.verticalAlignment;
                if (vertical == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalAlignment when isVertical == false");
                    throw new e();
                }
                iArr[i7] = vertical.align(placeable.getHeight(), i4);
                width = placeable.getWidth();
            }
            i2 += width;
        }
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

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void position(int i2, int i3, int i4, int i5) {
        position(i2, i4, i5);
    }

    public /* synthetic */ LazyListMeasuredItem(int i2, List list, boolean z, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z2, int i3, int i4, int i5, long j2, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j3, o oVar) {
        this(i2, list, z, horizontal, vertical, layoutDirection, z2, i3, i4, i5, j2, obj, obj2, lazyLayoutItemAnimator, j3);
    }
}
