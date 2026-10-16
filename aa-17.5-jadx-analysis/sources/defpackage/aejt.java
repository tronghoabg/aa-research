package defpackage;

import j$.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class aejt extends aejs implements Iterator, aekb {
    protected aejt(int i) {
        super(i);
    }

    public int a() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.b - 1;
        this.b = i;
        this.c = i;
        return g(i);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        d((Integer) obj);
    }

    @Override // defpackage.aekb
    public final /* synthetic */ Integer b() {
        return adzo.s(this);
    }

    @Override // defpackage.aekb
    public final void c(int i) {
        int i2 = this.b;
        this.b = i2 + 1;
        i(i2, i);
        this.c = -1;
    }

    @Override // defpackage.aekb
    public final /* synthetic */ void d(Integer num) {
        aeec.R(this, num);
    }

    @Override // defpackage.aekb
    public final void e(int i) {
        int i2 = this.c;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        k(i2, i);
    }

    @Override // defpackage.aekb
    public final /* synthetic */ void f(Integer num) {
        aeec.T(this, num);
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    protected abstract void i(int i, int i2);

    protected abstract void k(int i, int i2);

    @Override // defpackage.aegk, defpackage.aejr, j$.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return aeec.Z(this);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final /* synthetic */ Object previous() {
        return b();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        f((Integer) obj);
    }

    @Override // defpackage.aegk, java.util.Iterator
    public final /* synthetic */ Object next() {
        return next();
    }
}
