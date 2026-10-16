package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ufk extends ufj {
    private final ufn a;
    private final ufo b;
    private final Runnable c;
    private boolean d;
    private final utf e;
    private final uvg f;
    private final qsb g;
    private final gjv h;

    public ufk(ujl[] ujlVarArr, ufp ufpVar, uvg uvgVar, gjv gjvVar, utf utfVar, boolean z) {
        ufn ufnVar = new ufn();
        this.a = ufnVar;
        this.c = new ueh(this, 5);
        this.d = false;
        this.b = ufpVar;
        this.f = uvgVar;
        this.h = gjvVar;
        this.e = utfVar;
        this.g = new qsb(ufpVar, ujlVarArr);
        ufnVar.c = z;
    }

    public final synchronized void f() {
        usy usyVar = this.f.l;
        usyVar.getClass();
        ufo ufoVar = this.b;
        ufoVar.e();
        ufoVar.i(usyVar, this.a.a);
        ulw ulwVar = ((ufp) ufoVar).h;
        if (ulwVar != null && ((ufp) ufoVar).i != null) {
            uvg uvgVar = ((ufp) ufoVar).f;
            uvgVar.d(ulwVar, null);
            uvgVar.d(((ufp) ufoVar).i, ((ufp) ufoVar).g);
            ((ufp) ufoVar).v = true;
        }
        gjv gjvVar = this.h;
        gjvVar.m(this.c);
        gjvVar.l();
    }

    public final synchronized void g() {
        this.b.c();
        this.d = false;
    }

    public final synchronized void h() {
        this.b.g();
        this.h.l();
    }

    public final synchronized void i() {
        if (this.d) {
            usy usyVar = this.f.l;
            usyVar.getClass();
            ufn ufnVar = this.a;
            if (ufnVar.a(usyVar)) {
                this.g.g(usyVar, ufnVar);
                this.h.l();
            }
            this.b.i(usyVar, ufnVar.a);
            this.h.m(this.c);
        }
    }

    @Override // defpackage.ufj
    public final synchronized void j() {
        this.b.f(this.e);
        ArrayList arrayList = new ArrayList();
        qsb qsbVar = this.g;
        Object obj = qsbVar.c;
        int length = ((ufh[]) obj).length;
        for (int i = 0; i < length; i++) {
            arrayList.add(((ufh[]) obj)[i].a);
        }
        Object obj2 = qsbVar.b;
        ((ufp) obj2).i.getClass();
        umf umfVar = new umf(((ufp) obj2).q, arrayList);
        synchronized (((ufp) obj2).j) {
            tqs tqsVar = ((ufp) obj2).g;
            qrx qrxVar = ((ufp) obj2).x;
            ((ufp) obj2).w = new umi(umfVar);
            if (((ufp) obj2).k) {
                ((ufp) obj2).i.x = ((ufp) obj2).w;
            }
        }
        this.d = true;
        usy usyVar = this.f.l;
        if (usyVar != null) {
            if (!uui.b()) {
                usyVar = new usy(usyVar);
            }
            ufn ufnVar = this.a;
            if (ufnVar.a(usyVar)) {
                this.g.g(usyVar, ufnVar);
            }
            this.b.i(usyVar, ufnVar.a);
        }
        gjv gjvVar = this.h;
        gjvVar.m(this.c);
        gjvVar.l();
    }

    @Override // defpackage.ufj
    public final void k() {
        this.h.l();
    }

    @Override // defpackage.ufj
    public final void l() {
        g();
    }
}
