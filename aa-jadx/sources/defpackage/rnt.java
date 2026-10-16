package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class rnt extends defpackage.rob {
    final /* synthetic */ boolean a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnt(boolean z, int i, int i2) {
        super("onAudioStateChanged");
        this.a = z;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.rob
    public final void a(defpackage.qww qwwVar) throws android.os.RemoteException {
        qwwVar.f(this.a, this.b, this.c);
    }
}
