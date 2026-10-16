package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aerl<K> implements defpackage.aess<K> {
    protected final java.lang.Object a;

    public aerl(java.lang.Object obj) {
        this.a = obj;
    }

    @Override // defpackage.aess
    public final int a() {
        return 0;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        if (obj instanceof defpackage.aess) {
            defpackage.aess aessVar = (defpackage.aess) obj;
            return j$.util.Objects.equals(this.a, aessVar.getKey()) && aessVar.a() == 0;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object key = entry.getKey();
        java.lang.Object value = entry.getValue();
        return value != null && (value instanceof java.lang.Integer) && j$.util.Objects.equals(this.a, key) && ((java.lang.Integer) value).intValue() == 0;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return (K) this.a;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ java.lang.Integer getValue() {
        return 0;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ java.lang.Integer setValue(java.lang.Integer num) {
        num.intValue();
        throw new java.lang.UnsupportedOperationException();
    }

    public final java.lang.String toString() {
        return this.a.toString().concat("->0");
    }
}
