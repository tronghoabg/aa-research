package defpackage;

/* loaded from: classes3.dex */
public final class ahao {
    private final agvo javaResolverSettings;

    public ahao(agvo agvoVar) {
        agvoVar.getClass();
        this.javaResolverSettings = agvoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.ahan enhanceInflexible(defpackage.aigw r21, defpackage.afec<? super java.lang.Integer, defpackage.ahar> r22, int r23, defpackage.ahcz r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahao.enhanceInflexible(aigw, afec, int, ahcz, boolean, boolean):ahan");
    }

    static /* synthetic */ ahan enhanceInflexible$default(ahao ahaoVar, aigw aigwVar, afec afecVar, int i, ahcz ahczVar, boolean z, boolean z2, int i2, Object obj) {
        return ahaoVar.enhanceInflexible(aigwVar, afecVar, i, ahczVar, z & ((i2 & 8) == 0), z2 & ((i2 & 16) == 0));
    }

    private final aham enhancePossiblyFlexible(aijf aijfVar, afec<? super Integer, ahar> afecVar, int i, boolean z) {
        aigl type;
        aigl aiglVarWrapEnhancement = null;
        if (aigr.isError(aijfVar)) {
            return new aham(null, 1);
        }
        if (!(aijfVar instanceof aiga)) {
            if (!(aijfVar instanceof aigw)) {
                throw new aezs();
            }
            ahan ahanVarEnhanceInflexible$default = enhanceInflexible$default(this, (aigw) aijfVar, afecVar, i, ahcz.INFLEXIBLE, false, z, 8, null);
            return new aham(ahanVarEnhanceInflexible$default.getForWarnings() ? aije.wrapEnhancement(aijfVar, ahanVarEnhanceInflexible$default.getType()) : ahanVarEnhanceInflexible$default.getType(), ahanVarEnhanceInflexible$default.getSubtreeSize());
        }
        boolean z2 = aijfVar instanceof agzc;
        aiga aigaVar = (aiga) aijfVar;
        ahan ahanVarEnhanceInflexible = enhanceInflexible(aigaVar.getLowerBound(), afecVar, i, ahcz.FLEXIBLE_LOWER, z2, z);
        ahan ahanVarEnhanceInflexible2 = enhanceInflexible(aigaVar.getUpperBound(), afecVar, i, ahcz.FLEXIBLE_UPPER, z2, z);
        if (ahanVarEnhanceInflexible.getType() != null || ahanVarEnhanceInflexible2.getType() != null) {
            if (ahanVarEnhanceInflexible.getForWarnings() || ahanVarEnhanceInflexible2.getForWarnings()) {
                aigw type2 = ahanVarEnhanceInflexible2.getType();
                if (type2 != null) {
                    aigw type3 = ahanVarEnhanceInflexible.getType();
                    if (type3 == null) {
                        type3 = type2;
                    }
                    type = aigq.flexibleType(type3, type2);
                } else {
                    type = ahanVarEnhanceInflexible.getType();
                    type.getClass();
                }
                aiglVarWrapEnhancement = aije.wrapEnhancement(aijfVar, type);
            } else if (z2) {
                aigw type4 = ahanVarEnhanceInflexible.getType();
                if (type4 == null) {
                    type4 = aigaVar.getLowerBound();
                }
                aigw type5 = ahanVarEnhanceInflexible2.getType();
                if (type5 == null) {
                    type5 = aigaVar.getUpperBound();
                }
                aiglVarWrapEnhancement = new agzc(type4, type5);
            } else {
                aigw type6 = ahanVarEnhanceInflexible.getType();
                if (type6 == null) {
                    type6 = aigaVar.getLowerBound();
                }
                aigw type7 = ahanVarEnhanceInflexible2.getType();
                if (type7 == null) {
                    type7 = aigaVar.getUpperBound();
                }
                aiglVarWrapEnhancement = aigq.flexibleType(type6, type7);
            }
        }
        return new aham(aiglVarWrapEnhancement, ahanVarEnhanceInflexible.getSubtreeSize());
    }

    private final aigw notNullTypeParameter(aigw aigwVar) {
        return this.javaResolverSettings.getCorrectNullabilityForNotNullTypeParameter() ? aiha.makeSimpleTypeDefinitelyNotNullOrNotNull(aigwVar, true) : new ahat(aigwVar);
    }

    public final aigl enhance(aigl aiglVar, afec<? super Integer, ahar> afecVar, boolean z) {
        aiglVar.getClass();
        afecVar.getClass();
        return enhancePossiblyFlexible(aiglVar.unwrap(), afecVar, 0, z).getType();
    }
}
