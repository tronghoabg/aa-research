package androidx.compose.runtime.composer.gapbuffer;

import h.g.a.l;
import h.g.b.x;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BitVector {
    public static final int $stable = 8;
    private long first;
    private long[] others = SlotTableKt.EmptyLongArray;
    private long second;

    private final int nextBit(int i2, l<? super Long, Long> lVar) {
        int iNumberOfTrailingZeros;
        if (i2 < 64 && (iNumberOfTrailingZeros = Long.numberOfTrailingZeros((lVar.invoke(Long.valueOf(this.first)).longValue() >>> i2) << i2)) < 64) {
            return iNumberOfTrailingZeros;
        }
        if (i2 < 128) {
            int i3 = i2 - 64;
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros((lVar.invoke(Long.valueOf(this.second)).longValue() >>> i3) << i3);
            if (iNumberOfTrailingZeros2 < 64) {
                return iNumberOfTrailingZeros2 + 64;
            }
        }
        int iMax = Math.max(i2, 128);
        long[] jArr = this.others;
        int length = jArr.length;
        int i4 = (iMax / 64) - 2;
        for (int i5 = i4; i5 < length; i5++) {
            long jLongValue = lVar.invoke(Long.valueOf(jArr[i5])).longValue();
            if (i5 == i4) {
                int i6 = iMax % 64;
                jLongValue = (jLongValue >>> i6) << i6;
            }
            int iNumberOfTrailingZeros3 = Long.numberOfTrailingZeros(jLongValue);
            if (iNumberOfTrailingZeros3 < 64) {
                return (i5 * 64) + 128 + iNumberOfTrailingZeros3;
            }
        }
        return Integer.MAX_VALUE;
    }

    public final boolean get(int i2) {
        int i3;
        if (i2 < 64) {
            return ((1 << i2) & this.first) != 0;
        }
        if (i2 < 128) {
            return ((1 << (i2 + (-64))) & this.second) != 0;
        }
        long[] jArr = this.others;
        int length = jArr.length;
        if (length != 0 && (i2 >> 6) - 2 < length) {
            return ((1 << (i2 & 63)) & jArr[i3]) != 0;
        }
        return false;
    }

    public final int getSize() {
        return (this.others.length + 2) * 64;
    }

    public final int nextClear(int i2) {
        int iNumberOfTrailingZeros;
        if (i2 < 64 && (iNumberOfTrailingZeros = Long.numberOfTrailingZeros(((~this.first) >>> i2) << i2)) < 64) {
            return iNumberOfTrailingZeros;
        }
        if (i2 < 128) {
            int i3 = i2 - 64;
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(((~this.second) >>> i3) << i3);
            if (iNumberOfTrailingZeros2 < 64) {
                return iNumberOfTrailingZeros2 + 64;
            }
        }
        int iMax = Math.max(i2, 128);
        long[] jArr = this.others;
        int length = jArr.length;
        int i4 = (iMax / 64) - 2;
        for (int i5 = i4; i5 < length; i5++) {
            long j2 = ~jArr[i5];
            if (i5 == i4) {
                int i6 = iMax % 64;
                j2 = (j2 >>> i6) << i6;
            }
            int iNumberOfTrailingZeros3 = Long.numberOfTrailingZeros(j2);
            if (iNumberOfTrailingZeros3 < 64) {
                return (i5 * 64) + 128 + iNumberOfTrailingZeros3;
            }
        }
        return Integer.MAX_VALUE;
    }

    public final int nextSet(int i2) {
        int iNumberOfTrailingZeros;
        if (i2 < 64 && (iNumberOfTrailingZeros = Long.numberOfTrailingZeros((this.first >>> i2) << i2)) < 64) {
            return iNumberOfTrailingZeros;
        }
        if (i2 < 128) {
            int i3 = i2 - 64;
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros((this.second >>> i3) << i3);
            if (iNumberOfTrailingZeros2 < 64) {
                return iNumberOfTrailingZeros2 + 64;
            }
        }
        int iMax = Math.max(i2, 128);
        long[] jArr = this.others;
        int length = jArr.length;
        int i4 = (iMax / 64) - 2;
        for (int i5 = i4; i5 < length; i5++) {
            long j2 = jArr[i5];
            if (i5 == i4) {
                int i6 = iMax % 64;
                j2 = (j2 >>> i6) << i6;
            }
            int iNumberOfTrailingZeros3 = Long.numberOfTrailingZeros(j2);
            if (iNumberOfTrailingZeros3 < 64) {
                return (i5 * 64) + 128 + iNumberOfTrailingZeros3;
            }
        }
        return Integer.MAX_VALUE;
    }

    public final void set(int i2, boolean z) {
        long j2 = z ? 1L : 0L;
        if (i2 < 64) {
            this.first = (j2 << i2) | ((~(1 << i2)) & this.first);
            return;
        }
        if (i2 < 128) {
            this.second = (j2 << i2) | ((~(1 << (i2 - 64))) & this.second);
            return;
        }
        int i3 = i2 >> 6;
        int i4 = i2 & 63;
        long j3 = 1 << i4;
        long[] jArrCopyOf = this.others;
        int i5 = i3 - 2;
        if (i5 >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3 - 1);
            x.e(jArrCopyOf, "copyOf(...)");
            this.others = jArrCopyOf;
        }
        jArrCopyOf[i5] = (j2 << i4) | ((~j3) & jArrCopyOf[i5]);
    }

    public final void setRange(int i2, int i3) {
        int iMin = Math.min(64, i3) - i2;
        long j2 = i2 < i3 ? -1L : 0L;
        this.first = ((((i2 < 64 ? 1 : 0) * j2) >>> (64 - iMin)) << i2) | this.first;
        if (i3 > 64) {
            int iMax = Math.max(i2, 64);
            this.second = (((j2 * (iMax < 128 ? 1 : 0)) >>> (128 - (Math.min(128, i3) - iMax))) << iMax) | this.second;
            if (i3 > 128) {
                for (int iMax2 = Math.max(iMax, 128); iMax2 < i3; iMax2++) {
                    set(iMax2, true);
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BitVector [");
        int size = getSize();
        boolean z = true;
        for (int i2 = 0; i2 < size; i2++) {
            if (get(i2)) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(i2);
                z = false;
            }
        }
        sb.append(']');
        return sb.toString();
    }
}
