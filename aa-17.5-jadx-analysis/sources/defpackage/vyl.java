package defpackage;

import java.util.Random;

/* loaded from: classes.dex */
public final class vyl {
    static final vym a = new vxu(ajfz.a, true);
    private final Random b;
    private final zeq c;
    private final vxt d;

    public vyl(Random random, vxt vxtVar, zeq zeqVar) {
        this.b = random;
        this.c = zeqVar;
        this.d = vxtVar;
    }

    public final vym a(ajfz ajfzVar) {
        zeq zeqVar;
        int iAt = a.at(ajfzVar.e);
        if (iAt == 0) {
            iAt = 1;
        }
        int i = iAt - 1;
        if (i == 1) {
            return new vxx(ajfzVar, vyk.b(ajfzVar).d());
        }
        if (i == 3) {
            return new vyc(ajfzVar, this.b.nextDouble());
        }
        if (i != 4) {
            return new vxu(ajfzVar, true);
        }
        vxt vxtVar = this.d;
        return (vxtVar == null || (zeqVar = this.c) == null) ? a : new vxw(ajfzVar, vyk.b(ajfzVar), this.b, vxtVar, zeqVar);
    }
}
