package defpackage;

import j$.util.Objects;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aeql<K> implements aers<K> {
    protected final Object a;

    public aeql(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.aers
    public final int a() {
        return 0;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        if (obj instanceof aers) {
            aers aersVar = (aers) obj;
            return Objects.equals(this.a, aersVar.getKey()) && aersVar.a() == 0;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && (value instanceof Integer) && Objects.equals(this.a, key) && ((Integer) value).intValue() == 0;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return (K) this.a;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Integer getValue() {
        return 0;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Integer setValue(Integer num) {
        num.intValue();
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return this.a.toString().concat("->0");
    }
}
