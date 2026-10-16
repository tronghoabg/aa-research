package e.a.i;

import com.google.d.b.an;
import com.google.d.b.z;
import e.a.bn;
import e.a.bo;
import e.a.br;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h extends br {

    /* renamed from: a, reason: collision with root package name */
    private final List f47828a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f47829b;

    /* renamed from: c, reason: collision with root package name */
    private final int f47830c;

    public h(List list, AtomicInteger atomicInteger) {
        an.m(!list.isEmpty(), "empty list");
        this.f47828a = list;
        this.f47829b = atomicInteger;
        Iterator it = list.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((br) it.next()).hashCode();
        }
        this.f47830c = iHashCode;
    }

    @Override // e.a.br
    public final bn a(bo boVar) {
        int andIncrement = this.f47829b.getAndIncrement() & Integer.MAX_VALUE;
        List list = this.f47828a;
        return ((br) list.get(andIncrement % list.size())).a(boVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (hVar == this) {
            return true;
        }
        if (this.f47830c == hVar.f47830c && this.f47829b == hVar.f47829b) {
            List list = this.f47828a;
            int size = list.size();
            List list2 = hVar.f47828a;
            if (size == list2.size() && new HashSet(list).containsAll(list2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f47830c;
    }

    public final String toString() {
        z zVarG = an.G(h.class);
        zVarG.d("subchannelPickers", this.f47828a);
        return zVarG.toString();
    }
}
