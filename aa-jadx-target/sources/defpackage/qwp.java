package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qwp extends defpackage.ijw implements qwq {
    public final java.lang.Object a;
    public final java.util.Set b;
    private final android.os.Handler c;

    public qwp(android.os.Looper looper) {
        super("com.google.android.gms.car.ICarBluetoothClient");
        this.a = new java.lang.Object();
        this.b = new java.util.LinkedHashSet();
        this.c = new defpackage.stq(looper, new defpackage.rou(this));
    }

    public final void a() {
        if (defpackage.omv.c("CarBluetoothClient", 3)) {
            defpackage.rrx.a("CarBluetoothClient", null, "onCarDisconnected");
        }
        android.os.Handler handler = this.c;
        handler.sendMessageAtFrontOfQueue(handler.obtainMessage(7));
    }

    public final void e() throws android.os.RemoteException {
        if (defpackage.omv.c("CarBluetoothClient", 3)) {
            defpackage.rrx.a("CarBluetoothClient", null, "onCarDelayedPairing");
        }
        android.os.Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(2));
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                g();
                return true;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                f();
                return true;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                e();
                return true;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                j();
                return true;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                k();
                return true;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                h();
                return true;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                i();
                return true;
            default:
                return false;
        }
    }

    public final void f() throws android.os.RemoteException {
        if (defpackage.omv.c("CarBluetoothClient", 3)) {
            defpackage.rrx.a("CarBluetoothClient", null, "onDisabled");
        }
        android.os.Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(1));
    }

    public final void g() throws android.os.RemoteException {
        if (defpackage.omv.c("CarBluetoothClient", 3)) {
            defpackage.rrx.a("CarBluetoothClient", null, "onEnabled");
        }
        android.os.Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(0));
    }

    public final void h() throws android.os.RemoteException {
        if (defpackage.omv.c("CarBluetoothClient", 3)) {
            defpackage.rrx.a("CarBluetoothClient", null, "onHfpConnected");
        }
        android.os.Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(5));
    }

    public final void i() throws android.os.RemoteException {
        if (defpackage.omv.c("CarBluetoothClient", 3)) {
            defpackage.rrx.a("CarBluetoothClient", null, "onHfpDisconnected");
        }
        android.os.Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(6));
    }

    public final void j() throws android.os.RemoteException {
        if (defpackage.omv.c("CarBluetoothClient", 3)) {
            defpackage.rrx.a("CarBluetoothClient", null, "onPaired");
        }
        android.os.Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void k() throws android.os.RemoteException {
        if (defpackage.omv.c("CarBluetoothClient", 3)) {
            defpackage.rrx.a("CarBluetoothClient", null, "onUnpaired");
        }
        android.os.Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(4));
    }

    public qwp() {
        throw null;
    }
}
