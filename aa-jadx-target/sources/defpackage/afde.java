package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class afde<E> extends defpackage.afbw<E> implements java.util.Set<E>, java.io.Serializable, defpackage.afhh {
    public static final defpackage.afde a = new defpackage.afde(defpackage.afcy.a);
    public final defpackage.afcy b;

    public afde() {
        this(new defpackage.afcy(8));
    }

    private final void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final java.lang.Object writeReplace() throws java.io.NotSerializableException {
        if (this.b.h) {
            return new afdc(this, 1);
        }
        throw new java.io.NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // defpackage.afbw, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e) {
        return this.b.a(e) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection<? extends E> collection) {
        collection.getClass();
        this.b.f();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // defpackage.afbw
    public final int getSize() {
        return this.b.g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<E> iterator() {
        return new afcx(this.b, 1, (byte[]) null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        return this.b.j(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        this.b.f();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        this.b.f();
        return super.retainAll(collection);
    }

    public afde(defpackage.afcy afcyVar) {
        afcyVar.getClass();
        this.b = afcyVar;
    }
}
