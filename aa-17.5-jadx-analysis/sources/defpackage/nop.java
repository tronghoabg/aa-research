package defpackage;

import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class nop implements npa {
    private final kjz a;
    private final kjz b;
    private final eqj c;

    public nop(kjz kjzVar, kjz kjzVar2) {
        eqj eqjVarD;
        this.a = kjzVar;
        this.b = kjzVar2;
        if (kjzVar != null && kjzVar2 != null) {
            eqjVarD = tby.d(jul.f(kjzVar), jul.f(kjzVar2), new ezb(this, 11, (boolean[][]) null));
        } else if (kjzVar != null) {
            eqjVarD = jun.d(jul.f(kjzVar), new nle(13));
        } else {
            if (kjzVar2 == null) {
                throw new IllegalStateException("At least one AC property must be non-null");
            }
            eqjVarD = jun.d(jul.f(kjzVar2), new nle(14));
        }
        this.c = eqjVarD;
        noq[] noqVarArr = new noq[3];
        noqVarArr[0] = noq.a;
        noqVarArr[1] = kjzVar == null ? null : noq.b;
        noqVarArr[2] = kjzVar2 != null ? noq.c : null;
        woy.dw(noqVarArr, new LinkedHashSet());
    }

    @Override // defpackage.npa
    public final eqj a() {
        return this.c;
    }
}
