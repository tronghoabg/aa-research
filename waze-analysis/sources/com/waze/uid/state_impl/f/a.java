package com.waze.uid.state_impl.f;

import com.waze.b.s;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class a extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f44668a;

    a(e eVar) {
        super(2, eVar);
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        a aVar = new a(eVar);
        aVar.f44668a = obj;
        return aVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((a) create((s) obj, (e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return Boolean.valueOf(((s) this.f44668a).c() != null);
    }
}
