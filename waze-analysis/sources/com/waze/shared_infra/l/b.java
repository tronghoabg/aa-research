package com.waze.shared_infra.l;

import android.location.Location;
import com.waze.bg.d.d;
import com.waze.bg.d.g;
import com.waze.bg.d.h;
import com.waze.shared_infra.h.c;
import com.waze.web.r;
import h.g.b.x;
import h.k;
import i.b.l.cz;
import i.b.l.da;
import i.b.q;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {
    public static final float a(c cVar, c cVar2) {
        x.f(cVar, "<this>");
        x.f(cVar2, "destination");
        return c(cVar).bearingTo(c(cVar2));
    }

    public static final Float b(a aVar) {
        x.f(aVar, "<this>");
        k kVar = aVar.g() ? new k(aVar.f(), aVar.e()) : new k(aVar.e(), aVar.f());
        return Float.valueOf(a((c) kVar.a(), (c) kVar.b()));
    }

    static /* synthetic */ Location c(c cVar) {
        Location location = new Location((String) null);
        location.setLatitude(cVar.a());
        location.setLongitude(cVar.b());
        return location;
    }

    public static final String d(String str) {
        x.f(str, "<this>");
        if (str.length() == 0) {
            return str;
        }
        return "\u200e" + str + "\u2068";
    }

    public static final com.waze.sharedui.f.k e() {
        return (com.waze.sharedui.f.k) r.m(com.waze.sharedui.f.k.class);
    }

    public static final d f(com.waze.sharedui.e.c cVar) {
        com.waze.sharedui.e.b bVarC;
        x.f(cVar, "<this>");
        com.waze.bg.d.c cVarNewBuilder = d.newBuilder();
        cz czVarNewBuilder = da.newBuilder();
        q qVarNewBuilder = i.b.r.newBuilder();
        qVarNewBuilder.b(cVar.f().c());
        qVarNewBuilder.c(cVar.f().d());
        qVarNewBuilder.a(cVar.d());
        czVarNewBuilder.a(qVarNewBuilder.build());
        czVarNewBuilder.b(cVar.c());
        Long lI = cVar.i();
        czVarNewBuilder.c(lI != null ? com.waze.settings.h.c.h(lI.longValue()) : 0L);
        cVarNewBuilder.a(czVarNewBuilder.build());
        com.waze.sharedui.e.a aVarG = cVar.g();
        if (aVarG != null && (bVarC = aVarG.c()) != null) {
            g gVarNewBuilder = h.newBuilder();
            gVarNewBuilder.a((int) bVarC.a());
            gVarNewBuilder.b((int) bVarC.b());
            cVarNewBuilder.b(gVarNewBuilder.build());
        }
        d dVarBuild = cVarNewBuilder.build();
        x.e(dVarBuild, "build(...)");
        return dVarBuild;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.waze.sharedui.e.c g(android.location.Location r11) {
        /*
            java.lang.String r0 = "<this>"
            h.g.b.x.f(r11, r0)
            java.lang.String r0 = r11.getProvider()
            if (r0 != 0) goto Ld
            java.lang.String r0 = ""
        Ld:
            int r1 = r0.hashCode()
            r2 = 102570(0x190aa, float:1.43731E-40)
            if (r1 == r2) goto L37
            r2 = 97798435(0x5d44923, float:1.996325E-35)
            if (r1 == r2) goto L2c
            r2 = 1843485230(0x6de15a2e, float:8.7178935E27)
            if (r1 == r2) goto L21
            goto L42
        L21:
            java.lang.String r1 = "network"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L42
            com.waze.sharedui.e.d r0 = com.waze.sharedui.e.d.f38881e
            goto L44
        L2c:
            java.lang.String r1 = "fused"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L42
            com.waze.sharedui.e.d r0 = com.waze.sharedui.e.d.f38879c
            goto L44
        L37:
            java.lang.String r1 = "gps"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L42
            com.waze.sharedui.e.d r0 = com.waze.sharedui.e.d.f38878b
            goto L44
        L42:
            com.waze.sharedui.e.d r0 = com.waze.sharedui.e.d.f38877a
        L44:
            r8 = r0
            com.waze.shared_infra.h.c r2 = new com.waze.shared_infra.h.c
            double r0 = r11.getLatitude()
            double r3 = r11.getLongitude()
            r2.<init>(r0, r3)
            double r0 = r11.getAltitude()
            int r3 = (int) r0
            h.o.c r0 = h.o.a.f48264a
            long r0 = r11.getTime()
            h.o.d r4 = h.o.d.f48272c
            long r0 = h.o.c.j(r0, r4)
            long r0 = h.o.a.p(r0)
            float r4 = r11.getSpeed()
            float r5 = r11.getBearing()
            float r11 = r11.getAccuracy()
            int r6 = (int) r11
            r9 = r0
            com.waze.sharedui.e.c r1 = new com.waze.sharedui.e.c
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            r9 = 64
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.shared_infra.l.b.g(android.location.Location):com.waze.sharedui.e.c");
    }
}
