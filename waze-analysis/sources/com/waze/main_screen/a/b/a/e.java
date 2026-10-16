package com.waze.main_screen.a.b.a;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class e extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f25578a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f25579b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(g gVar, h.c.e eVar) {
        super(2, eVar);
        this.f25579b = gVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new e(this.f25579b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((e) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f25578a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            g gVar = this.f25579b;
            this.f25578a = 1;
            if (ai.y(new d(gVar.f25583c.ag())).collect(new a(gVar), this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
