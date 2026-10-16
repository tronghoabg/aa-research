package androidx.compose.material3.internal;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.media3.muxer.MuxerUtil;
import h.g.a.a;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class LinearWavyProgressModifiersKt {
    private static final int MinAnimationDuration = 50;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawStopIndicator-VnkRyUA, reason: not valid java name */
    public static final void m6283drawStopIndicatorVnkRyUA(DrawScope drawScope, float f2, long j2, float f3, float f4, Stroke stroke, long j3) {
        float fMin = Math.min(stroke.getWidth(), drawScope.mo2127toPx0680j_4(f3));
        float width = fMin == stroke.getWidth() ? 0.0f : stroke.getWidth() / 4.0f;
        int i2 = (int) (j2 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i2) - fMin;
        float fIntBitsToFloat2 = (Float.intBitsToFloat(i2) * f2) + f4;
        float f5 = fIntBitsToFloat - width;
        if (f5 <= fIntBitsToFloat2) {
            fMin = Math.max(0.0f, fMin - (fIntBitsToFloat2 - f5));
        } else {
            fIntBitsToFloat2 = f5;
        }
        if (fMin > 0.0f) {
            int i3 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            if (StrokeCap.m8628equalsimpl0(stroke.m8908getCapKaPHkGw(), StrokeCap.Companion.m8633getRoundKaPHkGw())) {
                DrawScope.CC.m8823drawCircleVaOC9Bg$default(drawScope, j3, fMin / 2.0f, (Float.floatToRawIntBits(fIntBitsToFloat2 + r0) << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & Float.floatToRawIntBits(Float.intBitsToFloat(i3) / 2.0f)), 0.0f, null, null, 0, 120, null);
            } else {
                float fIntBitsToFloat3 = (Float.intBitsToFloat(i3) - fMin) / 2.0f;
                DrawScope.CC.m8836drawRectnJ9OG0$default(drawScope, j3, (Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), (Float.floatToRawIntBits(fMin) << 32) | (Float.floatToRawIntBits(fMin) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), 0.0f, null, null, 0, 120, null);
            }
        }
    }

    /* renamed from: linearWavyProgressIndicator-OFGGHrU, reason: not valid java name */
    public static final Modifier m6284linearWavyProgressIndicatorOFGGHrU(Modifier modifier, a<Float> aVar, a<Float> aVar2, a<Float> aVar3, a<Float> aVar4, long j2, long j3, Stroke stroke, Stroke stroke2, float f2, float f3, float f4, float f5) {
        return modifier.then(new IndeterminateLinearWavyProgressElement(aVar, aVar2, aVar3, aVar4, j2, j3, stroke, stroke2, f2, f4, f5, f3, null));
    }

    /* renamed from: linearWavyProgressIndicator-bMBChCs, reason: not valid java name */
    public static final Modifier m6285linearWavyProgressIndicatorbMBChCs(Modifier modifier, a<Float> aVar, l<? super Float, Float> lVar, long j2, long j3, Stroke stroke, Stroke stroke2, float f2, float f3, float f4, float f5) {
        return modifier.then(new DeterminateLinearWavyProgressElement(aVar, lVar, j2, j3, stroke, stroke2, f2, f3, f4, f5, null));
    }
}
