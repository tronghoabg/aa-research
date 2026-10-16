package com.waze.car_lib.r.c.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private final a f21141a;

    public d(a aVar) {
        x.f(aVar, "predictionCardConfigDataSource");
        this.f21141a = aVar;
    }

    private final com.waze.main_screen.u.a.d c(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -955687173) {
            if (iHashCode != 2402104) {
                if (iHashCode == 79826725 && str.equals("TIMER")) {
                    long jB = this.f21141a.b();
                    if (jB <= 0) {
                        return com.waze.main_screen.u.a.a.f27651a;
                    }
                    h.o.c cVar = h.o.a.f48264a;
                    return new com.waze.main_screen.u.a.c(h.o.c.j(jB, h.o.d.f48273d));
                }
            } else if (str.equals("NONE")) {
                return com.waze.main_screen.u.a.a.f27651a;
            }
        } else if (str.equals("ROAMING_TIMEOUT")) {
            long jA = this.f21141a.a();
            if (jA <= 0) {
                return com.waze.main_screen.u.a.a.f27651a;
            }
            h.o.c cVar2 = h.o.a.f48264a;
            return new com.waze.main_screen.u.a.b(h.o.c.j(jA, h.o.d.f48273d));
        }
        return com.waze.main_screen.u.a.a.f27651a;
    }

    @Override // com.waze.car_lib.r.c.a.c
    public final com.waze.main_screen.u.a.d a() {
        return c(this.f21141a.c());
    }

    @Override // com.waze.car_lib.r.c.a.c
    public final com.waze.main_screen.u.a.d b() {
        return c(this.f21141a.d());
    }
}
