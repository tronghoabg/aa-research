package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class yie implements ListIterator {
    final Object a;
    int b;
    yic c;
    yic d;
    yic e;
    final /* synthetic */ yif f;

    public yie(yif yifVar, Object obj, int i) {
        this.f = yifVar;
        yib yibVar = (yib) yifVar.c.get(obj);
        int i2 = yibVar == null ? 0 : yibVar.a;
        woy.aj(i, i2);
        if (i >= i2 / 2) {
            this.e = (yic) (yibVar == null ? null : yibVar.c);
            this.b = i2;
            while (i < i2) {
                previous();
                i++;
            }
        } else {
            this.c = (yic) (yibVar == null ? null : yibVar.b);
            while (i > 0) {
                next();
                i--;
            }
        }
        this.a = obj;
        this.d = null;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.e = this.f.a(this.a, obj, this.c);
        this.b++;
        this.d = null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.c != null;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.e != null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        yic yicVar = this.c;
        if (yicVar == null) {
            throw new NoSuchElementException();
        }
        this.d = yicVar;
        this.e = yicVar;
        this.c = yicVar.c;
        this.b++;
        return this.d.getValue();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        yic yicVar = this.e;
        if (yicVar == null) {
            throw new NoSuchElementException();
        }
        this.d = yicVar;
        this.c = yicVar;
        this.e = yicVar.d;
        this.b--;
        return this.d.getValue();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        woy.aa(this.d != null, "no calls to next() since the last call to remove()");
        yic yicVar = this.d;
        if (yicVar != this.c) {
            this.e = yicVar.d;
            this.b--;
        } else {
            this.c = yicVar.c;
        }
        this.f.e(yicVar);
        this.d = null;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        woy.Z(this.d != null);
        this.d.setValue(obj);
    }

    public yie(yif yifVar, Object obj) {
        this.f = yifVar;
        this.a = obj;
        yib yibVar = (yib) yifVar.c.get(obj);
        this.c = (yic) (yibVar == null ? null : yibVar.b);
    }
}
