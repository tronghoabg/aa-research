package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.os.Build;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class rgu {
    private static final ypf b = ols.R("CAR.BT.HeadsetWrapper");
    public final BluetoothHeadset a;

    public rgu(BluetoothHeadset bluetoothHeadset) {
        this.a = bluetoothHeadset;
    }

    public final int a(BluetoothDevice bluetoothDevice) {
        return this.a.getConnectionState(bluetoothDevice);
    }

    public final boolean b(BluetoothDevice bluetoothDevice) {
        return this.a.setConnectionPolicy(bluetoothDevice, 100);
    }

    @ResultIgnorabilityUnspecified
    public final boolean c(BluetoothDevice bluetoothDevice) {
        try {
            return ((Boolean) BluetoothHeadset.class.getMethod("connect", BluetoothDevice.class).invoke(this.a, bluetoothDevice)).booleanValue();
        } catch (ReflectiveOperationException e) {
            b.g().p(e).ai(8073).y("Error calling BluetoothHeadset#%s", "connect");
            return false;
        }
    }

    public final void d(BluetoothDevice bluetoothDevice) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT > 29) {
            this.a.setConnectionPolicy(bluetoothDevice, 100);
            return;
        }
        try {
            BluetoothHeadset.class.getMethod("setPriority", BluetoothDevice.class, Integer.TYPE).invoke(this.a, bluetoothDevice, 100);
        } catch (ReflectiveOperationException e) {
            b.g().p(e).ai(8074).u("Error calling BluetoothHeadset#setPriority");
        }
    }
}
