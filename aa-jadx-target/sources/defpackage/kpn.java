package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kpn implements defpackage.xyp {
    @Override // defpackage.xyp
    public final boolean a(java.lang.Object obj) {
        android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) obj;
        defpackage.yqm yqmVar = defpackage.kpt.a;
        defpackage.sdt sdtVarB = defpackage.mpr.f().b();
        if (bluetoothDevice == null) {
            return false;
        }
        return ((defpackage.sdu) sdtVarB).d(bluetoothDevice.getAddress());
    }
}
