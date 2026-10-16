package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ez extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.fa a;

    public ez(defpackage.fa faVar) {
        this.a = faVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        this.a.b();
    }
}
