package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.IntOffset;
import androidx.media3.muxer.MuxerUtil;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface Canvas {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.graphics.Canvas$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: $default$clipRect-mtrdD-E, reason: not valid java name */
        public static void m8198$default$clipRectmtrdDE(Canvas canvas, Rect rect, int i2) {
            canvas.mo8075clipRectN_I0leg(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), i2);
        }

        public static void $default$drawArc(Canvas canvas, Rect rect, float f2, float f3, boolean z, Paint paint) {
            canvas.drawArc(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f2, f3, z, paint);
        }

        public static void $default$drawArcRad(Canvas canvas, Rect rect, float f2, float f3, boolean z, Paint paint) {
            canvas.drawArc(rect, DegreesKt.degrees(f2), DegreesKt.degrees(f3), z, paint);
        }

        public static void $default$drawOval(Canvas canvas, Rect rect, Paint paint) {
            canvas.drawOval(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
        }

        public static void $default$drawRect(Canvas canvas, Rect rect, Paint paint) {
            canvas.drawRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
        }

        public static void $default$skewRad(Canvas canvas, float f2, float f3) {
            canvas.skew(DegreesKt.degrees(f2), DegreesKt.degrees(f3));
        }

        /* renamed from: clipPath-mtrdD-E$default, reason: not valid java name */
        public static /* synthetic */ void m8200clipPathmtrdDE$default(Canvas canvas, Path path, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
            }
            if ((i3 & 2) != 0) {
                i2 = ClipOp.Companion.m8217getIntersectrtfAjoo();
            }
            canvas.mo8074clipPathmtrdDE(path, i2);
        }

        /* renamed from: clipRect-N_I0leg$default, reason: not valid java name */
        public static /* synthetic */ void m8201clipRectN_I0leg$default(Canvas canvas, float f2, float f3, float f4, float f5, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
            }
            if ((i3 & 16) != 0) {
                i2 = ClipOp.Companion.m8217getIntersectrtfAjoo();
            }
            canvas.mo8075clipRectN_I0leg(f2, f3, f4, f5, i2);
        }

        /* renamed from: clipRect-mtrdD-E$default, reason: not valid java name */
        public static /* synthetic */ void m8202clipRectmtrdDE$default(Canvas canvas, Rect rect, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
            }
            if ((i3 & 2) != 0) {
                i2 = ClipOp.Companion.m8217getIntersectrtfAjoo();
            }
            canvas.mo8076clipRectmtrdDE(rect, i2);
        }

        /* renamed from: drawImageRect-HPBpro0$default, reason: not valid java name */
        public static /* synthetic */ void m8203drawImageRectHPBpro0$default(Canvas canvas, ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, Paint paint, int i2, Object obj) {
            long height;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
            }
            long jM11307getZeronOccac = (i2 & 2) != 0 ? IntOffset.Companion.m11307getZeronOccac() : j2;
            if ((i2 & 4) != 0) {
                height = (imageBitmap.getHeight() & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (imageBitmap.getWidth() << 32);
            } else {
                height = j3;
            }
            canvas.mo8080drawImageRectHPBpro0(imageBitmap, jM11307getZeronOccac, height, (i2 & 8) != 0 ? IntOffset.Companion.m11307getZeronOccac() : j4, (i2 & 16) != 0 ? height : j5, paint);
        }

        public static /* synthetic */ void scale$default(Canvas canvas, float f2, float f3, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale");
            }
            if ((i2 & 2) != 0) {
                f3 = f2;
            }
            canvas.scale(f2, f3);
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        /* renamed from: clipRect-mtrdD-E, reason: not valid java name */
        public static void m8206clipRectmtrdDE(Canvas canvas, Rect rect, int i2) {
            CC.m8198$default$clipRectmtrdDE(canvas, rect, i2);
        }

        @Deprecated
        public static void drawArc(Canvas canvas, Rect rect, float f2, float f3, boolean z, Paint paint) {
            CC.$default$drawArc(canvas, rect, f2, f3, z, paint);
        }

        @Deprecated
        public static void drawArcRad(Canvas canvas, Rect rect, float f2, float f3, boolean z, Paint paint) {
            CC.$default$drawArcRad(canvas, rect, f2, f3, z, paint);
        }

        @Deprecated
        public static void drawOval(Canvas canvas, Rect rect, Paint paint) {
            CC.$default$drawOval(canvas, rect, paint);
        }

        @Deprecated
        public static void drawRect(Canvas canvas, Rect rect, Paint paint) {
            CC.$default$drawRect(canvas, rect, paint);
        }

        @Deprecated
        public static void skewRad(Canvas canvas, float f2, float f3) {
            CC.$default$skewRad(canvas, f2, f3);
        }
    }

    /* renamed from: clipPath-mtrdD-E */
    void mo8074clipPathmtrdDE(Path path, int i2);

    /* renamed from: clipRect-N_I0leg */
    void mo8075clipRectN_I0leg(float f2, float f3, float f4, float f5, int i2);

    /* renamed from: clipRect-mtrdD-E */
    void mo8076clipRectmtrdDE(Rect rect, int i2);

    /* renamed from: concat-58bKbWc */
    void mo8077concat58bKbWc(float[] fArr);

    void disableZ();

    void drawArc(float f2, float f3, float f4, float f5, float f6, float f7, boolean z, Paint paint);

    void drawArc(Rect rect, float f2, float f3, boolean z, Paint paint);

    void drawArcRad(Rect rect, float f2, float f3, boolean z, Paint paint);

    /* renamed from: drawCircle-9KIMszo */
    void mo8078drawCircle9KIMszo(long j2, float f2, Paint paint);

    /* renamed from: drawImage-d-4ec7I */
    void mo8079drawImaged4ec7I(ImageBitmap imageBitmap, long j2, Paint paint);

    /* renamed from: drawImageRect-HPBpro0 */
    void mo8080drawImageRectHPBpro0(ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, Paint paint);

    /* renamed from: drawLine-Wko1d7g */
    void mo8081drawLineWko1d7g(long j2, long j3, Paint paint);

    void drawOval(float f2, float f3, float f4, float f5, Paint paint);

    void drawOval(Rect rect, Paint paint);

    void drawPath(Path path, Paint paint);

    /* renamed from: drawPoints-O7TthRY */
    void mo8082drawPointsO7TthRY(int i2, List<Offset> list, Paint paint);

    /* renamed from: drawRawPoints-O7TthRY */
    void mo8083drawRawPointsO7TthRY(int i2, float[] fArr, Paint paint);

    void drawRect(float f2, float f3, float f4, float f5, Paint paint);

    void drawRect(Rect rect, Paint paint);

    void drawRoundRect(float f2, float f3, float f4, float f5, float f6, float f7, Paint paint);

    /* renamed from: drawVertices-TPEHhCM */
    void mo8084drawVerticesTPEHhCM(Vertices vertices, int i2, Paint paint);

    void enableZ();

    void restore();

    void rotate(float f2);

    void save();

    void saveLayer(Rect rect, Paint paint);

    void scale(float f2, float f3);

    void skew(float f2, float f3);

    void skewRad(float f2, float f3);

    void translate(float f2, float f3);
}
