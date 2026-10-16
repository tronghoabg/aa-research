package defpackage;

import j$.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aeeq implements Iterator, aefp {
    int a;
    int b = -1;
    final /* synthetic */ int c;
    final /* synthetic */ aeev d;

    public aeeq(aeev aeevVar, int i) {
        this.c = i;
        this.d = aeevVar;
        this.a = i;
    }

    @Override // defpackage.aefp, defpackage.aefl
    public final /* synthetic */ Byte a() {
        throw null;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        g((Byte) obj);
    }

    @Override // j$.util.PrimitiveIterator
    /* renamed from: b */
    public final void forEachRemaining(aefj aefjVar) {
        aeev aeevVar = this.d;
        byte[] bArr = aeevVar.a;
        while (true) {
            int i = this.a;
            if (i >= aeevVar.b) {
                return;
            }
            this.a = i + 1;
            this.b = i;
            aefjVar.b(bArr[i]);
        }
    }

    @Override // defpackage.aefl
    public final byte c() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        byte[] bArr = this.d.a;
        int i = this.a;
        this.a = i + 1;
        this.b = i;
        return bArr[i];
    }

    @Override // defpackage.aeex
    public final byte d() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        byte[] bArr = this.d.a;
        int i = this.a - 1;
        this.a = i;
        this.b = i;
        return bArr[i];
    }

    @Override // defpackage.aefp
    public final /* synthetic */ Byte e() {
        throw null;
    }

    @Override // defpackage.aefp
    public final void f(byte b) {
        int i = this.a;
        this.a = i + 1;
        this.d.p(i, b);
        this.b = -1;
    }

    @Override // defpackage.aefp
    public final /* synthetic */ void g(Byte b) {
        aeec.i(this, b);
    }

    @Override // defpackage.aefp
    public final void h(byte b) {
        int i = this.b;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.d.n(i, b);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.d.b;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final boolean hasPrevious() {
        return this.a > 0;
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
        return this.a;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final /* synthetic */ Object previous() {
        return adzo.k(this);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // defpackage.aefp, java.util.ListIterator, java.util.Iterator
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
        i((Byte) obj);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        aeec.o(this, consumer);
    }
}
