package com.waze.trip_overview;

import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dd extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f41328a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f41329b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f41330c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f41331d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dd(de deVar, y yVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f41331d = i2;
        this.f41329b = deVar;
        this.f41330c = yVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlinx.coroutines.am] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f41331d != 0) {
            return new dd((kotlinx.coroutines.am) this.f41329b, (bt) this.f41330c, eVar, 1);
        }
        return new dd((de) this.f41329b, (y) this.f41330c, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f41331d != 0 ? ((dd) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((dd) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlinx.coroutines.am] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws IOException {
        if (this.f41331d != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f41328a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f41328a = 1;
                obj = this.f41329b.c(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            ((bt) this.f41330c).c((cg) obj);
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f41328a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            Object obj2 = this.f41329b;
            this.f41328a = 1;
            if (de.k((de) obj2, this) == aVar2) {
                return aVar2;
            }
        }
        ((de) this.f41329b).G(((y) this.f41330c).a());
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dd(kotlinx.coroutines.am amVar, bt btVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f41331d = i2;
        this.f41329b = amVar;
        this.f41330c = btVar;
    }
}
