package androidx.compose.ui.text.android;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class StaticLayoutFactory33 {
    public static final StaticLayoutFactory33 INSTANCE = new StaticLayoutFactory33();

    private StaticLayoutFactory33() {
    }

    public static final boolean isFallbackLineSpacingEnabled(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static final void setLineBreakConfig(StaticLayout.Builder builder, int i2, int i3) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i2).setLineBreakWordStyle(i3).build());
    }
}
