package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.unit.IntOffset;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidCanvas implements Canvas {
    public static final int $stable = 8;
    private Rect dstRect;
    private android.graphics.Canvas internalCanvas = AndroidCanvas_androidKt.EmptyCanvas;
    private Rect srcRect;

    private final void drawLines(List<Offset> list, Paint paint, int i2) {
        if (list.size() >= 2) {
            android.graphics.Paint nativePaint = AndroidPaint_androidKt.getNativePaint(paint);
            int i3 = 0;
            while (i3 < list.size() - 1) {
                long jM7990unboximpl = list.get(i3).m7990unboximpl();
                long jM7990unboximpl2 = list.get(i3 + 1).m7990unboximpl();
                this.internalCanvas.drawLine(Float.intBitsToFloat((int) (jM7990unboximpl >> 32)), Float.intBitsToFloat((int) (jM7990unboximpl & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), Float.intBitsToFloat((int) (jM7990unboximpl2 >> 32)), Float.intBitsToFloat((int) (jM7990unboximpl2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), nativePaint);
                i3 += i2;
            }
        }
    }

    private final void drawPoints(List<Offset> list, Paint paint) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            long jM7990unboximpl = list.get(i2).m7990unboximpl();
            this.internalCanvas.drawPoint(Float.intBitsToFloat((int) (jM7990unboximpl >> 32)), Float.intBitsToFloat((int) (jM7990unboximpl & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), AndroidPaint_androidKt.getNativePaint(paint));
        }
    }

    private final void drawRawLines(float[] fArr, Paint paint, int i2) {
        int length = fArr.length;
        if (length < 4 || (length & 1) != 0) {
            return;
        }
        android.graphics.Paint nativePaint = AndroidPaint_androidKt.getNativePaint(paint);
        int i3 = 0;
        while (i3 < fArr.length - 3) {
            this.internalCanvas.drawLine(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3], nativePaint);
            i3 += i2 + i2;
        }
    }

    private final void drawRawPoints(float[] fArr, Paint paint, int i2) {
        if ((fArr.length & 1) == 0) {
            android.graphics.Paint nativePaint = AndroidPaint_androidKt.getNativePaint(paint);
            int i3 = 0;
            while (i3 < fArr.length - 1) {
                this.internalCanvas.drawPoint(fArr[i3], fArr[i3 + 1], nativePaint);
                i3 += i2;
            }
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipPath-mtrdD-E, reason: not valid java name */
    public void mo8074clipPathmtrdDE(Path path, int i2) {
        boolean z = path instanceof AndroidPath;
        android.graphics.Canvas canvas = this.internalCanvas;
        if (!z) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((AndroidPath) path).getInternalPath(), m8085toRegionOp7u2Bmg(i2));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipRect-N_I0leg, reason: not valid java name */
    public void mo8075clipRectN_I0leg(float f2, float f3, float f4, float f5, int i2) {
        this.internalCanvas.clipRect(f2, f3, f4, f5, m8085toRegionOp7u2Bmg(i2));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipRect-mtrdD-E, reason: not valid java name */
    public /* synthetic */ void mo8076clipRectmtrdDE(androidx.compose.ui.geometry.Rect rect, int i2) {
        Canvas.CC.m8198$default$clipRectmtrdDE(this, rect, i2);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: concat-58bKbWc, reason: not valid java name */
    public void mo8077concat58bKbWc(float[] fArr) {
        if (MatrixKt.m8517isIdentity58bKbWc(fArr)) {
            return;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        AndroidMatrixConversions_androidKt.m8095setFromEL8BTi8(matrix, fArr);
        this.internalCanvas.concat(matrix);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void disableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, false);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawArc(float f2, float f3, float f4, float f5, float f6, float f7, boolean z, Paint paint) {
        this.internalCanvas.drawArc(f2, f3, f4, f5, f6, f7, z, AndroidPaint_androidKt.getNativePaint(paint));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public /* synthetic */ void drawArcRad(androidx.compose.ui.geometry.Rect rect, float f2, float f3, boolean z, Paint paint) {
        Canvas.CC.$default$drawArcRad(this, rect, f2, f3, z, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawCircle-9KIMszo, reason: not valid java name */
    public void mo8078drawCircle9KIMszo(long j2, float f2, Paint paint) {
        this.internalCanvas.drawCircle(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2)), f2, AndroidPaint_androidKt.getNativePaint(paint));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawImage-d-4ec7I, reason: not valid java name */
    public void mo8079drawImaged4ec7I(ImageBitmap imageBitmap, long j2, Paint paint) {
        this.internalCanvas.drawBitmap(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2)), AndroidPaint_androidKt.getNativePaint(paint));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawImageRect-HPBpro0, reason: not valid java name */
    public void mo8080drawImageRectHPBpro0(ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, Paint paint) {
        if (this.srcRect == null) {
            this.srcRect = new Rect();
            this.dstRect = new Rect();
        }
        android.graphics.Canvas canvas = this.internalCanvas;
        Bitmap bitmapAsAndroidBitmap = AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap);
        Rect rect = this.srcRect;
        if (rect == null) {
            x.g();
        }
        rect.left = IntOffset.m11296getXimpl(j2);
        rect.top = IntOffset.m11297getYimpl(j2);
        rect.right = IntOffset.m11296getXimpl(j2) + ((int) (j3 >> 32));
        rect.bottom = IntOffset.m11297getYimpl(j2) + ((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        Rect rect2 = this.dstRect;
        if (rect2 == null) {
            x.g();
        }
        rect2.left = IntOffset.m11296getXimpl(j4);
        rect2.top = IntOffset.m11297getYimpl(j4);
        rect2.right = IntOffset.m11296getXimpl(j4) + ((int) (j5 >> 32));
        rect2.bottom = IntOffset.m11297getYimpl(j4) + ((int) (j5 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        canvas.drawBitmap(bitmapAsAndroidBitmap, rect, rect2, AndroidPaint_androidKt.getNativePaint(paint));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawLine-Wko1d7g, reason: not valid java name */
    public void mo8081drawLineWko1d7g(long j2, long j3, Paint paint) {
        int i2 = (int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        this.internalCanvas.drawLine(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat(i2), AndroidPaint_androidKt.getNativePaint(paint));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawOval(float f2, float f3, float f4, float f5, Paint paint) {
        this.internalCanvas.drawOval(f2, f3, f4, f5, AndroidPaint_androidKt.getNativePaint(paint));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawPath(Path path, Paint paint) {
        boolean z = path instanceof AndroidPath;
        android.graphics.Canvas canvas = this.internalCanvas;
        if (!z) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((AndroidPath) path).getInternalPath(), AndroidPaint_androidKt.getNativePaint(paint));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawPoints-O7TthRY, reason: not valid java name */
    public void mo8082drawPointsO7TthRY(int i2, List<Offset> list, Paint paint) {
        if (PointMode.m8573equalsimpl0(i2, PointMode.Companion.m8577getLinesr_lszbg())) {
            drawLines(list, paint, 2);
        } else if (PointMode.m8573equalsimpl0(i2, PointMode.Companion.m8579getPolygonr_lszbg())) {
            drawLines(list, paint, 1);
        } else if (PointMode.m8573equalsimpl0(i2, PointMode.Companion.m8578getPointsr_lszbg())) {
            drawPoints(list, paint);
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawRawPoints-O7TthRY, reason: not valid java name */
    public void mo8083drawRawPointsO7TthRY(int i2, float[] fArr, Paint paint) {
        if ((fArr.length & 1) != 0) {
            throw new IllegalArgumentException("points must have an even number of values");
        }
        if (PointMode.m8573equalsimpl0(i2, PointMode.Companion.m8577getLinesr_lszbg())) {
            drawRawLines(fArr, paint, 2);
        } else if (PointMode.m8573equalsimpl0(i2, PointMode.Companion.m8579getPolygonr_lszbg())) {
            drawRawLines(fArr, paint, 1);
        } else if (PointMode.m8573equalsimpl0(i2, PointMode.Companion.m8578getPointsr_lszbg())) {
            drawRawPoints(fArr, paint, 2);
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRect(float f2, float f3, float f4, float f5, Paint paint) {
        this.internalCanvas.drawRect(f2, f3, f4, f5, AndroidPaint_androidKt.getNativePaint(paint));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRoundRect(float f2, float f3, float f4, float f5, float f6, float f7, Paint paint) {
        this.internalCanvas.drawRoundRect(f2, f3, f4, f5, f6, f7, AndroidPaint_androidKt.getNativePaint(paint));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawVertices-TPEHhCM, reason: not valid java name */
    public void mo8084drawVerticesTPEHhCM(Vertices vertices, int i2, Paint paint) {
        this.internalCanvas.drawVertices(AndroidVertexMode_androidKt.m8132toAndroidVertexModeJOOmi9M(vertices.m8683getVertexModec2xauaI()), vertices.getPositions().length, vertices.getPositions(), 0, vertices.getTextureCoordinates(), 0, vertices.getColors(), 0, vertices.getIndices(), 0, vertices.getIndices().length, AndroidPaint_androidKt.getNativePaint(paint));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void enableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, true);
    }

    public final android.graphics.Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void restore() {
        this.internalCanvas.restore();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void rotate(float f2) {
        this.internalCanvas.rotate(f2);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void save() {
        this.internalCanvas.save();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void saveLayer(androidx.compose.ui.geometry.Rect rect, Paint paint) {
        this.internalCanvas.saveLayer(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), AndroidPaint_androidKt.getNativePaint(paint), 31);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void scale(float f2, float f3) {
        this.internalCanvas.scale(f2, f3);
    }

    public final void setInternalCanvas(android.graphics.Canvas canvas) {
        this.internalCanvas = canvas;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void skew(float f2, float f3) {
        this.internalCanvas.skew(f2, f3);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public /* synthetic */ void skewRad(float f2, float f3) {
        Canvas.CC.$default$skewRad(this, f2, f3);
    }

    /* renamed from: toRegionOp--7u2Bmg, reason: not valid java name */
    public final Region.Op m8085toRegionOp7u2Bmg(int i2) {
        return ClipOp.m8212equalsimpl0(i2, ClipOp.Companion.m8216getDifferencertfAjoo()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void translate(float f2, float f3) {
        this.internalCanvas.translate(f2, f3);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public /* synthetic */ void drawArc(androidx.compose.ui.geometry.Rect rect, float f2, float f3, boolean z, Paint paint) {
        Canvas.CC.$default$drawArc(this, rect, f2, f3, z, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public /* synthetic */ void drawOval(androidx.compose.ui.geometry.Rect rect, Paint paint) {
        Canvas.CC.$default$drawOval(this, rect, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public /* synthetic */ void drawRect(androidx.compose.ui.geometry.Rect rect, Paint paint) {
        Canvas.CC.$default$drawRect(this, rect, paint);
    }

    public static /* synthetic */ void getInternalCanvas$annotations() {
    }
}
