package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ozb implements java.util.concurrent.Executor {
    private final /* synthetic */ int a;

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        int i = this.a;
        if (i == 0) {
            defpackage.yqm yqmVar = com.google.android.apps.auto.wireless.bluetooth.WifiBluetoothReceiver.a;
            new android.os.Handler(android.os.Looper.getMainLooper()).post(runnable);
        } else if (i == 1) {
            runnable.run();
        } else if (i != 2) {
            runnable.run();
        } else {
            runnable.run();
        }
    }
}
