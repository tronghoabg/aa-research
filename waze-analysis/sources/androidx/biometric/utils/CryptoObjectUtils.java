package androidx.biometric.utils;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.internal.FingerprintManagerCompat;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class CryptoObjectUtils {
    private static final String FAKE_KEY_NAME = "androidxBiometric";
    private static final String KEYSTORE_INSTANCE = "AndroidKeyStore";
    private static final String TAG = "CryptoObjectUtils";

    /* compiled from: WazeSource */
    class Api30Impl {
        private Api30Impl() {
        }

        static BiometricPrompt.CryptoObject create(IdentityCredential identityCredential) {
            return new BiometricPrompt.CryptoObject(identityCredential);
        }

        static IdentityCredential getIdentityCredential(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getIdentityCredential();
        }
    }

    /* compiled from: WazeSource */
    class Api33Impl {
        private Api33Impl() {
        }

        static BiometricPrompt.CryptoObject create(PresentationSession presentationSession) {
            return new BiometricPrompt.CryptoObject(presentationSession);
        }

        static PresentationSession getPresentationSession(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getPresentationSession();
        }
    }

    /* compiled from: WazeSource */
    class Api35Impl {
        private Api35Impl() {
        }

        static BiometricPrompt.CryptoObject create(long j2) {
            return new BiometricPrompt.CryptoObject(j2);
        }

        static long getOperationHandle(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getOperationHandle();
        }
    }

    /* compiled from: WazeSource */
    class Api36MinorImpl {
        private Api36MinorImpl() {
        }

        static BiometricPrompt.CryptoObject create(KeyAgreement keyAgreement) {
            return new BiometricPrompt.CryptoObject(keyAgreement);
        }

        static KeyAgreement getKeyAgreement(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getKeyAgreement();
        }
    }

    private CryptoObjectUtils() {
    }

    public static BiometricPrompt.CryptoObject createFakeCryptoObject() throws NoSuchPaddingException, NoSuchAlgorithmException, IOException, InvalidKeyException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        try {
            KeyStore keyStore = KeyStore.getInstance(KEYSTORE_INSTANCE);
            keyStore.load(null);
            KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(FAKE_KEY_NAME, 3);
            builder.setBlockModes("CBC");
            builder.setEncryptionPaddings("PKCS7Padding");
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", KEYSTORE_INSTANCE);
            keyGenerator.init(builder.build());
            keyGenerator.generateKey();
            SecretKey secretKey = (SecretKey) keyStore.getKey(FAKE_KEY_NAME, null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return new BiometricPrompt.CryptoObject(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e2) {
            Log.w(TAG, "Failed to create fake crypto object.", e2);
            return null;
        }
    }

    public static long getOperationHandle(BiometricPrompt.CryptoObject cryptoObject) {
        BiometricPrompt.CryptoObject cryptoObjectWrapForBiometricPrompt = wrapForBiometricPrompt(cryptoObject);
        if (cryptoObjectWrapForBiometricPrompt != null) {
            return Api35Impl.getOperationHandle(cryptoObjectWrapForBiometricPrompt);
        }
        return 0L;
    }

    static BiometricPrompt.CryptoObject unwrapFromBiometricPrompt(BiometricPrompt.CryptoObject cryptoObject) {
        KeyAgreement keyAgreement;
        PresentationSession presentationSession;
        IdentityCredential identityCredential;
        if (cryptoObject == null) {
            return null;
        }
        Cipher cipher = Api28Impl.getCipher(cryptoObject);
        if (cipher != null) {
            return new BiometricPrompt.CryptoObject(cipher);
        }
        Signature signature = Api28Impl.getSignature(cryptoObject);
        if (signature != null) {
            return new BiometricPrompt.CryptoObject(signature);
        }
        Mac mac = Api28Impl.getMac(cryptoObject);
        if (mac != null) {
            return new BiometricPrompt.CryptoObject(mac);
        }
        if (Build.VERSION.SDK_INT >= 30 && (identityCredential = Api30Impl.getIdentityCredential(cryptoObject)) != null) {
            return new BiometricPrompt.CryptoObject(identityCredential);
        }
        if (Build.VERSION.SDK_INT >= 33 && (presentationSession = Api33Impl.getPresentationSession(cryptoObject)) != null) {
            return new BiometricPrompt.CryptoObject(presentationSession);
        }
        if (Build.VERSION.SDK_INT >= 36 && CryptoObjectUtils$$ExternalSyntheticBackportWithForwarding0.m() >= 3600001 && (keyAgreement = Api36MinorImpl.getKeyAgreement(cryptoObject)) != null) {
            return new BiometricPrompt.CryptoObject(keyAgreement);
        }
        if (Build.VERSION.SDK_INT < 35) {
            return null;
        }
        long operationHandle = Api35Impl.getOperationHandle(cryptoObject);
        if (operationHandle != 0) {
            return new BiometricPrompt.CryptoObject(operationHandle);
        }
        return null;
    }

    static BiometricPrompt.CryptoObject unwrapFromFingerprintManager(FingerprintManagerCompat.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        Cipher cipher = cryptoObject.getCipher();
        if (cipher != null) {
            return new BiometricPrompt.CryptoObject(cipher);
        }
        Signature signature = cryptoObject.getSignature();
        if (signature != null) {
            return new BiometricPrompt.CryptoObject(signature);
        }
        Mac mac = cryptoObject.getMac();
        if (mac != null) {
            return new BiometricPrompt.CryptoObject(mac);
        }
        return null;
    }

    public static BiometricPrompt.CryptoObject wrapForBiometricPrompt(BiometricPrompt.CryptoObject cryptoObject) {
        KeyAgreement keyAgreement;
        PresentationSession presentationSession;
        IdentityCredential identityCredential;
        if (cryptoObject == null) {
            return null;
        }
        Cipher cipher = cryptoObject.getCipher();
        if (cipher != null) {
            return Api28Impl.create(cipher);
        }
        Signature signature = cryptoObject.getSignature();
        if (signature != null) {
            return Api28Impl.create(signature);
        }
        Mac mac = cryptoObject.getMac();
        if (mac != null) {
            return Api28Impl.create(mac);
        }
        if (Build.VERSION.SDK_INT >= 30 && (identityCredential = cryptoObject.getIdentityCredential()) != null) {
            return Api30Impl.create(identityCredential);
        }
        if (Build.VERSION.SDK_INT >= 33 && (presentationSession = cryptoObject.getPresentationSession()) != null) {
            return Api33Impl.create(presentationSession);
        }
        if (Build.VERSION.SDK_INT >= 36 && CryptoObjectUtils$$ExternalSyntheticBackportWithForwarding0.m() >= 3600001 && (keyAgreement = cryptoObject.getKeyAgreement()) != null) {
            return Api36MinorImpl.create(keyAgreement);
        }
        if (Build.VERSION.SDK_INT < 35) {
            return null;
        }
        long operationHandleCryptoObject = cryptoObject.getOperationHandleCryptoObject();
        if (operationHandleCryptoObject != 0) {
            return Api35Impl.create(operationHandleCryptoObject);
        }
        return null;
    }

    public static FingerprintManagerCompat.CryptoObject wrapForFingerprintManager(BiometricPrompt.CryptoObject cryptoObject) {
        if (cryptoObject != null) {
            Cipher cipher = cryptoObject.getCipher();
            if (cipher != null) {
                return new FingerprintManagerCompat.CryptoObject(cipher);
            }
            Signature signature = cryptoObject.getSignature();
            if (signature != null) {
                return new FingerprintManagerCompat.CryptoObject(signature);
            }
            Mac mac = cryptoObject.getMac();
            if (mac != null) {
                return new FingerprintManagerCompat.CryptoObject(mac);
            }
            if (Build.VERSION.SDK_INT >= 30 && cryptoObject.getIdentityCredential() != null) {
                Log.e(TAG, "Identity credential is not supported by FingerprintManager.");
                return null;
            }
            if (Build.VERSION.SDK_INT >= 33 && cryptoObject.getPresentationSession() != null) {
                Log.e(TAG, "Presentation session is not supported by FingerprintManager.");
                return null;
            }
            if (Build.VERSION.SDK_INT >= 36 && CryptoObjectUtils$$ExternalSyntheticBackportWithForwarding0.m() >= 3600001 && cryptoObject.getKeyAgreement() != null) {
                Log.e(TAG, "Key agreement is not supported by FingerprintManager.");
                return null;
            }
            if (Build.VERSION.SDK_INT >= 35) {
                Log.e(TAG, "Operation handle is not supported by FingerprintManager.");
            }
        }
        return null;
    }

    /* compiled from: WazeSource */
    class Api28Impl {
        private Api28Impl() {
        }

        static BiometricPrompt.CryptoObject create(Signature signature) {
            return new BiometricPrompt.CryptoObject(signature);
        }

        static Cipher getCipher(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getCipher();
        }

        static Mac getMac(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getMac();
        }

        static Signature getSignature(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getSignature();
        }

        static BiometricPrompt.CryptoObject create(Cipher cipher) {
            return new BiometricPrompt.CryptoObject(cipher);
        }

        static BiometricPrompt.CryptoObject create(Mac mac) {
            return new BiometricPrompt.CryptoObject(mac);
        }
    }
}
