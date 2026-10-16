package defpackage;

import j$.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class pnh {
    public static final /* synthetic */ int b = 0;
    private static final yob c = yob.c("com/google/android/apps/gmm/systems/clientparam/api/NavigationParameters");
    private static final xyc d = wub.L(new qbx(1));
    public final acdv a;

    public pnh(acdv acdvVar) {
        wub.L(new lwc(this, 2));
        wub.L(new lwc(this, 3));
        this.a = acdvVar;
    }

    public static void b(List list, acds acdsVar, boolean z, boolean z2, float f, float f2, float f3, float f4, float f5, float f6) {
        abnp abnpVarN = acdt.a.n();
        abnpVarN.t();
        acdt acdtVar = (acdt) abnpVarN.b;
        acdtVar.c = acdsVar.e;
        acdtVar.b |= 1;
        abnpVarN.t();
        acdt acdtVar2 = (acdt) abnpVarN.b;
        acdtVar2.b |= 2;
        acdtVar2.d = z;
        abnpVarN.t();
        acdt acdtVar3 = (acdt) abnpVarN.b;
        acdtVar3.b |= 4;
        acdtVar3.e = z2;
        e(list, abnpVarN, acdsVar, 2, f);
        e(list, abnpVarN, acdsVar, 3, f2);
        e(list, abnpVarN, acdsVar, 4, f3);
        e(list, abnpVarN, acdsVar, 13, f4);
        e(list, abnpVarN, acdsVar, 5, f5);
        e(list, abnpVarN, acdsVar, 6, f6);
    }

    private static final double c(int i) {
        return i * 1.0E-6d;
    }

    private final List d() {
        acdv acdvVar = this.a;
        return acdvVar.K.isEmpty() ? (List) d.gu() : acdvVar.K;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(java.util.List r3, defpackage.abnp r4, defpackage.acds r5, int r6, float r7) {
        /*
            acdq r0 = defpackage.acdq.a
            abnp r0 = r0.n()
            r4.t()
            abnv r1 = r4.b
            acdt r1 = (defpackage.acdt) r1
            acdt r2 = defpackage.acdt.a
            int r2 = r6 + (-1)
            r1.f = r2
            int r2 = r1.b
            r2 = r2 | 8
            r1.b = r2
            abnv r4 = r4.q()
            acdt r4 = (defpackage.acdt) r4
            r0.t()
            abnv r1 = r0.b
            acdq r1 = (defpackage.acdq) r1
            r4.getClass()
            r1.c = r4
            int r4 = r1.b
            r4 = r4 | 1
            r1.b = r4
            acds r4 = defpackage.acds.CAMERA_3D
            r1 = 0
            r2 = 2
            if (r5 == r4) goto L38
            goto L52
        L38:
            r4 = 1115815936(0x42820000, float:65.0)
            if (r6 != r2) goto L3e
        L3c:
            r1 = r4
            goto L52
        L3e:
            r5 = 3
            if (r6 != r5) goto L42
            goto L3c
        L42:
            r5 = 4
            if (r6 != r5) goto L48
            r1 = 1113325568(0x425c0000, float:55.0)
            goto L52
        L48:
            r5 = 13
            if (r6 != r5) goto L4d
            goto L3c
        L4d:
            r4 = 5
            if (r6 != r4) goto L52
            r1 = 1109393408(0x42200000, float:40.0)
        L52:
            acdr r4 = defpackage.acdr.a
            abnp r4 = r4.n()
            r4.t()
            abnv r5 = r4.b
            acdr r5 = (defpackage.acdr) r5
            int r6 = r5.b
            r6 = r6 | 1
            r5.b = r6
            r5.c = r1
            r4.t()
            abnv r5 = r4.b
            acdr r5 = (defpackage.acdr) r5
            int r6 = r5.b
            r6 = r6 | r2
            r5.b = r6
            r5.d = r7
            abnv r4 = r4.q()
            acdr r4 = (defpackage.acdr) r4
            r0.t()
            abnv r5 = r0.b
            acdq r5 = (defpackage.acdq) r5
            r4.getClass()
            r5.d = r4
            int r4 = r5.b
            r4 = r4 | r2
            r5.b = r4
            abnv r4 = r0.q()
            acdq r4 = (defpackage.acdq) r4
            r3.add(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pnh.e(java.util.List, abnp, acds, int, float):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map a(boolean z) {
        vaq.d();
        HashMap map = new HashMap();
        List listD = z ? (List) d.gu() : d();
        Iterator it = listD.iterator();
        while (true) {
            int i = 1;
            if (!it.hasNext()) {
                break;
            }
            acdq acdqVar = (acdq) it.next();
            acdt acdtVar = acdqVar.c;
            if (acdtVar == null) {
                acdtVar = acdt.a;
            }
            acds acdsVarB = acds.b(acdtVar.c);
            if (acdsVarB == null) {
                acdsVarB = acds.UNKNOWN_CAMERA_TYPE;
            }
            boolean z2 = acdtVar.d;
            boolean z3 = acdtVar.e;
            int iAF = a.aF(acdtVar.f);
            if (iAF != 0) {
                i = iAF;
            }
            map.put(new png(acdsVarB, z2, z3, i), acdqVar);
        }
        if (!z) {
            acfo acfoVar = this.a.S;
            if (acfoVar == null) {
                acfoVar = acfo.a;
            }
            for (zkg zkgVar : acfoVar.b) {
                if (new abof(zkgVar.e, zkg.a).contains(zkd.LEGACY_CAMERA_SURFACE)) {
                    zkf zkfVar = zkgVar.c;
                    if (zkfVar == null) {
                        zkfVar = zkf.a;
                    }
                    int iAp = a.ap(zkfVar.b);
                    if (iAp == 0) {
                        iAp = 1;
                    }
                    int i2 = iAp - 1;
                    yfq yfqVar = (yfq) Collection.EL.stream(i2 != 1 ? i2 != 2 ? yfq.q(acds.UNKNOWN_CAMERA_TYPE) : yfq.r(acds.CAMERA_2D_HEADING_UP, acds.CAMERA_2D_NORTH_UP) : yfq.q(acds.CAMERA_3D)).map(new mix(zkfVar, 15)).collect(ycm.a);
                    zke zkeVar = zkgVar.d;
                    if (zkeVar == null) {
                        zkeVar = zke.a;
                    }
                    abnp abnpVarN = acdr.a.n();
                    float f = zkeVar.b;
                    abnpVarN.t();
                    acdr acdrVar = (acdr) abnpVarN.b;
                    acdrVar.b |= 1;
                    acdrVar.c = f;
                    float f2 = zkeVar.c;
                    abnpVarN.t();
                    acdr acdrVar2 = (acdr) abnpVarN.b;
                    acdrVar2.b |= 2;
                    acdrVar2.d = f2;
                    acdr acdrVar3 = (acdr) abnpVarN.q();
                    ynp ynpVarListIterator = yfqVar.listIterator(0);
                    while (ynpVarListIterator.hasNext()) {
                        acdt acdtVar2 = (acdt) ynpVarListIterator.next();
                        abnp abnpVarN2 = acdq.a.n();
                        abnpVarN2.t();
                        acdq acdqVar2 = (acdq) abnpVarN2.b;
                        acdtVar2.getClass();
                        acdqVar2.c = acdtVar2;
                        acdqVar2.b |= 1;
                        abnpVarN2.t();
                        acdq acdqVar3 = (acdq) abnpVarN2.b;
                        acdrVar3.getClass();
                        acdqVar3.d = acdrVar3;
                        acdqVar3.b |= 2;
                        acdq acdqVar4 = (acdq) abnpVarN2.q();
                        acds acdsVarB2 = acds.b(acdtVar2.c);
                        if (acdsVarB2 == null) {
                            acdsVarB2 = acds.UNKNOWN_CAMERA_TYPE;
                        }
                        boolean z4 = acdtVar2.d;
                        boolean z5 = acdtVar2.e;
                        int iAF2 = a.aF(acdtVar2.f);
                        if (iAF2 == 0) {
                            iAF2 = 1;
                        }
                        map.put(new png(acdsVarB2, z4, z5, iAF2), acdqVar4);
                    }
                }
            }
        }
        yob yobVar = c;
        ((ynz) ((ynz) yobVar.f()).ai(6798)).w("NavigationParameters.getParametersMap() paramsList size = %d", listD.size());
        ((ynz) ((ynz) yobVar.f()).ai(6799)).w("NavigationParameters.getParametersMap() cameraParametersMap size = %d", map.size());
        return map;
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        acdv acdvVar = this.a;
        xxgVarAo.d("hmmBaselineTransitionLikelihood", Math.pow(10.0d, (-acdvVar.b) * 0.1d));
        xxgVarAo.d("hmmOffTheRoadLikelihoodThreshold", c(acdvVar.c));
        xxgVarAo.f("hmmNumCandidatesToKeep", acdvVar.d);
        xxgVarAo.f("hmmMaxRoadNetworkRadiusMeters", acdvVar.e);
        xxgVarAo.f("hmmConnectivityToleranceWorld", acdvVar.f);
        xxgVarAo.f("hmmRouteMatchingToleranceWorld", acdvVar.g);
        xxgVarAo.f("hmmRoadNetworkBearingErrorStdDeg", acdvVar.h);
        xxgVarAo.d("hmmRouteLikelihoodWeight", c(acdvVar.i));
        xxgVarAo.d("hmmTunnelEmissionLikelihood", c(acdvVar.j));
        xxgVarAo.f("bearingNoiseThresholdCentimetersPerSec", acdvVar.k);
        xxgVarAo.f("bearingNoiseSpeedFalloffMs", acdvVar.l);
        xxgVarAo.f("gpsMinUpdateIntervalMs", acdvVar.m);
        xxgVarAo.f("navFirstTripUpdateIntervalSeconds", acdvVar.E);
        xxgVarAo.f("navTripUpdateIntervalSeconds", acdvVar.D);
        xxgVarAo.f("maxNavTripUpdateIntervalSeconds", acdvVar.I);
        xxgVarAo.f("navTrafficValidityPeriodSeconds", acdvVar.n);
        xxgVarAo.f("navTrafficStatusDistanceKm", acdvVar.o);
        xxgVarAo.d("navOnRouteConfidenceThreshold", c(acdvVar.p));
        xxgVarAo.f("prefetcherMaxKm", acdvVar.q);
        xxgVarAo.f("prefetcherMaxTilesPerRequest", acdvVar.r);
        xxgVarAo.f("prefetcherCacheProcessingDelayMs", acdvVar.s);
        xxgVarAo.f("prefetcherFetchProcessingDelayMs", acdvVar.t);
        xxgVarAo.f("vectorMinIconHeightForScalingPx", acdvVar.u);
        xxgVarAo.h("controllerUseAnimation", acdvVar.v);
        xxgVarAo.f("voiceRmiEnablePercent", acdvVar.w);
        xxgVarAo.f("offlineReroutingEnablePercent", acdvVar.x);
        xxgVarAo.h("disablePowerManager", acdvVar.y);
        xxgVarAo.f("polylineSnappingRerouteBaseMeters", acdvVar.z);
        xxgVarAo.h("rasterMaps", acdvVar.A);
        xxgVarAo.h("disableIndoorMaps", acdvVar.B);
        xxgVarAo.h("disableImplicitDirectionSearch", acdvVar.C);
        xxgVarAo.f("betterTripPromptTimeoutSeconds", acdvVar.F);
        xxgVarAo.f("estimatedBatteryLifeSeconds", acdvVar.G);
        xxgVarAo.f("predictedBatteryDrainPercentToTriggerPowerSavings", acdvVar.H);
        xxgVarAo.f("maxUseTrafficInSavedDirectionsSeconds", acdvVar.J);
        xxgVarAo.b("cameraParameters", d());
        xxgVarAo.h("enableGreyOutSelectedRoute", acdvVar.P);
        xxgVarAo.h("enableNavToAddAStop", acdvVar.Q);
        xxgVarAo.h("enableCompassInNavigation", acdvVar.L);
        acdu acduVarB = acdu.b(acdvVar.R);
        if (acduVarB == null) {
            acduVarB = acdu.UNKNOWN_NAVIGATION_SDK_LOG_MECHANISM;
        }
        xxgVarAo.b("getNavigationSdkLogMechanism", acduVarB);
        return xxgVarAo.toString();
    }
}
