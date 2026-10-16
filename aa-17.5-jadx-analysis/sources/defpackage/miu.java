package defpackage;

import com.google.android.gms.car.RadioProgramInfo;

/* loaded from: classes2.dex */
public final class miu extends miv {
    private final yfq v(RadioProgramInfo radioProgramInfo) {
        int i = yfq.d;
        yfl yflVar = new yfl(4);
        int i2 = radioProgramInfo.a.a.a;
        if (lws.h(i2)) {
            yflVar.i(new lpc(this, 12));
            yflVar.i(new lpc(this, 13));
        } else if (lws.j(i2)) {
            yflVar.i(new lpc(this, 14));
        }
        return yflVar.g();
    }

    @Override // defpackage.miv
    protected final String s(RadioProgramInfo radioProgramInfo) {
        yfq yfqVarO = o(radioProgramInfo, v(radioProgramInfo));
        String strD = d(radioProgramInfo);
        if (yfqVarO.contains(strD)) {
            return null;
        }
        return strD;
    }

    @Override // defpackage.miv
    protected final String t(RadioProgramInfo radioProgramInfo) {
        return n(o(radioProgramInfo, v(radioProgramInfo)));
    }
}
