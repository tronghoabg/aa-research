package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dqp extends defpackage.dqk {
    public dqp(defpackage.dqh dqhVar) {
        super(dqhVar, 1);
    }

    @Override // defpackage.dqd, defpackage.dpx, defpackage.dqe
    public final void e() {
        java.util.ArrayList arrayList = this.am;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            defpackage.dpx dpxVarB = this.al.b(arrayList.get(i));
            if (dpxVarB.N != null) {
                dpxVarB.ak = 5;
            } else {
                dpxVarB.ak = 6;
            }
            dpxVarB.k();
            if (dpxVarB.P != null) {
                dpxVarB.ak = 7;
            } else {
                dpxVarB.ak = 8;
            }
            dpxVarB.k();
            if (dpxVarB.J != null) {
                dpxVarB.ak = 1;
            } else {
                dpxVarB.ak = 2;
            }
            dpxVarB.k();
            if (dpxVarB.L != null) {
                dpxVarB.ak = 3;
            } else {
                dpxVarB.ak = 4;
            }
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
                java.lang.Object obj2 = this.N;
                if (obj2 != null) {
                    dpxVarB2.t(obj2);
                    dpxVarB2.o(this.l);
                    dpxVarB2.p(this.r);
                } else {
                    java.lang.Object obj3 = this.O;
                    if (obj3 != null) {
                        dpxVarB2.s(obj3);
                        dpxVarB2.o(this.l);
                        dpxVarB2.p(this.r);
                    } else {
                        java.lang.Object obj4 = this.J;
                        if (obj4 != null) {
                            dpxVarB2.t(obj4);
                            dpxVarB2.o(this.j);
                            dpxVarB2.p(this.p);
                        } else {
                            java.lang.Object obj5 = this.K;
                            if (obj5 != null) {
                                dpxVarB2.s(obj5);
                                dpxVarB2.o(this.j);
                                dpxVarB2.p(this.p);
                            } else {
                                java.lang.String string = dpxVarB2.a.toString();
                                dpxVarB2.t(defpackage.dqh.a);
                                dpxVarB2.w(java.lang.Float.valueOf(D(string)));
                                dpxVarB2.q(java.lang.Float.valueOf(C(string)));
                            }
                        }
                    }
                }
                dpxVar2 = dpxVarB2;
            }
            if (dpxVar != null) {
                java.lang.String string2 = dpxVar.a.toString();
                java.lang.String string3 = dpxVarB2.a.toString();
                dpxVar.m(dpxVarB2.a);
                dpxVar.w(java.lang.Float.valueOf(B(string2)));
                dpxVar.q(java.lang.Float.valueOf(A(string2)));
                dpxVarB2.s(dpxVar.a);
                dpxVarB2.w(java.lang.Float.valueOf(D(string3)));
                dpxVarB2.q(java.lang.Float.valueOf(C(string3)));
            }
            float fE = E(obj.toString());
            if (fE != -1.0f) {
                dpxVarB2.f = fE;
            }
            i2++;
            dpxVar = dpxVarB2;
        }
        if (dpxVar != null) {
            java.lang.Object obj6 = this.P;
            if (obj6 != null) {
                dpxVar.m(obj6);
                dpxVar.o(this.m);
                dpxVar.p(this.s);
            } else {
                java.lang.Object obj7 = this.Q;
                if (obj7 != null) {
                    dpxVar.l(obj7);
                    dpxVar.o(this.m);
                    dpxVar.p(this.s);
                } else {
                    java.lang.Object obj8 = this.L;
                    if (obj8 != null) {
                        dpxVar.m(obj8);
                        dpxVar.o(this.k);
                        dpxVar.p(this.q);
                    } else {
                        java.lang.Object obj9 = this.M;
                        if (obj9 != null) {
                            dpxVar.l(obj9);
                            dpxVar.o(this.k);
                            dpxVar.p(this.q);
                        } else {
                            java.lang.String string4 = dpxVar.a.toString();
                            dpxVar.l(defpackage.dqh.a);
                            dpxVar.w(java.lang.Float.valueOf(B(string4)));
                            dpxVar.q(java.lang.Float.valueOf(A(string4)));
                        }
                    }
                }
            }
        }
        if (dpxVar2 == null) {
            return;
        }
        float f = this.ao;
        if (f != 0.5f) {
            dpxVar2.h = f;
        }
        defpackage.dqf dqfVar = defpackage.dqf.a;
        int iOrdinal = this.as.ordinal();
        if (iOrdinal == 0) {
            dpxVar2.d = 0;
        } else if (iOrdinal == 1) {
            dpxVar2.d = 1;
        } else {
            if (iOrdinal != 2) {
                return;
            }
            dpxVar2.d = 2;
        }
    }
}
