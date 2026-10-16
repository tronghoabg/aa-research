package defpackage;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.data.BitmapTeleporter;

/* loaded from: classes2.dex */
public final class ilv implements jiw {
    final /* synthetic */ qwd a;
    final /* synthetic */ ima b;
    private final /* synthetic */ int c;

    public ilv(ima imaVar, qwd qwdVar, int i) {
        this.c = i;
        this.a = qwdVar;
        this.b = imaVar;
    }

    @Override // defpackage.jiw
    public final void a(Bitmap bitmap) {
        if (this.c == 0) {
            try {
                BitmapTeleporter bitmapTeleporter = new BitmapTeleporter(bitmap);
                bitmapTeleporter.b(this.b.F.getCacheDir());
                this.a.e(bitmapTeleporter);
                return;
            } catch (RemoteException unused) {
                ((ype) ((ype) ima.b.g()).ai((char) 293)).u("Client died whilst trying to return screenshot");
                return;
            }
        }
        qwd qwdVar = this.a;
        ima imaVar = this.b;
        try {
            BitmapTeleporter bitmapTeleporter2 = new BitmapTeleporter(bitmap);
            bitmapTeleporter2.b(imaVar.F.getCacheDir());
            ((ype) ima.b.l().ai(329)).u("Calling callback.onScreenshotCompleted()");
            qwdVar.e(bitmapTeleporter2);
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) ima.b.g()).p(e)).ai((char) 330)).u("Client died whilst trying to return screenshot");
        }
    }

    public /* synthetic */ ilv(ima imaVar, qwd qwdVar, int i, byte[] bArr) {
        this.c = i;
        this.b = imaVar;
        this.a = qwdVar;
    }
}
