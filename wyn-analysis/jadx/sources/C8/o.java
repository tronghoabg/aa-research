package c8;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import b8.C1519a;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes4.dex */
public final class o extends s {

    /* renamed from: c, reason: collision with root package name */
    public final q f19777c;

    /* renamed from: d, reason: collision with root package name */
    public final float f19778d;

    /* renamed from: e, reason: collision with root package name */
    public final float f19779e;

    public o(q qVar, float f10, float f11) {
        this.f19777c = qVar;
        this.f19778d = f10;
        this.f19779e = f11;
    }

    @Override // c8.s
    public final void a(Matrix matrix, C1519a c1519a, int i5, Canvas canvas) {
        q qVar = this.f19777c;
        float f10 = qVar.f19788c;
        float f11 = this.f19779e;
        float f12 = qVar.f19787b;
        float f13 = this.f19778d;
        RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (float) Math.hypot(f10 - f11, f12 - f13), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Matrix matrix2 = this.f19791a;
        matrix2.set(matrix);
        matrix2.preTranslate(f13, f11);
        matrix2.preRotate(b());
        c1519a.getClass();
        rectF.bottom += i5;
        rectF.offset(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -i5);
        int[] iArr = C1519a.f19400i;
        iArr[0] = c1519a.f19408f;
        iArr[1] = c1519a.f19407e;
        iArr[2] = c1519a.f19406d;
        Paint paint = c1519a.f19405c;
        float f14 = rectF.left;
        paint.setShader(new LinearGradient(f14, rectF.top, f14, rectF.bottom, iArr, C1519a.f19401j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        q qVar = this.f19777c;
        return (float) Math.toDegrees(Math.atan((qVar.f19788c - this.f19779e) / (qVar.f19787b - this.f19778d)));
    }
}
