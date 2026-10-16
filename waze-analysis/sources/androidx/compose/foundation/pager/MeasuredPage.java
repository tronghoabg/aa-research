package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.Alignment;
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
public final class MeasuredPage implements PageInfo {
    public static final int $stable = 8;
    private final int crossAxisSize;
    private final Alignment.Horizontal horizontalAlignment;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private int offset;
    private final int[] placeableOffsets;
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private final int size;
    private final Alignment.Vertical verticalAlignment;
    private final long visualOffset;

    /* JADX WARN: Multi-variable type inference failed */
    private MeasuredPage(int i2, int i3, List<? extends Placeable> list, long j2, Object obj, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z) {
        this.index = i2;
        this.size = i3;
        this.placeables = list;
        this.visualOffset = j2;
        this.key = obj;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = z;
        this.isVertical = orientation == Orientation.Vertical;
        int size = list.size();
        int iMax = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Placeable placeable = (Placeable) list.get(i4);
            iMax = Math.max(iMax, !this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.crossAxisSize = iMax;
        int size2 = this.placeables.size();
        this.placeableOffsets = new int[size2 + size2];
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m3028copy4Tuh3kE(long j2, l<? super Integer, Integer> lVar) {
        return ((this.isVertical ? IntOffset.m11296getXimpl(j2) : lVar.invoke(Integer.valueOf(IntOffset.m11296getXimpl(j2))).intValue()) << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & (this.isVertical ? lVar.invoke(Integer.valueOf(IntOffset.m11297getYimpl(j2))).intValue() : IntOffset.m11297getYimpl(j2)));
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }

    /* renamed from: getOffset-Bjo55l4, reason: not valid java name */
    private final long m3029getOffsetBjo55l4(int i2) {
        return (r4[r5 + 1] & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (this.placeableOffsets[i2 + i2] << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void applyScrollDelta(int r5) {
        /*
            r4 = this;
            int r0 = r4.getOffset()
            int r0 = r0 + r5
            r4.offset = r0
            int[] r0 = r4.placeableOffsets
            int r0 = r0.length
            r1 = 0
        Lb:
            if (r1 >= r0) goto L25
            boolean r2 = r4.isVertical
            if (r2 == 0) goto L17
            int r2 = r1 % 2
            r3 = 1
            if (r2 != r3) goto L22
            goto L1b
        L17:
            int r2 = r1 % 2
            if (r2 != 0) goto L22
        L1b:
            int[] r2 = r4.placeableOffsets
            r3 = r2[r1]
            int r3 = r3 + r5
            r2[r1] = r3
        L22:
            int r1 = r1 + 1
            goto Lb
        L25:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.MeasuredPage.applyScrollDelta(int):void");
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public int getOffset() {
        return this.offset;
    }

    public final int getSize() {
        return this.size;
    }

    public final void place(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope placementScope2;
        int iM11296getXimpl;
        int iM11297getYimpl;
        if (this.mainAxisLayoutSize == Integer.MIN_VALUE) {
            InlineClassHelperKt.throwIllegalArgumentException("position() should be called first");
        }
        int size = this.placeables.size();
        int i2 = 0;
        while (i2 < size) {
            Placeable placeable = this.placeables.get(i2);
            long jM3029getOffsetBjo55l4 = m3029getOffsetBjo55l4(i2);
            if (this.reverseLayout) {
                if (this.isVertical) {
                    iM11296getXimpl = IntOffset.m11296getXimpl(jM3029getOffsetBjo55l4);
                } else {
                    iM11296getXimpl = (this.mainAxisLayoutSize - IntOffset.m11296getXimpl(jM3029getOffsetBjo55l4)) - getMainAxisSize(placeable);
                }
                if (this.isVertical) {
                    iM11297getYimpl = (this.mainAxisLayoutSize - IntOffset.m11297getYimpl(jM3029getOffsetBjo55l4)) - getMainAxisSize(placeable);
                } else {
                    iM11297getYimpl = IntOffset.m11297getYimpl(jM3029getOffsetBjo55l4);
                }
                jM3029getOffsetBjo55l4 = (iM11297getYimpl & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (iM11296getXimpl << 32);
            }
            long j2 = this.visualOffset;
            boolean z = this.isVertical;
            long jM11300plusqkQi6aY = IntOffset.m11300plusqkQi6aY(jM3029getOffsetBjo55l4, j2);
            if (z) {
                placementScope2 = placementScope;
                Placeable.PlacementScope.m9817placeWithLayeraW9wM$default(placementScope2, placeable, jM11300plusqkQi6aY, 0.0f, (l) null, 6, (Object) null);
            } else {
                placementScope2 = placementScope;
                Placeable.PlacementScope.m9815placeRelativeWithLayeraW9wM$default(placementScope2, placeable, jM11300plusqkQi6aY, 0.0f, (l) null, 6, (Object) null);
            }
            i2++;
            placementScope = placementScope2;
        }
    }

    public final void position(int i2, int i3, int i4) {
        int width;
        this.offset = i2;
        this.mainAxisLayoutSize = true != this.isVertical ? i3 : i4;
        List<Placeable> list = this.placeables;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            Placeable placeable = list.get(i5);
            boolean z = this.isVertical;
            int i6 = i5 + i5;
            int[] iArr = this.placeableOffsets;
            if (z) {
                Alignment.Horizontal horizontal = this.horizontalAlignment;
                if (horizontal == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalAlignment");
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
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalAlignment");
                    throw new e();
                }
                iArr[i7] = vertical.align(placeable.getHeight(), i4);
                width = placeable.getWidth();
            }
            i2 += width;
        }
    }

    public /* synthetic */ MeasuredPage(int i2, int i3, List list, long j2, Object obj, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z, o oVar) {
        this(i2, i3, list, j2, obj, orientation, horizontal, vertical, layoutDirection, z);
    }
}
