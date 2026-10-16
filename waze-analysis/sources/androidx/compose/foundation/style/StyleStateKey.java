package androidx.compose.foundation.style;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.ui.state.ToggleableState;
import h.ab;
import h.c.a.a;
import h.c.e;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class StyleStateKey<T> {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static final StyleStateKey<Boolean> Enabled = new BooleanPredefinedKey(16, true);
    private static final StyleStateKey<Boolean> Focused;
    private static final StyleStateKey<Boolean> Hovered;
    private static final StyleStateKey<Boolean> Pressed;
    private static final StyleStateKey<Boolean> Selected;
    private final T defaultValue;

    static {
        o oVar = null;
        Companion = new Companion(oVar);
        boolean z = false;
        int i2 = 2;
        Pressed = new BooleanPredefinedKey(1, z, i2, oVar);
        Hovered = new BooleanPredefinedKey(i2, z, i2, oVar);
        Focused = new BooleanPredefinedKey(4, z, i2, oVar);
        Selected = new BooleanPredefinedKey(8, z, i2, oVar);
    }

    public StyleStateKey(T t) {
        this.defaultValue = t;
    }

    static /* synthetic */ <T> Object processInteraction$suspendImpl(StyleStateKey<T> styleStateKey, Interaction interaction, MutableStyleState mutableStyleState, e<? super ab> eVar) {
        return ab.f48028a;
    }

    public final T getDefaultValue$foundation() {
        return this.defaultValue;
    }

    public T getValueFrom$foundation(MutableStyleState mutableStyleState) {
        return (T) mutableStyleState.getCustomValue$foundation(this);
    }

    protected Object processInteraction(Interaction interaction, MutableStyleState mutableStyleState, e<? super ab> eVar) {
        return processInteraction$suspendImpl(this, interaction, mutableStyleState, eVar);
    }

    public final Object processInteractionAccess$foundation(Interaction interaction, MutableStyleState mutableStyleState, e<? super ab> eVar) {
        Object objProcessInteraction = processInteraction(interaction, mutableStyleState, eVar);
        return objProcessInteraction == a.f48038a ? objProcessInteraction : ab.f48028a;
    }

    public void setValueTo$foundation(T t, MutableStyleState mutableStyleState) {
        mutableStyleState.setCustomValue$foundation(this, t);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final StyleStateKey<Boolean> getEnabled() {
            return StyleStateKey.Enabled;
        }

        public final StyleStateKey<Boolean> getFocused() {
            return StyleStateKey.Focused;
        }

        public final StyleStateKey<Boolean> getHovered() {
            return StyleStateKey.Hovered;
        }

        public final StyleStateKey<Boolean> getPressed() {
            return StyleStateKey.Pressed;
        }

        public final StyleStateKey<Boolean> getSelected() {
            return StyleStateKey.Selected;
        }

        public final StyleStateKey<ToggleableState> getToggle() {
            return PredefinedToggleStateKey.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
