package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface ChipColors {
    State<Color> backgroundColor(boolean z, Composer composer, int i2);

    State<Color> contentColor(boolean z, Composer composer, int i2);

    State<Color> leadingIconContentColor(boolean z, Composer composer, int i2);
}
