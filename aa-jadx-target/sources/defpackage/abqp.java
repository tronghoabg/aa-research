package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class abqp implements java.util.Map.Entry, java.lang.Comparable {
    public java.lang.Object a;
    final /* synthetic */ defpackage.abqs b;
    public final defpackage.abow c;

    public abqp(defpackage.abqs abqsVar, defpackage.abow abowVar, java.lang.Object obj) {
        this.b = abqsVar;
        this.c = abowVar;
        this.a = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return this.c.compareTo(((defpackage.abqp) obj).c);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return defpackage.a.an(this.c, entry.getKey()) && defpackage.a.an(this.a, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ java.lang.Object getKey() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int iHashCode = this.c.hashCode();
        java.lang.Object obj = this.a;
        return (obj == null ? 0 : obj.hashCode()) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        this.b.b();
        java.lang.Object obj2 = this.a;
        this.a = obj;
        return obj2;
    }

    public final java.lang.String toString() {
        return this.c.toString() + "=" + java.lang.String.valueOf(this.a);
    }
}
