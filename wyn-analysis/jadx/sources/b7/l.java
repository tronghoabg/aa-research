package b7;

import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public interface l extends IInterface {
    void D(Status status);

    void G(Status status);

    void k(GoogleSignInAccount googleSignInAccount, Status status);
}
