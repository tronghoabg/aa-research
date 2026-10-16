package androidx.biometric.internal.ui;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FingerprintDialogState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ FingerprintDialogState[] $VALUES;
    public static final FingerprintDialogState NONE = new FingerprintDialogState("NONE", 0);
    public static final FingerprintDialogState FINGERPRINT = new FingerprintDialogState("FINGERPRINT", 1);
    public static final FingerprintDialogState FINGERPRINT_ERROR = new FingerprintDialogState("FINGERPRINT_ERROR", 2);
    public static final FingerprintDialogState FINGERPRINT_AUTHENTICATED = new FingerprintDialogState("FINGERPRINT_AUTHENTICATED", 3);

    private static final /* synthetic */ FingerprintDialogState[] $values() {
        return new FingerprintDialogState[]{NONE, FINGERPRINT, FINGERPRINT_ERROR, FINGERPRINT_AUTHENTICATED};
    }

    static {
        FingerprintDialogState[] fingerprintDialogStateArr$values = $values();
        $VALUES = fingerprintDialogStateArr$values;
        $ENTRIES = b.a(fingerprintDialogStateArr$values);
    }

    private FingerprintDialogState(String str, int i2) {
    }

    public static a<FingerprintDialogState> getEntries() {
        return $ENTRIES;
    }

    public static FingerprintDialogState valueOf(String str) {
        return (FingerprintDialogState) Enum.valueOf(FingerprintDialogState.class, str);
    }

    public static FingerprintDialogState[] values() {
        return (FingerprintDialogState[]) $VALUES.clone();
    }
}
