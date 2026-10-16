package com.waze.modules.navigation;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class az extends h.c.b.a.g implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    int f30353a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bk f30354b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ao f30355c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    az(bk bkVar, ao aoVar, h.c.e eVar) {
        super(1, eVar);
        this.f30354b = bkVar;
        this.f30355c = aoVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(h.c.e<?> eVar) {
        return new az(this.f30354b, this.f30355c, eVar);
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((az) create((h.c.e) obj)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f30353a != 0) {
            e.b.c.b(obj);
            return obj;
        }
        e.b.c.b(obj);
        this.f30353a = 1;
        Object objT = bk.t(this.f30354b, this.f30355c.j(), this);
        return objT == aVar ? aVar : objT;
    }
}
