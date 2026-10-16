package com.waze.t;

import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class p extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f40906a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.sharedui.e.g f40907b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ q f40908c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(com.waze.sharedui.e.g gVar, q qVar, h.c.e eVar) {
        super(2, eVar);
        this.f40907b = gVar;
        this.f40908c = qVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new p(this.f40907b, this.f40908c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((p) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f40906a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            com.waze.sharedui.e.g gVar = this.f40907b;
            q qVar = this.f40908c;
            this.f40906a = 1;
            if (gVar.d().collect(new i(qVar, 2), this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
