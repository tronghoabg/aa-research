package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class rqd {
    private static volatile rqd c;
    public final xyi a;
    public final long b;
    private final yfy d;

    private rqd() {
        xyi xyiVar = xvx.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.b = 600000000000L;
        xyiVar.getClass();
        this.a = xyiVar;
        yfu yfuVar = new yfu(4);
        for (yxy yxyVar : yxy.values()) {
            yfuVar.e(yxyVar, new rqc(this, yxyVar));
        }
        this.d = yrm.F(yfuVar.d(true));
    }

    public static rqd a() {
        if (c == null) {
            synchronized (rqd.class) {
                if (c == null) {
                    c = new rqd();
                }
            }
        }
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final yfq b() {
        yfl yflVar = new yfl(4);
        yno it = this.d.values().iterator();
        while (it.hasNext()) {
            rqc rqcVar = (rqc) it.next();
            if (rqcVar.b()) {
                yflVar.i(rqcVar.a);
            }
        }
        return yflVar.g();
    }

    @ResultIgnorabilityUnspecified
    public final yxx c(yxy yxyVar) {
        rqc rqcVar = (rqc) this.d.get(yxyVar);
        rqcVar.getClass();
        rqcVar.a();
        return rqcVar.a;
    }
}
