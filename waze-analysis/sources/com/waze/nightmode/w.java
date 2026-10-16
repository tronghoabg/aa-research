package com.waze.nightmode;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class w extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ int f32507a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ae f32508b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(ae aeVar, h.c.e eVar) {
        super(2, eVar);
        this.f32508b = aeVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        w wVar = new w(this.f32508b, eVar);
        wVar.f32507a = ((Number) obj).intValue();
        return wVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((w) create(Integer.valueOf(((Number) obj).intValue()), (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        int i2 = this.f32507a;
        this.f32508b.f32452a.a("settings AppCompatDelegate night mode, mode=" + i2);
        android.support.v7.app.t.s(i2);
        return h.ab.f48028a;
    }
}
