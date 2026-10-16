package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface SelectableChipColors {
    State<Color> backgroundColor(boolean z, boolean z2, Composer composer, int i2);

    State<Color> contentColor(boolean z, boolean z2, Composer composer, int i2);

    State<Color> leadingIconColor(boolean z, boolean z2, Composer composer, int i2);
}
