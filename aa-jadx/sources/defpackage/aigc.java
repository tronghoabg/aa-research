package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aigc extends defpackage.aigk {
    private final boolean shouldReportCyclicScopeWithCompanionWarning;
    private final defpackage.aifc<defpackage.aigb> supertypes;

    public aigc(defpackage.aifi aifiVar) {
        aifiVar.getClass();
        this.supertypes = aifiVar.createLazyValueWithPostCompute(new defpackage.aifs(this), defpackage.aift.INSTANCE, new defpackage.aifu(this));
    }

    private final java.util.Collection<defpackage.aihl> computeNeighbours(defpackage.aijd aijdVar, boolean z) {
        defpackage.aigc aigcVar = aijdVar instanceof defpackage.aigc ? (defpackage.aigc) aijdVar : null;
        if (aigcVar != null) {
            return defpackage.afga.aS(aigcVar.supertypes.invoke().getAllSupertypes(), aigcVar.getAdditionalNeighboursInSupertypeGraph(z));
        }
        java.util.Collection<defpackage.aihl> collectionMo89getSupertypes = aijdVar.mo89getSupertypes();
        collectionMo89getSupertypes.getClass();
        return collectionMo89getSupertypes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.aigb supertypes$lambda$0(defpackage.aigc aigcVar) {
        return new defpackage.aigb(aigcVar.computeSupertypes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.aigb supertypes$lambda$1(boolean z) {
        return new defpackage.aigb(defpackage.afga.aa(defpackage.aimm.INSTANCE.getErrorTypeForLoopInSupertypes()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk supertypes$lambda$2(defpackage.aigc aigcVar, defpackage.aigb aigbVar) {
        aigbVar.getClass();
        java.util.Collection<defpackage.aihl> collectionFindLoopsInSupertypesAndDisconnect = aigcVar.getSupertypeLoopChecker().findLoopsInSupertypesAndDisconnect(aigcVar, aigbVar.getAllSupertypes(), new defpackage.aifv(aigcVar), new defpackage.aifw(aigcVar));
        if (collectionFindLoopsInSupertypesAndDisconnect.isEmpty()) {
            defpackage.aihl aihlVarDefaultSupertypeIfEmpty = aigcVar.defaultSupertypeIfEmpty();
            collectionFindLoopsInSupertypesAndDisconnect = aihlVarDefaultSupertypeIfEmpty != null ? defpackage.afga.aa(aihlVarDefaultSupertypeIfEmpty) : null;
            if (collectionFindLoopsInSupertypesAndDisconnect == null) {
                collectionFindLoopsInSupertypesAndDisconnect = defpackage.afce.a;
            }
        }
        if (aigcVar.getShouldReportCyclicScopeWithCompanionWarning()) {
            aigcVar.getSupertypeLoopChecker().findLoopsInSupertypesAndDisconnect(aigcVar, collectionFindLoopsInSupertypesAndDisconnect, new defpackage.aifx(aigcVar), new defpackage.aify(aigcVar));
        }
        java.util.List<defpackage.aihl> listAZ = collectionFindLoopsInSupertypesAndDisconnect instanceof java.util.List ? (java.util.List) collectionFindLoopsInSupertypesAndDisconnect : null;
        if (listAZ == null) {
            listAZ = defpackage.afga.aZ(collectionFindLoopsInSupertypesAndDisconnect);
        }
        aigbVar.setSupertypesWithoutCycles(aigcVar.processSupertypesWithoutCycles(listAZ));
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Iterable supertypes$lambda$2$0(defpackage.aigc aigcVar, defpackage.aijd aijdVar) {
        aijdVar.getClass();
        return aigcVar.computeNeighbours(aijdVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk supertypes$lambda$2$1(defpackage.aigc aigcVar, defpackage.aihl aihlVar) {
        aihlVar.getClass();
        aigcVar.reportSupertypeLoopError(aihlVar);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Iterable supertypes$lambda$2$3(defpackage.aigc aigcVar, defpackage.aijd aijdVar) {
        aijdVar.getClass();
        return aigcVar.computeNeighbours(aijdVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk supertypes$lambda$2$4(defpackage.aigc aigcVar, defpackage.aihl aihlVar) {
        aihlVar.getClass();
        aigcVar.reportScopesLoopError(aihlVar);
        return defpackage.afbk.a;
    }

    protected abstract java.util.Collection<defpackage.aihl> computeSupertypes();

    protected defpackage.aihl defaultSupertypeIfEmpty() {
        return null;
    }

    protected java.util.Collection<defpackage.aihl> getAdditionalNeighboursInSupertypeGraph(boolean z) {
        return defpackage.afce.a;
    }

    protected boolean getShouldReportCyclicScopeWithCompanionWarning() {
        return this.shouldReportCyclicScopeWithCompanionWarning;
    }

    protected abstract defpackage.agfc getSupertypeLoopChecker();

    @Override // defpackage.aijd
    /* JADX INFO: renamed from: getSupertypes */
    public java.util.List<defpackage.aihl> mo89getSupertypes() {
        return this.supertypes.invoke().getSupertypesWithoutCycles();
    }

    protected java.util.List<defpackage.aihl> processSupertypesWithoutCycles(java.util.List<defpackage.aihl> list) {
        list.getClass();
        return list;
    }

    @Override // defpackage.aijd
    public defpackage.aijd refine(defpackage.aiku aikuVar) {
        aikuVar.getClass();
        return new defpackage.aiga(this, aikuVar);
    }

    protected void reportScopesLoopError(defpackage.aihl aihlVar) {
        aihlVar.getClass();
    }

    protected void reportSupertypeLoopError(defpackage.aihl aihlVar) {
        aihlVar.getClass();
    }
}
