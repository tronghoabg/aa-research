package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes.dex */
public final class bis {
    public final dlr a;
    public final dfw b;
    public final dlg c;
    public final wci d;
    private final dfw e;
    private float f = Float.NaN;
    private float g = Float.NaN;

    public bis(dlr dlrVar, dfw dfwVar, dlg dlgVar, wci wciVar) {
        this.a = dlrVar;
        this.b = dfwVar;
        this.c = dlgVar;
        this.d = wciVar;
        this.e = dao.g(dfwVar, dlrVar);
    }

    public final long a(long j, int i) {
        int iC;
        float f = this.g;
        float f2 = this.f;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            dfw dfwVar = this.e;
            dlg dlgVar = this.c;
            wci wciVar = this.d;
            String str = bit.a;
            afbe afbeVar = afbe.a;
            float f3 = new den(new dep(str, dfwVar, afbeVar, afbeVar, wciVar, dlgVar), 1, 1, dlf.d(0, Alert.DURATION_SHOW_INDEFINITELY, 0, Alert.DURATION_SHOW_INDEFINITELY)).d;
            float f4 = new den(new dep(bit.b, dfwVar, afbeVar, afbeVar, wciVar, dlgVar), 2, 1, dlf.d(0, Alert.DURATION_SHOW_INDEFINITELY, 0, Alert.DURATION_SHOW_INDEFINITELY)).d - f3;
            this.g = f3;
            this.f = f4;
            f2 = f4;
            f = f3;
        }
        if (i != 1) {
            int iRound = Math.round(f + (f2 * (i - 1)));
            iC = iRound >= 0 ? iRound : 0;
            int iA = dle.a(j);
            if (iC > iA) {
                iC = iA;
            }
        } else {
            iC = dle.c(j);
        }
        return dlf.d(dle.d(j), dle.b(j), iC, dle.a(j));
    }
}
