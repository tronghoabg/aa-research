package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ima implements defpackage.jjd {
    public final /* synthetic */ defpackage.imi a;
    public final /* synthetic */ qwz b;
    private final /* synthetic */ int c;

    public /* synthetic */ ima(defpackage.imi imiVar, qwz qwzVar, int i) {
        this.c = i;
        this.a = imiVar;
        this.b = qwzVar;
    }

    @Override // defpackage.jjd
    public final void a(android.graphics.Bitmap bitmap) {
        int i = this.c;
        if (i == 0) {
            qwz qwzVar = this.b;
            defpackage.imi imiVar = this.a;
            try {
                com.google.android.gms.common.data.BitmapTeleporter bitmapTeleporter = new com.google.android.gms.common.data.BitmapTeleporter(bitmap);
                bitmapTeleporter.b(imiVar.F.getCacheDir());
                ((defpackage.yqj) defpackage.imi.b.l().ai(327)).u("Calling callback.onScreenshotCompleted()");
                qwzVar.e(bitmapTeleporter);
                return;
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.imi.b.g()).p(e)).ai((char) 328)).u("Client died whilst trying to return screenshot");
                return;
            }
        }
        if (i != 1) {
            try {
                com.google.android.gms.common.data.BitmapTeleporter bitmapTeleporter2 = new com.google.android.gms.common.data.BitmapTeleporter(bitmap);
                bitmapTeleporter2.b(this.a.F.getCacheDir());
                this.b.e(bitmapTeleporter2);
                return;
            } catch (android.os.RemoteException unused) {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.imi.b.g()).ai((char) 293)).u("Client died whilst trying to return screenshot");
                return;
            }
        }
        qwz qwzVar2 = this.b;
        defpackage.imi imiVar2 = this.a;
        try {
            com.google.android.gms.common.data.BitmapTeleporter bitmapTeleporter3 = new com.google.android.gms.common.data.BitmapTeleporter(bitmap);
            bitmapTeleporter3.b(imiVar2.F.getCacheDir());
            ((defpackage.yqj) defpackage.imi.b.l().ai(329)).u("Calling callback.onScreenshotCompleted()");
            qwzVar2.e(bitmapTeleporter3);
        } catch (android.os.RemoteException e2) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.imi.b.g()).p(e2)).ai((char) 330)).u("Client died whilst trying to return screenshot");
        }
    }

    public ima(defpackage.imi imiVar, qwz qwzVar, int i, char[] cArr) {
        this.c = i;
        this.b = qwzVar;
        this.a = imiVar;
    }
}
