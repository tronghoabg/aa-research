package androidx.compose.runtime.snapshots;

import h.a.c;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SnapshotId_jvmKt {
    public static final long SnapshotIdInvalidValue = -1;
    public static final long SnapshotIdMax = Long.MAX_VALUE;
    public static final int SnapshotIdSize = 64;
    public static final long SnapshotIdZero = 0;

    public static final int binarySearch(long[] jArr, long j2) {
        int length = jArr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            long j3 = jArr[i3];
            if (j2 > j3) {
                i2 = i3 + 1;
            } else {
                if (j2 >= j3) {
                    return i3;
                }
                length = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int compareTo(long j2, int i2) {
        return x.b(j2, i2);
    }

    public static final void copyInto(long[] jArr, long[] jArr2) {
        c.av(jArr, jArr2, 0);
    }

    public static final long div(long j2, int i2) {
        return j2 / i2;
    }

    public static final long first(long[] jArr) {
        return jArr[0];
    }

    public static final void forEach(long[] jArr, l<? super Long, ab> lVar) {
        for (long j2 : jArr) {
            lVar.invoke(Long.valueOf(j2));
        }
    }

    public static final long get(long[] jArr, int i2) {
        return jArr[i2];
    }

    public static final int getSize(long[] jArr) {
        return jArr.length;
    }

    public static final long minus(long j2, int i2) {
        return j2 - i2;
    }

    public static final long plus(long j2, int i2) {
        return j2 + i2;
    }

    public static final void set(long[] jArr, int i2, long j2) {
        jArr[i2] = j2;
    }

    public static final long[] snapshotIdArrayOf(long j2) {
        return new long[]{j2};
    }

    public static final long[] snapshotIdArrayWithCapacity(int i2) {
        return new long[i2];
    }

    public static final long times(long j2, int i2) {
        return j2 * i2;
    }

    public static final int toInt(long j2) {
        return (int) j2;
    }

    public static final long toSnapshotId(int i2) {
        return i2;
    }

    public static final long[] withIdInsertedAt(long[] jArr, int i2, long j2) {
        int length = jArr.length;
        long[] jArr2 = new long[length + 1];
        c.as(jArr, jArr2, 0, 0, i2);
        c.as(jArr, jArr2, i2 + 1, i2, length);
        jArr2[i2] = j2;
        return jArr2;
    }

    public static final long[] withIdRemovedAt(long[] jArr, int i2) {
        int length = jArr.length;
        int i3 = length - 1;
        if (i3 == 0) {
            return null;
        }
        long[] jArr2 = new long[i3];
        if (i2 > 0) {
            c.as(jArr, jArr2, 0, 0, i2);
        }
        if (i2 < i3) {
            c.as(jArr, jArr2, i2, i2 + 1, length);
        }
        return jArr2;
    }

    public static final long toSnapshotId(long j2) {
        return j2;
    }

    public static final long minus(long j2, long j3) {
        return j2 - j3;
    }

    public static final int compareTo(long j2, long j3) {
        return x.b(j2, j3);
    }

    public static /* synthetic */ void SnapshotId$annotations() {
    }

    public static /* synthetic */ void SnapshotIdArray$annotations() {
    }

    public static final long toLong(long j2) {
        return j2;
    }
}
