package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jfr {
    private static final defpackage.yqm a = defpackage.yqm.c("CAR.CONTEXT");

    public static android.bluetooth.BluetoothAdapter a(android.content.Context context) {
        android.bluetooth.BluetoothManager bluetoothManager = (android.bluetooth.BluetoothManager) c(context).getSystemService(android.bluetooth.BluetoothManager.class);
        if (bluetoothManager == null) {
            return null;
        }
        return bluetoothManager.getAdapter();
    }

    public static android.bluetooth.BluetoothDevice b(android.content.Context context, android.bluetooth.BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return null;
        }
        if (android.os.Build.VERSION.SDK_INT < 34 || !defpackage.acve.c()) {
            return bluetoothDevice;
        }
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai(1994)).D("Context: deviceId=%d, attributionSource=%s", context.getDeviceId(), context.getAttributionSource());
        android.bluetooth.BluetoothAdapter bluetoothAdapterA = a(context);
        bluetoothAdapterA.getClass();
        android.bluetooth.BluetoothDevice remoteDevice = bluetoothAdapterA.getRemoteDevice(bluetoothDevice.getAddress());
        ((defpackage.yqj) yqmVar.l().ai((char) 1995)).u("Recreated BluetoothDevice using default device context.");
        return remoteDevice;
    }

    public static android.content.Context c(android.content.Context context) {
        return (android.os.Build.VERSION.SDK_INT < 34 || !defpackage.acve.g()) ? context : context.createDeviceContext(0);
    }
}
