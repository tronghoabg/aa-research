package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class rpf extends defpackage.stq {
    final /* synthetic */ defpackage.rpg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpf(defpackage.rpg rpgVar, android.os.Looper looper) {
        super(looper);
        this.a = rpgVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        defpackage.qtr qtrVar = this.a.b;
        if (qtrVar == null || message.what != 3) {
            return;
        }
        qtrVar.a((byte[]) message.obj);
    }
}
