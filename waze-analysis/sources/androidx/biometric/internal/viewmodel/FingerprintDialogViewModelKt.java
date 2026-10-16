package androidx.biometric.internal.viewmodel;

import androidx.biometric.internal.FingerprintManagerCompat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FingerprintDialogViewModelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int checkForFingerprintPreAuthenticationErrors(FingerprintManagerCompat fingerprintManagerCompat) {
        if (fingerprintManagerCompat.isHardwareDetected()) {
            return !fingerprintManagerCompat.hasEnrolledFingerprints() ? 11 : 0;
        }
        return 12;
    }
}
