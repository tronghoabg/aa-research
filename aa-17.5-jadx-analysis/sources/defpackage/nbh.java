package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class nbh {
    public final Bitmap a;

    public nbh(Bitmap bitmap) {
        this.a = bitmap;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nbh)) {
            return false;
        }
        Bitmap bitmap = this.a;
        if (bitmap.isRecycled()) {
            return false;
        }
        Bitmap bitmap2 = ((nbh) obj).a;
        if (bitmap2.isRecycled()) {
            return false;
        }
        return bitmap.sameAs(bitmap2);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
