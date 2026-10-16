package defpackage;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class akep {
    public final akfn a;
    public final akfl b;
    public final akcd c;
    public final akcl d;

    public akep(akfn akfnVar, akfl akflVar) {
        this.a = akfnVar;
        this.b = akflVar;
        this.c = null;
        this.d = null;
    }

    private final akfn e() {
        akfn akfnVar = this.a;
        if (akfnVar != null) {
            return akfnVar;
        }
        throw new UnsupportedOperationException("Printing not supported");
    }

    public final String a(akcu akcuVar) {
        StringBuilder sb = new StringBuilder(e().b());
        try {
            Map map = akci.a;
            long jA = akcuVar.a();
            akcd akcdVarB = akcuVar.b();
            if (akcdVarB == null) {
                akcdVarB = akdr.N();
            }
            akfn akfnVarE = e();
            akcd akcdVarB2 = b(akcdVarB);
            akcl akclVarZ = akcdVarB2.z();
            int iA = akclVarZ.a(jA);
            long j = iA;
            long j2 = jA + j;
            if ((jA ^ j2) >= 0 || (j ^ jA) < 0) {
                jA = j2;
            } else {
                akclVarZ = akcl.a;
                iA = 0;
            }
            akfnVarE.d(sb, jA, akcdVarB2.a(), iA, akclVarZ, null);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public final akcd b(akcd akcdVar) {
        akcd akcdVar2 = this.c;
        akcd akcdVarB = akci.b(akcdVar);
        if (akcdVar2 == null) {
            akcdVar2 = akcdVarB;
        }
        akcl akclVar = this.d;
        return akclVar != null ? akcdVar2.b(akclVar) : akcdVar2;
    }

    public final akep c() {
        akcl akclVar = this.d;
        akcl akclVar2 = akcl.a;
        return akclVar == akclVar2 ? this : new akep(this.a, this.b, this.c, akclVar2);
    }

    public final akfm d() {
        return akfm.b(this.b);
    }

    public akep(akfn akfnVar, akfl akflVar, akcd akcdVar, akcl akclVar) {
        this.a = akfnVar;
        this.b = akflVar;
        this.c = akcdVar;
        this.d = akclVar;
    }
}
