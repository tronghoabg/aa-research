package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
final class aboj<K> implements Map.Entry<K, Object> {
    public final Map.Entry a;

    public aboj(Map.Entry entry) {
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return (K) this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        abol abolVar = (abol) this.a.getValue();
        if (abolVar == null) {
            return null;
        }
        return abolVar.b();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof abow)) {
            throw new IllegalArgumentException("Lazy field only supports MessageLite values.");
        }
        Map.Entry entry = this.a;
        abow abowVar = ((abol) entry.getValue()).b;
        entry.setValue(new abol((abow) obj));
        return abowVar;
    }
}
