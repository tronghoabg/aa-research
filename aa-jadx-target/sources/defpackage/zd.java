package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class zd<K, V> extends defpackage.aba<K, V> implements java.util.Map<K, V>, j$.util.Map<K, V> {
    defpackage.yx a;
    defpackage.yz b;
    defpackage.zb c;

    public zd(defpackage.aba abaVar) {
        super(0);
        i(abaVar);
    }

    public final boolean a(java.util.Collection collection) {
        int i = this.d;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(d(i2))) {
                e(i2);
            }
        }
        return i != this.d;
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
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        defpackage.yx yxVar = this.a;
        if (yxVar != null) {
            return yxVar;
        }
        defpackage.yx yxVar2 = new defpackage.yx(this);
        this.a = yxVar2;
        return yxVar2;
    }

    @Override // java.util.Map
    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        j$.util.Map.-CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final java.util.Set<K> keySet() {
        defpackage.yz yzVar = this.b;
        if (yzVar != null) {
            return yzVar;
        }
        defpackage.yz yzVar2 = new defpackage.yz(this);
        this.b = yzVar2;
        return yzVar2;
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        return j$.util.Map.-CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        h(this.d + map.size());
        for (java.util.Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        j$.util.Map.-CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final java.util.Collection<V> values() {
        defpackage.zb zbVar = this.c;
        if (zbVar != null) {
            return zbVar;
        }
        defpackage.zb zbVar2 = new defpackage.zb(this);
        this.c = zbVar2;
        return zbVar2;
    }

    public zd() {
        super(0);
    }
}
