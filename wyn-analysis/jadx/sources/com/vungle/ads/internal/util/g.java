package com.vungle.ads.internal.util;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import ef.C2515C;
import ef.InterfaceC2525i;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class g extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f33847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2525i f33848b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f33849c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Window f33850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tf.l f33851e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(WebView webView, InterfaceC2525i interfaceC2525i, j jVar, Window window, i iVar) {
        super(0);
        this.f33847a = webView;
        this.f33848b = interfaceC2525i;
        this.f33849c = jVar;
        this.f33850d = window;
        this.f33851e = iVar;
    }

    public final void a() {
        int width = this.f33847a.getWidth();
        int height = this.f33847a.getHeight();
        int[] iArr = new int[2];
        this.f33847a.getLocationInWindow(iArr);
        int i5 = iArr[0];
        int i10 = iArr[1];
        ((com.vungle.ads.internal.executor.d) j.a(this.f33848b)).f32982c.execute(new Mb.a(width, height, this.f33849c, this.f33850d, new Rect(i5, i10, i5 + width, i10 + height), this.f33851e));
    }

    @Override // tf.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        a();
        return C2515C.f34653a;
    }

    public static final void a(int i5, int i10, j this$0, Window window, Rect rect, tf.l onComplete) {
        Bitmap bitmapCreateBitmap;
        AbstractC3340k.e(this$0, "this$0");
        AbstractC3340k.e(rect, "$rect");
        AbstractC3340k.e(onComplete, "$onComplete");
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(i5, i10, Bitmap.Config.ARGB_8888);
            try {
                j.a(this$0, window, rect, bitmapCreateBitmap, onComplete);
            } catch (Throwable th) {
                th = th;
                boolean z2 = u.f33874a;
                t.a("BlackScreenDetector", "Bitmap creation failed", th);
                if (bitmapCreateBitmap != null) {
                    bitmapCreateBitmap.recycle();
                }
                onComplete.invoke(null);
            }
        } catch (Throwable th2) {
            th = th2;
            bitmapCreateBitmap = null;
        }
    }
}
