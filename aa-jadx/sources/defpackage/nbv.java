package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nbv {
    public final android.graphics.Bitmap a;

    public nbv(android.graphics.Bitmap bitmap) {
        this.a = bitmap;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.nbv)) {
            return false;
        }
        android.graphics.Bitmap bitmap = this.a;
        if (bitmap.isRecycled()) {
            return false;
        }
        android.graphics.Bitmap bitmap2 = ((defpackage.nbv) obj).a;
        if (bitmap2.isRecycled()) {
            return false;
        }
        return bitmap.sameAs(bitmap2);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
