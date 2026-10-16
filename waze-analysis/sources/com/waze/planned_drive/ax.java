package com.waze.planned_drive;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ax extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f33209a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ay f33210b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f33211c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ax(ay ayVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f33211c = i2;
        this.f33210b = ayVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f33211c != 0 ? new ax(this.f33210b, eVar, 1, null) : new ax(this.f33210b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f33211c != 0 ? ((ax) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ax) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f33211c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f33209a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f33209a = 1;
                if (ConfigValues.CONFIG_VALUE_CALENDAR_ACTIVATED.k().collect(new aw(this.f33210b, 1), this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f33209a == 0) {
            e.b.c.b(obj);
            ay ayVar = this.f33210b;
            this.f33209a = 1;
            if (ayVar.J().getEvents().collect(new aw(ayVar, 0), this) == aVar2) {
                return aVar2;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ax(ay ayVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f33211c = i2;
        this.f33210b = ayVar;
    }
}
