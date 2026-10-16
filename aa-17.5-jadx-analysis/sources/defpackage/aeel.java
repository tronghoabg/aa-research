package defpackage;

import j$.util.Spliterator;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class aeel extends aeen implements Serializable {
    private static final long serialVersionUID = -7046029254386353129L;
    protected final aefo a;
    protected final int b;
    protected int c;

    public aeel(aefo aefoVar, int i, int i2) {
        this.a = aefoVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.aeen, java.util.List
    public final boolean addAll(int i, Collection<? extends Byte> collection) {
        D(i);
        this.c += collection.size();
        return this.a.addAll(this.b + i, collection);
    }

    @Override // defpackage.aeen, defpackage.aeeg, defpackage.aeez
    public aefz b() {
        aefo aefoVar = this.a;
        return aefoVar instanceof RandomAccess ? new aeem(aefoVar, this.b, this.c) : this instanceof RandomAccess ? new aeem(this) : new aegd(x(), adzo.l(this));
    }

    @Override // defpackage.aeen, defpackage.aeeg, defpackage.aeez
    public final boolean c(byte b) {
        this.a.p(this.c, b);
        this.c++;
        return true;
    }

    @Override // defpackage.aeen, defpackage.aeeg, defpackage.aeez
    public final boolean g(byte b) {
        int iV = v(b);
        if (iV == -1) {
            return false;
        }
        this.c--;
        this.a.m(this.b + iV);
        return true;
    }

    @Override // defpackage.aeen
    /* renamed from: k */
    public aefo subList(int i, int i2) {
        D(i);
        D(i2);
        if (i <= i2) {
            return new aeel(this, i, i2);
        }
        throw new IllegalArgumentException(a.bB(i2, i, "Start index (", ") is greater than end index (", ")"));
    }

    @Override // defpackage.aefo
    public byte l(int i) {
        E(i);
        return this.a.l(this.b + i);
    }

    @Override // defpackage.aeen, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    @Override // defpackage.aeen, defpackage.aefo
    public final byte m(int i) {
        E(i);
        this.c--;
        return this.a.m(this.b + i);
    }

    @Override // defpackage.aeen, defpackage.aefo
    public final byte n(int i, byte b) {
        E(i);
        return this.a.n(this.b + i, b);
    }

    @Override // defpackage.aeen, defpackage.aefo
    /* renamed from: o */
    public aefp listIterator(int i) {
        D(i);
        aefo aefoVar = this.a;
        return aefoVar instanceof RandomAccess ? new aeek(this, i) : new aeej(this, aefoVar.listIterator(i + this.b));
    }

    @Override // defpackage.aeen, defpackage.aefo
    public final void p(int i, byte b) {
        D(i);
        this.a.p(this.b + i, b);
        this.c++;
    }

    @Override // defpackage.aeen, defpackage.aefo
    public final void q(int i, byte[] bArr, int i2, int i3) {
        D(i);
        if (i + i3 <= size()) {
            this.a.q(this.b + i, bArr, i2, i3);
            return;
        }
        throw new IndexOutOfBoundsException("End index (" + i + i3 + ") is greater than list size (" + size() + ")");
    }

    @Override // defpackage.aeen, defpackage.aefo
    public final void r(int i, int i2) {
        D(i);
        D(i2);
        int i3 = this.b;
        this.a.r(i3 + i, i3 + i2);
        this.c -= i2 - i;
    }

    @Override // defpackage.aeen
    public final boolean s(int i, aeez aeezVar) {
        D(i);
        D(i);
        aefl it = aeezVar.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            p(i, it.c());
            i++;
        }
        return zHasNext;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c - this.b;
    }

    @Override // defpackage.aeen, defpackage.aeeg, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* bridge */ /* synthetic */ Spliterator spliterator() {
        return b();
    }

    @Override // defpackage.aeen, java.util.List
    public /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.aeen, defpackage.aefo
    public final void t(int i, byte[] bArr, int i2) {
        D(i);
        this.a.t(this.b + i, bArr, i2);
    }
}
