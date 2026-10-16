package com.waze.stats;

import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class al extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f40521a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ an f40522b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f40523c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    al(an anVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f40523c = i2;
        this.f40522b = anVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f40523c != 0 ? new al(this.f40522b, eVar, 1, null) : new al(this.f40522b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f40523c != 0 ? ((al) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((al) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f40523c == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f40521a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f40521a = 1;
                if (an.f(this.f40522b, this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f40521a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            an anVar = this.f40522b;
            long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(anVar.f40529b.b());
            com.waze.stats.storage.c cVar = anVar.o;
            this.f40521a = 1;
            if (cVar.e(jCurrentTimeMillis) == aVar2) {
                return aVar2;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    al(an anVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f40523c = i2;
        this.f40522b = anVar;
    }
}
