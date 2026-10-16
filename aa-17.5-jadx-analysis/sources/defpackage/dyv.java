package defpackage;

import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class dyv implements dyc {
    private final /* synthetic */ dyc a;

    public dyv(dyc dycVar) {
        dycVar.getClass();
        this.a = dycVar;
    }

    @Override // defpackage.dyc
    public final void a(int i, int[] iArr, String str, dxz dxzVar) throws RemoteException {
        this.a.a(i, iArr, str, dxzVar);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a.asBinder();
    }

    @Override // defpackage.dyc
    public final void b(int i, int[] iArr, dyi dyiVar) throws RemoteException {
        this.a.b(i, iArr, dyiVar);
    }

    @Override // defpackage.dyc
    public final void c(int i, dyl dylVar) throws RemoteException {
        this.a.c(i, dylVar);
    }

    @Override // defpackage.dyc
    public final void d() throws RemoteException {
        this.a.d();
    }
}
