package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class prq extends prb {
    private final Looper e;
    private final Handler f;

    /* JADX WARN: Illegal instructions before constructor call */
    public prq(Looper looper, psb psbVar, tmb tmbVar) {
        String str = psbVar.M;
        psbVar.b();
        super(str, psbVar.a(), tmbVar, null);
        this.e = looper;
        this.f = new Handler(looper);
    }

    @Override // defpackage.prb
    protected final void j(pqz pqzVar) {
        this.f.postDelayed(pqzVar, pqzVar.getDelay(TimeUnit.MILLISECONDS));
    }

    @Override // defpackage.prb
    public final void l() {
        Looper looper = this.e;
        woy.Z(looper != Looper.getMainLooper());
        this.f.post(new pru(this, 1));
        looper.quitSafely();
    }
}
