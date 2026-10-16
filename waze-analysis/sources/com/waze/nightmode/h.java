package com.waze.nightmode;

import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class h extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f32467a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ NightModeDaylightTime f32468b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(i iVar, NightModeDaylightTime nightModeDaylightTime, h.c.e eVar) {
        super(2, eVar);
        this.f32467a = iVar;
        this.f32468b = nightModeDaylightTime;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new h(this.f32467a, this.f32468b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((h) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        i iVar = this.f32467a;
        String strH = iVar.f32472d.h(this.f32468b);
        com.waze.shared_infra.b.a aVar2 = iVar.f32470b;
        byte[] bytes = strH.getBytes(h.n.a.f48221b);
        h.g.b.x.e(bytes, "getBytes(...)");
        aVar2.b(bytes);
        iVar.f32469a.e("daylight time stored");
        return h.ab.f48028a;
    }
}
