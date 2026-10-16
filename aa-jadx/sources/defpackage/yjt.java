package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yjt<F, T> extends java.util.AbstractSequentialList<T> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final java.util.List a;
    final defpackage.xyd b;

    public yjt(java.util.List list, defpackage.xyd xydVar) {
        list.getClass();
        this.a = list;
        this.b = xydVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final java.util.ListIterator<T> listIterator(int i) {
        return new defpackage.yjs(this, this.a.listIterator(i));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        this.a.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
