package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ainy<K, V> implements java.lang.Iterable<V>, defpackage.afhc {
    protected abstract defpackage.aioa<V> getArrayMap();

    protected abstract defpackage.aipo<K, V> getTypeRegistry();

    public final boolean isEmpty() {
        return getArrayMap().getSize() == 0;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<V> iterator() {
        return getArrayMap().iterator();
    }

    protected final void registerComponent(defpackage.afie<? extends K> afieVar, V v) {
        afieVar.getClass();
        v.getClass();
        java.lang.String qualifiedName = afieVar.getQualifiedName();
        qualifiedName.getClass();
        registerComponent(qualifiedName, v);
    }

    protected abstract void registerComponent(java.lang.String str, V v);
}
