package com.waze.car_lib.r.b;

import com.waze.settings.dy;
import com.waze.settings.e.a.e;
import com.waze.settings.gu;
import com.waze.settings.tree.c.h;
import h.a.i;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    private final e f21008a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.settings.e.c.a f21009b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f21010c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f21011d;

    /* renamed from: e, reason: collision with root package name */
    private final List f21012e;

    /* renamed from: f, reason: collision with root package name */
    private final List f21013f;

    public d(e eVar, com.waze.settings.e.c.a aVar, com.waze.shared_infra.i.e eVar2) {
        x.f(eVar, "hncSettingsDataSource");
        x.f(aVar, "hncStatsSender");
        x.f(eVar2, "logger");
        this.f21008a = eVar;
        this.f21009b = aVar;
        this.f21010c = eVar2;
        ArrayList arrayList = new ArrayList();
        this.f21012e = arrayList;
        this.f21013f = arrayList;
        if (j()) {
            eVar.g();
            i();
        }
    }

    @Override // com.waze.car_lib.r.b.b
    public final a a() {
        Object next;
        Iterator it = this.f21013f.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((a) next).d()) {
                break;
            }
        }
        return (a) next;
    }

    @Override // com.waze.car_lib.r.b.b
    public final h b() {
        return new c(this);
    }

    @Override // com.waze.car_lib.r.b.b
    public final String c() {
        return this.f21008a.c();
    }

    @Override // com.waze.car_lib.r.b.b
    public final List d() {
        return this.f21013f;
    }

    @Override // com.waze.car_lib.r.b.b
    public final void e() {
        e eVar = this.f21008a;
        List listD = eVar.d();
        if (listD.size() > 1) {
            this.f21010c.g("More than one active HNC permit, clearing all. (" + listD + ")");
            eVar.f();
        }
    }

    @Override // com.waze.car_lib.r.b.b
    public final void f() {
        this.f21011d = false;
    }

    @Override // com.waze.car_lib.r.b.b
    public final void g() {
        if (this.f21011d) {
            return;
        }
        this.f21009b.d(dy.f37099b, null);
    }

    @Override // com.waze.car_lib.r.b.b
    public final void h() {
        this.f21011d = true;
        this.f21009b.d(dy.f37103f, null);
    }

    @Override // com.waze.car_lib.r.b.b
    public final void i() {
        e eVar = this.f21008a;
        String str = (String) i.R(eVar.d());
        List list = this.f21012e;
        list.clear();
        List<String> listE = eVar.e();
        ArrayList arrayList = new ArrayList(i.q(listE, 10));
        for (String str2 : listE) {
            com.waze.settings.e.a.d dVarA = eVar.a(str2);
            arrayList.add(new a(str2, gu.h(dVarA), gu.g(dVarA), x.n(str, str2)));
        }
        list.addAll(arrayList);
    }

    @Override // com.waze.car_lib.r.b.b
    public final boolean j() {
        return this.f21008a.j();
    }

    @Override // com.waze.car_lib.r.b.b
    public final boolean k() {
        String strC = this.f21008a.c();
        List list = this.f21013f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((a) obj).d()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(i.q(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((a) it.next()).c());
        }
        return gu.i(strC, arrayList3);
    }
}
