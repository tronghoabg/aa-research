package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class zdv<K, V> extends defpackage.yfi<java.util.Map.Entry<K, V>> {
    final java.util.Collection a;

    public zdv(java.util.Collection collection) {
        this.a = collection;
    }

    @Override // defpackage.yfi
    protected final java.util.Collection a() {
        return this.a;
    }

    @Override // defpackage.yfr
    protected final /* synthetic */ java.lang.Object d() {
        return this.a;
    }

    @Override // defpackage.yfi, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
        return defpackage.ysr.ab(this.a.iterator(), new defpackage.yme(3));
    }

    @Override // defpackage.yfi, java.util.Collection
    public final java.lang.Object[] toArray() {
        return f();
    }

    @Override // defpackage.yfi, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) defpackage.ysr.z(this, tArr);
    }
}
