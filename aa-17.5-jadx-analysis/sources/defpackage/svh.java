package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.signin.internal.SignInResponse;

/* loaded from: classes2.dex */
public class svh extends ijo implements IInterface {
    public svh() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        switch (i) {
            case 3:
                ijp.d(parcel);
                break;
            case 4:
                ijp.d(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                ijp.d(parcel);
                break;
            case 7:
                ijp.d(parcel);
                break;
            case 8:
                SignInResponse signInResponse = (SignInResponse) ijp.a(parcel, SignInResponse.CREATOR);
                ijp.d(parcel);
                c(signInResponse);
                break;
            case 9:
                ijp.d(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    public void c(SignInResponse signInResponse) throws RemoteException {
    }
}
