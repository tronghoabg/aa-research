package com.waze.search.v2;

import com.waze.settings.gw;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class eh extends h.c.b.a.g implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fi f36427a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gw f36428b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    eh(fi fiVar, gw gwVar, h.c.e eVar) {
        super(1, eVar);
        this.f36427a = fiVar;
        this.f36428b = gwVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(h.c.e<?> eVar) {
        return new eh(this.f36427a, this.f36428b, eVar);
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((eh) create((h.c.e) obj)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        String str = this.f36428b.f37350c;
        h.g.b.x.e(str, "display");
        this.f36427a.aa(new ay(str));
        return h.ab.f48028a;
    }
}
