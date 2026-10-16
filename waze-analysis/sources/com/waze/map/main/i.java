package com.waze.map.main;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class i extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f29430a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f29431b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.map.bq f29432c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f29433d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Object f29434e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f29435f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(p pVar, com.waze.modules.navigation.ah ahVar, com.waze.modules.navigation.ak akVar, com.waze.map.bq bqVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f29435f = i2;
        this.f29431b = pVar;
        this.f29433d = ahVar;
        this.f29434e = akVar;
        this.f29432c = bqVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f29435f != 0) {
            return new i((kotlinx.coroutines.b.k) this.f29434e, this.f29432c, (h.g.b.aq) this.f29433d, this.f29431b, eVar, 1);
        }
        p pVar = this.f29431b;
        Object obj2 = this.f29433d;
        return new i(pVar, (com.waze.modules.navigation.ah) obj2, (com.waze.modules.navigation.ak) this.f29434e, this.f29432c, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f29435f != 0 ? ((i) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((i) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f29435f != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f29430a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                ?? r15 = this.f29434e;
                com.waze.map.bq bqVar = this.f29432c;
                Object obj2 = this.f29433d;
                p pVar = this.f29431b;
                this.f29430a = 1;
                if (kotlinx.coroutines.b.ai.e(kotlinx.coroutines.b.ai.y(r15), new h(bqVar, (h.g.b.aq) obj2, pVar, null), this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f29430a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            p pVar2 = this.f29431b;
            Object obj3 = this.f29433d;
            Object obj4 = this.f29434e;
            this.f29430a = 1;
            obj = p.j(pVar2).b(new com.waze.modules.navigation.ao((com.waze.modules.navigation.ah) obj3, (com.waze.modules.navigation.ak) obj4, null, false, null, null, false, null, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_5)).a().c(this);
            if (obj == aVar2) {
                return aVar2;
            }
        }
        if (((com.waze.modules.navigation.al) obj) == com.waze.modules.navigation.al.f30301a) {
            this.f29432c.z();
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(kotlinx.coroutines.b.k kVar, com.waze.map.bq bqVar, h.g.b.aq aqVar, p pVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f29435f = i2;
        this.f29434e = kVar;
        this.f29432c = bqVar;
        this.f29433d = aqVar;
        this.f29431b = pVar;
    }
}
