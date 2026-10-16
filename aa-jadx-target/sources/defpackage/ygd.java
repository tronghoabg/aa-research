package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class ygd<K, V, T> extends java.util.AbstractSet<T> {
    final defpackage.yge b;

    public ygd(defpackage.yge ygeVar) {
        this.b = ygeVar;
    }

    public abstract java.lang.Object a(int i);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<T> iterator() {
        return new defpackage.ygc(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b.c;
    }
}
