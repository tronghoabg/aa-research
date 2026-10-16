package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ds extends android.os.Handler {
    final /* synthetic */ defpackage.du a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds(defpackage.du duVar, android.os.Looper looper) {
        super(looper);
        this.a = duVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        defpackage.dv dvVar;
        defpackage.ds dsVar;
        if (message.what == 1) {
            defpackage.du duVar = this.a;
            synchronized (duVar.a) {
                dvVar = (defpackage.dv) duVar.c.get();
                dsVar = duVar.d;
            }
            if (dvVar == null || this.a != dvVar.a() || dsVar == null) {
                return;
            }
            dvVar.d();
            dvVar.d();
        }
    }
}
