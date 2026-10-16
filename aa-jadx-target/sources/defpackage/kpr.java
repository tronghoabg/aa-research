package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kpr extends android.content.BroadcastReceiver {
    public final /* synthetic */ defpackage.kpt a;

    public kpr(defpackage.kpt kptVar) {
        this.a = kptVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        this.a.x(new defpackage.kmp(this, 6));
    }
}
