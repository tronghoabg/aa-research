package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class rns extends defpackage.rob {
    final /* synthetic */ android.view.KeyEvent a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rns(android.view.KeyEvent keyEvent) {
        super("dispatchPhoneKeyEvent");
        this.a = keyEvent;
    }

    @Override // defpackage.rob
    public final void a(defpackage.qww qwwVar) throws android.os.RemoteException {
        qwwVar.e(this.a);
    }
}
