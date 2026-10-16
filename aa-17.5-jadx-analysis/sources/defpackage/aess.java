package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
abstract class aess {
    int d;
    final /* synthetic */ aesu g;
    int c = -1;
    int e = -1;
    int f = 0;

    protected aess(aesu aesuVar) {
        this.g = aesuVar;
        this.d = aesuVar.e;
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
            aesu aesuVar = this.g;
            if (i2 != -1) {
                int i3 = aesuVar.e;
                this.f = 1;
                while (i3 != this.c) {
                    i3 = (int) aesuVar.g[i3];
                    this.f++;
                }
                return;
            }
            i = aesuVar.k;
        }
        this.f = i;
    }

    public static final void f() {
        throw new UnsupportedOperationException();
    }

    public static final void g() {
        throw new UnsupportedOperationException();
    }

    public abstract void a(Object obj, int i);

    public final int c() {
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

    public final int d() {
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

    public final void e(Object obj) {
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
        Object obj;
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
        aesu aesuVar = this.g;
        aesuVar.k--;
        if (i2 == -1) {
            aesuVar.e = this.d;
        } else {
            long[] jArr = aesuVar.g;
            long j = jArr[i2];
            jArr[i2] = j ^ (((this.d & 4294967295L) ^ j) & 4294967295L);
        }
        int i3 = this.d;
        if (i3 == -1) {
            aesuVar.f = i2;
        } else {
            long[] jArr2 = aesuVar.g;
            long j2 = jArr2[i3];
            jArr2[i3] = ((((4294967295L & i2) << 32) ^ j2) & (-4294967296L)) ^ j2;
        }
        this.e = -1;
        int i4 = aesuVar.h;
        if (i == i4) {
            aesuVar.d = false;
            aesuVar.a[i4] = null;
            aesuVar.b[i4] = null;
            return;
        }
        Object[] objArr = aesuVar.a;
        Object[] objArr2 = aesuVar.b;
        while (true) {
            int i5 = (i + 1) & aesuVar.c;
            while (true) {
                obj = objArr[i5];
                if (obj != null) {
                    int iHashCode = obj.hashCode() * (-1640531527);
                    int i6 = aesuVar.c;
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
            aesuVar.m(i5, i);
            i = i5;
        }
    }
}
