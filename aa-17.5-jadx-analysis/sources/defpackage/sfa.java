package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class sfa implements BluetoothProfile.ServiceListener {
    final /* synthetic */ int a;
    final /* synthetic */ sss b;
    final /* synthetic */ Runnable c;
    final /* synthetic */ dnw d;
    final /* synthetic */ BluetoothAdapter e;

    public sfa(int i, sss sssVar, Runnable runnable, dnw dnwVar, BluetoothAdapter bluetoothAdapter) {
        this.a = i;
        this.b = sssVar;
        this.c = runnable;
        this.d = dnwVar;
        this.e = bluetoothAdapter;
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        int i2 = this.a;
        if (i != i2) {
            return;
        }
        this.b.removeCallbacks(this.c);
        ypf ypfVar = sfb.a;
        List<BluetoothDevice> connectedDevices = bluetoothProfile.getConnectedDevices();
        ArrayList arrayList = new ArrayList();
        for (BluetoothDevice bluetoothDevice : connectedDevices) {
            if (bluetoothDevice == null) {
                sfb.a.l().ai(8851).u("Bluetooth device is invalid due to being null");
            } else {
                arrayList.add(bluetoothDevice);
            }
        }
        if (arrayList.size() < connectedDevices.size()) {
            sfb.a.h().ai(8850).B("Bluetooth profile returned %d connected devices but only %d are valid", connectedDevices.size(), arrayList.size());
        }
        this.d.b(yfq.o(arrayList));
        this.e.closeProfileProxy(i2, bluetoothProfile);
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i) {
        this.b.removeCallbacks(this.c);
        int i2 = yfq.d;
        this.d.b(yls.a);
    }
}
