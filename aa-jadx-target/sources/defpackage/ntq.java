package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ntq extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.ntr a;

    public ntq(defpackage.ntr ntrVar) {
        this.a = ntrVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        this.a.a(context);
    }
}
