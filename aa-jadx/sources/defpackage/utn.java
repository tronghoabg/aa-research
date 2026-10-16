package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class utn implements defpackage.utm {
    public final defpackage.uwv a;
    private final android.graphics.Bitmap b;

    public utn(android.graphics.Bitmap bitmap) {
        this.b = bitmap;
        this.a = bitmap != null ? new defpackage.uwv(bitmap.getWidth(), bitmap.getHeight()) : new defpackage.uwv(0, 0);
    }

    @Override // defpackage.utm
    public final android.graphics.Bitmap a() {
        return this.b;
    }

    @Override // defpackage.utz
    public final boolean b() {
        return true;
    }
}
