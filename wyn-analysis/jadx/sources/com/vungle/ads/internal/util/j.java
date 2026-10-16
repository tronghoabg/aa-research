package com.vungle.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.Window;
import android.webkit.WebView;
import com.vungle.ads.internal.util.j;
import ef.C2527k;
import ef.EnumC2526j;
import ef.InterfaceC2525i;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public volatile tf.p f33856a;

    public static final /* synthetic */ void a(j jVar, Window window, Rect rect, Bitmap bitmap, tf.l lVar) {
        jVar.getClass();
        a(window, rect, bitmap, lVar);
    }

    public final void a(WebView webView, int i5, com.vungle.ads.internal.ui.q callback) {
        Activity activity;
        AbstractC3340k.e(callback, "callback");
        this.f33856a = callback;
        if (webView == null) {
            boolean z2 = u.f33874a;
            t.c("BlackScreenDetector", "Black screen detection failed: View not available");
            tf.p pVar = this.f33856a;
            if (pVar != null) {
                pVar.invoke(-1, "View not available");
            }
            this.f33856a = null;
            return;
        }
        i iVar = new i(webView, this, i5);
        if (this.f33856a == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Context context = webView.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            Window window = activity != null ? activity.getWindow() : null;
            if (window == null) {
                boolean z10 = u.f33874a;
                t.c("BlackScreenDetector", "Activity/Window not found for PixelCopy");
                iVar.invoke(null);
                return;
            } else {
                Context context2 = webView.getContext();
                AbstractC3340k.d(context2, "view.context");
                InterfaceC2525i interfaceC2525iY = Fe.c.y(EnumC2526j.f34667a, new f(context2));
                Handler handler = y.f33878a;
                y.a(new g(webView, interfaceC2525iY, this, window, iVar));
                return;
            }
        }
        Handler handler2 = y.f33878a;
        y.a(new e(webView, iVar));
    }

    public static final com.vungle.ads.internal.executor.a a(InterfaceC2525i interfaceC2525i) {
        return (com.vungle.ads.internal.executor.a) interfaceC2525i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Mb.c] */
    public static void a(Window window, Rect rect, final Bitmap bitmap, final tf.l lVar) {
        try {
            PixelCopy.request(window, rect, bitmap, (PixelCopy$OnPixelCopyFinishedListener) new PixelCopy$OnPixelCopyFinishedListener() { // from class: Mb.c
                public final void onPixelCopyFinished(int i5) {
                    j.a(lVar, bitmap, i5);
                }
            }, new Handler(Looper.getMainLooper()));
        } catch (Throwable th) {
            boolean z2 = u.f33874a;
            t.a("BlackScreenDetector", "PixelCopy request failed", th);
            bitmap.recycle();
            lVar.invoke(null);
        }
    }

    public static final void a(tf.l onComplete, Bitmap bitmap, int i5) {
        AbstractC3340k.e(onComplete, "$onComplete");
        AbstractC3340k.e(bitmap, "$bitmap");
        if (i5 == 0) {
            onComplete.invoke(bitmap);
            return;
        }
        boolean z2 = u.f33874a;
        t.c("BlackScreenDetector", "PixelCopy failed: " + i5);
        bitmap.recycle();
        onComplete.invoke(null);
    }

    public static C2527k a(Bitmap bitmap, int i5) {
        if (bitmap != null) {
            int iA = a(bitmap, 0.1d, i5, 0.5d);
            return new C2527k(Integer.valueOf(iA), iA == -1 ? "Internal calculation error" : "");
        }
        boolean z2 = u.f33874a;
        t.c("BlackScreenDetector", "Black screen detection failed: Snapshot capture failure");
        return new C2527k(-1, "Snapshot capture failure");
    }

    public static int a(Bitmap bitmap, double d3, int i5, double d5) {
        int i10;
        int i11;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i12 = (int) (width * d3);
        int i13 = (int) (height * d3);
        int i14 = width - (i12 * 2);
        int i15 = height - (i13 * 2);
        if (i14 <= 0 || i15 <= 0) {
            return -1;
        }
        long j8 = i14 * i15;
        if (j8 > 2147483647L) {
            if (d3 >= d5) {
                return -1;
            }
            return a(bitmap, d3 * 2, i5, d5);
        }
        int i16 = (int) j8;
        int[] iArr = new int[i16];
        bitmap.getPixels(iArr, 0, i14, i12, i13, i14, i15);
        int i17 = i16 - 1;
        if (i5 > 0) {
            int iT = Fe.c.t(0, i17, i5);
            if (iT >= 0) {
                int i18 = 0;
                i10 = 0;
                i11 = 0;
                while (true) {
                    i10++;
                    int i19 = iArr[i18];
                    int i20 = (i19 >> 24) & 255;
                    int i21 = (i19 >> 16) & 255;
                    int i22 = (i19 >> 8) & 255;
                    int i23 = i19 & 255;
                    if (i20 > 0 && i21 < 10 && i22 < 10 && i23 < 10) {
                        i11++;
                    }
                    if (i18 == iT) {
                        break;
                    }
                    i18 += i5;
                }
            } else {
                i10 = 0;
                i11 = 0;
            }
            if (i10 > 0) {
                return (int) ((i11 * 100) / i10);
            }
            return 0;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + i5 + '.');
    }
}
