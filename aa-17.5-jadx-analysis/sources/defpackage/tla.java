package defpackage;

import android.os.Handler;
import android.os.Looper;
import j$.time.Duration;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class tla {
    public static final yph a = yph.c("GH.InterruptBgResource");
    public final String b;
    public final Looper c;
    public final Handler d;
    private final aitx e;
    private aivh f;
    private ajed g;
    private gjt h;

    public tla(String str, Looper looper, Executor executor) {
        looper.getClass();
        this.b = str;
        this.c = looper;
        this.e = ahni.b(aiji.b(executor).plus(new aitw("GH.InterruptBgResource")));
        this.d = new Handler(looper);
        this.h = new gjt(tkr.b, new tim(this, 5));
        this.f = aiir.a(afak.a);
        int i = ajee.a;
        this.g = new ajed(1, 0);
    }

    public final void a(tks tksVar, Duration duration, tkw tkwVar) {
        if (this.h.e() != tkr.b) {
            throw new IllegalStateException("scheduleSetup called consecutively");
        }
        a.l().y("[%s] Scheduling setup", this.b);
        this.h = new gjt(tkr.a, new tim(this, 3));
        int i = ajee.a;
        ajed ajedVar = new ajed(2, 2);
        this.g = ajedVar;
        gjt gjtVar = this.h;
        aivh aivhVar = this.f;
        ajed ajedVar2 = new ajed(1, 1);
        gjt gjtVar2 = new gjt(tkx.a, new tim(this, 4));
        aitx aitxVar = this.e;
        aivh aivhVarD = ahnc.d(aitxVar, null, 0, new fry(aivhVar, ajedVar2, this, tksVar, gjtVar, gjtVar2, tkwVar, (afck) null, 4), 3);
        this.f = ahnc.d(aitxVar, null, 0, new foz(ajedVar, this, tksVar, aivhVarD, (afck) null, 7), 3);
        if (duration != null) {
            ahnc.d(aitxVar, null, 0, new tkz(ajedVar2, duration, this, aivhVarD, gjtVar, gjtVar2, ajedVar, tkwVar, null), 3);
        }
    }

    public final void b() {
        if (this.h.e() != tkr.a) {
            throw new IllegalStateException("scheduleTeardown called consecutively");
        }
        a.l().y("[%s] Scheduling teardown", this.b);
        this.h.f(tkr.b);
        this.g.h();
    }
}
