package defpackage;

/* loaded from: classes3.dex */
public final class aghv {
    private aghv() {
    }

    public final ahxe getRefinedMemberScopeIfPossible$org_jetbrains_kotlin_descriptors(agba agbaVar, aiit aiitVar, aiju aijuVar) {
        ahxe memberScope;
        agbaVar.getClass();
        aiitVar.getClass();
        aijuVar.getClass();
        aghw aghwVar = agbaVar instanceof aghw ? (aghw) agbaVar : null;
        if (aghwVar != null && (memberScope = aghwVar.getMemberScope(aiitVar, aijuVar)) != null) {
            return memberScope;
        }
        ahxe memberScope2 = agbaVar.getMemberScope(aiitVar);
        memberScope2.getClass();
        return memberScope2;
    }

    public final ahxe getRefinedUnsubstitutedMemberScopeIfPossible$org_jetbrains_kotlin_descriptors(agba agbaVar, aiju aijuVar) {
        ahxe unsubstitutedMemberScope;
        agbaVar.getClass();
        aijuVar.getClass();
        aghw aghwVar = agbaVar instanceof aghw ? (aghw) agbaVar : null;
        if (aghwVar != null && (unsubstitutedMemberScope = aghwVar.getUnsubstitutedMemberScope(aijuVar)) != null) {
            return unsubstitutedMemberScope;
        }
        ahxe unsubstitutedMemberScope2 = agbaVar.getUnsubstitutedMemberScope();
        unsubstitutedMemberScope2.getClass();
        return unsubstitutedMemberScope2;
    }

    public /* synthetic */ aghv(afeu afeuVar) {
        this();
    }
}
