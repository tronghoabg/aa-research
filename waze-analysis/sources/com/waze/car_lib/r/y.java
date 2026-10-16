package com.waze.car_lib.r;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final Object f21732a;

    public y(com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(aVar, "stringProvider");
        this.f21732a = new MutableLiveData(new com.waze.car_lib.p.dg(aVar.c(R.string.AAP_GPS_DISABLED_TITLE, new Object[0]), aVar.c(R.string.AAP_GPS_DISABLED_MESSAGE, new Object[0]), Integer.valueOf(R.drawable.icon_outline_info_128px), false, null, null, 48));
    }

    public final LiveData a() {
        return (LiveData) this.f21732a;
    }

    public final /* synthetic */ com.waze.n.k b() {
        com.google.v.du duVarBuild = ((com.google.v.dm) this.f21732a).build();
        h.g.b.x.e(duVarBuild, "build(...)");
        return (com.waze.n.k) duVarBuild;
    }

    public final void c(String str) {
        h.g.b.x.f(str, "value");
        ((com.waze.n.j) this.f21732a).a(str);
    }

    public final void d(String str) {
        h.g.b.x.f(str, "value");
        ((com.waze.n.j) this.f21732a).b(str);
    }

    public final void e(String str) {
        h.g.b.x.f(str, "value");
        ((com.waze.n.j) this.f21732a).c(str);
    }

    public final void f(com.waze.n.s sVar) {
        h.g.b.x.f(sVar, "value");
        ((com.waze.n.j) this.f21732a).d(sVar);
    }

    public final void g(String str) {
        h.g.b.x.f(str, "value");
        ((com.waze.n.j) this.f21732a).e(str);
    }

    public final void h(String str) {
        h.g.b.x.f(str, "value");
        ((com.waze.n.j) this.f21732a).f(str);
    }

    public /* synthetic */ y(com.waze.n.j jVar) {
        this.f21732a = jVar;
    }
}
