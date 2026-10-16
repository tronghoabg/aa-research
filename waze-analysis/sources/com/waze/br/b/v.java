package com.waze.br.b;

import h.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class v extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f17353a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.t.b.h f17354b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ w f17355c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(com.waze.t.b.h hVar, w wVar, h.c.e eVar) {
        super(2, eVar);
        this.f17354b = hVar;
        this.f17355c = wVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new v(this.f17354b, this.f17355c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((v) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f17353a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            ch chVarB = this.f17354b.b();
            w wVar = this.f17355c;
            this.f17353a = 1;
            if (ai.y(ai.q(chVarB, wVar.f17356a.c(), new t(wVar, null))).collect(new u(wVar), this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
