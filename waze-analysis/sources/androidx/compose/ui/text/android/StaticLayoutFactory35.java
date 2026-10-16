package androidx.compose.ui.text.android;

import android.text.StaticLayout;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class StaticLayoutFactory35 {
    public static final StaticLayoutFactory35 INSTANCE = new StaticLayoutFactory35();

    private StaticLayoutFactory35() {
    }

    public static final void disableUseBoundsForWidth(StaticLayout.Builder builder) {
        builder.setUseBoundsForWidth(false);
    }
}
