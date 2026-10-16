package androidx.compose.runtime.snapshots;

import h.a.c;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SnapshotDoubleIndexHeap {
    public static final int $stable = 8;
    private int firstFreeHandle;
    private int[] handles;
    private int size;
    private long[] values = SnapshotId_jvmKt.snapshotIdArrayWithCapacity(16);
    private int[] index = new int[16];

    public SnapshotDoubleIndexHeap() {
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        this.handles = iArr;
    }

    private final int allocateHandle() {
        int[] iArr = this.handles;
        int length = iArr.length;
        if (this.firstFreeHandle >= length) {
            int i2 = length + length;
            iArr = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i3 + 1;
                iArr[i3] = i4;
                i3 = i4;
            }
            c.aM(this.handles, iArr, 0, 0, 14);
            this.handles = iArr;
        }
        int i5 = this.firstFreeHandle;
        this.firstFreeHandle = iArr[i5];
        return i5;
    }

    private final void ensure(int i2) {
        int length = this.values.length;
        if (i2 <= length) {
            return;
        }
        int i3 = length + length;
        long[] jArrSnapshotIdArrayWithCapacity = SnapshotId_jvmKt.snapshotIdArrayWithCapacity(i3);
        int[] iArr = new int[i3];
        c.av(this.values, jArrSnapshotIdArrayWithCapacity, 0);
        c.aM(this.index, iArr, 0, 0, 14);
        this.values = jArrSnapshotIdArrayWithCapacity;
        this.index = iArr;
    }

    private final void freeHandle(int i2) {
        this.handles[i2] = this.firstFreeHandle;
        this.firstFreeHandle = i2;
    }

    public static /* synthetic */ long lowestOrDefault$default(SnapshotDoubleIndexHeap snapshotDoubleIndexHeap, long j2, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            j2 = 0;
        }
        return snapshotDoubleIndexHeap.lowestOrDefault(j2);
    }

    private final void shiftDown(int i2) {
        long[] jArr = this.values;
        int i3 = this.size >> 1;
        while (i2 < i3) {
            int i4 = i2 + 1;
            int i5 = i4 + i4;
            int i6 = i5 - 1;
            if (i5 < this.size) {
                long j2 = jArr[i5];
                if (x.b(j2, jArr[i6]) < 0) {
                    if (x.b(j2, jArr[i2]) >= 0) {
                        return;
                    }
                    swap(i5, i2);
                    i2 = i5;
                }
            }
            if (x.b(jArr[i6], jArr[i2]) >= 0) {
                return;
            }
            swap(i6, i2);
            i2 = i6;
        }
    }

    private final void shiftUp(int i2) {
        long[] jArr = this.values;
        long j2 = jArr[i2];
        while (i2 > 0) {
            int i3 = ((i2 + 1) >> 1) - 1;
            if (x.b(jArr[i3], j2) <= 0) {
                return;
            }
            swap(i3, i2);
            i2 = i3;
        }
    }

    private final void swap(int i2, int i3) {
        long[] jArr = this.values;
        int[] iArr = this.index;
        int[] iArr2 = this.handles;
        long j2 = jArr[i2];
        jArr[i2] = jArr[i3];
        jArr[i3] = j2;
        int i4 = iArr[i2];
        int i5 = iArr[i3];
        iArr[i2] = i5;
        iArr[i3] = i4;
        iArr2[i5] = i2;
        iArr2[i4] = i3;
    }

    public final int add(long j2) {
        ensure(this.size + 1);
        int i2 = this.size;
        this.size = i2 + 1;
        int iAllocateHandle = allocateHandle();
        this.values[i2] = j2;
        this.index[i2] = iAllocateHandle;
        this.handles[iAllocateHandle] = i2;
        shiftUp(i2);
        return iAllocateHandle;
    }

    public final int getSize() {
        return this.size;
    }

    public final long lowestOrDefault(long j2) {
        return this.size > 0 ? this.values[0] : j2;
    }

    public final void remove(int i2) {
        int i3 = this.handles[i2];
        swap(i3, this.size - 1);
        this.size--;
        shiftUp(i3);
        shiftDown(i3);
        freeHandle(i2);
    }

    public final void validate() {
        int i2 = this.size;
        int i3 = 1;
        while (i3 < i2) {
            int i4 = i3 + 1;
            long[] jArr = this.values;
            if (x.b(jArr[(i4 >> 1) - 1], jArr[i3]) > 0) {
                throw new IllegalStateException("Index " + i3 + " is out of place");
            }
            i3 = i4;
        }
    }

    public final void validateHandle(int i2, long j2) {
        int i3 = this.handles[i2];
        if (this.index[i3] != i2) {
            throw new IllegalStateException("Index for handle " + i2 + " is corrupted");
        }
        if (this.values[i3] == j2) {
            return;
        }
        throw new IllegalStateException("Value for handle " + i2 + " was " + this.values[i3] + " but was supposed to be " + j2);
    }
}
