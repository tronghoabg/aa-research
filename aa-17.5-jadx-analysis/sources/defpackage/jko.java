package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class jko implements ImageReader.OnImageAvailableListener {
    public static final yph a = yph.c("GH.SFTL");
    public final jfg d;
    public long f;
    private volatile Surface g;
    private VirtualDisplay i;
    private final Context j;
    private ImageReader l;
    private long m;
    private jkn n;
    public final AtomicLong b = new AtomicLong(0);
    public final AtomicLong c = new AtomicLong(0);
    private final Handler h = new Handler(Looper.getMainLooper());
    private final Random k = new Random();
    public int e = -16777216;

    public jko(Context context, jfg jfgVar) {
        this.j = context;
        this.d = jfgVar;
    }

    private final synchronized void f() {
        this.l = null;
        VirtualDisplay virtualDisplay = this.i;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            this.i = null;
        }
        if (this.g != null) {
            this.g.release();
            this.g = null;
        }
    }

    private static boolean g(int i, int i2) {
        int i3 = (i & 255) - (i2 & 255);
        return i3 >= -32 && i3 <= 32;
    }

    public final synchronized void a() {
        ((ype) a.l().ai((char) 2257)).u("start telemetry");
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        this.m = jElapsedRealtimeNanos;
        this.c.getAndSet(jElapsedRealtimeNanos);
        b(600000);
    }

    final synchronized void b(int i) {
        Handler handler = this.h;
        handler.removeCallbacksAndMessages(this);
        handler.postAtTime(new jgu(this, 5), this, SystemClock.uptimeMillis() + (i >> 1) + this.k.nextInt(i));
    }

    public final synchronized void c() {
        if (!e()) {
            this.d.e(yzz.PROJECTION_WINDOW_MANAGER, yzy.GM);
        }
        ((ype) a.l().ai((char) 2262)).u("stop telemetry");
        this.h.removeCallbacksAndMessages(this);
        f();
    }

    public final synchronized void d() {
        ilb.d();
        if (this.l == null) {
            ImageReader imageReaderNewInstance = ImageReader.newInstance(1, 1, 1, 2);
            this.l = imageReaderNewInstance;
            imageReaderNewInstance.setOnImageAvailableListener(this, this.h);
            this.g = this.l.getSurface();
            Context context = this.j;
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            displayManager.getClass();
            VirtualDisplay virtualDisplayCreateVirtualDisplay = displayManager.createVirtualDisplay("Gearhead.SurfaceFlingerTelemetryDisplay", 1, 1, 160, this.g, 0);
            this.i = virtualDisplayCreateVirtualDisplay;
            jkn jknVar = new jkn(this, context, virtualDisplayCreateVirtualDisplay.getDisplay());
            this.n = jknVar;
            jknVar.show();
        }
        b(600000);
        long andSet = this.c.getAndSet(SystemClock.elapsedRealtimeNanos());
        jkn jknVar2 = this.n;
        jknVar2.getClass();
        View view = jknVar2.a;
        if (view != null) {
            jknVar2.getClass();
            view.invalidate();
            if (andSet != 0) {
                ((ype) ((ype) a.g()).ai((char) 2263)).u("no onDraw since last invalidate");
            }
        }
    }

    protected final synchronized boolean e() {
        long jElapsedRealtimeNanos;
        jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.m) / 1000000;
        return this.f >= (jElapsedRealtimeNanos + jElapsedRealtimeNanos) / 905000;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final synchronized void onImageAvailable(ImageReader imageReader) {
        try {
            Image imageAcquireLatestImage = imageReader.acquireLatestImage();
            if (imageAcquireLatestImage != null) {
                try {
                    ByteBuffer buffer = imageAcquireLatestImage.getPlanes()[0].getBuffer();
                    int i = ((buffer.get(0) & 255) << 16) | ((buffer.get(1) & 255) << 8);
                    int i2 = buffer.get(2) & 255;
                    imageAcquireLatestImage.close();
                    int i3 = i | i2;
                    long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    int i4 = this.e;
                    if (g(i3, i4) && g(i3 >> 8, i4 >> 8) && g(i3 >> 16, i4 >> 16)) {
                        long andSet = this.b.getAndSet(0L);
                        if (andSet != 0) {
                            long j = jElapsedRealtimeNanos - andSet;
                            ((ype) a.l().ai((char) 2255)).y("SurfaceFlinger ondraw2onframe: %f ms", Double.valueOf(j / 1000000.0d));
                            if (this.e == -16711936) {
                                this.d.f(yzz.PROJECTION_WINDOW_MANAGER, yzy.GO, j / 1000000);
                                this.f++;
                            }
                            if (this.e == -16777216) {
                                f();
                                return;
                            } else {
                                b(200);
                                return;
                            }
                        }
                        if (this.e != -16777216) {
                            ((ype) ((ype) a.g()).ai((char) 2256)).u("onFrameAvailable with no ondraw!");
                        }
                    }
                } catch (Throwable th) {
                    try {
                        imageAcquireLatestImage.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IllegalStateException | UnsupportedOperationException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 2261)).u("Failed to get image from image reader.");
        }
    }
}
