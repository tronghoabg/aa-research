package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wwr implements android.os.Handler.Callback {
    final /* synthetic */ defpackage.wwt a;

    public wwr(defpackage.wwt wwtVar) {
        this.a = wwtVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        if (message.what != 0) {
            return false;
        }
        defpackage.wwt wwtVar = this.a;
        defpackage.wws wwsVar = (defpackage.wws) message.obj;
        synchronized (wwtVar.a) {
            if (wwtVar.c == wwsVar || wwtVar.d == wwsVar) {
                wwtVar.d(wwsVar, 2);
            }
        }
        return true;
    }
}
