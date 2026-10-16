package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class afbu<E> extends java.util.AbstractList<E> implements java.util.List<E>, defpackage.afhd {
    protected afbu() {
    }

    public abstract int b();

    public abstract java.lang.Object d(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i) {
        return (E) d(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return b();
    }
}
