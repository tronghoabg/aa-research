package androidx.biometric.utils;

import android.os.CancellationSignal;
import android.util.Log;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class CancellationSignalProvider {
    private static final String TAG = "CancelSignalProvider";
    private CancellationSignal mBiometricCancellationSignal;
    private androidx.core.os.CancellationSignal mFingerprintCancellationSignal;
    private final Injector mInjector;

    /* compiled from: WazeSource */
    interface Injector {
        CancellationSignal getBiometricCancellationSignal();

        androidx.core.os.CancellationSignal getFingerprintCancellationSignal();
    }

    public CancellationSignalProvider() {
        this.mInjector = new Injector() { // from class: androidx.biometric.utils.CancellationSignalProvider.1
            @Override // androidx.biometric.utils.CancellationSignalProvider.Injector
            public CancellationSignal getBiometricCancellationSignal() {
                return new CancellationSignal();
            }

            @Override // androidx.biometric.utils.CancellationSignalProvider.Injector
            public androidx.core.os.CancellationSignal getFingerprintCancellationSignal() {
                return new androidx.core.os.CancellationSignal();
            }
        };
    }

    public void cancel() {
        CancellationSignal cancellationSignal = this.mBiometricCancellationSignal;
        if (cancellationSignal != null) {
            try {
                cancellationSignal.cancel();
            } catch (NullPointerException e2) {
                Log.e(TAG, "Got NPE while canceling biometric authentication.", e2);
            }
            this.mBiometricCancellationSignal = null;
        }
        androidx.core.os.CancellationSignal cancellationSignal2 = this.mFingerprintCancellationSignal;
        if (cancellationSignal2 != null) {
            try {
                cancellationSignal2.cancel();
            } catch (NullPointerException e3) {
                Log.e(TAG, "Got NPE while canceling fingerprint authentication.", e3);
            }
            this.mFingerprintCancellationSignal = null;
        }
    }

    public CancellationSignal getBiometricCancellationSignal() {
        CancellationSignal cancellationSignal = this.mBiometricCancellationSignal;
        if (cancellationSignal != null) {
            return cancellationSignal;
        }
        CancellationSignal biometricCancellationSignal = this.mInjector.getBiometricCancellationSignal();
        this.mBiometricCancellationSignal = biometricCancellationSignal;
        return biometricCancellationSignal;
    }

    public androidx.core.os.CancellationSignal getFingerprintCancellationSignal() {
        androidx.core.os.CancellationSignal cancellationSignal = this.mFingerprintCancellationSignal;
        if (cancellationSignal != null) {
            return cancellationSignal;
        }
        androidx.core.os.CancellationSignal fingerprintCancellationSignal = this.mInjector.getFingerprintCancellationSignal();
        this.mFingerprintCancellationSignal = fingerprintCancellationSignal;
        return fingerprintCancellationSignal;
    }

    public CancellationSignalProvider(Injector injector) {
        this.mInjector = injector;
    }
}
