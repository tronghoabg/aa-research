package defpackage;

/* JADX INFO: loaded from: classes.dex */
abstract class ycx<K, V> implements java.util.Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (j$.util.Objects.equals(getKey(), entry.getKey()) && j$.util.Objects.equals(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public abstract K getKey();

    @Override // java.util.Map.Entry
    public abstract V getValue();

    @Override // java.util.Map.Entry
    public final int hashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(getKey()) + "=" + java.lang.String.valueOf(getValue());
    }
}
