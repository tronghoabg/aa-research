package com.waze.sharedrive.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ap extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f38208a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aq f38209b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ s f38210c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f38211d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f38212e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ap(aq aqVar, s sVar, boolean z, String str, h.c.e eVar) {
        super(2, eVar);
        this.f38209b = aqVar;
        this.f38210c = sVar;
        this.f38211d = z;
        this.f38212e = str;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ap(this.f38209b, this.f38210c, this.f38211d, this.f38212e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ap) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f38208a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            aq aqVar = this.f38209b;
            s sVar = this.f38210c;
            this.f38208a = 1;
            obj = aqVar.f38213a.c(sVar.c(), sVar.b(), null, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        aq aqVar2 = this.f38209b;
        boolean z = this.f38211d;
        String str = this.f38212e;
        s sVar2 = this.f38210c;
        if (((Boolean) obj).booleanValue()) {
            aq.O(aqVar2, new com.waze.sharedrive.c.a.o(new com.waze.sharedrive.c.a.j(z)), str);
            return obj;
        }
        aqVar2.f38219g.g("Failed to updateViewerSharingLocationState, reverting to original role");
        aq.O(aqVar2, new com.waze.sharedrive.c.a.n(sVar2.a().c().b(), com.waze.sharedrive.n.f38764a), str);
        return obj;
    }
}
