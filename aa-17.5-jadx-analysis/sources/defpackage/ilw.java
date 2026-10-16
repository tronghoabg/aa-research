package defpackage;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class ilw implements irl {
    private final rzd a;

    public ilw(rzd rzdVar) {
        this.a = rzdVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, qvb] */
    @Override // defpackage.irl
    public final void b(qvn qvnVar) throws RemoteException {
        this.a.call().k(qvnVar);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, qvb] */
    @Override // defpackage.irl
    public final void fn(qvn qvnVar) throws RemoteException {
        this.a.call().g(qvnVar);
    }
}
