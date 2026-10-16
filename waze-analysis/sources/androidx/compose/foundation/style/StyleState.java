package androidx.compose.foundation.style;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.state.ToggleableState;
import h.ab;
import h.c.e;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class StyleState {
    public static final int $stable = 0;

    private StyleState() {
    }

    public abstract <T> T get(StyleStateKey<T> styleStateKey);

    public abstract InteractionSource getInteractionSource$foundation();

    public abstract ToggleableState getTriStateToggle();

    public abstract boolean isChecked();

    public abstract boolean isEnabled();

    public abstract boolean isFocused();

    public abstract boolean isHovered();

    public abstract boolean isPressed();

    public abstract boolean isSelected();

    public abstract Object processInteractions$foundation(InteractionSource interactionSource, e<? super ab> eVar);

    public /* synthetic */ StyleState(o oVar) {
        this();
    }
}
