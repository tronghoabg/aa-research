package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
@DrawScopeMarker
/* loaded from: classes.dex */
public interface DrawTransform {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.graphics.drawscope.DrawTransform$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: $default$getCenter-F1C5BW0, reason: not valid java name */
        public static long m8893$default$getCenterF1C5BW0(DrawTransform drawTransform) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (drawTransform.mo8763getSizeNHjbRc() >> 32)) / 2.0f;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawTransform.mo8763getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) / 2.0f;
            return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        }

        /* renamed from: clipPath-mtrdD-E$default, reason: not valid java name */
        public static /* synthetic */ void m8895clipPathmtrdDE$default(DrawTransform drawTransform, Path path, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
            }
            if ((i3 & 2) != 0) {
                i2 = ClipOp.Companion.m8217getIntersectrtfAjoo();
            }
            drawTransform.mo8760clipPathmtrdDE(path, i2);
        }

        /* renamed from: clipRect-N_I0leg$default, reason: not valid java name */
        public static /* synthetic */ void m8896clipRectN_I0leg$default(DrawTransform drawTransform, float f2, float f3, float f4, float f5, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
            }
            if (1 == (i3 & 1)) {
                f2 = 0.0f;
            }
            if ((i3 & 2) != 0) {
                f3 = 0.0f;
            }
            if ((i3 & 4) != 0) {
                f4 = Float.intBitsToFloat((int) (drawTransform.mo8763getSizeNHjbRc() >> 32));
            }
            if ((i3 & 8) != 0) {
                f5 = Float.intBitsToFloat((int) (drawTransform.mo8763getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
            }
            if ((i3 & 16) != 0) {
                i2 = ClipOp.Companion.m8217getIntersectrtfAjoo();
            }
            drawTransform.mo8761clipRectN_I0leg(f2, f3, f4, f5, i2);
        }

        /* renamed from: rotate-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ void m8897rotateUv8p0NA$default(DrawTransform drawTransform, float f2, long j2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
            }
            if ((i2 & 2) != 0) {
                j2 = drawTransform.mo8762getCenterF1C5BW0();
            }
            drawTransform.mo8764rotateUv8p0NA(f2, j2);
        }

        /* renamed from: scale-0AR0LA0$default, reason: not valid java name */
        public static /* synthetic */ void m8898scale0AR0LA0$default(DrawTransform drawTransform, float f2, float f3, long j2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
            }
            if ((i2 & 4) != 0) {
                j2 = drawTransform.mo8762getCenterF1C5BW0();
            }
            drawTransform.mo8765scale0AR0LA0(f2, f3, j2);
        }

        public static /* synthetic */ void translate$default(DrawTransform drawTransform, float f2, float f3, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
            }
            if (1 == (i2 & 1)) {
                f2 = 0.0f;
            }
            if ((i2 & 2) != 0) {
                f3 = 0.0f;
            }
            drawTransform.translate(f2, f3);
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m8901getCenterF1C5BW0(DrawTransform drawTransform) {
            return CC.m8893$default$getCenterF1C5BW0(drawTransform);
        }
    }

    /* renamed from: clipPath-mtrdD-E */
    void mo8760clipPathmtrdDE(Path path, int i2);

    /* renamed from: clipRect-N_I0leg */
    void mo8761clipRectN_I0leg(float f2, float f3, float f4, float f5, int i2);

    /* renamed from: getCenter-F1C5BW0 */
    long mo8762getCenterF1C5BW0();

    /* renamed from: getSize-NH-jbRc */
    long mo8763getSizeNHjbRc();

    void inset(float f2, float f3, float f4, float f5);

    /* renamed from: rotate-Uv8p0NA */
    void mo8764rotateUv8p0NA(float f2, long j2);

    /* renamed from: scale-0AR0LA0 */
    void mo8765scale0AR0LA0(float f2, float f3, long j2);

    /* renamed from: transform-58bKbWc */
    void mo8766transform58bKbWc(float[] fArr);

    void translate(float f2, float f3);
}
