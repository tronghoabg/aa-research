package com.waze.shared_infra.s;

import com.waze.search.h.ay;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e<T> implements f<T> {

    /* renamed from: a, reason: collision with root package name */
    private Object f38005a;

    /* renamed from: b, reason: collision with root package name */
    private List f38006b = h.a.i.h();

    public e(Object obj) {
        this.f38005a = obj;
    }

    public final Object a() {
        return this.f38005a;
    }

    @Override // com.waze.shared_infra.s.f
    public final void b(j jVar) {
        if (jVar instanceof i) {
            synchronized (this) {
                List list = this.f38006b;
                ArrayList arrayList = new ArrayList();
                for (T t : list) {
                    if (!x.n((ay) t, ((i) jVar).a())) {
                        arrayList.add(t);
                    }
                }
                this.f38006b = arrayList;
            }
        }
    }

    public final void c(Object obj) {
        if (x.n(this.f38005a, obj)) {
            return;
        }
        this.f38005a = obj;
        Iterator<T> it = this.f38006b.iterator();
        while (it.hasNext()) {
            ((ay) it.next()).b(this.f38005a);
        }
    }

    @Override // com.waze.shared_infra.s.f
    public final j d(ay ayVar) {
        x.f(ayVar, "observer");
        synchronized (this) {
            this.f38006b = h.a.i.ag(this.f38006b, ayVar);
        }
        ayVar.b(this.f38005a);
        return new i(ayVar);
    }
}
