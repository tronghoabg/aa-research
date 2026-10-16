package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dgo extends android.graphics.Canvas {
    public android.graphics.Canvas a;

    private final android.graphics.Canvas a() {
        android.graphics.Canvas canvas = this.a;
        if (canvas != null) {
            return canvas;
        }
        defpackage.dki.b("Text drawing wrapper is missing a Canvas!");
        throw new defpackage.afap();
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(android.graphics.Path path) {
        return ep$.ExternalSyntheticApiModelOutline1.m(a(), path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f, float f2, float f3, float f4) {
        return ep$.ExternalSyntheticApiModelOutline1.m(a(), f, f2, f3, f4);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(android.graphics.Path path) {
        return a().clipPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f, float f2, float f3, float f4) {
        return a().clipRect(f, f2, f3, f4);
    }

    @Override // android.graphics.Canvas
    public final void concat(android.graphics.Matrix matrix) {
        a().concat(matrix);
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        alh$.ExternalSyntheticApiModelOutline0.m$1(a());
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i, int i2, int i3, int i4) {
        a().drawARGB(i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, android.graphics.Paint paint) {
        a().drawArc(f, f2, f3, f4, f5, f6, z, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(android.graphics.Bitmap bitmap, float f, float f2, android.graphics.Paint paint) {
        a().drawBitmap(bitmap, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(android.graphics.Bitmap bitmap, int i, int i2, float[] fArr, int i3, int[] iArr, int i4, android.graphics.Paint paint) {
        a().drawBitmapMesh(bitmap, i, i2, fArr, i3, iArr, i4, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f, float f2, float f3, android.graphics.Paint paint) {
        a().drawCircle(f, f2, f3, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i) {
        a().drawColor(i);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(android.graphics.RectF rectF, float f, float f2, android.graphics.RectF rectF2, float f3, float f4, android.graphics.Paint paint) {
        alh$.ExternalSyntheticApiModelOutline0.m(a(), rectF, f, f2, rectF2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i, float[] fArr, int i2, int i3, android.graphics.fonts.Font font, android.graphics.Paint paint) {
        a$.ExternalSyntheticApiModelOutline0.m(a(), iArr, i, fArr, i2, i3, font, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f, float f2, float f3, float f4, android.graphics.Paint paint) {
        a().drawLine(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i, int i2, android.graphics.Paint paint) {
        a().drawLines(fArr, i, i2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f, float f2, float f3, float f4, android.graphics.Paint paint) {
        a().drawOval(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(android.graphics.Paint paint) {
        a().drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(android.graphics.NinePatch ninePatch, android.graphics.Rect rect, android.graphics.Paint paint) {
        a$.ExternalSyntheticApiModelOutline0.m(a(), ninePatch, rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPath(android.graphics.Path path, android.graphics.Paint paint) {
        a().drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(android.graphics.Picture picture) {
        a().drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f, float f2, android.graphics.Paint paint) {
        a().drawPoint(f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i, int i2, android.graphics.Paint paint) {
        a().drawPoints(fArr, i, i2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(java.lang.String str, float[] fArr, android.graphics.Paint paint) {
        a().drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i, int i2, int i3) {
        a().drawRGB(i, i2, i3);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f, float f2, float f3, float f4, android.graphics.Paint paint) {
        a().drawRect(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(android.graphics.RenderNode renderNode) {
        alh$.ExternalSyntheticApiModelOutline0.m(a(), renderNode);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, android.graphics.Paint paint) {
        a().drawRoundRect(f, f2, f3, f4, f5, f6, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(java.lang.CharSequence charSequence, int i, int i2, float f, float f2, android.graphics.Paint paint) {
        a().drawText(charSequence, i, i2, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(java.lang.String str, android.graphics.Path path, float f, float f2, android.graphics.Paint paint) {
        a().drawTextOnPath(str, path, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(android.graphics.text.MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, android.graphics.Paint paint) {
        alh$.ExternalSyntheticApiModelOutline0.m(a(), measuredText, i, i2, i3, i4, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(android.graphics.Canvas.VertexMode vertexMode, int i, float[] fArr, int i2, float[] fArr2, int i3, int[] iArr, int i4, short[] sArr, int i5, int i6, android.graphics.Paint paint) {
        a().drawVertices(vertexMode, i, fArr, i2, fArr2, i3, iArr, i4, sArr, i5, i6, paint);
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        alh$.ExternalSyntheticApiModelOutline0.m(a());
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(android.graphics.Rect rect) {
        boolean clipBounds = a().getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        return a().getDensity();
    }

    @Override // android.graphics.Canvas
    public final android.graphics.DrawFilter getDrawFilter() {
        return a().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        return a().getHeight();
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(android.graphics.Matrix matrix) {
        a().getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        return a().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        return a().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        return a().getSaveCount();
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        return a().getWidth();
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        return a().isOpaque();
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f, float f2, float f3, float f4) {
        return bgp$.ExternalSyntheticApiModelOutline0.m(a(), f, f2, f3, f4);
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        a().restore();
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i) {
        a().restoreToCount(i);
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f) {
        a().rotate(f);
    }

    @Override // android.graphics.Canvas
    public final int save() {
        return a().save();
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f, float f2, float f3, float f4, android.graphics.Paint paint) {
        return a().saveLayer(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i) {
        return a().saveLayerAlpha(f, f2, f3, f4, i);
    }

    @Override // android.graphics.Canvas
    public final void scale(float f, float f2) {
        a().scale(f, f2);
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(android.graphics.Bitmap bitmap) {
        a().setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i) {
        a().setDensity(i);
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(android.graphics.DrawFilter drawFilter) {
        a().setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(android.graphics.Matrix matrix) {
        a().setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final void skew(float f, float f2) {
        a().skew(f, f2);
    }

    @Override // android.graphics.Canvas
    public final void translate(float f, float f2) {
        a().translate(f, f2);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(android.graphics.RectF rectF, float f, float f2, boolean z, android.graphics.Paint paint) {
        a().drawArc(rectF, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(android.graphics.Bitmap bitmap, android.graphics.Matrix matrix, android.graphics.Paint paint) {
        a().drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, android.graphics.BlendMode blendMode) {
        alh$.ExternalSyntheticApiModelOutline0.m(a(), i, blendMode);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(android.graphics.RectF rectF, float[] fArr, android.graphics.RectF rectF2, float[] fArr2, android.graphics.Paint paint) {
        alh$.ExternalSyntheticApiModelOutline0.m(a(), rectF, fArr, rectF2, fArr2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, android.graphics.Paint paint) {
        a().drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(android.graphics.RectF rectF, android.graphics.Paint paint) {
        a().drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(android.graphics.NinePatch ninePatch, android.graphics.RectF rectF, android.graphics.Paint paint) {
        a$.ExternalSyntheticApiModelOutline0.m(a(), ninePatch, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(android.graphics.Picture picture, android.graphics.Rect rect) {
        a().drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, android.graphics.Paint paint) {
        a().drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i, int i2, float[] fArr, android.graphics.Paint paint) {
        a().drawPosText(cArr, i, i2, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(android.graphics.Rect rect, android.graphics.Paint paint) {
        a().drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(android.graphics.RectF rectF, float f, float f2, android.graphics.Paint paint) {
        a().drawRoundRect(rectF, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(java.lang.String str, float f, float f2, android.graphics.Paint paint) {
        a().drawText(str, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i, int i2, android.graphics.Path path, float f, float f2, android.graphics.Paint paint) {
        a().drawTextOnPath(cArr, i, i2, path, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(java.lang.CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, android.graphics.Paint paint) {
        a().drawTextRun(charSequence, i, i2, i3, i4, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i, int i2, int i3, int i4) {
        return ep$.ExternalSyntheticApiModelOutline1.m(a(), i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(android.graphics.Path path, android.graphics.Region.Op op) {
        return a().clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f, float f2, float f3, float f4, android.graphics.Region.Op op) {
        return a().clipRect(f, f2, f3, f4, op);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(android.graphics.Bitmap bitmap, android.graphics.Rect rect, android.graphics.Rect rect2, android.graphics.Paint paint) {
        a().drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(android.graphics.Picture picture, android.graphics.RectF rectF) {
        a().drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(android.graphics.RectF rectF, android.graphics.Paint paint) {
        a().drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(java.lang.String str, int i, int i2, float f, float f2, android.graphics.Paint paint) {
        a().drawText(str, i, i2, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f, float f2, float f3, float f4, android.graphics.Canvas.EdgeType edgeType) {
        return a().quickReject(f, f2, f3, f4, edgeType);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f, float f2, float f3, float f4, android.graphics.Paint paint, int i) {
        return a().saveLayer(f, f2, f3, f4, paint, i);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i, int i2) {
        return a().saveLayerAlpha(f, f2, f3, f4, i, i2);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i, int i2, int i3, int i4) {
        return a().clipRect(i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(android.graphics.Bitmap bitmap, android.graphics.Rect rect, android.graphics.RectF rectF, android.graphics.Paint paint) {
        a().drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, android.graphics.PorterDuff.Mode mode) {
        a().drawColor(i, mode);
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i, int i2, float f, float f2, android.graphics.Paint paint) {
        a().drawText(cArr, i, i2, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, android.graphics.Paint paint) {
        a().drawTextRun(cArr, i, i2, i3, i4, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(android.graphics.Path path) {
        return bgp$.ExternalSyntheticApiModelOutline0.m(a(), path);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(android.graphics.RectF rectF, android.graphics.Paint paint) {
        return a().saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(android.graphics.RectF rectF, int i) {
        return a().saveLayerAlpha(rectF, i);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(android.graphics.Rect rect) {
        return ep$.ExternalSyntheticApiModelOutline1.m(a(), rect);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(android.graphics.Rect rect) {
        return a().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i2, float f, float f2, int i3, int i4, boolean z, android.graphics.Paint paint) {
        a().drawBitmap(iArr, i, i2, f, f2, i3, i4, z, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j) {
        alh$.ExternalSyntheticApiModelOutline0.m(a(), j);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(android.graphics.RectF rectF, android.graphics.Paint paint, int i) {
        return a().saveLayer(rectF, paint, i);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(android.graphics.RectF rectF, int i, int i2) {
        return a().saveLayerAlpha(rectF, i, i2);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(android.graphics.Rect rect, android.graphics.Region.Op op) {
        return a().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z, android.graphics.Paint paint) {
        a().drawBitmap(iArr, i, i2, i3, i4, i5, i6, z, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(android.graphics.Path path, android.graphics.Canvas.EdgeType edgeType) {
        return a().quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(android.graphics.RectF rectF) {
        return ep$.ExternalSyntheticApiModelOutline1.m(a(), rectF);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(android.graphics.RectF rectF) {
        return a().clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j, android.graphics.BlendMode blendMode) {
        alh$.ExternalSyntheticApiModelOutline0.m(a(), j, blendMode);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(android.graphics.RectF rectF) {
        return bgp$.ExternalSyntheticApiModelOutline0.m(a(), rectF);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(android.graphics.RectF rectF, android.graphics.Region.Op op) {
        return a().clipRect(rectF, op);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(android.graphics.RectF rectF, android.graphics.Canvas.EdgeType edgeType) {
        return a().quickReject(rectF, edgeType);
    }
}
