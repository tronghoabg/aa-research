package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class sjc extends sla implements shw {
    public static final sjm a = new sjm();

    public sjc(Context context) {
        rju rjuVar = shv.m;
        skt sktVar = sku.c;
        sky skyVar = new sky();
        skyVar.b = new oni();
        super(context, null, rjuVar, sktVar, skyVar.a());
    }

    public static boolean b(zgp zgpVar) {
        if (zgpVar.isDone() && !zgpVar.isCancelled()) {
            try {
                a.L(zgpVar);
                return true;
            } catch (RuntimeException | ExecutionException unused) {
            }
        }
        return false;
    }

    public static final svz d(shr shrVar, xwx xwxVar) {
        zgp zgpVar;
        int i;
        int i2 = 1;
        if (shrVar.l) {
            Log.e("AbstractLogEventBuilder", "resolveComplianceData should not be invoked more than once per log.");
            zgpVar = zgl.a;
        } else {
            shrVar.l = true;
            shq shqVar = shrVar.a;
            zwt zwtVar = shqVar.l;
            shz shzVar = null;
            shz shzVar2 = zwtVar != null ? zwtVar.b : null;
            if (shzVar2 == null || (i = shzVar2.a) == 4) {
                shzVar = shzVar2;
            } else {
                Log.e("AbstractLogEventBuilder", "The provided logger-level ProductIdOrigin value " + Integer.toString(i - 1) + " is not one of the values expected for a logger-level provider: " + Integer.toString(3) + " or " + Integer.toString(4));
            }
            if (shzVar == null || shzVar.a != 4) {
                shz shzVar3 = shrVar.j;
                if (shzVar3 != null && shzVar3.a == 2) {
                    shrVar.a(shzVar3);
                } else if (shzVar != null) {
                    shrVar.a(shzVar);
                } else if (shzVar3 != null) {
                    shrVar.a(shzVar3);
                }
            } else {
                shrVar.a(shzVar);
            }
            if (shqVar.c()) {
                zgpVar = zgl.a;
            } else {
                zgp zgpVar2 = zgl.a;
                wck wckVar = new wck(shrVar, zgpVar2, i2);
                zfq zfqVar = zfq.a;
                int i3 = zfb.c;
                zez zezVar = new zez(zgpVar2, wckVar);
                zgpVar2.c(zezVar, yrm.aK(zfqVar, zezVar));
                zfa zfaVar = new zfa(zezVar, new kpf(shrVar, 5));
                zezVar.c(zfaVar, yrm.aK(zfqVar, zfaVar));
                zgpVar = zfaVar;
            }
        }
        return b(zgpVar) ? (svz) xwxVar.a(shrVar) : vja.p(zgpVar).b(zfq.a, new siy(xwxVar, shrVar, i2));
    }

    public final svz a(shr shrVar, siu siuVar) {
        sjg.b().d(1007, this.b);
        sjb sjbVar = new sjb(this, shrVar, this.i, siuVar);
        super.w(2, sjbVar);
        return soq.b(sjbVar);
    }

    @ResultIgnorabilityUnspecified
    public final void c(BatchedLogErrorParcelable batchedLogErrorParcelable) {
        if (batchedLogErrorParcelable.a.isEmpty()) {
            new swe().p(Status.a);
            return;
        }
        snb snbVar = new snb();
        snbVar.a = new qpy(batchedLogErrorParcelable, 9);
        snbVar.b = new Feature[]{siq.a};
        snbVar.b();
        super.u(2, snbVar.a());
    }
}
