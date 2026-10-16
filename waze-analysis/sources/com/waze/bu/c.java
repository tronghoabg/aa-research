package com.waze.bu;

import h.ab;
import h.c.b.a.g;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f17479a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ch f17480b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.shared_infra.i.e f17481c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ f f17482d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(ch chVar, com.waze.shared_infra.i.e eVar, f fVar, h.c.e eVar2) {
        super(2, eVar2);
        this.f17480b = chVar;
        this.f17481c = eVar;
        this.f17482d = fVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new c(this.f17480b, this.f17481c, this.f17482d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f17479a == 0) {
            e.b.c.b(obj);
            this.f17479a = 1;
            if (this.f17480b.collect(new b(this.f17481c, this.f17482d), this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }
}
