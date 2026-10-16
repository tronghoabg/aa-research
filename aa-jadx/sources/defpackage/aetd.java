package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aetd implements java.util.Map.Entry, defpackage.aess {
    public int a;
    final /* synthetic */ defpackage.aetj b;

    public aetd(defpackage.aetj aetjVar, int i) {
        this.b = aetjVar;
        this.a = i;
    }

    @Override // defpackage.aess
    public final int a() {
        return this.b.b[this.a];
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        defpackage.aetj aetjVar = this.b;
        return j$.util.Objects.equals(aetjVar.a[this.a], entry.getKey()) && aetjVar.b[this.a] == ((java.lang.Integer) entry.getValue()).intValue();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.b.a[this.a];
    }

    @Override // java.util.Map.Entry
    @java.lang.Deprecated
    public final /* bridge */ /* synthetic */ java.lang.Integer getValue() {
        return java.lang.Integer.valueOf(this.b.b[this.a]);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        defpackage.aetj aetjVar = this.b;
        java.lang.Object obj = aetjVar.a[this.a];
        return aetjVar.b[this.a] ^ (obj == null ? 0 : obj.hashCode());
    }

    @Override // java.util.Map.Entry
    @java.lang.Deprecated
    public final /* bridge */ /* synthetic */ java.lang.Integer setValue(java.lang.Integer num) {
        int iIntValue = num.intValue();
        int[] iArr = this.b.b;
        int i = this.a;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return java.lang.Integer.valueOf(i2);
    }

    public final java.lang.String toString() {
        defpackage.aetj aetjVar = this.b;
        return java.lang.String.valueOf(aetjVar.a[this.a]) + "=>" + aetjVar.b[this.a];
    }

    public aetd(defpackage.aetj aetjVar) {
        this.b = aetjVar;
    }
}
