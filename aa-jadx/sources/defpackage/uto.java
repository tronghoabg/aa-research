package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uto implements defpackage.utm {
    private android.graphics.Bitmap a;

    public uto(android.graphics.Bitmap bitmap) {
        this.a = bitmap;
        bitmap.getWidth();
        bitmap.getHeight();
    }

    @Override // defpackage.utm
    public final android.graphics.Bitmap a() {
        android.graphics.Bitmap bitmap = this.a;
        this.a = null;
        return bitmap;
    }

    @Override // defpackage.utz
    public final boolean b() {
        return this.a != null;
    }
}
