package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class dqy extends drj {
    ArrayList a;
    private int b;

    public dqy(dqn dqnVar, int i) {
        dqn dqnVar2;
        ArrayList arrayList;
        super(dqnVar);
        this.a = new ArrayList();
        this.f = i;
        dqn dqnVar3 = this.d;
        dqn dqnVarN = dqnVar3.n(i);
        while (true) {
            dqn dqnVar4 = dqnVarN;
            dqnVar2 = dqnVar3;
            dqnVar3 = dqnVar4;
            if (dqnVar3 == null) {
                break;
            } else {
                dqnVarN = dqnVar3.n(this.f);
            }
        }
        this.d = dqnVar2;
        this.a.add(dqnVar2.o(this.f));
        dqn dqnVarM = dqnVar2.m(this.f);
        while (true) {
            arrayList = this.a;
            if (dqnVarM == null) {
                break;
            }
            arrayList.add(dqnVarM.o(this.f));
            dqnVarM = dqnVarM.m(this.f);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            drj drjVar = (drj) arrayList.get(i2);
            int i3 = this.f;
            if (i3 == 0) {
                drjVar.d.m = this;
            } else if (i3 == 1) {
                drjVar.d.n = this;
            }
        }
        if (this.f == 0 && ((dqo) this.d.ae).d && this.a.size() > 1) {
            this.d = ((drj) this.a.get(r6.size() - 1)).d;
        }
        this.b = this.f == 0 ? this.d.at : this.d.au;
    }

    private final dqn g() {
        for (int i = 0; i < this.a.size(); i++) {
            dqn dqnVar = ((drj) this.a.get(i)).d;
            if (dqnVar.ar != 8) {
                return dqnVar;
            }
        }
        return null;
    }

    private final dqn n() {
        dqn dqnVar;
        int size = this.a.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            dqnVar = ((drj) this.a.get(size)).d;
        } while (dqnVar.ar == 8);
        return dqnVar;
    }

    @Override // defpackage.drj
    public final long a() {
        int size = this.a.size();
        long jA = 0;
        for (int i = 0; i < size; i++) {
            jA = jA + r4.h.e + ((drj) this.a.get(i)).a() + r4.i.e;
        }
        return jA;
    }

    @Override // defpackage.drj
    public final void b() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((drj) arrayList.get(i)).b();
        }
        int size2 = this.a.size();
        if (size2 <= 0) {
            return;
        }
        dqn dqnVar = ((drj) this.a.get(0)).d;
        dqn dqnVar2 = ((drj) this.a.get(size2 - 1)).d;
        if (this.f == 0) {
            dqm dqmVar = dqnVar.T;
            dqm dqmVar2 = dqnVar2.V;
            drb drbVarL = l(dqmVar, 0);
            int iB = dqmVar.b();
            dqn dqnVarG = g();
            if (dqnVarG != null) {
                iB = dqnVarG.T.b();
            }
            if (drbVarL != null) {
                j(this.h, drbVarL, iB);
            }
            drb drbVarL2 = l(dqmVar2, 0);
            int iB2 = dqmVar2.b();
            dqn dqnVarN = n();
            if (dqnVarN != null) {
                iB2 = dqnVarN.V.b();
            }
            if (drbVarL2 != null) {
                j(this.i, drbVarL2, -iB2);
            }
        } else {
            dqm dqmVar3 = dqnVar.U;
            dqm dqmVar4 = dqnVar2.W;
            drb drbVarL3 = l(dqmVar3, 1);
            int iB3 = dqmVar3.b();
            dqn dqnVarG2 = g();
            if (dqnVarG2 != null) {
                iB3 = dqnVarG2.U.b();
            }
            if (drbVarL3 != null) {
                j(this.h, drbVarL3, iB3);
            }
            drb drbVarL4 = l(dqmVar4, 1);
            int iB4 = dqmVar4.b();
            dqn dqnVarN2 = n();
            if (dqnVarN2 != null) {
                iB4 = dqnVarN2.W.b();
            }
            if (drbVarL4 != null) {
                j(this.i, drbVarL4, -iB4);
            }
        }
        this.h.a = this;
        this.i.a = this;
    }

    @Override // defpackage.drj
    public final void c() {
        for (int i = 0; i < this.a.size(); i++) {
            ((drj) this.a.get(i)).c();
        }
    }

    @Override // defpackage.drj
    public final void d() {
        this.l = null;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((drj) arrayList.get(i)).d();
        }
    }

    @Override // defpackage.drj
    public final boolean e() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (!((drj) this.a.get(i)).e()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0197  */
    @Override // defpackage.drj, defpackage.dqz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 1001
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqy.f():void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            drj drjVar = (drj) arrayList.get(i);
            sb.append("<");
            sb.append(drjVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
