package kotlinx.b.c;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class z implements bo {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.p f51102a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f51103b;

    public z(h.g.a.p pVar) {
        h.g.b.x.f(pVar, "compute");
        this.f51102a = pVar;
        this.f51103b = new ConcurrentHashMap();
    }

    @Override // kotlinx.b.c.bo
    public final Object a(h.l.c cVar, List list) {
        Object objA;
        Object objPutIfAbsent;
        h.g.b.x.f(cVar, "key");
        h.g.b.x.f(list, "types");
        ConcurrentHashMap concurrentHashMap = this.f51103b;
        Class clsW = h.g.b.o.w(cVar);
        Object lVar = concurrentHashMap.get(clsW);
        if (lVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsW, (lVar = new l()))) != null) {
            lVar = objPutIfAbsent;
        }
        l lVar2 = (l) lVar;
        List list2 = list;
        ArrayList arrayList = new ArrayList(h.a.i.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new at((h.l.s) it.next()));
        }
        ArrayList arrayList2 = arrayList;
        ConcurrentHashMap concurrentHashMapA = l.a(lVar2);
        Object objD = concurrentHashMapA.get(arrayList2);
        if (objD == null) {
            try {
                objA = (kotlinx.b.b) this.f51102a.invoke(cVar, list);
            } catch (Throwable th) {
                objA = e.b.c.a(th);
            }
            objD = h.m.d(objA);
            Object objPutIfAbsent2 = concurrentHashMapA.putIfAbsent(arrayList2, objD);
            if (objPutIfAbsent2 != null) {
                objD = objPutIfAbsent2;
            }
        }
        h.g.b.x.e(objD, "getOrPut(...)");
        return ((h.m) objD).b();
    }
}
