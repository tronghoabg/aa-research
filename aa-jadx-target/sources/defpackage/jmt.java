package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jmt {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.CDMWirelessSetup");
    public final java.util.concurrent.Executor b;
    public final defpackage.oqy c;
    public final defpackage.affi d;
    public final android.bluetooth.BluetoothAdapter e;
    public final defpackage.pbi f;
    private final android.content.Context g;

    public jmt(android.content.Context context, java.util.concurrent.Executor executor, defpackage.oqy oqyVar, defpackage.affi affiVar) {
        this.g = context;
        this.b = executor;
        this.c = oqyVar;
        this.d = affiVar;
        this.e = ((android.bluetooth.BluetoothManager) defpackage.jfr.c(context).getSystemService(android.bluetooth.BluetoothManager.class)).getAdapter();
        this.f = new defpackage.pbn(context, executor);
    }
}
