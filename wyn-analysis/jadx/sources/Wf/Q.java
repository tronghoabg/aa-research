package Wf;

import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4291a;

/* loaded from: classes5.dex */
public final class Q implements Map.Entry, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15561a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15562b;

    public Q(Object obj, Object obj2) {
        this.f15561a = obj;
        this.f15562b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q4 = (Q) obj;
        return AbstractC3340k.a(this.f15561a, q4.f15561a) && AbstractC3340k.a(this.f15562b, q4.f15562b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f15561a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f15562b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f15561a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f15562b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.f15561a + ", value=" + this.f15562b + ')';
    }
}
