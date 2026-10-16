package defpackage;

import java.util.Collection;

/* loaded from: classes3.dex */
public final class ahsq {
    public static final ahsq INSTANCE = new ahsq();

    private ahsq() {
    }

    static /* synthetic */ boolean accessor$DescriptorEquivalenceForOverrides$lambda0(agbi agbiVar, agbi agbiVar2) {
        return false;
    }

    static /* synthetic */ boolean accessor$DescriptorEquivalenceForOverrides$lambda1(agbi agbiVar, agbi agbiVar2) {
        return false;
    }

    public static /* synthetic */ boolean areCallableDescriptorsEquivalent$default(ahsq ahsqVar, agav agavVar, agav agavVar2, boolean z, boolean z2, boolean z3, aiju aijuVar, int i, Object obj) {
        return ahsqVar.areCallableDescriptorsEquivalent(agavVar, agavVar2, z, z2 | (!((i & 8) == 0)), z3 & ((i & 16) == 0), aijuVar);
    }

    private static final boolean areCallableDescriptorsEquivalent$lambda$0(agbi agbiVar, agbi agbiVar2) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean areCallableDescriptorsEquivalent$lambda$1(boolean z, agav agavVar, agav agavVar2, aiid aiidVar, aiid aiidVar2) {
        aiidVar.getClass();
        aiidVar2.getClass();
        if (affa.f(aiidVar, aiidVar2)) {
            return true;
        }
        agbd declarationDescriptor = aiidVar.getDeclarationDescriptor();
        agbd declarationDescriptor2 = aiidVar2.getDeclarationDescriptor();
        if ((declarationDescriptor instanceof agee) && (declarationDescriptor2 instanceof agee)) {
            return INSTANCE.areTypeParametersEquivalent((agee) declarationDescriptor, (agee) declarationDescriptor2, z, new ahsp(agavVar, agavVar2));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean areCallableDescriptorsEquivalent$lambda$1$0(agav agavVar, agav agavVar2, agbi agbiVar, agbi agbiVar2) {
        return affa.f(agbiVar, agavVar) && affa.f(agbiVar2, agavVar2);
    }

    private final boolean areClassesEquivalent(agba agbaVar, agba agbaVar2) {
        return affa.f(agbaVar.getTypeConstructor(), agbaVar2.getTypeConstructor());
    }

    public static /* synthetic */ boolean areEquivalent$default(ahsq ahsqVar, agbi agbiVar, agbi agbiVar2, boolean z, boolean z2, int i, Object obj) {
        return ahsqVar.areEquivalent(agbiVar, agbiVar2, z, z2 | (!((i & 8) == 0)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean areTypeParametersEquivalent$default(ahsq ahsqVar, agee ageeVar, agee ageeVar2, boolean z, afeg afegVar, int i, Object obj) {
        if ((i & 8) != 0) {
            afegVar = ahsm.INSTANCE;
        }
        return ahsqVar.areTypeParametersEquivalent(ageeVar, ageeVar2, z, afegVar);
    }

    private static final boolean areTypeParametersEquivalent$lambda$0(agbi agbiVar, agbi agbiVar2) {
        return false;
    }

    private final boolean ownersEquivalent(agbi agbiVar, agbi agbiVar2, afeg<? super agbi, ? super agbi, Boolean> afegVar, boolean z) {
        agbi containingDeclaration = agbiVar.getContainingDeclaration();
        boolean z2 = containingDeclaration instanceof agax;
        agbi containingDeclaration2 = agbiVar2.getContainingDeclaration();
        return (z2 || (containingDeclaration2 instanceof agax)) ? afegVar.invoke(containingDeclaration, containingDeclaration2).booleanValue() : areEquivalent$default(this, containingDeclaration, containingDeclaration2, z, false, 8, null);
    }

    private final agdx singleSource(agav agavVar) {
        while (agavVar instanceof agax) {
            agax agaxVar = (agax) agavVar;
            if (agaxVar.getKind() != agaw.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends agax> overriddenDescriptors = agaxVar.getOverriddenDescriptors();
            overriddenDescriptors.getClass();
            agavVar = (agax) woy.bO(overriddenDescriptors);
            if (agavVar == null) {
                return null;
            }
        }
        return agavVar.getSource();
    }

    public final boolean areCallableDescriptorsEquivalent(agav agavVar, agav agavVar2, boolean z, boolean z2, boolean z3, aiju aijuVar) {
        agavVar.getClass();
        agavVar2.getClass();
        aijuVar.getClass();
        if (affa.f(agavVar, agavVar2)) {
            return true;
        }
        if (!affa.f(agavVar.getName(), agavVar2.getName())) {
            return false;
        }
        if (z2 && (agavVar instanceof agco) && (agavVar2 instanceof agco) && ((agco) agavVar).isExpect() != ((agco) agavVar2).isExpect()) {
            return false;
        }
        if ((affa.f(agavVar.getContainingDeclaration(), agavVar2.getContainingDeclaration()) && (!z || !affa.f(singleSource(agavVar), singleSource(agavVar2)))) || ahst.isLocal(agavVar) || ahst.isLocal(agavVar2) || !ownersEquivalent(agavVar, agavVar2, ahsn.INSTANCE, z)) {
            return false;
        }
        ahtj ahtjVarCreate = ahtj.create(aijuVar, new ahso(z, agavVar, agavVar2));
        boolean z4 = !z3;
        return ahtjVarCreate.isOverridableBy(agavVar, agavVar2, null, z4).getResult() == ahth.OVERRIDABLE && ahtjVarCreate.isOverridableBy(agavVar2, agavVar, null, z4).getResult() == ahth.OVERRIDABLE;
    }

    public final boolean areEquivalent(agbi agbiVar, agbi agbiVar2, boolean z, boolean z2) {
        return ((agbiVar instanceof agba) && (agbiVar2 instanceof agba)) ? areClassesEquivalent((agba) agbiVar, (agba) agbiVar2) : ((agbiVar instanceof agee) && (agbiVar2 instanceof agee)) ? areTypeParametersEquivalent$default(this, (agee) agbiVar, (agee) agbiVar2, z, null, 8, null) : ((agbiVar instanceof agav) && (agbiVar2 instanceof agav)) ? areCallableDescriptorsEquivalent$default(this, (agav) agbiVar, (agav) agbiVar2, z, z2, false, aijt.INSTANCE, 16, null) : ((agbiVar instanceof agdc) && (agbiVar2 instanceof agdc)) ? affa.f(((agdc) agbiVar).getFqName(), ((agdc) agbiVar2).getFqName()) : affa.f(agbiVar, agbiVar2);
    }

    public final boolean areTypeParametersEquivalent(agee ageeVar, agee ageeVar2, boolean z, afeg<? super agbi, ? super agbi, Boolean> afegVar) {
        ageeVar.getClass();
        ageeVar2.getClass();
        afegVar.getClass();
        if (affa.f(ageeVar, ageeVar2)) {
            return true;
        }
        return !affa.f(ageeVar.getContainingDeclaration(), ageeVar2.getContainingDeclaration()) && ownersEquivalent(ageeVar, ageeVar2, afegVar, z) && ageeVar.getIndex() == ageeVar2.getIndex();
    }

    public final boolean areTypeParametersEquivalent(agee ageeVar, agee ageeVar2, boolean z) {
        ageeVar.getClass();
        ageeVar2.getClass();
        return areTypeParametersEquivalent$default(this, ageeVar, ageeVar2, z, null, 8, null);
    }
}
