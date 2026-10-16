package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ahpw<K> implements java.util.Map.Entry<K, java.lang.Object> {
    private java.util.Map.Entry<K, defpackage.ahpy> entry;

    private ahpw(java.util.Map.Entry<K, defpackage.ahpy> entry) {
        this.entry = entry;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.entry.getKey();
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        defpackage.ahpy value = this.entry.getValue();
        if (value == null) {
            return null;
        }
        return value.getValue();
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        if (obj instanceof defpackage.ahqg) {
            return this.entry.getValue().setValue((defpackage.ahqg) obj);
        }
        throw new java.lang.IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
