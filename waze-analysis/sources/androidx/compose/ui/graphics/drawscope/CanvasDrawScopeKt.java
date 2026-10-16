package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.InlineClassHelperKt;
import androidx.compose.ui.graphics.Path;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CanvasDrawScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawTransform asDrawTransform(final DrawContext drawContext) {
        return new DrawTransform() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt.asDrawTransform.1
            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: clipPath-mtrdD-E, reason: not valid java name */
            public void mo8760clipPathmtrdDE(Path path, int i2) {
                drawContext.getCanvas().mo8074clipPathmtrdDE(path, i2);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: clipRect-N_I0leg, reason: not valid java name */
            public void mo8761clipRectN_I0leg(float f2, float f3, float f4, float f5, int i2) {
                drawContext.getCanvas().mo8075clipRectN_I0leg(f2, f3, f4, f5, i2);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
            public long mo8762getCenterF1C5BW0() {
                return SizeKt.m8059getCenteruvyYCjk(mo8763getSizeNHjbRc());
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: getSize-NH-jbRc, reason: not valid java name */
            public long mo8763getSizeNHjbRc() {
                return drawContext.mo8758getSizeNHjbRc();
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void inset(float f2, float f3, float f4, float f5) {
                Canvas canvas = drawContext.getCanvas();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (mo8763getSizeNHjbRc() >> 32)) - (f4 + f2);
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (mo8763getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - (f5 + f3);
                long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) < 0.0f) {
                    InlineClassHelperKt.throwIllegalArgumentException("Width and height must be greater than or equal to zero");
                }
                drawContext.mo8759setSizeuvyYCjk(jFloatToRawIntBits);
                canvas.translate(f2, f3);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: rotate-Uv8p0NA, reason: not valid java name */
            public void mo8764rotateUv8p0NA(float f2, long j2) {
                int i2 = (int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2);
                int i3 = (int) (j2 >> 32);
                Canvas canvas = drawContext.getCanvas();
                canvas.translate(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2));
                canvas.rotate(f2);
                canvas.translate(-Float.intBitsToFloat(i3), -Float.intBitsToFloat(i2));
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: scale-0AR0LA0, reason: not valid java name */
            public void mo8765scale0AR0LA0(float f2, float f3, long j2) {
                int i2 = (int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2);
                int i3 = (int) (j2 >> 32);
                Canvas canvas = drawContext.getCanvas();
                canvas.translate(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2));
                canvas.scale(f2, f3);
                canvas.translate(-Float.intBitsToFloat(i3), -Float.intBitsToFloat(i2));
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: transform-58bKbWc, reason: not valid java name */
            public void mo8766transform58bKbWc(float[] fArr) {
                drawContext.getCanvas().mo8077concat58bKbWc(fArr);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void translate(float f2, float f3) {
                drawContext.getCanvas().translate(f2, f3);
            }
        };
    }
}
