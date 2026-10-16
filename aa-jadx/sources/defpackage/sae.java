package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sae {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.RemoteListenerSet");
    public final java.util.concurrent.CopyOnWriteArrayList b = new java.util.concurrent.CopyOnWriteArrayList();
    public final java.lang.String c = "CarAudioService";

    public final defpackage.sad a(android.os.IBinder iBinder) {
        java.util.concurrent.CopyOnWriteArrayList<defpackage.sad> copyOnWriteArrayList = this.b;
        for (defpackage.sad sadVar : copyOnWriteArrayList) {
            defpackage.ysr.bj(sadVar.a() == copyOnWriteArrayList);
            synchronized (sadVar.a()) {
                if (sadVar.a.equals(iBinder)) {
                    return sadVar;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, qwj] */
    public final void b(java.lang.Object obj) {
        for (defpackage.sad sadVar : this.b) {
            try {
                ((defpackage.xei) sadVar.c).a.e((byte[]) obj);
            } catch (android.os.TransactionTooLargeException e) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "%s: failed to notify one or more listeners because value (%s) was too large", this.c, obj), e);
            } catch (android.os.RemoteException e2) {
                a.h().p(e2).ai(8602).R("%s: Unrecoverable RemoteException notifying listener %s with value %s", this.c, sadVar.c, obj);
                sadVar.binderDied();
            }
        }
    }
}
