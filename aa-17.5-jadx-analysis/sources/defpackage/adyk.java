package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes.dex */
final class adyk extends adqs {
    final /* synthetic */ adyl a;
    private final adqs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adyk(adyl adylVar, adqs adqsVar) {
        super(null, null);
        this.a = adylVar;
        this.b = adqsVar;
    }

    @Override // defpackage.adqs
    public final adnq u(admp admpVar) {
        adnq adnqVarU = this.b.u(admpVar);
        boolean zG = adnqVarU.g();
        adyl adylVar = this.a;
        if (zG) {
            adylVar.c.a();
            return adnqVarU;
        }
        adyj adyjVar = new adyj(adylVar, 0);
        adrs adrsVar = (adrs) adylVar.c;
        adnw adnwVar = adrsVar.c;
        adnwVar.c();
        if (adrsVar.d == null) {
            adrsVar.d = new adtp();
        }
        aebg aebgVar = adrsVar.e;
        if (aebgVar != null && aebgVar.i()) {
            return adnqVarU;
        }
        long jA = adrsVar.d.a();
        adrsVar.e = adnwVar.d(adyjVar, jA, TimeUnit.NANOSECONDS, adrsVar.b);
        adrs.a.logp(Level.FINE, "io.grpc.internal.BackoffPolicyRetryScheduler", "schedule", "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jA));
        return adnqVarU;
    }
}
