package Nd;

import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4294d;

/* loaded from: classes5.dex */
public final class f implements Map.Entry, InterfaceC4294d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8664a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8665b;

    public f(Object obj, Object obj2) {
        this.f8664a = obj;
        this.f8665b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof Map.Entry)) {
            Map.Entry entry = (Map.Entry) obj;
            if (AbstractC3340k.a(entry.getKey(), this.f8664a) && AbstractC3340k.a(entry.getValue(), this.f8665b)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f8664a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f8665b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f8664a;
        AbstractC3340k.b(obj);
        int iHashCode = obj.hashCode() + 527;
        Object obj2 = this.f8665b;
        AbstractC3340k.b(obj2);
        return obj2.hashCode() + iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f8665b = obj;
        return obj;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f8664a);
        sb2.append('=');
        sb2.append(this.f8665b);
        return sb2.toString();
    }
}
