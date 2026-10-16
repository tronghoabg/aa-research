package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kqu implements defpackage.dog {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kqu(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.dog
    public final java.lang.Object a(final defpackage.doe doeVar) {
        if (this.b != 0) {
            ((defpackage.jmb) ((defpackage.xzi) ((defpackage.jpc) this.a).g.get()).fF()).b(defpackage.ebm.n(), new jmo() { // from class: jor
                public final void a() {
                    defpackage.yqm yqmVar = defpackage.jpc.a;
                    doeVar.b(null);
                }
            });
            return "sendDeviceDisappeared";
        }
        ((android.hardware.usb.UsbPort) this.a).resetUsbPort(defpackage.kqx.b, new kcx(doeVar, 4));
        return "resetUsbPort() complete";
    }
}
