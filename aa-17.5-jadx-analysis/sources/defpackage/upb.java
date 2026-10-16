package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class upb implements uoj {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/store/diskcache/SqliteDiskResourceCache");
    static final long b;
    public final uoz c;
    private final tmb d;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        b = 3888000000L;
    }

    public upb(uoz uozVar, tmb tmbVar) {
        this.c = uozVar;
        this.d = tmbVar;
    }

    @Override // defpackage.uoj
    public final void a(achw achwVar) throws Throwable {
        if (achwVar != null) {
            abnp abnpVarN = pjx.a.n();
            abnp abnpVarN2 = pjw.a.n();
            abnpVarN2.t();
            pjw pjwVar = (pjw) abnpVarN2.b;
            pjwVar.c = 1;
            pjwVar.b |= 1;
            String str = achwVar.c;
            abnpVarN2.t();
            pjw pjwVar2 = (pjw) abnpVarN2.b;
            str.getClass();
            pjwVar2.b |= 2;
            pjwVar2.d = str;
            abnpVarN.t();
            pjx pjxVar = (pjx) abnpVarN.b;
            pjw pjwVar3 = (pjw) abnpVarN2.q();
            pjwVar3.getClass();
            pjxVar.c = pjwVar3;
            pjxVar.b |= 1;
            long epochMilli = this.d.f().toEpochMilli() + b;
            abnpVarN.t();
            pjx pjxVar2 = (pjx) abnpVarN.b;
            pjxVar2.b |= 8;
            pjxVar2.e = epochMilli;
            abnpVarN.t();
            pjx pjxVar3 = (pjx) abnpVarN.b;
            pjxVar3.b |= 2;
            pjxVar3.d = "";
            abnpVarN.t();
            pjx pjxVar4 = (pjx) abnpVarN.b;
            pjxVar4.g = aclh.c(3);
            pjxVar4.b |= 32;
            try {
                this.c.h((pjx) abnpVarN.q(), achwVar.h());
            } catch (IOException e) {
                ((ynz) ((ynz) ((ynz) a.g()).p(e)).ai((char) 9537)).u("Failed to insert resource:");
            }
        }
    }
}
