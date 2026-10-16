package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public class aggu extends aghm implements agaz {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected final boolean isPrimary;

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void $$$reportNull$$$0(int r8) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aggu.$$$reportNull$$$0(int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected aggu(agba agbaVar, agbh agbhVar, agfk agfkVar, boolean z, agaw agawVar, agdx agdxVar) {
        super(agbaVar, agbhVar, agfkVar, ahnm.INIT, agawVar, agdxVar);
        if (agbaVar == null) {
            $$$reportNull$$$0(0);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(1);
        }
        if (agawVar == null) {
            $$$reportNull$$$0(2);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(3);
        }
        this.isPrimary = z;
    }

    private List<agdq> calculateContextReceiverParameters() {
        agba containingDeclaration = getContainingDeclaration();
        if (containingDeclaration.getContextReceivers().isEmpty()) {
            List<agdq> list = Collections.EMPTY_LIST;
            if (list == null) {
                $$$reportNull$$$0(16);
            }
            return list;
        }
        List<agdq> contextReceivers = containingDeclaration.getContextReceivers();
        if (contextReceivers == null) {
            $$$reportNull$$$0(15);
        }
        return contextReceivers;
    }

    public static aggu create(agba agbaVar, agfk agfkVar, boolean z, agdx agdxVar) {
        if (agbaVar == null) {
            $$$reportNull$$$0(4);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(5);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(6);
        }
        return new aggu(agbaVar, null, agfkVar, z, agaw.DECLARATION, agdxVar);
    }

    @Override // defpackage.aghm, defpackage.agbi
    public <R, D> R accept(agbk<R, D> agbkVar, D d) {
        return agbkVar.visitConstructorDescriptor(this, d);
    }

    public agdq calculateDispatchReceiverParameter() {
        agba containingDeclaration = getContainingDeclaration();
        if (!containingDeclaration.isInner()) {
            return null;
        }
        agbi containingDeclaration2 = containingDeclaration.getContainingDeclaration();
        if (containingDeclaration2 instanceof agba) {
            return ((agba) containingDeclaration2).getThisAsReceiverParameter();
        }
        return null;
    }

    @Override // defpackage.aghm, defpackage.agax
    public agaz copy(agbi agbiVar, agcq agcqVar, agcc agccVar, agaw agawVar, boolean z) {
        agaz agazVar = (agaz) super.copy(agbiVar, agcqVar, agccVar, agawVar, z);
        if (agazVar == null) {
            $$$reportNull$$$0(27);
        }
        return agazVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aghm
    public aggu createSubstitutedCopy(agbi agbiVar, agcj agcjVar, agaw agawVar, ahnj ahnjVar, agfk agfkVar, agdx agdxVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(23);
        }
        if (agawVar == null) {
            $$$reportNull$$$0(24);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(25);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(26);
        }
        agaw agawVar2 = agaw.DECLARATION;
        if (agawVar == agawVar2 || agawVar == agaw.SYNTHESIZED) {
            return new aggu((agba) agbiVar, this, agfkVar, this.isPrimary, agawVar2, agdxVar);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + agbiVar + "\nkind: " + agawVar);
    }

    @Override // defpackage.agbh
    public agba getConstructedClass() {
        agba containingDeclaration = getContainingDeclaration();
        if (containingDeclaration == null) {
            $$$reportNull$$$0(18);
        }
        return containingDeclaration;
    }

    @Override // defpackage.aggz, defpackage.agbi
    public agba getContainingDeclaration() {
        agba agbaVar = (agba) super.getContainingDeclaration();
        if (agbaVar == null) {
            $$$reportNull$$$0(17);
        }
        return agbaVar;
    }

    @Override // defpackage.aghm, defpackage.aggz, defpackage.aggy, defpackage.agbi
    public agaz getOriginal() {
        agaz agazVar = (agaz) super.getOriginal();
        if (agazVar == null) {
            $$$reportNull$$$0(19);
        }
        return agazVar;
    }

    @Override // defpackage.aghm, defpackage.agcj, defpackage.agax, defpackage.agav
    public Collection<? extends agcj> getOverriddenDescriptors() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            $$$reportNull$$$0(21);
        }
        return set;
    }

    public aggu initialize(List<agel> list, agcc agccVar, List<agee> list2) {
        if (list == null) {
            $$$reportNull$$$0(10);
        }
        if (agccVar == null) {
            $$$reportNull$$$0(11);
        }
        if (list2 == null) {
            $$$reportNull$$$0(12);
        }
        super.initialize(null, calculateDispatchReceiverParameter(), calculateContextReceiverParameters(), list2, list, null, agcq.FINAL, agccVar);
        return this;
    }

    @Override // defpackage.agbh
    public boolean isPrimary() {
        return this.isPrimary;
    }

    @Override // defpackage.aghm, defpackage.agax
    public void setOverriddenDescriptors(Collection<? extends agax> collection) {
        if (collection == null) {
            $$$reportNull$$$0(22);
        }
    }

    @Override // defpackage.aghm, defpackage.agcj, defpackage.agea
    public agaz substitute(aiiy aiiyVar) {
        if (aiiyVar == null) {
            $$$reportNull$$$0(20);
        }
        return (agaz) super.substitute(aiiyVar);
    }

    public aggu initialize(List<agel> list, agcc agccVar) {
        if (list == null) {
            $$$reportNull$$$0(13);
        }
        if (agccVar == null) {
            $$$reportNull$$$0(14);
        }
        initialize(list, agccVar, getContainingDeclaration().getDeclaredTypeParameters());
        return this;
    }
}
