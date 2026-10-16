package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ukj {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/model/StyleTransforms");
    private final List b;
    private final abfj c;

    public ukj(abfj abfjVar) {
        this.c = abfjVar;
        this.b = yrm.T(abfjVar.a());
        for (int i = 0; i < abfjVar.a(); i++) {
            this.b.add(new uki((int) abfjVar.j(abfjVar.c.b(i), abfjVar.c.a(i)), i));
        }
    }

    public final long a(long j, aekf aekfVar) {
        if (aekfVar.isEmpty()) {
            return j;
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            uki ukiVar = (uki) list.get(i);
            if (aekfVar.e(ukiVar.a)) {
                if (ukiVar.c != -1) {
                    ukiVar.a(this.c);
                }
                aemo aemoVar = ukiVar.b;
                if (aemoVar != null) {
                    long jT = aemoVar.t(j);
                    if (jT != -1) {
                        j = jT;
                    }
                }
            }
        }
        return j;
    }
}
