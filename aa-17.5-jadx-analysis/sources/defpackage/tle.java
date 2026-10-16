package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class tle {
    public static final yph a = yph.c("GH.NoCallbackBgResource");
    public final String b;
    public final Thread c;
    public final ajed d;
    public final ajed e;
    private final aitx f;
    private final gjt g;

    public tle(String str, Thread thread, Executor executor) {
        thread.getClass();
        this.b = str;
        this.c = thread;
        this.g = new gjt(tlb.b, new tim(this, 6));
        int i = ajee.a;
        this.d = new ajed(1, 0);
        this.e = new ajed(1, 1);
        this.f = ahni.b(aiji.b(executor).plus(new aitw("GH.NoCallbackBgResource")));
    }

    public final void a(tlc tlcVar) {
        gjt gjtVar = this.g;
        if (gjtVar.e() != tlb.b) {
            throw new IllegalStateException("scheduleSetup called twice in a row");
        }
        gjtVar.f(tlb.a);
        a.l().y("[%s] Scheduling setup", this.b);
        ahnc.d(this.f, null, 0, new nkn(this, tlcVar, (afck) null, 16), 3);
    }

    public final void b(tld tldVar) {
        gjt gjtVar = this.g;
        if (gjtVar.e() != tlb.a) {
            throw new IllegalStateException("scheduleTeardown called twice in a row, or called without scheduleSetup");
        }
        gjtVar.f(tlb.b);
        a.l().y("[%s] Scheduling teardown", this.b);
        ahnc.d(this.f, null, 0, new nkn(this, tldVar, (afck) null, 17), 3);
    }
}
