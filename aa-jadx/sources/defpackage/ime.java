package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ime implements defpackage.irt {
    private final defpackage.rzz a;

    public ime(defpackage.rzz rzzVar) {
        this.a = rzzVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, qvx] */
    @Override // defpackage.irt
    public final void b(defpackage.qwj qwjVar) throws android.os.RemoteException {
        this.a.call().k(qwjVar);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, qvx] */
    @Override // defpackage.irt
    public final void ev(defpackage.qwj qwjVar) throws android.os.RemoteException {
        this.a.call().g(qwjVar);
    }
}
