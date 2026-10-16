package androidx.compose.animation;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class EnterExitState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ EnterExitState[] $VALUES;
    public static final EnterExitState PreEnter = new EnterExitState("PreEnter", 0);
    public static final EnterExitState Visible = new EnterExitState("Visible", 1);
    public static final EnterExitState PostExit = new EnterExitState("PostExit", 2);

    private static final /* synthetic */ EnterExitState[] $values() {
        return new EnterExitState[]{PreEnter, Visible, PostExit};
    }

    static {
        EnterExitState[] enterExitStateArr$values = $values();
        $VALUES = enterExitStateArr$values;
        $ENTRIES = b.a(enterExitStateArr$values);
    }

    private EnterExitState(String str, int i2) {
    }

    public static a<EnterExitState> getEntries() {
        return $ENTRIES;
    }

    public static EnterExitState valueOf(String str) {
        return (EnterExitState) Enum.valueOf(EnterExitState.class, str);
    }

    public static EnterExitState[] values() {
        return (EnterExitState[]) $VALUES.clone();
    }
}
