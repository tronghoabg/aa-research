package com.applovin.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.View;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* renamed from: com.applovin.impl.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1640h0 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21624a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f21625b;

    /* renamed from: c, reason: collision with root package name */
    private final long f21626c;

    /* renamed from: d, reason: collision with root package name */
    private final long f21627d;

    /* renamed from: e, reason: collision with root package name */
    private final int f21628e;

    /* renamed from: f, reason: collision with root package name */
    private final int f21629f;

    /* renamed from: g, reason: collision with root package name */
    private final int f21630g;

    /* renamed from: h, reason: collision with root package name */
    private final int f21631h;

    /* renamed from: i, reason: collision with root package name */
    private final int f21632i;
    private int k;

    /* renamed from: l, reason: collision with root package name */
    private int f21634l;

    /* renamed from: m, reason: collision with root package name */
    private Integer f21635m;

    /* renamed from: n, reason: collision with root package name */
    private volatile boolean f21636n;

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f21637o;

    /* renamed from: p, reason: collision with root package name */
    private Handler f21638p;

    /* renamed from: q, reason: collision with root package name */
    private HandlerThread f21639q;

    /* renamed from: s, reason: collision with root package name */
    private c f21641s;

    /* renamed from: j, reason: collision with root package name */
    private WeakReference f21633j = new WeakReference(null);

    /* renamed from: r, reason: collision with root package name */
    private final Runnable f21640r = new S(this, 2);

    /* renamed from: com.applovin.impl.h0$b */
    public class b implements PixelCopy$OnPixelCopyFinishedListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f21643a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f21644b;

        public b(d dVar, Bitmap bitmap) {
            this.f21643a = dVar;
            this.f21644b = bitmap;
        }

        public void onPixelCopyFinished(int i5) {
            if (i5 == 0) {
                this.f21643a.a(this.f21644b);
                return;
            }
            com.applovin.impl.sdk.o unused = C1640h0.this.f21625b;
            if (com.applovin.impl.sdk.o.a()) {
                C1640h0.this.f21625b.b("BlackViewDetector", "Failed to capture screenshot with error code: " + i5);
            }
            this.f21643a.a(true);
        }
    }

    /* renamed from: com.applovin.impl.h0$c */
    public interface c {
        void a(int i5, int i10);

        void a(int i5, int i10, int i11);
    }

    /* renamed from: com.applovin.impl.h0$d */
    public interface d {
        void a(Bitmap bitmap);

        void a(boolean z2);
    }

    public C1640h0(com.applovin.impl.sdk.k kVar) {
        this.f21624a = kVar;
        this.f21625b = kVar.O();
        this.f21626c = ((Long) kVar.a(y4.f23836k6)).longValue();
        this.f21627d = ((Long) kVar.a(y4.f23829j6)).longValue();
        this.f21630g = ((Integer) kVar.a(y4.f23845l6)).intValue();
        this.f21631h = ((Integer) kVar.a(y4.f23854m6)).intValue();
        this.f21632i = ((Integer) kVar.a(y4.f23863n6)).intValue();
        this.f21628e = ((Integer) kVar.a(y4.f23913t6)).intValue();
        this.f21629f = ((Integer) kVar.a(y4.f23921u6)).intValue();
    }

    public static /* synthetic */ int a(C1640h0 c1640h0) {
        int i5 = c1640h0.f21634l;
        c1640h0.f21634l = i5 + 1;
        return i5;
    }

    public static /* synthetic */ int f(C1640h0 c1640h0) {
        int i5 = c1640h0.k;
        c1640h0.k = i5 + 1;
        return i5;
    }

    private void c() {
        if (this.k >= this.f21629f && !this.f21637o) {
            this.f21637o = true;
            h();
        }
        if (this.k < this.f21628e || this.f21636n) {
            return;
        }
        this.f21636n = true;
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        c cVar = this.f21641s;
        if (cVar != null) {
            cVar.a(this.f21628e, this.k, this.f21634l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        c cVar = this.f21641s;
        if (cVar != null) {
            cVar.a(this.k, this.f21634l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.f21641s = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f21626c <= 0) {
            if (this.k == 1) {
                if (!this.f21637o) {
                    this.f21637o = true;
                    h();
                }
                if (!this.f21636n) {
                    this.f21636n = true;
                    i();
                }
            }
            k();
            return;
        }
        c();
        if (this.f21638p == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21625b.k("BlackViewDetector", "Monitoring handler was unexpectedly null");
            }
            k();
        } else if (this.f21636n && this.f21637o) {
            k();
        } else {
            this.f21638p.postDelayed(this.f21640r, this.f21626c);
        }
    }

    private void h() {
        View view = (View) this.f21633j.get();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21625b.k("BlackViewDetector", "Notifying black view confirmed: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new S(this, 3));
    }

    private void i() {
        View view = (View) this.f21633j.get();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21625b.k("BlackViewDetector", "Notifying black view detected: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new S(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.k = 0;
        this.f21635m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f21633j.get() != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21625b.a("BlackViewDetector", "Stopped monitoring view: " + this.f21633j.get());
            }
            this.f21633j.clear();
        }
        Handler handler = this.f21638p;
        if (handler != null) {
            handler.removeCallbacks(this.f21640r);
            this.f21638p = null;
        }
        if (this.f21641s != null) {
            AppLovinSdkUtils.runOnUiThread(new S(this, 1));
        }
    }

    public void b() {
        k();
        HandlerThread handlerThread = this.f21639q;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f21639q = null;
        }
    }

    public void a(View view, c cVar) {
        if (((Boolean) this.f21624a.a(y4.f23820i6)).booleanValue()) {
            View view2 = (View) this.f21633j.get();
            if (view2 != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21625b.k("BlackViewDetector", "Monitoring is already in progress for a view: " + view2);
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f21625b.a("BlackViewDetector", "Started monitoring view: " + view);
            }
            try {
                if (this.f21639q == null) {
                    HandlerThread handlerThread = new HandlerThread("AppLovinSdk:black_view_detector");
                    this.f21639q = handlerThread;
                    handlerThread.start();
                } else {
                    this.f21624a.D().a(d2.f21277L0, "BlackViewDetector:maybeStartMonitoring() unexpectedly called multiple times");
                    k();
                }
                this.f21641s = cVar;
                this.f21633j = new WeakReference(view);
                j();
                this.f21636n = false;
                this.f21637o = false;
                Handler handler = new Handler(this.f21639q.getLooper());
                this.f21638p = handler;
                handler.postDelayed(this.f21640r, this.f21627d);
            } catch (Throwable th) {
                k();
                this.f21624a.D().a("BlackViewDetector", "maybeStartMonitoring", th);
            }
        }
    }

    /* renamed from: com.applovin.impl.h0$a */
    public class a implements d {
        public a() {
        }

        @Override // com.applovin.impl.C1640h0.d
        public void a(Bitmap bitmap) {
            try {
                C1640h0.a(C1640h0.this);
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i5 = width / C1640h0.this.f21630g;
                int i10 = height / C1640h0.this.f21630g;
                int i11 = i5 / 2;
                for (int i12 = i10 / 2; i12 < height; i12 += i10) {
                    for (int i13 = i11; i13 < width; i13 += i5) {
                        int pixel = bitmap.getPixel(i13, i12);
                        if (C1640h0.this.a(pixel)) {
                            bitmap.recycle();
                            C1640h0.this.j();
                            C1640h0.this.g();
                            return;
                        }
                        if (C1640h0.this.f21635m == null) {
                            C1640h0.this.f21635m = Integer.valueOf(pixel);
                        }
                    }
                }
                C1640h0.f(C1640h0.this);
                bitmap.recycle();
                C1640h0.this.g();
            } catch (Exception e7) {
                C1640h0.this.f21624a.D().a("BlackViewDetector", "onScreenshotCaptured", e7);
                C1640h0.this.k();
            }
        }

        @Override // com.applovin.impl.C1640h0.d
        public void a(boolean z2) {
            if (z2) {
                C1640h0.this.k();
            } else {
                C1640h0.this.g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ActivityManager.MemoryInfo memoryInfoA;
        View view = (View) this.f21633j.get();
        if (view == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21625b.k("BlackViewDetector", "Monitored view no longer exists.");
            }
            k();
            return;
        }
        Long l10 = (Long) this.f21624a.a(y4.f23897r6);
        if (l10.longValue() > 0 && (memoryInfoA = o7.a((ActivityManager) com.applovin.impl.sdk.k.o().getSystemService("activity"))) != null && memoryInfoA.availMem < l10.longValue()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21625b.k("BlackViewDetector", "Cancelling black view detection due to low memory");
                return;
            }
            return;
        }
        if (this.f21624a.n0().isApplicationPaused()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21625b.a("BlackViewDetector", "App is backgrounded - skipping black view detection");
            }
            j();
            g();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21625b.a("BlackViewDetector", "Checking for black view: " + view);
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0) {
            a(view, new a());
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21625b.k("BlackViewDetector", N0.a.e("Monitored view is not visible due to dimensions (width = ", measuredWidth, ", height = ", measuredHeight, ")"));
        }
        j();
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(int r9) {
        /*
            r8 = this;
            int r0 = android.graphics.Color.red(r9)
            int r1 = android.graphics.Color.green(r9)
            int r9 = android.graphics.Color.blue(r9)
            java.lang.Integer r2 = r8.f21635m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L4d
            int r2 = r2.intValue()
            int r2 = android.graphics.Color.red(r2)
            java.lang.Integer r5 = r8.f21635m
            int r5 = r5.intValue()
            int r5 = android.graphics.Color.green(r5)
            java.lang.Integer r6 = r8.f21635m
            int r6 = r6.intValue()
            int r6 = android.graphics.Color.blue(r6)
            int r2 = r0 - r2
            int r2 = java.lang.Math.abs(r2)
            int r7 = r8.f21632i
            if (r2 > r7) goto L4f
            int r2 = r1 - r5
            int r2 = java.lang.Math.abs(r2)
            int r5 = r8.f21632i
            if (r2 > r5) goto L4f
            int r2 = r9 - r6
            int r2 = java.lang.Math.abs(r2)
            int r5 = r8.f21632i
            if (r2 <= r5) goto L4d
            goto L4f
        L4d:
            r2 = r4
            goto L50
        L4f:
            r2 = r3
        L50:
            int r5 = r8.f21631h
            if (r0 > r5) goto L5c
            if (r1 > r5) goto L5c
            if (r9 > r5) goto L5c
            if (r2 == 0) goto L5b
            goto L5c
        L5b:
            return r4
        L5c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.C1640h0.a(int):boolean");
    }

    private void a(View view, d dVar) {
        if (AbstractC1654o0.h()) {
            Activity activityA = this.f21624a.e().a();
            if (activityA == null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21625b.b("BlackViewDetector", "Failed to capture screenshot due to no active activity");
                }
                dVar.a(false);
                return;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i5 = iArr[0];
            int i10 = iArr[1];
            Rect rect = new Rect(i5, i10, i5 + measuredWidth, i10 + measuredHeight);
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                PixelCopy.request(activityA.getWindow(), rect, bitmapCreateBitmap, new b(dVar, bitmapCreateBitmap), new Handler());
                return;
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21625b.b("BlackViewDetector", "Failed to capture screenshot due to exception: " + th);
                }
                dVar.a(true);
                return;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21625b.k("BlackViewDetector", "Unable to capture screenshots on views below API 26");
        }
        dVar.a(true);
    }
}
