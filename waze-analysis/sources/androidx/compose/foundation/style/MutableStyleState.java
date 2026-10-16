package androidx.compose.foundation.style;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.state.ToggleableState;
import h.ab;
import h.c.a.a;
import h.c.e;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MutableStyleState extends StyleState {
    public static final int $stable = 8;
    private SnapshotStateMap<StyleStateKey<?>, Object> customStates;
    private final InteractionSource interactionSource;
    private final MutableIntState predefinedState$delegate;

    public MutableStyleState(InteractionSource interactionSource) {
        super(null);
        this.interactionSource = interactionSource;
        this.customStates = SnapshotStateKt.mutableStateMapOf();
        this.predefinedState$delegate = SnapshotIntStateKt.mutableIntStateOf(16);
    }

    @Override // androidx.compose.foundation.style.StyleState
    public <T> T get(StyleStateKey<T> styleStateKey) {
        return styleStateKey.getValueFrom$foundation(this);
    }

    public final SnapshotStateMap<StyleStateKey<?>, Object> getCustomStates$foundation() {
        return this.customStates;
    }

    public final <T> T getCustomValue$foundation(StyleStateKey<T> styleStateKey) {
        T t = (T) this.customStates.get(styleStateKey);
        return t == null ? styleStateKey.getDefaultValue$foundation() : t;
    }

    @Override // androidx.compose.foundation.style.StyleState
    public InteractionSource getInteractionSource$foundation() {
        return this.interactionSource;
    }

    public final int getPredefinedState$foundation() {
        return this.predefinedState$delegate.getIntValue();
    }

    @Override // androidx.compose.foundation.style.StyleState
    public ToggleableState getTriStateToggle() {
        return PredefinedToggleStateKey.INSTANCE.getValueFrom$foundation(this);
    }

    @Override // androidx.compose.foundation.style.StyleState
    public boolean isChecked() {
        return PredefinedToggleStateKey.INSTANCE.getValueFrom$foundation(this) == ToggleableState.On;
    }

    @Override // androidx.compose.foundation.style.StyleState
    public boolean isEnabled() {
        return (getPredefinedState$foundation() & 16) != 0;
    }

    @Override // androidx.compose.foundation.style.StyleState
    public boolean isFocused() {
        return (getPredefinedState$foundation() & 4) != 0;
    }

    @Override // androidx.compose.foundation.style.StyleState
    public boolean isHovered() {
        return (getPredefinedState$foundation() & 2) != 0;
    }

    @Override // androidx.compose.foundation.style.StyleState
    public boolean isPressed() {
        return (getPredefinedState$foundation() & 1) != 0;
    }

    @Override // androidx.compose.foundation.style.StyleState
    public boolean isSelected() {
        return (getPredefinedState$foundation() & 8) != 0;
    }

    @Override // androidx.compose.foundation.style.StyleState
    public Object processInteractions$foundation(InteractionSource interactionSource, e<? super ab> eVar) {
        InteractionSet interactionSet = new InteractionSet();
        InteractionSet interactionSet2 = new InteractionSet();
        InteractionSet interactionSet3 = new InteractionSet();
        setPressed(false);
        setHovered(false);
        setFocused(false);
        Object objCollect = interactionSource.getInteractions().collect(new MutableStyleState$processInteractions$2(interactionSet, this, interactionSet2, interactionSet3), eVar);
        return objCollect == a.f48038a ? objCollect : ab.f48028a;
    }

    public final <T> void remove(StyleStateKey<T> styleStateKey) {
        if (styleStateKey instanceof PredefinedKey) {
            throw new IllegalStateException("Cannot remove an internal StyleStateKey");
        }
        this.customStates.remove(styleStateKey);
    }

    public final <T> void set(StyleStateKey<T> styleStateKey, T t) {
        styleStateKey.setValueTo$foundation(t, this);
    }

    public void setChecked(boolean z) {
        PredefinedToggleStateKey.INSTANCE.setValueTo$foundation(z ? ToggleableState.On : ToggleableState.Off, this);
    }

    public final void setCustomStates$foundation(SnapshotStateMap<StyleStateKey<?>, Object> snapshotStateMap) {
        this.customStates = snapshotStateMap;
    }

    public final <T> void setCustomValue$foundation(StyleStateKey<T> styleStateKey, T t) {
        SnapshotStateMap<StyleStateKey<?>, Object> snapshotStateMap = this.customStates;
        x.d(t, "null cannot be cast to non-null type kotlin.Any");
        snapshotStateMap.put(styleStateKey, t);
    }

    public void setEnabled(boolean z) {
        setPredefinedState$foundation((true != z ? 0 : 16) | (getPredefinedState$foundation() & (-17)));
    }

    public void setFocused(boolean z) {
        setPredefinedState$foundation((true != z ? 0 : 4) | (getPredefinedState$foundation() & (-5)));
    }

    public void setHovered(boolean z) {
        setPredefinedState$foundation((true != z ? 0 : 2) | (getPredefinedState$foundation() & (-3)));
    }

    public final void setPredefinedState$foundation(int i2) {
        this.predefinedState$delegate.setIntValue(i2);
    }

    public void setPressed(boolean z) {
        setPredefinedState$foundation((z ? 1 : 0) | (getPredefinedState$foundation() & (-2)));
    }

    public void setSelected(boolean z) {
        setPredefinedState$foundation((true != z ? 0 : 8) | (getPredefinedState$foundation() & (-9)));
    }

    public void setTriStateToggle(ToggleableState toggleableState) {
        PredefinedToggleStateKey.INSTANCE.setValueTo$foundation(toggleableState, this);
    }
}
