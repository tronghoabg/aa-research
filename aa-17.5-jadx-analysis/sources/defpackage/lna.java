package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes.dex */
public final class lna extends Handler {
    public int a = 0;
    public String b;
    public String c;
    public String d;
    public long e;
    public Bitmap f;
    public final kft g;
    public lmz h;
    final /* synthetic */ lnb i;
    public kfs j;
    private lmd k;
    private Uri l;

    protected lna(lnb lnbVar) {
        this.i = lnbVar;
        Context context = lnbVar.b;
        if (kft.b == null) {
            synchronized (kft.c) {
                if (kft.b == null) {
                    kft.b = new kft(context);
                }
            }
        }
        this.g = kft.b;
    }

    private final void a(Bitmap bitmap) {
        if (bitmap == null) {
            this.f = null;
        } else if (bitmap.getWidth() > 256 || bitmap.getHeight() > 256) {
            ((ype) ((ype) lnb.a.h()).ai((char) 4025)).u("Image exceeded 256x256, omitting it from car metadata update");
            this.f = null;
        } else {
            this.f = bitmap;
        }
        lmz lmzVar = this.h;
        if (lmzVar != null) {
            lmzVar.cancel(true);
        }
        lmz lmzVar2 = new lmz(this, this.a);
        this.h = lmzVar2;
        lmzVar2.execute(this.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x011d  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r14) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lna.handleMessage(android.os.Message):void");
    }
}
