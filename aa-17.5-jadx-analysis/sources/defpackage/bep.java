package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;

/* loaded from: classes.dex */
public final class bep {
    public static final String a = afyh.d("H", 10);

    public static final long a(dfw dfwVar, dlg dlgVar, wci wciVar) throws IOException {
        den denVarB = b(dfwVar, dlgVar, wciVar, 1);
        return (Math.round((float) Math.ceil(denVarB.a.b())) << 32) | (Math.round((float) Math.ceil(denVarB.d)) & 4294967295L);
    }

    public static final den b(dfw dfwVar, dlg dlgVar, wci wciVar, int i) throws IOException {
        String strCu = woy.cu(new afha(0, i - 1), "\n", null, null, new awf(18), 30);
        afbe afbeVar = afbe.a;
        return new den(new dep(strCu, dfwVar, afbeVar, afbeVar, wciVar, dlgVar), i, 1, dlf.d(0, Alert.DURATION_SHOW_INDEFINITELY, 0, Alert.DURATION_SHOW_INDEFINITELY));
    }
}
