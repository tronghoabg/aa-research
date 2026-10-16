package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public class ewt {
    public final ewv b;
    public final List c;
    public final List d;
    public boolean e;
    public mko f;

    public ewt(ewv ewvVar, boolean z) {
        this.b = ewvVar;
        afbe afbeVar = afbe.a;
        this.c = afbeVar;
        this.d = afbeVar;
        this.e = z;
    }

    protected void a() {
        throw null;
    }

    protected void b() {
        throw null;
    }

    protected void c(ews ewsVar) {
        throw null;
    }

    public void e() {
        throw null;
    }

    public final void f() {
        mko mkoVar = this.f;
        if (mkoVar == null || !((aaj) mkoVar.a).g(this)) {
            return;
        }
        ewx ewxVar = (ewx) mkoVar.b;
        if (affa.f(this, ewxVar.c)) {
            if (ewxVar.d == -1) {
                a();
            }
            ewxVar.c = null;
            ewxVar.d = 0;
            ewxVar.e = null;
        }
        ewxVar.a.remove(this);
        ewxVar.b.remove(this);
        this.f = null;
        ewxVar.b();
    }

    public final void g(boolean z) {
        if (this.e == z) {
            return;
        }
        this.e = z;
        mko mkoVar = this.f;
        if (mkoVar != null) {
            ((ewx) mkoVar.b).b();
        }
    }
}
