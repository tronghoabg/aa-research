package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class dqi extends dqc {
    public dqi(dpz dpzVar) {
        super(dpzVar, 2);
    }

    @Override // defpackage.dpv, defpackage.dpp, defpackage.dpw
    public final void e() {
        ArrayList arrayList = this.am;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dpp dppVarB = this.al.b(arrayList.get(i));
            if (dppVarB.R != null) {
                dppVarB.ak = 9;
            } else {
                dppVarB.ak = 10;
            }
            dppVarB.k();
            dppVarB.ak = 15;
            dppVarB.k();
            dppVarB.ak = dppVarB.U != null ? 12 : 13;
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
                Object obj2 = this.R;
                if (obj2 != null) {
                    dppVarB2.v(obj2);
                    dppVarB2.o(this.n);
                    dppVarB2.p(this.t);
                } else {
                    Object obj3 = this.S;
                    if (obj3 != null) {
                        dppVarB2.u(obj3);
                        dppVarB2.o(this.n);
                        dppVarB2.p(this.t);
                    } else {
                        String string = dppVarB2.a.toString();
                        dppVarB2.v(dpz.a);
                        dppVarB2.w(Float.valueOf(D(string)));
                        dppVarB2.q(Float.valueOf(C(string)));
                    }
                }
                dppVar2 = dppVarB2;
            }
            if (dppVar != null) {
                String string2 = dppVar.a.toString();
                String string3 = dppVarB2.a.toString();
                dppVar.j(dppVarB2.a);
                dppVar.w(Float.valueOf(B(string2)));
                dppVar.q(Float.valueOf(A(string2)));
                dppVarB2.u(dppVar.a);
                dppVarB2.w(Float.valueOf(D(string3)));
                dppVarB2.q(Float.valueOf(C(string3)));
            }
            float fE = E(obj.toString());
            if (fE != -1.0f) {
                dppVarB2.g = fE;
            }
            i2++;
            dppVar = dppVarB2;
        }
        if (dppVar != null) {
            Object obj4 = this.U;
            if (obj4 != null) {
                dppVar.j(obj4);
                dppVar.o(this.o);
                dppVar.p(this.u);
            } else {
                Object obj5 = this.V;
                if (obj5 != null) {
                    dppVar.i(obj5);
                    dppVar.o(this.o);
                    dppVar.p(this.u);
                } else {
                    String string4 = dppVar.a.toString();
                    dppVar.i(dpz.a);
                    dppVar.w(Float.valueOf(B(string4)));
                    dppVar.q(Float.valueOf(A(string4)));
                }
            }
        }
        if (dppVar2 == null) {
            return;
        }
        float f = this.ao;
        if (f != 0.5f) {
            dppVar2.i = f;
        }
        dpx dpxVar = dpx.a;
        int iOrdinal = this.as.ordinal();
        if (iOrdinal == 0) {
            dppVar2.e = 0;
        } else if (iOrdinal == 1) {
            dppVar2.e = 1;
        } else {
            if (iOrdinal != 2) {
                return;
            }
            dppVar2.e = 2;
        }
    }
}
