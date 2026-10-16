package com.waze.trip_overview.c.a;

import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f41222a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ab f41223b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ View f41224c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f41225d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(ab abVar, View view, h.c.e eVar) {
        super(2, eVar);
        this.f41223b = abVar;
        this.f41224c = view;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        j jVar = new j(this.f41223b, this.f41224c, eVar);
        jVar.f41225d = obj;
        return jVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((j) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.af afVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f41222a != 0) {
            afVar = (kotlinx.coroutines.af) this.f41225d;
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.af afVar2 = (kotlinx.coroutines.af) this.f41225d;
            ab abVar = this.f41223b;
            View view = this.f41224c;
            kotlinx.coroutines.am[] amVarArr = {kotlinx.coroutines.aj.y(afVar2, null, null, new i(abVar, view, (h.c.e) null, 2, (char[]) null), 3), kotlinx.coroutines.aj.y(afVar2, null, null, new i(abVar, view, (h.c.e) null, 0), 3)};
            this.f41225d = afVar2;
            this.f41222a = 1;
            if (kotlinx.coroutines.aj.D(amVarArr, this) == aVar) {
                return aVar;
            }
            afVar = afVar2;
        }
        return kotlinx.coroutines.aj.z(afVar, null, null, new i(this.f41223b, this.f41224c, (h.c.e) null, 1, (byte[]) null), 3);
    }
}
