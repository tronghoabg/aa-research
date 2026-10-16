package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class hzb implements hyy {
    public final Map b;
    public volatile Map c;

    public hzb(Map map) {
        this.b = DesugarCollections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hzb) {
            return this.b.equals(((hzb) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + String.valueOf(this.b) + "}";
    }
}
