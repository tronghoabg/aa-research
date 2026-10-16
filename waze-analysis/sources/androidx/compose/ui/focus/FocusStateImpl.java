package androidx.compose.ui.focus;

import h.d.a;
import h.d.b;
import h.i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FocusStateImpl implements FocusState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ FocusStateImpl[] $VALUES;
    public static final FocusStateImpl Active = new FocusStateImpl("Active", 0);
    public static final FocusStateImpl ActiveParent = new FocusStateImpl("ActiveParent", 1);
    public static final FocusStateImpl Captured = new FocusStateImpl("Captured", 2);
    public static final FocusStateImpl Inactive = new FocusStateImpl("Inactive", 3);

    /* compiled from: WazeSource */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ FocusStateImpl[] $values() {
        return new FocusStateImpl[]{Active, ActiveParent, Captured, Inactive};
    }

    static {
        FocusStateImpl[] focusStateImplArr$values = $values();
        $VALUES = focusStateImplArr$values;
        $ENTRIES = b.a(focusStateImplArr$values);
    }

    private FocusStateImpl(String str, int i2) {
    }

    public static a<FocusStateImpl> getEntries() {
        return $ENTRIES;
    }

    public static FocusStateImpl valueOf(String str) {
        return (FocusStateImpl) Enum.valueOf(FocusStateImpl.class, str);
    }

    public static FocusStateImpl[] values() {
        return (FocusStateImpl[]) $VALUES.clone();
    }

    @Override // androidx.compose.ui.focus.FocusState
    public boolean getHasFocus() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw new i();
    }

    @Override // androidx.compose.ui.focus.FocusState
    public boolean isCaptured() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw new i();
    }

    @Override // androidx.compose.ui.focus.FocusState
    public boolean isFocused() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                throw new i();
            }
        }
        return true;
    }
}
