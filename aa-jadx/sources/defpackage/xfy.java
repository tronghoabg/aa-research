package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xfy extends defpackage.qrd {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.SetupActivity");
    public boolean b;
    private boolean c;
    private defpackage.lhs d;

    @Override // defpackage.qrd
    public final void G() {
        this.c = true;
        defpackage.ler.c().d(this.d);
    }

    @Override // defpackage.qrd
    public final void a(android.os.Bundle bundle) {
        ((defpackage.yqj) a.l().ai((char) 10220)).y("onCreate: %s", q().toUri(0));
        this.c = false;
        this.d = new defpackage.xfw(this);
        defpackage.ler.c().fW(this.d, true);
        defpackage.sqg.p(getBaseContext(), false, false, new defpackage.xfx(this));
    }

    public final void f() {
        if (!this.b) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 10219)).u("Stage not complete. Not finishing setup.");
            return;
        }
        if (this.c) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 10218)).u("Already destroyed.  Not finishing setup.");
        } else if (!defpackage.ler.c().fY()) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 10217)).u("Lifetime not started. Not finishing setup.");
        } else {
            ((defpackage.yqj) a.l().ai((char) 10216)).u("finishSetup");
            ex();
        }
    }
}
