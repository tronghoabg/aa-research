package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ekh<K, V> extends java.util.LinkedHashMap<K, V> {
    public static final defpackage.ekh a;
    public boolean b;

    static {
        defpackage.ekh ekhVar = new defpackage.ekh();
        a = ekhVar;
        ekhVar.c();
    }

    private ekh() {
        this.b = true;
    }

    private static int d(java.lang.Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof defpackage.ejs) {
                throw new java.lang.UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        java.nio.charset.Charset charset = defpackage.ejv.a;
        int length = bArr.length;
        int iB = defpackage.ejv.b(length, bArr, length);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    public final defpackage.ekh a() {
        return isEmpty() ? new defpackage.ekh() : new defpackage.ekh(this);
    }

    public final void b() {
        if (!this.b) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final void c() {
        this.b = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        return isEmpty() ? java.util.Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        java.util.Map map = (java.util.Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (java.util.Map.Entry<K, V> entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            V value = entry.getValue();
            java.lang.Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? java.util.Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iD = 0;
        for (java.util.Map.Entry<K, V> entry : entrySet()) {
            iD += d(entry.getValue()) ^ d(entry.getKey());
        }
        return iD;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        b();
        defpackage.ejv.a(k);
        defpackage.ejv.a(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        b();
        for (K k : map.keySet()) {
            defpackage.ejv.a(k);
            defpackage.ejv.a(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(java.lang.Object obj) {
        b();
        return (V) super.remove(obj);
    }

    private ekh(java.util.Map map) {
        super(map);
        this.b = true;
    }
}
