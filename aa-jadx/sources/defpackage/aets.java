package defpackage;

/* JADX INFO: loaded from: classes3.dex */
abstract class aets {
    int d;
    final /* synthetic */ defpackage.aetu g;
    int c = -1;
    int e = -1;
    int f = 0;

    protected aets(defpackage.aetu aetuVar) {
        this.g = aetuVar;
        this.d = aetuVar.e;
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
            defpackage.aetu aetuVar = this.g;
            if (i2 != -1) {
                int i3 = aetuVar.e;
                this.f = 1;
                while (i3 != this.c) {
                    i3 = (int) aetuVar.g[i3];
                    this.f++;
                }
                return;
            }
            i = aetuVar.k;
        }
        this.f = i;
    }

    public static final void f() {
        throw new java.lang.UnsupportedOperationException();
    }

    public static final void g() {
        throw new java.lang.UnsupportedOperationException();
    }

    public abstract void a(java.lang.Object obj, int i);

    public final int c() {
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

    public final int d() {
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

    public final void e(java.lang.Object obj) {
        while (hasNext()) {
            int i = this.d;
            this.e = i;
            this.d = (int) this.g.g[i];
            this.c = i;
            int i2 = this.f;
            if (i2 >= 0) {
                this.f = i2 + 1;
            }
            a(obj, i);
        }
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
        java.lang.Object obj;
        b();
        int i = this.e;
        if (i == -1) {
            throw new java.lang.IllegalStateException();
        }
        int i2 = this.c;
        if (i == i2) {
            this.f--;
            i2 = (int) (this.g.g[i] >>> 32);
            this.c = i2;
        } else {
            this.d = (int) this.g.g[i];
        }
        defpackage.aetu aetuVar = this.g;
        aetuVar.k--;
        if (i2 == -1) {
            aetuVar.e = this.d;
        } else {
            long[] jArr = aetuVar.g;
            long j = jArr[i2];
            jArr[i2] = j ^ (((((long) this.d) & 4294967295L) ^ j) & 4294967295L);
        }
        int i3 = this.d;
        if (i3 == -1) {
            aetuVar.f = i2;
        } else {
            long[] jArr2 = aetuVar.g;
            long j2 = jArr2[i3];
            jArr2[i3] = ((((4294967295L & ((long) i2)) << 32) ^ j2) & (-4294967296L)) ^ j2;
        }
        this.e = -1;
        int i4 = aetuVar.h;
        if (i == i4) {
            aetuVar.d = false;
            aetuVar.a[i4] = null;
            aetuVar.b[i4] = null;
            return;
        }
        java.lang.Object[] objArr = aetuVar.a;
        java.lang.Object[] objArr2 = aetuVar.b;
        while (true) {
            int i5 = (i + 1) & aetuVar.c;
            while (true) {
                obj = objArr[i5];
                if (obj != null) {
                    int iHashCode = obj.hashCode() * (-1640531527);
                    int i6 = aetuVar.c;
                    int i7 = (iHashCode ^ (iHashCode >>> 16)) & i6;
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
                } else {
                    objArr[i] = null;
                    objArr2[i] = null;
                    return;
                }
            }
            objArr[i] = obj;
            objArr2[i] = objArr2[i5];
            if (this.d == i5) {
                this.d = i;
            }
            if (this.c == i5) {
                this.c = i;
            }
            aetuVar.m(i5, i);
            i = i5;
        }
    }
}
