package androidx.compose.ui.graphics;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MeshGradientScope {
    public static final int $stable = 8;
    private final float[] bottomBezierOffsets;
    private final int[] colors;
    private final int columns;
    private final float[] leftBezierOffsets;
    private final int numberOfPoints;
    private final float[] positions;
    private final float[] rightBezierOffsets;
    private final int rows;
    private final float[] topBezierOffsets;

    public MeshGradientScope(int i2, int i3) {
        this.rows = i2;
        this.columns = i3;
        int i4 = (i2 + 1) * (i3 + 1);
        this.numberOfPoints = i4;
        int i5 = i4 + i4;
        this.positions = new float[i5];
        this.colors = new int[i4];
        float[] fArr = new float[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            fArr[i6] = Float.NaN;
        }
        this.leftBezierOffsets = fArr;
        int i7 = this.numberOfPoints;
        int i8 = i7 + i7;
        float[] fArr2 = new float[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            fArr2[i9] = Float.NaN;
        }
        this.rightBezierOffsets = fArr2;
        int i10 = this.numberOfPoints;
        int i11 = i10 + i10;
        float[] fArr3 = new float[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            fArr3[i12] = Float.NaN;
        }
        this.topBezierOffsets = fArr3;
        int i13 = this.numberOfPoints;
        int i14 = i13 + i13;
        float[] fArr4 = new float[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            fArr4[i15] = Float.NaN;
        }
        this.bottomBezierOffsets = fArr4;
    }

    private final void validateIndices(int i2, int i3) {
        if (i2 < 0 || i2 > this.rows) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("row (" + i2 + ") must be in range 0.." + this.rows);
        }
        if (i3 < 0 || i3 > this.columns) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("column (" + i3 + ") must be in range 0.." + this.columns);
        }
    }

    public final float[] getBottomBezierOffsets$ui() {
        return this.bottomBezierOffsets;
    }

    public final int[] getColors$ui() {
        return this.colors;
    }

    public final int getColumns() {
        return this.columns;
    }

    public final float[] getLeftBezierOffsets$ui() {
        return this.leftBezierOffsets;
    }

    public final int getNumberOfPoints$ui() {
        return this.numberOfPoints;
    }

    public final float[] getPositions$ui() {
        return this.positions;
    }

    public final float[] getRightBezierOffsets$ui() {
        return this.rightBezierOffsets;
    }

    public final int getRows() {
        return this.rows;
    }

    public final float[] getTopBezierOffsets$ui() {
        return this.topBezierOffsets;
    }

    /* renamed from: setVertex-6uS4IUQ, reason: not valid java name */
    public final void m8526setVertex6uS4IUQ(int i2, int i3, long j2, long j3, long j4, long j5, long j6, long j7) {
        validateIndices(i2, i3);
        int i4 = ((this.columns + 1) * i2) + i3;
        int i5 = i4 + i4;
        MeshGradientKt.m8521setOffset0AR0LA0(this.positions, i5, j2);
        this.colors[(i2 * (this.columns + 1)) + i3] = ColorKt.m8282toArgb8_81llA(j3);
        MeshGradientKt.m8521setOffset0AR0LA0(this.leftBezierOffsets, i5, j4);
        MeshGradientKt.m8521setOffset0AR0LA0(this.rightBezierOffsets, i5, j6);
        MeshGradientKt.m8521setOffset0AR0LA0(this.topBezierOffsets, i5, j5);
        MeshGradientKt.m8521setOffset0AR0LA0(this.bottomBezierOffsets, i5, j7);
    }
}
