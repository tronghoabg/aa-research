package androidx.compose.foundation.style;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BooleanPredefinedKey extends StyleStateKey<Boolean> implements PredefinedKey {
    public static final int $stable = 8;
    private final int mask;

    public /* synthetic */ BooleanPredefinedKey(int i2, boolean z, int i3, o oVar) {
        this(i2, z & ((i3 & 2) == 0));
    }

    public final int getMask() {
        return this.mask;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.foundation.style.StyleStateKey
    public Boolean getValueFrom$foundation(MutableStyleState mutableStyleState) {
        return Boolean.valueOf((this.mask & mutableStyleState.getPredefinedState$foundation()) != 0);
    }

    public void setValueTo$foundation(boolean z, MutableStyleState mutableStyleState) {
        int predefinedState$foundation = mutableStyleState.getPredefinedState$foundation();
        int i2 = ~predefinedState$foundation;
        if (true != z) {
            predefinedState$foundation = 0;
        }
        mutableStyleState.setPredefinedState$foundation((this.mask & i2) | predefinedState$foundation);
    }

    public BooleanPredefinedKey(int i2, boolean z) {
        super(Boolean.valueOf(z));
        this.mask = i2;
    }

    @Override // androidx.compose.foundation.style.StyleStateKey
    public /* bridge */ /* synthetic */ void setValueTo$foundation(Boolean bool, MutableStyleState mutableStyleState) {
        setValueTo$foundation(bool.booleanValue(), mutableStyleState);
    }
}
