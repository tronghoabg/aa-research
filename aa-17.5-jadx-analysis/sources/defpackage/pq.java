package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class pq<K, V> implements Iterable<Map.Entry<K, V>> {
    pm a;
    private pm c;
    public final WeakHashMap b = new WeakHashMap();
    private int d = 0;

    protected final pm a(Object obj) {
        pm pmVar = this.a;
        while (pmVar != null && !pmVar.a.equals(obj)) {
            pmVar = pmVar.c;
        }
        return pmVar;
    }

    public final Object b(Object obj, Object obj2) {
        pm pmVarA = a(obj);
        if (pmVarA != null) {
            return pmVarA.b;
        }
        pm pmVar = new pm(obj, obj2);
        this.d++;
        pm pmVar2 = this.c;
        if (pmVar2 == null) {
            this.a = pmVar;
        } else {
            pmVar2.c = pmVar;
            pmVar.d = pmVar2;
        }
        this.c = pmVar;
        return null;
    }

    public final Object c(Object obj) {
        pm pmVarA = a(obj);
        if (pmVarA == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.b;
        if (!weakHashMap.isEmpty()) {
            Iterator<K> it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((pp) it.next()).b(pmVarA);
            }
        }
        pm pmVar = pmVarA.d;
        pm pmVar2 = pmVarA.c;
        if (pmVar != null) {
            pmVar.c = pmVar2;
        } else {
            this.a = pmVar2;
        }
        pm pmVar3 = pmVarA.c;
        if (pmVar3 != null) {
            pmVar3.d = pmVar;
        } else {
            this.c = pmVar;
        }
        pmVarA.c = null;
        pmVarA.d = null;
        return pmVarA.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pq)) {
            return false;
        }
        pq pqVar = (pq) obj;
        if (this.d != pqVar.d) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = pqVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if (next != null) {
                if (next != null || next.equals(next2)) {
                }
            } else if (next2 == null) {
                next2 = null;
                if (next != null) {
                }
            }
            return false;
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        po poVar = new po(this.a, this.c);
        this.b.put(poVar, false);
        return poVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
