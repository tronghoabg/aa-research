package com.waze.an.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ac implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    private final List f14543a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f14544b;

    public ac(List list) {
        h.g.b.x.f(list, "insightSources");
        this.f14543a = list;
        List list2 = list;
        ArrayList arrayList = new ArrayList(h.a.i.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlinx.coroutines.b.ai.L(((ad) it.next()).a(), new y(null)));
        }
        this.f14544b = new ab((kotlinx.coroutines.b.k[]) h.a.i.ao(arrayList).toArray(new kotlinx.coroutines.b.k[0]));
    }

    public final kotlinx.coroutines.b.k a() {
        return this.f14544b;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.f14543a.iterator();
        while (it.hasNext()) {
            ((ad) it.next()).close();
        }
    }
}
