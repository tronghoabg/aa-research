package androidx.compose.ui.graphics;

import android.graphics.Canvas;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidVertexMode_androidKt {
    /* renamed from: toAndroidVertexMode-JOOmi9M, reason: not valid java name */
    public static final Canvas.VertexMode m8132toAndroidVertexModeJOOmi9M(int i2) {
        return VertexMode.m8676equalsimpl0(i2, VertexMode.Companion.m8682getTrianglesc2xauaI()) ? Canvas.VertexMode.TRIANGLES : VertexMode.m8676equalsimpl0(i2, VertexMode.Companion.m8681getTriangleStripc2xauaI()) ? Canvas.VertexMode.TRIANGLE_STRIP : VertexMode.m8676equalsimpl0(i2, VertexMode.Companion.m8680getTriangleFanc2xauaI()) ? Canvas.VertexMode.TRIANGLE_FAN : Canvas.VertexMode.TRIANGLES;
    }
}
