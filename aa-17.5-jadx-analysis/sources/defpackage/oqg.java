package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.os.Build;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class oqg {
    public static final yph a = yph.c("GH.BtDevicePortal");
    private final Context b;
    private final Executor c;

    public oqg(Context context, Executor executor) {
        this.b = context;
        this.c = executor;
    }

    private static final yfq b(BluetoothProfile bluetoothProfile) {
        List<BluetoothDevice> connectedDevices = bluetoothProfile.getConnectedDevices();
        Stream streamFilter = Collection.EL.stream(connectedDevices).filter(new oly(4));
        int i = yfq.d;
        yfq yfqVar = (yfq) streamFilter.collect(ycm.a);
        if (yfqVar.size() < connectedDevices.size()) {
            ((ype) ((ype) a.h()).ai(6073)).B("Bluetooth profile returned %d connected devices but only %d are valid", connectedDevices.size(), yfqVar.size());
        }
        return yfqVar;
    }

    @ResultIgnorabilityUnspecified
    public final yfq a(BluetoothProfile bluetoothProfile) {
        if (Build.VERSION.SDK_INT < 31) {
            return b(bluetoothProfile);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            Context context = this.b;
            if (context.checkSelfPermission("android.permission.BLUETOOTH_CONNECT") == -1) {
                rxf.j(context, this.c, yxo.BLUETOOTH_CONNECT_PERMISSION_MISSING);
                int i = yfq.d;
                return yls.a;
            }
        }
        rxf.i(this.b, this.c, yxo.BLUETOOTH_CONNECT_PERMISSION_MISSING);
        return b(bluetoothProfile);
    }
}
