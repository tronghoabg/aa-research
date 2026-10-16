package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class wvn extends defpackage.wvr {
    private final defpackage.wvp a;
    private final float b;
    private final float e;

    public wvn(defpackage.wvp wvpVar, float f, float f2) {
        this.a = wvpVar;
        this.b = f;
        this.e = f2;
    }

    @Override // defpackage.wvr
    public final void a(android.graphics.Matrix matrix, defpackage.wuu wuuVar, int i, android.graphics.Canvas canvas) {
        defpackage.wvp wvpVar = this.a;
        float f = wvpVar.b;
        float f2 = this.e;
        float f3 = wvpVar.a;
        float f4 = this.b;
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, (float) java.lang.Math.hypot(f - f2, f3 - f4), 0.0f);
        android.graphics.Matrix matrix2 = this.d;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = defpackage.wuu.a;
        iArr[0] = wuuVar.j;
        iArr[1] = wuuVar.i;
        iArr[2] = wuuVar.h;
        android.graphics.LinearGradient linearGradient = new android.graphics.LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, iArr, defpackage.wuu.b, android.graphics.Shader.TileMode.CLAMP);
        android.graphics.Paint paint = wuuVar.g;
        paint.setShader(linearGradient);
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    final float b() {
        defpackage.wvp wvpVar = this.a;
        return (float) java.lang.Math.toDegrees(java.lang.Math.atan((wvpVar.b - this.e) / (wvpVar.a - this.b)));
    }
}
