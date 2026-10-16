package defpackage;

import android.content.Intent;
import android.hardware.usb.UsbPortStatus;
import j$.util.Objects;
import java.util.Date;
import java.util.Map;

/* loaded from: classes.dex */
final class ryr extends ssu {
    public boolean a;
    final /* synthetic */ rys b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ryr(rys rysVar) {
        super(null);
        this.b = rysVar;
        this.a = false;
    }

    @Override // defpackage.ssu
    public final void a(Intent intent) {
        if (Objects.equals(intent.getAction(), "android.hardware.usb.action.USB_PORT_CHANGED")) {
            rys rysVar = this.b;
            Map map = rysVar.b;
            if (map.size() != 1 || !intent.hasExtra("portStatus")) {
                for (Map.Entry entry : rysVar.d.a().entrySet()) {
                    rysVar.b((String) entry.getKey(), (ryv) entry.getValue(), new Date());
                }
                return;
            }
            UsbPortStatus parcelableExtra = intent.getParcelableExtra("portStatus");
            if (parcelableExtra == null) {
                rys.a.h().ai(8560).u("UsbPortStatus is null");
            } else {
                rysVar.b((String) map.keySet().iterator().next(), ryh.d(parcelableExtra), new Date());
            }
        }
    }
}
