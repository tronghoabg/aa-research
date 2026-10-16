package com.waze.car_lib.screens.b;

import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class h extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f21837a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.car_lib.screens.core.n f21838b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f21839c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(j jVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f21839c = i2;
        this.f21838b = jVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f21839c;
        if (i2 == 0) {
            return new h((j) this.f21838b, eVar, 0);
        }
        if (i2 == 1) {
            return new h((j) this.f21838b, eVar, 1, (byte[]) null);
        }
        com.waze.car_lib.screens.core.n nVar = this.f21838b;
        return i2 != 2 ? new h((o) nVar, eVar, 3, (byte[]) null) : new h((o) nVar, eVar, 2);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f21839c;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? ((h) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((h) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((h) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((h) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f21839c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f21837a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f21837a = 1;
                if (((j) this.f21838b).f21842b.a(this) == aVar) {
                    return aVar;
                }
            }
            return ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f21837a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                com.waze.car_lib.screens.core.n nVar = this.f21838b;
                this.f21837a = 1;
                if (j.e((j) nVar, this) == aVar2) {
                    return aVar2;
                }
            }
            return ab.f48028a;
        }
        if (i2 != 2) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            if (this.f21837a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f21837a = 1;
                if (((o) this.f21838b).f21852b.a(this) == aVar3) {
                    return aVar3;
                }
            }
            return ab.f48028a;
        }
        h.c.a.a aVar4 = h.c.a.a.f48038a;
        if (this.f21837a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            com.waze.car_lib.screens.core.n nVar2 = this.f21838b;
            this.f21837a = 1;
            if (o.e((o) nVar2, this) == aVar4) {
                return aVar4;
            }
        }
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(j jVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f21839c = i2;
        this.f21838b = jVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(o oVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f21839c = i2;
        this.f21838b = oVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(o oVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f21839c = i2;
        this.f21838b = oVar;
    }
}
