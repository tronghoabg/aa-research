package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public class hxf implements hxe {
    @Override // defpackage.hxe
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.hxe
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.hxe
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.hxe
    public final void c() {
    }

    @Override // defpackage.hxe
    public final void e(int i) {
    }
}
