package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aieq<K, V> {
    private final defpackage.afer<? extends V> computation;
    private final K key;

    public aieq(K k, defpackage.afer<? extends V> aferVar) {
        this.key = k;
        this.computation = aferVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.key.equals(((defpackage.aieq) obj).key);
    }

    public int hashCode() {
        return this.key.hashCode();
    }
}
