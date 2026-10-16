package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class afbw<E> extends java.util.AbstractSet<E> implements java.util.Set<E>, defpackage.afhh {
    protected afbw() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean add(E e);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
