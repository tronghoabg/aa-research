package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
class ycc extends defpackage.ylw {
    final transient java.util.Map a;
    final /* synthetic */ defpackage.ycs b;

    public ycc(defpackage.ycs ycsVar, java.util.Map map) {
        this.b = ycsVar;
        this.a = map;
    }

    final java.util.Map.Entry a(java.util.Map.Entry entry) {
        java.lang.Object key = entry.getKey();
        return new java.util.AbstractMap.SimpleImmutableEntry(key, this.b.e(key, (java.util.Collection) entry.getValue()));
    }

    @Override // defpackage.ylw
    public final java.util.Set b() {
        return new yca(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        java.util.Map map = this.a;
        defpackage.ycs ycsVar = this.b;
        if (map == ycsVar.a) {
            ycsVar.q();
        } else {
            defpackage.ysr.ac(new ycb(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        java.util.Map map = this.a;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        return this == obj || this.a.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        java.lang.Object obj2;
        java.util.Map map = this.a;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            obj2 = null;
        }
        java.util.Collection collection = (java.util.Collection) obj2;
        if (collection == null) {
            return null;
        }
        return this.b.e(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ylw, java.util.AbstractMap, java.util.Map
    public java.util.Set keySet() {
        return this.b.x();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object remove(java.lang.Object obj) {
        java.util.Collection collection = (java.util.Collection) this.a.remove(obj);
        if (collection == null) {
            return null;
        }
        defpackage.ycs ycsVar = this.b;
        java.util.Collection collectionA = ycsVar.a();
        collectionA.addAll(collection);
        ycsVar.b -= collection.size();
        collection.clear();
        return collectionA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractMap
    public final java.lang.String toString() {
        return this.a.toString();
    }
}
