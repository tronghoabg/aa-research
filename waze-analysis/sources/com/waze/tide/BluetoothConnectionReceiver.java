package com.waze.tide;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class BluetoothConnectionReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f40911a = h.g.a(new com.waze.bx.a(8));

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        com.waze.shared_infra.i.h.a("BluetoothConnectionReceiver onReceive");
        if (intent == null) {
            com.waze.shared_infra.i.h.j("BluetoothConnectionReceiver Intent is null");
            return;
        }
        String action = intent.getAction();
        BluetoothDevice bluetoothDevice = Build.VERSION.SDK_INT >= 33 ? (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE", BluetoothDevice.class) : (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (!h.g.b.x.n(action, "android.bluetooth.device.action.ACL_CONNECTED")) {
            com.waze.shared_infra.i.h.a("BluetoothConnectionReceiver Unknown action: ".concat(String.valueOf(action)));
        } else if (bluetoothDevice != null) {
            ((o) this.f40911a.getValue()).e(new k(bluetoothDevice));
        }
    }
}
