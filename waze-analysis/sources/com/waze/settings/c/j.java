package com.waze.settings.c;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f36943a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f36944b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(l lVar, h.c.e eVar) {
        super(2, eVar);
        this.f36944b = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new j(this.f36944b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((j) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f36943a == 0) {
            e.b.c.b(obj);
            l lVar = this.f36944b;
            this.f36943a = 1;
            if (lVar.f36946a.f().collect(new i(lVar), this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }
}
