package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aewn implements java.util.Map.Entry {
    int a;
    final /* synthetic */ defpackage.aewt b;

    public aewn(defpackage.aewt aewtVar, int i) {
        this.b = aewtVar;
        this.a = i;
    }

    public final int a() {
        return this.b.b[this.a];
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        defpackage.aewt aewtVar = this.b;
        return aewtVar.a[this.a] == entry.getKey() && aewtVar.b[this.a] == ((java.lang.Integer) entry.getValue()).intValue();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.b.a[this.a];
    }

    @Override // java.util.Map.Entry
    @java.lang.Deprecated
    public final /* bridge */ /* synthetic */ java.lang.Object getValue() {
        return java.lang.Integer.valueOf(this.b.b[this.a]);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        defpackage.aewt aewtVar = this.b;
        return aewtVar.b[this.a] ^ java.lang.System.identityHashCode(aewtVar.a[this.a]);
    }

    @Override // java.util.Map.Entry
    @java.lang.Deprecated
    public final /* bridge */ /* synthetic */ java.lang.Object setValue(java.lang.Object obj) {
        int iIntValue = ((java.lang.Integer) obj).intValue();
        int[] iArr = this.b.b;
        int i = this.a;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return java.lang.Integer.valueOf(i2);
    }

    public final java.lang.String toString() {
        defpackage.aewt aewtVar = this.b;
        return java.lang.String.valueOf(aewtVar.a[this.a]) + "=>" + aewtVar.b[this.a];
    }

    public aewn(defpackage.aewt aewtVar) {
        this.b = aewtVar;
    }
}
