package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
abstract class aeno {
    int d;
    final /* synthetic */ aenq g;
    int c = -1;
    int e = -1;
    int f = 0;

    protected aeno(aenq aenqVar) {
        this.g = aenqVar;
        this.d = aenqVar.e;
    }

    private final void b() {
        int i;
        if (this.f >= 0) {
            return;
        }
        if (this.c == -1) {
            i = 0;
        } else {
            int i2 = this.d;
            aenq aenqVar = this.g;
            if (i2 != -1) {
                int i3 = aenqVar.e;
                this.f = 1;
                while (i3 != this.c) {
                    i3 = (int) aenqVar.g[i3];
                    this.f++;
                }
                return;
            }
            i = aenqVar.k;
        }
        this.f = i;
    }

    public static final void i() {
        throw new UnsupportedOperationException();
    }

    public static final void j() {
        throw new UnsupportedOperationException();
    }

    public final void forEachRemaining(Object obj) {
        while (hasNext()) {
            int i = this.d;
            this.e = i;
            this.d = (int) this.g.g[i];
            this.c = i;
            int i2 = this.f;
            if (i2 >= 0) {
                this.f = i2 + 1;
            }
            ht(obj, i);
        }
    }

    public final int g() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.d;
        this.e = i;
        this.d = (int) this.g.g[i];
        this.c = i;
        int i2 = this.f;
        if (i2 >= 0) {
            this.f = i2 + 1;
        }
        return i;
    }

    public final int h() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.c;
        this.e = i;
        this.c = (int) (this.g.g[i] >>> 32);
        this.d = i;
        int i2 = this.f;
        if (i2 >= 0) {
            this.f = i2 - 1;
        }
        return i;
    }

    public final boolean hasNext() {
        return this.d != -1;
    }

    public final boolean hasPrevious() {
        return this.c != -1;
    }

    public abstract void ht(Object obj, int i);

    public final int nextIndex() {
        b();
        return this.f;
    }

    public final int previousIndex() {
        b();
        return this.f - 1;
    }

    public void remove() {
        long j;
        b();
        int i = this.e;
        if (i == -1) {
            throw new IllegalStateException();
        }
        int i2 = this.c;
        if (i == i2) {
            this.f--;
            i2 = (int) (this.g.g[i] >>> 32);
            this.c = i2;
        } else {
            this.d = (int) this.g.g[i];
        }
        aenq aenqVar = this.g;
        aenqVar.k--;
        if (i2 == -1) {
            aenqVar.e = this.d;
        } else {
            long[] jArr = aenqVar.g;
            long j2 = jArr[i2];
            jArr[i2] = j2 ^ (((this.d & 4294967295L) ^ j2) & 4294967295L);
        }
        int i3 = this.d;
        if (i3 == -1) {
            aenqVar.f = i2;
        } else {
            long[] jArr2 = aenqVar.g;
            long j3 = jArr2[i3];
            jArr2[i3] = ((((4294967295L & i2) << 32) ^ j3) & (-4294967296L)) ^ j3;
        }
        this.e = -1;
        int i4 = aenqVar.h;
        if (i == i4) {
            aenqVar.d = false;
            aenqVar.b[i4] = null;
            return;
        }
        long[] jArr3 = aenqVar.a;
        Object[] objArr = aenqVar.b;
        while (true) {
            int i5 = (i + 1) & aenqVar.c;
            while (true) {
                j = jArr3[i5];
                if (j == 0) {
                    jArr3[i] = 0;
                    objArr[i] = null;
                    return;
                }
                int i6 = aenqVar.c;
                long j4 = (-7046029254386353131L) * j;
                long j5 = j4 ^ (j4 >>> 32);
                int i7 = ((int) (j5 ^ (j5 >>> 16))) & i6;
                if (i > i5) {
                    if (i >= i7 && i7 > i5) {
                        break;
                    } else {
                        i5 = (i5 + 1) & i6;
                    }
                } else if (i >= i7 || i7 > i5) {
                    break;
                } else {
                    i5 = (i5 + 1) & i6;
                }
            }
            jArr3[i] = j;
            objArr[i] = objArr[i5];
            if (this.d == i5) {
                this.d = i;
            }
            if (this.c == i5) {
                this.c = i;
            }
            aenqVar.y(i5, i);
            i = i5;
        }
    }
}
