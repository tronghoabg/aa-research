package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* loaded from: classes2.dex */
public class hrl extends hqt {
    private static final Object n = new Object();
    private final Object o;
    private hqy p;
    private final Bitmap.Config q;

    @Deprecated
    public hrl(String str, hqy hqyVar, Bitmap.Config config, hqx hqxVar) {
        super(0, str, hqxVar);
        this.o = new Object();
        this.l = new hqk(1000, 2, 2.0f);
        this.p = hqyVar;
        this.q = config;
    }

    @Override // defpackage.hqt
    public final void f() {
        super.f();
        synchronized (this.o) {
            this.p = null;
        }
    }

    @Override // defpackage.hqt
    protected final /* bridge */ /* synthetic */ void g(Object obj) {
        hqy hqyVar;
        Bitmap bitmap = (Bitmap) obj;
        synchronized (this.o) {
            hqyVar = this.p;
        }
        if (hqyVar != null) {
            hqyVar.b(bitmap);
        }
    }

    @Override // defpackage.hqt
    public final int m() {
        return 1;
    }

    @Override // defpackage.hqt
    protected final scz o(hqq hqqVar) {
        scz sczVar;
        synchronized (n) {
            try {
                try {
                    byte[] bArr = hqqVar.b;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inPreferredConfig = this.q;
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                    sczVar = bitmapDecodeByteArray == null ? new scz(new hqs(hqqVar)) : new scz(bitmapDecodeByteArray, hdm.d(hqqVar));
                } catch (OutOfMemoryError e) {
                    hrf.b("Caught OOM for %d byte image, url=%s", Integer.valueOf(hqqVar.b.length), this.c);
                    return new scz(new hqs(e));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sczVar;
    }
}
