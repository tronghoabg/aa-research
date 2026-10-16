package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import com.google.android.gms.pseudonymous.SessionZwiebackToken;

/* loaded from: classes2.dex */
public class sva extends ijo implements IInterface {
    public sva() {
        super("com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks");
    }

    public void a(Status status, PseudonymousIdToken pseudonymousIdToken, ApiMetadata apiMetadata) {
        throw null;
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        switch (i) {
            case 1:
                Status status = (Status) ijp.a(parcel, Status.CREATOR);
                PseudonymousIdToken pseudonymousIdToken = (PseudonymousIdToken) ijp.a(parcel, PseudonymousIdToken.CREATOR);
                ApiMetadata apiMetadata = (ApiMetadata) ijp.a(parcel, ApiMetadata.CREATOR);
                ijp.d(parcel);
                a(status, pseudonymousIdToken, apiMetadata);
                return true;
            case 2:
                ijp.d(parcel);
                throw new UnsupportedOperationException();
            case 3:
                parcel.readLong();
                ijp.d(parcel);
                throw new UnsupportedOperationException();
            case 4:
                parcel.createTypedArrayList(SessionZwiebackToken.CREATOR);
                ijp.d(parcel);
                throw new UnsupportedOperationException();
            case 5:
                ijp.d(parcel);
                throw new UnsupportedOperationException();
            case 6:
                ijp.d(parcel);
                throw new UnsupportedOperationException();
            case 7:
                ijp.d(parcel);
                throw new UnsupportedOperationException();
            default:
                return false;
        }
    }
}
