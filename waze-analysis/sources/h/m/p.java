package h.m;

import h.g.b.x;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p implements h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f48193a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Comparator f48194b;

    p(h hVar, Comparator comparator) {
        this.f48193a = hVar;
        this.f48194b = comparator;
    }

    @Override // h.m.h
    public final Iterator iterator() {
        h hVar = this.f48193a;
        x.f(hVar, "<this>");
        ArrayList arrayList = new ArrayList();
        x.f(hVar, "<this>");
        x.f(arrayList, "destination");
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        ArrayList arrayList2 = arrayList;
        h.a.i.t(arrayList2, this.f48194b);
        return arrayList2.iterator();
    }
}
