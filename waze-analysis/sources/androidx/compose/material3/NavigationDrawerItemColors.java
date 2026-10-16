package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface NavigationDrawerItemColors {
    State<Color> badgeColor(boolean z, Composer composer, int i2);

    State<Color> containerColor(boolean z, Composer composer, int i2);

    State<Color> iconColor(boolean z, Composer composer, int i2);

    State<Color> textColor(boolean z, Composer composer, int i2);
}
