package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aetz<K, V> extends defpackage.aetl<K, V> implements java.io.Serializable, java.lang.Cloneable, j$.util.Map<K, V>, defpackage.aety {
    private static final long serialVersionUID = -7046029254386353129L;

    @Override // defpackage.aety
    public final /* synthetic */ defpackage.aevm b() {
        throw null;
    }

    @Override // defpackage.aetl
    public final java.lang.Object clone() {
        return defpackage.aeua.a;
    }

    @Override // j$.util.Map
    public final /* synthetic */ java.lang.Object compute(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return defpackage.adrs.aL(this, obj, biFunction);
    }

    @Override // j$.util.Map
    public final /* synthetic */ java.lang.Object computeIfAbsent(java.lang.Object obj, java.util.function.Function function) {
        return j$.util.Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // j$.util.Map
    public final /* synthetic */ java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return defpackage.adrs.aM(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return false;
    }

    @Override // defpackage.aety
    /* JADX INFO: renamed from: d */
    public final defpackage.aevm h() {
        return defpackage.aevq.a;
    }

    @Override // java.util.Map
    public final /* synthetic */ java.util.Set entrySet() {
        return defpackage.aevq.a;
    }

    @Override // defpackage.aetl, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof java.util.Map) {
            return ((java.util.Map) obj).isEmpty();
        }
        return false;
    }

    @Override // defpackage.aetl, java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* synthetic */ java.util.Set keySet() {
        return defpackage.aevq.a;
    }

    @Override // j$.util.Map
    public final /* synthetic */ java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        return defpackage.adrs.aN(this, obj, obj2, biFunction);
    }

    @Override // defpackage.aety, java.util.Map
    public final /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        return defpackage.adrq.D();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // j$.util.Map
    public final /* synthetic */ java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        return defpackage.adrs.aO(this, obj, obj2);
    }

    @Override // j$.util.Map
    public final /* synthetic */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        return defpackage.adrs.aQ(this, obj, obj2);
    }

    @Override // j$.util.Map
    public final /* synthetic */ java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        return defpackage.adrs.aP(this, obj, obj2);
    }

    @Override // j$.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        j$.util.Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // defpackage.aetl
    public final java.lang.String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* synthetic */ java.util.Collection values() {
        return defpackage.aevq.a;
    }

    @Override // defpackage.aety, java.util.Map
    public final /* synthetic */ java.lang.Object remove(java.lang.Object obj) {
        return defpackage.adrq.E();
    }

    @Override // j$.util.Map
    public final /* synthetic */ boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return defpackage.adrs.aR(this, obj, obj2, obj3);
    }

    @Override // j$.util.Map
    public final void forEach(java.util.function.BiConsumer biConsumer) {
    }

    @Override // j$.util.Map
    public final java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return obj2;
    }
}
