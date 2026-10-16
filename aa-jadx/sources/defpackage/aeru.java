package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class aeru<K> extends defpackage.aerv<K> implements java.io.Serializable {
    private static final long serialVersionUID = -7046029254386353129L;
    protected final defpackage.aevh a;
    protected final int b;
    protected int c;

    public aeru(defpackage.aevh aevhVar, int i, int i2) {
        this.a = aevhVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.aerv, java.util.List
    public final void add(int i, K k) {
        k(i);
        this.a.add(this.b + i, k);
        this.c++;
    }

    @Override // defpackage.aerv, java.util.List
    public final boolean addAll(int i, java.util.Collection<? extends K> collection) {
        k(i);
        this.c += collection.size();
        return this.a.addAll(this.b + i, collection);
    }

    @Override // defpackage.aerv, defpackage.aerq, defpackage.aeuv
    public defpackage.aevs b() {
        defpackage.aevh aevhVar = this.a;
        if (aevhVar instanceof java.util.RandomAccess) {
            return new defpackage.aers(aevhVar, this.b, this.c);
        }
        return this instanceof java.util.RandomAccess ? new defpackage.aers(this) : new defpackage.aevy(i(), defpackage.aeao.f(this), 16464);
    }

    @Override // defpackage.aerv
    /* JADX INFO: renamed from: c */
    public defpackage.aevh subList(int i, int i2) {
        k(i);
        k(i2);
        if (i <= i2) {
            return new defpackage.aeru(this, i, i2);
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bz(i2, i, "Start index (", ") is greater than end index (", ")"));
    }

    @Override // defpackage.aerv, defpackage.aevh
    /* JADX INFO: renamed from: d */
    public defpackage.aevi listIterator(int i) {
        k(i);
        defpackage.aevh aevhVar = this.a;
        return aevhVar instanceof java.util.RandomAccess ? new defpackage.aesj(this, i, 1) : new defpackage.aesi(this, aevhVar.listIterator(i + this.b), 1);
    }

    @Override // defpackage.aerv, defpackage.aevh
    public final void e(int i, java.lang.Object[] objArr, int i2, int i3) {
        k(i);
        if (i + i3 <= size()) {
            this.a.e(this.b + i, objArr, i2, i3);
            return;
        }
        throw new java.lang.IndexOutOfBoundsException("End index (" + i + i3 + ") is greater than list size (" + size() + ")");
    }

    @Override // defpackage.aerv, defpackage.aevh
    public final void f(int i, int i2) {
        k(i);
        k(i2);
        int i3 = this.b;
        this.a.f(i3 + i, i3 + i2);
        this.c -= i2 - i;
    }

    @Override // defpackage.aerv, defpackage.aevh
    public final void g(int i, java.lang.Object[] objArr, int i2) {
        k(i);
        this.a.g(this.b + i, objArr, i2);
    }

    @Override // java.util.List
    public K get(int i) {
        l(i);
        return this.a.get(this.b + i);
    }

    @Override // defpackage.aerv, java.util.List
    public /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int i) {
        return listIterator(i);
    }

    @Override // defpackage.aerv, java.util.List
    public final K remove(int i) {
        l(i);
        this.c--;
        return this.a.remove(this.b + i);
    }

    @Override // defpackage.aerv, java.util.List
    public final K set(int i, K k) {
        l(i);
        return this.a.set(this.b + i, k);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c - this.b;
    }

    @Override // defpackage.aerv, defpackage.aerq, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* bridge */ /* synthetic */ j$.util.Spliterator spliterator() {
        return b();
    }

    @Override // defpackage.aerv, java.util.List
    public /* bridge */ /* synthetic */ java.util.List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.aerv, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(K k) {
        this.a.add(this.c, k);
        this.c++;
        return true;
    }
}
