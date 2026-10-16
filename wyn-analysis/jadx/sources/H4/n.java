package h4;

import ef.C2527k;
import ff.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4291a;

/* loaded from: classes.dex */
public final class n implements Iterable, InterfaceC4291a {

    /* renamed from: b, reason: collision with root package name */
    public static final n f36131b = new n(w.f35433a);

    /* renamed from: a, reason: collision with root package name */
    public final Map f36132a;

    public n(Map map) {
        this.f36132a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return AbstractC3340k.a(this.f36132a, ((n) obj).f36132a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f36132a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.f36132a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            arrayList.add(new C2527k(str, null));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.f36132a + ')';
    }
}
