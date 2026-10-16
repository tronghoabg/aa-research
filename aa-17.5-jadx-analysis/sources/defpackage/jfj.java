package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class jfj {
    private static final yph a = yph.c("CAR.CONTEXT");

    public static BluetoothAdapter a(Context context) {
        BluetoothManager bluetoothManager = (BluetoothManager) c(context).getSystemService(BluetoothManager.class);
        if (bluetoothManager == null) {
            return null;
        }
        return bluetoothManager.getAdapter();
    }

    public static BluetoothDevice b(Context context, BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 34 || !acuc.c()) {
            return bluetoothDevice;
        }
        yph yphVar = a;
        ((ype) yphVar.l().ai(1994)).D("Context: deviceId=%d, attributionSource=%s", context.getDeviceId(), context.getAttributionSource());
        BluetoothAdapter bluetoothAdapterA = a(context);
        bluetoothAdapterA.getClass();
        BluetoothDevice remoteDevice = bluetoothAdapterA.getRemoteDevice(bluetoothDevice.getAddress());
        ((ype) yphVar.l().ai((char) 1995)).u("Recreated BluetoothDevice using default device context.");
        return remoteDevice;
    }

    public static Context c(Context context) {
        return (Build.VERSION.SDK_INT < 34 || !acuc.g()) ? context : context.createDeviceContext(0);
    }
}
