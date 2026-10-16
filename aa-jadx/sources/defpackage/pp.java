package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pp<K, V> implements java.util.Map.Entry<K, V> {
    final java.lang.Object a;
    public final java.lang.Object b;
    defpackage.pp c;
    defpackage.pp d;

    public pp(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.pp)) {
            return false;
        }
        defpackage.pp ppVar = (defpackage.pp) obj;
        return this.a.equals(ppVar.a) && this.b.equals(ppVar.b);
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return (K) this.a;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return (V) this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new java.lang.UnsupportedOperationException("An entry modification is not supported");
    }

    public final java.lang.String toString() {
        return this.a + "=" + this.b;
    }
}
