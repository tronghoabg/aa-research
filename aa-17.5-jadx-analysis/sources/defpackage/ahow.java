package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
final class ahow<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, ahoy> entry;

    private ahow(Map.Entry<K, ahoy> entry) {
        this.entry = entry;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.entry.getKey();
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        ahoy value = this.entry.getValue();
        if (value == null) {
            return null;
        }
        return value.getValue();
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        if (obj instanceof ahpg) {
            return this.entry.getValue().setValue((ahpg) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
