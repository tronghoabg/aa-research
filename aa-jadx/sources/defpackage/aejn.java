package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aejn implements java.util.Map.Entry {
    int a;
    final /* synthetic */ defpackage.aejt b;

    public aejn(defpackage.aejt aejtVar, int i) {
        this.b = aejtVar;
        this.a = i;
    }

    public final int a() {
        return this.b.a[this.a];
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        defpackage.aejt aejtVar = this.b;
        return aejtVar.a[this.a] == ((java.lang.Integer) entry.getKey()).intValue() && aejtVar.b[this.a] == entry.getValue();
    }

    @Override // java.util.Map.Entry
    @java.lang.Deprecated
    public final /* bridge */ /* synthetic */ java.lang.Object getKey() {
        return java.lang.Integer.valueOf(this.b.a[this.a]);
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.b.b[this.a];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        defpackage.aejt aejtVar = this.b;
        int[] iArr = aejtVar.a;
        int i = this.a;
        int i2 = iArr[i];
        java.lang.Object obj = aejtVar.b[i];
        return (obj == null ? 0 : java.lang.System.identityHashCode(obj)) ^ i2;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        java.lang.Object[] objArr = this.b.b;
        int i = this.a;
        java.lang.Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final java.lang.String toString() {
        defpackage.aejt aejtVar = this.b;
        int[] iArr = aejtVar.a;
        int i = this.a;
        return iArr[i] + "=>" + java.lang.String.valueOf(aejtVar.b[i]);
    }

    public aejn(defpackage.aejt aejtVar) {
        this.b = aejtVar;
    }
}
