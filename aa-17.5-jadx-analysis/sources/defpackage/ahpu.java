package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
final class ahpu implements Comparable<ahpu>, Map.Entry {
    private final Comparable key;
    final /* synthetic */ ahpx this$0;
    private Object value;

    public ahpu(ahpx ahpxVar, Map.Entry entry) {
        this(ahpxVar, (Comparable) entry.getKey(), entry.getValue());
    }

    @Override // java.lang.Comparable
    public int compareTo(ahpu ahpuVar) {
        return getKey().compareTo(ahpuVar.getKey());
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return equals(this.key, entry.getKey()) && equals(this.value, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Comparable comparable = this.key;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.value;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        this.this$0.checkMutable();
        Object obj2 = this.value;
        this.value = obj;
        return obj2;
    }

    public String toString() {
        String strValueOf = String.valueOf(String.valueOf(this.key));
        String strValueOf2 = String.valueOf(String.valueOf(this.value));
        StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }

    @Override // java.util.Map.Entry
    public Comparable getKey() {
        return this.key;
    }

    public ahpu(ahpx ahpxVar, Comparable comparable, Object obj) {
        this.this$0 = ahpxVar;
        this.key = comparable;
        this.value = obj;
    }

    private boolean equals(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }
}
