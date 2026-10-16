package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ccn<K, V> extends defpackage.ccl<K, V, K> {
    @Override // java.util.Iterator
    public final K next() {
        int i = this.b;
        this.b = i + 2;
        return (K) this.a[i];
    }
}
