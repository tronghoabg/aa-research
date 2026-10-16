package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes3.dex */
public final class tjw implements tjy {
    private final /* synthetic */ int a;

    public tjw(int i) {
        this.a = i;
    }

    public static final IconCompat e(Uri uri) {
        uri.getClass();
        return IconCompat.l(uri);
    }

    @Override // defpackage.tjy
    public final /* synthetic */ Uri a(Object obj) {
        if (this.a == 0) {
            return (Uri) obj;
        }
        throw new IllegalStateException("Bitmaps cannot be efficiently encoded in a Uri");
    }

    @Override // defpackage.tjy
    public final /* synthetic */ IconCompat b(Object obj) {
        if (this.a == 0) {
            return e((Uri) obj);
        }
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        return IconCompat.k(bitmap);
    }

    @Override // defpackage.tjy
    public final /* synthetic */ IconCompat c(Uri uri) {
        return this.a != 0 ? szp.y(this, uri) : szp.y(this, uri);
    }

    @Override // defpackage.tjy
    public final /* synthetic */ Object d(Uri uri) {
        if (this.a == 0) {
            return uri;
        }
        throw new IllegalStateException("Bitmaps cannot be efficiently encoded in a Uri");
    }
}
