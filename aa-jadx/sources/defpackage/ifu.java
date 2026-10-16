package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ifu<K, V> extends defpackage.zd<K, V> {
    private int e;

    @Override // defpackage.aba, java.util.Map
    public final void clear() {
        this.e = 0;
        super.clear();
    }

    @Override // defpackage.aba
    public final java.lang.Object e(int i) {
        this.e = 0;
        return super.e(i);
    }

    @Override // defpackage.aba
    public final java.lang.Object f(int i, java.lang.Object obj) {
        this.e = 0;
        return super.f(i, obj);
    }

    @Override // defpackage.aba, java.util.Map
    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode();
        this.e = iHashCode;
        return iHashCode;
    }

    @Override // defpackage.aba
    public final void i(defpackage.aba abaVar) {
        this.e = 0;
        super.i(abaVar);
    }

    @Override // defpackage.aba, java.util.Map
    public final V put(K k, V v) {
        this.e = 0;
        return (V) super.put(k, v);
    }
}
