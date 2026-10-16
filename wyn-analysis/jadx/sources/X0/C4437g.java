package x0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import u0.Q;
import uf.InterfaceC4291a;

/* renamed from: x0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4437g implements Iterable, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f47593a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public boolean f47594b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f47595c;

    public final boolean a(C4447q key) {
        AbstractC3340k.e(key, "key");
        return this.f47593a.containsKey(key);
    }

    public final Object c(C4447q key) {
        AbstractC3340k.e(key, "key");
        Object obj = this.f47593a.get(key);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Key not present: " + key + " - consider getOrElse or getOrNull");
    }

    public final void d(C4447q key, Object obj) {
        AbstractC3340k.e(key, "key");
        this.f47593a.put(key, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4437g)) {
            return false;
        }
        C4437g c4437g = (C4437g) obj;
        return AbstractC3340k.a(this.f47593a, c4437g.f47593a) && this.f47594b == c4437g.f47594b && this.f47595c == c4437g.f47595c;
    }

    public final int hashCode() {
        return (((this.f47593a.hashCode() * 31) + (this.f47594b ? 1231 : 1237)) * 31) + (this.f47595c ? 1231 : 1237);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f47593a.entrySet().iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f47594b) {
            sb2.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f47595c) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f47593a.entrySet()) {
            C4447q c4447q = (C4447q) entry.getKey();
            Object value = entry.getValue();
            sb2.append(str);
            sb2.append(c4447q.f47643a);
            sb2.append(" : ");
            sb2.append(value);
            str = ", ";
        }
        return Q.j(this) + "{ " + ((Object) sb2) + " }";
    }
}
