package defpackage;

import j$.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class aeyw extends aeyv implements Iterator, aeyy {
    protected aeyw(int i) {
        super(i);
    }

    @Override // defpackage.aexr, defpackage.aeyu
    public final /* synthetic */ Short a() {
        return adqs.N(this);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        f((Short) obj);
    }

    @Override // defpackage.aeyy
    public final /* synthetic */ Short c() {
        return adqs.Y(this);
    }

    public short e() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.b - 1;
        this.b = i;
        this.c = i;
        return k(i);
    }

    @Override // defpackage.aeyy
    public final /* synthetic */ void f(Short sh) {
        adqs.K(this, sh);
    }

    @Override // defpackage.aeyy
    public final void g(short s) {
        int i = this.b;
        this.b = i + 1;
        l(i, s);
        this.c = -1;
    }

    @Override // defpackage.aeyy
    public final /* synthetic */ void h(Short sh) {
        adqs.M(this, sh);
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // defpackage.aeyy
    public final void i(short s) {
        int i = this.c;
        if (i == -1) {
            throw new IllegalStateException();
        }
        n(i, s);
    }

    protected abstract void l(int i, short s);

    protected abstract void n(int i, short s);

    @Override // defpackage.aexr, java.util.Iterator
    public final /* synthetic */ Object next() {
        return a();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final /* synthetic */ Object previous() {
        return c();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        h((Short) obj);
    }
}
