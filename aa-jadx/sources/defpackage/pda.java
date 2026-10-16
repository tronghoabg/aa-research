package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pda implements defpackage.rlv {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ pda(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.rlv
    public final java.lang.Object a(defpackage.pbr pbrVar) throws java.io.IOException {
        int i = this.b;
        if (i == 0) {
            defpackage.pdc pdcVar = (defpackage.pdc) this.a;
            java.util.concurrent.atomic.AtomicReference atomicReference = pdcVar.c;
            atomicReference.set(null);
            defpackage.pbr pbrVar2 = defpackage.pbr.WIFI_NETWORK_DELAY_AVAILABLE;
            boolean z = pbrVar != pbrVar2;
            if (pbrVar == pbrVar2) {
                pdcVar.a.l().u("Delay the onAvailable delivery intentionally.");
                atomicReference.set(new defpackage.aium());
            }
            return java.lang.Boolean.valueOf(!z);
        }
        if (i == 1) {
            if (pbrVar != defpackage.pbr.IO_EXCEPTION) {
                return java.lang.Integer.valueOf(((defpackage.kok) this.a).a.read());
            }
            throw new java.io.IOException("Failed to read due to failure injection");
        }
        if (i == 2) {
            if (pbrVar == defpackage.pbr.WIFI_NETWORK_LOST) {
                ((defpackage.pdc) this.a).a.l().u("Schedule onLost callback intentionally which will be triggered in the PostInjectionAction.");
            }
            return defpackage.afbk.a;
        }
        if (i == 3) {
            return ((defpackage.pil) this.a).i(pbrVar);
        }
        if (i == 4) {
            return ((defpackage.pin) this.a).i(pbrVar);
        }
        defpackage.yqk yqkVar = com.google.android.gms.carsetup.setup.UsbConnectionHelper.a;
        return pbrVar == defpackage.pbr.NO_USB_ACCESSORIES ? new android.hardware.usb.UsbAccessory[0] : this.a;
    }
}
