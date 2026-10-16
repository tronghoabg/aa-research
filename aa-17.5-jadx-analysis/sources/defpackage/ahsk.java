package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class ahsk extends ahtr {
    public static final ahsk INSTANCE = new ahsk();

    private ahsk() {
    }

    private static final void computeSealedSubclasses$collectSubclasses(agba agbaVar, LinkedHashSet<agba> linkedHashSet, ahxe ahxeVar, boolean z) {
        for (agbi agbiVar : ahxh.getContributedDescriptors$default(ahxeVar, ahwt.CLASSIFIERS, null, 2, null)) {
            if (agbiVar instanceof agba) {
                agba classDescriptor = (agba) agbiVar;
                if (classDescriptor.isExpect()) {
                    ahnj name = classDescriptor.getName();
                    name.getClass();
                    agbd contributedClassifier = ahxeVar.getContributedClassifier(name, aglr.WHEN_GET_ALL_DESCRIPTORS);
                    classDescriptor = contributedClassifier instanceof agba ? (agba) contributedClassifier : contributedClassifier instanceof aged ? ((aged) contributedClassifier).getClassDescriptor() : null;
                }
                if (classDescriptor != null) {
                    if (ahst.isDirectSubclass(classDescriptor, agbaVar)) {
                        linkedHashSet.add(classDescriptor);
                    }
                    if (z) {
                        ahxe unsubstitutedInnerClassesScope = classDescriptor.getUnsubstitutedInnerClassesScope();
                        unsubstitutedInnerClassesScope.getClass();
                        computeSealedSubclasses$collectSubclasses(agbaVar, linkedHashSet, unsubstitutedInnerClassesScope, true);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    public Collection<agba> computeSealedSubclasses(agba agbaVar, boolean z) {
        agbi next;
        agbi containingDeclaration;
        agbaVar.getClass();
        if (agbaVar.getModality() != agcq.SEALED) {
            return afbe.a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z) {
            Iterator itA = ahvz.getParents(agbaVar).a();
            while (true) {
                if (!itA.hasNext()) {
                    next = 0;
                    break;
                }
                next = itA.next();
                if (((agbi) next) instanceof agdc) {
                    break;
                }
            }
            containingDeclaration = next;
        } else {
            containingDeclaration = agbaVar.getContainingDeclaration();
        }
        if (containingDeclaration instanceof agdc) {
            computeSealedSubclasses$collectSubclasses(agbaVar, linkedHashSet, ((agdc) containingDeclaration).getMemberScope(), z);
        }
        ahxe unsubstitutedInnerClassesScope = agbaVar.getUnsubstitutedInnerClassesScope();
        unsubstitutedInnerClassesScope.getClass();
        computeSealedSubclasses$collectSubclasses(agbaVar, linkedHashSet, unsubstitutedInnerClassesScope, true);
        return woy.cc(linkedHashSet, new ahsj());
    }
}
