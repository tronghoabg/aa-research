package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService;
import j$.util.OptionalInt;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
final class phf implements zge {
    final /* synthetic */ zhc a;
    final /* synthetic */ BluetoothDevice b;
    final /* synthetic */ phh c;
    final /* synthetic */ OptionalInt d;
    final /* synthetic */ Intent e;
    final /* synthetic */ WirelessSetupSharedService f;

    public phf(WirelessSetupSharedService wirelessSetupSharedService, zhc zhcVar, BluetoothDevice bluetoothDevice, phh phhVar, OptionalInt optionalInt, Intent intent) {
        this.a = zhcVar;
        this.b = bluetoothDevice;
        this.c = phhVar;
        this.d = optionalInt;
        this.e = intent;
        this.f = wirelessSetupSharedService;
    }

    @Override // defpackage.zge
    public final void a(Throwable th) {
        this.a.o(null);
        if (!(th instanceof CancellationException)) {
            throw new IllegalStateException("Failed to register state tracker callback.", th);
        }
        ((ype) WirelessSetupSharedService.a.l().ai((char) 6642)).u("Cancelled waiting for HFP device to associate with dongle.");
    }

    @Override // defpackage.zge
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.o(null);
        phg phgVar = new phg(null, this.c.a);
        this.f.c(this.b, phgVar, this.d, this.e);
    }
}
