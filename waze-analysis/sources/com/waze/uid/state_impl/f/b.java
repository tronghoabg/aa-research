package com.waze.uid.state_impl.f;

import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f44669a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f44670b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(d dVar, e eVar) {
        super(2, eVar);
        this.f44670b = dVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new b(this.f44670b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((b) create((af) obj, (e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f44669a != 0) {
            e.b.c.b(obj);
            return obj;
        }
        e.b.c.b(obj);
        this.f44669a = 1;
        Object objI = ai.i(this.f44670b.f44676g.a(), new a(null), this);
        return objI == aVar ? aVar : objI;
    }
}
