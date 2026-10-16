package com.vungle.ads.internal.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.webkit.WebView;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class e extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f33844a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tf.l f33845b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(WebView webView, i iVar) {
        super(0);
        this.f33844a = webView;
        this.f33845b = iVar;
    }

    @Override // tf.a
    public final Object invoke() {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f33844a.getWidth(), this.f33844a.getHeight(), Bitmap.Config.ARGB_8888);
            this.f33844a.draw(new Canvas(bitmapCreateBitmap));
            this.f33845b.invoke(bitmapCreateBitmap);
        } catch (Throwable th) {
            boolean z2 = u.f33874a;
            t.a("BlackScreenDetector", "Bitmap capture failed", th);
            this.f33845b.invoke(null);
        }
        return C2515C.f34653a;
    }
}
