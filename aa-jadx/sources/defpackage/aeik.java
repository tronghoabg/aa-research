package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aeik<V> extends defpackage.aehv<V> implements java.io.Serializable, java.lang.Cloneable, j$.util.Map<java.lang.Integer, V>, defpackage.aeij {
    private static final long serialVersionUID = -7046029254386353129L;

    @Override // defpackage.aehv
    public final java.lang.Object clone() {
        return defpackage.aeil.a;
    }

    @Override // j$.util.Map
    public final /* synthetic */ java.lang.Object compute(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return j$.util.Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // j$.util.Map
    public final /* synthetic */ java.lang.Object computeIfAbsent(java.lang.Object obj, java.util.function.Function function) {
        return j$.util.Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // j$.util.Map
    public final /* synthetic */ java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return j$.util.Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // defpackage.aehe, defpackage.aefe
    public final /* synthetic */ boolean containsKey(java.lang.Object obj) {
        return defpackage.aeao.v(this, obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return false;
    }

    @Override // defpackage.aeij
    /* JADX INFO: renamed from: e */
    public final defpackage.aeuv values() {
        throw null;
    }

    @Override // java.util.Map
    public final /* synthetic */ java.util.Set entrySet() {
        return defpackage.aevq.a;
    }

    @Override // defpackage.aehv, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof java.util.Map) {
            return ((java.util.Map) obj).isEmpty();
        }
        return false;
    }

    @Override // defpackage.aeij
    public final /* synthetic */ defpackage.aevm f() {
        throw null;
    }

    @Override // defpackage.aeij
    public final /* synthetic */ java.lang.Object g(java.lang.Integer num, java.lang.Object obj) {
        return defpackage.aeao.t(this, num, obj);
    }

    @Override // defpackage.aehe, defpackage.aefe
    public final /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return defpackage.aeao.s(this, obj);
    }

    @Override // defpackage.aehv, java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* synthetic */ java.util.Set<java.lang.Integer> keySet() {
        return defpackage.aelj.a;
    }

    @Override // defpackage.aeij
    /* JADX INFO: renamed from: l */
    public final defpackage.aevm t() {
        return defpackage.aevq.a;
    }

    @Override // j$.util.Map
    public final /* synthetic */ java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        return j$.util.Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Integer num, java.lang.Object obj) {
        return g(num, obj);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends java.lang.Integer, ? extends V> map) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // j$.util.Map
    public final /* synthetic */ java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // j$.util.Map
    public final /* synthetic */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // j$.util.Map
    public final /* synthetic */ java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // j$.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        j$.util.Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // defpackage.aehv
    public final java.lang.String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* synthetic */ java.util.Collection values() {
        return defpackage.aevq.a;
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object remove(java.lang.Object obj) {
        return defpackage.aeao.u(this, obj);
    }

    @Override // j$.util.Map
    public final /* synthetic */ boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return j$.util.Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // j$.util.Map
    public final void forEach(java.util.function.BiConsumer biConsumer) {
    }

    @Override // j$.util.Map
    @java.lang.Deprecated
    public final java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return obj2;
    }
}
