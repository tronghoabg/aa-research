package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jkv implements android.media.ImageReader.OnImageAvailableListener {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.SFTL");
    public final defpackage.jfo d;
    public long f;
    private volatile android.view.Surface g;
    private android.hardware.display.VirtualDisplay i;
    private final android.content.Context j;
    private android.media.ImageReader l;
    private long m;
    private defpackage.jku n;
    public final java.util.concurrent.atomic.AtomicLong b = new java.util.concurrent.atomic.AtomicLong(0);
    public final java.util.concurrent.atomic.AtomicLong c = new java.util.concurrent.atomic.AtomicLong(0);
    private final android.os.Handler h = new android.os.Handler(android.os.Looper.getMainLooper());
    private final java.util.Random k = new java.util.Random();
    public int e = -16777216;

    public jkv(android.content.Context context, defpackage.jfo jfoVar) {
        this.j = context;
        this.d = jfoVar;
    }

    private final synchronized void f() {
        this.l = null;
        android.hardware.display.VirtualDisplay virtualDisplay = this.i;
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
        ((defpackage.yqj) a.l().ai((char) 2258)).u("start telemetry");
        long jElapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
        this.m = jElapsedRealtimeNanos;
        this.c.getAndSet(jElapsedRealtimeNanos);
        b(600000);
    }

    final synchronized void b(int i) {
        android.os.Handler handler = this.h;
        handler.removeCallbacksAndMessages(this);
        handler.postAtTime(new defpackage.jeo(this, 13), this, android.os.SystemClock.uptimeMillis() + ((long) (i >> 1)) + ((long) this.k.nextInt(i)));
    }

    public final synchronized void c() {
        if (!e()) {
            this.d.e(defpackage.zbe.PROJECTION_WINDOW_MANAGER, defpackage.zbd.GQ);
        }
        ((defpackage.yqj) a.l().ai((char) 2263)).u("stop telemetry");
        this.h.removeCallbacksAndMessages(this);
        f();
    }

    public final synchronized void d() {
        defpackage.ill.d();
        if (this.l == null) {
            android.media.ImageReader imageReaderNewInstance = android.media.ImageReader.newInstance(1, 1, 1, 2);
            this.l = imageReaderNewInstance;
            imageReaderNewInstance.setOnImageAvailableListener(this, this.h);
            this.g = this.l.getSurface();
            android.content.Context context = this.j;
            android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) context.getSystemService("display");
            displayManager.getClass();
            android.hardware.display.VirtualDisplay virtualDisplayCreateVirtualDisplay = displayManager.createVirtualDisplay("Gearhead.SurfaceFlingerTelemetryDisplay", 1, 1, 160, this.g, 0);
            this.i = virtualDisplayCreateVirtualDisplay;
            defpackage.jku jkuVar = new defpackage.jku(this, context, virtualDisplayCreateVirtualDisplay.getDisplay());
            this.n = jkuVar;
            jkuVar.show();
        }
        b(600000);
        long andSet = this.c.getAndSet(android.os.SystemClock.elapsedRealtimeNanos());
        defpackage.jku jkuVar2 = this.n;
        jkuVar2.getClass();
        android.view.View view = jkuVar2.a;
        if (view != null) {
            jkuVar2.getClass();
            view.invalidate();
            if (andSet != 0) {
                ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 2264)).u("no onDraw since last invalidate");
            }
        }
    }

    protected final synchronized boolean e() {
        long jElapsedRealtimeNanos;
        jElapsedRealtimeNanos = (android.os.SystemClock.elapsedRealtimeNanos() - this.m) / 1000000;
        return this.f >= (jElapsedRealtimeNanos + jElapsedRealtimeNanos) / 905000;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final synchronized void onImageAvailable(android.media.ImageReader imageReader) {
        try {
            try {
                android.media.Image imageAcquireLatestImage = imageReader.acquireLatestImage();
                if (imageAcquireLatestImage != null) {
                    try {
                        java.nio.ByteBuffer buffer = imageAcquireLatestImage.getPlanes()[0].getBuffer();
                        int i = ((buffer.get(0) & 255) << 16) | ((buffer.get(1) & 255) << 8);
                        int i2 = buffer.get(2) & 255;
                        imageAcquireLatestImage.close();
                        int i3 = i | i2;
                        long jElapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
                        int i4 = this.e;
                        if (g(i3, i4) && g(i3 >> 8, i4 >> 8) && g(i3 >> 16, i4 >> 16)) {
                            long andSet = this.b.getAndSet(0L);
                            if (andSet != 0) {
                                long j = jElapsedRealtimeNanos - andSet;
                                ((defpackage.yqj) a.l().ai((char) 2256)).y("SurfaceFlinger ondraw2onframe: %f ms", java.lang.Double.valueOf(j / 1000000.0d));
                                if (this.e == -16711936) {
                                    this.d.f(defpackage.zbe.PROJECTION_WINDOW_MANAGER, defpackage.zbd.GS, j / 1000000);
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
                                ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 2257)).u("onFrameAvailable with no ondraw!");
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        try {
                            imageAcquireLatestImage.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th3) {
                throw th3;
            }
        } catch (java.lang.IllegalStateException | java.lang.UnsupportedOperationException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 2262)).u("Failed to get image from image reader.");
        }
    }
}
