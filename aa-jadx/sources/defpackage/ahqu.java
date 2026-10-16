package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ahqu implements java.lang.Comparable<defpackage.ahqu>, java.util.Map.Entry {
    private final java.lang.Comparable key;
    final /* synthetic */ defpackage.ahqx this$0;
    private java.lang.Object value;

    public ahqu(defpackage.ahqx ahqxVar, java.util.Map.Entry entry) {
        this(ahqxVar, (java.lang.Comparable) entry.getKey(), entry.getValue());
    }

    @Override // java.lang.Comparable
    public int compareTo(defpackage.ahqu ahquVar) {
        return getKey().compareTo(ahquVar.getKey());
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return equals(this.key, entry.getKey()) && equals(this.value, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        java.lang.Comparable comparable = this.key;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        java.lang.Object obj = this.value;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        this.this$0.checkMutable();
        java.lang.Object obj2 = this.value;
        this.value = obj;
        return obj2;
    }

    public java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(java.lang.String.valueOf(this.key));
        java.lang.String strValueOf2 = java.lang.String.valueOf(java.lang.String.valueOf(this.value));
        java.lang.StringBuilder sb = new java.lang.StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }

    @Override // java.util.Map.Entry
    public java.lang.Comparable getKey() {
        return this.key;
    }

    public ahqu(defpackage.ahqx ahqxVar, java.lang.Comparable comparable, java.lang.Object obj) {
        this.this$0 = ahqxVar;
        this.key = comparable;
        this.value = obj;
    }

    private boolean equals(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }
}
