package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.aang.GetAccountsResponse;
import com.google.android.gms.auth.aang.GetTokenResponse;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public class qoo extends ijo implements IInterface {
    public qoo() {
        super("com.google.android.gms.auth.aang.internal.IGoogleAuthAangCallbacks");
    }

    public void a(Status status, GetAccountsResponse getAccountsResponse) {
        throw new UnsupportedOperationException();
    }

    public void b(Status status, GetTokenResponse getTokenResponse) {
        throw new UnsupportedOperationException();
    }

    public void c(Status status, GetTokenResponse getTokenResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        switch (i) {
            case 1:
                Status status = (Status) ijp.a(parcel, Status.CREATOR);
                GetAccountsResponse getAccountsResponse = (GetAccountsResponse) ijp.a(parcel, GetAccountsResponse.CREATOR);
                ijp.d(parcel);
                a(status, getAccountsResponse);
                return true;
            case 2:
                Status status2 = (Status) ijp.a(parcel, Status.CREATOR);
                GetTokenResponse getTokenResponse = (GetTokenResponse) ijp.a(parcel, GetTokenResponse.CREATOR);
                ijp.d(parcel);
                b(status2, getTokenResponse);
                return true;
            case 3:
                parcel.readInt();
                ijp.d(parcel);
                throw new UnsupportedOperationException();
            case 4:
                ijp.d(parcel);
                throw new UnsupportedOperationException();
            case 5:
                ijp.d(parcel);
                throw new UnsupportedOperationException();
            case 6:
                ijp.d(parcel);
                throw new UnsupportedOperationException();
            case 7:
                Status status3 = (Status) ijp.a(parcel, Status.CREATOR);
                GetTokenResponse getTokenResponse2 = (GetTokenResponse) ijp.a(parcel, GetTokenResponse.CREATOR);
                ijp.d(parcel);
                c(status3, getTokenResponse2);
                return true;
            case 8:
                ijp.d(parcel);
                throw new UnsupportedOperationException();
            default:
                return false;
        }
    }
}
