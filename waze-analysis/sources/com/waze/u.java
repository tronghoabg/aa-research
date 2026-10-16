package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class u extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f41608a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f41609b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ lv f41610c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(long j2, lv lvVar, h.c.e eVar) {
        super(2, eVar);
        this.f41609b = j2;
        this.f41610c = lvVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new u(this.f41609b, this.f41610c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((u) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f41608a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            long j2 = this.f41609b;
            if (j2 > 0) {
                this.f41608a = 1;
                if (kotlinx.coroutines.aj.q(j2, this) == aVar) {
                    return aVar;
                }
            }
        }
        AppServiceBroadcastReceiver.f13533a.a(this.f41610c);
        return h.ab.f48028a;
    }
}
