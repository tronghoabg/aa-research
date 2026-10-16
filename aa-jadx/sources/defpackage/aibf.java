package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aibf {
    public static final defpackage.agdc descriptorVisibility(defpackage.aibe aibeVar, defpackage.ahln ahlnVar) {
        aibeVar.getClass();
        if (ahlnVar != null) {
            defpackage.ahjh ahjhVar = defpackage.ahjh.DECLARATION;
            int iOrdinal = ahlnVar.ordinal();
            if (iOrdinal == 0) {
                defpackage.agdc agdcVar = defpackage.agdb.INTERNAL;
                agdcVar.getClass();
                return agdcVar;
            }
            if (iOrdinal == 1) {
                defpackage.agdc agdcVar2 = defpackage.agdb.PRIVATE;
                agdcVar2.getClass();
                return agdcVar2;
            }
            if (iOrdinal == 2) {
                defpackage.agdc agdcVar3 = defpackage.agdb.PROTECTED;
                agdcVar3.getClass();
                return agdcVar3;
            }
            if (iOrdinal == 3) {
                defpackage.agdc agdcVar4 = defpackage.agdb.PUBLIC;
                agdcVar4.getClass();
                return agdcVar4;
            }
            if (iOrdinal == 4) {
                defpackage.agdc agdcVar5 = defpackage.agdb.PRIVATE_TO_THIS;
                agdcVar5.getClass();
                return agdcVar5;
            }
            if (iOrdinal == 5) {
                defpackage.agdc agdcVar6 = defpackage.agdb.LOCAL;
                agdcVar6.getClass();
                return agdcVar6;
            }
        }
        defpackage.agdc agdcVar7 = defpackage.agdb.PRIVATE;
        agdcVar7.getClass();
        return agdcVar7;
    }

    public static final defpackage.agbw memberKind(defpackage.aibe aibeVar, defpackage.ahjh ahjhVar) {
        aibeVar.getClass();
        if (ahjhVar != null) {
            defpackage.ahln ahlnVar = defpackage.ahln.INTERNAL;
            int iOrdinal = ahjhVar.ordinal();
            if (iOrdinal == 0) {
                return defpackage.agbw.DECLARATION;
            }
            if (iOrdinal == 1) {
                return defpackage.agbw.FAKE_OVERRIDE;
            }
            if (iOrdinal == 2) {
                return defpackage.agbw.DELEGATION;
            }
            if (iOrdinal == 3) {
                return defpackage.agbw.SYNTHESIZED;
            }
        }
        return defpackage.agbw.DECLARATION;
    }
}
