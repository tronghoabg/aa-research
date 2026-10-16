package com.waze.uid;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class FlowType {
    private static final /* synthetic */ h.d.a $ENTRIES;
    private static final /* synthetic */ FlowType[] $VALUES;
    public static final FlowType NONE = new FlowType("NONE", 0);
    public static final FlowType MAIN = new FlowType("MAIN", 1);
    public static final FlowType LOGIN = new FlowType("LOGIN", 2);
    public static final FlowType ADD_ID = new FlowType("ADD_ID", 3);
    public static final FlowType EDIT_ID = new FlowType("EDIT_ID", 4);

    private static final /* synthetic */ FlowType[] $values() {
        return new FlowType[]{NONE, MAIN, LOGIN, ADD_ID, EDIT_ID};
    }

    static {
        FlowType[] flowTypeArr$values = $values();
        $VALUES = flowTypeArr$values;
        $ENTRIES = h.d.b.a(flowTypeArr$values);
    }

    private FlowType(String str, int i2) {
    }

    public static h.d.a<FlowType> getEntries() {
        return $ENTRIES;
    }

    public static FlowType valueOf(String str) {
        return (FlowType) Enum.valueOf(FlowType.class, str);
    }

    public static FlowType[] values() {
        return (FlowType[]) $VALUES.clone();
    }
}
