package androidx.car.app.model.signin;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class QRCodeSignInMethod implements defpackage.ww {
    private final android.net.Uri mUri;

    public QRCodeSignInMethod(android.net.Uri uri) {
        uri.getClass();
        this.mUri = uri;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.signin.QRCodeSignInMethod) {
            return j$.util.Objects.equals(this.mUri, ((androidx.car.app.model.signin.QRCodeSignInMethod) obj).mUri);
        }
        return false;
    }

    public android.net.Uri getUri() {
        android.net.Uri uri = this.mUri;
        uri.getClass();
        return uri;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mUri);
    }

    private QRCodeSignInMethod() {
        this.mUri = null;
    }
}
