package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class wvm extends defpackage.wvr {
    private final defpackage.wvo a;

    public wvm(defpackage.wvo wvoVar) {
        this.a = wvoVar;
    }

    @Override // defpackage.wvr
    public final void a(android.graphics.Matrix matrix, defpackage.wuu wuuVar, int i, android.graphics.Canvas canvas) {
        defpackage.wvo wvoVar = this.a;
        float f = wvoVar.e;
        float f2 = wvoVar.f;
        android.graphics.RectF rectF = new android.graphics.RectF(wvoVar.a, wvoVar.b, wvoVar.c, wvoVar.d);
        boolean z = f2 < com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        android.graphics.Path path = wuuVar.k;
        if (z) {
            int[] iArr = defpackage.wuu.c;
            iArr[0] = 0;
            iArr[1] = wuuVar.j;
            iArr[2] = wuuVar.i;
            iArr[3] = wuuVar.h;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = defpackage.wuu.c;
            iArr2[0] = 0;
            iArr2[1] = wuuVar.h;
            iArr2[2] = wuuVar.i;
            iArr2[3] = wuuVar.j;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = defpackage.wuu.d;
        fArr[1] = f4;
        fArr[2] = f4 + ((1.0f - f4) / 2.0f);
        android.graphics.RadialGradient radialGradient = new android.graphics.RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, defpackage.wuu.c, fArr, android.graphics.Shader.TileMode.CLAMP);
        android.graphics.Paint paint = wuuVar.f;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, android.graphics.Region.Op.DIFFERENCE);
            canvas.drawPath(path, wuuVar.l);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
