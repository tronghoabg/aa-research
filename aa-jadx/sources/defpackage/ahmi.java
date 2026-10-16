package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahmi {
    private ahmi() {
    }

    public final defpackage.ahml create(int i, defpackage.ahmd ahmdVar, defpackage.ahmn ahmnVar) {
        defpackage.afam afamVar;
        ahmdVar.getClass();
        ahmnVar.getClass();
        defpackage.ahli ahliVar = ahmnVar.get(i);
        if (ahliVar == null) {
            return null;
        }
        defpackage.ahmk ahmkVarDecode = defpackage.ahmk.Companion.decode(ahliVar.hasVersion() ? java.lang.Integer.valueOf(ahliVar.getVersion()) : null, ahliVar.hasVersionFull() ? java.lang.Integer.valueOf(ahliVar.getVersionFull()) : null);
        defpackage.ahlf level = ahliVar.getLevel();
        level.getClass();
        int iOrdinal = level.ordinal();
        if (iOrdinal == 0) {
            afamVar = defpackage.afam.a;
        } else if (iOrdinal == 1) {
            afamVar = defpackage.afam.b;
        } else {
            if (iOrdinal != 2) {
                throw new defpackage.afas();
            }
            afamVar = defpackage.afam.c;
        }
        defpackage.afam afamVar2 = afamVar;
        java.lang.Integer numValueOf = ahliVar.hasErrorCode() ? java.lang.Integer.valueOf(ahliVar.getErrorCode()) : null;
        java.lang.String string = ahliVar.hasMessage() ? ahmdVar.getString(ahliVar.getMessage()) : null;
        defpackage.ahlh versionKind = ahliVar.getVersionKind();
        versionKind.getClass();
        return new defpackage.ahml(ahmkVarDecode, versionKind, afamVar2, numValueOf, string);
    }

    public /* synthetic */ ahmi(defpackage.affu affuVar) {
        this();
    }
}
