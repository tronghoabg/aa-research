package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rtb extends defpackage.rvj {
    private static final defpackage.yqk a = defpackage.omv.n("CAR.GAL.BT");
    private final defpackage.rta b;
    private boolean c;
    private volatile boolean d;

    public rtb(defpackage.rta rtaVar, defpackage.rvm rvmVar) {
        super(9, rtaVar, rvmVar, 0);
        this.c = false;
        this.d = false;
        this.b = rtaVar;
    }

    @Override // defpackage.rvj
    protected final void d(int i, java.nio.ByteBuffer byteBuffer) throws defpackage.abpp {
        xio xioVar;
        if (i == 32770) {
            xis xisVarW = defpackage.abox.w(xis.a, byteBuffer);
            if (xisVarW == null) {
                a.g().ai(8252).u("Wrong BluetoothPairingResponse message");
                return;
            }
            defpackage.yqk yqkVar = a;
            yqkVar.l().ai(8246).u("handlePairingResponse");
            if (!this.c) {
                yqkVar.h().ai(8248).u("Have not sent pairing request");
                return;
            }
            defpackage.xls xlsVarB = defpackage.xls.b(xisVarW.b);
            if (xlsVarB == null) {
                xlsVarB = defpackage.xls.STATUS_UNSOLICITED_MESSAGE;
            }
            boolean z = xisVarW.c;
            yqkVar.l().ai(8247).N("Got pairing response. status=%s alreadyPaired=%b", xlsVarB, z);
            defpackage.rta rtaVar = this.b;
            defpackage.qsa.a.l().ai(7746).N("onPairingResponse. status=%s alreadyPaired=%b", xlsVarB, z);
            defpackage.qsa qsaVar = (defpackage.qsa) rtaVar;
            qsaVar.o(new defpackage.lvu(qsaVar, xlsVarB, z, 3));
            return;
        }
        if (i != 32771) {
            a.h().ai(8249).w("Wrong Bluetooth message type: %d", i);
            return;
        }
        char[] cArr = null;
        try {
            xioVar = (xio) defpackage.abox.w(xio.a, byteBuffer);
        } catch (defpackage.abpp e) {
            a.g().ai(8251).y("Invalid Protocol Buffer %s", e.getMessage());
            xioVar = null;
        }
        if (xioVar == null) {
            a.g().ai(8250).u("Wrong BluetoothAuthenticationData message");
            return;
        }
        if ((xioVar.b & 1) == 0) {
            a.l().ai(8245).u("No auth data.");
            return;
        }
        a.l().ai(8244).y("handleAuthData. auth data: %s", xioVar.c);
        defpackage.rta rtaVar2 = this.b;
        java.lang.String strBv = defpackage.ysr.bv(xioVar.c);
        defpackage.qsa.a.l().ai(7743).y("onAuthenticationData: auth data=%s", strBv);
        ((defpackage.qsa) rtaVar2).o(new defpackage.qnf(rtaVar2, strBv, 4, cArr));
    }

    public final void f(rsz rszVar) {
        a.l().ai(8253).y("sendAuthenticationResult: result=%s", rszVar);
        defpackage.abor aborVarN = xip.a.n();
        defpackage.xls xlsVar = defpackage.xls.STATUS_UNSOLICITED_MESSAGE;
        aborVarN.t();
        xip xipVar = aborVarN.b;
        xipVar.c = xlsVar.I;
        xipVar.b |= 1;
        int iOrdinal = rszVar.ordinal();
        if (iOrdinal == 0) {
            defpackage.xls xlsVar2 = defpackage.xls.STATUS_SUCCESS;
            aborVarN.t();
            xip xipVar2 = aborVarN.b;
            xipVar2.c = xlsVar2.I;
            xipVar2.b |= 1;
        } else if (iOrdinal == 1) {
            defpackage.xls xlsVar3 = defpackage.xls.STATUS_BLUETOOTH_INVALID_PAIRING_METHOD;
            aborVarN.t();
            xip xipVar3 = aborVarN.b;
            xipVar3.c = xlsVar3.I;
            xipVar3.b |= 1;
        } else if (iOrdinal == 2) {
            defpackage.xls xlsVar4 = defpackage.xls.STATUS_BLUETOOTH_INVALID_AUTH_DATA;
            aborVarN.t();
            xip xipVar4 = aborVarN.b;
            xipVar4.c = xlsVar4.I;
            xipVar4.b |= 1;
        } else if (iOrdinal == 3) {
            defpackage.xls xlsVar5 = defpackage.xls.STATUS_BLUETOOTH_AUTH_DATA_MISMATCH;
            aborVarN.t();
            xip xipVar5 = aborVarN.b;
            xipVar5.c = xlsVar5.I;
            xipVar5.b |= 1;
        }
        super.o(32772, aborVarN.q(), true);
    }

    public final void g(java.lang.String str, defpackage.xiq xiqVar) {
        defpackage.yqk yqkVar = a;
        yqkVar.l().ai(8254).M("sendPairingRequest: phone address=%s, pairing method=%s", str, xiqVar);
        if (!this.d) {
            yqkVar.f().ai(8255).u("sendPairingRequest on closed channel");
            return;
        }
        defpackage.abor aborVarN = defpackage.xir.a.n();
        aborVarN.t();
        defpackage.xir xirVar = (defpackage.xir) aborVarN.b;
        xirVar.b |= 1;
        xirVar.c = str;
        if (xiqVar != null) {
            aborVarN.t();
            defpackage.xir xirVar2 = (defpackage.xir) aborVarN.b;
            xirVar2.d = xiqVar.f;
            xirVar2.b |= 2;
        }
        this.c = true;
        super.o(32769, aborVarN.q(), true);
    }

    @Override // defpackage.rvj, defpackage.rtk
    public final void u(int i) {
        this.d = false;
    }

    @Override // defpackage.rvj, defpackage.rtk
    public final void v() {
        this.d = true;
        super.v();
    }

    @Override // defpackage.rtj
    public final void e(int i) {
    }
}
