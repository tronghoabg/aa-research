package com.waze.car_lib.r;

import androidx.lifecycle.MutableLiveData;
import com.waze.car_lib.f.gw;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21474a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.car_lib.n.j f21475b;

    /* renamed from: c, reason: collision with root package name */
    private final gw f21476c;

    /* renamed from: d, reason: collision with root package name */
    private final MutableLiveData f21477d;

    /* renamed from: e, reason: collision with root package name */
    private List f21478e;

    public e(com.waze.shared_infra.o.a aVar, com.waze.car_lib.n.j jVar, gw gwVar) {
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(jVar, "searchCategories");
        h.g.b.x.f(gwVar, "searchCoordinatorController");
        this.f21474a = aVar;
        this.f21475b = jVar;
        this.f21476c = gwVar;
        this.f21477d = new MutableLiveData(new com.waze.car_lib.p.cz((byte[]) null));
        this.f21478e = h.a.i.h();
    }

    public final MutableLiveData b(kotlinx.coroutines.af afVar) {
        h.g.b.x.f(afVar, "scope");
        kotlinx.coroutines.aj.z(afVar, null, null, new j(this, (h.c.e) null, 1), 3);
        return this.f21477d;
    }

    public final void e(com.waze.car_lib.p.t tVar) {
        h.g.b.x.f(tVar, "item");
        Iterator it = this.f21478e.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (h.g.b.x.n(((com.waze.car_lib.n.d) it.next()).c(), tVar.d())) {
                break;
            } else {
                i2++;
            }
        }
        Integer numValueOf = Integer.valueOf(i2);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            this.f21476c.d(((com.waze.car_lib.n.d) this.f21478e.get(iIntValue)).b(), iIntValue);
        }
    }

    public final void f(List list) {
        h.g.b.x.f(list, "<set-?>");
        this.f21478e = list;
    }
}
