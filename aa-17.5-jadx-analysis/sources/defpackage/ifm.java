package defpackage;

/* loaded from: classes2.dex */
public final class ifm<K, V> extends yw<K, V> {
    private int e;

    @Override // defpackage.aat, java.util.Map
    public final void clear() {
        this.e = 0;
        super.clear();
    }

    @Override // defpackage.aat
    public final Object e(int i) {
        this.e = 0;
        return super.e(i);
    }

    @Override // defpackage.aat
    public final Object f(int i, Object obj) {
        this.e = 0;
        return super.f(i, obj);
    }

    @Override // defpackage.aat, java.util.Map
    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode();
        this.e = iHashCode;
        return iHashCode;
    }

    @Override // defpackage.aat
    public final void i(aat aatVar) {
        this.e = 0;
        super.i(aatVar);
    }

    @Override // defpackage.aat, java.util.Map
    public final V put(K k, V v) {
        this.e = 0;
        return (V) super.put(k, v);
    }
}
