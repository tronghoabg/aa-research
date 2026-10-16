package s9;

import A7.C0295v;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class i implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final c9.c f45376a;

    /* renamed from: b, reason: collision with root package name */
    public final c9.d f45377b;

    public i(c9.c cVar, c9.d dVar) {
        this.f45376a = cVar;
        this.f45377b = dVar;
    }

    public final i a(h hVar) {
        c9.c cVar = this.f45376a;
        k kVar = (k) cVar.b(hVar);
        return kVar == null ? this : new i(cVar.i(hVar), this.f45377b.c(kVar));
    }

    public final boolean equals(Object obj) {
        C0295v c0295v;
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f45376a.size() != iVar.f45376a.size()) {
            return false;
        }
        Iterator it = this.f45377b.iterator();
        Iterator it2 = iVar.f45377b.iterator();
        do {
            c0295v = (C0295v) it;
            if (!((Iterator) c0295v.f1081b).hasNext()) {
                return true;
            }
        } while (((k) c0295v.next()).equals((k) ((C0295v) it2).next()));
        return false;
    }

    public final int hashCode() {
        Iterator it = this.f45377b.iterator();
        int iHashCode = 0;
        while (true) {
            C0295v c0295v = (C0295v) it;
            if (!((Iterator) c0295v.f1081b).hasNext()) {
                return iHashCode;
            }
            k kVar = (k) c0295v.next();
            iHashCode = kVar.f45384e.hashCode() + ((kVar.f45380a.f45375a.hashCode() + (iHashCode * 31)) * 31);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f45377b.iterator();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = this.f45377b.iterator();
        boolean z2 = true;
        while (true) {
            C0295v c0295v = (C0295v) it;
            if (!((Iterator) c0295v.f1081b).hasNext()) {
                sb2.append("]");
                return sb2.toString();
            }
            k kVar = (k) c0295v.next();
            if (z2) {
                z2 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(kVar);
        }
    }
}
