package od;

import A7.C0237b0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class Q0 {

    /* renamed from: g, reason: collision with root package name */
    public static final B8.e f41785g = new B8.e("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", 4);

    /* renamed from: a, reason: collision with root package name */
    public final Long f41786a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f41787b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f41788c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f41789d;

    /* renamed from: e, reason: collision with root package name */
    public final I1 f41790e;

    /* renamed from: f, reason: collision with root package name */
    public final C3675c0 f41791f;

    public Q0(Map map, boolean z2, int i5, int i10) {
        long j8;
        boolean z10;
        I1 i12;
        C3675c0 c3675c0;
        this.f41786a = AbstractC3719r0.i("timeout", map);
        this.f41787b = AbstractC3719r0.b("waitForReady", map);
        Integer numF = AbstractC3719r0.f("maxResponseMessageBytes", map);
        this.f41788c = numF;
        if (numF != null) {
            Fe.e.r(numF.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", numF);
        }
        Integer numF2 = AbstractC3719r0.f("maxRequestMessageBytes", map);
        this.f41789d = numF2;
        if (numF2 != null) {
            Fe.e.r(numF2.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", numF2);
        }
        Map mapG = z2 ? AbstractC3719r0.g("retryPolicy", map) : null;
        if (mapG == null) {
            j8 = 0;
            i12 = null;
            z10 = true;
        } else {
            Integer numF3 = AbstractC3719r0.f("maxAttempts", mapG);
            Fe.e.t(numF3, "maxAttempts cannot be empty");
            int iIntValue = numF3.intValue();
            Fe.e.n(iIntValue, "maxAttempts must be greater than 1: %s", iIntValue >= 2);
            int iMin = Math.min(iIntValue, i5);
            Long lI = AbstractC3719r0.i("initialBackoff", mapG);
            Fe.e.t(lI, "initialBackoff cannot be empty");
            long jLongValue = lI.longValue();
            Fe.e.o("initialBackoffNanos must be greater than 0: %s", jLongValue, jLongValue > 0);
            Long lI2 = AbstractC3719r0.i("maxBackoff", mapG);
            Fe.e.t(lI2, "maxBackoff cannot be empty");
            long jLongValue2 = lI2.longValue();
            j8 = 0;
            z10 = true;
            Fe.e.o("maxBackoff must be greater than 0: %s", jLongValue2, jLongValue2 > 0);
            Double dE = AbstractC3719r0.e("backoffMultiplier", mapG);
            Fe.e.t(dE, "backoffMultiplier cannot be empty");
            double dDoubleValue = dE.doubleValue();
            Fe.e.r(dDoubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", dE);
            Long lI3 = AbstractC3719r0.i("perAttemptRecvTimeout", mapG);
            Fe.e.r(lI3 == null || lI3.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", lI3);
            Set setN = S1.n("retryableStatusCodes", mapG);
            U8.v0.p0(setN != null, "%s is required in retry policy", "retryableStatusCodes");
            U8.v0.p0(!setN.contains(md.j0.OK), "%s must not contain OK", "retryableStatusCodes");
            Fe.e.p("retryableStatusCodes cannot be empty without perAttemptRecvTimeout", (lI3 == null && setN.isEmpty()) ? false : true);
            i12 = new I1(iMin, jLongValue, jLongValue2, dDoubleValue, lI3, setN);
        }
        this.f41790e = i12;
        Map mapG2 = z2 ? AbstractC3719r0.g("hedgingPolicy", map) : null;
        if (mapG2 == null) {
            c3675c0 = null;
        } else {
            Integer numF4 = AbstractC3719r0.f("maxAttempts", mapG2);
            Fe.e.t(numF4, "maxAttempts cannot be empty");
            int iIntValue2 = numF4.intValue();
            Fe.e.n(iIntValue2, "maxAttempts must be greater than 1: %s", iIntValue2 >= 2 ? z10 : false);
            int iMin2 = Math.min(iIntValue2, i10);
            Long lI4 = AbstractC3719r0.i("hedgingDelay", mapG2);
            Fe.e.t(lI4, "hedgingDelay cannot be empty");
            long jLongValue3 = lI4.longValue();
            Fe.e.o("hedgingDelay must not be negative: %s", jLongValue3, jLongValue3 >= j8 ? z10 : false);
            Set setN2 = S1.n("nonFatalStatusCodes", mapG2);
            if (setN2 == null) {
                setN2 = DesugarCollections.unmodifiableSet(EnumSet.noneOf(md.j0.class));
            } else {
                U8.v0.p0(!setN2.contains(md.j0.OK), "%s must not contain OK", "nonFatalStatusCodes");
            }
            c3675c0 = new C3675c0(iMin2, jLongValue3, setN2);
        }
        this.f41791f = c3675c0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Q0)) {
            return false;
        }
        Q0 q02 = (Q0) obj;
        return Fe.b.v(this.f41786a, q02.f41786a) && Fe.b.v(this.f41787b, q02.f41787b) && Fe.b.v(this.f41788c, q02.f41788c) && Fe.b.v(this.f41789d, q02.f41789d) && Fe.b.v(this.f41790e, q02.f41790e) && Fe.b.v(this.f41791f, q02.f41791f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f41786a, this.f41787b, this.f41788c, this.f41789d, this.f41790e, this.f41791f});
    }

    public final String toString() {
        C0237b0 c0237b0S = Ba.c.S(this);
        c0237b0S.f(this.f41786a, "timeoutNanos");
        c0237b0S.f(this.f41787b, "waitForReady");
        c0237b0S.f(this.f41788c, "maxInboundMessageSize");
        c0237b0S.f(this.f41789d, "maxOutboundMessageSize");
        c0237b0S.f(this.f41790e, "retryPolicy");
        c0237b0S.f(this.f41791f, "hedgingPolicy");
        return c0237b0S.toString();
    }
}
