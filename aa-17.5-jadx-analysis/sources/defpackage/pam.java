package defpackage;

import android.bluetooth.BluetoothDevice;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final /* synthetic */ class pam implements dny {
    public final /* synthetic */ BluetoothDevice a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ pam(oyr oyrVar, Executor executor, BluetoothDevice bluetoothDevice, oyp oypVar, int i) {
        this.e = i;
        this.d = oyrVar;
        this.b = executor;
        this.a = bluetoothDevice;
        this.c = oypVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, pal] */
    @Override // defpackage.dny
    public final Object a(dnw dnwVar) {
        if (this.e != 0) {
            Object obj = this.c;
            BluetoothDevice bluetoothDevice = this.a;
            Executor executor = this.b;
            executor.execute(new etr((oyr) this.d, executor, bluetoothDevice, (oyp) obj, dnwVar, 4));
            return "isDeviceAndroidAutoWirelessSupportedAsync";
        }
        Executor executor2 = this.b;
        BluetoothDevice bluetoothDevice2 = this.a;
        ?? r1 = this.c;
        r1.a(new pan(r1, true, bluetoothDevice2, executor2, dnwVar), (String) this.d, bluetoothDevice2, true);
        return "connectAndStartProjection";
    }

    public /* synthetic */ pam(pal palVar, BluetoothDevice bluetoothDevice, Executor executor, String str, int i) {
        this.e = i;
        this.c = palVar;
        this.a = bluetoothDevice;
        this.b = executor;
        this.d = str;
    }
}
