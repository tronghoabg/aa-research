package defpackage;

import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class rvu implements rso {
    ruq a;
    private final rso b;
    private final rsq c;
    private final mmc d;

    public rvu(rso rsoVar, rsq rsqVar, mmc mmcVar) {
        this.b = rsoVar;
        this.c = rsqVar;
        this.d = mmcVar;
    }

    @Override // defpackage.rso
    public final ruq b(rut rutVar) {
        this.a = this.b.b(rutVar);
        return new rvy(this.a, this.c, this.d);
    }

    @Override // defpackage.rso
    public final void gl(PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.rso
    public final void k() {
        throw null;
    }

    @Override // defpackage.rso
    public final void l(ruq ruqVar) {
        this.b.l(this.a);
    }
}
