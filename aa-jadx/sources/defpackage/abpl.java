package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class abpl<K> implements java.util.Map.Entry<K, java.lang.Object> {
    public final java.util.Map.Entry a;

    public abpl(java.util.Map.Entry entry) {
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return (K) this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        defpackage.abpn abpnVar = (defpackage.abpn) this.a.getValue();
        if (abpnVar == null) {
            return null;
        }
        return abpnVar.b();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        if (!(obj instanceof defpackage.abpy)) {
            throw new java.lang.IllegalArgumentException("Lazy field only supports MessageLite values.");
        }
        java.util.Map.Entry entry = this.a;
        defpackage.abpy abpyVar = ((defpackage.abpn) entry.getValue()).b;
        entry.setValue(new defpackage.abpn((defpackage.abpy) obj));
        return abpyVar;
    }
}
