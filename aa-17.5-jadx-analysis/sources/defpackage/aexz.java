package defpackage;

import j$.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aexz implements Iterator, aeyy {
    int a;
    int b = -1;
    final /* synthetic */ int c;
    final /* synthetic */ aeye d;

    public aexz(aeye aeyeVar, int i) {
        this.c = i;
        this.d = aeyeVar;
        this.a = i;
    }

    @Override // defpackage.aeyy, defpackage.aeyu
    public final /* synthetic */ Short a() {
        throw null;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        f((Short) obj);
    }

    @Override // j$.util.PrimitiveIterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void forEachRemaining(aeys aeysVar) {
        aeye aeyeVar = this.d;
        short[] sArr = aeyeVar.a;
        while (true) {
            int i = this.a;
            if (i >= aeyeVar.b) {
                return;
            }
            this.a = i + 1;
            this.b = i;
            aeysVar.c(sArr[i]);
        }
    }

    @Override // defpackage.aeyy
    public final /* synthetic */ Short c() {
        throw null;
    }

    @Override // defpackage.aeyu
    public final short d() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        short[] sArr = this.d.a;
        int i = this.a;
        this.a = i + 1;
        this.b = i;
        return sArr[i];
    }

    @Override // defpackage.aeyg
    public final short e() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        short[] sArr = this.d.a;
        int i = this.a - 1;
        this.a = i;
        this.b = i;
        return sArr[i];
    }

    @Override // defpackage.aeyy
    public final /* synthetic */ void f(Short sh) {
        adqs.K(this, sh);
    }

    @Override // defpackage.aeyy
    public final void g(short s) {
        int i = this.a;
        this.a = i + 1;
        this.d.o(i, s);
        this.b = -1;
    }

    @Override // defpackage.aeyy
    public final /* synthetic */ void h(Short sh) {
        adqs.M(this, sh);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.d.b;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final boolean hasPrevious() {
        return this.a > 0;
    }

    @Override // defpackage.aeyy
    public final void i(short s) {
        int i = this.b;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.d.n(i, s);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return adqs.N(this);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final /* synthetic */ Object previous() {
        return adqs.Y(this);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // defpackage.aeyy, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.b;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.d.m(i);
        int i2 = this.b;
        int i3 = this.a;
        if (i2 < i3) {
            this.a = i3 - 1;
        }
        this.b = -1;
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
