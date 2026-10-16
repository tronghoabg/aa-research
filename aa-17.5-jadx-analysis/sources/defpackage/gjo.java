package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class gjo {
    public static final gjo a = new gjo(null, null, null);
    public final Uri b;
    public final Object c;
    public final Bitmap d;

    public gjo(Uri uri, Bitmap bitmap, Object obj) {
        this.b = uri;
        this.c = obj;
        this.d = (bitmap == null || bitmap.getHeight() <= 0 || bitmap.getWidth() <= 0) ? null : bitmap;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gjo)) {
            return false;
        }
        Bitmap bitmap2 = this.d;
        return affa.f(this.b, ((gjo) obj).b) && (bitmap2 != null ? !((bitmap = ((gjo) obj).d) == null || !bitmap2.sameAs(bitmap)) : ((gjo) obj).d == null);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.d);
    }

    public final String toString() {
        return "ImageInfo(imageUri=" + this.b + ", imageBitmap=" + this.d + ", signature=" + this.c + ")";
    }
}
