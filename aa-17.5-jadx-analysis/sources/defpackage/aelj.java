package defpackage;

import j$.util.Spliterator;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class aelj extends aelk implements Serializable {
    private static final long serialVersionUID = -7046029254386353129L;
    protected final aeps a;
    protected final int b;
    protected int c;

    public aelj(aeps aepsVar, int i, int i2) {
        this.a = aepsVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.aelk, java.util.List
    public final boolean addAll(int i, Collection<? extends Long> collection) {
        E(i);
        this.c += collection.size();
        return this.a.addAll(this.b + i, collection);
    }

    @Override // defpackage.aelk, defpackage.aeld, defpackage.aepb
    /* renamed from: b */
    public aeqd spliterator() {
        aeps aepsVar = this.a;
        return aepsVar instanceof RandomAccess ? new aelf(aepsVar, this.b, this.c) : this instanceof RandomAccess ? new aelf(this) : new aeqi(y(), adzo.l(this), 16720);
    }

    @Override // defpackage.aelk, defpackage.aeld, defpackage.aepb
    public final boolean c(long j) {
        this.a.q(this.c, j);
        this.c++;
        return true;
    }

    @Override // defpackage.aelk, defpackage.aeld, defpackage.aepb
    public final boolean g(long j) {
        int iW = w(j);
        if (iW == -1) {
            return false;
        }
        this.c--;
        this.a.n(this.b + iW);
        return true;
    }

    @Override // defpackage.aelk
    /* renamed from: l */
    public aeps subList(int i, int i2) {
        E(i);
        E(i2);
        if (i <= i2) {
            return new aelj(this, i, i2);
        }
        throw new IllegalArgumentException(a.bB(i2, i, "Start index (", ") is greater than end index (", ")"));
    }

    @Override // defpackage.aelk, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    @Override // defpackage.aeps
    public long m(int i) {
        F(i);
        return this.a.m(this.b + i);
    }

    @Override // defpackage.aelk, defpackage.aeps
    public final long n(int i) {
        F(i);
        this.c--;
        return this.a.n(this.b + i);
    }

    @Override // defpackage.aelk, defpackage.aeps
    public final long o(int i, long j) {
        F(i);
        return this.a.o(this.b + i, j);
    }

    @Override // defpackage.aelk, defpackage.aeps
    /* renamed from: p */
    public aept listIterator(int i) {
        E(i);
        aeps aepsVar = this.a;
        return aepsVar instanceof RandomAccess ? new aeli(this, i) : new aelh(this, aepsVar.listIterator(i + this.b));
    }

    @Override // defpackage.aelk, defpackage.aeps
    public final void q(int i, long j) {
        E(i);
        this.a.q(this.b + i, j);
        this.c++;
    }

    @Override // defpackage.aelk, defpackage.aeps
    public final void r(int i, long[] jArr, int i2, int i3) {
        E(i);
        if (i + i3 <= size()) {
            this.a.r(this.b + i, jArr, i2, i3);
            return;
        }
        throw new IndexOutOfBoundsException("End index (" + i + i3 + ") is greater than list size (" + size() + ")");
    }

    @Override // defpackage.aelk, defpackage.aeps
    public final void s(int i, int i2) {
        E(i);
        E(i2);
        int i3 = this.b;
        this.a.s(i3 + i, i3 + i2);
        this.c -= i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c - this.b;
    }

    @Override // defpackage.aelk, defpackage.aeld, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // defpackage.aelk, java.util.List
    public /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.aelk
    public final boolean t(int i, aepb aepbVar) {
        E(i);
        E(i);
        aepm aepmVarM = aepbVar.m();
        boolean zHasNext = aepmVarM.hasNext();
        while (aepmVarM.hasNext()) {
            q(i, aepmVarM.nextLong());
            i++;
        }
        return zHasNext;
    }

    @Override // defpackage.aelk, defpackage.aeps
    public final void u(int i, long[] jArr, int i2) {
        E(i);
        this.a.u(this.b + i, jArr, i2);
    }
}
