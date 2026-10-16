package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class dqh extends dqc {
    public dqh(dpz dpzVar) {
        super(dpzVar, 1);
    }

    @Override // defpackage.dpv, defpackage.dpp, defpackage.dpw
    public final void e() {
        ArrayList arrayList = this.am;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dpp dppVarB = this.al.b(arrayList.get(i));
            if (dppVarB.N != null) {
                dppVarB.ak = 5;
            } else {
                dppVarB.ak = 6;
            }
            dppVarB.k();
            if (dppVarB.P != null) {
                dppVarB.ak = 7;
            } else {
                dppVarB.ak = 8;
            }
            dppVarB.k();
            if (dppVarB.J != null) {
                dppVarB.ak = 1;
            } else {
                dppVarB.ak = 2;
            }
            dppVarB.k();
            if (dppVarB.L != null) {
                dppVarB.ak = 3;
            } else {
                dppVarB.ak = 4;
            }
            dppVarB.k();
        }
        int size2 = arrayList.size();
        dpp dppVar = null;
        int i2 = 0;
        dpp dppVar2 = null;
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            dpp dppVarB2 = this.al.b(obj);
            if (dppVar2 == null) {
                Object obj2 = this.N;
                if (obj2 != null) {
                    dppVarB2.t(obj2);
                    dppVarB2.o(this.l);
                    dppVarB2.p(this.r);
                } else {
                    Object obj3 = this.O;
                    if (obj3 != null) {
                        dppVarB2.s(obj3);
                        dppVarB2.o(this.l);
                        dppVarB2.p(this.r);
                    } else {
                        Object obj4 = this.J;
                        if (obj4 != null) {
                            dppVarB2.t(obj4);
                            dppVarB2.o(this.j);
                            dppVarB2.p(this.p);
                        } else {
                            Object obj5 = this.K;
                            if (obj5 != null) {
                                dppVarB2.s(obj5);
                                dppVarB2.o(this.j);
                                dppVarB2.p(this.p);
                            } else {
                                String string = dppVarB2.a.toString();
                                dppVarB2.t(dpz.a);
                                dppVarB2.w(Float.valueOf(D(string)));
                                dppVarB2.q(Float.valueOf(C(string)));
                            }
                        }
                    }
                }
                dppVar2 = dppVarB2;
            }
            if (dppVar != null) {
                String string2 = dppVar.a.toString();
                String string3 = dppVarB2.a.toString();
                dppVar.m(dppVarB2.a);
                dppVar.w(Float.valueOf(B(string2)));
                dppVar.q(Float.valueOf(A(string2)));
                dppVarB2.s(dppVar.a);
                dppVarB2.w(Float.valueOf(D(string3)));
                dppVarB2.q(Float.valueOf(C(string3)));
            }
            float fE = E(obj.toString());
            if (fE != -1.0f) {
                dppVarB2.f = fE;
            }
            i2++;
            dppVar = dppVarB2;
        }
        if (dppVar != null) {
            Object obj6 = this.P;
            if (obj6 != null) {
                dppVar.m(obj6);
                dppVar.o(this.m);
                dppVar.p(this.s);
            } else {
                Object obj7 = this.Q;
                if (obj7 != null) {
                    dppVar.l(obj7);
                    dppVar.o(this.m);
                    dppVar.p(this.s);
                } else {
                    Object obj8 = this.L;
                    if (obj8 != null) {
                        dppVar.m(obj8);
                        dppVar.o(this.k);
                        dppVar.p(this.q);
                    } else {
                        Object obj9 = this.M;
                        if (obj9 != null) {
                            dppVar.l(obj9);
                            dppVar.o(this.k);
                            dppVar.p(this.q);
                        } else {
                            String string4 = dppVar.a.toString();
                            dppVar.l(dpz.a);
                            dppVar.w(Float.valueOf(B(string4)));
                            dppVar.q(Float.valueOf(A(string4)));
                        }
                    }
                }
            }
        }
        if (dppVar2 == null) {
            return;
        }
        float f = this.ao;
        if (f != 0.5f) {
            dppVar2.h = f;
        }
        dpx dpxVar = dpx.a;
        int iOrdinal = this.as.ordinal();
        if (iOrdinal == 0) {
            dppVar2.d = 0;
        } else if (iOrdinal == 1) {
            dppVar2.d = 1;
        } else {
            if (iOrdinal != 2) {
                return;
            }
            dppVar2.d = 2;
        }
    }
}
