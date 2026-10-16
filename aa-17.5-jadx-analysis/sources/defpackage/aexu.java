package defpackage;

import j$.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aexu implements Iterator, aeyy {
    final /* synthetic */ aexw a;
    private final aeyy b;

    public aexu(aexw aexwVar, aeyy aeyyVar) {
        this.a = aexwVar;
        this.b = aeyyVar;
    }

    @Override // defpackage.aeyy, defpackage.aeyu
    public final /* synthetic */ Short a() {
        throw null;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        f((Short) obj);
    }

    @Override // defpackage.aeyu
    /* renamed from: b */
    public final /* synthetic */ void forEachRemaining(aeys aeysVar) {
        aeysVar.getClass();
        while (hasNext()) {
            aeysVar.c(d());
        }
    }

    @Override // defpackage.aeyy
    public final /* synthetic */ Short c() {
        throw null;
    }

    @Override // defpackage.aeyu
    public final short d() {
        if (hasNext()) {
            return this.b.d();
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.aeyg
    public final short e() {
        if (hasPrevious()) {
            return this.b.e();
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.aeyy
    public final /* synthetic */ void f(Short sh) {
        adqs.K(this, sh);
    }

    @Override // j$.util.PrimitiveIterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((aeys) obj);
    }

    @Override // defpackage.aeyy
    public final void g(short s) {
        this.b.g(s);
    }

    @Override // defpackage.aeyy
    public final /* synthetic */ void h(Short sh) {
        adqs.M(this, sh);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b.nextIndex() < this.a.c;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final boolean hasPrevious() {
        return this.b.previousIndex() >= this.a.b;
    }

    @Override // defpackage.aeyy
    public final void i(short s) {
        this.b.i(s);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return adqs.N(this);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b.nextIndex() - this.a.b;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final /* synthetic */ Object previous() {
        return adqs.Y(this);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b.previousIndex() - this.a.b;
    }

    @Override // defpackage.aeyy, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.b.remove();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        h((Short) obj);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        adqs.P(this, consumer);
    }
}
