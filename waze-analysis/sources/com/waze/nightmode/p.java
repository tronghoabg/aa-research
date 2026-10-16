package com.waze.nightmode;

import android.location.Location;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class p extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f32485a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f32486b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f32487c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(WazeDaylightTimeProvider wazeDaylightTimeProvider, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f32487c = i2;
        this.f32486b = wazeDaylightTimeProvider;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f32487c;
        Object obj2 = this.f32486b;
        return i2 != 0 ? new p((WazeDaylightTimeProvider) obj2, eVar, 1) : new p((i) obj2, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f32487c != 0 ? ((p) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((p) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f32487c == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f32485a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj2 = this.f32486b;
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.f32485a = 1;
                obj = aj.v(av.b(), new f((i) obj2, jCurrentTimeMillis, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            NightModeDaylightTime nightModeDaylightTime = (NightModeDaylightTime) obj;
            t tVar = t.f32494a;
            com.waze.shared_infra.i.e eVarL = t.l();
            Objects.toString(nightModeDaylightTime);
            eVarL.e("loaded daytime data: ".concat(String.valueOf(nightModeDaylightTime)));
            if (nightModeDaylightTime != null) {
                t.k().c(nightModeDaylightTime);
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        int i2 = this.f32485a;
        e.b.c.b(obj);
        while (true) {
            Location lastLocation = com.waze.location.z.a().getLastLocation();
            Object obj3 = this.f32486b;
            if (lastLocation == null) {
                ((WazeDaylightTimeProvider) obj3).f32434a.a("location is unavailable");
                this.f32485a = 1;
                if (aj.q(2000L, this) == aVar2) {
                    break;
                }
            } else {
                double latitude = lastLocation.getLatitude();
                double longitude = lastLocation.getLongitude();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                WazeDaylightTimeProvider wazeDaylightTimeProvider = (WazeDaylightTimeProvider) obj3;
                NightModeDaylightTime daylightTimeNTV = wazeDaylightTimeProvider.getDaylightTimeNTV(latitude, longitude, System.currentTimeMillis() / 1000);
                if (daylightTimeNTV != null) {
                    com.waze.shared_infra.i.e eVar = wazeDaylightTimeProvider.f32434a;
                    Objects.toString(daylightTimeNTV);
                    eVar.a("updating daylightTime=".concat(daylightTimeNTV.toString()));
                    wazeDaylightTimeProvider.b().e(daylightTimeNTV);
                } else {
                    wazeDaylightTimeProvider.f32434a.g("failed to get daylight time");
                }
                this.f32485a = 2;
                if (aj.q(60000L, this) == aVar2) {
                    break;
                }
            }
        }
        return aVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(i iVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f32487c = i2;
        this.f32486b = iVar;
    }
}
