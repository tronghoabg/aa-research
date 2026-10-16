package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothProfile;
import android.content.Context;

/* loaded from: classes2.dex */
public final class oqn implements BluetoothProfile.ServiceListener {
    public static final /* synthetic */ int e = 0;
    final /* synthetic */ oqg a;
    final /* synthetic */ BluetoothAdapter b;
    final /* synthetic */ Context c;
    final /* synthetic */ oqp d;

    public oqn(oqg oqgVar, BluetoothAdapter bluetoothAdapter, Context context, oqp oqpVar) {
        this.a = oqgVar;
        this.b = bluetoothAdapter;
        this.c = context;
        this.d = oqpVar;
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        yfq yfqVarA = this.a.a(bluetoothProfile);
        this.b.closeProfileProxy(i, bluetoothProfile);
        mki.a.d.execute(new oey(this.c, yfqVarA, this.d, 9));
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i) {
    }
}
