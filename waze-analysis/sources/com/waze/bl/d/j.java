package com.waze.bl.d;

import com.waze.t.b.bw;
import h.ab;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j extends h.c.b.a.g implements q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f17091a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f17092b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f17093c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(l lVar, h.c.e eVar) {
        super(3, eVar);
        this.f17093c = lVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        j jVar = new j(this.f17093c, (h.c.e) obj3);
        jVar.f17091a = (b) obj;
        jVar.f17092b = (bw) obj2;
        return jVar.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        b bVar = (b) this.f17091a;
        return this.f17093c.k((bw) this.f17092b, bVar.b());
    }
}
