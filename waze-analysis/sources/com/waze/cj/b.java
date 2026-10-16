package com.waze.cj;

import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f22425a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.sharedui.e.g f22426b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f22427c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(com.waze.sharedui.e.g gVar, c cVar, e eVar) {
        super(2, eVar);
        this.f22426b = gVar;
        this.f22427c = cVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new b(this.f22426b, this.f22427c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((b) create((af) obj, (e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f22425a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            com.waze.sharedui.e.g gVar = this.f22426b;
            c cVar = this.f22427c;
            this.f22425a = 1;
            if (gVar.d().collect(new a(cVar), this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
