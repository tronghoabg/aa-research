package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qds implements android.content.ServiceConnection {
    public final /* synthetic */ defpackage.qdv a;

    public qds(defpackage.qdv qdvVar) {
        this.a = qdvVar;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(android.content.ComponentName componentName) {
        android.util.Log.e("CrossProfileSender", "onBindingDied for component ".concat(java.lang.String.valueOf(java.lang.String.valueOf(componentName))));
        this.a.b.execute(new pyi(this, 15));
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(android.content.ComponentName componentName) {
        android.util.Log.e("CrossProfileSender", "onNullBinding for component ".concat(java.lang.String.valueOf(java.lang.String.valueOf(componentName))));
        this.a.b.execute(new pyi(this, 13));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        android.util.Log.i("CrossProfileSender", "onServiceConnected for component ".concat(java.lang.String.valueOf(java.lang.String.valueOf(componentName))));
        this.a.b.execute(new defpackage.qbr(this, iBinder, 3));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        android.util.Log.e("CrossProfileSender", "Unexpected disconnection for component ".concat(java.lang.String.valueOf(java.lang.String.valueOf(componentName))));
        this.a.b.execute(new pyi(this, 14));
    }
}
