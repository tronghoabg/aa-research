package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class koz implements android.bluetooth.BluetoothProfile.ServiceListener {
    final /* synthetic */ defpackage.zif a;

    public koz(defpackage.zif zifVar) {
        this.a = zifVar;
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i, android.bluetooth.BluetoothProfile bluetoothProfile) {
        defpackage.yqm yqmVar = defpackage.kpb.a;
        this.a.o(bluetoothProfile);
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i) {
        defpackage.yqm yqmVar = defpackage.kpb.a;
    }
}
