package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes3.dex */
final class aghg extends ahxf {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final aiec<Collection<agbi>> allDescriptors;
    private final aiea<ahnj, Collection<? extends agdv>> functions;
    private final aiea<ahnj, Collection<? extends agdn>> properties;
    final /* synthetic */ aghh this$0;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void $$$reportNull$$$0(int r13) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aghg.$$$reportNull$$$0(int):void");
    }

    public aghg(aghh aghhVar, aiei aieiVar) {
        if (aieiVar == null) {
            $$$reportNull$$$0(0);
        }
        this.this$0 = aghhVar;
        this.functions = aieiVar.createMemoizedFunction(new aghc(this, aghhVar));
        this.properties = aieiVar.createMemoizedFunction(new aghd(this, aghhVar));
        this.allDescriptors = aieiVar.createLazyValue(new aghe(this, aghhVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<agbi> computeAllDeclarations() {
        HashSet hashSet = new HashSet();
        for (ahnj ahnjVar : (Set) this.this$0.enumMemberNames.invoke()) {
            hashSet.addAll(getContributedFunctions(ahnjVar, aglr.FOR_NON_TRACKED_SCOPE));
            hashSet.addAll(getContributedVariables(ahnjVar, aglr.FOR_NON_TRACKED_SCOPE));
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<? extends agdv> computeFunctions(ahnj ahnjVar) {
        if (ahnjVar == null) {
            $$$reportNull$$$0(8);
        }
        return resolveFakeOverrides(ahnjVar, getSupertypeScope().getContributedFunctions(ahnjVar, aglr.FOR_NON_TRACKED_SCOPE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<? extends agdn> computeProperties(ahnj ahnjVar) {
        if (ahnjVar == null) {
            $$$reportNull$$$0(4);
        }
        return resolveFakeOverrides(ahnjVar, getSupertypeScope().getContributedVariables(ahnjVar, aglr.FOR_NON_TRACKED_SCOPE));
    }

    private ahxe getSupertypeScope() {
        ahxe memberScope = this.this$0.getTypeConstructor().mo89getSupertypes().iterator().next().getMemberScope();
        if (memberScope == null) {
            $$$reportNull$$$0(9);
        }
        return memberScope;
    }

    private <D extends agax> Collection<? extends D> resolveFakeOverrides(ahnj ahnjVar, Collection<? extends D> collection) {
        if (ahnjVar == null) {
            $$$reportNull$$$0(10);
        }
        if (collection == null) {
            $$$reportNull$$$0(11);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ahtj.DEFAULT.generateOverridesInFunctionGroup(ahnjVar, collection, Collections.EMPTY_SET, this.this$0, new aghf(this, linkedHashSet));
        return linkedHashSet;
    }

    @Override // defpackage.ahxf, defpackage.ahxe
    public Set<ahnj> getClassifierNames() {
        Set<ahnj> set = Collections.EMPTY_SET;
        if (set == null) {
            $$$reportNull$$$0(18);
        }
        return set;
    }

    @Override // defpackage.ahxf, defpackage.ahxi
    public Collection<agbi> getContributedDescriptors(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar) {
        if (ahwtVar == null) {
            $$$reportNull$$$0(13);
        }
        if (afecVar == null) {
            $$$reportNull$$$0(14);
        }
        Collection<agbi> collectionInvoke = this.allDescriptors.invoke();
        if (collectionInvoke == null) {
            $$$reportNull$$$0(15);
        }
        return collectionInvoke;
    }

    @Override // defpackage.ahxf, defpackage.ahxe, defpackage.ahxi
    public Collection<? extends agdv> getContributedFunctions(ahnj ahnjVar, aglo agloVar) {
        if (ahnjVar == null) {
            $$$reportNull$$$0(5);
        }
        if (agloVar == null) {
            $$$reportNull$$$0(6);
        }
        Collection<? extends agdv> collectionInvoke = this.functions.invoke(ahnjVar);
        if (collectionInvoke == null) {
            $$$reportNull$$$0(7);
        }
        return collectionInvoke;
    }

    @Override // defpackage.ahxf, defpackage.ahxe
    public Collection<? extends agdn> getContributedVariables(ahnj ahnjVar, aglo agloVar) {
        if (ahnjVar == null) {
            $$$reportNull$$$0(1);
        }
        if (agloVar == null) {
            $$$reportNull$$$0(2);
        }
        Collection<? extends agdn> collectionInvoke = this.properties.invoke(ahnjVar);
        if (collectionInvoke == null) {
            $$$reportNull$$$0(3);
        }
        return collectionInvoke;
    }

    @Override // defpackage.ahxf, defpackage.ahxe
    public Set<ahnj> getFunctionNames() {
        Set<ahnj> set = (Set) this.this$0.enumMemberNames.invoke();
        if (set == null) {
            $$$reportNull$$$0(17);
        }
        return set;
    }

    @Override // defpackage.ahxf, defpackage.ahxe
    public Set<ahnj> getVariableNames() {
        Set<ahnj> set = (Set) this.this$0.enumMemberNames.invoke();
        if (set == null) {
            $$$reportNull$$$0(19);
        }
        return set;
    }
}
