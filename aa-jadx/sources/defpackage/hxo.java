package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class hxo implements defpackage.hxn {
    @Override // defpackage.hxn
    public final android.graphics.Bitmap a(int i, int i2, android.graphics.Bitmap.Config config) {
        return android.graphics.Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.hxn
    public final android.graphics.Bitmap b(int i, int i2, android.graphics.Bitmap.Config config) {
        return android.graphics.Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.hxn
    public void d(android.graphics.Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.hxn
    public final void c() {
    }

    @Override // defpackage.hxn
    public final void e(int i) {
    }
}
