package defpackage;

import java.net.SocketAddress;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class aedt {
    final Collection a;
    final int b;

    public aedt(adjv adjvVar) {
        adjvVar.getClass();
        if (adjvVar.e.size() < 10) {
            this.a = adjvVar.e;
        } else {
            this.a = new HashSet(adjvVar.e);
        }
        Iterator it = adjvVar.e.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((SocketAddress) it.next()).hashCode();
        }
        this.b = iHashCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aedt)) {
            return false;
        }
        aedt aedtVar = (aedt) obj;
        if (aedtVar.b == this.b) {
            Collection collection = aedtVar.a;
            int size = collection.size();
            Collection<?> collection2 = this.a;
            if (size == collection2.size()) {
                return collection.containsAll(collection2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString();
    }
}
