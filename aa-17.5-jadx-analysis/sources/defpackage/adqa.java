package defpackage;

import android.os.RemoteException;

/* loaded from: classes3.dex */
final class adqa extends adqb {
    @Override // defpackage.adqb
    public final void a(int i, adqf adqfVar) throws RemoteException {
        if (!c(i, adqfVar.b())) {
            throw new RemoteException(a.bn(i, "BinderProxy#transact(", ", FLAG_ONEWAY) returned false"));
        }
    }
}
