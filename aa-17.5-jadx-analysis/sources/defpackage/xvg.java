package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class xvg extends xvh {
    public final zhc a = new zhc();
    public final AtomicReference b = new AtomicReference(xvf.a);
    final /* synthetic */ aacq c;

    public xvg(aacq aacqVar) {
        this.c = aacqVar;
    }

    @Override // defpackage.xvh
    public final zgp a() {
        return this.a;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        this.c.m(!a.h(this.b, xvf.a, xvf.c) ? 1 : 0, this);
    }
}
