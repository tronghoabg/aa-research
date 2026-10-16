package kc;

import A.AbstractC0213f;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;
import java.util.Locale;

/* loaded from: classes5.dex */
public class m extends View implements io.flutter.embedding.engine.renderer.m {

    /* renamed from: a, reason: collision with root package name */
    public ImageReader f39496a;

    /* renamed from: b, reason: collision with root package name */
    public Image f39497b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap f39498c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.k f39499d;

    /* renamed from: e, reason: collision with root package name */
    public final int f39500e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f39501f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, int i5, int i10, int i11) {
        super(context, null);
        ImageReader imageReaderD = d(i5, i10);
        this.f39501f = false;
        this.f39496a = imageReaderD;
        this.f39500e = i11;
        setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public static ImageReader d(int i5, int i10) {
        if (i5 <= 0) {
            Locale locale = Locale.US;
            Log.w("FlutterImageView", "ImageReader width must be greater than 0, but given width=" + i5 + ", set width=1");
            i5 = 1;
        }
        if (i10 <= 0) {
            Locale locale2 = Locale.US;
            Log.w("FlutterImageView", "ImageReader height must be greater than 0, but given height=" + i10 + ", set height=1");
            i10 = 1;
        }
        return Build.VERSION.SDK_INT >= 29 ? ImageReader.newInstance(i5, i10, 1, 3, 768L) : ImageReader.newInstance(i5, i10, 1, 3);
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void a(io.flutter.embedding.engine.renderer.k kVar) {
        if (AbstractC0213f.f(this.f39500e) == 0) {
            Surface surface = this.f39496a.getSurface();
            kVar.f37010c = surface;
            kVar.f37008a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.f39499d = kVar;
        this.f39501f = true;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void b() {
        if (this.f39501f) {
            setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            c();
            this.f39498c = null;
            Image image = this.f39497b;
            if (image != null) {
                image.close();
                this.f39497b = null;
            }
            invalidate();
            this.f39501f = false;
        }
    }

    public final boolean c() {
        if (!this.f39501f) {
            return false;
        }
        Image imageAcquireLatestImage = this.f39496a.acquireLatestImage();
        if (imageAcquireLatestImage != null) {
            Image image = this.f39497b;
            if (image != null) {
                image.close();
                this.f39497b = null;
            }
            this.f39497b = imageAcquireLatestImage;
            invalidate();
        }
        return imageAcquireLatestImage != null;
    }

    public final void e(int i5, int i10) {
        if (this.f39499d == null) {
            return;
        }
        if (i5 == this.f39496a.getWidth() && i10 == this.f39496a.getHeight()) {
            return;
        }
        Image image = this.f39497b;
        if (image != null) {
            image.close();
            this.f39497b = null;
        }
        this.f39496a.close();
        this.f39496a = d(i5, i10);
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public io.flutter.embedding.engine.renderer.k getAttachedRenderer() {
        return this.f39499d;
    }

    public ImageReader getImageReader() {
        return this.f39496a;
    }

    public Surface getSurface() {
        return this.f39496a.getSurface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Image image = this.f39497b;
        if (image != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                HardwareBuffer hardwareBuffer = image.getHardwareBuffer();
                ColorSpace.Named unused = ColorSpace.Named.SRGB;
                this.f39498c = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
                hardwareBuffer.close();
            } else {
                Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.f39497b.getHeight();
                    Bitmap bitmap = this.f39498c;
                    if (bitmap == null || bitmap.getWidth() != rowStride || this.f39498c.getHeight() != height) {
                        this.f39498c = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.f39498c.copyPixelsFromBuffer(buffer);
                }
            }
        }
        Bitmap bitmap2 = this.f39498c;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        if (!(i5 == this.f39496a.getWidth() && i10 == this.f39496a.getHeight()) && this.f39500e == 1 && this.f39501f) {
            e(i5, i10);
            io.flutter.embedding.engine.renderer.k kVar = this.f39499d;
            Surface surface = this.f39496a.getSurface();
            kVar.f37010c = surface;
            kVar.f37008a.onSurfaceWindowChanged(surface);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void pause() {
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void resume() {
    }
}
