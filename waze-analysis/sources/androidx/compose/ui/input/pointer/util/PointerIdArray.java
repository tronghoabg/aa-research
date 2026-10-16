package androidx.compose.ui.input.pointer.util;

import h.g.b.x;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PointerIdArray {
    public static final int $stable = 8;
    private long[] internalArray = new long[2];
    private int size;

    private final long[] resizeStorage(int i2) {
        long[] jArr = this.internalArray;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i2, length + length));
        x.e(jArrCopyOf, "copyOf(...)");
        this.internalArray = jArrCopyOf;
        return jArrCopyOf;
    }

    public final boolean add(long j2) {
        if (contains(j2)) {
            return false;
        }
        set(this.size, j2);
        return true;
    }

    /* renamed from: add-0FcD4WY, reason: not valid java name */
    public final boolean m9708add0FcD4WY(long j2) {
        return add(j2);
    }

    public final void clear() {
        this.size = 0;
    }

    public final boolean contains(long j2) {
        int i2 = this.size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.internalArray[i3] == j2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: contains-0FcD4WY, reason: not valid java name */
    public final boolean m9709contains0FcD4WY(long j2) {
        return contains(j2);
    }

    /* renamed from: get-_I2yYro, reason: not valid java name */
    public final long m9710get_I2yYro(int i2) {
        return this.internalArray[i2];
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    public final int getSize() {
        return this.size;
    }

    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final boolean remove(long j2) {
        int i2 = this.size;
        int i3 = 0;
        while (i3 < i2) {
            if (j2 == this.internalArray[i3]) {
                int i4 = this.size - 1;
                while (i3 < i4) {
                    long[] jArr = this.internalArray;
                    int i5 = i3 + 1;
                    jArr[i3] = jArr[i5];
                    i3 = i5;
                }
                this.size--;
                return true;
            }
            i3++;
        }
        return false;
    }

    /* renamed from: remove-0FcD4WY, reason: not valid java name */
    public final boolean m9711remove0FcD4WY(long j2) {
        return remove(j2);
    }

    public final boolean removeAt(int i2) {
        int i3 = this.size;
        if (i2 >= i3) {
            return false;
        }
        int i4 = i3 - 1;
        while (i2 < i4) {
            long[] jArr = this.internalArray;
            int i5 = i2 + 1;
            jArr[i2] = jArr[i5];
            i2 = i5;
        }
        this.size--;
        return true;
    }

    public final void set(int i2, long j2) {
        long[] jArrResizeStorage = this.internalArray;
        if (i2 >= jArrResizeStorage.length) {
            jArrResizeStorage = resizeStorage(i2 + 1);
        }
        jArrResizeStorage[i2] = j2;
        if (i2 >= this.size) {
            this.size = i2 + 1;
        }
    }

    /* renamed from: set-DmW0f2w, reason: not valid java name */
    public final void m9712setDmW0f2w(int i2, long j2) {
        set(i2, j2);
    }
}
