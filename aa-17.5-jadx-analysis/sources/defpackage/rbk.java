package defpackage;

import android.graphics.Bitmap;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public final class rbk implements sli {
    public final Bitmap a;
    public final Status b;

    public rbk(Bitmap bitmap, Status status) {
        this.a = bitmap;
        this.b = status;
    }

    public final Bitmap a() {
        Bitmap bitmap;
        if (!Status.a.equals(this.b) || (bitmap = this.a) == null) {
            throw new IllegalStateException();
        }
        return bitmap;
    }

    @Override // defpackage.sli
    public final Status b() {
        return this.b;
    }
}
