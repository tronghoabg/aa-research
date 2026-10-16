package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import com.carstream.tech.car.CarScreen;
import com.carstream.tech.core.ui.SplashArt;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class f6 extends View {
    public final Paint a;
    public final Path b;

    public f6(CarScreen carScreen) {
        super(carScreen);
        this.a = new Paint(1);
        this.b = new Path();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        float fMin = Math.min(width, height) / 2.0f;
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.a;
        paint.setStyle(style);
        paint.setColor(SplashArt.M);
        float f = width / 2.0f;
        float f2 = height / 2.0f;
        canvas.drawCircle(f, f2, fMin, paint);
        Path path = this.b;
        path.reset();
        float f3 = f - (0.28f * fMin);
        float f4 = 0.42f * fMin;
        path.moveTo(f3, f2 - f4);
        path.lineTo((fMin * 0.46f) + f, f2);
        path.lineTo(f3, f2 + f4);
        path.close();
        paint.setColor(SplashArt.L);
        canvas.drawPath(path, paint);
    }
}
