package defpackage;

import android.hardware.usb.UsbPort;

/* loaded from: classes.dex */
public final /* synthetic */ class kqn implements dny {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kqn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.dny
    public final Object a(final dnw dnwVar) {
        if (this.b != 0) {
            ((jlu) ((xyc) ((jou) this.a).g.get()).gu()).b(dlz.D(), new jmh() { // from class: joj
                @Override // defpackage.jmh
                public final void a() {
                    yph yphVar = jou.a;
                    dnwVar.b(null);
                }
            });
            return "sendDeviceDisappeared";
        }
        ((UsbPort) this.a).resetUsbPort(kqq.b, new kok(dnwVar, 3));
        return "resetUsbPort() complete";
    }
}
