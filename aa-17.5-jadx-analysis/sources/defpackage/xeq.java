package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class xeq extends ijo implements xer {
    public xeq() {
        super("com.google.android.projection.gearhead.sdk.ICarSystemUiCallback");
    }

    @Override // defpackage.xer
    public final void e(byte b) {
        throw null;
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        switch (i) {
            case 1:
                ijp.d(parcel);
                return true;
            case 2:
                ijp.d(parcel);
                return true;
            case 3:
                ijp.d(parcel);
                return true;
            case 4:
                parcel.readInt();
                ijp.d(parcel);
                return true;
            case 5:
                parcel.readInt();
                ijp.j(parcel);
                ijp.d(parcel);
                return true;
            case 6:
                ijp.j(parcel);
                ijp.d(parcel);
                return true;
            case 7:
                parcel.readByte();
                ijp.d(parcel);
                throw null;
            default:
                return false;
        }
    }
}
