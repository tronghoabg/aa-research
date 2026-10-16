package com.waze.cf;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f22180a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f22181b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h f22182c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(h hVar, h.c.e eVar) {
        super(2, eVar);
        this.f22182c = hVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        c cVar = new c(this.f22182c, eVar);
        cVar.f22181b = ((Boolean) obj).booleanValue();
        return cVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((c) create(bool, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f22180a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            if (!this.f22181b) {
                this.f22180a = 1;
                if (aj.d(new b(this.f22182c, null), this) == aVar) {
                    return aVar;
                }
            }
        }
        return ab.f48028a;
    }
}
