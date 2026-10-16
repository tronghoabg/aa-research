package defpackage;

import android.os.Handler;
import j$.time.Duration;

/* loaded from: classes.dex */
public final class nfs extends lhf {
    public static final yph a = yph.c("GH.UserInterruptMgr");
    public static final Duration b = Duration.ofSeconds(10);
    public static final Duration c = Duration.ofSeconds(5);
    public static final Duration d = Duration.ofSeconds(35);
    public static final Duration e = Duration.ofSeconds(8);
    public long f = -1;
    public long g = -1;
    public int h = -1;
    public int i = 0;
    public final eqm k = new eqm(true);
    public final Handler l = new Handler(new gly(this, 8));

    public static nfs a() {
        return (nfs) mki.a.i(nfs.class);
    }

    @Override // defpackage.lhf, defpackage.lhg
    public final void c() {
        super.c();
        ((ype) a.l().ai((char) 5259)).u("start");
        ((eqj) nsy.a().a).fE(this, new mmt(this, 8));
    }

    @Override // defpackage.lhf, defpackage.lhg
    public final void d() {
        super.d();
        ((ype) a.l().ai((char) 5260)).u("stop");
        ((eqj) nsy.a().a).l(this);
        this.l.removeMessages(1);
    }
}
