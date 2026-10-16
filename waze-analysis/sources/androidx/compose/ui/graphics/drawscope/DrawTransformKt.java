package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.DegreesKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DrawTransformKt {
    public static final void inset(DrawTransform drawTransform, float f2) {
        drawTransform.inset(f2, f2, f2, f2);
    }

    public static /* synthetic */ void inset$default(DrawTransform drawTransform, float f2, float f3, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        drawTransform.inset(f2, f3, f2, f3);
    }

    /* renamed from: rotateRad-0AR0LA0, reason: not valid java name */
    public static final void m8904rotateRad0AR0LA0(DrawTransform drawTransform, float f2, long j2) {
        drawTransform.mo8764rotateUv8p0NA(DegreesKt.degrees(f2), j2);
    }

    /* renamed from: rotateRad-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m8905rotateRad0AR0LA0$default(DrawTransform drawTransform, float f2, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = drawTransform.mo8762getCenterF1C5BW0();
        }
        drawTransform.mo8764rotateUv8p0NA(DegreesKt.degrees(f2), j2);
    }

    /* renamed from: scale-0AR0LA0, reason: not valid java name */
    public static final void m8906scale0AR0LA0(DrawTransform drawTransform, float f2, long j2) {
        drawTransform.mo8765scale0AR0LA0(f2, f2, j2);
    }

    /* renamed from: scale-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m8907scale0AR0LA0$default(DrawTransform drawTransform, float f2, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = drawTransform.mo8762getCenterF1C5BW0();
        }
        drawTransform.mo8765scale0AR0LA0(f2, f2, j2);
    }

    public static final void inset(DrawTransform drawTransform, float f2, float f3) {
        drawTransform.inset(f2, f3, f2, f3);
    }
}
