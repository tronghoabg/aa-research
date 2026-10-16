package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajcu {
    public static final defpackage.ajdz a = new defpackage.ajdz("CLOSED");

    public static final java.lang.Object a(defpackage.ajcv ajcvVar, long j, defpackage.affg affgVar) {
        while (true) {
            long j2 = ajcvVar.b;
            if (j2 >= j && !ajcvVar.t()) {
                return ajcvVar;
            }
            java.lang.Object objL = ajcvVar.l();
            defpackage.ajdz ajdzVar = a;
            if (objL == ajdzVar) {
                return ajdzVar;
            }
            defpackage.ajcv ajcvVar2 = (defpackage.ajcv) objL;
            if (ajcvVar2 != null) {
                ajcvVar = ajcvVar2;
            } else {
                defpackage.ajcv ajcvVar3 = (defpackage.ajcv) affgVar.invoke(java.lang.Long.valueOf(j2 + 1), ajcvVar);
                if (ajcvVar.a.d(null, ajcvVar3)) {
                    if (ajcvVar.t()) {
                        ajcvVar.p();
                    }
                    ajcvVar = ajcvVar3;
                }
            }
        }
    }
}
