package defpackage;

/* loaded from: classes3.dex */
public final class ahli {
    private ahli() {
    }

    public final ahll create(int i, ahld ahldVar, ahln ahlnVar) {
        aezm aezmVar;
        ahldVar.getClass();
        ahlnVar.getClass();
        ahki ahkiVar = ahlnVar.get(i);
        if (ahkiVar == null) {
            return null;
        }
        ahlk ahlkVarDecode = ahlk.Companion.decode(ahkiVar.hasVersion() ? Integer.valueOf(ahkiVar.getVersion()) : null, ahkiVar.hasVersionFull() ? Integer.valueOf(ahkiVar.getVersionFull()) : null);
        ahkf level = ahkiVar.getLevel();
        level.getClass();
        int iOrdinal = level.ordinal();
        if (iOrdinal == 0) {
            aezmVar = aezm.a;
        } else if (iOrdinal == 1) {
            aezmVar = aezm.b;
        } else {
            if (iOrdinal != 2) {
                throw new aezs();
            }
            aezmVar = aezm.c;
        }
        aezm aezmVar2 = aezmVar;
        Integer numValueOf = ahkiVar.hasErrorCode() ? Integer.valueOf(ahkiVar.getErrorCode()) : null;
        String string = ahkiVar.hasMessage() ? ahldVar.getString(ahkiVar.getMessage()) : null;
        ahkh versionKind = ahkiVar.getVersionKind();
        versionKind.getClass();
        return new ahll(ahlkVarDecode, versionKind, aezmVar2, numValueOf, string);
    }

    public /* synthetic */ ahli(afeu afeuVar) {
        this();
    }
}
