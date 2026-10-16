package defpackage;

import j$.util.Map;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class kom {
    private static final Map a = new HashMap();
    private final Enum b;

    public kom(Enum r1) {
        this.b = r1;
    }

    public static kom a(par parVar) {
        return (kom) Map.EL.computeIfAbsent(a, parVar, new gjm(parVar, 13));
    }

    public static kom b(pba pbaVar) {
        int i = pbaVar.c;
        if (i == 11) {
            par parVarB = par.b(((pav) pbaVar.d).d);
            if (parVarB == null) {
                parVarB = par.CALL_SITE_UNSET;
            }
            return a(parVarB);
        }
        if (i != 12) {
            throw new IllegalArgumentException("Injection type not supported");
        }
        pbd pbdVarB = pbd.b(((Integer) pbaVar.d).intValue());
        if (pbdVarB == null) {
            pbdVarB = pbd.STATIC_INJECTION_UNSET;
        }
        return c(pbdVarB);
    }

    public static kom c(pbd pbdVar) {
        return (kom) Map.EL.computeIfAbsent(a, pbdVar, new gjm(pbdVar, 12));
    }

    public final String toString() {
        return this.b.name();
    }
}
