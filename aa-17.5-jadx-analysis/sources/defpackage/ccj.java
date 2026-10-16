package defpackage;

/* loaded from: classes.dex */
public final class ccj<K, V> extends ccf<K, V, V> {
    @Override // java.util.Iterator
    public final V next() {
        int i = this.b;
        this.b = i + 2;
        return (V) this.a[i + 1];
    }
}
