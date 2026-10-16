package androidx.compose.animation;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class StateChangeRequest {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ StateChangeRequest[] $VALUES;
    public static final StateChangeRequest NoRequest = new StateChangeRequest("NoRequest", 0);
    public static final StateChangeRequest MatchFound = new StateChangeRequest("MatchFound", 1);
    public static final StateChangeRequest VisibleContentAbsentDuringTransition = new StateChangeRequest("VisibleContentAbsentDuringTransition", 2);
    public static final StateChangeRequest NoMatchFound = new StateChangeRequest("NoMatchFound", 3);

    private static final /* synthetic */ StateChangeRequest[] $values() {
        return new StateChangeRequest[]{NoRequest, MatchFound, VisibleContentAbsentDuringTransition, NoMatchFound};
    }

    static {
        StateChangeRequest[] stateChangeRequestArr$values = $values();
        $VALUES = stateChangeRequestArr$values;
        $ENTRIES = b.a(stateChangeRequestArr$values);
    }

    private StateChangeRequest(String str, int i2) {
    }

    public static a<StateChangeRequest> getEntries() {
        return $ENTRIES;
    }

    public static StateChangeRequest valueOf(String str) {
        return (StateChangeRequest) Enum.valueOf(StateChangeRequest.class, str);
    }

    public static StateChangeRequest[] values() {
        return (StateChangeRequest[]) $VALUES.clone();
    }
}
