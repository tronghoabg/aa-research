package com.waze.car_lib.r;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.waze.R;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class au {

    /* renamed from: a, reason: collision with root package name */
    private final Object f20979a;

    public au(com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(aVar, "stringProvider");
        this.f20979a = new MutableLiveData(new com.waze.car_lib.p.dg(aVar.c(R.string.AAP_LOGIN_FROM_DEVICE_TITLE, new Object[0]), aVar.c(R.string.AAP_LOGIN_FROM_DEVICE_MESSAGE, new Object[0]), null, false, null, null, 52));
    }

    public final LiveData a() {
        return (LiveData) this.f20979a;
    }

    public final /* synthetic */ com.google.v.b.a b() {
        List listA = ((com.waze.o.an) this.f20979a).a();
        h.g.b.x.e(listA, "getEventsOnRouteList(...)");
        return new com.google.v.b.a(listA);
    }

    public final /* synthetic */ com.google.v.b.a c() {
        List listB = ((com.waze.o.an) this.f20979a).b();
        h.g.b.x.e(listB, "getRouteAttributesList(...)");
        return new com.google.v.b.a(listB);
    }

    public final /* synthetic */ com.google.v.b.a d() {
        List listC = ((com.waze.o.an) this.f20979a).c();
        h.g.b.x.e(listC, "getRouteTypesList(...)");
        return new com.google.v.b.a(listC);
    }

    public final /* synthetic */ com.google.v.b.a e() {
        List listD = ((com.waze.o.an) this.f20979a).d();
        h.g.b.x.e(listD, "getTrafficJamsList(...)");
        return new com.google.v.b.a(listD);
    }

    public final /* synthetic */ com.waze.o.ao f() {
        com.google.v.du duVarBuild = ((com.google.v.dm) this.f20979a).build();
        h.g.b.x.e(duVarBuild, "build(...)");
        return (com.waze.o.ao) duVarBuild;
    }

    public final /* synthetic */ void g(com.google.v.b.a aVar, Iterable iterable) {
        h.g.b.x.f(aVar, "<this>");
        h.g.b.x.f(iterable, "values");
        ((com.waze.o.an) this.f20979a).e(iterable);
    }

    public final /* synthetic */ void h(com.google.v.b.a aVar, Iterable iterable) {
        h.g.b.x.f(aVar, "<this>");
        h.g.b.x.f(iterable, "values");
        ((com.waze.o.an) this.f20979a).f(iterable);
    }

    public final /* synthetic */ void i(com.google.v.b.a aVar, Iterable iterable) {
        h.g.b.x.f(aVar, "<this>");
        h.g.b.x.f(iterable, "values");
        ((com.waze.o.an) this.f20979a).g(iterable);
    }

    public final /* synthetic */ void j(com.google.v.b.a aVar, Iterable iterable) {
        h.g.b.x.f(aVar, "<this>");
        h.g.b.x.f(iterable, "values");
        ((com.waze.o.an) this.f20979a).h(iterable);
    }

    public final void k(String str) {
        h.g.b.x.f(str, "value");
        ((com.waze.o.an) this.f20979a).i(str);
    }

    public final void l(com.waze.o.bi biVar) {
        h.g.b.x.f(biVar, "value");
        ((com.waze.o.an) this.f20979a).j(biVar);
    }

    public final void m(long j2) {
        ((com.waze.o.an) this.f20979a).k(j2);
    }

    public final void n(long j2) {
        ((com.waze.o.an) this.f20979a).l(j2);
    }

    public /* synthetic */ au(com.waze.o.an anVar) {
        this.f20979a = anVar;
    }
}
