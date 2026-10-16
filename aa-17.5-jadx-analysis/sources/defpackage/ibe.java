package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class ibe extends iag {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(a);

    @Override // defpackage.hui
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.iag
    protected final Bitmap c(hxe hxeVar, Bitmap bitmap, int i, int i2) {
        return ibt.c(hxeVar, bitmap, i, i2);
    }

    @Override // defpackage.hui
    public final boolean equals(Object obj) {
        return obj instanceof ibe;
    }

    @Override // defpackage.hui
    public final int hashCode() {
        return 1572326941;
    }
}
