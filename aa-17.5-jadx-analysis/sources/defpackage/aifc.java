package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class aifc extends aifk {
    private final boolean shouldReportCyclicScopeWithCompanionWarning;
    private final aiec<aifb> supertypes;

    public aifc(aiei aieiVar) {
        aieiVar.getClass();
        this.supertypes = aieiVar.createLazyValueWithPostCompute(new aies(this), aiet.INSTANCE, new aieu(this));
    }

    private final Collection<aigl> computeNeighbours(aiid aiidVar, boolean z) {
        aifc aifcVar = aiidVar instanceof aifc ? (aifc) aiidVar : null;
        if (aifcVar != null) {
            return woy.bY(aifcVar.supertypes.invoke().getAllSupertypes(), aifcVar.getAdditionalNeighboursInSupertypeGraph(z));
        }
        Collection<aigl> collectionMo89getSupertypes = aiidVar.mo89getSupertypes();
        collectionMo89getSupertypes.getClass();
        return collectionMo89getSupertypes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aifb supertypes$lambda$0(aifc aifcVar) {
        return new aifb(aifcVar.computeSupertypes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aifb supertypes$lambda$1(boolean z) {
        return new aifb(woy.bg(ailm.INSTANCE.getErrorTypeForLoopInSupertypes()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak supertypes$lambda$2(aifc aifcVar, aifb aifbVar) {
        aifbVar.getClass();
        Collection<aigl> collectionFindLoopsInSupertypesAndDisconnect = aifcVar.getSupertypeLoopChecker().findLoopsInSupertypesAndDisconnect(aifcVar, aifbVar.getAllSupertypes(), new aiev(aifcVar), new aiew(aifcVar));
        if (collectionFindLoopsInSupertypesAndDisconnect.isEmpty()) {
            aigl aiglVarDefaultSupertypeIfEmpty = aifcVar.defaultSupertypeIfEmpty();
            collectionFindLoopsInSupertypesAndDisconnect = aiglVarDefaultSupertypeIfEmpty != null ? woy.bg(aiglVarDefaultSupertypeIfEmpty) : null;
            if (collectionFindLoopsInSupertypesAndDisconnect == null) {
                collectionFindLoopsInSupertypesAndDisconnect = afbe.a;
            }
        }
        if (aifcVar.getShouldReportCyclicScopeWithCompanionWarning()) {
            aifcVar.getSupertypeLoopChecker().findLoopsInSupertypesAndDisconnect(aifcVar, collectionFindLoopsInSupertypesAndDisconnect, new aiex(aifcVar), new aiey(aifcVar));
        }
        List<aigl> listCf = collectionFindLoopsInSupertypesAndDisconnect instanceof List ? (List) collectionFindLoopsInSupertypesAndDisconnect : null;
        if (listCf == null) {
            listCf = woy.cf(collectionFindLoopsInSupertypesAndDisconnect);
        }
        aifbVar.setSupertypesWithoutCycles(aifcVar.processSupertypesWithoutCycles(listCf));
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable supertypes$lambda$2$0(aifc aifcVar, aiid aiidVar) {
        aiidVar.getClass();
        return aifcVar.computeNeighbours(aiidVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak supertypes$lambda$2$1(aifc aifcVar, aigl aiglVar) {
        aiglVar.getClass();
        aifcVar.reportSupertypeLoopError(aiglVar);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable supertypes$lambda$2$3(aifc aifcVar, aiid aiidVar) {
        aiidVar.getClass();
        return aifcVar.computeNeighbours(aiidVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak supertypes$lambda$2$4(aifc aifcVar, aigl aiglVar) {
        aiglVar.getClass();
        aifcVar.reportScopesLoopError(aiglVar);
        return afak.a;
    }

    protected abstract Collection<aigl> computeSupertypes();

    protected aigl defaultSupertypeIfEmpty() {
        return null;
    }

    protected Collection<aigl> getAdditionalNeighboursInSupertypeGraph(boolean z) {
        return afbe.a;
    }

    protected boolean getShouldReportCyclicScopeWithCompanionWarning() {
        return this.shouldReportCyclicScopeWithCompanionWarning;
    }

    protected abstract agec getSupertypeLoopChecker();

    @Override // defpackage.aiid
    /* renamed from: getSupertypes */
    public List<aigl> mo89getSupertypes() {
        return this.supertypes.invoke().getSupertypesWithoutCycles();
    }

    protected List<aigl> processSupertypesWithoutCycles(List<aigl> list) {
        list.getClass();
        return list;
    }

    @Override // defpackage.aiid
    public aiid refine(aiju aijuVar) {
        aijuVar.getClass();
        return new aifa(this, aijuVar);
    }

    protected void reportScopesLoopError(aigl aiglVar) {
        aiglVar.getClass();
    }

    protected void reportSupertypeLoopError(aigl aiglVar) {
        aiglVar.getClass();
    }
}
