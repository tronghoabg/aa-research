package com.google.android.libraries.assistant.appintegration.proto;

import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum UiSuppressionLevel implements eg {
    UI_SUPPRESSION_LEVEL_UNKNOWN(0),
    UI_SUPPRESSION_LEVEL_NONE(10),
    UI_SUPPRESSION_LEVEL_MEDIA(20),
    UI_SUPPRESSION_LEVEL_MESSAGE(30),
    UI_SUPPRESSION_LEVEL_PHONE_CALL(40),
    UI_SUPPRESSION_LEVEL_ALL(100);

    public static final int UI_SUPPRESSION_LEVEL_ALL_VALUE = 100;
    public static final int UI_SUPPRESSION_LEVEL_MEDIA_VALUE = 20;
    public static final int UI_SUPPRESSION_LEVEL_MESSAGE_VALUE = 30;
    public static final int UI_SUPPRESSION_LEVEL_NONE_VALUE = 10;
    public static final int UI_SUPPRESSION_LEVEL_PHONE_CALL_VALUE = 40;
    public static final int UI_SUPPRESSION_LEVEL_UNKNOWN_VALUE = 0;
    private static final eh<UiSuppressionLevel> internalValueMap = new eh<UiSuppressionLevel>() { // from class: com.google.android.libraries.assistant.appintegration.proto.UiSuppressionLevel.1
        @Override // com.google.v.eh
        public UiSuppressionLevel findValueByNumber(int i2) {
            return UiSuppressionLevel.forNumber(i2);
        }
    };
    private final int value;

    /* compiled from: WazeSource */
    final class UiSuppressionLevelVerifier implements ei {
        static final ei INSTANCE = new UiSuppressionLevelVerifier();

        private UiSuppressionLevelVerifier() {
        }

        @Override // com.google.v.ei
        public boolean isInRange(int i2) {
            return UiSuppressionLevel.forNumber(i2) != null;
        }
    }

    UiSuppressionLevel(int i2) {
        this.value = i2;
    }

    public static UiSuppressionLevel forNumber(int i2) {
        if (i2 == 0) {
            return UI_SUPPRESSION_LEVEL_UNKNOWN;
        }
        if (i2 == 10) {
            return UI_SUPPRESSION_LEVEL_NONE;
        }
        if (i2 == 20) {
            return UI_SUPPRESSION_LEVEL_MEDIA;
        }
        if (i2 == 30) {
            return UI_SUPPRESSION_LEVEL_MESSAGE;
        }
        if (i2 == 40) {
            return UI_SUPPRESSION_LEVEL_PHONE_CALL;
        }
        if (i2 != 100) {
            return null;
        }
        return UI_SUPPRESSION_LEVEL_ALL;
    }

    public static eh<UiSuppressionLevel> internalGetValueMap() {
        return internalValueMap;
    }

    public static ei internalGetVerifier() {
        return UiSuppressionLevelVerifier.INSTANCE;
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
