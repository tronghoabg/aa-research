package com.waze.car_lib.r;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class c extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f21132a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f21133b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.av.b.n f21134c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.av.d.k f21135d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ MutableLiveData f21136e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h.g.b.am f21137f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f21138g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Context f21139h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ com.waze.car_lib.screens.core.l f21140i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar, com.waze.av.b.n nVar, com.waze.av.d.k kVar, MutableLiveData mutableLiveData, h.g.b.am amVar, long j2, Context context, com.waze.car_lib.screens.core.l lVar, h.c.e eVar) {
        super(2, eVar);
        this.f21133b = dVar;
        this.f21134c = nVar;
        this.f21135d = kVar;
        this.f21136e = mutableLiveData;
        this.f21137f = amVar;
        this.f21138g = j2;
        this.f21139h = context;
        this.f21140i = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new c(this.f21133b, this.f21134c, this.f21135d, this.f21136e, this.f21137f, this.f21138g, this.f21139h, this.f21140i, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((c) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f21132a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            d dVar = this.f21133b;
            com.waze.av.b.n nVar = this.f21134c;
            com.waze.av.d.k kVar = this.f21135d;
            this.f21132a = 1;
            if (kotlinx.coroutines.b.ai.d(kotlinx.coroutines.b.ai.F(dVar.f21256c.k(nVar, kVar, dVar.f21264k), dVar.n, new b(nVar, this.f21136e, dVar, this.f21137f, this.f21138g, this.f21139h, this.f21140i, null)), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
