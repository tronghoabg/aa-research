package com.waze.utils;

import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class an extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ao f44850a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    an(ao aoVar, h.c.e eVar) {
        super(2, eVar);
        this.f44850a = aoVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new an(this.f44850a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((an) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        ao aoVar = this.f44850a;
        aoVar.j();
        if (aoVar.l() != null) {
            File fileL = aoVar.l();
            h.g.b.x.c(fileL);
            if (fileL.exists()) {
                ao.m(aoVar, aoVar.l());
            }
        }
        return h.ab.f48028a;
    }
}
