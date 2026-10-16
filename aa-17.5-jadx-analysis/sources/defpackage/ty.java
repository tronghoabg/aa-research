package defpackage;

import android.R;
import androidx.car.app.model.Alert;

/* loaded from: classes.dex */
public /* synthetic */ class ty {
    public static cng a;

    public static void a(bzj bzjVar, buj bujVar, int i) {
        while (true) {
            int i2 = bzjVar.q;
            if (i > i2 && i < bzjVar.p) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            bzjVar.I();
            if (bzjVar.S(bzjVar.q)) {
                bujVar.h();
            }
            bzjVar.V();
        }
    }

    public static void b(edg edgVar, ddu dduVar) {
        ddr ddrVar = dduVar.b;
        if (dan.e(dduVar)) {
            ddf ddfVar = (ddf) ddrVar.g(ddq.y);
            if (ddfVar != null) {
                edgVar.h(new edf(null, R.id.accessibilityActionPageUp, ddfVar.a, null, null));
            }
            ddf ddfVar2 = (ddf) ddrVar.g(ddq.A);
            if (ddfVar2 != null) {
                edgVar.h(new edf(null, R.id.accessibilityActionPageDown, ddfVar2.a, null, null));
            }
            ddf ddfVar3 = (ddf) ddrVar.g(ddq.z);
            if (ddfVar3 != null) {
                edgVar.h(new edf(null, R.id.accessibilityActionPageLeft, ddfVar3.a, null, null));
            }
            ddf ddfVar4 = (ddf) ddrVar.g(ddq.B);
            if (ddfVar4 != null) {
                edgVar.h(new edf(null, R.id.accessibilityActionPageRight, ddfVar4.a, null, null));
            }
        }
    }

    public static long c(int i, int i2, int i3, int i4) {
        return (i & 32767) | ((i2 & 32767) << 15) | ((i3 & 32767) << 30) | ((i4 & 32767) << 45) | Long.MIN_VALUE;
    }

    public static int d(cyf cyfVar, csq csqVar, csp cspVar, int i) {
        ctu ctuVar = new ctu(cspVar, 2, 2, 2);
        long jD = dlf.d(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY);
        return ((cwt) cyfVar).a.el(new css(csqVar, csqVar.p()), ctuVar, jD).b();
    }

    public static int e(cyf cyfVar, csq csqVar, csp cspVar, int i) {
        ctu ctuVar = new ctu(cspVar, 2, 1, 2);
        long jD = dlf.d(0, Alert.DURATION_SHOW_INDEFINITELY, 0, i);
        return ((cwt) cyfVar).a.el(new css(csqVar, csqVar.p()), ctuVar, jD).c();
    }

    public static int f(cyf cyfVar, csq csqVar, csp cspVar, int i) {
        ctu ctuVar = new ctu(cspVar, 1, 2, 2);
        long jD = dlf.d(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY);
        return ((cwt) cyfVar).a.el(new css(csqVar, csqVar.p()), ctuVar, jD).b();
    }

    public static int g(cyf cyfVar, csq csqVar, csp cspVar, int i) {
        ctu ctuVar = new ctu(cspVar, 1, 1, 2);
        long jD = dlf.d(0, Alert.DURATION_SHOW_INDEFINITELY, 0, i);
        return ((cwt) cyfVar).a.el(new css(csqVar, csqVar.p()), ctuVar, jD).c();
    }

    public static void h(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        iArr[4] = z ? 1 : 0;
    }
}
