package defpackage;

import android.content.Intent;
import java.io.PrintWriter;

/* loaded from: classes2.dex */
public abstract class fud implements fuh {
    public geu a;
    public boolean b = true;
    private final String c;

    protected fud(geu geuVar, String str) {
        this.a = geuVar;
        this.c = str;
        a();
    }

    private final void a() {
        this.a.B().b(this, 11, new elt(this, 14));
        this.a.B().b(this, 10, new elt(this, 15));
    }

    public final void g() {
        woy.aa(this.b, "Accessed a host service after it became invalidated");
    }

    @Override // defpackage.fuh
    public final void h() {
        this.b = false;
    }

    public final void n(String str, Runnable runnable) {
        if (this.b) {
            runnable.run();
        } else {
            gks.k(this.c, "Accessed %s after host became invalidated", str);
        }
    }

    @Override // defpackage.fuh
    public void o(geu geuVar) {
        this.a.B().c(this, 11);
        this.a.B().c(this, 10);
        this.a = geuVar;
        a();
    }

    @Override // defpackage.fuh
    public void j() {
    }

    public void k() {
    }

    @Override // defpackage.fuh
    public void l() {
    }

    public void m() {
    }

    @Override // defpackage.fuh
    public void i(Intent intent) {
    }

    @Override // defpackage.gnp
    public void p(PrintWriter printWriter) {
    }
}
