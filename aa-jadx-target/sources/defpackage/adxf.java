package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adxf {
    static final defpackage.adjv a = new defpackage.adjv("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", null);
    final java.lang.Long b;
    final java.lang.Boolean c;
    final java.lang.Integer d;
    final java.lang.Integer e;
    final defpackage.adzj f;
    final advf g;

    /* JADX INFO: Thrown type has an unknown type hierarchy: xzp */
    public adxf(java.util.Map map, boolean z) throws xzp {
        boolean z2;
        long j;
        defpackage.adzj adzjVar;
        advf advfVar;
        this.b = defpackage.adrs.o(map, "timeout");
        this.c = defpackage.adrs.l(map, "waitForReady");
        java.lang.Integer numN = defpackage.adrs.n(map, "maxResponseMessageBytes");
        this.d = numN;
        if (numN != null) {
            defpackage.ysr.bc(numN.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", numN);
        }
        java.lang.Integer numN2 = defpackage.adrs.n(map, "maxRequestMessageBytes");
        this.e = numN2;
        if (numN2 != null) {
            defpackage.ysr.bc(numN2.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", numN2);
        }
        java.util.Map mapT = z ? defpackage.adrs.t(map, "retryPolicy") : null;
        if (mapT == null) {
            j = 0;
            adzjVar = null;
            z2 = true;
        } else {
            java.lang.Integer numN3 = defpackage.adrs.n(mapT, "maxAttempts");
            numN3.getClass();
            int iIntValue = numN3.intValue();
            defpackage.ysr.ba(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
            int iMin = java.lang.Math.min(iIntValue, 5);
            java.lang.Long lO = defpackage.adrs.o(mapT, "initialBackoff");
            lO.getClass();
            long jLongValue = lO.longValue();
            defpackage.ysr.bb(jLongValue > 0, "initialBackoffNanos must be greater than 0: %s", jLongValue);
            java.lang.Long lO2 = defpackage.adrs.o(mapT, "maxBackoff");
            lO2.getClass();
            z2 = true;
            long jLongValue2 = lO2.longValue();
            defpackage.ysr.bb(jLongValue2 > 0, "maxBackoff must be greater than 0: %s", jLongValue2);
            java.lang.Double dM = defpackage.adrs.m(mapT, "backoffMultiplier");
            dM.getClass();
            double dDoubleValue = dM.doubleValue();
            j = 0;
            defpackage.ysr.bc(dDoubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", dM);
            java.lang.Long lO3 = defpackage.adrs.o(mapT, "perAttemptRecvTimeout");
            defpackage.ysr.bc(lO3 == null || lO3.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", lO3);
            java.util.Set setA = defpackage.aeao.a(mapT, "retryableStatusCodes");
            defpackage.ysr.aN(setA != null, "%s is required in retry policy", "retryableStatusCodes");
            defpackage.ysr.aN(!setA.contains(defpackage.adoo.OK), "%s must not contain OK", "retryableStatusCodes");
            defpackage.ysr.aY((lO3 == null && setA.isEmpty()) ? false : true, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            adzjVar = new defpackage.adzj(iMin, jLongValue, jLongValue2, dDoubleValue, lO3, setA);
        }
        this.f = adzjVar;
        java.util.Map mapT2 = z ? defpackage.adrs.t(map, "hedgingPolicy") : null;
        if (mapT2 == null) {
            advfVar = null;
        } else {
            java.lang.Integer numN4 = defpackage.adrs.n(mapT2, "maxAttempts");
            numN4.getClass();
            int iIntValue2 = numN4.intValue();
            defpackage.ysr.ba(iIntValue2 >= 2 ? z2 : false, "maxAttempts must be greater than 1: %s", iIntValue2);
            int iMin2 = java.lang.Math.min(iIntValue2, 5);
            java.lang.Long lO4 = defpackage.adrs.o(mapT2, "hedgingDelay");
            lO4.getClass();
            long jLongValue3 = lO4.longValue();
            defpackage.ysr.bb(jLongValue3 >= j ? z2 : false, "hedgingDelay must not be negative: %s", jLongValue3);
            java.util.Set setA2 = defpackage.aeao.a(mapT2, "nonFatalStatusCodes");
            if (setA2 == null) {
                setA2 = j$.util.DesugarCollections.unmodifiableSet(java.util.EnumSet.noneOf(defpackage.adoo.class));
            } else {
                defpackage.ysr.aN(!setA2.contains(defpackage.adoo.OK), "%s must not contain OK", "nonFatalStatusCodes");
            }
            advfVar = new advf(iMin2, jLongValue3, setA2);
        }
        this.g = advfVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.adxf)) {
            return false;
        }
        defpackage.adxf adxfVar = (defpackage.adxf) obj;
        return j$.util.Objects.equals(this.b, adxfVar.b) && j$.util.Objects.equals(this.c, adxfVar.c) && j$.util.Objects.equals(this.d, adxfVar.d) && j$.util.Objects.equals(this.e, adxfVar.e) && j$.util.Objects.equals(this.f, adxfVar.f) && j$.util.Objects.equals(this.g, adxfVar.g);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.b, this.c, this.d, this.e, this.f, this.g});
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.b("timeoutNanos", this.b);
        xymVarBy.b("waitForReady", this.c);
        xymVarBy.b("maxInboundMessageSize", this.d);
        xymVarBy.b("maxOutboundMessageSize", this.e);
        xymVarBy.b("retryPolicy", this.f);
        xymVarBy.b("hedgingPolicy", this.g);
        return xymVarBy.toString();
    }
}
