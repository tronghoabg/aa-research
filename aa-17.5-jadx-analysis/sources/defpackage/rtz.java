package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class rtz extends ijo implements rua {
    final /* synthetic */ rsl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rtz(rsl rslVar) {
        super("com.google.android.gms.car.senderprotocol.ICarGalMonitorProxy");
        this.a = rslVar;
    }

    @Override // defpackage.rua
    public final void e(long j, int i) {
        rsl rslVar = this.a;
        synchronized (((rsk) rslVar).b) {
            rsj rsjVar = ((rsk) rslVar).e;
            if (rsjVar != null) {
                try {
                    rsjVar.b.e(j, i);
                } catch (RemoteException unused) {
                }
            }
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        long j = parcel.readLong();
        int i2 = parcel.readInt();
        ijp.d(parcel);
        e(j, i2);
        parcel2.writeNoException();
        return true;
    }
}
