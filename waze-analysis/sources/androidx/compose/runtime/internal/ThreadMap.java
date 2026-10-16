package androidx.compose.runtime.internal;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ThreadMap {
    public static final int $stable = 8;
    private final long[] keys;
    private final int size;
    private final Object[] values;

    public ThreadMap(int i2, long[] jArr, Object[] objArr) {
        this.size = i2;
        this.keys = jArr;
        this.values = objArr;
    }

    private final int find(long j2) {
        int i2 = this.size - 1;
        if (i2 == -1) {
            return -1;
        }
        int i3 = 0;
        if (i2 == 0) {
            long j3 = this.keys[0];
            if (j3 == j2) {
                return 0;
            }
            return j3 <= j2 ? -1 : -2;
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j4 = this.keys[i4] - j2;
            if (j4 < 0) {
                i3 = i4 + 1;
            } else {
                if (j4 <= 0) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public final Object get(long j2) {
        int iFind = find(j2);
        if (iFind >= 0) {
            return this.values[iFind];
        }
        return null;
    }

    public final ThreadMap newWith(long j2, Object obj) {
        int i2;
        int i3 = 0;
        int i4 = 0;
        for (Object obj2 : this.values) {
            if (obj2 != null) {
                i4++;
            }
        }
        int i5 = i4 + 1;
        long[] jArr = new long[i5];
        Object[] objArr = new Object[i5];
        if (i5 > 1) {
            int i6 = 0;
            while (true) {
                i2 = this.size;
                if (i3 >= i5 || i6 >= i2) {
                    break;
                }
                long[] jArr2 = this.keys;
                Object[] objArr2 = this.values;
                long j3 = jArr2[i6];
                Object obj3 = objArr2[i6];
                if (j3 > j2) {
                    jArr[i3] = j2;
                    objArr[i3] = obj;
                    i3++;
                    break;
                }
                if (obj3 != null) {
                    jArr[i3] = j3;
                    objArr[i3] = obj3;
                    i3++;
                }
                i6++;
            }
            if (i6 == i2) {
                jArr[i4] = j2;
                objArr[i4] = obj;
            } else {
                while (i3 < i5) {
                    long j4 = this.keys[i6];
                    Object obj4 = this.values[i6];
                    if (obj4 != null) {
                        jArr[i3] = j4;
                        objArr[i3] = obj4;
                        i3++;
                    }
                    i6++;
                }
            }
        } else {
            jArr[0] = j2;
            objArr[0] = obj;
        }
        return new ThreadMap(i5, jArr, objArr);
    }

    public final boolean trySet(long j2, Object obj) {
        int iFind = find(j2);
        if (iFind < 0) {
            return false;
        }
        this.values[iFind] = obj;
        return true;
    }
}
