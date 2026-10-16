package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rhr implements android.bluetooth.BluetoothProfile.ServiceListener {
    final /* synthetic */ defpackage.rhs a;

    public rhr(defpackage.rhs rhsVar) {
        this.a = rhsVar;
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i, android.bluetooth.BluetoothProfile bluetoothProfile) {
        defpackage.rhs rhsVar = this.a;
        if (rhsVar.f) {
            defpackage.rhs.a.l().ai(8102).u("skipping hfp onServiceConnected - object is invalidated");
            return;
        }
        defpackage.yqk yqkVar = defpackage.rhs.a;
        yqkVar.l().ai(8100).u("hfp onServiceConnected");
        if (i != 1) {
            yqkVar.h().ai(8101).w("hfp onServiceConnected: wrong profile=%d", i);
            return;
        }
        rhsVar.e = new defpackage.rhp((android.bluetooth.BluetoothHeadset) bluetoothProfile);
        if (rhsVar.e == null) {
            yqkVar.l().ai(8106).u("BluetoothProfileUtilImpl is not initialized");
        } else {
            yqkVar.l().ai(8105).u("BluetoothProfileUtilImpl initialized");
            rhsVar.d.run();
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i) {
        defpackage.rhs.a.l().ai(8103).u("hfp onServiceDisconnected");
    }
}
