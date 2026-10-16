package com.google.android.libraries.assistant.appintegration.proto;

import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum MorrisEligibilityStatus implements eg {
    UNKNOWN(0),
    ELIGIBLE(1),
    NOT_ELIGIBLE(2),
    ELIGIBLE_SHOW_DIALOG(3),
    ELIGIBLE_SHOW_DIALOG_OPT_IN_2(9),
    ELIGIBLE_SHOW_DIALOG_OPT_OUT_1A(4),
    ELIGIBLE_SHOW_DIALOG_OPT_OUT_1B(5),
    ELIGIBLE_SHOW_DIALOG_OPT_OUT_2A(6),
    ELIGIBLE_SHOW_DIALOG_OPT_OUT_2B(7),
    ELIGIBLE_SHOW_DIALOG_OPT_OUT_3(8);

    public static final int ELIGIBLE_SHOW_DIALOG_OPT_IN_2_VALUE = 9;
    public static final int ELIGIBLE_SHOW_DIALOG_OPT_OUT_1A_VALUE = 4;
    public static final int ELIGIBLE_SHOW_DIALOG_OPT_OUT_1B_VALUE = 5;
    public static final int ELIGIBLE_SHOW_DIALOG_OPT_OUT_2A_VALUE = 6;
    public static final int ELIGIBLE_SHOW_DIALOG_OPT_OUT_2B_VALUE = 7;
    public static final int ELIGIBLE_SHOW_DIALOG_OPT_OUT_3_VALUE = 8;
    public static final int ELIGIBLE_SHOW_DIALOG_VALUE = 3;
    public static final int ELIGIBLE_VALUE = 1;
    public static final int NOT_ELIGIBLE_VALUE = 2;
    public static final int UNKNOWN_VALUE = 0;
    private static final eh<MorrisEligibilityStatus> internalValueMap = new eh<MorrisEligibilityStatus>() { // from class: com.google.android.libraries.assistant.appintegration.proto.MorrisEligibilityStatus.1
        @Override // com.google.v.eh
        public MorrisEligibilityStatus findValueByNumber(int i2) {
            return MorrisEligibilityStatus.forNumber(i2);
        }
    };
    private final int value;

    /* compiled from: WazeSource */
    final class MorrisEligibilityStatusVerifier implements ei {
        static final ei INSTANCE = new MorrisEligibilityStatusVerifier();

        private MorrisEligibilityStatusVerifier() {
        }

        @Override // com.google.v.ei
        public boolean isInRange(int i2) {
            return MorrisEligibilityStatus.forNumber(i2) != null;
        }
    }

    MorrisEligibilityStatus(int i2) {
        this.value = i2;
    }

    public static MorrisEligibilityStatus forNumber(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return ELIGIBLE;
            case 2:
                return NOT_ELIGIBLE;
            case 3:
                return ELIGIBLE_SHOW_DIALOG;
            case 4:
                return ELIGIBLE_SHOW_DIALOG_OPT_OUT_1A;
            case 5:
                return ELIGIBLE_SHOW_DIALOG_OPT_OUT_1B;
            case 6:
                return ELIGIBLE_SHOW_DIALOG_OPT_OUT_2A;
            case 7:
                return ELIGIBLE_SHOW_DIALOG_OPT_OUT_2B;
            case 8:
                return ELIGIBLE_SHOW_DIALOG_OPT_OUT_3;
            case 9:
                return ELIGIBLE_SHOW_DIALOG_OPT_IN_2;
            default:
                return null;
        }
    }

    public static eh<MorrisEligibilityStatus> internalGetValueMap() {
        return internalValueMap;
    }

    public static ei internalGetVerifier() {
        return MorrisEligibilityStatusVerifier.INSTANCE;
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
