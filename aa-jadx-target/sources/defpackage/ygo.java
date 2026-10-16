package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ygo<K extends java.lang.Enum<K>, V> extends defpackage.yhc<K, V> {
    private final transient java.util.EnumMap a;

    public ygo(java.util.EnumMap enumMap) {
        this.a = enumMap;
        if (enumMap.isEmpty()) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static defpackage.yhe a(java.util.EnumMap enumMap) {
        int size = enumMap.size();
        if (size == 0) {
            return defpackage.ync.a;
        }
        if (size != 1) {
            return new defpackage.ygo(enumMap);
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) defpackage.ysr.Y(enumMap.entrySet().iterator());
        return defpackage.yhe.k((java.lang.Enum) entry.getKey(), entry.getValue());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use EnumSerializedForm");
    }

    @Override // defpackage.yhe
    public final boolean c() {
        return false;
    }

    @Override // defpackage.yhe, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.yhc
    public final defpackage.yot e() {
        return new defpackage.yln(this.a.entrySet().iterator());
    }

    @Override // defpackage.yhe, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ygo) {
            obj = ((defpackage.ygo) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // defpackage.yhe
    public final defpackage.yot gd() {
        return defpackage.ysr.X(this.a.keySet().iterator());
    }

    @Override // defpackage.yhe, java.util.Map
    public final V get(java.lang.Object obj) {
        return (V) this.a.get(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.yhc, defpackage.yhe
    public java.lang.Object writeReplace() {
        return new ygn(this.a);
    }
}
