package com.waze.sound;

import androidx.media3.datasource.cache.Cache;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aw extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f39475a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f39476b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aw(Cache cache, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f39476b = i2;
        this.f39475a = cache;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.media3.datasource.cache.Cache, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f39476b;
        if (i2 == 0) {
            return new aw((ax) this.f39475a, eVar, 0);
        }
        if (i2 == 1) {
            return new aw((Cache) this.f39475a, eVar, 1);
        }
        Object obj2 = this.f39475a;
        return i2 != 2 ? new aw((el) obj2, eVar, 3) : new aw((cf) obj2, eVar, 2);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f39476b;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? ((aw) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((aw) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((aw) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((aw) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.media3.datasource.cache.Cache, java.lang.Object] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f39476b;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            ((ax) this.f39475a).j(as.f39461b);
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            com.waze.sharedui.api.c.b(this.f39475a);
            return h.ab.f48028a;
        }
        if (i2 != 2) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            ((el) this.f39475a).f39932b.close();
            return h.ab.f48028a;
        }
        h.c.a.a aVar4 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        cf cfVar = (cf) this.f39475a;
        if (h.g.b.x.n(cf.f(cfVar), true)) {
            cfVar.f39653e.e(new Integer(0));
        } else {
            cfVar.f39653e.e(cf.g(cfVar));
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aw(ax axVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f39476b = i2;
        this.f39475a = axVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aw(cf cfVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f39476b = i2;
        this.f39475a = cfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aw(el elVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f39476b = i2;
        this.f39475a = elVar;
    }
}
