package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ros {
    public final defpackage.qvx a;
    public final java.lang.Object b = new java.lang.Object();
    public final java.util.LinkedList c = new java.util.LinkedList();
    public final defpackage.qvz e = new defpackage.qvz();
    public volatile boolean d = true;
    private final qrs[] f = new qrs[4];

    public ros(defpackage.qvx qvxVar) {
        this.a = qvxVar;
    }

    public final void a() {
        if (defpackage.omv.c("CAR.AUDIO", 3)) {
            defpackage.rrx.a("CAR.AUDIO", null, "handleCarDisconnection");
        }
        this.d = false;
        qrs[] qrsVarArr = this.f;
        synchronized (qrsVarArr) {
            for (int i = 0; i < 4; i++) {
                qrs qrsVar = qrsVarArr[i];
                if (qrsVar != null) {
                    qrsVar.a();
                    qrsVarArr[i] = null;
                }
            }
        }
        synchronized (this.b) {
            java.util.LinkedList linkedList = this.c;
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((defpackage.rot) it.next()).d();
            }
            linkedList.clear();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    public final void b(android.os.RemoteException remoteException) throws defpackage.qst, rlo {
        a();
        defpackage.oml.I(remoteException);
    }
}
