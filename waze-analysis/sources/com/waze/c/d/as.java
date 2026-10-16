package com.waze.c.d;

import android.location.Location;
import com.waze.location.bf;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class as {

    /* renamed from: a, reason: collision with root package name */
    private final long f18323a;

    public /* synthetic */ as() {
        h.o.c cVar = h.o.a.f48264a;
        this.f18323a = h.o.c.j(5000L, h.o.d.f48272c);
    }

    public final ar a(com.waze.modules.c.ar arVar, long j2) {
        h.g.b.x.f(arVar, "route");
        long jQ = h.o.a.q(com.waze.settings.h.c.e(arVar.b()), com.waze.settings.h.c.e(j2));
        return h.o.a.p(h.o.a.j(jQ)) <= h.o.a.p(h.o.c.j(this.f18323a, h.o.d.f48274e)) ? new ap(jQ) : h.o.a.p(jQ) > 0 ? new aq(h.o.a.j(jQ)) : new ao(h.o.a.j(jQ));
    }

    public final boolean b(Location location, bf bfVar, com.waze.location.t tVar, com.waze.shared_infra.q.e eVar) {
        h.g.b.x.f(location, "newLocation");
        h.g.b.x.f(bfVar, "source");
        h.g.b.x.f(tVar, "state");
        h.g.b.x.f(eVar, "clock");
        Location location2 = (Location) tVar.e().get(tVar.d());
        h.o.c cVar = h.o.a.f48264a;
        int iC = h.o.a.c(h.o.c.j(eVar.a() - tVar.a(), h.o.d.f48272c), this.f18323a);
        if (bfVar == tVar.d()) {
            return true;
        }
        if (location2 != null && location.getTime() <= location2.getTime()) {
            return false;
        }
        if (iC <= 0 && location2 != null) {
            return !location2.hasAccuracy() ? location.hasAccuracy() : location.hasAccuracy() && location.getAccuracy() < location2.getAccuracy();
        }
        return true;
    }

    public final Location c(Location location, bf bfVar, Location location2) {
        h.g.b.x.f(location, "location");
        h.g.b.x.f(bfVar, "source");
        if (bfVar == bf.f25346d && !location.hasSpeed() && location2 != null) {
            h.o.c cVar = h.o.a.f48264a;
            long j2 = h.o.c.j(location.getTime() - location2.getTime(), h.o.d.f48272c);
            long j3 = h.o.c.j(location.getElapsedRealtimeNanos() - location2.getElapsedRealtimeNanos(), h.o.d.f48270a);
            long j4 = this.f18323a;
            if (h.o.a.c(j3, j4) <= 0 || h.o.a.c(j2, j4) <= 0) {
                Location location3 = new Location(location);
                location3.setSpeed(location2.getSpeed());
                if (location2.hasSpeedAccuracy()) {
                    location3.setSpeedAccuracyMetersPerSecond(location2.getSpeedAccuracyMetersPerSecond());
                }
                return location3;
            }
        }
        return location;
    }

    public as(long j2) {
        this.f18323a = j2;
    }

    public /* synthetic */ as(byte[] bArr) {
        h.o.c cVar = h.o.a.f48264a;
        this.f18323a = h.o.c.j(2000L, h.o.d.f48272c);
    }
}
