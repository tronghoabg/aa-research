package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class ybz implements ynj {
    public transient Collection a;
    private transient Set b;

    public Object a(Object obj, Object obj2) {
        Map map = (Map) yrm.J(k(), obj);
        if (map == null) {
            return null;
        }
        return yrm.J(map, obj2);
    }

    public Collection b() {
        throw null;
    }

    @Override // defpackage.ynj
    public final Set c() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        Set setD = d();
        this.b = setD;
        return setD;
    }

    public Set d() {
        throw null;
    }

    public final boolean e() {
        return f() == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ynj) {
            return c().equals(((ynj) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return c().hashCode();
    }

    public final String toString() {
        return k().toString();
    }
}
