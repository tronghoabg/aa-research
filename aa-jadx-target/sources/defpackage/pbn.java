package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class pbn implements defpackage.pbi {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.WirelessClient");
    private static final android.content.ComponentName l = new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService");
    public final android.content.Context b;
    public final android.content.ServiceConnection f;
    public volatile pce g;
    public volatile defpackage.pbh h;
    private final java.util.concurrent.Executor m;
    public final android.os.IBinder d = new android.os.Binder();
    public final android.os.Handler e = new android.os.Handler(android.os.Looper.getMainLooper());
    public j$.util.OptionalInt k = j$.util.OptionalInt.empty();
    boolean i = false;
    public boolean j = false;
    public final defpackage.pch c = new defpackage.pcg(this);

    public pbn(android.content.Context context, java.util.concurrent.Executor executor) {
        this.b = context;
        this.m = executor;
        this.f = new defpackage.pbm(this, executor);
    }

    @Override // defpackage.pbi
    public final void a(defpackage.pbh pbhVar, java.lang.String str, android.bluetooth.BluetoothDevice bluetoothDevice, boolean z) {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 6295)).y("Connecting to wireless setup shared service: %s", bluetoothDevice);
        this.h = pbhVar;
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(l);
        intent.setAction(str);
        intent.putExtra("android.bluetooth.device.extra.DEVICE", bluetoothDevice);
        this.k.ifPresent(new ozf(intent, 2));
        android.content.Context context = this.b;
        a$.ExternalSyntheticApiModelOutline1.m(context, intent);
        if (z) {
            this.i = context.bindService(intent, this.f, 64);
        }
    }

    @Override // defpackage.pbi
    public final void b() {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(6296)).y("Disconnecting wireless setup shared service %s", this.d);
        if (this.j) {
            this.m.execute(new osa(this, 20));
        } else if (this.i) {
            try {
                this.b.unbindService(this.f);
            } catch (java.lang.IllegalArgumentException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 6297)).u("Projection process crashed and restarted, no longer bound.");
            }
        }
    }
}
