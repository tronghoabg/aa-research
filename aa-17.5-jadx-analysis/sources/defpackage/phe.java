package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService;
import j$.time.Duration;
import j$.util.OptionalInt;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
final class phe implements zge {
    final /* synthetic */ zhc a;
    final /* synthetic */ BluetoothDevice b;
    final /* synthetic */ OptionalInt c;
    final /* synthetic */ Intent d;
    final /* synthetic */ phh e;
    final /* synthetic */ Duration f;
    final /* synthetic */ WirelessSetupSharedService g;

    public phe(WirelessSetupSharedService wirelessSetupSharedService, zhc zhcVar, BluetoothDevice bluetoothDevice, OptionalInt optionalInt, Intent intent, phh phhVar, Duration duration) {
        this.a = zhcVar;
        this.b = bluetoothDevice;
        this.c = optionalInt;
        this.d = intent;
        this.e = phhVar;
        this.f = duration;
        this.g = wirelessSetupSharedService;
    }

    @Override // defpackage.zge
    public final void a(Throwable th) {
        this.a.o(null);
        if (!(th instanceof TimeoutException)) {
            if (!(th instanceof CancellationException)) {
                throw new IllegalStateException("Failed to register state tracker callback.", th);
            }
            ((ype) WirelessSetupSharedService.a.l().ai((char) 6640)).u("Cancelled query for dongle associated HFP device.");
        } else {
            WirelessSetupSharedService wirelessSetupSharedService = this.g;
            ozd ozdVar = wirelessSetupSharedService.v;
            ozdVar.getClass();
            ozdVar.g(this.e);
            ((ype) ((ype) ((ype) WirelessSetupSharedService.a.g()).p(th)).ai(6641)).L("Failed to find associated Head Unit for %s within %d seconds", this.b, this.f.toSeconds());
            wirelessSetupSharedService.d();
        }
    }

    @Override // defpackage.zge
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.o(null);
        phg phgVar = new phg((BluetoothDevice) obj, null);
        this.g.c(this.b, phgVar, this.c, this.d);
    }
}
