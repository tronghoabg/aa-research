package com.waze.car_lib.j;

import androidx.car.app.navigation.NavigationManager;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class o extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f20246a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f20247b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f20248c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ NavigationManager f20249d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f20250e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(r rVar, bn bnVar, NavigationManager navigationManager, h.c.e eVar) {
        super(2, eVar);
        this.f20247b = rVar;
        this.f20248c = bnVar;
        this.f20249d = navigationManager;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        o oVar = new o(this.f20247b, this.f20248c, this.f20249d, eVar);
        oVar.f20250e = obj;
        return oVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((o) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f20246a == 0) {
            e.b.c.b(obj);
            r rVar = this.f20247b;
            this.f20246a = 1;
            if (rVar.f20257b.e().collect(new n(rVar, this.f20248c, this.f20249d), this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }
}
