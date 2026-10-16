package com.waze.nightmode;

import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class s extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f32491a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f32492b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f32493c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(i iVar, h.c.e eVar) {
        super(2, eVar);
        this.f32493c = iVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        s sVar = new s(this.f32493c, eVar);
        sVar.f32492b = obj;
        return sVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((s) create((NightModeDaylightTime) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f32491a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            NightModeDaylightTime nightModeDaylightTime = (NightModeDaylightTime) this.f32492b;
            t tVar = t.f32494a;
            com.waze.shared_infra.i.e eVarL = t.l();
            Objects.toString(nightModeDaylightTime);
            eVarL.e("storing daytime data: ".concat(String.valueOf(nightModeDaylightTime)));
            this.f32491a = 1;
            if (this.f32493c.f(nightModeDaylightTime, this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
