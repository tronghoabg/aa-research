package com.waze.car_lib.e;

import android.content.Context;
import h.ab;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class h extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f19281a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f19282b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Context f19283c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.car_lib.i.a.a f19284d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(Context context, com.waze.car_lib.i.a.a aVar, h.c.e eVar) {
        super(2, eVar);
        this.f19283c = context;
        this.f19284d = aVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        h hVar = new h(this.f19283c, this.f19284d, eVar);
        hVar.f19282b = obj;
        return hVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((h) create((com.waze.car_lib.c.f) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f19281a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            com.waze.car_lib.c.f fVar = (com.waze.car_lib.c.f) this.f19282b;
            if (fVar != null) {
                this.f19281a = 1;
                if (aj.d(new g(fVar, this.f19283c, this.f19284d, null), this) == aVar) {
                    return aVar;
                }
            }
        }
        return ab.f48028a;
    }
}
