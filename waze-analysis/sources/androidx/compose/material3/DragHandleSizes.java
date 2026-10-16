package androidx.compose.material3;

import androidx.compose.ui.unit.DpSize;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DragHandleSizes {
    public static final int $stable = 0;
    private final long draggedSize;
    private final long pressedSize;
    private final long size;

    private DragHandleSizes(long j2, long j3, long j4) {
        this.size = j2;
        this.pressedSize = j3;
        this.draggedSize = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DragHandleSizes)) {
            return false;
        }
        DragHandleSizes dragHandleSizes = (DragHandleSizes) obj;
        return DpSize.m11259equalsimpl0(this.size, dragHandleSizes.size) && DpSize.m11259equalsimpl0(this.pressedSize, dragHandleSizes.pressedSize) && DpSize.m11259equalsimpl0(this.draggedSize, dragHandleSizes.draggedSize);
    }

    /* renamed from: getDraggedSize-MYxV2XQ, reason: not valid java name */
    public final long m4785getDraggedSizeMYxV2XQ() {
        return this.draggedSize;
    }

    /* renamed from: getPressedSize-MYxV2XQ, reason: not valid java name */
    public final long m4786getPressedSizeMYxV2XQ() {
        return this.pressedSize;
    }

    /* renamed from: getSize-MYxV2XQ, reason: not valid java name */
    public final long m4787getSizeMYxV2XQ() {
        return this.size;
    }

    public int hashCode() {
        return (((DpSize.m11264hashCodeimpl(this.size) * 31) + DpSize.m11264hashCodeimpl(this.pressedSize)) * 31) + DpSize.m11264hashCodeimpl(this.draggedSize);
    }

    public /* synthetic */ DragHandleSizes(long j2, long j3, long j4, o oVar) {
        this(j2, j3, j4);
    }
}
