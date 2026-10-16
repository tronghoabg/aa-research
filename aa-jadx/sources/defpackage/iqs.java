package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class iqs extends defpackage.rce {
    private boolean a;

    public iqs(defpackage.iqu iquVar, android.os.Looper looper) {
        super(iquVar, looper);
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
        defpackage.iqu iquVar = (defpackage.iqu) v();
        if (iquVar != null && message.what == 0) {
            iquVar.k(null);
        }
    }
}
