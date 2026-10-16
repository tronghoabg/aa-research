package com.waze.c.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ab extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f18261a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ae f18262b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f18263c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(ae aeVar, boolean z, h.c.e eVar) {
        super(2, eVar);
        this.f18262b = aeVar;
        this.f18263c = z;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ab(this.f18262b, this.f18263c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ab) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f18261a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            ae aeVar = this.f18262b;
            boolean z = this.f18263c;
            this.f18261a = 1;
            if (aeVar.t(ah.f18284b, z, this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
