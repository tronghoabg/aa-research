package defpackage;

import j$.util.Spliterator;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class aerk<K> extends aerl<K> implements Serializable {
    private static final long serialVersionUID = -7046029254386353129L;
    protected final aexm a;
    protected final int b;
    protected int c;

    public aerk(aexm aexmVar, int i, int i2) {
        this.a = aexmVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.aerl, java.util.List
    public final void add(int i, K k) {
        i(i);
        this.a.add(this.b + i, k);
        this.c++;
    }

    @Override // defpackage.aerl, java.util.List
    public final boolean addAll(int i, Collection<? extends K> collection) {
        i(i);
        this.c += collection.size();
        return this.a.addAll(this.b + i, collection);
    }

    @Override // defpackage.aerl, defpackage.aerf, defpackage.aexk
    public aeus b() {
        aexm aexmVar = this.a;
        return aexmVar instanceof RandomAccess ? new aerg(aexmVar, this.b, this.c) : this instanceof RandomAccess ? new aerg(this) : new aeuy(h(), adzo.l(this), 16464);
    }

    @Override // defpackage.aerl
    /* renamed from: c */
    public aexm subList(int i, int i2) {
        i(i);
        i(i2);
        if (i <= i2) {
            return new aerk(this, i, i2);
        }
        throw new IllegalArgumentException(a.bB(i2, i, "Start index (", ") is greater than end index (", ")"));
    }

    @Override // defpackage.aerl, defpackage.aexm
    /* renamed from: d */
    public aeui listIterator(int i) {
        i(i);
        aexm aexmVar = this.a;
        return aexmVar instanceof RandomAccess ? new aerj(this, i, 0) : new aeri(this, aexmVar.listIterator(i + this.b), 0);
    }

    @Override // defpackage.aerl, defpackage.aexm
    public final void e(int i, Object[] objArr, int i2, int i3) {
        i(i);
        if (i + i3 <= size()) {
            this.a.e(this.b + i, objArr, i2, i3);
            return;
        }
        throw new IndexOutOfBoundsException("End index (" + i + i3 + ") is greater than list size (" + size() + ")");
    }

    @Override // defpackage.aerl, defpackage.aexm
    public final void f(int i, int i2) {
        i(i);
        i(i2);
        int i3 = this.b;
        this.a.f(i3 + i, i3 + i2);
        this.c -= i2 - i;
    }

    @Override // defpackage.aerl, defpackage.aexm
    public final void g(int i, Object[] objArr, int i2) {
        i(i);
        this.a.g(this.b + i, objArr, i2);
    }

    @Override // java.util.List
    public K get(int i) {
        j(i);
        return this.a.get(this.b + i);
    }

    @Override // defpackage.aerl, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    @Override // defpackage.aerl, java.util.List
    public final K remove(int i) {
        j(i);
        this.c--;
        return this.a.remove(this.b + i);
    }

    @Override // defpackage.aerl, java.util.List
    public final K set(int i, K k) {
        j(i);
        return this.a.set(this.b + i, k);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c - this.b;
    }

    @Override // defpackage.aerl, defpackage.aerf, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* bridge */ /* synthetic */ Spliterator spliterator() {
        return b();
    }

    @Override // defpackage.aerl, java.util.List
    public /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.aerl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(K k) {
        this.a.add(this.c, k);
        this.c++;
        return true;
    }
}
