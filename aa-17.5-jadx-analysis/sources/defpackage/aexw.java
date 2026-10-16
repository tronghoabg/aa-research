package defpackage;

import j$.util.Spliterator;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class aexw extends aexx implements Serializable {
    private static final long serialVersionUID = -7046029254386353129L;
    protected final aeyx a;
    protected final int b;
    protected int c;

    public aexw(aeyx aeyxVar, int i, int i2) {
        this.a = aeyxVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.aexx, java.util.List
    public final boolean addAll(int i, Collection<? extends Short> collection) {
        C(i);
        this.c += collection.size();
        return this.a.addAll(this.b + i, collection);
    }

    @Override // defpackage.aexx, defpackage.aexq, defpackage.aeyi
    public aeze b() {
        aeyx aeyxVar = this.a;
        return aeyxVar instanceof RandomAccess ? new aexs(aeyxVar, this.b, this.c) : this instanceof RandomAccess ? new aexs(this) : new aezi(w(), adzo.l(this));
    }

    @Override // defpackage.aexx, defpackage.aexq, defpackage.aeyi
    public final boolean e(short s) {
        int iU = u(s);
        if (iU == -1) {
            return false;
        }
        this.c--;
        this.a.m(this.b + iU);
        return true;
    }

    @Override // defpackage.aexx, defpackage.aexq, defpackage.aeyi
    public final void i(short s) {
        this.a.o(this.c, s);
        this.c++;
    }

    @Override // defpackage.aexx
    /* renamed from: j */
    public aeyx subList(int i, int i2) {
        C(i);
        C(i2);
        if (i <= i2) {
            return new aexw(this, i, i2);
        }
        throw new IllegalArgumentException(a.bB(i2, i, "Start index (", ") is greater than end index (", ")"));
    }

    @Override // defpackage.aexx, defpackage.aeyx
    /* renamed from: k */
    public aeyy listIterator(int i) {
        C(i);
        aeyx aeyxVar = this.a;
        return aeyxVar instanceof RandomAccess ? new aexv(this, i) : new aexu(this, aeyxVar.listIterator(i + this.b));
    }

    @Override // defpackage.aeyx
    public short l(int i) {
        D(i);
        return this.a.l(this.b + i);
    }

    @Override // defpackage.aexx, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    @Override // defpackage.aexx, defpackage.aeyx
    public final short m(int i) {
        D(i);
        this.c--;
        return this.a.m(this.b + i);
    }

    @Override // defpackage.aexx, defpackage.aeyx
    public final short n(int i, short s) {
        D(i);
        return this.a.n(this.b + i, s);
    }

    @Override // defpackage.aexx, defpackage.aeyx
    public final void o(int i, short s) {
        C(i);
        this.a.o(this.b + i, s);
        this.c++;
    }

    @Override // defpackage.aexx, defpackage.aeyx
    public final void p(int i, short[] sArr, int i2, int i3) {
        C(i);
        if (i + i3 <= size()) {
            this.a.p(this.b + i, sArr, i2, i3);
            return;
        }
        throw new IndexOutOfBoundsException("End index (" + i + i3 + ") is greater than list size (" + size() + ")");
    }

    @Override // defpackage.aexx, defpackage.aeyx
    public final void q(int i, int i2) {
        C(i);
        C(i2);
        int i3 = this.b;
        this.a.q(i3 + i, i3 + i2);
        this.c -= i2 - i;
    }

    @Override // defpackage.aexx
    public final boolean r(int i, aeyi aeyiVar) {
        C(i);
        C(i);
        aeyu it = aeyiVar.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            o(i, it.d());
            i++;
        }
        return zHasNext;
    }

    @Override // defpackage.aexx, defpackage.aeyx
    public final void s(int i, short[] sArr, int i2) {
        C(i);
        this.a.s(this.b + i, sArr, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c - this.b;
    }

    @Override // defpackage.aexx, defpackage.aexq, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* bridge */ /* synthetic */ Spliterator spliterator() {
        return b();
    }

    @Override // defpackage.aexx, java.util.List
    public /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
