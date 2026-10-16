package com.waze.an.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ay extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f14413a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f14414b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bb f14415c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f14416d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(kotlinx.coroutines.b.k kVar, h.c.e eVar, bb bbVar) {
        super(2, eVar);
        this.f14414b = kVar;
        this.f14415c = bbVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ay ayVar = new ay(this.f14414b, eVar, this.f14415c);
        ayVar.f14416d = obj;
        return ayVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ay) create((kotlinx.coroutines.b.l) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f14413a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.b.l lVar = (kotlinx.coroutines.b.l) this.f14416d;
            this.f14413a = 1;
            if (this.f14414b.collect(new ax(lVar, this.f14415c, 0), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
