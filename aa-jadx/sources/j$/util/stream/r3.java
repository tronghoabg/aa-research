package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r3 extends j$.util.stream.c implements java.lang.Iterable, j$.lang.a {
    public java.lang.Object d = newArray(16);
    public java.lang.Object[] e;

    public java.lang.Object b() {
        long jCount = count();
        if (jCount >= 2147483639) {
            j$.time.g.a("Stream size exceeds max array size");
            return null;
        }
        java.lang.Object objNewArray = newArray((int) jCount);
        d(0, objNewArray);
        return objNewArray;
    }

    @Override // j$.util.stream.c
    public final void clear() {
        java.lang.Object[] objArr = this.e;
        if (objArr != null) {
            this.d = objArr[0];
            this.e = null;
            this.c = null;
        }
        this.a = 0;
        this.b = 0;
    }

    public void d(int i, java.lang.Object obj) {
        long j = i;
        long jCount = count() + j;
        if (jCount > v(obj) || jCount < j) {
            throw new java.lang.IndexOutOfBoundsException("does not fit");
        }
        if (this.b == 0) {
            java.lang.System.arraycopy(this.d, 0, obj, i, this.a);
            return;
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            java.lang.Object obj2 = this.e[i2];
            java.lang.System.arraycopy(obj2, 0, obj, i, v(obj2));
            i += v(this.e[i2]);
        }
        int i3 = this.a;
        if (i3 > 0) {
            java.lang.System.arraycopy(this.d, 0, obj, i, i3);
        }
    }

    public void e(java.lang.Object obj) {
        for (int i = 0; i < this.b; i++) {
            java.lang.Object obj2 = this.e[i];
            t(obj2, 0, v(obj2), obj);
        }
        t(this.d, 0, this.a, obj);
    }

    public java.lang.Object newArray(int i) {
        return new long[i];
    }

    public abstract void t(java.lang.Object obj, int i, int i2, java.lang.Object obj2);

    public int v(java.lang.Object obj) {
        return ((long[]) obj).length;
    }

    public final int w(long j) {
        if (this.b == 0) {
            if (j < this.a) {
                return 0;
            }
            throw new java.lang.IndexOutOfBoundsException(java.lang.Long.toString(j));
        }
        if (j >= count()) {
            throw new java.lang.IndexOutOfBoundsException(java.lang.Long.toString(j));
        }
        for (int i = 0; i <= this.b; i++) {
            if (j < this.c[i] + ((long) v(this.e[i]))) {
                return i;
            }
        }
        throw new java.lang.IndexOutOfBoundsException(java.lang.Long.toString(j));
    }

    public final void x(long j) {
        long jV;
        int i = this.b;
        if (i == 0) {
            jV = v(this.d);
        } else {
            jV = ((long) v(this.e[i])) + this.c[i];
        }
        if (j > jV) {
            if (this.e == null) {
                java.lang.Object[] objArrY = y();
                this.e = objArrY;
                this.c = new long[8];
                objArrY[0] = this.d;
            }
            int i2 = this.b + 1;
            while (j > jV) {
                java.lang.Object[] objArr = this.e;
                if (i2 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.e = java.util.Arrays.copyOf(objArr, length);
                    this.c = java.util.Arrays.copyOf(this.c, length);
                }
                int iMin = 1 << ((i2 == 0 || i2 == 1) ? 4 : java.lang.Math.min(i2 + 3, 30));
                this.e[i2] = newArray(iMin);
                long[] jArr = this.c;
                int i3 = i2 - 1;
                jArr[i2] = jArr[i3] + ((long) v(this.e[i3]));
                jV += (long) iMin;
                i2++;
            }
        }
    }

    public java.lang.Object[] y() {
        return new long[8][];
    }

    public final void z() {
        long jV;
        if (this.a == v(this.d)) {
            java.lang.Object[] objArrY = this.e;
            if (objArrY == null) {
                objArrY = y();
                this.e = objArrY;
                this.c = new long[8];
                objArrY[0] = this.d;
            }
            int i = this.b;
            int i2 = i + 1;
            if (i2 >= objArrY.length || objArrY[i2] == null) {
                if (i == 0) {
                    jV = v(this.d);
                } else {
                    jV = ((long) v(objArrY[i])) + this.c[i];
                }
                x(jV + 1);
            }
            this.a = 0;
            int i3 = this.b + 1;
            this.b = i3;
            this.d = this.e[i3];
        }
    }
}
