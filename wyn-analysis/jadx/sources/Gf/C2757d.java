package gf;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4294d;

/* renamed from: gf.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2757d implements Map.Entry, InterfaceC4294d {

    /* renamed from: a, reason: collision with root package name */
    public final C2759f f35887a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35888b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35889c;

    public C2757d(C2759f map, int i5) {
        AbstractC3340k.e(map, "map");
        this.f35887a = map;
        this.f35888b = i5;
        this.f35889c = map.f35902h;
    }

    public final void a() {
        if (this.f35887a.f35902h != this.f35889c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return AbstractC3340k.a(entry.getKey(), getKey()) && AbstractC3340k.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f35887a.f35895a[this.f35888b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f35887a.f35896b;
        AbstractC3340k.b(objArr);
        return objArr[this.f35888b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        C2759f c2759f = this.f35887a;
        c2759f.d();
        Object[] objArr = c2759f.f35896b;
        if (objArr == null) {
            int length = c2759f.f35895a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            c2759f.f35896b = objArr;
        }
        int i5 = this.f35888b;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
