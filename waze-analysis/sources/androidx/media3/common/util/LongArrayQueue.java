package androidx.media3.common.util;

import com.google.d.b.an;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class LongArrayQueue {
    public static final int DEFAULT_INITIAL_CAPACITY = 16;
    private long[] data;
    private int headIndex;
    private int size;
    private int tailIndex;
    private int wrapAroundMask;

    public LongArrayQueue(int i2) {
        an.l(i2 >= 0 && i2 <= 1073741824);
        i2 = i2 == 0 ? 1 : i2;
        if (Integer.bitCount(i2) != 1) {
            int iHighestOneBit = Integer.highestOneBit(i2 - 1);
            i2 = iHighestOneBit + iHighestOneBit;
        }
        this.headIndex = 0;
        this.tailIndex = -1;
        this.size = 0;
        this.data = new long[i2];
        this.wrapAroundMask = r4.length - 1;
    }

    private void doubleArraySize() {
        long[] jArr = this.data;
        int length = jArr.length;
        int i2 = length + length;
        if (i2 < 0) {
            throw new IllegalStateException();
        }
        long[] jArr2 = new long[i2];
        int i3 = this.headIndex;
        int i4 = length - i3;
        System.arraycopy(jArr, i3, jArr2, 0, i4);
        System.arraycopy(this.data, 0, jArr2, i4, i3);
        this.headIndex = 0;
        this.tailIndex = this.size - 1;
        this.data = jArr2;
        this.wrapAroundMask = jArr2.length - 1;
    }

    public void add(long j2) {
        if (this.size == this.data.length) {
            doubleArraySize();
        }
        int i2 = (this.tailIndex + 1) & this.wrapAroundMask;
        this.tailIndex = i2;
        this.data[i2] = j2;
        this.size++;
    }

    int capacity() {
        return this.data.length;
    }

    public void clear() {
        this.headIndex = 0;
        this.tailIndex = -1;
        this.size = 0;
    }

    public long element() {
        if (this.size != 0) {
            return this.data[this.headIndex];
        }
        throw new NoSuchElementException();
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public long remove() {
        int i2 = this.size;
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.data;
        int i3 = this.headIndex;
        long j2 = jArr[i3];
        this.headIndex = this.wrapAroundMask & (i3 + 1);
        this.size = i2 - 1;
        return j2;
    }

    public int size() {
        return this.size;
    }

    public LongArrayQueue() {
        this(16);
    }
}
