package androidx.compose.foundation;

import androidx.webkit.Profile;
import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MutatePriority {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MutatePriority[] $VALUES;
    public static final MutatePriority Default = new MutatePriority(Profile.DEFAULT_PROFILE_NAME, 0);
    public static final MutatePriority UserInput = new MutatePriority("UserInput", 1);
    public static final MutatePriority PreventUserInput = new MutatePriority("PreventUserInput", 2);

    private static final /* synthetic */ MutatePriority[] $values() {
        return new MutatePriority[]{Default, UserInput, PreventUserInput};
    }

    static {
        MutatePriority[] mutatePriorityArr$values = $values();
        $VALUES = mutatePriorityArr$values;
        $ENTRIES = b.a(mutatePriorityArr$values);
    }

    private MutatePriority(String str, int i2) {
    }

    public static a<MutatePriority> getEntries() {
        return $ENTRIES;
    }

    public static MutatePriority valueOf(String str) {
        return (MutatePriority) Enum.valueOf(MutatePriority.class, str);
    }

    public static MutatePriority[] values() {
        return (MutatePriority[]) $VALUES.clone();
    }
}
