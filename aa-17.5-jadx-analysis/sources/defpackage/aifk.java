package defpackage;

/* loaded from: classes3.dex */
public abstract class aifk implements aiid {
    private int hashCode;

    private final boolean hasMeaningfulFqName(agbd agbdVar) {
        return (ailm.isError(agbdVar) || ahst.isLocal(agbdVar)) ? false : true;
    }

    protected final boolean areFqNamesEqual(agbd agbdVar, agbd agbdVar2) {
        agbdVar.getClass();
        agbdVar2.getClass();
        if (!affa.f(agbdVar.getName(), agbdVar2.getName())) {
            return false;
        }
        agbi containingDeclaration = agbdVar.getContainingDeclaration();
        for (agbi containingDeclaration2 = agbdVar2.getContainingDeclaration(); containingDeclaration != null && containingDeclaration2 != null; containingDeclaration2 = containingDeclaration2.getContainingDeclaration()) {
            if (containingDeclaration instanceof agcu) {
                return containingDeclaration2 instanceof agcu;
            }
            if (containingDeclaration2 instanceof agcu) {
                return false;
            }
            if (containingDeclaration instanceof agdc) {
                return (containingDeclaration2 instanceof agdc) && affa.f(((agdc) containingDeclaration).getFqName(), ((agdc) containingDeclaration2).getFqName());
            }
            if ((containingDeclaration2 instanceof agdc) || !affa.f(containingDeclaration.getName(), containingDeclaration2.getName())) {
                return false;
            }
            containingDeclaration = containingDeclaration.getContainingDeclaration();
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aiid) || obj.hashCode() != hashCode()) {
            return false;
        }
        aiid aiidVar = (aiid) obj;
        if (aiidVar.getParameters().size() != getParameters().size()) {
            return false;
        }
        agbd declarationDescriptor = getDeclarationDescriptor();
        agbd declarationDescriptor2 = aiidVar.getDeclarationDescriptor();
        if (declarationDescriptor2 != null && hasMeaningfulFqName(declarationDescriptor) && hasMeaningfulFqName(declarationDescriptor2)) {
            return isSameClassifier(declarationDescriptor2);
        }
        return false;
    }

    @Override // defpackage.aiid
    public abstract agbd getDeclarationDescriptor();

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        agbd declarationDescriptor = getDeclarationDescriptor();
        int iHashCode = hasMeaningfulFqName(declarationDescriptor) ? ahst.getFqName(declarationDescriptor).hashCode() : System.identityHashCode(this);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    protected abstract boolean isSameClassifier(agbd agbdVar);
}
