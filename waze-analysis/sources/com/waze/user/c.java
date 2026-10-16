package com.waze.user;

import h.ab;
import h.c.b.a.g;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f44812a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f44813b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f44814c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(k kVar, e eVar, h.c.e eVar2) {
        super(2, eVar2);
        this.f44813b = kVar;
        this.f44814c = eVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new c(this.f44813b, this.f44814c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f44812a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            k kVar = this.f44813b;
            e eVar = this.f44814c;
            this.f44812a = 1;
            if (ai.y(kVar).collect(new b(eVar), this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
