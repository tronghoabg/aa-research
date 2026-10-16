package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aaas {
    static final Paint a;
    static final Bitmap.Config b;
    private static aaas c;
    private Bitmap d;
    private Bitmap e;
    private Bitmap f;

    static {
        Paint paint = new Paint();
        paint.setColor(-16777216);
        a = paint;
        b = Bitmap.Config.ARGB_8888;
    }

    public aaas() {
        synchronized (this) {
            this.d = null;
            this.e = null;
            this.f = null;
        }
    }

    public static synchronized aaas h() {
        aaas aaasVar;
        aaasVar = c;
        if (aaasVar == null) {
            aaasVar = new aaas();
            c = aaasVar;
        }
        return aaasVar;
    }

    final synchronized Bitmap a() {
        int[] iArr;
        iArr = new int[sk.AUDIO_CONTENT_BUFFER_SIZE];
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr, 0, 257, -16777216);
        return Bitmap.createBitmap(iArr, 1, sk.AUDIO_CONTENT_BUFFER_SIZE, b);
    }

    final synchronized Bitmap b(Canvas canvas) {
        Bitmap.Config config;
        Bitmap bitmapCreateBitmap;
        config = b;
        bitmapCreateBitmap = Bitmap.createBitmap(sk.AUDIO_CONTENT_BUFFER_SIZE, sk.AUDIO_CONTENT_BUFFER_SIZE, config);
        canvas.setBitmap(bitmapCreateBitmap);
        Paint paint = a;
        canvas.drawRect(BitmapDescriptorFactory.HUE_RED, 257.0f, 512.0f, 0.01f, paint);
        canvas.drawCircle(256.0f, 256.0f, 256.0f, paint);
        return bitmapCreateBitmap.copy(config, false);
    }

    final synchronized Bitmap c() {
        return Bitmap.createBitmap(new int[]{-16777216}, 1, 1, b);
    }

    public final synchronized Bitmap d() {
        if (this.e == null) {
            Bitmap bitmapA = a();
            this.e = bitmapA;
            bitmapA.isMutable();
        }
        return this.e;
    }

    public final Bitmap e(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? d() : d() : f() : g() : d();
    }

    public final synchronized Bitmap f() {
        if (this.f == null) {
            Bitmap bitmapB = b(new Canvas());
            this.f = bitmapB;
            bitmapB.isMutable();
        }
        return this.f;
    }

    public final synchronized Bitmap g() {
        if (this.d == null) {
            Bitmap bitmapC = c();
            this.d = bitmapC;
            bitmapC.isMutable();
        }
        return this.d;
    }
}
