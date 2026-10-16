package e.a.b.a;

import android.os.RemoteException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ag extends ah {
    @Override // e.a.b.a.ah
    public final void a(int i2, ak akVar) throws RemoteException {
        if (d(i2, akVar.b())) {
            return;
        }
        throw new RemoteException("BinderProxy#transact(" + i2 + ", FLAG_ONEWAY) returned false");
    }
}
