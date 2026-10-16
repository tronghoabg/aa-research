package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface SwitchColors {
    State<Color> thumbColor(boolean z, boolean z2, Composer composer, int i2);

    State<Color> trackColor(boolean z, boolean z2, Composer composer, int i2);
}
