package defpackage;

import j$.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class aefn extends aefm implements Iterator, aefp {
    protected aefn(int i) {
        super(i);
    }

    @Override // defpackage.aeeh, defpackage.aefl
    public final /* synthetic */ Byte a() {
        return aeec.m(this);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        g((Byte) obj);
    }

    public byte d() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.b - 1;
        this.b = i;
        this.c = i;
        return j(i);
    }

    @Override // defpackage.aefp
    public final /* synthetic */ Byte e() {
        return adzo.k(this);
    }

    @Override // defpackage.aefp
    public final void f(byte b) {
        int i = this.b;
        this.b = i + 1;
        l(i, b);
        this.c = -1;
    }

    @Override // defpackage.aefp
    public final /* synthetic */ void g(Byte b) {
        aeec.i(this, b);
    }

    @Override // defpackage.aefp
    public final void h(byte b) {
        int i = this.c;
        if (i == -1) {
            throw new IllegalStateException();
        }
        n(i, b);
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // defpackage.aefp
    public final /* synthetic */ void i(Byte b) {
        aeec.k(this, b);
    }

    protected abstract void l(int i, byte b);

    protected abstract void n(int i, byte b);

    @Override // defpackage.aeeh, java.util.Iterator
    public final /* synthetic */ Object next() {
        return a();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final /* synthetic */ Object previous() {
        return e();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        i((Byte) obj);
    }
}
