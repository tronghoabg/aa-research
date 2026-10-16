package vd;

import A7.C0237b0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import md.K;
import md.M;
import od.C3709n1;

/* loaded from: classes5.dex */
public final class u extends M {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f47224a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f47225b;

    /* renamed from: c, reason: collision with root package name */
    public final int f47226c;

    public u(ArrayList arrayList, AtomicInteger atomicInteger) {
        Fe.e.p("empty list", !arrayList.isEmpty());
        this.f47224a = arrayList;
        Fe.e.t(atomicInteger, "index");
        this.f47225b = atomicInteger;
        Iterator it = arrayList.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((M) it.next()).hashCode();
        }
        this.f47226c = iHashCode;
    }

    @Override // md.M
    public final K a(C3709n1 c3709n1) {
        int andIncrement = this.f47225b.getAndIncrement() & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        ArrayList arrayList = this.f47224a;
        return ((M) arrayList.get(andIncrement % arrayList.size())).a(c3709n1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (uVar == this) {
            return true;
        }
        if (this.f47226c != uVar.f47226c || this.f47225b != uVar.f47225b) {
            return false;
        }
        ArrayList arrayList = this.f47224a;
        int size = arrayList.size();
        ArrayList arrayList2 = uVar.f47224a;
        return size == arrayList2.size() && new HashSet(arrayList).containsAll(arrayList2);
    }

    public final int hashCode() {
        return this.f47226c;
    }

    public final String toString() {
        C0237b0 c0237b0 = new C0237b0(u.class.getSimpleName());
        c0237b0.f(this.f47224a, "subchannelPickers");
        return c0237b0.toString();
    }
}
