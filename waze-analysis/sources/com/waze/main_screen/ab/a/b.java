package com.waze.main_screen.ab.a;

import com.waze.kj;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class b extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ int f25625a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kj f25626b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(kj kjVar, h.c.e eVar) {
        super(2, eVar);
        this.f25626b = kjVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        b bVar = new b(this.f25626b, eVar);
        bVar.f25625a = ((Number) obj).intValue();
        return bVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((b) create(Integer.valueOf(((Number) obj).intValue()), (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f25626b.A(this.f25625a);
        return ab.f48028a;
    }
}
