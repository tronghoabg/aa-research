package defpackage;

import j$.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class aejy implements Iterator, aekb {
    int b;
    final /* synthetic */ aejz e;
    int a = -1;
    int c = -1;
    int d = 0;

    public aejy(aejz aejzVar) {
        this.e = aejzVar;
        this.b = aejzVar.d;
    }

    private final void g() {
        int i;
        if (this.d >= 0) {
            return;
        }
        if (this.a == -1) {
            i = 0;
        } else {
            int i2 = this.b;
            aejz aejzVar = this.e;
            if (i2 != -1) {
                int i3 = aejzVar.d;
                this.d = 1;
                while (i3 != this.a) {
                    i3 = (int) aejzVar.f[i3];
                    this.d++;
                }
                return;
            }
            i = aejzVar.j;
        }
        this.d = i;
    }

    @Override // defpackage.aejd
    public final int a() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.a;
        this.c = i;
        aejz aejzVar = this.e;
        this.a = (int) (aejzVar.f[i] >>> 32);
        this.b = i;
        int i2 = this.d;
        if (i2 >= 0) {
            this.d = i2 - 1;
        }
        return aejzVar.a[i];
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        d((Integer) obj);
    }

    @Override // defpackage.aekb
    public final /* synthetic */ Integer b() {
        throw null;
    }

    @Override // defpackage.aekb
    public final /* synthetic */ void c(int i) {
        aeec.V();
    }

    @Override // defpackage.aekb
    public final /* synthetic */ void d(Integer num) {
        aeec.R(this, num);
    }

    @Override // defpackage.aekb
    public final /* synthetic */ void e(int i) {
        aeec.X();
    }

    @Override // defpackage.aekb
    public final /* synthetic */ void f(Integer num) {
        aeec.T(this, num);
    }

    @Override // j$.util.PrimitiveIterator.OfInt
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final void forEachRemaining2(IntConsumer intConsumer) {
        aejz aejzVar = this.e;
        int[] iArr = aejzVar.a;
        long[] jArr = aejzVar.f;
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
            intConsumer.accept(iArr[i]);
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

    @Override // defpackage.aekb, java.util.ListIterator, java.util.Iterator, defpackage.aejr, j$.util.PrimitiveIterator.OfInt
    public final /* synthetic */ Integer next() {
        return aeec.Z(this);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        g();
        return this.d;
    }

    @Override // defpackage.aejr, j$.util.PrimitiveIterator.OfInt
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.c = i;
        aejz aejzVar = this.e;
        this.b = (int) aejzVar.f[i];
        this.a = i;
        int i2 = this.d;
        if (i2 >= 0) {
            this.d = i2 + 1;
        }
        return aejzVar.a[i];
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final /* synthetic */ Object previous() {
        return adzo.s(this);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        g();
        return this.d - 1;
    }

    @Override // defpackage.aekb, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        g();
        int i2 = this.c;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        int i3 = this.a;
        if (i2 == i3) {
            this.d--;
            i3 = (int) (this.e.f[i2] >>> 32);
            this.a = i3;
        } else {
            this.b = (int) this.e.f[i2];
        }
        aejz aejzVar = this.e;
        aejzVar.j--;
        if (i3 == -1) {
            aejzVar.d = this.b;
        } else {
            long[] jArr = aejzVar.f;
            long j = jArr[i3];
            jArr[i3] = j ^ (((this.b & 4294967295L) ^ j) & 4294967295L);
        }
        int i4 = this.b;
        if (i4 == -1) {
            aejzVar.e = i3;
        } else {
            long[] jArr2 = aejzVar.f;
            long j2 = jArr2[i4];
            jArr2[i4] = ((((4294967295L & i3) << 32) ^ j2) & (-4294967296L)) ^ j2;
        }
        this.c = -1;
        int i5 = aejzVar.g;
        if (i2 == i5) {
            aejzVar.c = false;
            aejzVar.a[i5] = 0;
            return;
        }
        int[] iArr = aejzVar.a;
        while (true) {
            int i6 = (i2 + 1) & aejzVar.b;
            while (true) {
                i = iArr[i6];
                if (i == 0) {
                    iArr[i2] = 0;
                    return;
                }
                int i7 = aejzVar.b;
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
            if (this.b == i6) {
                this.b = i2;
            }
            if (this.a == i6) {
                this.a = i2;
            }
            aejzVar.A(i6, i2);
            i2 = i6;
        }
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        f((Integer) obj);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return aeec.Z(this);
    }

    @Override // j$.util.PrimitiveIterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining2(a$$ExternalSyntheticApiModelOutline3.m40m((Object) intConsumer));
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        aeec.aa(this, consumer);
    }
}
