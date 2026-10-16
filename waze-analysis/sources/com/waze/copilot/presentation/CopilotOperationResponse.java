package com.waze.copilot.presentation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class CopilotOperationResponse {
    private static final /* synthetic */ h.d.a $ENTRIES;
    private static final /* synthetic */ CopilotOperationResponse[] $VALUES;
    public static final CopilotOperationResponse SELECT = new CopilotOperationResponse("SELECT", 0);
    public static final CopilotOperationResponse DESELECT = new CopilotOperationResponse("DESELECT", 1);

    private static final /* synthetic */ CopilotOperationResponse[] $values() {
        return new CopilotOperationResponse[]{SELECT, DESELECT};
    }

    static {
        CopilotOperationResponse[] copilotOperationResponseArr$values = $values();
        $VALUES = copilotOperationResponseArr$values;
        $ENTRIES = h.d.b.a(copilotOperationResponseArr$values);
    }

    private CopilotOperationResponse(String str, int i2) {
    }

    public static h.d.a<CopilotOperationResponse> getEntries() {
        return $ENTRIES;
    }

    public static CopilotOperationResponse valueOf(String str) {
        return (CopilotOperationResponse) Enum.valueOf(CopilotOperationResponse.class, str);
    }

    public static CopilotOperationResponse[] values() {
        return (CopilotOperationResponse[]) $VALUES.clone();
    }
}
