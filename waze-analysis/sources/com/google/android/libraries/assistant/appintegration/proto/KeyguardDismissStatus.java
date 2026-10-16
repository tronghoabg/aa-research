package com.google.android.libraries.assistant.appintegration.proto;

import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum KeyguardDismissStatus implements eg {
    KEYGUARD_DISMISS_STATUS_UNKNOWN(0),
    KEYGUARD_DISMISS_STATUS_SUCCEEDED(1),
    KEYGUARD_DISMISS_STATUS_CANCELLED(2),
    KEYGUARD_DISMISS_STATUS_ERROR(3);

    public static final int KEYGUARD_DISMISS_STATUS_CANCELLED_VALUE = 2;
    public static final int KEYGUARD_DISMISS_STATUS_ERROR_VALUE = 3;
    public static final int KEYGUARD_DISMISS_STATUS_SUCCEEDED_VALUE = 1;
    public static final int KEYGUARD_DISMISS_STATUS_UNKNOWN_VALUE = 0;
    private static final eh<KeyguardDismissStatus> internalValueMap = new eh<KeyguardDismissStatus>() { // from class: com.google.android.libraries.assistant.appintegration.proto.KeyguardDismissStatus.1
        @Override // com.google.v.eh
        public KeyguardDismissStatus findValueByNumber(int i2) {
            return KeyguardDismissStatus.forNumber(i2);
        }
    };
    private final int value;

    /* compiled from: WazeSource */
    final class KeyguardDismissStatusVerifier implements ei {
        static final ei INSTANCE = new KeyguardDismissStatusVerifier();

        private KeyguardDismissStatusVerifier() {
        }

        @Override // com.google.v.ei
        public boolean isInRange(int i2) {
            return KeyguardDismissStatus.forNumber(i2) != null;
        }
    }

    KeyguardDismissStatus(int i2) {
        this.value = i2;
    }

    public static KeyguardDismissStatus forNumber(int i2) {
        if (i2 == 0) {
            return KEYGUARD_DISMISS_STATUS_UNKNOWN;
        }
        if (i2 == 1) {
            return KEYGUARD_DISMISS_STATUS_SUCCEEDED;
        }
        if (i2 == 2) {
            return KEYGUARD_DISMISS_STATUS_CANCELLED;
        }
        if (i2 != 3) {
            return null;
        }
        return KEYGUARD_DISMISS_STATUS_ERROR;
    }

    public static eh<KeyguardDismissStatus> internalGetValueMap() {
        return internalValueMap;
    }

    public static ei internalGetVerifier() {
        return KeyguardDismissStatusVerifier.INSTANCE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.value;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.value);
    }
}
