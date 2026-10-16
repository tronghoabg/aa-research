package defpackage;

import java.lang.ref.SoftReference;

/* loaded from: classes3.dex */
final class afjd<V> extends afiv<V> {
    private volatile afje<V> classValue;

    public afjd(afec<? super Class<?>, ? extends V> afecVar) {
        afecVar.getClass();
        this.classValue = new afje<>(afecVar);
    }

    @Override // defpackage.afiv
    public void clear() {
        this.classValue = this.classValue.createNewCopy();
    }

    @Override // defpackage.afiv
    public V get(Class<?> cls) {
        cls.getClass();
        afje<V> afjeVar = this.classValue;
        V v = (V) ((SoftReference) afjeVar.get(cls)).get();
        if (v != null) {
            return v;
        }
        afjeVar.remove(cls);
        V v2 = (V) ((SoftReference) afjeVar.get(cls)).get();
        return v2 != null ? v2 : afjeVar.compute.invoke(cls);
    }
}
