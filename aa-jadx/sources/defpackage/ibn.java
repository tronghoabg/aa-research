package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ibn extends defpackage.iap {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(a);

    @Override // defpackage.hus
    public final void a(java.security.MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.iap
    protected final android.graphics.Bitmap c(defpackage.hxn hxnVar, android.graphics.Bitmap bitmap, int i, int i2) {
        return defpackage.icc.c(hxnVar, bitmap, i, i2);
    }

    @Override // defpackage.hus
    public final boolean equals(java.lang.Object obj) {
        return obj instanceof defpackage.ibn;
    }

    @Override // defpackage.hus
    public final int hashCode() {
        return 1572326941;
    }
}
