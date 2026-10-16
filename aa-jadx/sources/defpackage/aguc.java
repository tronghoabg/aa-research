package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aguc {
    private aguc() {
    }

    public static final java.lang.String a(int i) {
        java.lang.String string = java.lang.Integer.toString(i, 16);
        string.getClass();
        return "0x".concat(string);
    }

    public static final void b(defpackage.ajoa ajoaVar, int i, defpackage.affg affgVar) throws java.io.IOException {
        long j = i;
        while (j != 0) {
            if (j < 4) {
                throw new java.io.IOException("bad zip: truncated header in extra field");
            }
            char cX = (char) ajoaVar.x();
            long j2 = j - 4;
            long jX = ((long) ajoaVar.x()) & 65535;
            if (j2 < jX) {
                throw new java.io.IOException("bad zip: truncated value in extra field");
            }
            ajoaVar.z(jX);
            defpackage.ajny ajnyVar = ((defpackage.ajow) ajoaVar).b;
            long j3 = ajnyVar.b;
            affgVar.invoke(java.lang.Integer.valueOf(cX), java.lang.Long.valueOf(jX));
            long j4 = (ajnyVar.b + jX) - j3;
            if (j4 < 0) {
                throw new java.io.IOException(defpackage.a.bo(cX, "unsupported zip: too many bytes processed for "));
            }
            if (j4 > 0) {
                ajnyVar.A(j4);
            }
            j = j2 - jX;
        }
    }

    public static final boolean c(defpackage.ajor ajorVar) {
        defpackage.ajob ajobVarJ;
        int iA = defpackage.ajpi.a(ajorVar);
        if (iA != -1) {
            ajobVarJ = ajorVar.b.j(iA + 1, -1234567890);
        } else {
            ajobVarJ = (ajorVar.c() == null || ajorVar.b.c() != 2) ? ajorVar.b : defpackage.ajob.a;
        }
        return !defpackage.afzh.e(ajobVarJ.i(), ".class", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.aguq getDefault$lambda$0(defpackage.afaq afaqVar, defpackage.ahof ahofVar) {
        ahofVar.getClass();
        return defpackage.agty.getDefaultReportLevelForAnnotation(ahofVar, afaqVar);
    }

    public final defpackage.agud getDefault(defpackage.afaq afaqVar) {
        afaqVar.getClass();
        return new defpackage.agud(defpackage.agty.getDefaultJsr305Settings(afaqVar), new defpackage.agub(afaqVar));
    }

    public /* synthetic */ aguc(defpackage.affu affuVar) {
        this();
    }
}
