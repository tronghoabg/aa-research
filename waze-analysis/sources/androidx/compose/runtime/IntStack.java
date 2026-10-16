package androidx.compose.runtime;

import h.g.b.x;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class IntStack {
    public static final int $stable = 8;
    public int[] slots = new int[10];
    public int tos;

    private final int[] resize() {
        int[] iArr = this.slots;
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length);
        x.e(iArrCopyOf, "copyOf(...)");
        this.slots = iArrCopyOf;
        return iArrCopyOf;
    }

    public final void clear() {
        this.tos = 0;
    }

    public final int getSize() {
        return this.tos;
    }

    public final int indexOf(int i2) {
        int[] iArr = this.slots;
        int iMin = Math.min(iArr.length, this.tos);
        for (int i3 = 0; i3 < iMin; i3++) {
            if (iArr[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        return this.tos == 0;
    }

    public final boolean isNotEmpty() {
        return this.tos != 0;
    }

    public final int peek() {
        return this.slots[this.tos - 1];
    }

    public final int peek2() {
        return this.slots[this.tos - 2];
    }

    public final int peekOr(int i2) {
        int i3 = this.tos - 1;
        return i3 >= 0 ? this.slots[i3] : i2;
    }

    public final int pop() {
        int[] iArr = this.slots;
        int i2 = this.tos - 1;
        this.tos = i2;
        return iArr[i2];
    }

    public final int popOr(int i2) {
        int i3 = this.tos;
        if (i3 <= 0) {
            return i2;
        }
        int[] iArr = this.slots;
        int i4 = i3 - 1;
        this.tos = i4;
        return iArr[i4];
    }

    public final void push(int i2) {
        int[] iArrResize = this.slots;
        if (this.tos >= iArrResize.length) {
            iArrResize = resize();
        }
        int i3 = this.tos;
        this.tos = i3 + 1;
        iArrResize[i3] = i2;
    }

    public final int peek(int i2) {
        return this.slots[i2];
    }
}
