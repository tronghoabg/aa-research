package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public abstract class tjv extends tju {
    private final Paint b;
    private final Paint c;

    public tjv(tjy tjyVar) {
        super(tjyVar);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        this.b = paint;
        Paint paint2 = new Paint();
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.c = paint2;
    }

    @Override // defpackage.tjy
    public final IconCompat b(Object obj) {
        Bitmap bitmapD = this.a.b(obj).d();
        if (bitmapD == null) {
            throw new IllegalStateException("Only IconCompat backed with a Bitmap are supported");
        }
        int iMin = Math.min(bitmapD.getWidth(), bitmapD.getHeight());
        Bitmap.Config config = bitmapD.getConfig();
        config.getClass();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, config);
        bitmapCreateBitmap.setDensity(bitmapD.getDensity());
        bitmapCreateBitmap.getClass();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawARGB(0, 0, 0, 0);
        e(canvas, this.b);
        canvas.drawBitmap(bitmapD, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.c);
        return IconCompat.k(bitmapCreateBitmap);
    }

    public abstract void e(Canvas canvas, Paint paint);
}
