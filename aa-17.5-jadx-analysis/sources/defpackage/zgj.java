package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class zgj extends zeu {
    public static zgj v(zgp zgpVar) {
        return zgpVar instanceof zgj ? (zgj) zgpVar : new zgb(zgpVar);
    }

    public final zgj u(Class cls, xwx xwxVar, Executor executor) {
        int i = zet.d;
        zes zesVar = new zes(this, cls, xwxVar);
        c(zesVar, yrm.aK(executor, zesVar));
        return zesVar;
    }

    public final zgj w(xwx xwxVar, Executor executor) {
        int i = zfb.c;
        zfa zfaVar = new zfa(this, xwxVar);
        c(zfaVar, yrm.aK(executor, zfaVar));
        return zfaVar;
    }

    public final zgj x(long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return (zgj) wub.ae(this, j, timeUnit, scheduledExecutorService);
    }
}
