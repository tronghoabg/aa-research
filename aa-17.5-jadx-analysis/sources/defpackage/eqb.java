package defpackage;

import java.lang.reflect.Constructor;
import java.util.List;

/* loaded from: classes.dex */
public final class eqb {
    public eps a;
    private final epz b;
    private final epy c;

    public eqb(epz epzVar, eps epsVar) {
        epy equVar;
        this.b = epzVar;
        this.a = epsVar;
        boolean z = epzVar instanceof epy;
        boolean z2 = epzVar instanceof epf;
        eqf eqfVar = eqf.a;
        if (z && z2) {
            equVar = new mgt((epf) epzVar, (epy) epzVar, 1);
        } else if (z2) {
            equVar = new mgt((epf) epzVar, (epy) null, 1);
        } else if (z) {
            equVar = (epy) epzVar;
        } else {
            Class<?> cls = epzVar.getClass();
            if (eqf.a.a(cls) == 2) {
                Object obj = eqf.b.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    equVar = new erk(eqf.b((Constructor) list.get(0), epzVar), 0);
                } else {
                    int size = list.size();
                    epn[] epnVarArr = new epn[size];
                    for (int i = 0; i < size; i++) {
                        epnVarArr[i] = eqf.b((Constructor) list.get(i), epzVar);
                    }
                    equVar = new erk(epnVarArr, 1);
                }
            } else {
                equVar = new equ(epzVar);
            }
        }
        this.c = equVar;
    }

    public final void a(eqa eqaVar, epr eprVar) {
        eps epsVarA = eprVar.a();
        this.a = (eps) affa.z(this.a, epsVarA);
        fdk.a.a("androidx.lifecycle");
        fdf fdfVar = fdf.b;
        try {
            this.c.a(eqaVar, eprVar);
            aclh.v(fdfVar);
            this.a = epsVarA;
        } finally {
        }
    }
}
