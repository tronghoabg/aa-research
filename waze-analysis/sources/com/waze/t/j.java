package com.waze.t;

import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class j extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f40897a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f40898b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f40899c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(h hVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f40899c = i2;
        this.f40898b = hVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f40899c;
        Object obj2 = this.f40898b;
        return i2 != 0 ? new j((h) obj2, eVar, 1) : new j((k) obj2, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f40899c != 0 ? ((j) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((j) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f40899c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f40897a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj2 = this.f40898b;
                this.f40897a = 1;
                if (((h) obj2).f40891a.e().collect(new i(obj2, 1), this) == aVar) {
                    return aVar;
                }
            }
            return ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f40897a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            Object obj3 = this.f40898b;
            this.f40897a = 1;
            if (((k) obj3).f40900a.a().collect(new i(obj3, 0), this) == aVar2) {
                return aVar2;
            }
        }
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(k kVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f40899c = i2;
        this.f40898b = kVar;
    }
}
