package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ixz extends android.os.Handler {
    final /* synthetic */ defpackage.iya a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixz(defpackage.iya iyaVar, android.os.Looper looper) {
        super(looper);
        this.a = iyaVar;
    }

    public final synchronized void a() {
        removeCallbacksAndMessages(null);
    }

    public final synchronized void b() {
        removeMessages(100);
        sendMessageDelayed(obtainMessage(100), 2000L);
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i;
        int i2;
        if (message.what != 100) {
            return;
        }
        defpackage.iya iyaVar = this.a;
        synchronized (iyaVar.m) {
            i = iyaVar.n;
            i2 = (-65537) & i;
            iyaVar.n = i2;
        }
        if (i != i2) {
            iyaVar.b(i2, false);
        }
    }
}
