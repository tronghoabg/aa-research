package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class aigq {
    public static final aigq INSTANCE = new aigq();
    private static final afec<aiju, aigw> EMPTY_REFINED_TYPE_FACTORY = aigo.INSTANCE;

    private aigq() {
    }

    public static final aigw computeExpandedType(aged agedVar, List<? extends aiin> list) {
        agedVar.getClass();
        list.getClass();
        return new aihi(aihl.INSTANCE, false).expand(aihk.Companion.create(null, agedVar, list), aihr.Companion.getEmpty());
    }

    private final ahxe computeMemberScope(aiid aiidVar, List<? extends aiin> list, aiju aijuVar) {
        agbd declarationDescriptor = aiidVar.getDeclarationDescriptor();
        if (declarationDescriptor instanceof agee) {
            return ((agee) declarationDescriptor).getDefaultType().getMemberScope();
        }
        if (declarationDescriptor instanceof agba) {
            if (aijuVar == null) {
                aijuVar = ahvz.getKotlinTypeRefiner(ahvz.getModule(declarationDescriptor));
            }
            return list.isEmpty() ? aghx.getRefinedUnsubstitutedMemberScopeIfPossible((agba) declarationDescriptor, aijuVar) : aghx.getRefinedMemberScopeIfPossible((agba) declarationDescriptor, aiig.Companion.create(aiidVar, list), aijuVar);
        }
        if (!(declarationDescriptor instanceof aged)) {
            if (aiidVar instanceof aigk) {
                return ((aigk) aiidVar).createScopeForKotlinType();
            }
            throw new IllegalStateException(a.bt(aiidVar, declarationDescriptor, "Unsupported classifier: ", " for constructor: "));
        }
        aili ailiVar = aili.SCOPE_FOR_ABBREVIATION_TYPE;
        String string = ((aged) declarationDescriptor).getName().toString();
        string.getClass();
        return ailm.createErrorScope(ailiVar, true, string);
    }

    public static final aijf flexibleType(aigw aigwVar, aigw aigwVar2) {
        aigwVar.getClass();
        aigwVar2.getClass();
        return affa.f(aigwVar, aigwVar2) ? aigwVar : new aigc(aigwVar, aigwVar2);
    }

    public static final aigw integerLiteralType(aihr aihrVar, ahuv ahuvVar, boolean z) {
        aihrVar.getClass();
        ahuvVar.getClass();
        return simpleTypeWithNonTrivialMemberScope(aihrVar, ahuvVar, afbe.a, z, ailm.createErrorScope(aili.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    private final aigp refineConstructor(aiid aiidVar, aiju aijuVar, List<? extends aiin> list) {
        agbd agbdVarRefineDescriptor;
        agbd declarationDescriptor = aiidVar.getDeclarationDescriptor();
        if (declarationDescriptor == null || (agbdVarRefineDescriptor = aijuVar.refineDescriptor(declarationDescriptor)) == null) {
            return null;
        }
        if (agbdVarRefineDescriptor instanceof aged) {
            return new aigp(computeExpandedType((aged) agbdVarRefineDescriptor, list), null);
        }
        aiid aiidVarRefine = agbdVarRefineDescriptor.getTypeConstructor().refine(aijuVar);
        aiidVarRefine.getClass();
        return new aigp(null, aiidVarRefine);
    }

    public static final aigw simpleNotNullType(aihr aihrVar, agba agbaVar, List<? extends aiin> list) {
        aihrVar.getClass();
        agbaVar.getClass();
        list.getClass();
        aiid typeConstructor = agbaVar.getTypeConstructor();
        typeConstructor.getClass();
        return simpleType$default(aihrVar, typeConstructor, (List) list, false, (aiju) null, 16, (Object) null);
    }

    public static final aigw simpleType(aihr aihrVar, aiid aiidVar, List<? extends aiin> list, boolean z, aiju aijuVar) {
        aihrVar.getClass();
        aiidVar.getClass();
        list.getClass();
        if (!aihrVar.isEmpty() || !list.isEmpty() || z || aiidVar.getDeclarationDescriptor() == null) {
            return simpleTypeWithNonTrivialMemberScope(aihrVar, aiidVar, list, z, INSTANCE.computeMemberScope(aiidVar, list, aijuVar), new aigm(aiidVar, list, aihrVar, z));
        }
        agbd declarationDescriptor = aiidVar.getDeclarationDescriptor();
        declarationDescriptor.getClass();
        aigw defaultType = declarationDescriptor.getDefaultType();
        defaultType.getClass();
        return defaultType;
    }

    public static /* synthetic */ aigw simpleType$default(aigw aigwVar, aihr aihrVar, aiid aiidVar, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            aihrVar = aigwVar.getAttributes();
        }
        if ((i & 4) != 0) {
            aiidVar = aigwVar.getConstructor();
        }
        if ((i & 8) != 0) {
            list = aigwVar.getArguments();
        }
        if ((i & 16) != 0) {
            z = aigwVar.isMarkedNullable();
        }
        return simpleType(aigwVar, aihrVar, aiidVar, (List<? extends aiin>) list, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aigw simpleType$lambda$0(aiid aiidVar, List list, aihr aihrVar, boolean z, aiju aijuVar) {
        aijuVar.getClass();
        aigp aigpVarRefineConstructor = INSTANCE.refineConstructor(aiidVar, aijuVar, list);
        if (aigpVarRefineConstructor == null) {
            return null;
        }
        aigw expandedType = aigpVarRefineConstructor.getExpandedType();
        if (expandedType != null) {
            return expandedType;
        }
        aiid refinedConstructor = aigpVarRefineConstructor.getRefinedConstructor();
        refinedConstructor.getClass();
        return simpleType(aihrVar, refinedConstructor, (List<? extends aiin>) list, z, aijuVar);
    }

    public static final aigw simpleTypeWithNonTrivialMemberScope(aihr aihrVar, aiid aiidVar, List<? extends aiin> list, boolean z, ahxe ahxeVar) {
        aihrVar.getClass();
        aiidVar.getClass();
        list.getClass();
        ahxeVar.getClass();
        aigx aigxVar = new aigx(aiidVar, list, z, ahxeVar, new aign(aiidVar, list, aihrVar, z, ahxeVar));
        return aihrVar.isEmpty() ? aigxVar : new aigy(aigxVar, aihrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aigw simpleTypeWithNonTrivialMemberScope$lambda$0(aiid aiidVar, List list, aihr aihrVar, boolean z, ahxe ahxeVar, aiju aijuVar) {
        aijuVar.getClass();
        aigp aigpVarRefineConstructor = INSTANCE.refineConstructor(aiidVar, aijuVar, list);
        if (aigpVarRefineConstructor == null) {
            return null;
        }
        aigw expandedType = aigpVarRefineConstructor.getExpandedType();
        if (expandedType != null) {
            return expandedType;
        }
        aiid refinedConstructor = aigpVarRefineConstructor.getRefinedConstructor();
        refinedConstructor.getClass();
        return simpleTypeWithNonTrivialMemberScope(aihrVar, refinedConstructor, list, z, ahxeVar);
    }

    public static /* synthetic */ aigw simpleType$default(aihr aihrVar, aiid aiidVar, List list, boolean z, aiju aijuVar, int i, Object obj) {
        if ((i & 16) != 0) {
            aijuVar = null;
        }
        return simpleType(aihrVar, aiidVar, (List<? extends aiin>) list, z, aijuVar);
    }

    public static final aigw simpleTypeWithNonTrivialMemberScope(aihr aihrVar, aiid aiidVar, List<? extends aiin> list, boolean z, ahxe ahxeVar, afec<? super aiju, ? extends aigw> afecVar) {
        aihrVar.getClass();
        aiidVar.getClass();
        list.getClass();
        ahxeVar.getClass();
        afecVar.getClass();
        aigx aigxVar = new aigx(aiidVar, list, z, ahxeVar, afecVar);
        return aihrVar.isEmpty() ? aigxVar : new aigy(aigxVar, aihrVar);
    }

    public static final aigw simpleType(aihr aihrVar, aiid aiidVar, List<? extends aiin> list, boolean z) {
        aihrVar.getClass();
        aiidVar.getClass();
        list.getClass();
        return simpleType$default(aihrVar, aiidVar, list, z, (aiju) null, 16, (Object) null);
    }

    public static final aigw simpleType(aigw aigwVar, aihr aihrVar, aiid aiidVar, List<? extends aiin> list, boolean z) {
        aigwVar.getClass();
        aihrVar.getClass();
        aiidVar.getClass();
        list.getClass();
        return simpleType$default(aihrVar, aiidVar, list, z, (aiju) null, 16, (Object) null);
    }
}
