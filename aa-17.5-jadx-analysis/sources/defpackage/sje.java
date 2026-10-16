package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public class sje extends ijo implements IInterface {
    public sje() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    public void a(Status status) {
        throw new UnsupportedOperationException();
    }

    public void b(Status status) {
        throw new UnsupportedOperationException();
    }

    public void c(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        switch (i) {
            case 1:
                Status status = (Status) ijp.a(parcel, Status.CREATOR);
                ijp.d(parcel);
                b(status);
                return true;
            case 2:
                ijp.d(parcel);
                throw new UnsupportedOperationException();
            case 3:
                parcel.readLong();
                ijp.d(parcel);
                throw new UnsupportedOperationException();
            case 4:
                ijp.d(parcel);
                throw new UnsupportedOperationException();
            case 5:
                parcel.readLong();
                ijp.d(parcel);
                throw new UnsupportedOperationException();
            case 6:
                ijp.d(parcel);
                throw new UnsupportedOperationException();
            case 7:
                ijp.d(parcel);
                throw new UnsupportedOperationException();
            case 8:
                Status status2 = (Status) ijp.a(parcel, Status.CREATOR);
                ijp.d(parcel);
                a(status2);
                return true;
            case 9:
                Status status3 = (Status) ijp.a(parcel, Status.CREATOR);
                ijp.d(parcel);
                c(status3);
                return true;
            default:
                return false;
        }
    }
}
