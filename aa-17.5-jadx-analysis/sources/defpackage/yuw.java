package defpackage;

import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
final class yuw implements Runnable {
    final /* synthetic */ zhc a;
    final /* synthetic */ yux b;

    public yuw(yux yuxVar, zhc zhcVar) {
        this.a = zhcVar;
        this.b = yuxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zhc zhcVar = this.a;
            if (!zhcVar.isCancelled()) {
                if (wub.af(zhcVar) == yux.b) {
                    return;
                }
            }
        } catch (ExecutionException unused) {
        }
        this.b.r(this.a);
    }
}
