package c8;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import b8.C1519a;
import com.unity3d.services.UnityAdsConstants;

/* renamed from: c8.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1590n extends s {

    /* renamed from: c, reason: collision with root package name */
    public final p f19776c;

    public C1590n(p pVar) {
        this.f19776c = pVar;
    }

    @Override // c8.s
    public final void a(Matrix matrix, C1519a c1519a, int i5, Canvas canvas) {
        p pVar = this.f19776c;
        float f10 = pVar.f19785f;
        float f11 = pVar.f19786g;
        RectF rectF = new RectF(pVar.f19781b, pVar.f19782c, pVar.f19783d, pVar.f19784e);
        c1519a.getClass();
        boolean z2 = f11 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Path path = c1519a.f19409g;
        int[] iArr = C1519a.k;
        if (z2) {
            iArr[0] = 0;
            iArr[1] = c1519a.f19408f;
            iArr[2] = c1519a.f19407e;
            iArr[3] = c1519a.f19406d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f10, f11);
            path.close();
            float f12 = -i5;
            rectF.inset(f12, f12);
            iArr[0] = 0;
            iArr[1] = c1519a.f19406d;
            iArr[2] = c1519a.f19407e;
            iArr[3] = c1519a.f19408f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        float f13 = 1.0f - (i5 / fWidth);
        float[] fArr = C1519a.f19402l;
        fArr[1] = f13;
        fArr[2] = ((1.0f - f13) / 2.0f) + f13;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = c1519a.f19404b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z2) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, c1519a.f19410h);
        }
        canvas.drawArc(rectF, f10, f11, true, paint);
        canvas.restore();
    }
}
