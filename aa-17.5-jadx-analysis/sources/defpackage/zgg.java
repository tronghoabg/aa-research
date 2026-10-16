package defpackage;

import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public final class zgg implements Runnable {
    zgp a;
    Future b;

    public zgg(zgp zgpVar, Future future) {
        this.a = zgpVar;
        this.b = future;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wub.ai(this.a, this.b);
        this.a = null;
        this.b = null;
    }
}
