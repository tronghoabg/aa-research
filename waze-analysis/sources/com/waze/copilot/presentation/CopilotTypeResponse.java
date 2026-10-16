package com.waze.copilot.presentation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class CopilotTypeResponse {
    private static final /* synthetic */ h.d.a $ENTRIES;
    private static final /* synthetic */ CopilotTypeResponse[] $VALUES;
    public static final CopilotTypeResponse CAR = new CopilotTypeResponse("CAR", 0);
    public static final CopilotTypeResponse MOOD = new CopilotTypeResponse("MOOD", 1);
    public static final CopilotTypeResponse VOICE = new CopilotTypeResponse("VOICE", 2);

    private static final /* synthetic */ CopilotTypeResponse[] $values() {
        return new CopilotTypeResponse[]{CAR, MOOD, VOICE};
    }

    static {
        CopilotTypeResponse[] copilotTypeResponseArr$values = $values();
        $VALUES = copilotTypeResponseArr$values;
        $ENTRIES = h.d.b.a(copilotTypeResponseArr$values);
    }

    private CopilotTypeResponse(String str, int i2) {
    }

    public static h.d.a<CopilotTypeResponse> getEntries() {
        return $ENTRIES;
    }

    public static CopilotTypeResponse valueOf(String str) {
        return (CopilotTypeResponse) Enum.valueOf(CopilotTypeResponse.class, str);
    }

    public static CopilotTypeResponse[] values() {
        return (CopilotTypeResponse[]) $VALUES.clone();
    }
}
