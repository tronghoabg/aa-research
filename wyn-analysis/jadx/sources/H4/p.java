package h4;

import ff.w;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final p f36140b = new p(w.f35433a);

    /* renamed from: a, reason: collision with root package name */
    public final Map f36141a;

    public p(Map map) {
        this.f36141a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return AbstractC3340k.a(this.f36141a, ((p) obj).f36141a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f36141a.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.f36141a + ')';
    }
}
