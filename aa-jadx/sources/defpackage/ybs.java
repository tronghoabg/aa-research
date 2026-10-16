package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ybs implements java.util.Map.Entry {
    final java.lang.Object a;
    java.lang.Object b;
    final /* synthetic */ defpackage.ybt c;

    public ybs(defpackage.ybt ybtVar, java.lang.Object obj, java.lang.Object obj2) {
        this.c = ybtVar;
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (this.a.equals(entry.getKey()) && this.b.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        java.lang.Object objPut = this.c.put(this.a, obj);
        this.b = obj;
        return objPut;
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(this.a) + "=" + java.lang.String.valueOf(this.b);
    }
}
