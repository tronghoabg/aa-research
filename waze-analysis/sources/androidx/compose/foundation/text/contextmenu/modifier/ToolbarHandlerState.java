package androidx.compose.foundation.text.contextmenu.modifier;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ToolbarHandlerState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ToolbarHandlerState[] $VALUES;
    public static final ToolbarHandlerState Uninitialized = new ToolbarHandlerState("Uninitialized", 0);
    public static final ToolbarHandlerState Detached = new ToolbarHandlerState("Detached", 1);
    public static final ToolbarHandlerState Attached = new ToolbarHandlerState("Attached", 2);

    private static final /* synthetic */ ToolbarHandlerState[] $values() {
        return new ToolbarHandlerState[]{Uninitialized, Detached, Attached};
    }

    static {
        ToolbarHandlerState[] toolbarHandlerStateArr$values = $values();
        $VALUES = toolbarHandlerStateArr$values;
        $ENTRIES = b.a(toolbarHandlerStateArr$values);
    }

    private ToolbarHandlerState(String str, int i2) {
    }

    public static a<ToolbarHandlerState> getEntries() {
        return $ENTRIES;
    }

    public static ToolbarHandlerState valueOf(String str) {
        return (ToolbarHandlerState) Enum.valueOf(ToolbarHandlerState.class, str);
    }

    public static ToolbarHandlerState[] values() {
        return (ToolbarHandlerState[]) $VALUES.clone();
    }
}
