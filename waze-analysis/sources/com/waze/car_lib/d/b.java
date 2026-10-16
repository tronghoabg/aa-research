package com.waze.car_lib.d;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Build;
import androidx.core.content.ContextCompat;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f19266a;

    public b(Context context) {
        x.f(context, "context");
        this.f19266a = context;
    }

    public final boolean a() {
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        Context context = this.f19266a;
        return ContextCompat.checkSelfPermission(context, "android.permission.BLUETOOTH_SCAN") == 0 && ContextCompat.checkSelfPermission(context, "android.permission.BLUETOOTH_CONNECT") == 0;
    }

    public final boolean b() {
        BluetoothAdapter adapter;
        BluetoothManager bluetoothManager = (BluetoothManager) ContextCompat.getSystemService(this.f19266a, BluetoothManager.class);
        if (bluetoothManager == null || (adapter = bluetoothManager.getAdapter()) == null) {
            return false;
        }
        return adapter.isEnabled();
    }
}
