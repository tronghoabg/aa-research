package androidx.compose.foundation.style;

import androidx.compose.ui.state.ToggleableState;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PredefinedToggleStateKey extends StyleStateKey<ToggleableState> implements PredefinedKey {
    public static final PredefinedToggleStateKey INSTANCE = new PredefinedToggleStateKey();
    public static final int $stable = 8;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private PredefinedToggleStateKey() {
        super(ToggleableState.Off);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.foundation.style.StyleStateKey
    public ToggleableState getValueFrom$foundation(MutableStyleState mutableStyleState) {
        int predefinedState$foundation = mutableStyleState.getPredefinedState$foundation() & 96;
        return predefinedState$foundation != 0 ? predefinedState$foundation != 32 ? ToggleableState.Indeterminate : ToggleableState.On : ToggleableState.Off;
    }

    @Override // androidx.compose.foundation.style.StyleStateKey
    public void setValueTo$foundation(ToggleableState toggleableState, MutableStyleState mutableStyleState) {
        int predefinedState$foundation = mutableStyleState.getPredefinedState$foundation() & (-97);
        ToggleableState toggleableState2 = ToggleableState.On;
        int iOrdinal = toggleableState.ordinal();
        mutableStyleState.setPredefinedState$foundation(predefinedState$foundation | (iOrdinal != 0 ? iOrdinal != 1 ? 64 : 0 : 32));
    }
}
