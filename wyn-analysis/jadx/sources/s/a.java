package S;

import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4291a;

/* loaded from: classes.dex */
public class a implements Map.Entry, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10795a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10796b;

    public a(Object obj, Object obj2) {
        this.f10795a = obj;
        this.f10796b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && AbstractC3340k.a(entry.getKey(), this.f10795a) && AbstractC3340k.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f10795a;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f10796b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f10795a;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Object value = getValue();
        return (value != null ? value.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f10795a);
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
