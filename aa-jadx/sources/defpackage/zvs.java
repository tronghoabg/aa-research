package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class zvs extends android.content.BroadcastReceiver {
    private final defpackage.zvt a;

    public zvs(defpackage.zvt zvtVar) {
        this.a = zvtVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        defpackage.zvt zvtVar = this.a;
        if (defpackage.zsj.b(zvtVar.a)) {
            synchronized (zvtVar) {
            }
        }
    }
}
