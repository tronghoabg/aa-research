package androidx.compose.material;

import android.view.View;
import androidx.compose.ui.unit.IntRect;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class WindowBoundsCalculator {
    public static final int $stable = 8;
    private final View view;

    public WindowBoundsCalculator(View view) {
        this.view = view;
    }

    public final IntRect getVisibleWindowBounds() {
        return ExposedDropdownMenu_android.getWindowBounds(this.view);
    }
}
