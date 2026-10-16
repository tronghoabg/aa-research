package defpackage;

import j$.util.Spliterator;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class aegp extends aegq implements Serializable {
    private static final long serialVersionUID = -7046029254386353129L;
    protected final aeka a;
    protected final int b;
    protected int c;

    public aegp(aeka aekaVar, int i, int i2) {
        this.a = aekaVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.aegq, java.util.List
    public final boolean addAll(int i, Collection<? extends Integer> collection) {
        E(i);
        this.c += collection.size();
        return this.a.addAll(this.b + i, collection);
    }

    @Override // defpackage.aegq, defpackage.aegj, defpackage.aejf
    /* renamed from: b */
    public aekm spliterator() {
        aeka aekaVar = this.a;
        return aekaVar instanceof RandomAccess ? new aegl(aekaVar, this.b, this.c) : this instanceof RandomAccess ? new aegl(this) : new aeks(y(), adzo.l(this), 16720);
    }

    @Override // defpackage.aegq, defpackage.aegj, defpackage.aejf
    public final boolean c(int i) {
        this.a.q(this.c, i);
        this.c++;
        return true;
    }

    @Override // defpackage.aegq, defpackage.aegj, defpackage.aejf
    public final boolean g(int i) {
        int iW = w(i);
        if (iW == -1) {
            return false;
        }
        this.c--;
        this.a.n(this.b + iW);
        return true;
    }

    @Override // defpackage.aegq
    /* renamed from: l */
    public aeka subList(int i, int i2) {
        E(i);
        E(i2);
        if (i <= i2) {
            return new aegp(this, i, i2);
        }
        throw new IllegalArgumentException(a.bB(i2, i, "Start index (", ") is greater than end index (", ")"));
    }

    @Override // defpackage.aegq, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    @Override // defpackage.aeka
    public int m(int i) {
        F(i);
        return this.a.m(this.b + i);
    }

    @Override // defpackage.aegq, defpackage.aeka
    public final int n(int i) {
        F(i);
        this.c--;
        return this.a.n(this.b + i);
    }

    @Override // defpackage.aegq, defpackage.aeka
    public final int o(int i, int i2) {
        F(i);
        return this.a.o(this.b + i, i2);
    }

    @Override // defpackage.aegq, defpackage.aeka
    /* renamed from: p */
    public aekb listIterator(int i) {
        E(i);
        aeka aekaVar = this.a;
        return aekaVar instanceof RandomAccess ? new aego(this, i) : new aegn(this, aekaVar.listIterator(i + this.b));
    }

    @Override // defpackage.aegq, defpackage.aeka
    public final void q(int i, int i2) {
        E(i);
        this.a.q(this.b + i, i2);
        this.c++;
    }

    @Override // defpackage.aegq, defpackage.aeka
    public final void r(int i, int[] iArr, int i2, int i3) {
        E(i);
        if (i + i3 <= size()) {
            this.a.r(this.b + i, iArr, i2, i3);
            return;
        }
        throw new IndexOutOfBoundsException("End index (" + i + i3 + ") is greater than list size (" + size() + ")");
    }

    @Override // defpackage.aegq, defpackage.aeka
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

    @Override // defpackage.aegq, defpackage.aegj, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // defpackage.aegq, java.util.List
    public /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.aegq
    public final boolean t(int i, aejf aejfVar) {
        E(i);
        E(i);
        aejr it = aejfVar.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            q(i, it.nextInt());
            i++;
        }
        return zHasNext;
    }

    @Override // defpackage.aegq, defpackage.aeka
    public final void u(int i, int[] iArr, int i2) {
        E(i);
        this.a.u(this.b + i, iArr, i2);
    }
}
