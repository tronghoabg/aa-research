package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tdo<K, V> implements java.util.Map<K, V>, defpackage.afhg, defpackage.afhc {
    public final java.util.Map a;
    public final defpackage.eqp b;
    private final defpackage.afar c;
    private final defpackage.afar d;
    private final defpackage.afar e;
    private final defpackage.eqs f;

    public tdo(java.util.Map map) {
        this.a = map;
        this.c = defpackage.afga.cA(new defpackage.oph(this, 19));
        this.d = defpackage.afga.cA(new defpackage.oph(this, 20));
        this.e = defpackage.afga.cA(new defpackage.tip(this, 1));
    }

    public final java.util.Collection a() {
        return (java.util.Collection) this.d.a();
    }

    public final void b() {
        this.f.m(defpackage.ysr.ax(this.a));
    }

    @Override // java.util.Map
    public final void clear() {
        this.a.clear();
        b();
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        return this.a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        return this.a.containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        return (java.util.Set) this.e.a();
    }

    @Override // java.util.Map
    public final V get(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return (V) this.a.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<K> keySet() {
        return (java.util.Set) this.c.a();
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        k.getClass();
        v.getClass();
        V v2 = (V) this.a.put(k, v);
        b();
        return v2;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        map.getClass();
        this.a.putAll(map);
        b();
    }

    @Override // java.util.Map
    public final V remove(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        V v = (V) this.a.remove(obj);
        if (v != null) {
            b();
        }
        return v;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return this.a.size();
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection<V> values() {
        return a();
    }

    public tdo(java.util.Map map, byte[] bArr) {
        this(map);
        defpackage.eqs eqsVar = new defpackage.eqs(defpackage.ysr.ax(map));
        this.f = eqsVar;
        this.b = eqsVar;
    }
}
