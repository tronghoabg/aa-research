package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;

/* loaded from: classes2.dex */
public final class mrp implements rby {
    public mrn a;
    public Rect b;
    private Bitmap c;

    @Override // defpackage.rby
    public final View a(Context context) {
        if (this.a == null) {
            ((ype) mrq.a.l().ai((char) 5229)).u("inflating view");
            this.a = new mrn(context);
        }
        if (this.c != null) {
            ((ype) mrq.a.l().ai((char) 5228)).u("setting pending bitmap");
            this.a.b(this.c);
            this.c = null;
        }
        this.a.c(this.b);
        return this.a;
    }

    public final void b(Bitmap bitmap) {
        if (this.a != null) {
            ((ype) mrq.a.l().ai((char) 5232)).u("updateWallpaperBitmap updating bitmap");
            this.a.b(bitmap);
        } else {
            ((ype) mrq.a.l().ai((char) 5231)).u("updateWallpaperBitmap setting pending");
            this.c = bitmap;
        }
    }
}
