package defpackage;

import android.bluetooth.BluetoothDevice;
import com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService;

/* loaded from: classes2.dex */
public final class pha implements ozc {
    final /* synthetic */ WirelessSetupSharedService a;

    public pha(WirelessSetupSharedService wirelessSetupSharedService) {
        this.a = wirelessSetupSharedService;
    }

    @Override // defpackage.ozc
    public final void d(ygr ygrVar, ygu yguVar) {
        WirelessSetupSharedService wirelessSetupSharedService = this.a;
        wirelessSetupSharedService.q.d(yxi.WIRELESS_SETUP_BLUETOOTH_TRACKER_STARTED);
        if (ygrVar.isEmpty()) {
            wirelessSetupSharedService.q.d(yxi.WIRELESS_SETUP_BLUETOOTH_TRACKER_STARTED_WITH_NO_DEVICES);
        }
        wirelessSetupSharedService.v.g(this);
    }

    @Override // defpackage.ozc
    public final void e() {
    }

    @Override // defpackage.ozc
    public final void a(BluetoothDevice bluetoothDevice) {
    }

    @Override // defpackage.ozc
    public final void b(BluetoothDevice bluetoothDevice) {
    }

    @Override // defpackage.ozc
    public final void c(BluetoothDevice bluetoothDevice) {
    }

    @Override // defpackage.ozc
    public final void f(BluetoothDevice bluetoothDevice, int i) {
    }
}
