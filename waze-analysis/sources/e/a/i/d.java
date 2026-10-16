package e.a.i;

import com.google.d.b.an;
import e.a.ai;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    final Collection f47817a;

    /* renamed from: b, reason: collision with root package name */
    final int f47818b;

    public d(ai aiVar) {
        an.C(aiVar, "eag");
        if (aiVar.b().size() < 10) {
            this.f47817a = aiVar.b();
        } else {
            this.f47817a = new HashSet(aiVar.b());
        }
        Iterator it = aiVar.b().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((SocketAddress) it.next()).hashCode();
        }
        this.f47818b = iHashCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (dVar.f47818b == this.f47818b) {
            Collection collection = dVar.f47817a;
            int size = collection.size();
            Collection<?> collection2 = this.f47817a;
            if (size == collection2.size()) {
                return collection.containsAll(collection2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f47818b;
    }

    public final String toString() {
        return this.f47817a.toString();
    }
}
