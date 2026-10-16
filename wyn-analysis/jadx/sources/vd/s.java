package vd;

import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import java.util.List;
import java.util.Map;
import md.AbstractC3556y;
import md.O;
import md.P;
import md.Q;
import md.d0;
import md.k0;
import od.AbstractC3719r0;
import od.R1;
import od.S1;

/* loaded from: classes5.dex */
public final class s extends P {
    public static d0 d(Map map) {
        int i5;
        S3.i iVar;
        W9.u uVar;
        Integer num;
        Integer num2;
        Long lI = AbstractC3719r0.i("interval", map);
        Long lI2 = AbstractC3719r0.i("baseEjectionTime", map);
        Long lI3 = AbstractC3719r0.i("maxEjectionTime", map);
        Integer numF = AbstractC3719r0.f("maxEjectionPercentage", map);
        Long lValueOf = lI != null ? lI : Long.valueOf(RealConnection.IDLE_CONNECTION_HEALTHY_NS);
        Long l10 = lI2 != null ? lI2 : 30000000000L;
        Long l11 = lI3 != null ? lI3 : 300000000000L;
        Integer num3 = numF != null ? numF : 10;
        Map mapG = AbstractC3719r0.g("successRateEjection", map);
        List list = null;
        if (mapG != null) {
            Integer num4 = 100;
            i5 = 5;
            Integer numF2 = AbstractC3719r0.f("stdevFactor", mapG);
            Integer numF3 = AbstractC3719r0.f("enforcementPercentage", mapG);
            Integer numF4 = AbstractC3719r0.f("minimumHosts", mapG);
            Integer numF5 = AbstractC3719r0.f("requestVolume", mapG);
            Integer num5 = numF2 != null ? numF2 : 1900;
            if (numF3 != null) {
                Fe.e.q(numF3.intValue() >= 0 && numF3.intValue() <= 100);
                num = numF3;
            } else {
                num = num4;
            }
            if (numF4 != null) {
                Fe.e.q(numF4.intValue() >= 0);
                num2 = numF4;
            } else {
                num2 = 5;
            }
            if (numF5 != null) {
                Fe.e.q(numF5.intValue() >= 0);
                num4 = numF5;
            }
            iVar = new S3.i(num5, num, num2, num4);
        } else {
            i5 = 5;
            iVar = null;
        }
        Map mapG2 = AbstractC3719r0.g("failurePercentageEjection", map);
        if (mapG2 != null) {
            Integer num6 = 85;
            Integer num7 = 100;
            Integer numValueOf = Integer.valueOf(i5);
            Integer numF6 = AbstractC3719r0.f("threshold", mapG2);
            Integer numF7 = AbstractC3719r0.f("enforcementPercentage", mapG2);
            Integer numF8 = AbstractC3719r0.f("minimumHosts", mapG2);
            Integer numF9 = AbstractC3719r0.f("requestVolume", mapG2);
            if (numF6 != null) {
                Fe.e.q(numF6.intValue() >= 0 && numF6.intValue() <= 100);
                num6 = numF6;
            }
            if (numF7 != null) {
                Fe.e.q(numF7.intValue() >= 0 && numF7.intValue() <= 100);
                num7 = numF7;
            }
            if (numF8 != null) {
                Fe.e.q(numF8.intValue() >= 0);
                numValueOf = numF8;
            }
            if (numF9 != null) {
                Fe.e.q(numF9.intValue() >= 0);
            } else {
                numF9 = 50;
            }
            uVar = new W9.u(num6, num7, numValueOf, numF9);
        } else {
            uVar = null;
        }
        List listC = AbstractC3719r0.c("childPolicy", map);
        if (listC != null) {
            AbstractC3719r0.a(listC);
            list = listC;
        }
        List listT = S1.t(list);
        if (listT == null || listT.isEmpty()) {
            return new d0(k0.f40681m.h("No child policy in outlier_detection_experimental LB policy: " + map));
        }
        d0 d0VarS = S1.s(listT, Q.b());
        if (d0VarS.f40632a != null) {
            return d0VarS;
        }
        R1 r12 = (R1) d0VarS.f40633b;
        Fe.e.x(r12 != null);
        Fe.e.x(r12 != null);
        return new d0(new m(lValueOf, l10, l11, num3, iVar, uVar, r12));
    }

    @Override // md.P
    public final String a() {
        return "outlier_detection_experimental";
    }

    @Override // md.P
    public final O b(AbstractC3556y abstractC3556y) {
        return new r(abstractC3556y);
    }

    @Override // md.P
    public final d0 c(Map map) {
        try {
            return d(map);
        } catch (RuntimeException e7) {
            return new d0(k0.f40682n.g(e7).h("Failed parsing configuration for outlier_detection_experimental"));
        }
    }
}
