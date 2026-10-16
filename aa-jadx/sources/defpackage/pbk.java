package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pbk implements defpackage.pbh {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.WirelessClient");
    public volatile defpackage.pce b;
    public volatile android.os.IBinder c;
    public final boolean d;
    public final android.bluetooth.BluetoothDevice e;
    public final java.util.concurrent.Executor f;
    public volatile defpackage.pbd h;
    public final java.lang.Runnable i;
    public final defpackage.doe j;
    private final defpackage.pbi k;
    public final android.os.Handler g = new android.os.Handler(android.os.Looper.getMainLooper());
    private final java.util.concurrent.atomic.AtomicBoolean l = new java.util.concurrent.atomic.AtomicBoolean(false);

    public pbk(defpackage.pbi pbiVar, boolean z, android.bluetooth.BluetoothDevice bluetoothDevice, java.util.concurrent.Executor executor, defpackage.doe doeVar) {
        this.k = pbiVar;
        this.d = z;
        this.e = bluetoothDevice;
        this.f = executor;
        this.j = doeVar;
        pbiVar.getClass();
        this.i = new defpackage.osa(pbiVar, 18);
    }

    public static defpackage.zhs d(defpackage.pbi pbiVar, java.lang.String str, android.bluetooth.BluetoothDevice bluetoothDevice, java.util.concurrent.Executor executor) {
        ((defpackage.yqj) a.l().ai((char) 6283)).u("Connecting and starting projection");
        if (!defpackage.adax.ba()) {
            return defpackage.dlv.n(new defpackage.pbj(pbiVar, bluetoothDevice, executor, str, 0));
        }
        pbiVar.a(new defpackage.pbk(pbiVar, true, bluetoothDevice, executor, null), str, bluetoothDevice, false);
        return defpackage.ysr.cp(java.lang.Boolean.TRUE);
    }

    public static defpackage.zhs e(defpackage.pbi pbiVar, java.lang.String str, android.bluetooth.BluetoothDevice bluetoothDevice, java.util.concurrent.Executor executor) {
        ((defpackage.yqj) a.l().ai((char) 6284)).u("Connecting and starting wireless setup");
        pbiVar.a(new defpackage.pbk(pbiVar, false, bluetoothDevice, executor, null), str, bluetoothDevice, false);
        return defpackage.ysr.cp(java.lang.Boolean.TRUE);
    }

    @Override // defpackage.pbe
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final void c(defpackage.pbd pbdVar, android.os.Bundle bundle) {
        if (g(pbdVar)) {
            try {
                ((defpackage.yqj) a.l().ai(6290)).u("Starting projection and disconnecting");
                f();
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 6291)).u("Remote gone. Cannot start projection");
            }
        }
    }

    public final void f() throws android.os.RemoteException {
        if (this.l.compareAndSet(false, true)) {
            ((defpackage.yqj) a.l().ai(6292)).y("Starting wireless projection: %s", this.c);
            this.b.g(this.c);
            android.os.Handler handler = this.g;
            handler.removeCallbacks(this.i);
            defpackage.pbi pbiVar = this.k;
            pbiVar.getClass();
            handler.post(new defpackage.osa(pbiVar, 18));
        }
    }

    public final boolean g(defpackage.pbd pbdVar) {
        return this.d && pbdVar.Z;
    }

    @Override // defpackage.pbe
    public final void b() {
    }

    @Override // defpackage.pbe
    public final void a(java.lang.String str, int i, android.net.wifi.WifiInfo wifiInfo, int i2, int i3) {
    }
}
