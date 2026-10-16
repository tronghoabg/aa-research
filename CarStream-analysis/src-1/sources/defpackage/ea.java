package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.carstream.tech.car.CarScreen;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class ea extends View {
    public final Paint a;
    public final RectF b;
    public boolean c;

    public ea(CarScreen carScreen) {
        super(carScreen);
        this.a = new Paint(1);
        this.b = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iX;
        float width = getWidth();
        float height = getHeight();
        float f = height / 2.0f;
        if (this.c) {
            iX = d8.c(k1.h ? 400 : 600);
        } else {
            iX = k1.x();
        }
        Paint paint = this.a;
        paint.setColor(iX);
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, width, height);
        canvas.drawRoundRect(rectF, f, f, paint);
        float f2 = f - (height * 0.14f);
        float f3 = this.c ? width - f : f;
        paint.setColor(-1);
        canvas.drawCircle(f3, f, f2, paint);
    }
}
