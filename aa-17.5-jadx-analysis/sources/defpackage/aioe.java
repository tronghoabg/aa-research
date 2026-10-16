package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class aioe extends aimz {
    public static final aioe INSTANCE = new aioe();
    private static final List<aino> checks = woy.bi(new aino(aiof.GET, new aing[]{aint.INSTANCE, new aiop(1)}, (afec) null, 4, (afeu) null), new aino(aiof.SET, new aing[]{aint.INSTANCE, new aiop(2)}, aiob.INSTANCE), new aino(aiof.GET_VALUE, new aing[]{aint.INSTANCE, ainx.INSTANCE, new aiop(2), ainr.INSTANCE}, (afec) null, 4, (afeu) null), new aino(aiof.SET_VALUE, new aing[]{aint.INSTANCE, ainx.INSTANCE, new aiop(3), ainr.INSTANCE}, (afec) null, 4, (afeu) null), new aino(aiof.PROVIDE_DELEGATE, new aing[]{aint.INSTANCE, ainx.INSTANCE, new aioq(2), ainr.INSTANCE}, (afec) null, 4, (afeu) null), new aino(aiof.INVOKE, new aing[]{aint.INSTANCE}, (afec) null, 4, (afeu) null), new aino(aiof.CONTAINS, new aing[]{aint.INSTANCE, aios.INSTANCE, ainx.INSTANCE, aioh.INSTANCE}, (afec) null, 4, (afeu) null), new aino(aiof.ITERATOR, new aing[]{aint.INSTANCE, aior.INSTANCE}, (afec) null, 4, (afeu) null), new aino(aiof.NEXT, new aing[]{aint.INSTANCE, aior.INSTANCE}, (afec) null, 4, (afeu) null), new aino(aiof.HAS_NEXT, new aing[]{aint.INSTANCE, aior.INSTANCE, aioh.INSTANCE}, (afec) null, 4, (afeu) null), new aino(aiof.RANGE_TO, new aing[]{aint.INSTANCE, aios.INSTANCE, ainx.INSTANCE}, (afec) null, 4, (afeu) null), new aino(aiof.RANGE_UNTIL, new aing[]{aint.INSTANCE, aios.INSTANCE, ainx.INSTANCE}, (afec) null, 4, (afeu) null), new aino(aiof.EQUALS, new aing[]{ains.INSTANCE}, aioc.INSTANCE), new aino(aiof.COMPARE_TO, new aing[]{aint.INSTANCE, aioj.INSTANCE, aios.INSTANCE, ainx.INSTANCE}, (afec) null, 4, (afeu) null), new aino(aiof.BINARY_OPERATION_NAMES, new aing[]{aint.INSTANCE, aios.INSTANCE, ainx.INSTANCE}, (afec) null, 4, (afeu) null), new aino(aiof.SIMPLE_UNARY_OPERATION_NAMES, new aing[]{aint.INSTANCE, aior.INSTANCE}, (afec) null, 4, (afeu) null), new aino(woy.bi(aiof.INC, aiof.DEC), new aing[]{aint.INSTANCE}, aiod.INSTANCE), new aino(aiof.ASSIGNMENT_OPERATIONS, new aing[]{aint.INSTANCE, aiol.INSTANCE, aios.INSTANCE, ainx.INSTANCE}, (afec) null, 4, (afeu) null), new aino(aiof.COMPONENT_REGEX, new aing[]{aint.INSTANCE, aior.INSTANCE}, (afec) null, 4, (afeu) null));

    private aioe() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String checks$lambda$0(agcj agcjVar) {
        agcjVar.getClass();
        List<agel> valueParameters = agcjVar.getValueParameters();
        valueParameters.getClass();
        agel agelVar = (agel) woy.bL(valueParameters);
        if (agelVar == null || ahvz.declaresOrInheritsDefaultValue(agelVar) || agelVar.getVarargElementType() != null) {
            return "last parameter should not have a default value or be a vararg";
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String checks$lambda$1(agcj agcjVar) {
        agcjVar.getClass();
        agbi containingDeclaration = agcjVar.getContainingDeclaration();
        containingDeclaration.getClass();
        if (checks$lambda$1$isAny(containingDeclaration)) {
            return null;
        }
        Collection<? extends agcj> overriddenDescriptors = agcjVar.getOverriddenDescriptors();
        overriddenDescriptors.getClass();
        if (!overriddenDescriptors.isEmpty()) {
            Iterator<T> it = overriddenDescriptors.iterator();
            while (it.hasNext()) {
                agbi containingDeclaration2 = ((agcj) it.next()).getContainingDeclaration();
                containingDeclaration2.getClass();
                if (checks$lambda$1$isAny(containingDeclaration2)) {
                    return null;
                }
            }
        }
        if (agbo.isTypedEqualsInValueClass(agcjVar)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("must override ''equals()'' in Any");
        agbi containingDeclaration3 = agcjVar.getContainingDeclaration();
        containingDeclaration3.getClass();
        if (ahsw.isValueClass(containingDeclaration3)) {
            ahre ahreVar = ahre.SHORT_NAMES_IN_TYPES;
            agbi containingDeclaration4 = agcjVar.getContainingDeclaration();
            containingDeclaration4.getClass();
            aigw defaultType = ((agba) containingDeclaration4).getDefaultType();
            defaultType.getClass();
            sb.append(" or define ''equals(other: " + ahreVar.renderType(aimr.replaceArgumentsWithStarProjections(defaultType)) + "): Boolean''");
        }
        return sb.toString();
    }

    private static final boolean checks$lambda$1$isAny(agbi agbiVar) {
        return (agbiVar instanceof agba) && afye.isAny((agba) agbiVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String checks$lambda$2(agcj agcjVar) {
        agcjVar.getClass();
        agdq dispatchReceiverParameter = agcjVar.getDispatchReceiverParameter();
        if (dispatchReceiverParameter == null) {
            dispatchReceiverParameter = agcjVar.getExtensionReceiverParameter();
        }
        if (dispatchReceiverParameter == null) {
            return "receiver must be a supertype of the return type";
        }
        aigl returnType = agcjVar.getReturnType();
        if (returnType != null) {
            aigl type = dispatchReceiverParameter.getType();
            type.getClass();
            if (aimr.isSubtypeOf(returnType, type)) {
                return null;
            }
        }
        if (INSTANCE.incDecCheckForExpectClass(agcjVar, dispatchReceiverParameter)) {
            return null;
        }
        return "receiver must be a supertype of the return type";
    }

    private final boolean incDecCheckForExpectClass(agcj agcjVar, agdq agdqVar) {
        ahnd classId;
        aigl returnType;
        ahya value = agdqVar.getValue();
        value.getClass();
        if (!(value instanceof ahxy)) {
            return false;
        }
        agba classDescriptor = ((ahxy) value).getClassDescriptor();
        if (!classDescriptor.isExpect() || (classId = ahvz.getClassId(classDescriptor)) == null) {
            return false;
        }
        agbd agbdVarFindClassifierAcrossModuleDependencies = agch.findClassifierAcrossModuleDependencies(ahvz.getModule(classDescriptor), classId);
        aged agedVar = agbdVarFindClassifierAcrossModuleDependencies instanceof aged ? (aged) agbdVarFindClassifierAcrossModuleDependencies : null;
        if (agedVar == null || (returnType = agcjVar.getReturnType()) == null) {
            return false;
        }
        return aimr.isSubtypeOf(returnType, agedVar.getExpandedType());
    }

    @Override // defpackage.aimz
    public List<aino> getChecks$org_jetbrains_kotlin_descriptors() {
        return checks;
    }
}
