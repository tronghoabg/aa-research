package defpackage;

import android.os.Handler;

/* loaded from: classes.dex */
public final class ryz implements ryb {
    public static final ypf a = ols.R("CAR.GAL.GAL");
    private final Handler f;
    public final Object b = new Object();
    public ryx c = null;
    public int d = 0;
    public final long e = adbr.a.gu().j();
    private final Runnable g = new rsv(this, 10);

    public ryz(Handler handler) {
        this.f = handler;
    }

    @Override // defpackage.ryb
    public final void c(ryx ryxVar) {
        ryx ryxVar2;
        synchronized (this.b) {
            if (!ryxVar.c && ((ryxVar2 = this.c) == null || ryxVar2.c)) {
                this.d++;
            }
            this.c = ryxVar;
        }
    }

    @Override // defpackage.ryb
    public final /* synthetic */ String[] f() {
        return roc.g();
    }

    public final void g() {
        synchronized (this.b) {
            this.d = 0;
            this.c = null;
        }
    }

    @Override // defpackage.ryb
    public final void v(String str, xxh xxhVar) {
        if (xxhVar.f() && yxi.FRAMER_READ_IO_EXCEPTION.equals(xxhVar.b())) {
            g();
            Handler handler = this.f;
            Runnable runnable = this.g;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, this.e);
        }
    }

    @Override // defpackage.ryb
    public final void d() {
    }

    @Override // defpackage.ryb
    public final void e() {
    }

    @Override // defpackage.ryb
    public final void b(ryv ryvVar) {
    }
}
