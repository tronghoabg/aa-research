package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class rsh extends ruq {
    private static final ypf a = ols.R("CAR.GAL.BT");
    private final rsg b;
    private boolean c;
    private volatile boolean d;

    public rsh(rsg rsgVar, rut rutVar) {
        super(9, rsgVar, rutVar, 0);
        this.c = false;
        this.d = false;
        this.b = rsgVar;
    }

    @Override // defpackage.ruq
    protected final void d(int i, ByteBuffer byteBuffer) throws abon {
        xhn xhnVar;
        if (i == 32770) {
            xhr xhrVar = (xhr) abnv.w(xhr.a, byteBuffer);
            if (xhrVar == null) {
                a.g().ai(8227).u("Wrong BluetoothPairingResponse message");
                return;
            }
            ypf ypfVar = a;
            ypfVar.l().ai(8221).u("handlePairingResponse");
            if (!this.c) {
                ypfVar.h().ai(8223).u("Have not sent pairing request");
                return;
            }
            xkr xkrVarB = xkr.b(xhrVar.b);
            if (xkrVarB == null) {
                xkrVarB = xkr.STATUS_UNSOLICITED_MESSAGE;
            }
            boolean z = xhrVar.c;
            ypfVar.l().ai(8222).N("Got pairing response. status=%s alreadyPaired=%b", xkrVarB, z);
            rsg rsgVar = this.b;
            qrg.a.l().ai(7721).N("onPairingResponse. status=%s alreadyPaired=%b", xkrVarB, z);
            qrg qrgVar = (qrg) rsgVar;
            qrgVar.o(new lvn(qrgVar, xkrVarB, z, 4));
            return;
        }
        if (i != 32771) {
            a.h().ai(8224).w("Wrong Bluetooth message type: %d", i);
            return;
        }
        try {
            xhnVar = (xhn) abnv.w(xhn.a, byteBuffer);
        } catch (abon e) {
            a.g().ai(8226).y("Invalid Protocol Buffer %s", e.getMessage());
            xhnVar = null;
        }
        if (xhnVar == null) {
            a.g().ai(8225).u("Wrong BluetoothAuthenticationData message");
            return;
        }
        if ((xhnVar.b & 1) == 0) {
            a.l().ai(8220).u("No auth data.");
            return;
        }
        a.l().ai(8219).y("handleAuthData. auth data: %s", xhnVar.c);
        rsg rsgVar2 = this.b;
        String strAl = woy.al(xhnVar.c);
        qrg.a.l().ai(7718).y("onAuthenticationData: auth data=%s", strAl);
        ((qrg) rsgVar2).o(new qqy(rsgVar2, strAl, 0));
    }

    public final void f(rsf rsfVar) {
        a.l().ai(8228).y("sendAuthenticationResult: result=%s", rsfVar);
        abnp abnpVarN = xho.a.n();
        xkr xkrVar = xkr.STATUS_UNSOLICITED_MESSAGE;
        abnpVarN.t();
        xho xhoVar = (xho) abnpVarN.b;
        xhoVar.c = xkrVar.I;
        xhoVar.b |= 1;
        int iOrdinal = rsfVar.ordinal();
        if (iOrdinal == 0) {
            xkr xkrVar2 = xkr.STATUS_SUCCESS;
            abnpVarN.t();
            xho xhoVar2 = (xho) abnpVarN.b;
            xhoVar2.c = xkrVar2.I;
            xhoVar2.b |= 1;
        } else if (iOrdinal == 1) {
            xkr xkrVar3 = xkr.STATUS_BLUETOOTH_INVALID_PAIRING_METHOD;
            abnpVarN.t();
            xho xhoVar3 = (xho) abnpVarN.b;
            xhoVar3.c = xkrVar3.I;
            xhoVar3.b |= 1;
        } else if (iOrdinal == 2) {
            xkr xkrVar4 = xkr.STATUS_BLUETOOTH_INVALID_AUTH_DATA;
            abnpVarN.t();
            xho xhoVar4 = (xho) abnpVarN.b;
            xhoVar4.c = xkrVar4.I;
            xhoVar4.b |= 1;
        } else if (iOrdinal == 3) {
            xkr xkrVar5 = xkr.STATUS_BLUETOOTH_AUTH_DATA_MISMATCH;
            abnpVarN.t();
            xho xhoVar5 = (xho) abnpVarN.b;
            xhoVar5.c = xkrVar5.I;
            xhoVar5.b |= 1;
        }
        super.o(32772, abnpVarN.q(), true);
    }

    public final void g(String str, xhp xhpVar) {
        ypf ypfVar = a;
        ypfVar.l().ai(8229).M("sendPairingRequest: phone address=%s, pairing method=%s", str, xhpVar);
        if (!this.d) {
            ypfVar.f().ai(8230).u("sendPairingRequest on closed channel");
            return;
        }
        abnp abnpVarN = xhq.a.n();
        abnpVarN.t();
        xhq xhqVar = (xhq) abnpVarN.b;
        xhqVar.b |= 1;
        xhqVar.c = str;
        if (xhpVar != null) {
            abnpVarN.t();
            xhq xhqVar2 = (xhq) abnpVarN.b;
            xhqVar2.d = xhpVar.f;
            xhqVar2.b |= 2;
        }
        this.c = true;
        super.o(32769, abnpVarN.q(), true);
    }

    @Override // defpackage.ruq, defpackage.rsq
    public final void u(int i) {
        this.d = false;
    }

    @Override // defpackage.ruq, defpackage.rsq
    public final void v() {
        this.d = true;
        super.v();
    }

    @Override // defpackage.rsp
    public final void e(int i) {
    }
}
