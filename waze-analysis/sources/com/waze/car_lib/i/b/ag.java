package com.waze.car_lib.i.b;

import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ag extends h.c.b.a.g implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    int f19964a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.car_lib.i.a.a f19965b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f19966c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(com.waze.car_lib.i.a.a aVar, h.c.e eVar, int i2) {
        super(1, eVar);
        this.f19966c = i2;
        this.f19965b = aVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(h.c.e eVar) {
        return this.f19966c != 0 ? new ag(this.f19965b, eVar, 1, null) : new ag(this.f19965b, eVar, 0);
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        return this.f19966c != 0 ? ((ag) create((h.c.e) obj)).invokeSuspend(h.ab.f48028a) : ((ag) create((h.c.e) obj)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f19966c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f19964a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f19964a = 1;
                obj = ai.h(this.f19965b.d(), this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return com.waze.z.a.e.b.h((com.waze.map.main.aa) obj);
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f19964a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f19964a = 1;
            obj = ai.h(this.f19965b.d(), this);
            if (obj == aVar2) {
                return aVar2;
            }
        }
        return com.waze.z.a.e.b.h((com.waze.map.main.aa) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(com.waze.car_lib.i.a.a aVar, h.c.e eVar, int i2, byte[] bArr) {
        super(1, eVar);
        this.f19966c = i2;
        this.f19965b = aVar;
    }
}
