package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class ovy extends ijo implements ovz {
    public ovy() {
        super("com.google.android.apps.auto.sdk.IStatusBarController");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        switch (i) {
            case 1:
                CharSequence charSequenceB = ijp.b(parcel);
                ijp.d(parcel);
                q(charSequenceB);
                parcel2.writeNoException();
                return true;
            case 2:
                boolean zU = u();
                parcel2.writeNoException();
                ClassLoader classLoader = ijp.a;
                parcel2.writeInt(zU ? 1 : 0);
                return true;
            case 3:
                t();
                parcel2.writeNoException();
                return true;
            case 4:
                j();
                parcel2.writeNoException();
                return true;
            case 5:
                parcel2.writeNoException();
                return true;
            case 6:
                parcel2.writeNoException();
                return true;
            case 7:
                parcel2.writeNoException();
                return true;
            case 8:
                parcel2.writeNoException();
                return true;
            case 9:
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                s();
                parcel2.writeNoException();
                return true;
            case 12:
                i();
                parcel2.writeNoException();
                return true;
            case 13:
                int i2 = parcel.readInt();
                ijp.d(parcel);
                n(i2);
                parcel2.writeNoException();
                return true;
            case 14:
                r();
                parcel2.writeNoException();
                return true;
            case 15:
                e();
                parcel2.writeNoException();
                return true;
            case 16:
                int i3 = parcel.readInt();
                ijp.d(parcel);
                l(i3);
                parcel2.writeNoException();
                return true;
            case 17:
                float f = parcel.readFloat();
                ijp.d(parcel);
                k(f);
                parcel2.writeNoException();
                return true;
            case 18:
                ijp.j(parcel);
                ijp.d(parcel);
                parcel2.writeNoException();
                return true;
            case 19:
                boolean zJ = ijp.j(parcel);
                boolean zJ2 = ijp.j(parcel);
                ijp.d(parcel);
                p(zJ, zJ2);
                parcel2.writeNoException();
                return true;
            case 20:
                int i4 = parcel.readInt();
                ijp.d(parcel);
                m(i4);
                parcel2.writeNoException();
                return true;
            case 21:
                boolean zJ3 = ijp.j(parcel);
                ijp.d(parcel);
                o(zJ3);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
