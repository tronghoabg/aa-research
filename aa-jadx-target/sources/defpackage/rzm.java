package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class rzm extends defpackage.sts {
    public boolean a;
    final /* synthetic */ defpackage.rzn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rzm(defpackage.rzn rznVar) {
        super(null);
        this.b = rznVar;
        this.a = false;
    }

    @Override // defpackage.sts
    public final void a(android.content.Intent intent) {
        if (j$.util.Objects.equals(intent.getAction(), "android.hardware.usb.action.USB_PORT_CHANGED")) {
            defpackage.rzn rznVar = this.b;
            java.util.Map map = rznVar.b;
            if (map.size() != 1 || !intent.hasExtra("portStatus")) {
                for (java.util.Map.Entry entry : rznVar.d.a().entrySet()) {
                    rznVar.b((java.lang.String) entry.getKey(), (rzq) entry.getValue(), new java.util.Date());
                }
                return;
            }
            android.hardware.usb.UsbPortStatus parcelableExtra = intent.getParcelableExtra("portStatus");
            if (parcelableExtra == null) {
                defpackage.rzn.a.h().ai(8585).u("UsbPortStatus is null");
            } else {
                rznVar.b((java.lang.String) map.keySet().iterator().next(), defpackage.rzc.d(parcelableExtra), new java.util.Date());
            }
        }
    }
}
