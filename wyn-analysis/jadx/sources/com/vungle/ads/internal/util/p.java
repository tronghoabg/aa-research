package com.vungle.ads.internal.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.vungle.ads.internal.j1;
import com.vungle.ads.internal.n1;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final p f33860b = new p();

    /* renamed from: a, reason: collision with root package name */
    public Executor f33861a;

    public final void a(com.vungle.ads.internal.executor.j ioExecutor) {
        AbstractC3340k.e(ioExecutor, "ioExecutor");
        this.f33861a = ioExecutor;
    }

    public final void a(String str, j1 onImageLoaded) {
        AbstractC3340k.e(onImageLoaded, "onImageLoaded");
        if (this.f33861a == null) {
            boolean z2 = u.f33874a;
            t.c("p", "ImageLoader not initialized.");
        } else if (str.length() == 0) {
            boolean z10 = u.f33874a;
            t.c("p", "the uri is required.");
        } else {
            Executor executor = this.f33861a;
            if (executor != null) {
                executor.execute(new C8.d(23, str, onImageLoaded));
            }
        }
    }

    public static void a(String str, n1 onImageSizeLoaded) {
        AbstractC3340k.e(onImageSizeLoaded, "onImageSizeLoaded");
        if (str.length() == 0 || !Bf.r.k0(str, "file://", false)) {
            boolean z2 = u.f33874a;
            t.c("p", "the valid uri is required.");
            return;
        }
        String strSubstring = str.substring(7);
        AbstractC3340k.d(strSubstring, "this as java.lang.String).substring(startIndex)");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(strSubstring, options);
        onImageSizeLoaded.invoke(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    public static final void a(String str, tf.l onImageLoaded) {
        AbstractC3340k.e(onImageLoaded, "$onImageLoaded");
        if (Bf.r.k0(str, "file://", false)) {
            String strSubstring = str.substring(7);
            AbstractC3340k.d(strSubstring, "this as java.lang.String).substring(startIndex)");
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(strSubstring);
            if (bitmapDecodeFile != null) {
                onImageLoaded.invoke(bitmapDecodeFile);
            } else {
                boolean z2 = u.f33874a;
                t.c("p", "decode bitmap failed.");
            }
        }
    }
}
