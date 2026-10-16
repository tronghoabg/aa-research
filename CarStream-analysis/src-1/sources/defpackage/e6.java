package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import androidx.core.graphics.PathParser;
import com.carstream.tech.car.CarScreen;
import com.carstream.tech.core.ui.SplashArt;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class e6 extends View {
    public final Paint a;
    public final Path b;
    public final Path c;

    public e6(CarScreen carScreen) {
        super(carScreen);
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = PathParser.createPathFromPathData("M8,2 h8 a3,3 0 0 1 3,3 v14 a3,3 0 0 1 -3,3 h-8 a3,3 0 0 1 -3,-3 v-14 a3,3 0 0 1 3,-3 Z");
        this.c = PathParser.createPathFromPathData("M10.5,18.5 h3");
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(SplashArt.N);
        paint.setStrokeWidth(2.0f);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float fMin = Math.min(getWidth(), getHeight());
        if (fMin <= 0.0f) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate((getWidth() - fMin) / 2.0f, (getHeight() - fMin) / 2.0f);
        float f = fMin / 24.0f;
        canvas.scale(f, f);
        Path path = this.b;
        Paint paint = this.a;
        canvas.drawPath(path, paint);
        canvas.drawPath(this.c, paint);
        canvas.restoreToCount(iSave);
    }
}
