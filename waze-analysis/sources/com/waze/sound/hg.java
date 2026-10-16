package com.waze.sound;

import java.util.concurrent.CancellationException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class hg extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40134a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ hl f40135b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    hg(hl hlVar, h.c.e eVar) {
        super(3, eVar);
        this.f40135b = hlVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        hg hgVar = new hg(this.f40135b, (h.c.e) obj3);
        hgVar.f40134a = (Throwable) obj2;
        return hgVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        Throwable th = (Throwable) this.f40134a;
        if (!(th instanceof CancellationException)) {
            hl hlVar = this.f40135b;
            hlVar.f40154d.c("Error during audio collection", th);
            hlVar.t(new com.waze.h.a.c(th));
        }
        return h.ab.f48028a;
    }
}
