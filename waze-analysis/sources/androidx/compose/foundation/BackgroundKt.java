package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BackgroundKt {
    public static final Modifier background(Modifier modifier, Brush brush, Shape shape, float f2) {
        return modifier.then(new BackgroundElement(0L, brush, f2, shape, InspectableValueKt.isDebugInspectorInfoEnabled() ? new BackgroundKt$background$$inlined$debugInspectorInfo$1(f2, brush, shape) : InspectableValueKt.getNoInspectorInfo(), 1, null));
    }

    public static /* synthetic */ Modifier background$default(Modifier modifier, Brush brush, Shape shape, float f2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i2 & 4) != 0) {
            f2 = 1.0f;
        }
        return background(modifier, brush, shape, f2);
    }

    /* renamed from: background-bw27NRU, reason: not valid java name */
    public static final Modifier m1971backgroundbw27NRU(Modifier modifier, long j2, Shape shape) {
        return modifier.then(new BackgroundElement(j2, null, 1.0f, shape, InspectableValueKt.isDebugInspectorInfoEnabled() ? new BackgroundKt$backgroundbw27NRU$$inlined$debugInspectorInfo$1(j2, shape) : InspectableValueKt.getNoInspectorInfo(), 2, null));
    }

    /* renamed from: background-bw27NRU$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1972backgroundbw27NRU$default(Modifier modifier, long j2, Shape shape, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return m1971backgroundbw27NRU(modifier, j2, shape);
    }
}
