package defpackage;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class xey extends qqh {
    public static final yph a = yph.c("GH.SetupActivity");
    public boolean b;
    private boolean c;
    private lhl d;

    @Override // defpackage.qqh
    public final void G() {
        this.c = true;
        lbh.d().d(this.d);
    }

    @Override // defpackage.qqh
    public final void a(Bundle bundle) {
        ((ype) a.l().ai((char) 10192)).y("onCreate: %s", q().toUri(0));
        this.c = false;
        this.d = new xew(this);
        lbh.d().gL(this.d, true);
        uqw.af(getBaseContext(), false, false, new xex(this));
    }

    public final void f() {
        if (!this.b) {
            ((ype) ((ype) a.h()).ai((char) 10191)).u("Stage not complete. Not finishing setup.");
            return;
        }
        if (this.c) {
            ((ype) ((ype) a.h()).ai((char) 10190)).u("Already destroyed.  Not finishing setup.");
        } else if (!lbh.d().gN()) {
            ((ype) ((ype) a.h()).ai((char) 10189)).u("Lifetime not started. Not finishing setup.");
        } else {
            ((ype) a.l().ai((char) 10188)).u("finishSetup");
            fp();
        }
    }
}
