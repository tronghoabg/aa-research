package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class hqm implements hqz {
    public final Executor a;

    public hqm(Handler handler) {
        this.a = new fpe(handler, 2, null);
    }

    @Override // defpackage.hqz
    public final void a(hqt hqtVar, hrc hrcVar) {
        throw null;
    }

    @Override // defpackage.hqz
    public final void b(hqt hqtVar, scz sczVar) {
        throw null;
    }

    @Override // defpackage.hqz
    public final void c(hqt hqtVar, scz sczVar, Runnable runnable) {
        hqtVar.i();
        hqtVar.e("post-response");
        this.a.execute(new hql(hqtVar, sczVar, runnable, 0));
    }

    public hqm(Executor executor) {
        this.a = executor;
    }
}
