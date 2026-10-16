package defpackage;

import com.google.android.gms.car.RadioProgramInfo;

/* loaded from: classes2.dex */
public final class miy extends miv {
    @Override // defpackage.miv
    protected final String s(RadioProgramInfo radioProgramInfo) {
        int i = yfq.d;
        yfl yflVar = new yfl(4);
        if (lws.l(radioProgramInfo.a.a.a)) {
            yflVar.i(new miw(6));
        }
        yflVar.j(new miw(7), new mix(this, 0));
        return woy.al(p(radioProgramInfo, yflVar.g()));
    }

    @Override // defpackage.miv
    protected final String t(RadioProgramInfo radioProgramInfo) {
        int i = yfq.d;
        yfl yflVar = new yfl(4);
        int i2 = radioProgramInfo.a.a.a;
        if (lws.h(i2)) {
            yflVar.i(new lpc(this, 19));
        }
        yflVar.i(new lpc(this, 20));
        yflVar.i(new mix(this, 1));
        yfq yfqVarO = o(radioProgramInfo, yflVar.g());
        return yfqVarO.isEmpty() ? i2 != 1 ? (i2 == 5 || i2 == 9) ? "DAB" : "" : "FM" : n(yfqVarO);
    }
}
