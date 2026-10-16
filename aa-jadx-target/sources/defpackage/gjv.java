package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class gjv {
    public static final defpackage.gjv a = new defpackage.gjv(null, null, null);
    public final android.net.Uri b;
    public final java.lang.Object c;
    public final android.graphics.Bitmap d;

    public gjv(android.net.Uri uri, android.graphics.Bitmap bitmap, java.lang.Object obj) {
        this.b = uri;
        this.c = obj;
        this.d = (bitmap == null || bitmap.getHeight() <= 0 || bitmap.getWidth() <= 0) ? null : bitmap;
    }

    public final boolean equals(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.gjv)) {
            return false;
        }
        android.graphics.Bitmap bitmap2 = this.d;
        return defpackage.afga.f(this.b, ((defpackage.gjv) obj).b) && (bitmap2 != null ? !((bitmap = ((defpackage.gjv) obj).d) == null || !bitmap2.sameAs(bitmap)) : ((defpackage.gjv) obj).d == null);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.b, this.d});
    }

    public final java.lang.String toString() {
        return "ImageInfo(imageUri=" + this.b + ", imageBitmap=" + this.d + ", signature=" + this.c + ")";
    }
}
