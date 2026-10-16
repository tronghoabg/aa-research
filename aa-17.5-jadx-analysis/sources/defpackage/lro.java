package defpackage;

import android.os.Handler;
import android.os.Looper;
import j$.time.Duration;

/* loaded from: classes2.dex */
public final class lro extends eql {
    public Object a;
    private final Duration k;
    private final Handler j = new Handler(Looper.getMainLooper());
    public boolean h = false;
    public boolean i = false;

    public lro(Duration duration, eqj eqjVar) {
        this.k = duration;
        r(eqjVar, new lnc(this, 10));
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void c() {
        super.c();
        this.j.postDelayed(new lqj(this, 4), this.k.toMillis());
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void d() {
        super.d();
        this.j.removeCallbacksAndMessages(null);
        this.a = null;
        this.h = false;
        this.i = false;
    }
}
