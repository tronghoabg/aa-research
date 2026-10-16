package defpackage;

/* JADX INFO: loaded from: classes3.dex */
abstract class aeid {
    int d;
    final /* synthetic */ defpackage.aeif g;
    int c = -1;
    int e = -1;
    int f = 0;

    protected aeid(defpackage.aeif aeifVar) {
        this.g = aeifVar;
        this.d = aeifVar.e;
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
            defpackage.aeif aeifVar = this.g;
            if (i2 != -1) {
                int i3 = aeifVar.e;
                this.f = 1;
                while (i3 != this.c) {
                    i3 = (int) aeifVar.g[i3];
                    this.f++;
                }
                return;
            }
            i = aeifVar.k;
        }
        this.f = i;
    }

    public static final void i() {
        throw new java.lang.UnsupportedOperationException();
    }

    public static final void j() {
        throw new java.lang.UnsupportedOperationException();
    }

    public final void forEachRemaining(java.lang.Object obj) {
        while (hasNext()) {
            int i = this.d;
            this.e = i;
            this.d = (int) this.g.g[i];
            this.c = i;
            int i2 = this.f;
            if (i2 >= 0) {
                this.f = i2 + 1;
            }
            gD(obj, i);
        }
    }

    public final int g() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
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

    public abstract void gD(java.lang.Object obj, int i);

    public final int h() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
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
            throw new java.lang.IllegalStateException();
        }
        int i3 = this.c;
        if (i2 == i3) {
            this.f--;
            i3 = (int) (this.g.g[i2] >>> 32);
            this.c = i3;
        } else {
            this.d = (int) this.g.g[i2];
        }
        defpackage.aeif aeifVar = this.g;
        aeifVar.k--;
        if (i3 == -1) {
            aeifVar.e = this.d;
        } else {
            long[] jArr = aeifVar.g;
            long j = jArr[i3];
            jArr[i3] = j ^ (((((long) this.d) & 4294967295L) ^ j) & 4294967295L);
        }
        int i4 = this.d;
        if (i4 == -1) {
            aeifVar.f = i3;
        } else {
            long[] jArr2 = aeifVar.g;
            long j2 = jArr2[i4];
            jArr2[i4] = ((((4294967295L & ((long) i3)) << 32) ^ j2) & (-4294967296L)) ^ j2;
        }
        this.e = -1;
        int i5 = aeifVar.h;
        if (i2 == i5) {
            aeifVar.d = false;
            aeifVar.b[i5] = null;
            return;
        }
        int[] iArr = aeifVar.a;
        java.lang.Object[] objArr = aeifVar.b;
        while (true) {
            int i6 = (i2 + 1) & aeifVar.c;
            while (true) {
                i = iArr[i6];
                if (i == 0) {
                    iArr[i2] = 0;
                    objArr[i2] = null;
                    return;
                }
                int i7 = aeifVar.c;
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
            aeifVar.x(i6, i2);
            i2 = i6;
        }
    }
}
