package e.a.d;

import androidx.camera.video.AudioStats;
import j$.util.Objects;
import java.text.ParseException;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ga {

    /* renamed from: a, reason: collision with root package name */
    static final e.a.g f46995a = e.a.g.a("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");

    /* renamed from: b, reason: collision with root package name */
    final Long f46996b;

    /* renamed from: c, reason: collision with root package name */
    final Boolean f46997c;

    /* renamed from: d, reason: collision with root package name */
    final Integer f46998d;

    /* renamed from: e, reason: collision with root package name */
    final Integer f46999e;

    /* renamed from: f, reason: collision with root package name */
    final iz f47000f;

    /* renamed from: g, reason: collision with root package name */
    final di f47001g;

    ga(Map map, boolean z, int i2) throws NumberFormatException, ParseException {
        long j2;
        iz izVar;
        di diVar;
        this.f46996b = jm.h(map, "timeout");
        this.f46997c = jm.e(map, "waitForReady");
        Integer numG = jm.g(map, "maxResponseMessageBytes");
        this.f46998d = numG;
        if (numG != null) {
            com.google.d.b.an.q(numG.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", numG);
        }
        Integer numG2 = jm.g(map, "maxRequestMessageBytes");
        this.f46999e = numG2;
        if (numG2 != null) {
            com.google.d.b.an.q(numG2.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", numG2);
        }
        Map mapM = z ? jm.m(map, "retryPolicy") : null;
        if (mapM == null) {
            j2 = 0;
            izVar = null;
        } else {
            Integer numG3 = jm.g(mapM, "maxAttempts");
            com.google.d.b.an.C(numG3, "maxAttempts cannot be empty");
            int iIntValue = numG3.intValue();
            com.google.d.b.an.o(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
            int iMin = Math.min(iIntValue, i2);
            Long lH = jm.h(mapM, "initialBackoff");
            com.google.d.b.an.C(lH, "initialBackoff cannot be empty");
            long jLongValue = lH.longValue();
            com.google.d.b.an.p(jLongValue > 0, "initialBackoffNanos must be greater than 0: %s", jLongValue);
            Long lH2 = jm.h(mapM, "maxBackoff");
            com.google.d.b.an.C(lH2, "maxBackoff cannot be empty");
            long jLongValue2 = lH2.longValue();
            com.google.d.b.an.p(jLongValue2 > 0, "maxBackoff must be greater than 0: %s", jLongValue2);
            Double dF = jm.f(mapM, "backoffMultiplier");
            com.google.d.b.an.C(dF, "backoffMultiplier cannot be empty");
            double dDoubleValue = dF.doubleValue();
            j2 = 0;
            com.google.d.b.an.q(dDoubleValue > AudioStats.AUDIO_AMPLITUDE_NONE, "backoffMultiplier must be greater than 0: %s", dF);
            Long lH3 = jm.h(mapM, "perAttemptRecvTimeout");
            com.google.d.b.an.q(lH3 == null || lH3.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", lH3);
            Set setB = jm.b(mapM);
            com.google.d.b.an.m((lH3 == null && setB.isEmpty()) ? false : true, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            izVar = new iz(iMin, jLongValue, jLongValue2, dDoubleValue, lH3, setB);
        }
        this.f47000f = izVar;
        Map mapM2 = z ? jm.m(map, "hedgingPolicy") : null;
        if (mapM2 == null) {
            diVar = null;
        } else {
            Integer numG4 = jm.g(mapM2, "maxAttempts");
            com.google.d.b.an.C(numG4, "maxAttempts cannot be empty");
            int iIntValue2 = numG4.intValue();
            com.google.d.b.an.o(iIntValue2 >= 2, "maxAttempts must be greater than 1: %s", iIntValue2);
            int iMin2 = Math.min(iIntValue2, 5);
            Long lH4 = jm.h(mapM2, "hedgingDelay");
            com.google.d.b.an.C(lH4, "hedgingDelay cannot be empty");
            long jLongValue3 = lH4.longValue();
            com.google.d.b.an.p(jLongValue3 >= j2, "hedgingDelay must not be negative: %s", jLongValue3);
            diVar = new di(iMin2, jLongValue3, jm.a(mapM2));
        }
        this.f47001g = diVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ga)) {
            return false;
        }
        ga gaVar = (ga) obj;
        return Objects.equals(this.f46996b, gaVar.f46996b) && Objects.equals(this.f46997c, gaVar.f46997c) && Objects.equals(this.f46998d, gaVar.f46998d) && Objects.equals(this.f46999e, gaVar.f46999e) && Objects.equals(this.f47000f, gaVar.f47000f) && Objects.equals(this.f47001g, gaVar.f47001g);
    }

    public final int hashCode() {
        return Objects.hash(this.f46996b, this.f46997c, this.f46998d, this.f46999e, this.f47000f, this.f47001g);
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.d("timeoutNanos", this.f46996b);
        zVarH.d("waitForReady", this.f46997c);
        zVarH.d("maxInboundMessageSize", this.f46998d);
        zVarH.d("maxOutboundMessageSize", this.f46999e);
        zVarH.d("retryPolicy", this.f47000f);
        zVarH.d("hedgingPolicy", this.f47001g);
        return zVarH.toString();
    }
}
