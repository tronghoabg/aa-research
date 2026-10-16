package com.waze.nightmode;

import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class f extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f32462a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f32463b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(i iVar, long j2, h.c.e eVar) {
        super(2, eVar);
        this.f32462a = iVar;
        this.f32463b = j2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new f(this.f32462a, this.f32463b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((f) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        i iVar = this.f32462a;
        NightModeDaylightTime nightModeDaylightTimeC = i.c(iVar);
        if (nightModeDaylightTimeC != null) {
            long j2 = this.f32463b;
            if (j2 - nightModeDaylightTimeC.getTimestampMs() <= iVar.f32471c) {
                return nightModeDaylightTimeC;
            }
            iVar.f32469a.g("entry too old " + nightModeDaylightTimeC + ", now=" + j2);
        }
        return null;
    }
}
