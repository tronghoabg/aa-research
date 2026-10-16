package defpackage;

import j$.util.Iterator;
import java.util.AbstractCollection;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aexd implements Iterator, aeui {
    int a;
    int b = -1;
    final /* synthetic */ int c;
    final /* synthetic */ AbstractCollection d;
    private final /* synthetic */ int e;

    public aexd(AbstractCollection abstractCollection, int i, int i2) {
        this.e = i2;
        this.c = i;
        this.d = abstractCollection;
        this.a = i;
    }

    @Override // defpackage.aeui, java.util.ListIterator
    public final void add(Object obj) {
        int i = this.e;
        int i2 = this.a;
        if (i != 0) {
            this.a = i2 + 1;
            ((aeqv) this.d).add(i2, obj);
            this.b = -1;
        } else {
            this.a = i2 + 1;
            ((aerl) this.d).add(i2, obj);
            this.b = -1;
        }
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        int i = this.e;
        AbstractCollection abstractCollection = this.d;
        if (i != 0) {
            aetq aetqVar = (aetq) abstractCollection;
            Object[] objArr = aetqVar.a;
            while (true) {
                int i2 = this.a;
                if (i2 >= aetqVar.b) {
                    return;
                }
                this.a = i2 + 1;
                this.b = i2;
                consumer.accept(objArr[i2]);
            }
        } else {
            aexh aexhVar = (aexh) abstractCollection;
            Object[] objArr2 = aexhVar.a;
            while (true) {
                int i3 = this.a;
                if (i3 >= aexhVar.b) {
                    return;
                }
                this.a = i3 + 1;
                this.b = i3;
                consumer.accept(objArr2[i3]);
            }
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.e;
        int i2 = this.a;
        AbstractCollection abstractCollection = this.d;
        return i != 0 ? i2 < ((aetq) abstractCollection).b : i2 < ((aexh) abstractCollection).b;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final boolean hasPrevious() {
        int i = this.e;
        int i2 = this.a;
        return i != 0 ? i2 > 0 : i2 > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (this.e != 0) {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object[] objArr = ((aetq) this.d).a;
            int i = this.a;
            this.a = i + 1;
            this.b = i;
            return objArr[i];
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr2 = ((aexh) this.d).a;
        int i2 = this.a;
        this.a = i2 + 1;
        this.b = i2;
        return objArr2[i2];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final Object previous() {
        if (this.e != 0) {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            Object[] objArr = ((aetq) this.d).a;
            int i = this.a - 1;
            this.a = i;
            this.b = i;
            return objArr[i];
        }
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        Object[] objArr2 = ((aexh) this.d).a;
        int i2 = this.a - 1;
        this.a = i2;
        this.b = i2;
        return objArr2[i2];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i = this.e;
        return this.a - 1;
    }

    @Override // defpackage.aeui, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.e;
        int i2 = this.b;
        if (i != 0) {
            if (i2 == -1) {
                throw new IllegalStateException();
            }
            ((aeqv) this.d).remove(i2);
            int i3 = this.b;
            int i4 = this.a;
            if (i3 < i4) {
                this.a = i4 - 1;
            }
            this.b = -1;
            return;
        }
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        ((aerl) this.d).remove(i2);
        int i5 = this.b;
        int i6 = this.a;
        if (i5 < i6) {
            this.a = i6 - 1;
        }
        this.b = -1;
    }

    @Override // defpackage.aeui, java.util.ListIterator
    public final void set(Object obj) {
        int i = this.e;
        int i2 = this.b;
        if (i != 0) {
            if (i2 == -1) {
                throw new IllegalStateException();
            }
            ((aeqv) this.d).set(i2, obj);
        } else {
            if (i2 == -1) {
                throw new IllegalStateException();
            }
            ((aerl) this.d).set(i2, obj);
        }
    }
}
