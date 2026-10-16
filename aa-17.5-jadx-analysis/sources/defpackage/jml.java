package defpackage;

import android.bluetooth.BluetoothDevice;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class jml extends afey implements afei {
    public static final jml a = new jml();

    public jml() {
        super(4, pan.class, "connectAndStartWirelessSetup", "connectAndStartWirelessSetup(Lcom/google/android/apps/auto/wireless/setup/client/WirelessSharedServiceClient;Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/ListenableFuture;", 0);
    }

    @Override // defpackage.afei
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return pan.e((pal) obj, (String) obj2, (BluetoothDevice) obj3, (Executor) obj4);
    }
}
