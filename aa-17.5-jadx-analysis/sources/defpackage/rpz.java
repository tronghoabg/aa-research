package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class rpz {
    public static final ypf a = ols.R("CAR.ANALYTICS");
    public static final Object b = new Object();
    public static final rpu c = new wyw(null).a();
    private static volatile rpz k;
    public rpy d;
    public final rre e;
    public final BlockingQueue f;
    public final rzg g;
    public final rzg h;
    public final rzg i;
    public final int j;
    private final rqb l;
    private final Executor m;
    private final rzg n;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public rpz(rpy rpyVar, rre rreVar, rzg rzgVar, rqb rqbVar, rzg rzgVar2, Executor executor, rzg rzgVar3, rzg rzgVar4) {
        String processName = Application.getProcessName();
        int i = 1;
        if (processName != null) {
            switch (processName.hashCode()) {
                case -1998252575:
                    if (processName.equals("com.google.android.projection.gearhead:car")) {
                        i = 5;
                        break;
                    }
                    break;
                case -1346310731:
                    if (processName.equals("com.google.android.projection.gearhead:vanagon")) {
                        i = 3;
                        break;
                    }
                    break;
                case -1231601864:
                    if (processName.equals("com.google.android.projection.gearhead:shared")) {
                        i = 4;
                        break;
                    }
                    break;
                case -931760128:
                    if (processName.equals("com.google.android.gms:car")) {
                        i = 6;
                        break;
                    }
                    break;
                case 51100578:
                    if (processName.equals("com.google.android.projection.gearhead:projection")) {
                        i = 2;
                        break;
                    }
                    break;
            }
        }
        this.j = i;
        this.d = rpyVar;
        this.e = rreVar;
        this.g = rzgVar;
        this.l = rqbVar;
        this.f = new ArrayBlockingQueue(10000);
        this.h = rzgVar2;
        this.m = executor;
        this.i = rzgVar3;
        this.n = rzgVar4;
    }

    public static rpz a(Context context) {
        if (k == null) {
            synchronized (b) {
                if (k == null) {
                    final Context applicationContext = context.getApplicationContext();
                    final int i = 0;
                    rpv rpvVar = new rpv(0);
                    rre rreVar = new rre(applicationContext);
                    int i2 = rpt.a;
                    final int i3 = 1;
                    final xyc xycVarL = wub.L(new rzg() { // from class: rpw
                        @Override // defpackage.xyc
                        public final Object gu() {
                            int i4 = i3;
                            if (i4 == 0) {
                                return new rqh();
                            }
                            if (i4 == 1) {
                                return rqd.a();
                            }
                            ypf ypfVar = rpz.a;
                            rhx rhxVar = rhx.c;
                            return new rqf(new Random());
                        }
                    });
                    xycVarL.getClass();
                    rzg rzgVar = new rzg() { // from class: rzf
                        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xyc] */
                        @Override // defpackage.xyc
                        public final Object gu() {
                            if (i == 0) {
                                return xycVarL.gu();
                            }
                            ypf ypfVar = rpz.a;
                            return new abos((Context) xycVarL);
                        }
                    };
                    rqb rqbVarA = rqb.a(applicationContext);
                    final xyc xycVarL2 = wub.L(new rzg() { // from class: rpw
                        @Override // defpackage.xyc
                        public final Object gu() {
                            int i4 = i;
                            if (i4 == 0) {
                                return new rqh();
                            }
                            if (i4 == 1) {
                                return rqd.a();
                            }
                            ypf ypfVar = rpz.a;
                            rhx rhxVar = rhx.c;
                            return new rqf(new Random());
                        }
                    });
                    xycVarL2.getClass();
                    rzg rzgVar2 = new rzg() { // from class: rzf
                        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xyc] */
                        @Override // defpackage.xyc
                        public final Object gu() {
                            if (i == 0) {
                                return xycVarL2.gu();
                            }
                            ypf ypfVar = rpz.a;
                            return new abos((Context) xycVarL2);
                        }
                    };
                    ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                    rhx rhxVar = rhx.c;
                    final xyc xycVarL3 = wub.L(new rzg() { // from class: rzf
                        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xyc] */
                        @Override // defpackage.xyc
                        public final Object gu() {
                            if (i3 == 0) {
                                return applicationContext.gu();
                            }
                            ypf ypfVar = rpz.a;
                            return new abos((Context) applicationContext);
                        }
                    });
                    xycVarL3.getClass();
                    rzg rzgVar3 = new rzg() { // from class: rzf
                        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xyc] */
                        @Override // defpackage.xyc
                        public final Object gu() {
                            if (i == 0) {
                                return xycVarL3.gu();
                            }
                            ypf ypfVar = rpz.a;
                            return new abos((Context) xycVarL3);
                        }
                    };
                    final int i4 = 2;
                    final xyc xycVarL4 = wub.L(new rzg() { // from class: rpw
                        @Override // defpackage.xyc
                        public final Object gu() {
                            int i42 = i4;
                            if (i42 == 0) {
                                return new rqh();
                            }
                            if (i42 == 1) {
                                return rqd.a();
                            }
                            ypf ypfVar = rpz.a;
                            rhx rhxVar2 = rhx.c;
                            return new rqf(new Random());
                        }
                    });
                    xycVarL4.getClass();
                    k = new rpz(rpvVar, rreVar, rzgVar, rqbVarA, rzgVar2, executorServiceNewSingleThreadExecutor, rzgVar3, new rzg() { // from class: rzf
                        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xyc] */
                        @Override // defpackage.xyc
                        public final Object gu() {
                            if (i == 0) {
                                return xycVarL4.gu();
                            }
                            ypf ypfVar = rpz.a;
                            return new abos((Context) xycVarL4);
                        }
                    });
                }
            }
        }
        return k;
    }

    private final void g(yxy yxyVar, yxc yxcVar, abnp abnpVar, List list) {
        yxx yxxVar = ((yxb) abnpVar.b).O;
        if (yxxVar == null) {
            yxxVar = yxx.a;
        }
        woy.aa(!((yxxVar.b & 2) != 0), "sourceDomainLifetimeId is reserved for CarTelemetryLogger lib use");
        rqf rqfVar = (rqf) this.n.gu();
        float f = rqfVar.c;
        if (f < 1.0f && rqfVar.d.nextFloat() > f) {
            if (yxcVar == yxc.UI) {
                yxb yxbVar = (yxb) abnpVar.b;
                if ((yxbVar.b & 4096) != 0) {
                    zab zabVar = yxbVar.o;
                    if (zabVar == null) {
                        zabVar = zab.a;
                    }
                    if (rqfVar.a.contains(Integer.valueOf(zabVar.e))) {
                        return;
                    }
                }
            }
            if (yxcVar == yxc.NON_UI) {
                yxb yxbVar2 = (yxb) abnpVar.b;
                if ((yxbVar2.b & 8192) != 0) {
                    yyz yyzVar = yxbVar2.p;
                    if (yyzVar == null) {
                        yyzVar = yyz.a;
                    }
                    if (rqfVar.b.contains(Integer.valueOf(yyzVar.d))) {
                        return;
                    }
                }
            }
            if (yxcVar == yxc.GEARHEAD_CAR_SERVICE_CONNECTION) {
                yxb yxbVar3 = (yxb) abnpVar.b;
                if ((yxbVar3.c & 8388608) != 0) {
                    yyg yygVar = yxbVar3.V;
                    if (yygVar == null) {
                        yygVar = yyg.a;
                    }
                    if (yygVar.e) {
                        return;
                    }
                }
            }
            if (yxcVar == yxc.CAR_CLIENT_CONNECTION) {
                yxb yxbVar4 = (yxb) abnpVar.b;
                if ((yxbVar4.c & 2097152) != 0) {
                    ywz ywzVar = yxbVar4.T;
                    if (ywzVar == null) {
                        ywzVar = ywz.a;
                    }
                    if (ywzVar.d) {
                        return;
                    }
                }
            }
        }
        if (!this.f.offer(new mko(yxyVar, yxcVar, (yxb) abnpVar.q(), list))) {
            a.h().ai(8193).u("Cannot queue item because queue overflowing");
            return;
        }
        zgp zgpVarB = this.l.b();
        zgpVarB.c(new zgf(zgpVarB, new rpx(this)), this.m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        yfq yfqVarO;
        int i;
        int i2;
        rqh rqhVar = (rqh) this.h.gu();
        synchronized (rqhVar) {
            Map map = rqhVar.b;
            yfqVarO = yfq.o(map.values());
            map.clear();
            i = rqhVar.c;
            i2 = 0;
            rqhVar.c = 0;
        }
        int size = yfqVarO.size();
        while (true) {
            rre rreVar = this.e;
            if (i2 >= size) {
                rqh.a(rreVar, yzy.ry, yfqVarO.size());
                rqh.a(rreVar, yzy.rz, i);
                return;
            }
            rjg rjgVar = (rjg) yfqVarO.get(i2);
            zab zabVar = (zab) ((abnp) rjgVar.a).q();
            abnp abnpVarK = ((abnv) rjgVar.b).K();
            abnpVarK.t();
            yxb yxbVar = (yxb) abnpVarK.b;
            zabVar.getClass();
            yxbVar.o = zabVar;
            yxbVar.b |= 4096;
            yxb yxbVar2 = (yxb) abnpVarK.q();
            rqh.b(zabVar);
            rreVar.a(yxc.UI, yxbVar2, yls.a);
            i2++;
        }
    }

    public final void c(rqy rqyVar) {
        yfq yfqVarG;
        yxy yxyVarF = rqyVar.f();
        yxc yxcVarE = rqyVar.e();
        abnp abnpVarG = rqyVar.g();
        ygr ygrVarD = rqyVar.d();
        if (ygrVarD == null || ygrVarD.isEmpty()) {
            int i = yfq.d;
            yfqVarG = yls.a;
        } else {
            yfl yflVar = new yfl(4);
            Iterator<E> it = ygrVarD.iterator();
            while (it.hasNext()) {
                yflVar.i(Integer.valueOf(((acai) it.next()).a()));
            }
            yfqVarG = yflVar.g();
        }
        g(yxyVarF, yxcVarE, abnpVarG, yfqVarG);
    }

    public final void d(yxc yxcVar, yxb yxbVar) {
        int i = yfq.d;
        e(yxcVar, yxbVar, yls.a);
    }

    public final void e(yxc yxcVar, yxb yxbVar, List list) {
        yxy yxyVar;
        yxx yxxVar = yxbVar.O;
        if (yxxVar == null) {
            yxxVar = yxx.a;
        }
        if ((yxxVar.b & 1) != 0) {
            yxx yxxVar2 = yxbVar.O;
            if (yxxVar2 == null) {
                yxxVar2 = yxx.a;
            }
            switch (yxxVar2.c) {
                case 0:
                    yxyVar = yxy.DOMAIN_UNSPECIFIED;
                    break;
                case 1:
                    yxyVar = yxy.GEARHEAD;
                    break;
                case 2:
                    yxyVar = yxy.CONNECTIVITY;
                    break;
                case 3:
                    yxyVar = yxy.FRX;
                    break;
                case 4:
                    yxyVar = yxy.CAR_SERVICE;
                    break;
                case 5:
                    yxyVar = yxy.BINDING;
                    break;
                case 6:
                    yxyVar = yxy.PROVIDER;
                    break;
                default:
                    yxyVar = null;
                    break;
            }
            yxyVar.getClass();
        } else {
            yxyVar = yxy.DOMAIN_UNSPECIFIED;
        }
        g(yxyVar, yxcVar, yxbVar.K(), list);
    }

    public final void f(rpy rpyVar) {
        synchronized (b) {
            this.d = rpyVar;
        }
    }
}
