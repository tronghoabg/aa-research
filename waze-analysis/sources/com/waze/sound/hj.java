package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class hj extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f40143a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ hl f40144b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ gz f40145c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    hj(hl hlVar, gz gzVar, h.c.e eVar) {
        super(2, eVar);
        this.f40144b = hlVar;
        this.f40145c = gzVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new hj(this.f40144b, this.f40145c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((hj) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f40143a != 0) {
            e.b.c.b(obj);
            return obj;
        }
        e.b.c.b(obj);
        this.f40143a = 1;
        Object objD = kotlinx.coroutines.aj.d(new hi(this.f40144b, this.f40145c, null), this);
        return objD == aVar ? aVar : objD;
    }
}
