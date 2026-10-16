package defpackage;

import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.carstream.tech.core.ui.SplashArt;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class gb extends View {
    public final Paint a;
    public long b;

    public gb(ContextWrapper contextWrapper) {
        super(contextWrapper);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(SplashArt.M);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b < 1600) {
            return;
        }
        float height = getHeight() / 2.0f;
        float width = getWidth() / 3.0f;
        for (int i = 0; i < 3; i++) {
            float fCos = (float) (0.5d - (Math.cos((((((((this.b - 1600) - (i * 180)) % 1100) + 1100) % 1100) / 1100.0f) * 2.0f) * 3.141592653589793d) * 0.5d));
            int iRound = Math.round(((0.72f * fCos) + 0.28f) * 255.0f);
            Paint paint = this.a;
            paint.setAlpha(iRound);
            canvas.drawCircle((i + 0.5f) * width, height, ((fCos * 0.22f) + 0.78f) * height, paint);
        }
    }
}
