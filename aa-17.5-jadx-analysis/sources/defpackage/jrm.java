package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class jrm extends iag {
    private static final byte[] b = "BitmapPhoneOemShapeTransformation".getBytes(StandardCharsets.UTF_8);

    @Override // defpackage.hui
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.iag
    protected final Bitmap c(hxe hxeVar, Bitmap bitmap, int i, int i2) {
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        canvas.drawPath(lfr.b().a(i), paint);
        return bitmapCreateBitmap;
    }

    @Override // defpackage.hui
    public final boolean equals(Object obj) {
        return obj instanceof jrm;
    }

    @Override // defpackage.hui
    public final int hashCode() {
        return 1432406642;
    }
}
