package defpackage;

import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class mal implements lhg, mnd {
    public static final yph a = yph.c("GH.GhNavFocusManager");
    public boolean b;
    public boolean c;
    public boolean d;
    public maj e = maj.a;
    public roe f;
    public ajmd g;

    public static mal a() {
        return (mal) mki.a.i(mal.class);
    }

    public final void b(boolean z) throws qrz {
        roe roeVar = this.f;
        roeVar.getClass();
        roeVar.c(1, z ? 1 : 0);
    }

    @Override // defpackage.lhg
    public final void c() {
        wer.c();
        if (this.b) {
            ((ype) ((ype) a.h()).ai((char) 4643)).u("NavigationFocusManager is already started.");
            return;
        }
        ((ype) a.l().ai((char) 4642)).u("Starting NavigationFocusManager");
        mnc.a().b(mnb.p, this);
        kgq.d(new kyi(this, 5), "GH.GhNavFocusManager", yzz.APP_HOST_CONTEXT, yzy.ql, "Non-recoverable error during initialization. Bailing.", new Object[0]);
    }

    @Override // defpackage.lhg
    public final void d() {
        wer.c();
        mnc.a().d(mnb.p);
        if (!this.b) {
            ((ype) ((ype) a.h()).ai((char) 4645)).u("NavigationFocusManager is already stopped.");
            return;
        }
        ((ype) a.l().ai((char) 4644)).u("Stopping NavigationFocusManager");
        e(maj.b);
        this.d = false;
        roe roeVar = this.f;
        if (roeVar != null) {
            roeVar.a();
        }
        this.f = null;
        this.b = false;
    }

    public final void e(maj majVar) {
        ajmd ajmdVar;
        maj majVar2 = this.e;
        this.e = majVar;
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai(4640)).M("setFocus previous=%s current=%s", majVar2, this.e);
        maj majVar3 = this.e;
        maj majVar4 = maj.e;
        boolean z = majVar3 == majVar4 || majVar3 == maj.d;
        if (z == (majVar2 == majVar4 || majVar2 == maj.d) || (ajmdVar = this.g) == null || z) {
            return;
        }
        ((ype) ((ype) yphVar.f()).ai((char) 4641)).u("setFocus sending onFocusLost");
        ajmdVar.E();
        this.g = null;
    }

    public final ajmd f() {
        wer.c();
        return this.g;
    }

    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        printWriter.printf("Focus State: %d Category Ownership %b\n", Integer.valueOf(this.e.ordinal()), Boolean.valueOf(this.d));
        ajmd ajmdVar = this.g;
        if (ajmdVar == null) {
            printWriter.println("No current ownership.");
        } else {
            printWriter.printf("Current Owner: %s", ajmdVar.D());
        }
    }
}
