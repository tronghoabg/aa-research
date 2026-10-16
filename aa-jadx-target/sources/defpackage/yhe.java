package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class yhe<K, V> implements java.util.Map<K, V>, java.io.Serializable, j$.util.Map<K, V> {
    public static final java.util.Map.Entry[] b = new java.util.Map.Entry[0];
    private static final long serialVersionUID = 912559;

    public static defpackage.yha h(int i) {
        defpackage.ysr.aL(i, "expectedSize");
        return new defpackage.yha(i);
    }

    public static defpackage.yhe i(java.lang.Iterable iterable) {
        defpackage.yha yhaVar = new defpackage.yha(iterable instanceof java.util.Collection ? ((java.util.Collection) iterable).size() : 4);
        yhaVar.g(iterable);
        return yhaVar.d(true);
    }

    public static defpackage.yhe j(java.util.Map map) {
        if ((map instanceof defpackage.yhe) && !(map instanceof java.util.SortedMap)) {
            defpackage.yhe yheVar = (defpackage.yhe) map;
            if (!yheVar.c()) {
                return yheVar;
            }
        }
        return i(map.entrySet());
    }

    public static defpackage.yhe k(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.ysr.aJ(obj, obj2);
        return defpackage.ync.a(1, new java.lang.Object[]{obj, obj2}, null);
    }

    public static defpackage.yhe l(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        defpackage.ysr.aJ(obj, obj2);
        defpackage.ysr.aJ(obj3, obj4);
        return defpackage.ync.a(2, new java.lang.Object[]{obj, obj2, obj3, obj4}, null);
    }

    public static defpackage.yhe m(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        return defpackage.ync.a(3, new java.lang.Object[]{obj, obj2, obj3, obj4, obj5, obj6}, null);
    }

    public static defpackage.yhe n(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8) {
        return defpackage.ync.a(4, new java.lang.Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}, null);
    }

    public static defpackage.yhe o(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10) {
        return defpackage.ync.a(5, new java.lang.Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10}, null);
    }

    public static defpackage.yhe p(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12) {
        return defpackage.ync.a(6, new java.lang.Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12}, null);
    }

    public static defpackage.yhe q(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14) {
        return defpackage.ync.a(7, new java.lang.Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14}, null);
    }

    @java.lang.SafeVarargs
    public static defpackage.yhe r(java.util.Map.Entry... entryArr) {
        return i(java.util.Arrays.asList(entryArr));
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    public abstract boolean c();

    @Override // java.util.Map
    @java.lang.Deprecated
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object compute(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return j$.util.Map.-CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object computeIfAbsent(java.lang.Object obj, java.util.function.Function function) {
        return j$.util.Map.-CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return j$.util.Map.-CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object obj) {
        return defpackage.ysr.N(this, obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public abstract defpackage.yhx entrySet();

    @Override // java.util.Map
    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        j$.util.Map.-CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public abstract defpackage.yhx keySet();

    @Override // java.util.Map
    /* JADX INFO: renamed from: gc, reason: merged with bridge method [inline-methods] */
    public abstract defpackage.ygm values();

    public defpackage.yot gd() {
        return new ygz(entrySet().iterator());
    }

    @Override // java.util.Map
    public abstract V get(java.lang.Object obj);

    @Override // java.util.Map
    public final java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        V v = get(obj);
        return v != null ? v : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return defpackage.ysr.m(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        return j$.util.Map.-CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final V put(K k, V v) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.-CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final V remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.-CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        j$.util.Map.-CC.$default$replaceAll(this, biFunction);
    }

    public final java.lang.String toString() {
        return defpackage.ysr.K(this);
    }

    public java.lang.Object writeReplace() {
        return new yhd(this);
    }

    @Override // java.util.Map
    public final /* synthetic */ boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return j$.util.Map.-CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map
    public final /* synthetic */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.-CC.$default$remove(this, obj, obj2);
    }
}
