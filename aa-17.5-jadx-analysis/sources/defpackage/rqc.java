package defpackage;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class rqc {
    public volatile yxx a;
    final /* synthetic */ rqd b;
    private final yxy c;
    private final xya d;

    public rqc(rqd rqdVar, yxy yxyVar) {
        this.b = rqdVar;
        this.c = yxyVar;
        xya xyaVar = new xya(rqdVar.a);
        xyaVar.d();
        this.d = xyaVar;
    }

    public final synchronized void a() {
        if (!b()) {
            yxy yxyVar = this.c;
            abnp abnpVarN = yxx.a.n();
            int i = yxyVar.h;
            abnpVarN.t();
            yxx yxxVar = (yxx) abnpVarN.b;
            yxxVar.b |= 1;
            yxxVar.c = i;
            yzj yzjVarS = aclh.s(UUID.randomUUID());
            abnpVarN.t();
            yxx yxxVar2 = (yxx) abnpVarN.b;
            yzjVarS.getClass();
            yxxVar2.d = yzjVarS;
            yxxVar2.b |= 2;
            this.a = (yxx) abnpVarN.q();
        }
        xya xyaVar = this.d;
        xyaVar.d();
        xyaVar.e();
    }

    public final boolean b() {
        xya xyaVar = this.d;
        return xyaVar.a(TimeUnit.NANOSECONDS) < this.b.b && xyaVar.a;
    }
}
