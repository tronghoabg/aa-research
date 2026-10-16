package l8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: l8.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3434p {

    /* renamed from: a, reason: collision with root package name */
    public transient Set f40152a;

    /* renamed from: b, reason: collision with root package name */
    public transient Collection f40153b;

    /* renamed from: c, reason: collision with root package name */
    public transient Map f40154c;

    public abstract Map a();

    public boolean b(Object obj) {
        Iterator it = a().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3434p) {
            return a().equals(((AbstractC3434p) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
