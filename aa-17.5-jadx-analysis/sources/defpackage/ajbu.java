package defpackage;

/* loaded from: classes2.dex */
public final class ajbu {
    public static final ajcz a = new ajcz("CLOSED");

    public static final Object a(ajbv ajbvVar, long j, afeg afegVar) {
        while (true) {
            long j2 = ajbvVar.b;
            if (j2 >= j && !ajbvVar.t()) {
                return ajbvVar;
            }
            Object objL = ajbvVar.l();
            ajcz ajczVar = a;
            if (objL == ajczVar) {
                return ajczVar;
            }
            ajbv ajbvVar2 = (ajbv) objL;
            if (ajbvVar2 != null) {
                ajbvVar = ajbvVar2;
            } else {
                ajbv ajbvVar3 = (ajbv) afegVar.invoke(Long.valueOf(j2 + 1), ajbvVar);
                if (ajbvVar.a.d(null, ajbvVar3)) {
                    if (ajbvVar.t()) {
                        ajbvVar.p();
                    }
                    ajbvVar = ajbvVar3;
                }
            }
        }
    }
}
