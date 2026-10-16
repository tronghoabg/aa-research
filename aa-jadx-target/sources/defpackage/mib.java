package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mib implements defpackage.lhn {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.ProjectedApps");
    public tmr b;
    public java.lang.Runnable c;
    public android.content.Context d;
    public android.content.ComponentName e;
    public rpg h;
    public final java.util.List f = new java.util.ArrayList();
    public final java.util.Map g = new java.util.HashMap();
    private final defpackage.mph i = new defpackage.mhy(this);

    public static defpackage.mib a() {
        return (defpackage.mib) defpackage.mkp.a.b(defpackage.mib.class, new defpackage.lga(6));
    }

    public final void b(defpackage.mqj mqjVar) {
        android.content.Intent intentA = mqjVar.a.a();
        ((defpackage.yqj) a.l().ai((char) 4967)).y("Launching %s", intentA.toUri(0));
        this.e = mqjVar.a();
        defpackage.mpk.a().i(intentA);
    }

    @Override // defpackage.lhn
    public final void d() {
        synchronized (this) {
            rpg rpgVar = this.h;
            if (rpgVar != null) {
                rpgVar.b = null;
                this.h.b();
                this.h = null;
                ((defpackage.yqj) a.l().ai(4974)).u("Released vendor extension manager");
            }
        }
        defpackage.mpj.b().j(this.i);
        tmr tmrVar = this.b;
        if (tmrVar != null) {
            tmrVar.close();
        }
        java.util.Iterator it = this.g.values().iterator();
        while (it.hasNext()) {
            try {
                mka mkaVar = ((mia) it.next()).b;
            } catch (java.io.IOException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 4973)).u("Could not close callback");
            }
        }
        this.g.clear();
        this.e = null;
        this.c = null;
    }

    public final void e(akhe akheVar, java.lang.String str) {
        defpackage.wfp.b();
        defpackage.kgu.d(new mjf(this, str, akheVar, 1), "GH.ProjectedApps", defpackage.zbe.PROJECTED_APPS, defpackage.zbd.MN, "Could not send %s", str);
    }

    @Override // defpackage.lhn
    public final void eQ() {
        if (defpackage.acwm.c()) {
            defpackage.mkp mkpVar = defpackage.mkp.a;
            this.d = mkpVar.c;
            mkpVar.d.execute(new defpackage.lzk(this, 9));
            defpackage.mpj.b().g(this.i);
        }
    }
}
