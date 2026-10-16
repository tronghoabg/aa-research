package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class aesk<K> extends defpackage.aesl<K> implements java.io.Serializable {
    private static final long serialVersionUID = -7046029254386353129L;
    protected final defpackage.aeym a;
    protected final int b;
    protected int c;

    public aesk(defpackage.aeym aeymVar, int i, int i2) {
        this.a = aeymVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.aesl, java.util.List
    public final void add(int i, K k) {
        i(i);
        this.a.add(this.b + i, k);
        this.c++;
    }

    @Override // defpackage.aesl, java.util.List
    public final boolean addAll(int i, java.util.Collection<? extends K> collection) {
        i(i);
        this.c += collection.size();
        return this.a.addAll(this.b + i, collection);
    }

    @Override // defpackage.aesl, defpackage.aesf, defpackage.aeyk
    public defpackage.aevs b() {
        defpackage.aeym aeymVar = this.a;
        if (aeymVar instanceof java.util.RandomAccess) {
            return new defpackage.aesg(aeymVar, this.b, this.c);
        }
        return this instanceof java.util.RandomAccess ? new defpackage.aesg(this) : new defpackage.aevy(h(), defpackage.aeao.f(this), 16464);
    }

    @Override // defpackage.aesl
    /* JADX INFO: renamed from: c */
    public defpackage.aeym subList(int i, int i2) {
        i(i);
        i(i2);
        if (i <= i2) {
            return new defpackage.aesk(this, i, i2);
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bz(i2, i, "Start index (", ") is greater than end index (", ")"));
    }

    @Override // defpackage.aesl, defpackage.aeym
    /* JADX INFO: renamed from: d */
    public defpackage.aevi listIterator(int i) {
        i(i);
        defpackage.aeym aeymVar = this.a;
        return aeymVar instanceof java.util.RandomAccess ? new defpackage.aesj(this, i, 0) : new defpackage.aesi(this, aeymVar.listIterator(i + this.b), 0);
    }

    @Override // defpackage.aesl, defpackage.aeym
    public final void e(int i, java.lang.Object[] objArr, int i2, int i3) {
        i(i);
        if (i + i3 <= size()) {
            this.a.e(this.b + i, objArr, i2, i3);
            return;
        }
        throw new java.lang.IndexOutOfBoundsException("End index (" + i + i3 + ") is greater than list size (" + size() + ")");
    }

    @Override // defpackage.aesl, defpackage.aeym
    public final void f(int i, int i2) {
        i(i);
        i(i2);
        int i3 = this.b;
        this.a.f(i3 + i, i3 + i2);
        this.c -= i2 - i;
    }

    @Override // defpackage.aesl, defpackage.aeym
    public final void g(int i, java.lang.Object[] objArr, int i2) {
        i(i);
        this.a.g(this.b + i, objArr, i2);
    }

    @Override // java.util.List
    public K get(int i) {
        j(i);
        return this.a.get(this.b + i);
    }

    @Override // defpackage.aesl, java.util.List
    public /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int i) {
        return listIterator(i);
    }

    @Override // defpackage.aesl, java.util.List
    public final K remove(int i) {
        j(i);
        this.c--;
        return this.a.remove(this.b + i);
    }

    @Override // defpackage.aesl, java.util.List
    public final K set(int i, K k) {
        j(i);
        return this.a.set(this.b + i, k);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c - this.b;
    }

    @Override // defpackage.aesl, defpackage.aesf, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* bridge */ /* synthetic */ j$.util.Spliterator spliterator() {
        return b();
    }

    @Override // defpackage.aesl, java.util.List
    public /* bridge */ /* synthetic */ java.util.List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.aesl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(K k) {
        this.a.add(this.c, k);
        this.c++;
        return true;
    }
}
