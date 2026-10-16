package j$.util;

import java.util.Map;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class o implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Map.Entry f50281a;

    public o(Map.Entry entry) {
        this.f50281a = (Map.Entry) Objects.requireNonNull(entry);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = this.f50281a;
                Object key = entry2.getKey();
                Object key2 = entry.getKey();
                if (key == null ? key2 == null : key.equals(key2)) {
                    Object value = entry2.getValue();
                    Object value2 = entry.getValue();
                    if (value == null ? value2 == null : value.equals(value2)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f50281a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f50281a.getValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f50281a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return this.f50281a.toString();
    }
}
