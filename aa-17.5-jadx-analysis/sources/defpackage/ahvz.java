package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class ahvz {
    private static final ahnj RETENTION_PARAMETER_NAME = ahnj.identifier("value");

    /* JADX INFO: Access modifiers changed from: private */
    public static final agbi _get_parentsWithSelf_$lambda$0(agbi agbiVar) {
        agbiVar.getClass();
        return agbiVar.getContainingDeclaration();
    }

    public static final boolean declaresOrInheritsDefaultValue(agel agelVar) {
        agelVar.getClass();
        Boolean boolIfAny = aipd.ifAny(woy.bg(agelVar), ahvu.INSTANCE, ahvx.INSTANCE);
        boolIfAny.getClass();
        return boolIfAny.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable declaresOrInheritsDefaultValue$lambda$0(agel agelVar) {
        Collection<agel> overriddenDescriptors = agelVar.getOverriddenDescriptors();
        ArrayList arrayList = new ArrayList(woy.bp(overriddenDescriptors, 10));
        Iterator<T> it = overriddenDescriptors.iterator();
        while (it.hasNext()) {
            arrayList.add(((agel) it.next()).getOriginal());
        }
        return arrayList;
    }

    public static final agax firstOverridden(agax agaxVar, boolean z, afec<? super agax, Boolean> afecVar) {
        agaxVar.getClass();
        afecVar.getClass();
        return (agax) aipd.dfs(woy.bg(agaxVar), new ahvw(z), new ahvy(new affv(), afecVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable firstOverridden$lambda$0(boolean z, agax agaxVar) {
        Collection<? extends agax> overriddenDescriptors;
        if (z) {
            agaxVar = agaxVar != null ? agaxVar.getOriginal() : null;
        }
        return (agaxVar == null || (overriddenDescriptors = agaxVar.getOverriddenDescriptors()) == null) ? afbe.a : overriddenDescriptors;
    }

    public static final ahnf fqNameOrNull(agbi agbiVar) {
        agbiVar.getClass();
        ahnh fqNameUnsafe = getFqNameUnsafe(agbiVar);
        if (true != fqNameUnsafe.isSafe()) {
            fqNameUnsafe = null;
        }
        if (fqNameUnsafe != null) {
            return fqNameUnsafe.toSafe();
        }
        return null;
    }

    public static final agba getAnnotationClass(agfc agfcVar) {
        agfcVar.getClass();
        agbd declarationDescriptor = agfcVar.getType().getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor instanceof agba) {
            return (agba) declarationDescriptor;
        }
        return null;
    }

    public static final afye getBuiltIns(agbi agbiVar) {
        agbiVar.getClass();
        return getModule(agbiVar).getBuiltIns();
    }

    public static final ahnd getClassId(agbd agbdVar) {
        agbi containingDeclaration;
        ahnd classId;
        if (agbdVar != null && (containingDeclaration = agbdVar.getContainingDeclaration()) != null) {
            if (containingDeclaration instanceof agdc) {
                ahnf fqName = ((agdc) containingDeclaration).getFqName();
                ahnj name = agbdVar.getName();
                name.getClass();
                return new ahnd(fqName, name);
            }
            if ((containingDeclaration instanceof agbe) && (classId = getClassId((agbd) containingDeclaration)) != null) {
                ahnj name2 = agbdVar.getName();
                name2.getClass();
                return classId.createNestedClassId(name2);
            }
        }
        return null;
    }

    public static final ahnf getFqNameSafe(agbi agbiVar) {
        agbiVar.getClass();
        return ahst.getFqNameSafe(agbiVar);
    }

    public static final ahnh getFqNameUnsafe(agbi agbiVar) {
        agbiVar.getClass();
        ahnh fqName = ahst.getFqName(agbiVar);
        fqName.getClass();
        return fqName;
    }

    public static final agck<aigw> getInlineClassRepresentation(agba agbaVar) {
        agej<aigw> valueClassRepresentation = agbaVar != null ? agbaVar.getValueClassRepresentation() : null;
        if (valueClassRepresentation instanceof agck) {
            return (agck) valueClassRepresentation;
        }
        return null;
    }

    public static final aiju getKotlinTypeRefiner(agcu agcuVar) {
        agcuVar.getClass();
        aiki aikiVar = (aiki) agcuVar.getCapability(aijv.getREFINER_CAPABILITY());
        aiky aikyVar = aikiVar != null ? (aiky) aikiVar.getValue() : null;
        return aikyVar instanceof aikx ? ((aikx) aikyVar).getTypeRefiner() : aijt.INSTANCE;
    }

    public static final agcu getModule(agbi agbiVar) {
        agbiVar.getClass();
        agcu containingModule = ahst.getContainingModule(agbiVar);
        containingModule.getClass();
        return containingModule;
    }

    public static final airp<agbi> getParents(agbi agbiVar) {
        agbiVar.getClass();
        return afrg.k(getParentsWithSelf(agbiVar), 1);
    }

    public static final airp<agbi> getParentsWithSelf(agbi agbiVar) {
        agbiVar.getClass();
        return afrg.f(agbiVar, ahvv.INSTANCE);
    }

    public static final agax getPropertyIfAccessor(agax agaxVar) {
        agaxVar.getClass();
        if (!(agaxVar instanceof agdm)) {
            return agaxVar;
        }
        agdn correspondingProperty = ((agdm) agaxVar).getCorrespondingProperty();
        correspondingProperty.getClass();
        return correspondingProperty;
    }

    public static final agba getSuperClassNotAny(agba agbaVar) {
        agbaVar.getClass();
        for (aigl aiglVar : agbaVar.getDefaultType().getConstructor().mo89getSupertypes()) {
            if (!afye.isAnyOrNullableAny(aiglVar)) {
                agbd declarationDescriptor = aiglVar.getConstructor().getDeclarationDescriptor();
                if (ahst.isClassOrEnumClass(declarationDescriptor)) {
                    declarationDescriptor.getClass();
                    return (agba) declarationDescriptor;
                }
            }
        }
        return null;
    }

    public static final boolean isTypeRefinementEnabled(agcu agcuVar) {
        aiky aikyVar;
        agcuVar.getClass();
        aiki aikiVar = (aiki) agcuVar.getCapability(aijv.getREFINER_CAPABILITY());
        return (aikiVar == null || (aikyVar = (aiky) aikiVar.getValue()) == null || !aikyVar.isEnabled()) ? false : true;
    }

    public static final agba resolveTopLevelClass(agcu agcuVar, ahnf ahnfVar, aglo agloVar) {
        agcuVar.getClass();
        ahnfVar.getClass();
        agloVar.getClass();
        ahnfVar.isRoot();
        agbd contributedClassifier = agcuVar.getPackage(ahnfVar.parent()).getMemberScope().getContributedClassifier(ahnfVar.shortName(), agloVar);
        if (contributedClassifier instanceof agba) {
            return (agba) contributedClassifier;
        }
        return null;
    }
}
