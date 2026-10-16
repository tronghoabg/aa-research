package defpackage;

import android.view.KeyEvent;
import java.util.List;

/* loaded from: classes.dex */
public class ajk extends air {
    private cqu i;
    private cpl j;

    public ajk(asf asfVar, akm akmVar, boolean z, boolean z2, String str, ddo ddoVar, afdr afdrVar) {
        super(asfVar, akmVar, z, z2, str, ddoVar, afdrVar);
    }

    private final void J(boolean z) {
        if (z) {
            this.j = null;
        } else {
            this.i = null;
        }
        i(z);
        this.d = "idle";
    }

    @Override // defpackage.air
    protected final void F(KeyEvent keyEvent) {
        u();
    }

    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.air, defpackage.cpm
    public final void H(aagd aagdVar, cqm cqmVar) {
        super.H(aagdVar, cqmVar);
        int i = 0;
        if (cqmVar != cqm.b) {
            if (cqmVar == cqm.c) {
                if (this.j != null) {
                    ?? r9 = aagdVar.c;
                    int size = r9.size();
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        cpl cplVar = (cpl) r9.get(i);
                        if (cplVar.g && !affa.f(cplVar, this.j)) {
                            J(true);
                            break;
                        }
                        i++;
                    }
                }
                if (affa.f(this.d, "recognized")) {
                    this.d = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.j == null) {
            ?? r92 = aagdVar.c;
            int size2 = r92.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (ca.aI((cpl) r92.get(i2))) {
                    cpl cplVar2 = (cpl) r92.get(0);
                    cplVar2.a();
                    this.j = cplVar2;
                    if (this.b) {
                        this.d = "waiting";
                        k(cplVar2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        ?? r93 = aagdVar.c;
        int size3 = r93.size();
        for (int i3 = 0; i3 < size3; i3++) {
            if (!afp.u((cpl) r93.get(i3))) {
                float fD = ((dcc) bzi.x(this, dbc.n)).d();
                int size4 = r93.size();
                while (i < size4) {
                    cpl cplVar3 = (cpl) r93.get(i);
                    long j = cplVar3.c;
                    cpl cplVar4 = this.j;
                    cplVar4.getClass();
                    float fAbs = Math.abs(cja.a(aclh.y(j, cplVar4.c)));
                    if (cplVar3.g || fAbs > fD) {
                        J(true);
                        return;
                    }
                    i++;
                }
                return;
            }
        }
        ((cpl) r93.get(0)).a();
        if (this.b) {
            this.d = "recognized";
            cpl cplVar5 = this.j;
            cplVar5.getClass();
            j(cplVar5.c, true);
            u();
        }
        this.j = null;
    }

    @Override // defpackage.cpm
    public final void I() {
        J(true);
    }

    @Override // defpackage.air, defpackage.cys
    public final void o() {
        super.o();
        J(false);
    }

    @Override // defpackage.air, defpackage.cys
    public final void s(cql cqlVar, cqm cqmVar, long j) {
        super.s(cqlVar, cqmVar, j);
        if (cqmVar != cqm.b) {
            if (cqmVar == cqm.c) {
                if (this.i != null) {
                    List list = cqlVar.a;
                    int size = list.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        cqu cquVar = (cqu) list.get(i);
                        if (cquVar.c() && !affa.f(cquVar, this.i)) {
                            J(false);
                            break;
                        }
                        i++;
                    }
                }
                if (affa.f(this.d, "recognized")) {
                    this.d = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.i == null) {
            if (aqx.f(cqlVar, true)) {
                cqu cquVar2 = (cqu) cqlVar.a.get(0);
                cquVar2.b();
                this.i = cquVar2;
                if (this.b) {
                    this.d = "waiting";
                    l(cquVar2);
                    return;
                }
                return;
            }
            return;
        }
        List list2 = cqlVar.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!tl.l((cqu) list2.get(i2))) {
                long jA = a(j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    cqu cquVar3 = (cqu) list2.get(i3);
                    if (cquVar3.c() || tl.n(cquVar3, j, jA)) {
                        J(false);
                        return;
                    }
                }
                return;
            }
        }
        ((cqu) list2.get(0)).b();
        if (this.b) {
            this.d = "recognized";
            cqu cquVar4 = this.i;
            cquVar4.getClass();
            j(cquVar4.c, false);
            u();
        }
        this.i = null;
    }

    @Override // defpackage.air
    protected final void G(KeyEvent keyEvent) {
    }
}
