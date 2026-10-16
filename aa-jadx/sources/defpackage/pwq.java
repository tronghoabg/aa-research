package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class pwq extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.pwr a;

    public pwq(defpackage.pwr pwrVar) {
        this.a = pwrVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            defpackage.pwr pwrVar = this.a;
            synchronized (pwrVar) {
                defpackage.zif zifVar = pwrVar.a;
                if (zifVar == null) {
                    return;
                }
                defpackage.pxg pxgVarC = pwrVar.c();
                if (pxgVarC != null) {
                    zifVar.o(pxgVarC);
                } else if (zifVar.isDone()) {
                    pwrVar.a = null;
                }
            }
        }
    }
}
