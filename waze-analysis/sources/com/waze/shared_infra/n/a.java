package com.waze.shared_infra.n;

import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class a extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f37910a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f37911b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(c cVar, e eVar) {
        super(2, eVar);
        this.f37911b = cVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new a(this.f37911b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((a) create((af) obj, (e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f37910a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f37910a = 1;
            if (c.c(this.f37911b, this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
