package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import h.g.b.x;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class IntStack {
    private int lastIndex;
    private int[] stack;

    public IntStack(int i2) {
        this.stack = new int[i2];
    }

    private final boolean compareDiagonal(int i2, int i3) {
        int[] iArr = this.stack;
        int i4 = iArr[i2];
        int i5 = iArr[i3];
        if (i4 >= i5) {
            return i4 == i5 && iArr[i2 + 1] <= iArr[i3 + 1];
        }
        return true;
    }

    private final int partition(int i2, int i3, int i4) {
        int i5 = i2 - i4;
        while (i2 < i3) {
            if (compareDiagonal(i2, i3)) {
                i5 += i4;
                swapDiagonal(i5, i2);
            }
            i2 += i4;
        }
        int i6 = i5 + i4;
        swapDiagonal(i6, i3);
        return i6;
    }

    private final void quickSort(int i2, int i3, int i4) {
        if (i2 < i3) {
            int iPartition = partition(i2, i3, i4);
            quickSort(i2, iPartition - i4, i4);
            quickSort(iPartition + i4, i3, i4);
        }
    }

    private final int[] resizeStack(int[] iArr) {
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length);
        x.e(iArrCopyOf, "copyOf(...)");
        this.stack = iArrCopyOf;
        return iArrCopyOf;
    }

    private final void swapDiagonal(int i2, int i3) {
        int[] iArr = this.stack;
        MyersDiffKt.swap(iArr, i2, i3);
        MyersDiffKt.swap(iArr, i2 + 1, i3 + 1);
        MyersDiffKt.swap(iArr, i2 + 2, i3 + 2);
    }

    public final int get(int i2) {
        return this.stack[i2];
    }

    public final int getSize() {
        return this.lastIndex;
    }

    public final boolean isNotEmpty() {
        return this.lastIndex != 0;
    }

    public final int pop() {
        int[] iArr = this.stack;
        int i2 = this.lastIndex - 1;
        this.lastIndex = i2;
        return iArr[i2];
    }

    public final void pushDiagonal(int i2, int i3, int i4) {
        int i5 = this.lastIndex;
        int i6 = i5 + 3;
        int[] iArrResizeStack = this.stack;
        if (i6 >= iArrResizeStack.length) {
            iArrResizeStack = resizeStack(iArrResizeStack);
        }
        iArrResizeStack[i5] = i2 + i4;
        iArrResizeStack[i5 + 1] = i3 + i4;
        iArrResizeStack[i5 + 2] = i4;
        this.lastIndex = i6;
    }

    public final void pushRange(int i2, int i3, int i4, int i5) {
        int i6 = this.lastIndex;
        int i7 = i6 + 4;
        int[] iArrResizeStack = this.stack;
        if (i7 >= iArrResizeStack.length) {
            iArrResizeStack = resizeStack(iArrResizeStack);
        }
        iArrResizeStack[i6] = i2;
        iArrResizeStack[i6 + 1] = i3;
        iArrResizeStack[i6 + 2] = i4;
        iArrResizeStack[i6 + 3] = i5;
        this.lastIndex = i7;
    }

    public final void sortDiagonals() {
        int i2 = this.lastIndex;
        if (i2 % 3 != 0) {
            InlineClassHelperKt.throwIllegalStateException("Array size not a multiple of 3");
        }
        if (i2 > 3) {
            quickSort(0, i2 - 3, 3);
        }
    }
}
