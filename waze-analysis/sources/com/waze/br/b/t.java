package com.waze.br.b;

import com.waze.t.b.bw;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class t extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f17349a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f17350b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ w f17351c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(w wVar, h.c.e eVar) {
        super(3, eVar);
        this.f17351c = wVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        t tVar = new t(this.f17351c, (h.c.e) obj3);
        tVar.f17349a = (bw) obj;
        tVar.f17350b = (a) obj2;
        return tVar.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return w.b(this.f17351c, (bw) this.f17349a, (a) this.f17350b);
    }
}
