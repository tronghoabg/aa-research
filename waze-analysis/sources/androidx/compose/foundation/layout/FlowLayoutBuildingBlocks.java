package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FlowLayoutBuildingBlocks {
    public static final int $stable = 8;
    private final long constraints;
    private final int crossAxisSpacing;
    private final int mainAxisSpacing;
    private final int maxItemsInMainAxis;
    private final int maxLines;
    private final FlowLayoutOverflowState overflow;

    private FlowLayoutBuildingBlocks(int i2, FlowLayoutOverflowState flowLayoutOverflowState, long j2, int i3, int i4, int i5) {
        this.maxItemsInMainAxis = i2;
        this.overflow = flowLayoutOverflowState;
        this.constraints = j2;
        this.maxLines = i3;
        this.mainAxisSpacing = i4;
        this.crossAxisSpacing = i5;
    }

    public final WrapEllipsisInfo getWrapEllipsisInfo(WrapInfo wrapInfo, boolean z, int i2, int i3, int i4, int i5) {
        WrapEllipsisInfo wrapEllipsisInfoEllipsisInfo$foundation_layout;
        if (!wrapInfo.isLastItemInContainer() || (wrapEllipsisInfoEllipsisInfo$foundation_layout = this.overflow.ellipsisInfo$foundation_layout(z, i2, i3)) == null) {
            return null;
        }
        boolean z2 = false;
        if (i2 >= 0 && (i5 == 0 || (i4 - IntIntPair.m1691getFirstimpl(wrapEllipsisInfoEllipsisInfo$foundation_layout.m2599getEllipsisSizeOO21N7I()) >= 0 && i5 < this.maxItemsInMainAxis))) {
            z2 = true;
        }
        wrapEllipsisInfoEllipsisInfo$foundation_layout.setPlaceEllipsisOnLastContentLine(z2);
        return wrapEllipsisInfoEllipsisInfo$foundation_layout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c7, code lost:
    
        if ((((androidx.collection.IntIntPair.m1691getFirstimpl(r15) - androidx.collection.IntIntPair.m1691getFirstimpl(r17.m1695unboximpl())) - r12.mainAxisSpacing) - androidx.collection.IntIntPair.m1691getFirstimpl(r5.m1695unboximpl())) >= 0) goto L39;
     */
    /* renamed from: getWrapInfo-OpUlnko, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.foundation.layout.FlowLayoutBuildingBlocks.WrapInfo m2598getWrapInfoOpUlnko(boolean r13, int r14, long r15, androidx.collection.IntIntPair r17, int r18, int r19, int r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutBuildingBlocks.m2598getWrapInfoOpUlnko(boolean, int, long, androidx.collection.IntIntPair, int, int, int, boolean, boolean):androidx.compose.foundation.layout.FlowLayoutBuildingBlocks$WrapInfo");
    }

    public /* synthetic */ FlowLayoutBuildingBlocks(int i2, FlowLayoutOverflowState flowLayoutOverflowState, long j2, int i3, int i4, int i5, o oVar) {
        this(i2, flowLayoutOverflowState, j2, i3, i4, i5);
    }

    /* compiled from: WazeSource */
    public final class WrapEllipsisInfo {
        public static final int $stable = 8;
        private final Measurable ellipsis;
        private final long ellipsisSize;
        private boolean placeEllipsisOnLastContentLine;
        private final Placeable placeable;

        public /* synthetic */ WrapEllipsisInfo(Measurable measurable, Placeable placeable, long j2, boolean z, int i2, o oVar) {
            this(measurable, placeable, j2, (!((i2 & 8) == 0)) | z, null);
        }

        public final Measurable getEllipsis() {
            return this.ellipsis;
        }

        /* renamed from: getEllipsisSize-OO21N7I, reason: not valid java name */
        public final long m2599getEllipsisSizeOO21N7I() {
            return this.ellipsisSize;
        }

        public final boolean getPlaceEllipsisOnLastContentLine() {
            return this.placeEllipsisOnLastContentLine;
        }

        public final Placeable getPlaceable() {
            return this.placeable;
        }

        public final void setPlaceEllipsisOnLastContentLine(boolean z) {
            this.placeEllipsisOnLastContentLine = z;
        }

        public /* synthetic */ WrapEllipsisInfo(Measurable measurable, Placeable placeable, long j2, boolean z, o oVar) {
            this(measurable, placeable, j2, z);
        }

        private WrapEllipsisInfo(Measurable measurable, Placeable placeable, long j2, boolean z) {
            this.ellipsis = measurable;
            this.placeable = placeable;
            this.ellipsisSize = j2;
            this.placeEllipsisOnLastContentLine = z;
        }
    }

    /* compiled from: WazeSource */
    public final class WrapInfo {
        public static final int $stable = 0;
        private final boolean isLastItemInContainer;
        private final boolean isLastItemInLine;

        public /* synthetic */ WrapInfo(boolean z, boolean z2, int i2, o oVar) {
            this(1 == ((z ? 1 : 0) & ((i2 & 1) ^ 1)), z2 & ((i2 & 2) == 0));
        }

        public final boolean isLastItemInContainer() {
            return this.isLastItemInContainer;
        }

        public final boolean isLastItemInLine() {
            return this.isLastItemInLine;
        }

        public WrapInfo(boolean z, boolean z2) {
            this.isLastItemInLine = z;
            this.isLastItemInContainer = z2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public WrapInfo() {
            boolean z = false;
            this(z, z, 3, null);
        }
    }
}
