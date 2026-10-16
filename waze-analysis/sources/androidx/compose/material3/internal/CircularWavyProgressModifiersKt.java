package androidx.compose.material3.internal;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import h.g.a.a;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CircularWavyProgressModifiersKt {
    private static final int MinAnimationDuration = 50;
    private static final int MinCircularVertexCount = 5;

    /* renamed from: circularWavyProgressIndicator-4JQtiWo, reason: not valid java name */
    public static final Modifier m6246circularWavyProgressIndicator4JQtiWo(Modifier modifier, long j2, long j3, Stroke stroke, Stroke stroke2, float f2, float f3, float f4, float f5) {
        return modifier.then(new IndeterminateCircularWavyProgressElement(j2, j3, stroke, stroke2, f2, f3, f4, f5, null));
    }

    /* renamed from: circularWavyProgressIndicator-4ohQjRg, reason: not valid java name */
    public static final Modifier m6247circularWavyProgressIndicator4ohQjRg(Modifier modifier, a<Float> aVar, long j2, long j3, Stroke stroke, Stroke stroke2, float f2, l<? super Float, Float> lVar, float f3, float f4) {
        return modifier.then(new DeterminateCircularWavyProgressElement(aVar, j2, j3, stroke, stroke2, f2, lVar, f3, f4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawCircularIndicator-RIQooxk, reason: not valid java name */
    public static final void m6248drawCircularIndicatorRIQooxk(DrawScope drawScope, long j2, long j3, Stroke stroke, Stroke stroke2, CircularProgressDrawingCache circularProgressDrawingCache) {
        if (!Color.m8229equalsimpl0(j3, Color.Companion.m8263getTransparent0d7_KjU()) && !Color.m8229equalsimpl0(j3, Color.Companion.m8264getUnspecified0d7_KjU())) {
            DrawScope.CC.m8832drawPathLG529CI$default(drawScope, circularProgressDrawingCache.getTrackPathToDraw(), j3, 0.0f, stroke2, null, 0, 52, null);
        }
        if (Color.m8229equalsimpl0(j2, Color.Companion.m8263getTransparent0d7_KjU()) || Color.m8229equalsimpl0(j2, Color.Companion.m8264getUnspecified0d7_KjU())) {
            return;
        }
        DrawScope.CC.m8832drawPathLG529CI$default(drawScope, circularProgressDrawingCache.getProgressPathToDraw(), j2, 0.0f, stroke, null, 0, 52, null);
    }
}
