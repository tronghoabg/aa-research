package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;

/* loaded from: classes2.dex */
final class ffc extends Matrix {
    static final void a() {
        throw new IllegalStateException("Matrix can not be modified");
    }

    @Override // android.graphics.Matrix
    public final boolean postConcat(Matrix matrix) {
        a();
        return false;
    }

    @Override // android.graphics.Matrix
    public final boolean postRotate(float f) {
        a();
        return false;
    }

    @Override // android.graphics.Matrix
    public final boolean postScale(float f, float f2) {
        a();
        return false;
    }

    @Override // android.graphics.Matrix
    public final boolean postSkew(float f, float f2) {
        a();
        return false;
    }

    @Override // android.graphics.Matrix
    public final boolean postTranslate(float f, float f2) {
        a();
        return false;
    }

    @Override // android.graphics.Matrix
    public final boolean preConcat(Matrix matrix) {
        a();
        return false;
    }

    @Override // android.graphics.Matrix
    public final boolean preRotate(float f) {
        a();
        return false;
    }

    @Override // android.graphics.Matrix
    public final boolean preScale(float f, float f2) {
        a();
        return false;
    }

    @Override // android.graphics.Matrix
    public final boolean preSkew(float f, float f2) {
        a();
        return false;
    }

    @Override // android.graphics.Matrix
    public final boolean preTranslate(float f, float f2) {
        a();
        return false;
    }

    @Override // android.graphics.Matrix
    public final void reset() {
        a();
    }

    @Override // android.graphics.Matrix
    public final void set(Matrix matrix) {
        a();
    }

    @Override // android.graphics.Matrix
    public final boolean setConcat(Matrix matrix, Matrix matrix2) {
        a();
        return false;
    }

    @Override // android.graphics.Matrix
    public final boolean setPolyToPoly(float[] fArr, int i, float[] fArr2, int i2, int i3) {
        a();
        return false;
    }

    @Override // android.graphics.Matrix
    public final boolean setRectToRect(RectF rectF, RectF rectF2, Matrix.ScaleToFit scaleToFit) {
        a();
        return false;
    }

    @Override // android.graphics.Matrix
    public final void setRotate(float f) {
        a();
    }

    @Override // android.graphics.Matrix
    public final void setScale(float f, float f2) {
        a();
    }

    @Override // android.graphics.Matrix
    public final void setSinCos(float f, float f2) {
        a();
    }

    @Override // android.graphics.Matrix
    public final void setSkew(float f, float f2) {
        a();
    }

    @Override // android.graphics.Matrix
    public final void setTranslate(float f, float f2) {
        a();
    }

    @Override // android.graphics.Matrix
    public final void setValues(float[] fArr) {
        a();
    }

    @Override // android.graphics.Matrix
    public final void setRotate(float f, float f2, float f3) {
        a();
    }

    @Override // android.graphics.Matrix
    public final void setScale(float f, float f2, float f3, float f4) {
        a();
    }

    @Override // android.graphics.Matrix
    public final void setSinCos(float f, float f2, float f3, float f4) {
        a();
    }

    @Override // android.graphics.Matrix
    public final void setSkew(float f, float f2, float f3, float f4) {
        a();
    }

    @Override // android.graphics.Matrix
    public final boolean postRotate(float f, float f2, float f3) {
        a();
        return false;
    }

    @Override // android.graphics.Matrix
    public final boolean postScale(float f, float f2, float f3, float f4) {
        a();
        return false;
    }

    @Override // android.graphics.Matrix
    public final boolean postSkew(float f, float f2, float f3, float f4) {
        a();
        return false;
    }

    @Override // android.graphics.Matrix
    public final boolean preRotate(float f, float f2, float f3) {
        a();
        return false;
    }

    @Override // android.graphics.Matrix
    public final boolean preScale(float f, float f2, float f3, float f4) {
        a();
        return false;
    }

    @Override // android.graphics.Matrix
    public final boolean preSkew(float f, float f2, float f3, float f4) {
        a();
        return false;
    }
}
