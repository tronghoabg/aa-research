package com.waze.ui.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bg extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f42576a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cg f42577b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bg(boolean z, cg cgVar, h.c.e eVar) {
        super(2, eVar);
        this.f42576a = z;
        this.f42577b = cgVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new bg(this.f42576a, this.f42577b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bg) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        boolean z = this.f42576a;
        cg cgVar = this.f42577b;
        if (z) {
            if (cgVar != null) {
                cgVar.v();
            }
        } else if (cgVar != null) {
            cgVar.r();
        }
        return h.ab.f48028a;
    }
}
