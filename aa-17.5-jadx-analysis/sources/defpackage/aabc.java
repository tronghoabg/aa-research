package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class aabc {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;

    public aabc(aabn aabnVar, tuy tuyVar, String str, Integer num, Boolean bool, Boolean bool2) {
        this.n = aabnVar;
        ackr ackrVarB = acks.b(tuyVar);
        this.a = ackrVarB;
        ackr ackrVarB2 = acks.b(str);
        this.b = ackrVarB2;
        acks acksVar = num == null ? acks.a : new acks(num);
        this.c = acksVar;
        ackr ackrVarB3 = acks.b(bool);
        this.d = ackrVarB3;
        ackr ackrVarB4 = acks.b(bool2);
        this.e = ackrVarB4;
        acku ackuVarC = ackq.c(new aabs(aabnVar.fe, aabnVar.c, ackrVarB, aabnVar.ff, ackrVarB2, acksVar, ackrVarB3, ackrVarB4));
        this.f = ackuVarC;
        acku ackuVarC2 = ackq.c(new vom(ackuVarC, 16));
        this.g = ackuVarC2;
        this.h = ackq.c(new vom(ackuVarC2, 17));
        this.i = ackq.c(new vom(ackuVarC2, 14));
        this.j = ackq.c(new vom(ackuVarC2, 19));
        this.k = ackq.c(new vom(ackuVarC2, 20));
        this.l = ackq.c(new vom(ackuVarC2, 18));
        this.m = ackq.c(new vom(aabnVar.ab, 15));
    }

    public final void a() {
        int i;
        uxn uxnVar;
        Object obj = this.e;
        synchronized (obj) {
            i = ((ztf) obj).b - 1;
            ((ztf) obj).b = i;
        }
        if (i == 0) {
            if (addm.a.gu().r() && (uxnVar = ((ztf) obj).d) != null) {
                uxnVar.e();
            }
            ((ztf) obj).a();
        }
    }

    public final void b() {
        int i;
        Object obj = this.e;
        synchronized (obj) {
            i = ((ztf) obj).b;
            ((ztf) obj).b = i + 1;
        }
        if (i == 0) {
            zrz.b().execute(new zte(obj, 1));
        }
        ((uxm) this.b).d();
    }

    public aabc(zuq zuqVar, zyx zyxVar, zxs zxsVar, zyn zynVar, zym zymVar, zyb zybVar, zqy zqyVar, zxu zxuVar, ztf ztfVar, xyc xycVar, ExecutorService executorService, uxn uxnVar, kex kexVar, Context context) {
        this.i = zuqVar;
        zkt.n(zyxVar, "versionManager");
        this.j = zyxVar;
        this.m = zxsVar;
        this.f = zymVar;
        this.l = zynVar;
        this.h = zybVar;
        this.d = zqyVar;
        this.g = zxuVar;
        this.n = new zwn(zybVar, zre.a(context));
        this.e = ztfVar;
        this.a = xycVar;
        this.k = executorService;
        this.b = uxnVar;
        this.c = kexVar;
    }

    public aabc() {
        this.k = "e";
        this.b = "f";
        this.m = "g";
        this.g = "h";
        this.h = "i";
        this.f = "j";
        this.l = "k";
        this.j = "l";
        this.c = "m";
        this.n = "n";
        this.a = "o";
        this.d = "p";
        this.e = "q";
        this.i = "r";
    }
}
