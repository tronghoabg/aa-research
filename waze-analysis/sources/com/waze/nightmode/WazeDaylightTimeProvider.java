package com.waze.nightmode;

import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class WazeDaylightTimeProvider {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32434a;

    /* renamed from: b, reason: collision with root package name */
    private final NightModeDaylightTime f32435b;

    /* renamed from: c, reason: collision with root package name */
    private final bn f32436c;

    public WazeDaylightTimeProvider(com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(eVar, "logger");
        this.f32434a = eVar;
        NightModeDaylightTime nightModeDaylightTime = new NightModeDaylightTime(0L, 0L, 0L);
        this.f32435b = nightModeDaylightTime;
        this.f32436c = ck.b(nightModeDaylightTime);
    }

    public final bn b() {
        return this.f32436c;
    }

    public final void c(NightModeDaylightTime nightModeDaylightTime) {
        bn bnVar;
        Object objD;
        NightModeDaylightTime nightModeDaylightTime2;
        h.g.b.x.f(nightModeDaylightTime, "newTime");
        do {
            bnVar = this.f32436c;
            objD = bnVar.d();
            nightModeDaylightTime2 = (NightModeDaylightTime) objD;
            if (true == h.g.b.x.n(nightModeDaylightTime2, this.f32435b)) {
                nightModeDaylightTime2 = nightModeDaylightTime;
            }
        } while (!bnVar.f(objD, nightModeDaylightTime2));
    }

    public final native NightModeDaylightTime getDaylightTimeNTV(double d2, double d3, long j2);
}
