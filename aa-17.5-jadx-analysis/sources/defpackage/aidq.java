package defpackage;

/* loaded from: classes3.dex */
final class aidq<K, V> {
    private final afdr<? extends V> computation;
    private final K key;

    public aidq(K k, afdr<? extends V> afdrVar) {
        this.key = k;
        this.computation = afdrVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.key.equals(((aidq) obj).key);
    }

    public int hashCode() {
        return this.key.hashCode();
    }
}
