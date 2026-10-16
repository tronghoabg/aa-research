package V;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f12865a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f12866b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f12867c;

    public i(int i5, long[] jArr, Object[] objArr) {
        this.f12865a = i5;
        this.f12866b = jArr;
        this.f12867c = objArr;
    }

    public final int a(long j8) {
        int i5 = this.f12865a - 1;
        if (i5 != -1) {
            long[] jArr = this.f12866b;
            int i10 = 0;
            if (i5 != 0) {
                while (i10 <= i5) {
                    int i11 = (i10 + i5) >>> 1;
                    long j10 = jArr[i11] - j8;
                    if (j10 < 0) {
                        i10 = i11 + 1;
                    } else {
                        if (j10 <= 0) {
                            return i11;
                        }
                        i5 = i11 - 1;
                    }
                }
                return -(i10 + 1);
            }
            long j11 = jArr[0];
            if (j11 == j8) {
                return 0;
            }
            if (j11 > j8) {
                return -2;
            }
        }
        return -1;
    }

    public final i b(long j8, Object obj) {
        long[] jArr;
        int i5;
        Object[] objArr = this.f12867c;
        int i10 = 0;
        int i11 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i11++;
            }
        }
        int i12 = i11 + 1;
        long[] jArr2 = new long[i12];
        Object[] objArr2 = new Object[i12];
        if (i12 > 1) {
            int i13 = 0;
            while (true) {
                jArr = this.f12866b;
                i5 = this.f12865a;
                if (i10 >= i12 || i13 >= i5) {
                    break;
                }
                long j10 = jArr[i13];
                Object obj3 = objArr[i13];
                if (j10 > j8) {
                    jArr2[i10] = j8;
                    objArr2[i10] = obj;
                    i10++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i10] = j10;
                    objArr2[i10] = obj3;
                    i10++;
                }
                i13++;
            }
            if (i13 == i5) {
                jArr2[i11] = j8;
                objArr2[i11] = obj;
            } else {
                while (i10 < i12) {
                    long j11 = jArr[i13];
                    Object obj4 = objArr[i13];
                    if (obj4 != null) {
                        jArr2[i10] = j11;
                        objArr2[i10] = obj4;
                        i10++;
                    }
                    i13++;
                }
            }
        } else {
            jArr2[0] = j8;
            objArr2[0] = obj;
        }
        return new i(i12, jArr2, objArr2);
    }
}
