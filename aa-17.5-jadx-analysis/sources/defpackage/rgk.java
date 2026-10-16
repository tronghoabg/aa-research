package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes.dex */
public final class rgk {
    private static final ypf b = ols.R("CAR.BT.AdapterWrapper");
    public final BluetoothAdapter a;

    private rgk(BluetoothAdapter bluetoothAdapter) {
        this.a = bluetoothAdapter;
    }

    public static rgk a(Context context) {
        BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
        if (bluetoothManager == null) {
            b.g().ai(8023).u("Cannot get BluetoothManager");
            return null;
        }
        BluetoothAdapter adapter = bluetoothManager.getAdapter();
        if (adapter != null) {
            return new rgk(adapter);
        }
        b.g().ai(8022).u("Cannot get BluetoothAdapter");
        return null;
    }

    public final rgl b(String str) {
        BluetoothDevice remoteDevice = this.a.getRemoteDevice(str);
        if (remoteDevice != null) {
            return new rgl(remoteDevice);
        }
        return null;
    }

    public final String c() {
        return this.a.getAddress();
    }

    public final void d(int i, BluetoothProfile bluetoothProfile) {
        this.a.closeProfileProxy(i, bluetoothProfile);
    }

    public final boolean e() {
        try {
            return ((Boolean) BluetoothAdapter.class.getMethod("enableNoAutoConnect", null).invoke(this.a, null)).booleanValue();
        } catch (ReflectiveOperationException unused) {
            b.h().ai(8021).u("Error calling BluetoothAdapter#enableNoAutoConnect, falling back to BluetoothAdapter#enable");
            return this.a.enable();
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean f(Context context, BluetoothProfile.ServiceListener serviceListener, int i) {
        return this.a.getProfileProxy(context, serviceListener, i);
    }

    @ResultIgnorabilityUnspecified
    public final void g() {
        this.a.cancelDiscovery();
    }
}
