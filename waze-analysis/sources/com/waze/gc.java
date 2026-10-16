package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class gc extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f24018a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.am f24019b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f24020c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ gd f24021d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    gc(kotlinx.coroutines.am amVar, boolean z, gd gdVar, h.c.e eVar) {
        super(2, eVar);
        this.f24019b = amVar;
        this.f24020c = z;
        this.f24021d = gdVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new gc(this.f24019b, this.f24020c, this.f24021d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((gc) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f24018a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f24018a = 1;
            obj = this.f24019b.c(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (((com.waze.modules.navigation.al) obj) == com.waze.modules.navigation.al.f30301a) {
            this.f24021d.f24025d.b(com.waze.google_assistant.e.f24165d, this.f24020c ? com.waze.google_assistant.d.f24155a : com.waze.google_assistant.d.f24159e);
        }
        return h.ab.f48028a;
    }
}
