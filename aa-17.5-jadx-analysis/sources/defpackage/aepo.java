package defpackage;

import j$.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class aepo extends aepn implements Iterator, aept {
    protected aepo(int i) {
        super(i);
    }

    public long a() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.b - 1;
        this.b = i;
        this.c = i;
        return h(i);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        d((Long) obj);
    }

    @Override // defpackage.aept
    public final /* synthetic */ Long b() {
        return adqq.au(this);
    }

    @Override // defpackage.aept
    public final void c(long j) {
        int i = this.b;
        this.b = i + 1;
        i(i, j);
        this.c = -1;
    }

    @Override // defpackage.aept
    public final /* synthetic */ void d(Long l) {
        adqq.ah(this, l);
    }

    @Override // defpackage.aept
    public final void e(long j) {
        int i = this.c;
        if (i == -1) {
            throw new IllegalStateException();
        }
        k(i, j);
    }

    @Override // defpackage.aept
    public final /* synthetic */ void f(Long l) {
        adqq.aj(this, l);
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    protected abstract void i(int i, long j);

    protected abstract void k(int i, long j);

    @Override // defpackage.aele, defpackage.aepm, j$.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Long next() {
        return adqq.an(this);
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
        f((Long) obj);
    }

    @Override // defpackage.aele, java.util.Iterator
    public final /* synthetic */ Object next() {
        return next();
    }
}
