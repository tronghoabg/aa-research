package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class rwx extends ijo implements rwy {
    public rwx() {
        super("com.google.android.gms.car.startup.IStartupServiceCallback");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        switch (i) {
            case 1:
                boolean zJ = ijp.j(parcel);
                ijp.d(parcel);
                c(zJ);
                break;
            case 2:
                int i2 = parcel.readInt();
                int i3 = parcel.readInt();
                String string = parcel.readString();
                ijp.d(parcel);
                g(i2, i3, string);
                break;
            case 3:
                j();
                break;
            case 4:
                break;
            case 5:
                ArrayList arrayListC = ijp.c(parcel);
                parcel.readInt();
                parcel.readInt();
                byte[] bArrCreateByteArray = parcel.createByteArray();
                ijp.d(parcel);
                k(arrayListC, bArrCreateByteArray);
                break;
            case 6:
                boolean zJ2 = ijp.j(parcel);
                ArrayList arrayListC2 = ijp.c(parcel);
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                ijp.d(parcel);
                h(zJ2, arrayListC2, i4, i5, bArrCreateByteArray2);
                break;
            case 7:
                ArrayList arrayListC3 = ijp.c(parcel);
                byte[] bArrCreateByteArray3 = parcel.createByteArray();
                Bundle bundle = (Bundle) ijp.a(parcel, Bundle.CREATOR);
                ijp.d(parcel);
                i(arrayListC3, bArrCreateByteArray3, bundle);
                break;
            case 8:
                f();
                break;
            case 9:
                int i6 = parcel.readInt();
                ijp.d(parcel);
                b(i6);
                break;
            case 10:
                int i7 = parcel.readInt();
                ijp.d(parcel);
                d(i7);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
