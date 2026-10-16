package com.waze.main_screen;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class az extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f25865a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ be f25866b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    az(be beVar, h.c.e eVar) {
        super(2, eVar);
        this.f25866b = beVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        az azVar = new az(this.f25866b, eVar);
        azVar.f25865a = ((Boolean) obj).booleanValue();
        return azVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((az) create(bool, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f25866b.d().j(!this.f25865a);
        return h.ab.f48028a;
    }
}
