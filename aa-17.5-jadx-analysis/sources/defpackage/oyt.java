package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import j$.util.DesugarArrays;
import j$.util.stream.Stream;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
final class oyt extends BroadcastReceiver {
    final /* synthetic */ oyw a;

    public oyt(oyw oywVar) {
        this.a = oywVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        yfq yfqVar;
        String action = intent.getAction();
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        boolean zEquals = "android.bluetooth.device.action.UUID".equals(action);
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("android.bluetooth.device.extra.UUID");
        if (!zEquals || bluetoothDevice == null) {
            return;
        }
        oyw oywVar = this.a;
        Map map = oywVar.d;
        if (map.containsKey(bluetoothDevice)) {
            ((ype) ((ype) oyw.a.f()).ai(6208)).M("UUID broadcast received for: %s with UUIDs: %s", bluetoothDevice, Arrays.toString(parcelableArrayExtra));
            synchronized (map) {
                if (map.containsKey(bluetoothDevice)) {
                    Object obj = ((trd) map.get(bluetoothDevice)).b;
                    if (parcelableArrayExtra == null) {
                        yfqVar = null;
                    } else {
                        Stream map2 = DesugarArrays.stream(parcelableArrayExtra).map(new nsb(13));
                        int i = yfq.d;
                        yfqVar = (yfq) map2.collect(ycm.a);
                    }
                    ((dnw) obj).b(new oyv(bluetoothDevice, yfqVar));
                    map.remove(bluetoothDevice);
                }
                oywVar.b();
            }
        }
    }
}
