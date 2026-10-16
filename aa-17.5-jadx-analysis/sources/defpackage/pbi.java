package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class pbi extends ijo implements pbj {
    public final /* synthetic */ pap a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbi(pap papVar) {
        super("com.google.android.apps.auto.wireless.setup.service.IWirelessSetupSharedServiceCallback");
        this.a = papVar;
    }

    @Override // defpackage.pbj
    public final void e(int i) throws RemoteException {
        this.a.e.post(new hhx(this, i, 16));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 2) {
            pap papVar = this.a;
            papVar.e.post(new oyy(this, 13));
        } else {
            if (i != 3) {
                return false;
            }
            int i2 = parcel.readInt();
            ijp.d(parcel);
            e(i2);
        }
        parcel2.writeNoException();
        return true;
    }
}
