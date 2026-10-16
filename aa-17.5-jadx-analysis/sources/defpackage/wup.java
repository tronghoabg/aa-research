package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
final class wup extends wut {
    private final wur a;
    private final float b;
    private final float e;

    public wup(wur wurVar, float f, float f2) {
        this.a = wurVar;
        this.b = f;
        this.e = f2;
    }

    @Override // defpackage.wut
    public final void a(Matrix matrix, wtv wtvVar, int i, Canvas canvas) {
        wur wurVar = this.a;
        float f = wurVar.b;
        float f2 = this.e;
        float f3 = wurVar.a;
        float f4 = this.b;
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) Math.hypot(f - f2, f3 - f4), BitmapDescriptorFactory.HUE_RED);
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        rectF.bottom += i;
        rectF.offset(BitmapDescriptorFactory.HUE_RED, -i);
        int[] iArr = wtv.a;
        iArr[0] = wtvVar.j;
        iArr[1] = wtvVar.i;
        iArr[2] = wtvVar.h;
        LinearGradient linearGradient = new LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, iArr, wtv.b, Shader.TileMode.CLAMP);
        Paint paint = wtvVar.g;
        paint.setShader(linearGradient);
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    final float b() {
        wur wurVar = this.a;
        return (float) Math.toDegrees(Math.atan((wurVar.b - this.e) / (wurVar.a - this.b)));
    }
}
