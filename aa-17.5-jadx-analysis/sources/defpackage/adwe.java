package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.text.ParseException;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class adwe {
    static final adiv a = new adiv("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", null);
    final Long b;
    final Boolean c;
    final Integer d;
    final Integer e;
    final adyh f;
    final aduf g;

    public adwe(Map map, boolean z) throws NumberFormatException, ParseException {
        boolean z2;
        long j;
        adyh adyhVar;
        aduf adufVar;
        this.b = adqq.u(map, "timeout");
        this.c = adqq.r(map, "waitForReady");
        Integer numT = adqq.t(map, "maxResponseMessageBytes");
        this.d = numT;
        if (numT != null) {
            woy.S(numT.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", numT);
        }
        Integer numT2 = adqq.t(map, "maxRequestMessageBytes");
        this.e = numT2;
        if (numT2 != null) {
            woy.S(numT2.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", numT2);
        }
        Map mapZ = z ? adqq.z(map, "retryPolicy") : null;
        if (mapZ == null) {
            j = 0;
            adyhVar = null;
            z2 = true;
        } else {
            Integer numT3 = adqq.t(mapZ, "maxAttempts");
            numT3.getClass();
            int iIntValue = numT3.intValue();
            woy.Q(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
            int iMin = Math.min(iIntValue, 5);
            Long lU = adqq.u(mapZ, "initialBackoff");
            lU.getClass();
            long jLongValue = lU.longValue();
            woy.R(jLongValue > 0, "initialBackoffNanos must be greater than 0: %s", jLongValue);
            Long lU2 = adqq.u(mapZ, "maxBackoff");
            lU2.getClass();
            z2 = true;
            long jLongValue2 = lU2.longValue();
            woy.R(jLongValue2 > 0, "maxBackoff must be greater than 0: %s", jLongValue2);
            Double dS = adqq.s(mapZ, "backoffMultiplier");
            dS.getClass();
            double dDoubleValue = dS.doubleValue();
            j = 0;
            woy.S(dDoubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", dS);
            Long lU3 = adqq.u(mapZ, "perAttemptRecvTimeout");
            woy.S(lU3 == null || lU3.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", lU3);
            Set setA = adzo.a(mapZ, "retryableStatusCodes");
            wub.I(setA != null, "%s is required in retry policy", "retryableStatusCodes");
            wub.I(!setA.contains(adnn.OK), "%s must not contain OK", "retryableStatusCodes");
            woy.O((lU3 == null && setA.isEmpty()) ? false : true, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            adyhVar = new adyh(iMin, jLongValue, jLongValue2, dDoubleValue, lU3, setA);
        }
        this.f = adyhVar;
        Map mapZ2 = z ? adqq.z(map, "hedgingPolicy") : null;
        if (mapZ2 == null) {
            adufVar = null;
        } else {
            Integer numT4 = adqq.t(mapZ2, "maxAttempts");
            numT4.getClass();
            int iIntValue2 = numT4.intValue();
            woy.Q(iIntValue2 >= 2 ? z2 : false, "maxAttempts must be greater than 1: %s", iIntValue2);
            int iMin2 = Math.min(iIntValue2, 5);
            Long lU4 = adqq.u(mapZ2, "hedgingDelay");
            lU4.getClass();
            long jLongValue3 = lU4.longValue();
            woy.R(jLongValue3 >= j ? z2 : false, "hedgingDelay must not be negative: %s", jLongValue3);
            Set setA2 = adzo.a(mapZ2, "nonFatalStatusCodes");
            if (setA2 == null) {
                setA2 = DesugarCollections.unmodifiableSet(EnumSet.noneOf(adnn.class));
            } else {
                wub.I(!setA2.contains(adnn.OK), "%s must not contain OK", "nonFatalStatusCodes");
            }
            adufVar = new aduf(iMin2, jLongValue3, setA2);
        }
        this.g = adufVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adwe)) {
            return false;
        }
        adwe adweVar = (adwe) obj;
        return Objects.equals(this.b, adweVar.b) && Objects.equals(this.c, adweVar.c) && Objects.equals(this.d, adweVar.d) && Objects.equals(this.e, adweVar.e) && Objects.equals(this.f, adweVar.f) && Objects.equals(this.g, adweVar.g);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("timeoutNanos", this.b);
        xxgVarAo.b("waitForReady", this.c);
        xxgVarAo.b("maxInboundMessageSize", this.d);
        xxgVarAo.b("maxOutboundMessageSize", this.e);
        xxgVarAo.b("retryPolicy", this.f);
        xxgVarAo.b("hedgingPolicy", this.g);
        return xxgVarAo.toString();
    }
}
