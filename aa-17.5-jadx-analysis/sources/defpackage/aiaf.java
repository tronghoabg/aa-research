package defpackage;

/* loaded from: classes3.dex */
public final class aiaf {
    public static final agcc descriptorVisibility(aiae aiaeVar, ahkn ahknVar) {
        aiaeVar.getClass();
        if (ahknVar != null) {
            ahih ahihVar = ahih.DECLARATION;
            int iOrdinal = ahknVar.ordinal();
            if (iOrdinal == 0) {
                agcc agccVar = agcb.INTERNAL;
                agccVar.getClass();
                return agccVar;
            }
            if (iOrdinal == 1) {
                agcc agccVar2 = agcb.PRIVATE;
                agccVar2.getClass();
                return agccVar2;
            }
            if (iOrdinal == 2) {
                agcc agccVar3 = agcb.PROTECTED;
                agccVar3.getClass();
                return agccVar3;
            }
            if (iOrdinal == 3) {
                agcc agccVar4 = agcb.PUBLIC;
                agccVar4.getClass();
                return agccVar4;
            }
            if (iOrdinal == 4) {
                agcc agccVar5 = agcb.PRIVATE_TO_THIS;
                agccVar5.getClass();
                return agccVar5;
            }
            if (iOrdinal == 5) {
                agcc agccVar6 = agcb.LOCAL;
                agccVar6.getClass();
                return agccVar6;
            }
        }
        agcc agccVar7 = agcb.PRIVATE;
        agccVar7.getClass();
        return agccVar7;
    }

    public static final agaw memberKind(aiae aiaeVar, ahih ahihVar) {
        aiaeVar.getClass();
        if (ahihVar != null) {
            ahkn ahknVar = ahkn.INTERNAL;
            int iOrdinal = ahihVar.ordinal();
            if (iOrdinal == 0) {
                return agaw.DECLARATION;
            }
            if (iOrdinal == 1) {
                return agaw.FAKE_OVERRIDE;
            }
            if (iOrdinal == 2) {
                return agaw.DELEGATION;
            }
            if (iOrdinal == 3) {
                return agaw.SYNTHESIZED;
            }
        }
        return agaw.DECLARATION;
    }
}
