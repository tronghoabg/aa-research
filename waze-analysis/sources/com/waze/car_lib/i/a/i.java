package com.waze.car_lib.i.a;

import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class i extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f19872a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f19873b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f19874c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(j jVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f19874c = i2;
        this.f19873b = jVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f19874c != 0 ? new i(this.f19873b, eVar, 1, null) : new i(this.f19873b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f19874c != 0 ? ((i) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((i) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f19874c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f19872a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f19872a = 1;
                if (aj.q(400L, this) == aVar) {
                    return aVar;
                }
            }
            this.f19873b.i();
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f19872a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f19872a = 1;
            if (aj.q(400L, this) == aVar2) {
                return aVar2;
            }
        }
        this.f19873b.g();
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(j jVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f19874c = i2;
        this.f19873b = jVar;
    }
}
