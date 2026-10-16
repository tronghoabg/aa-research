package defpackage;

import com.google.android.gms.carsetup.CarInfoInternal;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class jcf extends jbj {
    public static final ypf a = ols.R("CAR.GAL.WIFI_PROJ");
    public volatile boolean b;
    private final jce c;

    public jcf(jce jceVar, jbn jbnVar) {
        super(17, jceVar, jbnVar, 0);
        this.b = false;
        this.c = jceVar;
    }

    @Override // defpackage.jbj, defpackage.iyz
    public final void P(int i) {
        this.b = false;
    }

    @Override // defpackage.jbj, defpackage.iyz
    public final void Q() {
        this.b = true;
        super.Q();
    }

    @Override // defpackage.jbj
    public final void a(int i, ByteBuffer byteBuffer) throws abon {
        if (i != 32770) {
            a.g().ai(1863).w("Wrong Wifi projection message type %d", i);
            return;
        }
        xpk xpkVar = (xpk) abnv.A(xpk.a, byteBuffer, abnj.a());
        if (xpkVar == null) {
            a.g().ai(1864).u("Wrong WifiCredentialsResponse message");
            return;
        }
        a.l().ai(1862).u("handleWifiCredentialsResponse");
        String strAl = woy.al(xpkVar.d);
        String strAl2 = woy.al(xpkVar.b);
        int iAB = a.aB(xpkVar.c);
        if (iAB == 0) {
            iAB = 1;
        }
        int iAC = a.aC(xpkVar.e);
        if (iAC == 0) {
            iAC = 1;
        }
        jce jceVar = this.c;
        ((ype) ile.a.l().ai((char) 271)).u("onWifiCredentialsResponse");
        if (iAC == 2 || iAB == 1) {
            return;
        }
        ile ileVar = (ile) jceVar;
        CarInfoInternal carInfoInternal = ileVar.f;
        carInfoInternal.h = ileVar.d;
        carInfoInternal.g = strAl;
        carInfoInternal.i = strAl2;
        carInfoInternal.j = iAB - 1;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.execute(new gnu(jceVar, 18));
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    @Override // defpackage.iyx
    public final void b(int i) {
    }
}
