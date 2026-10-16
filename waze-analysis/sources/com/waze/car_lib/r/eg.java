package com.waze.car_lib.r;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class eg extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f21520a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f21521b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f21522c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f21523d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    eg(kotlinx.coroutines.b.k kVar, List list, h.c.e eVar) {
        super(2, eVar);
        this.f21521b = kVar;
        this.f21522c = list;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        eg egVar = new eg(this.f21521b, this.f21522c, eVar);
        egVar.f21523d = obj;
        return egVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((eg) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        h.c.a.a aVar = h.c.a.a.f48038a;
        try {
            if (this.f21520a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                kotlinx.coroutines.b.k kVar = this.f21521b;
                ef efVar = new ef(this.f21522c, null);
                this.f21520a = 1;
                obj = kotlinx.coroutines.b.ai.i(kVar, efVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            objA = (h.k) obj;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        if (true == (objA instanceof h.l)) {
            objA = null;
        }
        h.k kVar2 = (h.k) objA;
        if (kVar2 != null) {
            return new Integer(((Number) kVar2.d()).intValue() - ((Number) kVar2.c()).intValue());
        }
        return null;
    }
}
