package defpackage;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final class swf implements swg {
    public final CountDownLatch a = new CountDownLatch(1);

    @Override // defpackage.svr
    public final void b() {
        this.a.countDown();
    }

    @Override // defpackage.svu
    public final void d(Exception exc) {
        this.a.countDown();
    }

    @Override // defpackage.svv
    public final void e(Object obj) {
        this.a.countDown();
    }
}
