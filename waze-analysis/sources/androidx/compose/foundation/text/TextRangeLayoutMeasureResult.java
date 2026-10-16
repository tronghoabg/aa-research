package androidx.compose.foundation.text;

import androidx.compose.ui.unit.IntOffset;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextRangeLayoutMeasureResult {
    public static final int $stable = 0;
    private final int height;
    private final a<IntOffset> place;
    private final int width;

    public TextRangeLayoutMeasureResult(int i2, int i3, a<IntOffset> aVar) {
        this.width = i2;
        this.height = i3;
        this.place = aVar;
    }

    public final int getHeight() {
        return this.height;
    }

    public final a<IntOffset> getPlace() {
        return this.place;
    }

    public final int getWidth() {
        return this.width;
    }
}
