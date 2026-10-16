package h9;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f36228a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f36229b;

    public d(String str, Map map) {
        this.f36228a = str;
        this.f36229b = map;
    }

    public static c a(String str) {
        c cVar = new c();
        cVar.f36226a = null;
        cVar.f36227b = str;
        return cVar;
    }

    public static d c(String str) {
        return new d(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f36229b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f36228a.equals(dVar.f36228a) && this.f36229b.equals(dVar.f36229b);
    }

    public final int hashCode() {
        return this.f36229b.hashCode() + (this.f36228a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f36228a + ", properties=" + this.f36229b.values() + "}";
    }
}
