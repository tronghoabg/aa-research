package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
final class wuo extends wut {
    private final wuq a;

    public wuo(wuq wuqVar) {
        this.a = wuqVar;
    }

    @Override // defpackage.wut
    public final void a(Matrix matrix, wtv wtvVar, int i, Canvas canvas) {
        wuq wuqVar = this.a;
        float f = wuqVar.e;
        float f2 = wuqVar.f;
        RectF rectF = new RectF(wuqVar.a, wuqVar.b, wuqVar.c, wuqVar.d);
        boolean z = f2 < BitmapDescriptorFactory.HUE_RED;
        Path path = wtvVar.k;
        if (z) {
            int[] iArr = wtv.c;
            iArr[0] = 0;
            iArr[1] = wtvVar.j;
            iArr[2] = wtvVar.i;
            iArr[3] = wtvVar.h;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = wtv.c;
            iArr2[0] = 0;
            iArr2[1] = wtvVar.h;
            iArr2[2] = wtvVar.i;
            iArr2[3] = wtvVar.j;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = wtv.d;
        fArr[1] = f4;
        fArr[2] = f4 + ((1.0f - f4) / 2.0f);
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, wtv.c, fArr, Shader.TileMode.CLAMP);
        Paint paint = wtvVar.f;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, wtvVar.l);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
