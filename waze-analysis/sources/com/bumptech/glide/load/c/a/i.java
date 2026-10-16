package com.bumptech.glide.load.c.a;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i extends e {

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f3349b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(f3507a);

    @Override // com.bumptech.glide.load.o
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f3349b);
    }

    @Override // com.bumptech.glide.load.c.a.e
    protected final Bitmap c(com.bumptech.glide.load.a.a.c cVar, Bitmap bitmap, int i2, int i3) {
        return as.b(cVar, bitmap, i2, i3);
    }

    @Override // com.bumptech.glide.load.o
    public final boolean equals(Object obj) {
        return obj instanceof i;
    }

    @Override // com.bumptech.glide.load.o
    public final int hashCode() {
        return 1101716364;
    }
}
