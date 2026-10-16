package com.waze.q;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class k extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f33477a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f33478b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.calendar.b f33479c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(l lVar, com.waze.calendar.b bVar, h.c.e eVar) {
        super(2, eVar);
        this.f33478b = lVar;
        this.f33479c = bVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new k(this.f33478b, this.f33479c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((k) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f33477a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            l lVar = this.f33478b;
            com.waze.calendar.b bVar = this.f33479c;
            this.f33477a = 1;
            if (lVar.f33483d.emit(bVar, this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
