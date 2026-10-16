package kotlinx.b.c;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class u implements bo {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.p f51097a;

    /* renamed from: b, reason: collision with root package name */
    private final v f51098b;

    public u(h.g.a.p pVar) {
        h.g.b.x.f(pVar, "compute");
        this.f51097a = pVar;
        this.f51098b = new v();
    }

    @Override // kotlinx.b.c.bo
    public final Object a(h.l.c cVar, List list) {
        Object objA;
        h.g.b.x.f(cVar, "key");
        h.g.b.x.f(list, "types");
        Object obj = this.f51098b.get(h.g.b.o.w(cVar));
        h.g.b.x.e(obj, "get(...)");
        bg bgVar = (bg) obj;
        Object objA2 = bgVar.f50991a.get();
        if (objA2 == null) {
            objA2 = bgVar.a(new t(0));
        }
        l lVar = (l) objA2;
        List list2 = list;
        ArrayList arrayList = new ArrayList(h.a.i.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new at((h.l.s) it.next()));
        }
        ArrayList arrayList2 = arrayList;
        ConcurrentHashMap concurrentHashMapA = l.a(lVar);
        Object objD = concurrentHashMapA.get(arrayList2);
        if (objD == null) {
            try {
                objA = (kotlinx.b.b) this.f51097a.invoke(cVar, list);
            } catch (Throwable th) {
                objA = e.b.c.a(th);
            }
            objD = h.m.d(objA);
            Object objPutIfAbsent = concurrentHashMapA.putIfAbsent(arrayList2, objD);
            if (objPutIfAbsent != null) {
                objD = objPutIfAbsent;
            }
        }
        h.g.b.x.e(objD, "getOrPut(...)");
        return ((h.m) objD).b();
    }
}
