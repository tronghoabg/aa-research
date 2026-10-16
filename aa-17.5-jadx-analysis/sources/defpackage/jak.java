package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class jak extends ijo implements jal {
    final /* synthetic */ iyq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jak(iyq iyqVar) {
        super("com.google.android.apps.auto.carservice.car.senderprotocol.ICarGalMonitorProxy");
        this.a = iyqVar;
    }

    @Override // defpackage.jal
    public final void e(long j, int i) {
        iyq iyqVar = this.a;
        synchronized (((iyp) iyqVar).b) {
            iyo iyoVar = ((iyp) iyqVar).e;
            if (iyoVar != null) {
                try {
                    iyoVar.b.e(j, i);
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
