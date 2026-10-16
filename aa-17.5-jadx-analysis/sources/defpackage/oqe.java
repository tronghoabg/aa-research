package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface oqe {
    int a();

    SharedPreferences b(Context context);

    ozk c();

    ygr d();

    zgp e(Context context, oyo oyoVar);

    zgp f(Executor executor, xxj xxjVar);

    zgp g(BluetoothDevice bluetoothDevice, Context context);

    zgp h(Executor executor);

    boolean i(Context context);

    boolean j(BluetoothDevice bluetoothDevice);

    boolean k(Context context);

    void l(Context context, boolean z);
}
