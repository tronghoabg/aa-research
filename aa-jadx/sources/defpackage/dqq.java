package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dqq extends defpackage.dqk {
    public dqq(defpackage.dqh dqhVar) {
        super(dqhVar, 2);
    }

    @Override // defpackage.dqd, defpackage.dpx, defpackage.dqe
    public final void e() {
        java.util.ArrayList arrayList = this.am;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            defpackage.dpx dpxVarB = this.al.b(arrayList.get(i));
            if (dpxVarB.R != null) {
                dpxVarB.ak = 9;
            } else {
                dpxVarB.ak = 10;
            }
            dpxVarB.k();
            dpxVarB.ak = 15;
            dpxVarB.k();
            dpxVarB.ak = dpxVarB.U != null ? 12 : 13;
            dpxVarB.k();
        }
        int size2 = arrayList.size();
        defpackage.dpx dpxVar = null;
        int i2 = 0;
        defpackage.dpx dpxVar2 = null;
        while (i2 < size2) {
            java.lang.Object obj = arrayList.get(i2);
            defpackage.dpx dpxVarB2 = this.al.b(obj);
            if (dpxVar2 == null) {
                java.lang.Object obj2 = this.R;
                if (obj2 != null) {
                    dpxVarB2.v(obj2);
                    dpxVarB2.o(this.n);
                    dpxVarB2.p(this.t);
                } else {
                    java.lang.Object obj3 = this.S;
                    if (obj3 != null) {
                        dpxVarB2.u(obj3);
                        dpxVarB2.o(this.n);
                        dpxVarB2.p(this.t);
                    } else {
                        java.lang.String string = dpxVarB2.a.toString();
                        dpxVarB2.v(defpackage.dqh.a);
                        dpxVarB2.w(java.lang.Float.valueOf(D(string)));
                        dpxVarB2.q(java.lang.Float.valueOf(C(string)));
                    }
                }
                dpxVar2 = dpxVarB2;
            }
            if (dpxVar != null) {
                java.lang.String string2 = dpxVar.a.toString();
                java.lang.String string3 = dpxVarB2.a.toString();
                dpxVar.j(dpxVarB2.a);
                dpxVar.w(java.lang.Float.valueOf(B(string2)));
                dpxVar.q(java.lang.Float.valueOf(A(string2)));
                dpxVarB2.u(dpxVar.a);
                dpxVarB2.w(java.lang.Float.valueOf(D(string3)));
                dpxVarB2.q(java.lang.Float.valueOf(C(string3)));
            }
            float fE = E(obj.toString());
            if (fE != -1.0f) {
                dpxVarB2.g = fE;
            }
            i2++;
            dpxVar = dpxVarB2;
        }
        if (dpxVar != null) {
            java.lang.Object obj4 = this.U;
            if (obj4 != null) {
                dpxVar.j(obj4);
                dpxVar.o(this.o);
                dpxVar.p(this.u);
            } else {
                java.lang.Object obj5 = this.V;
                if (obj5 != null) {
                    dpxVar.i(obj5);
                    dpxVar.o(this.o);
                    dpxVar.p(this.u);
                } else {
                    java.lang.String string4 = dpxVar.a.toString();
                    dpxVar.i(defpackage.dqh.a);
                    dpxVar.w(java.lang.Float.valueOf(B(string4)));
                    dpxVar.q(java.lang.Float.valueOf(A(string4)));
                }
            }
        }
        if (dpxVar2 == null) {
            return;
        }
        float f = this.ao;
        if (f != 0.5f) {
            dpxVar2.i = f;
        }
        defpackage.dqf dqfVar = defpackage.dqf.a;
        int iOrdinal = this.as.ordinal();
        if (iOrdinal == 0) {
            dpxVar2.e = 0;
        } else if (iOrdinal == 1) {
            dpxVar2.e = 1;
        } else {
            if (iOrdinal != 2) {
                return;
            }
            dpxVar2.e = 2;
        }
    }
}
