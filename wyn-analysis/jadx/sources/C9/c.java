package c9;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class c implements Iterable {
    public abstract boolean a(Object obj);

    public abstract Object b(s9.h hVar);

    public abstract Comparator c();

    public abstract Object d();

    public abstract Object e();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!c().equals(cVar.c()) || size() != cVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = cVar.iterator();
        while (it.hasNext()) {
            if (!((Map.Entry) it.next()).equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract int f(s9.k kVar);

    public abstract c g(Object obj, Object obj2);

    public abstract Iterator h(Object obj);

    public final int hashCode() {
        int iHashCode = c().hashCode();
        Iterator it = iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    public abstract c i(Object obj);

    public abstract boolean isEmpty();

    public abstract int size();

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        Iterator it = iterator();
        boolean z2 = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (z2) {
                z2 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append("(");
            sb2.append(entry.getKey());
            sb2.append("=>");
            sb2.append(entry.getValue());
            sb2.append(")");
        }
        sb2.append("};");
        return sb2.toString();
    }
}
