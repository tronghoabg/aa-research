package com.waze.view.popups.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class w extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f45232a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aa f45233b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ u f45234c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f45235d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(aa aaVar, u uVar, int i2, h.c.e eVar) {
        super(2, eVar);
        this.f45233b = aaVar;
        this.f45234c = uVar;
        this.f45235d = i2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new w(this.f45233b, this.f45234c, this.f45235d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((w) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f45232a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            aa aaVar = this.f45233b;
            r rVar = (r) this.f45234c;
            this.f45232a = 1;
            if (aa.g(aaVar, rVar, this.f45235d, this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
