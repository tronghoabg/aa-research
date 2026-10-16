package defpackage;

import j$.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class aeuf implements Iterator, aeui {
    int b;
    final /* synthetic */ aeug e;
    int a = -1;
    int c = -1;
    int d = 0;

    public aeuf(aeug aeugVar) {
        this.e = aeugVar;
        this.b = aeugVar.d;
    }

    private final void a() {
        int i;
        if (this.d >= 0) {
            return;
        }
        if (this.a == -1) {
            i = 0;
        } else {
            int i2 = this.b;
            aeug aeugVar = this.e;
            if (i2 != -1) {
                int i3 = aeugVar.d;
                this.d = 1;
                while (i3 != this.a) {
                    i3 = (int) aeugVar.f[i3];
                    this.d++;
                }
                return;
            }
            i = aeugVar.j;
        }
        this.d = i;
    }

    @Override // defpackage.aeui, java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        adqs.aC();
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        aeug aeugVar = this.e;
        Object[] objArr = aeugVar.a;
        long[] jArr = aeugVar.f;
        while (true) {
            int i = this.b;
            if (i == -1) {
                return;
            }
            this.c = i;
            this.b = (int) jArr[i];
            this.a = i;
            int i2 = this.d;
            if (i2 >= 0) {
                this.d = i2 + 1;
            }
            consumer.accept(objArr[i]);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b != -1;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final boolean hasPrevious() {
        return this.a != -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.c = i;
        aeug aeugVar = this.e;
        this.b = (int) aeugVar.f[i];
        this.a = i;
        int i2 = this.d;
        if (i2 >= 0) {
            this.d = i2 + 1;
        }
        return aeugVar.a[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return this.d;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.a;
        this.c = i;
        aeug aeugVar = this.e;
        this.a = (int) (aeugVar.f[i] >>> 32);
        this.b = i;
        int i2 = this.d;
        if (i2 >= 0) {
            this.d = i2 - 1;
        }
        return aeugVar.a[i];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return this.d - 1;
    }

    @Override // defpackage.aeui, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        Object obj;
        a();
        int i = this.c;
        if (i == -1) {
            throw new IllegalStateException();
        }
        int i2 = this.a;
        if (i == i2) {
            this.d--;
            i2 = (int) (this.e.f[i] >>> 32);
            this.a = i2;
        } else {
            this.b = (int) this.e.f[i];
        }
        aeug aeugVar = this.e;
        aeugVar.j--;
        if (i2 == -1) {
            aeugVar.d = this.b;
        } else {
            long[] jArr = aeugVar.f;
            long j = jArr[i2];
            jArr[i2] = j ^ (((this.b & 4294967295L) ^ j) & 4294967295L);
        }
        int i3 = this.b;
        if (i3 == -1) {
            aeugVar.e = i2;
        } else {
            long[] jArr2 = aeugVar.f;
            long j2 = jArr2[i3];
            jArr2[i3] = ((((4294967295L & i2) << 32) ^ j2) & (-4294967296L)) ^ j2;
        }
        this.c = -1;
        int i4 = aeugVar.g;
        if (i == i4) {
            aeugVar.c = false;
            aeugVar.a[i4] = null;
            return;
        }
        Object[] objArr = aeugVar.a;
        while (true) {
            int i5 = (i + 1) & aeugVar.b;
            while (true) {
                obj = objArr[i5];
                if (obj != null) {
                    int iHashCode = obj.hashCode() * (-1640531527);
                    int i6 = aeugVar.b;
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
                    return;
                }
            }
            objArr[i] = obj;
            if (this.b == i5) {
                this.b = i;
            }
            if (this.a == i5) {
                this.a = i;
            }
            aeugVar.i(i5, i);
            i = i5;
        }
    }

    @Override // defpackage.aeui, java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        adqs.aE();
    }
}
