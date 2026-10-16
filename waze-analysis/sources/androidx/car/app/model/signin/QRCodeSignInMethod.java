package androidx.car.app.model.signin;

import android.net.Uri;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.signin.SignInTemplate;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(4)
/* loaded from: classes2.dex */
public final class QRCodeSignInMethod implements SignInTemplate.SignInMethod {
    private final Uri mUri;

    public QRCodeSignInMethod(Uri uri) {
        this.mUri = (Uri) Objects.requireNonNull(uri);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QRCodeSignInMethod) {
            return Objects.equals(this.mUri, ((QRCodeSignInMethod) obj).mUri);
        }
        return false;
    }

    public Uri getUri() {
        return (Uri) Objects.requireNonNull(this.mUri);
    }

    public int hashCode() {
        return Objects.hash(this.mUri);
    }

    private QRCodeSignInMethod() {
        this.mUri = null;
    }
}
