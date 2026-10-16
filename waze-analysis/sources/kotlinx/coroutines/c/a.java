package kotlinx.coroutines.c;

import h.g.b.aj;
import h.g.b.x;
import h.m.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    private final List f51785a;

    public a(h.c.b.a.d dVar) {
        x.f(dVar, "topFrame");
        int i2 = d.f51787a;
        x.f(dVar, "topFrame");
        List listJ = k.j(k.g(dVar, new aj() { // from class: kotlinx.coroutines.c.c
            @Override // h.g.b.aj, h.l.p
            public final Object get(Object obj) {
                return ((h.c.b.a.d) obj).getCallerFrame();
            }
        }));
        x.f(listJ, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            StackTraceElement stackTraceElement = ((h.c.b.a.d) it.next()).getStackTraceElement();
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
        }
        ArrayList arrayList2 = arrayList;
        super((StackTraceElement[]) arrayList2.toArray(new StackTraceElement[0]));
        this.f51785a = arrayList2;
    }

    public final boolean a(a aVar) {
        x.f(aVar, "other");
        List list = this.f51785a;
        List list2 = aVar.f51785a;
        return list2.size() <= list.size() && x.n(list2, list.subList(list.size() - list2.size(), list.size()));
    }
}
