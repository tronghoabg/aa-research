package androidx.biometric.utils;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.internal.FingerprintManagerCompat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class AuthenticationCallbackProvider {
    private BiometricPrompt$AuthenticationCallback mBiometricCallback;
    private FingerprintManagerCompat.AuthenticationCallback mFingerprintCallback;
    final Listener mListener;

    /* compiled from: WazeSource */
    class Api28Impl {
        private Api28Impl() {
        }

        static BiometricPrompt$AuthenticationCallback createCallback(final Listener listener) {
            return new BiometricPrompt$AuthenticationCallback() { // from class: androidx.biometric.utils.AuthenticationCallbackProvider.Api28Impl.1
                public void onAuthenticationError(int i2, CharSequence charSequence) {
                    listener.onError(i2, charSequence);
                }

                public void onAuthenticationFailed() {
                    listener.onFailure();
                }

                public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                    BiometricPrompt.CryptoObject cryptoObjectUnwrapFromBiometricPrompt = authenticationResult != null ? CryptoObjectUtils.unwrapFromBiometricPrompt(Api28Impl.getCryptoObject(authenticationResult)) : null;
                    int authenticationType = -1;
                    if (Build.VERSION.SDK_INT >= 30) {
                        if (authenticationResult != null) {
                            authenticationType = Api30Impl.getAuthenticationType(authenticationResult);
                        }
                    } else if (Build.VERSION.SDK_INT != 29) {
                        authenticationType = 2;
                    }
                    listener.onSuccess(new BiometricPrompt.AuthenticationResult(cryptoObjectUnwrapFromBiometricPrompt, authenticationType));
                }

                public void onAuthenticationHelp(int i2, CharSequence charSequence) {
                }
            };
        }

        static BiometricPrompt.CryptoObject getCryptoObject(BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getCryptoObject();
        }
    }

    /* compiled from: WazeSource */
    class Api30Impl {
        private Api30Impl() {
        }

        static int getAuthenticationType(BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getAuthenticationType();
        }
    }

    public AuthenticationCallbackProvider(Listener listener) {
        this.mListener = listener;
    }

    public BiometricPrompt$AuthenticationCallback getBiometricCallback() {
        BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback = this.mBiometricCallback;
        if (biometricPrompt$AuthenticationCallback != null) {
            return biometricPrompt$AuthenticationCallback;
        }
        BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallbackCreateCallback = Api28Impl.createCallback(this.mListener);
        this.mBiometricCallback = biometricPrompt$AuthenticationCallbackCreateCallback;
        return biometricPrompt$AuthenticationCallbackCreateCallback;
    }

    public FingerprintManagerCompat.AuthenticationCallback getFingerprintCallback() {
        if (this.mFingerprintCallback == null) {
            this.mFingerprintCallback = new FingerprintManagerCompat.AuthenticationCallback() { // from class: androidx.biometric.utils.AuthenticationCallbackProvider.1
                @Override // androidx.biometric.internal.FingerprintManagerCompat.AuthenticationCallback
                public void onAuthenticationError(int i2, CharSequence charSequence) {
                    AuthenticationCallbackProvider.this.mListener.onError(i2, charSequence);
                }

                @Override // androidx.biometric.internal.FingerprintManagerCompat.AuthenticationCallback
                public void onAuthenticationFailed() {
                    AuthenticationCallbackProvider.this.mListener.onFailure();
                }

                @Override // androidx.biometric.internal.FingerprintManagerCompat.AuthenticationCallback
                public void onAuthenticationHelp(int i2, CharSequence charSequence) {
                    AuthenticationCallbackProvider.this.mListener.onHelp(charSequence);
                }

                @Override // androidx.biometric.internal.FingerprintManagerCompat.AuthenticationCallback
                public void onAuthenticationSucceeded(FingerprintManagerCompat.AuthenticationResult authenticationResult) {
                    AuthenticationCallbackProvider.this.mListener.onSuccess(new BiometricPrompt.AuthenticationResult(CryptoObjectUtils.unwrapFromFingerprintManager(authenticationResult.getCryptoObject()), 2));
                }
            };
        }
        return this.mFingerprintCallback;
    }

    /* compiled from: WazeSource */
    public class Listener {
        public void onFailure() {
        }

        public void onHelp(CharSequence charSequence) {
        }

        public void onSuccess(BiometricPrompt.AuthenticationResult authenticationResult) {
        }

        public void onError(int i2, CharSequence charSequence) {
        }
    }
}
