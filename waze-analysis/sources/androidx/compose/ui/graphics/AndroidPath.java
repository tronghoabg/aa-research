package androidx.compose.ui.graphics;

import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathIterator;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidPath implements Path {
    public static final int $stable = 8;
    private final android.graphics.Path internalPath;
    private android.graphics.Matrix mMatrix;
    private float[] radii;
    private RectF rectF;

    public /* synthetic */ AndroidPath(android.graphics.Path path, int i2, o oVar) {
        this((i2 & 1) != 0 ? new android.graphics.Path() : path);
    }

    private final void validateRectangle(Rect rect) {
        if (Float.isNaN(rect.getLeft()) || Float.isNaN(rect.getTop()) || Float.isNaN(rect.getRight()) || Float.isNaN(rect.getBottom())) {
            AndroidPath_androidKt.throwIllegalStateException("Invalid rectangle, make sure no value is NaN");
        }
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addArc(Rect rect, float f2, float f3) {
        validateRectangle(rect);
        RectF rectF = this.rectF;
        if (rectF == null) {
            rectF = new RectF();
            this.rectF = rectF;
        }
        if (rectF == null) {
            x.g();
        }
        rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        if (rectF2 == null) {
            x.g();
        }
        path.addArc(rectF2, f2, f3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addArcRad(Rect rect, float f2, float f3) {
        addArc(rect, DegreesKt.degrees(f2), DegreesKt.degrees(f3));
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addOval(Rect rect, Path.Direction direction) {
        RectF rectF = this.rectF;
        if (rectF == null) {
            rectF = new RectF();
            this.rectF = rectF;
        }
        if (rectF == null) {
            x.g();
        }
        rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        if (rectF2 == null) {
            x.g();
        }
        path.addOval(rectF2, AndroidPath_androidKt.toPlatformPathDirection(direction));
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: addPath-Uv8p0NA, reason: not valid java name */
    public void mo8115addPathUv8p0NA(Path path, long j2) {
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.internalPath.addPath(((AndroidPath) path).getInternalPath(), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addRect(Rect rect, Path.Direction direction) {
        validateRectangle(rect);
        RectF rectF = this.rectF;
        if (rectF == null) {
            rectF = new RectF();
            this.rectF = rectF;
        }
        if (rectF == null) {
            x.g();
        }
        rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        if (rectF2 == null) {
            x.g();
        }
        path.addRect(rectF2, AndroidPath_androidKt.toPlatformPathDirection(direction));
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addRoundRect(RoundRect roundRect, Path.Direction direction) {
        RectF rectF = this.rectF;
        if (rectF == null) {
            rectF = new RectF();
            this.rectF = rectF;
        }
        if (rectF == null) {
            x.g();
        }
        rectF.set(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
        float[] fArr = this.radii;
        if (fArr == null) {
            fArr = new float[8];
            this.radii = fArr;
        }
        if (fArr == null) {
            x.g();
        }
        fArr[0] = Float.intBitsToFloat((int) (roundRect.m8030getTopLeftCornerRadiuskKHJgLs() >> 32));
        fArr[1] = Float.intBitsToFloat((int) (roundRect.m8030getTopLeftCornerRadiuskKHJgLs() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        fArr[2] = Float.intBitsToFloat((int) (roundRect.m8031getTopRightCornerRadiuskKHJgLs() >> 32));
        fArr[3] = Float.intBitsToFloat((int) (roundRect.m8031getTopRightCornerRadiuskKHJgLs() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        fArr[4] = Float.intBitsToFloat((int) (roundRect.m8029getBottomRightCornerRadiuskKHJgLs() >> 32));
        fArr[5] = Float.intBitsToFloat((int) (roundRect.m8029getBottomRightCornerRadiuskKHJgLs() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        fArr[6] = Float.intBitsToFloat((int) (roundRect.m8028getBottomLeftCornerRadiuskKHJgLs() >> 32));
        fArr[7] = Float.intBitsToFloat((int) (roundRect.m8028getBottomLeftCornerRadiuskKHJgLs() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        if (rectF2 == null) {
            x.g();
        }
        float[] fArr2 = this.radii;
        if (fArr2 == null) {
            x.g();
        }
        path.addRoundRect(rectF2, fArr2, AndroidPath_androidKt.toPlatformPathDirection(direction));
    }

    @Override // androidx.compose.ui.graphics.Path
    public /* synthetic */ Path and(Path path) {
        return Path.CC.$default$and(this, path);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void arcTo(Rect rect, float f2, float f3, boolean z) {
        float left = rect.getLeft();
        float top = rect.getTop();
        float right = rect.getRight();
        float bottom = rect.getBottom();
        RectF rectF = this.rectF;
        if (rectF == null) {
            rectF = new RectF();
            this.rectF = rectF;
        }
        if (rectF == null) {
            x.g();
        }
        rectF.set(left, top, right, bottom);
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        if (rectF2 == null) {
            x.g();
        }
        path.arcTo(rectF2, f2, f3, z);
    }

    @Override // androidx.compose.ui.graphics.Path
    public /* synthetic */ void arcToRad(Rect rect, float f2, float f3, boolean z) {
        Path.CC.$default$arcToRad(this, rect, f2, f3, z);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void close() {
        this.internalPath.close();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void cubicTo(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.internalPath.cubicTo(f2, f3, f4, f5, f6, f7);
    }

    @Override // androidx.compose.ui.graphics.Path
    public Rect getBounds() {
        RectF rectF = this.rectF;
        if (rectF == null) {
            rectF = new RectF();
            this.rectF = rectF;
        }
        if (rectF == null) {
            x.g();
        }
        this.internalPath.computeBounds(rectF, true);
        return new Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: getFillType-Rg-k1Os, reason: not valid java name */
    public int mo8116getFillTypeRgk1Os() {
        return this.internalPath.getFillType() == Path.FillType.EVEN_ODD ? PathFillType.Companion.m8554getEvenOddRgk1Os() : PathFillType.Companion.m8555getNonZeroRgk1Os();
    }

    public final android.graphics.Path getInternalPath() {
        return this.internalPath;
    }

    @Override // androidx.compose.ui.graphics.Path
    public boolean isConvex() {
        return this.internalPath.isConvex();
    }

    @Override // androidx.compose.ui.graphics.Path
    public boolean isEmpty() {
        return this.internalPath.isEmpty();
    }

    @Override // androidx.compose.ui.graphics.Path
    public /* synthetic */ PathIterator iterator() {
        return Path.CC.$default$iterator(this);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void lineTo(float f2, float f3) {
        this.internalPath.lineTo(f2, f3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public /* synthetic */ Path minus(Path path) {
        return Path.CC.$default$minus(this, path);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void moveTo(float f2, float f3) {
        this.internalPath.moveTo(f2, f3);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: op-N5in7k0, reason: not valid java name */
    public boolean mo8117opN5in7k0(Path path, Path path2, int i2) {
        Path.Op op = PathOperation.m8560equalsimpl0(i2, PathOperation.Companion.m8564getDifferenceb3I0S0c()) ? Path.Op.DIFFERENCE : PathOperation.m8560equalsimpl0(i2, PathOperation.Companion.m8565getIntersectb3I0S0c()) ? Path.Op.INTERSECT : PathOperation.m8560equalsimpl0(i2, PathOperation.Companion.m8566getReverseDifferenceb3I0S0c()) ? Path.Op.REVERSE_DIFFERENCE : PathOperation.m8560equalsimpl0(i2, PathOperation.Companion.m8567getUnionb3I0S0c()) ? Path.Op.UNION : Path.Op.XOR;
        android.graphics.Path path3 = this.internalPath;
        if (path instanceof AndroidPath) {
            android.graphics.Path internalPath = ((AndroidPath) path).getInternalPath();
            if (path2 instanceof AndroidPath) {
                return path3.op(internalPath, ((AndroidPath) path2).getInternalPath(), op);
            }
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.Path
    public /* synthetic */ Path or(Path path) {
        return plus(path);
    }

    @Override // androidx.compose.ui.graphics.Path
    public /* synthetic */ Path plus(Path path) {
        return Path.CC.$default$plus(this, path);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void quadraticBezierTo(float f2, float f3, float f4, float f5) {
        this.internalPath.quadTo(f2, f3, f4, f5);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void quadraticTo(float f2, float f3, float f4, float f5) {
        this.internalPath.quadTo(f2, f3, f4, f5);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeCubicTo(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.internalPath.rCubicTo(f2, f3, f4, f5, f6, f7);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeLineTo(float f2, float f3) {
        this.internalPath.rLineTo(f2, f3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeMoveTo(float f2, float f3) {
        this.internalPath.rMoveTo(f2, f3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeQuadraticBezierTo(float f2, float f3, float f4, float f5) {
        this.internalPath.rQuadTo(f2, f3, f4, f5);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeQuadraticTo(float f2, float f3, float f4, float f5) {
        this.internalPath.rQuadTo(f2, f3, f4, f5);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void reset() {
        this.internalPath.reset();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void rewind() {
        this.internalPath.rewind();
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: setFillType-oQ8Xj4U, reason: not valid java name */
    public void mo8118setFillTypeoQ8Xj4U(int i2) {
        this.internalPath.setFillType(PathFillType.m8550equalsimpl0(i2, PathFillType.Companion.m8554getEvenOddRgk1Os()) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: transform-58bKbWc, reason: not valid java name */
    public void mo8119transform58bKbWc(float[] fArr) {
        android.graphics.Matrix matrix = this.mMatrix;
        if (matrix == null) {
            matrix = new android.graphics.Matrix();
            this.mMatrix = matrix;
        }
        if (matrix == null) {
            x.g();
        }
        AndroidMatrixConversions_androidKt.m8095setFromEL8BTi8(matrix, fArr);
        android.graphics.Path path = this.internalPath;
        android.graphics.Matrix matrix2 = this.mMatrix;
        if (matrix2 == null) {
            x.g();
        }
        path.transform(matrix2);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: translate-k-4lQ0M, reason: not valid java name */
    public void mo8120translatek4lQ0M(long j2) {
        android.graphics.Matrix matrix = this.mMatrix;
        if (matrix == null) {
            this.mMatrix = new android.graphics.Matrix();
        } else {
            matrix.reset();
        }
        android.graphics.Matrix matrix2 = this.mMatrix;
        if (matrix2 == null) {
            x.g();
        }
        matrix2.setTranslate(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
        android.graphics.Path path = this.internalPath;
        android.graphics.Matrix matrix3 = this.mMatrix;
        if (matrix3 == null) {
            x.g();
        }
        path.transform(matrix3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public /* synthetic */ Path xor(Path path) {
        return Path.CC.$default$xor(this, path);
    }

    @Override // androidx.compose.ui.graphics.Path
    public /* synthetic */ PathIterator iterator(PathIterator.ConicEvaluation conicEvaluation, float f2) {
        return AndroidPathIterator_androidKt.PathIterator(this, conicEvaluation, f2);
    }

    public AndroidPath(android.graphics.Path path) {
        this.internalPath = path;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidPath() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void isConvex$annotations() {
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addOval(Rect rect) {
        addOval(rect, Path.Direction.CounterClockwise);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addRect(Rect rect) {
        addRect(rect, Path.Direction.CounterClockwise);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addRoundRect(RoundRect roundRect) {
        addRoundRect(roundRect, Path.Direction.CounterClockwise);
    }
}
