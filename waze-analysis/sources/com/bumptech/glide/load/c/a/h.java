package com.bumptech.glide.load.c.a;

import android.graphics.Bitmap;
import android.util.Log;
import java.security.MessageDigest;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h extends e {

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f3348b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(f3507a);

    @Override // com.bumptech.glide.load.o
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f3348b);
    }

    @Override // com.bumptech.glide.load.c.a.e
    protected final Bitmap c(com.bumptech.glide.load.a.a.c cVar, Bitmap bitmap, int i2, int i3) {
        int i4 = as.f3324a;
        if (bitmap.getWidth() > i2 || bitmap.getHeight() > i3) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return as.c(cVar, bitmap, i2, i3);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    @Override // com.bumptech.glide.load.o
    public final boolean equals(Object obj) {
        return obj instanceof h;
    }

    @Override // com.bumptech.glide.load.o
    public final int hashCode() {
        return -670243078;
    }
}
