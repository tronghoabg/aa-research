package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.state.ToggleableState;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface CheckboxColors {
    State<Color> borderColor(boolean z, ToggleableState toggleableState, Composer composer, int i2);

    State<Color> boxColor(boolean z, ToggleableState toggleableState, Composer composer, int i2);

    State<Color> checkmarkColor(ToggleableState toggleableState, Composer composer, int i2);
}
