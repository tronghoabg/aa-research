package com.waze.map.canvas;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class af extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f28510a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f28511b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MainCanvasDelegatorImpl f28512c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(MainCanvasDelegatorImpl mainCanvasDelegatorImpl, h.c.e eVar) {
        super(2, eVar);
        this.f28512c = mainCanvasDelegatorImpl;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        af afVar = new af(this.f28512c, eVar);
        afVar.f28511b = obj;
        return afVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((af) create((String) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f28510a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            String str = (String) this.f28511b;
            if (str != null) {
                MainCanvasDelegatorImpl mainCanvasDelegatorImpl = this.f28512c;
                this.f28510a = 1;
                if (new ae(mainCanvasDelegatorImpl.f28487h.getMainCanvasFallthroughClickEvents(), str).collect(new ak(mainCanvasDelegatorImpl, 1), this) == aVar) {
                    return aVar;
                }
            }
        }
        return h.ab.f48028a;
    }
}
