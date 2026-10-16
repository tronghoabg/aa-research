package defpackage;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class yid implements ListIterator {
    int a;
    yic b;
    yic c;
    yic d;
    int e;
    final /* synthetic */ yif f;

    public yid(yif yifVar, int i) {
        this.f = yifVar;
        this.e = yifVar.e;
        int i2 = yifVar.d;
        woy.aj(i, i2);
        if (i >= i2 / 2) {
            this.d = yifVar.b;
            this.a = i2;
            while (i < i2) {
                previous();
                i++;
            }
        } else {
            this.b = yifVar.a;
            while (i > 0) {
                next();
                i--;
            }
        }
        this.c = null;
    }

    private final void c() {
        if (this.f.e != this.e) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final yic next() {
        c();
        yic yicVar = this.b;
        if (yicVar == null) {
            throw new NoSuchElementException();
        }
        this.c = yicVar;
        this.d = yicVar;
        this.b = yicVar.a;
        this.a++;
        return this.c;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final yic previous() {
        c();
        yic yicVar = this.d;
        if (yicVar == null) {
            throw new NoSuchElementException();
        }
        this.c = yicVar;
        this.b = yicVar;
        this.d = yicVar.b;
        this.a--;
        return this.c;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        c();
        return this.b != null;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        c();
        return this.d != null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        c();
        woy.aa(this.c != null, "no calls to next() since the last call to remove()");
        yic yicVar = this.c;
        if (yicVar != this.b) {
            this.d = yicVar.b;
            this.a--;
        } else {
            this.b = yicVar.a;
        }
        yif yifVar = this.f;
        yifVar.e(yicVar);
        this.c = null;
        this.e = yifVar.e;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
