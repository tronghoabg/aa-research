package io.github.muntashirakon.adb;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import javax.security.auth.DestroyFailedException;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
final class KeyPair {
    private final Certificate mCertificate;
    private final PrivateKey mPrivateKey;

    public KeyPair(PrivateKey privateKey, Certificate certificate) {
        this.mPrivateKey = privateKey;
        this.mCertificate = certificate;
    }

    public void destroy() throws DestroyFailedException {
        try {
            this.mPrivateKey.destroy();
        } catch (NoSuchMethodError unused) {
        }
    }

    public Certificate getCertificate() {
        return this.mCertificate;
    }

    public PrivateKey getPrivateKey() {
        return this.mPrivateKey;
    }

    public PublicKey getPublicKey() {
        return this.mCertificate.getPublicKey();
    }
}
