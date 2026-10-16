package com.waze.settings.i.a;

import com.waze.ui.af.y;
import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class p extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ q f37424a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f37425b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(q qVar, y yVar, h.c.e eVar) {
        super(2, eVar);
        this.f37424a = qVar;
        this.f37425b = yVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new p(this.f37424a, this.f37425b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((p) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f37424a.f37426a.g(this.f37425b.c());
        return ab.f48028a;
    }
}
