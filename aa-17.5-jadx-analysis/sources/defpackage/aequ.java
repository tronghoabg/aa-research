package defpackage;

import j$.util.Spliterator;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class aequ<K> extends aeqv<K> implements Serializable {
    private static final long serialVersionUID = -7046029254386353129L;
    protected final aeuh a;
    protected final int b;
    protected int c;

    public aequ(aeuh aeuhVar, int i, int i2) {
        this.a = aeuhVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.aeqv, java.util.List
    public final void add(int i, K k) {
        k(i);
        this.a.add(this.b + i, k);
        this.c++;
    }

    @Override // defpackage.aeqv, java.util.List
    public final boolean addAll(int i, Collection<? extends K> collection) {
        k(i);
        this.c += collection.size();
        return this.a.addAll(this.b + i, collection);
    }

    @Override // defpackage.aeqv, defpackage.aeqq, defpackage.aetv
    public aeus b() {
        aeuh aeuhVar = this.a;
        return aeuhVar instanceof RandomAccess ? new aeqs(aeuhVar, this.b, this.c) : this instanceof RandomAccess ? new aeqs(this) : new aeuy(i(), adzo.l(this), 16464);
    }

    @Override // defpackage.aeqv
    /* renamed from: c */
    public aeuh subList(int i, int i2) {
        k(i);
        k(i2);
        if (i <= i2) {
            return new aequ(this, i, i2);
        }
        throw new IllegalArgumentException(a.bB(i2, i, "Start index (", ") is greater than end index (", ")"));
    }

    @Override // defpackage.aeqv, defpackage.aeuh
    /* renamed from: d */
    public aeui listIterator(int i) {
        k(i);
        aeuh aeuhVar = this.a;
        return aeuhVar instanceof RandomAccess ? new aerj(this, i, 1) : new aeri(this, aeuhVar.listIterator(i + this.b), 1);
    }

    @Override // defpackage.aeqv, defpackage.aeuh
    public final void e(int i, Object[] objArr, int i2, int i3) {
        k(i);
        if (i + i3 <= size()) {
            this.a.e(this.b + i, objArr, i2, i3);
            return;
        }
        throw new IndexOutOfBoundsException("End index (" + i + i3 + ") is greater than list size (" + size() + ")");
    }

    @Override // defpackage.aeqv, defpackage.aeuh
    public final void f(int i, int i2) {
        k(i);
        k(i2);
        int i3 = this.b;
        this.a.f(i3 + i, i3 + i2);
        this.c -= i2 - i;
    }

    @Override // defpackage.aeqv, defpackage.aeuh
    public final void g(int i, Object[] objArr, int i2) {
        k(i);
        this.a.g(this.b + i, objArr, i2);
    }

    @Override // java.util.List
    public K get(int i) {
        l(i);
        return this.a.get(this.b + i);
    }

    @Override // defpackage.aeqv, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    @Override // defpackage.aeqv, java.util.List
    public final K remove(int i) {
        l(i);
        this.c--;
        return this.a.remove(this.b + i);
    }

    @Override // defpackage.aeqv, java.util.List
    public final K set(int i, K k) {
        l(i);
        return this.a.set(this.b + i, k);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c - this.b;
    }

    @Override // defpackage.aeqv, defpackage.aeqq, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* bridge */ /* synthetic */ Spliterator spliterator() {
        return b();
    }

    @Override // defpackage.aeqv, java.util.List
    public /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.aeqv, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(K k) {
        this.a.add(this.c, k);
        this.c++;
        return true;
    }
}
