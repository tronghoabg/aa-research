package t9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f45954a;

    /* renamed from: b, reason: collision with root package name */
    public final s8.q f45955b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f45956c;

    /* renamed from: d, reason: collision with root package name */
    public final List f45957d;

    public i(int i5, s8.q qVar, ArrayList arrayList, List list) {
        A6.c.z(!list.isEmpty(), "Cannot create an empty mutation batch", new Object[0]);
        this.f45954a = i5;
        this.f45955b = qVar;
        this.f45956c = arrayList;
        this.f45957d = list;
    }

    public final f a(s9.k kVar, f fVar) {
        s8.q qVar;
        int i5 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f45956c;
            int size = arrayList.size();
            qVar = this.f45955b;
            if (i10 >= size) {
                break;
            }
            h hVar = (h) arrayList.get(i10);
            if (hVar.f45951a.equals(kVar.f45380a)) {
                fVar = hVar.a(kVar, fVar, qVar);
            }
            i10++;
        }
        while (true) {
            List list = this.f45957d;
            if (i5 >= list.size()) {
                return fVar;
            }
            h hVar2 = (h) list.get(i5);
            if (hVar2.f45951a.equals(kVar.f45380a)) {
                fVar = hVar2.a(kVar, fVar, qVar);
            }
            i5++;
        }
    }

    public final HashSet b() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f45957d.iterator();
        while (it.hasNext()) {
            hashSet.add(((h) it.next()).f45951a);
        }
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f45954a == iVar.f45954a && this.f45955b.equals(iVar.f45955b) && this.f45956c.equals(iVar.f45956c) && this.f45957d.equals(iVar.f45957d);
    }

    public final int hashCode() {
        return this.f45957d.hashCode() + ((this.f45956c.hashCode() + ((this.f45955b.hashCode() + (this.f45954a * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MutationBatch(batchId=" + this.f45954a + ", localWriteTime=" + this.f45955b + ", baseMutations=" + this.f45956c + ", mutations=" + this.f45957d + ')';
    }
}
