package defpackage;

import j$.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aeej implements Iterator, aefp {
    final /* synthetic */ aeel a;
    private final aefp b;

    public aeej(aeel aeelVar, aefp aefpVar) {
        this.a = aeelVar;
        this.b = aefpVar;
    }

    @Override // defpackage.aefp, defpackage.aefl
    public final /* synthetic */ Byte a() {
        throw null;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        g((Byte) obj);
    }

    @Override // defpackage.aefl
    /* renamed from: b */
    public final /* synthetic */ void forEachRemaining(aefj aefjVar) {
        aefjVar.getClass();
        while (hasNext()) {
            aefjVar.b(c());
        }
    }

    @Override // defpackage.aefl
    public final byte c() {
        if (hasNext()) {
            return this.b.c();
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.aeex
    public final byte d() {
        if (hasPrevious()) {
            return this.b.d();
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.aefp
    public final /* synthetic */ Byte e() {
        throw null;
    }

    @Override // defpackage.aefp
    public final void f(byte b) {
        this.b.f(b);
    }

    @Override // j$.util.PrimitiveIterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((aefj) obj);
    }

    @Override // defpackage.aefp
    public final /* synthetic */ void g(Byte b) {
        aeec.i(this, b);
    }

    @Override // defpackage.aefp
    public final void h(byte b) {
        this.b.h(b);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b.nextIndex() < this.a.c;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final boolean hasPrevious() {
        return this.b.previousIndex() >= this.a.b;
    }

    @Override // defpackage.aefp
    public final /* synthetic */ void i(Byte b) {
        aeec.k(this, b);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return aeec.m(this);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b.nextIndex() - this.a.b;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final /* synthetic */ Object previous() {
        return adzo.k(this);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b.previousIndex() - this.a.b;
    }

    @Override // defpackage.aefp, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.b.remove();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        i((Byte) obj);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        aeec.o(this, consumer);
    }
}
