package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class afcq<E extends java.util.Map.Entry<? extends K, ? extends V>, K, V> extends defpackage.afbw<E> {
    public abstract boolean a(java.util.Map.Entry entry);

    public /* bridge */ boolean b(java.util.Map.Entry entry) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        entry.getClass();
        return a(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            return b((java.util.Map.Entry) obj);
        }
        return false;
    }
}
