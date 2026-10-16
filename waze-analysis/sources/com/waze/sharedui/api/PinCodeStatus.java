package com.waze.sharedui.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class PinCodeStatus {
    private static final /* synthetic */ h.d.a $ENTRIES;
    private static final /* synthetic */ PinCodeStatus[] $VALUES;
    public static final PinCodeStatus UNKNOWN = new PinCodeStatus("UNKNOWN", 0);
    public static final PinCodeStatus VERIFIED = new PinCodeStatus("VERIFIED", 1);
    public static final PinCodeStatus WRONG_PIN = new PinCodeStatus("WRONG_PIN", 2);
    public static final PinCodeStatus OTHER_ERROR = new PinCodeStatus("OTHER_ERROR", 3);

    private static final /* synthetic */ PinCodeStatus[] $values() {
        return new PinCodeStatus[]{UNKNOWN, VERIFIED, WRONG_PIN, OTHER_ERROR};
    }

    static {
        PinCodeStatus[] pinCodeStatusArr$values = $values();
        $VALUES = pinCodeStatusArr$values;
        $ENTRIES = h.d.b.a(pinCodeStatusArr$values);
    }

    private PinCodeStatus(String str, int i2) {
    }

    public static h.d.a<PinCodeStatus> getEntries() {
        return $ENTRIES;
    }

    public static PinCodeStatus valueOf(String str) {
        return (PinCodeStatus) Enum.valueOf(PinCodeStatus.class, str);
    }

    public static PinCodeStatus[] values() {
        return (PinCodeStatus[]) $VALUES.clone();
    }
}
