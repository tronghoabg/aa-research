package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
abstract class aehd {
    int d;
    final /* synthetic */ aehf g;
    int c = -1;
    int e = -1;
    int f = 0;

    protected aehd(aehf aehfVar) {
        this.g = aehfVar;
        this.d = aehfVar.e;
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
            aehf aehfVar = this.g;
            if (i2 != -1) {
                int i3 = aehfVar.e;
                this.f = 1;
                while (i3 != this.c) {
                    i3 = (int) aehfVar.g[i3];
                    this.f++;
                }
                return;
            }
            i = aehfVar.k;
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
            hr(obj, i);
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

    public abstract void hr(Object obj, int i);

    public final int nextIndex() {
        b();
        return this.f;
    }

    public final int previousIndex() {
        b();
        return this.f - 1;
    }

    public void remove() {
        int i;
        b();
        int i2 = this.e;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        int i3 = this.c;
        if (i2 == i3) {
            this.f--;
            i3 = (int) (this.g.g[i2] >>> 32);
            this.c = i3;
        } else {
            this.d = (int) this.g.g[i2];
        }
        aehf aehfVar = this.g;
        aehfVar.k--;
        if (i3 == -1) {
            aehfVar.e = this.d;
        } else {
            long[] jArr = aehfVar.g;
            long j = jArr[i3];
            jArr[i3] = j ^ (((this.d & 4294967295L) ^ j) & 4294967295L);
        }
        int i4 = this.d;
        if (i4 == -1) {
            aehfVar.f = i3;
        } else {
            long[] jArr2 = aehfVar.g;
            long j2 = jArr2[i4];
            jArr2[i4] = ((((4294967295L & i3) << 32) ^ j2) & (-4294967296L)) ^ j2;
        }
        this.e = -1;
        int i5 = aehfVar.h;
        if (i2 == i5) {
            aehfVar.d = false;
            aehfVar.b[i5] = null;
            return;
        }
        int[] iArr = aehfVar.a;
        Object[] objArr = aehfVar.b;
        while (true) {
            int i6 = (i2 + 1) & aehfVar.c;
            while (true) {
                i = iArr[i6];
                if (i == 0) {
                    iArr[i2] = 0;
                    objArr[i2] = null;
                    return;
                }
                int i7 = aehfVar.c;
                int i8 = (-1640531527) * i;
                int i9 = (i8 ^ (i8 >>> 16)) & i7;
                if (i2 > i6) {
                    if (i2 >= i9 && i9 > i6) {
                        break;
                    } else {
                        i6 = (i6 + 1) & i7;
                    }
                } else if (i2 >= i9 || i9 > i6) {
                    break;
                } else {
                    i6 = (i6 + 1) & i7;
                }
            }
            iArr[i2] = i;
            objArr[i2] = objArr[i6];
            if (this.d == i6) {
                this.d = i2;
            }
            if (this.c == i6) {
                this.c = i2;
            }
            aehfVar.x(i6, i2);
            i2 = i6;
        }
    }
}
