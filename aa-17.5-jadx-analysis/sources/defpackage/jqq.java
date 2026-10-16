package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class jqq implements jbm {
    private static final yph a = yph.c("GH.SelectSvcStarter");
    private final yfq b;
    private final Runnable c;

    public jqq(List list, Runnable runnable) {
        this.b = yfq.o(list);
        this.c = runnable;
    }

    @Override // defpackage.jbm
    public final void a() {
        ((ype) ((ype) a.f()).ai((char) 2652)).u("All services have been started.");
        this.c.run();
    }

    @Override // defpackage.jbm
    public final boolean b(int i) {
        boolean zContains = this.b.contains(Integer.valueOf(i));
        ((ype) ((ype) a.f()).ai((char) 2653)).w("Ok to start service %d", i);
        return zContains;
    }
}
