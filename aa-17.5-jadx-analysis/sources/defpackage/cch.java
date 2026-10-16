package defpackage;

/* loaded from: classes.dex */
public final class cch<K, V> extends ccf<K, V, K> {
    @Override // java.util.Iterator
    public final K next() {
        int i = this.b;
        this.b = i + 2;
        return (K) this.a[i];
    }
}
