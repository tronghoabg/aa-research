package com.waze.car_lib.i.a;

import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class r extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f19901a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.bk.r f19902b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ s f19903c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(com.waze.bk.r rVar, s sVar, h.c.e eVar) {
        super(2, eVar);
        this.f19902b = rVar;
        this.f19903c = sVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new r(this.f19902b, this.f19903c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((r) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f19901a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f19901a = 1;
            if (ai.D(this.f19902b.b()).collect(new q(this.f19903c), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
