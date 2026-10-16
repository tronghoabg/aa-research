package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qqr extends defpackage.rce {
    private boolean a;

    public qqr(defpackage.qqt qqtVar, android.os.Looper looper) {
        super(qqtVar, looper);
        this.a = false;
    }

    public final synchronized void a(long j) {
        if (this.a) {
            return;
        }
        removeMessages(0);
        sendMessageDelayed(obtainMessage(0), j);
    }

    public final synchronized void b() {
        if (this.a) {
            return;
        }
        this.a = true;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        defpackage.qqt qqtVar = (defpackage.qqt) v();
        if (qqtVar != null && message.what == 0) {
            qqtVar.g(null);
        }
    }
}
