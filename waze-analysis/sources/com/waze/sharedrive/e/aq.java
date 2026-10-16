package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aq extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f38345a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ at f38346b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f38347c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aq(at atVar, boolean z, h.c.e eVar) {
        super(2, eVar);
        this.f38346b = atVar;
        this.f38347c = z;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new aq(this.f38346b, this.f38347c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aq) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f38345a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            at atVar = this.f38346b;
            boolean z = this.f38347c;
            this.f38345a = 1;
            if (atVar.A().k(z, this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
