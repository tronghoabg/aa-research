package com.waze.ai;

import android.location.Location;
import com.waze.sharedui.utils.o;
import com.waze.stats.ax;
import h.a.r;
import h.g.b.x;
import l.a.aax;
import l.a.bje;
import l.a.bjf;
import l.a.bjg;
import l.a.bjh;
import l.a.bji;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    private final ax f14069b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f14070c;

    public e(ax axVar, com.waze.shared_infra.q.e eVar) {
        x.f(axVar, "statsReporter");
        x.f(eVar, "clock");
        this.f14069b = axVar;
        this.f14070c = eVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void c(com.waze.shared_infra.s.c r5, android.location.Location r6) {
        /*
            r4 = this;
            l.a.afw r0 = l.a.afx.newBuilder()
            double r1 = r6.getLongitude()
            r0.b(r1)
            double r1 = r6.getLatitude()
            r0.a(r1)
            com.google.v.du r0 = r0.build()
            java.lang.String r1 = "build(...)"
            h.g.b.x.e(r0, r1)
            l.a.afx r0 = (l.a.afx) r0
            r5.ac(r0)
            double r0 = r6.getAltitude()
            r5.aa(r0)
            float r0 = r6.getAccuracy()
            double r0 = (double) r0
            r5.ad(r0)
            float r0 = r6.getSpeed()
            double r0 = (double) r0
            r5.af(r0)
            float r0 = r6.getBearing()
            double r0 = (double) r0
            r5.ab(r0)
            long r0 = r6.getTime()
            r5.Z(r0)
            com.waze.shared_infra.q.e r4 = r4.f14070c
            long r0 = r4.a()
            long r2 = r6.getTime()
            long r0 = r0 - r2
            r5.ag(r0)
            java.lang.String r4 = r6.getProvider()
            if (r4 == 0) goto L67
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toUpperCase(r0)
            java.lang.String r0 = "toUpperCase(...)"
            h.g.b.x.e(r4, r0)
            goto L68
        L67:
            r4 = 0
        L68:
            if (r4 == 0) goto L9e
            int r0 = r4.hashCode()
            switch(r0) {
                case -1733499378: goto L93;
                case 70794: goto L88;
                case 67260675: goto L7d;
                case 1272728959: goto L72;
                default: goto L71;
            }
        L71:
            goto L9e
        L72:
            java.lang.String r0 = "CAR_GPS"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L9e
            l.a.bjd r4 = l.a.bjd.CAR_GPS
            goto La0
        L7d:
            java.lang.String r0 = "FUSED"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L9e
            l.a.bjd r4 = l.a.bjd.FUSED
            goto La0
        L88:
            java.lang.String r0 = "GPS"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L9e
            l.a.bjd r4 = l.a.bjd.GPS
            goto La0
        L93:
            java.lang.String r0 = "NETWORK"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L9e
            l.a.bjd r4 = l.a.bjd.NETWORK
            goto La0
        L9e:
            l.a.bjd r4 = l.a.bjd.LOCATION_PROVIDER_UNSPECIFIED
        La0:
            r5.ae(r4)
            float r4 = k.x$$ExternalSyntheticApiModelOutline0.m(r6)
            double r0 = (double) r4
            r5.ah(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ai.e.c(com.waze.shared_infra.s.c, android.location.Location):void");
    }

    @Override // com.waze.ai.d
    public final void a(Location location) {
        com.waze.sharedui.d.a.b bVarC = e.c.b.c(aax.newBuilder());
        bjf bjfVarNewBuilder = bjg.newBuilder();
        x.f(bjfVarNewBuilder, "builder");
        com.waze.shared_infra.s.c cVarD = r.D(bje.newBuilder());
        if (location != null) {
            c(cVarD, location);
        }
        ax axVar = this.f14069b;
        bje bjeVarY = cVarD.Y();
        x.f(bjeVarY, "value");
        bjfVarNewBuilder.a(bjeVarY);
        bjg bjgVarBuild = bjfVarNewBuilder.build();
        x.e(bjgVarBuild, "build(...)");
        bVarC.E(bjgVarBuild);
        o.r(axVar, bVarC.C());
    }

    @Override // com.waze.ai.d
    public final void b(Location location) {
        com.waze.sharedui.d.a.b bVarC = e.c.b.c(aax.newBuilder());
        bjh bjhVarNewBuilder = bji.newBuilder();
        x.f(bjhVarNewBuilder, "builder");
        com.waze.shared_infra.s.c cVarD = r.D(bje.newBuilder());
        if (location != null) {
            c(cVarD, location);
        }
        ax axVar = this.f14069b;
        bje bjeVarY = cVarD.Y();
        x.f(bjeVarY, "value");
        bjhVarNewBuilder.a(bjeVarY);
        bji bjiVarBuild = bjhVarNewBuilder.build();
        x.e(bjiVarBuild, "build(...)");
        bVarC.F(bjiVarBuild);
        o.r(axVar, bVarC.C());
    }
}
