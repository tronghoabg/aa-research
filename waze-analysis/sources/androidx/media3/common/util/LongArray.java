package androidx.media3.common.util;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class LongArray {
    private static final int DEFAULT_INITIAL_CAPACITY = 32;
    private int size;
    private long[] values;

    public LongArray(int i2) {
        this.values = new long[i2];
    }

    public void add(long j2) {
        int i2 = this.size;
        long[] jArrCopyOf = this.values;
        if (i2 == jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2 + i2);
            this.values = jArrCopyOf;
        }
        int i3 = this.size;
        this.size = i3 + 1;
        jArrCopyOf[i3] = j2;
    }

    public void addAll(long[] jArr) {
        int i2 = this.size;
        int length = jArr.length;
        int i3 = i2 + length;
        long[] jArrCopyOf = this.values;
        int length2 = jArrCopyOf.length;
        if (i3 > length2) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(length2 + length2, i3));
            this.values = jArrCopyOf;
        }
        System.arraycopy(jArr, 0, jArrCopyOf, this.size, length);
        this.size = i3;
    }

    public long get(int i2) {
        if (i2 >= 0 && i2 < this.size) {
            return this.values[i2];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i2 + ", size is " + this.size);
    }

    public int size() {
        return this.size;
    }

    public long[] toArray() {
        return Arrays.copyOf(this.values, this.size);
    }

    public LongArray() {
        this(32);
    }
}
