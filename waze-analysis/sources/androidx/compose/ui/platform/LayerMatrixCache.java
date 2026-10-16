package androidx.compose.ui.platform;

import android.graphics.Matrix;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.MatrixKt;
import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LayerMatrixCache<T> {
    public static final int $stable = 8;
    private Matrix androidMatrixCache;
    private final p<T, Matrix, ab> getMatrix;
    private boolean isDirty;
    private boolean isInverseDirty;
    private float[] matrixCache = androidx.compose.ui.graphics.Matrix.m8492constructorimpl$default(null, 1, null);
    private float[] inverseMatrixCache = androidx.compose.ui.graphics.Matrix.m8492constructorimpl$default(null, 1, null);
    private boolean isInverseValid = true;
    private boolean isIdentity = true;

    /* JADX WARN: Multi-variable type inference failed */
    public LayerMatrixCache(p<? super T, ? super Matrix, ab> pVar) {
        this.getMatrix = pVar;
    }

    /* renamed from: calculateInverseMatrix-bWbORWo, reason: not valid java name */
    public final float[] m10254calculateInverseMatrixbWbORWo(T t) {
        float[] fArr = this.inverseMatrixCache;
        if (this.isInverseDirty) {
            this.isInverseValid = InvertMatrixKt.m10252invertToJiSxe2E(m10255calculateMatrixGrdbGEg(t), fArr);
            this.isInverseDirty = false;
        }
        if (this.isInverseValid) {
            return fArr;
        }
        return null;
    }

    /* renamed from: calculateMatrix-GrdbGEg, reason: not valid java name */
    public final float[] m10255calculateMatrixGrdbGEg(T t) {
        float[] fArr = this.matrixCache;
        if (!this.isDirty) {
            return fArr;
        }
        Matrix matrix = this.androidMatrixCache;
        if (matrix == null) {
            matrix = new Matrix();
            this.androidMatrixCache = matrix;
        }
        this.getMatrix.invoke(t, matrix);
        AndroidMatrixConversions_androidKt.m8096setFromtUYjHk(fArr, matrix);
        this.isDirty = false;
        this.isIdentity = MatrixKt.m8517isIdentity58bKbWc(fArr);
        return fArr;
    }

    public final void invalidate() {
        this.isDirty = true;
        this.isInverseDirty = true;
    }

    public final void map(T t, MutableRect mutableRect) {
        float[] fArrM10255calculateMatrixGrdbGEg = m10255calculateMatrixGrdbGEg(t);
        if (this.isIdentity) {
            return;
        }
        androidx.compose.ui.graphics.Matrix.m8500mapimpl(fArrM10255calculateMatrixGrdbGEg, mutableRect);
    }

    /* renamed from: map-R5De75A, reason: not valid java name */
    public final long m10256mapR5De75A(T t, long j2) {
        return !this.isIdentity ? androidx.compose.ui.graphics.Matrix.m8498mapMKHz9U(m10255calculateMatrixGrdbGEg(t), j2) : j2;
    }

    public final void mapInverse(T t, MutableRect mutableRect) {
        float[] fArrM10254calculateInverseMatrixbWbORWo = m10254calculateInverseMatrixbWbORWo(t);
        if (fArrM10254calculateInverseMatrixbWbORWo == null) {
            mutableRect.set(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            if (this.isIdentity) {
                return;
            }
            androidx.compose.ui.graphics.Matrix.m8500mapimpl(fArrM10254calculateInverseMatrixbWbORWo, mutableRect);
        }
    }

    /* renamed from: mapInverse-R5De75A, reason: not valid java name */
    public final long m10257mapInverseR5De75A(T t, long j2) {
        float[] fArrM10254calculateInverseMatrixbWbORWo = m10254calculateInverseMatrixbWbORWo(t);
        return fArrM10254calculateInverseMatrixbWbORWo == null ? Offset.Companion.m7994getInfiniteF1C5BW0() : this.isIdentity ? j2 : androidx.compose.ui.graphics.Matrix.m8498mapMKHz9U(fArrM10254calculateInverseMatrixbWbORWo, j2);
    }

    public final void reset() {
        this.isDirty = false;
        this.isInverseDirty = false;
        this.isIdentity = true;
        this.isInverseValid = true;
        androidx.compose.ui.graphics.Matrix.m8501resetimpl(this.matrixCache);
        androidx.compose.ui.graphics.Matrix.m8501resetimpl(this.inverseMatrixCache);
    }
}
