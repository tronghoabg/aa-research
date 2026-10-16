package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rhd implements android.bluetooth.BluetoothProfile.ServiceListener {
    final /* synthetic */ defpackage.rhe a;

    public rhd(defpackage.rhe rheVar) {
        this.a = rheVar;
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i, android.bluetooth.BluetoothProfile bluetoothProfile) {
        defpackage.rhe rheVar = this.a;
        if (rheVar.d) {
            rheVar.b.d(i, bluetoothProfile);
            defpackage.rhe.a.f().ai(8040).u("skipping a2dp onServiceConnected - object is invalidated");
        } else {
            defpackage.rhe.a.l().ai(8039).u("a2dp onServiceConnected");
            rheVar.f = new defpackage.khb((android.bluetooth.BluetoothA2dp) bluetoothProfile);
            rheVar.a();
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i) {
        defpackage.rhe.a.l().ai(8041).u("a2dp onServiceDisconnected");
    }
}
