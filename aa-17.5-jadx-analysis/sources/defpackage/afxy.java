package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class afxy {
    /* JADX WARN: Multi-variable type inference failed */
    public static final int contextFunctionTypeParamsCount(aigl aiglVar) {
        aiglVar.getClass();
        agfc agfcVarFindAnnotation = aiglVar.getAnnotations().findAnnotation(afyn.contextFunctionTypeParams);
        if (agfcVarFindAnnotation == null) {
            return 0;
        }
        ahuh ahuhVar = (ahuh) woy.aY(agfcVarFindAnnotation.getAllValueArguments(), afyo.CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME);
        ahuhVar.getClass();
        return ((Number) ((ahuq) ahuhVar).getValue()).intValue();
    }

    public static final aigw createFunctionType(afye afyeVar, agfk agfkVar, aigl aiglVar, List<? extends aigl> list, List<? extends aigl> list2, List<ahnj> list3, aigl aiglVar2, boolean z) {
        afyeVar.getClass();
        agfkVar.getClass();
        list.getClass();
        list2.getClass();
        aiglVar2.getClass();
        List<aiin> functionTypeArgumentProjections = getFunctionTypeArgumentProjections(aiglVar, list, list2, list3, aiglVar2, afyeVar);
        agba functionDescriptor = getFunctionDescriptor(afyeVar, list2.size() + list.size() + (aiglVar == null ? 0 : 1), z);
        if (aiglVar != null) {
            agfkVar = withExtensionFunctionAnnotation(agfkVar, afyeVar);
        }
        if (!list.isEmpty()) {
            agfkVar = withContextReceiversFunctionAnnotation(agfkVar, afyeVar, list.size());
        }
        return aigq.simpleNotNullType(aihs.toDefaultAttributes(agfkVar), functionDescriptor, functionTypeArgumentProjections);
    }

    public static final ahnj extractParameterNameFromFunctionTypeArgument(aigl aiglVar) {
        String str;
        aiglVar.getClass();
        agfc agfcVarFindAnnotation = aiglVar.getAnnotations().findAnnotation(afyn.parameterName);
        if (agfcVarFindAnnotation != null) {
            Object objBO = woy.bO(agfcVarFindAnnotation.getAllValueArguments().values());
            ahvh ahvhVar = objBO instanceof ahvh ? (ahvh) objBO : null;
            if (ahvhVar != null && (str = (String) ahvhVar.getValue()) != null) {
                if (true != ahnj.isValidIdentifier(str)) {
                    str = null;
                }
                if (str != null) {
                    return ahnj.identifier(str);
                }
            }
        }
        return null;
    }

    public static final List<aigl> getContextReceiverTypesFromFunctionType(aigl aiglVar) {
        aiglVar.getClass();
        isBuiltinFunctionalType(aiglVar);
        int iContextFunctionTypeParamsCount = contextFunctionTypeParamsCount(aiglVar);
        if (iContextFunctionTypeParamsCount == 0) {
            return afbe.a;
        }
        List<aiin> listSubList = aiglVar.getArguments().subList(0, iContextFunctionTypeParamsCount);
        ArrayList arrayList = new ArrayList(woy.bp(listSubList, 10));
        Iterator<T> it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((aiin) it.next()).getType());
        }
        return arrayList;
    }

    public static final agba getFunctionDescriptor(afye afyeVar, int i, boolean z) {
        afyeVar.getClass();
        agba suspendFunction = z ? afyeVar.getSuspendFunction(i) : afyeVar.getFunction(i);
        suspendFunction.getClass();
        return suspendFunction;
    }

    public static final List<aiin> getFunctionTypeArgumentProjections(aigl aiglVar, List<? extends aigl> list, List<? extends aigl> list2, List<ahnj> list3, aigl aiglVar2, afye afyeVar) {
        ahnj ahnjVar;
        afye afyeVar2;
        list.getClass();
        list2.getClass();
        aiglVar2.getClass();
        afyeVar.getClass();
        int i = 0;
        ArrayList arrayList = new ArrayList(list2.size() + list.size() + (aiglVar != null ? 1 : 0) + 1);
        ArrayList arrayList2 = new ArrayList(woy.bp(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(aimr.asTypeProjection((aigl) it.next()));
        }
        arrayList.addAll(arrayList2);
        aiow.addIfNotNull(arrayList, aiglVar != null ? aimr.asTypeProjection(aiglVar) : null);
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                woy.bo();
            }
            aigl aiglVarReplaceAnnotations = (aigl) obj;
            if (list3 == null || (ahnjVar = list3.get(i)) == null || ahnjVar.isSpecial()) {
                ahnjVar = null;
            }
            if (ahnjVar != null) {
                ahnf ahnfVar = afyn.parameterName;
                ahnj ahnjVar2 = afyo.NAME;
                String strAsString = ahnjVar.asString();
                strAsString.getClass();
                Map mapAW = woy.aW(new aezu(ahnjVar2, new ahvh(strAsString)));
                afyeVar2 = afyeVar;
                aiglVarReplaceAnnotations = aimr.replaceAnnotations(aiglVarReplaceAnnotations, agfk.Companion.create(woy.bX(aiglVarReplaceAnnotations.getAnnotations(), new agfo(afyeVar2, ahnfVar, mapAW, false, 8, null))));
            } else {
                afyeVar2 = afyeVar;
            }
            arrayList.add(aimr.asTypeProjection(aiglVarReplaceAnnotations));
            i = i2;
            afyeVar = afyeVar2;
        }
        arrayList.add(aimr.asTypeProjection(aiglVar2));
        return arrayList;
    }

    private static final afzh getFunctionTypeKind(ahnh ahnhVar) {
        if (!ahnhVar.isSafe() || ahnhVar.isRoot()) {
            return null;
        }
        afzk afzkVar = afzk.Companion.getDefault();
        ahnf ahnfVarParent = ahnhVar.toSafe().parent();
        String strAsString = ahnhVar.shortName().asString();
        strAsString.getClass();
        return afzkVar.getFunctionalClassKind(ahnfVarParent, strAsString);
    }

    public static final aigl getReceiverTypeFromFunctionType(aigl aiglVar) {
        aiglVar.getClass();
        isBuiltinFunctionalType(aiglVar);
        if (!isTypeAnnotatedWithExtensionFunctionType(aiglVar)) {
            return null;
        }
        return aiglVar.getArguments().get(contextFunctionTypeParamsCount(aiglVar)).getType();
    }

    public static final aigl getReturnTypeFromFunctionType(aigl aiglVar) {
        aiglVar.getClass();
        isBuiltinFunctionalType(aiglVar);
        aigl type = ((aiin) woy.bK(aiglVar.getArguments())).getType();
        type.getClass();
        return type;
    }

    public static final List<aiin> getValueParameterTypesFromFunctionType(aigl aiglVar) {
        aiglVar.getClass();
        isBuiltinFunctionalType(aiglVar);
        return aiglVar.getArguments().subList(contextFunctionTypeParamsCount(aiglVar) + (isBuiltinExtensionFunctionalType(aiglVar) ? 1 : 0), r0.size() - 1);
    }

    public static final boolean isBuiltinExtensionFunctionalType(aigl aiglVar) {
        aiglVar.getClass();
        return isBuiltinFunctionalType(aiglVar) && isTypeAnnotatedWithExtensionFunctionType(aiglVar);
    }

    public static final boolean isBuiltinFunctionalClassDescriptor(agbi agbiVar) {
        agbiVar.getClass();
        afzh functionTypeKind = getFunctionTypeKind(agbiVar);
        return affa.f(functionTypeKind, afzd.INSTANCE) || affa.f(functionTypeKind, afzg.INSTANCE);
    }

    public static final boolean isBuiltinFunctionalType(aigl aiglVar) {
        aiglVar.getClass();
        agbd declarationDescriptor = aiglVar.getConstructor().getDeclarationDescriptor();
        return declarationDescriptor != null && isBuiltinFunctionalClassDescriptor(declarationDescriptor);
    }

    public static final boolean isFunctionType(aigl aiglVar) {
        aiglVar.getClass();
        return affa.f(getFunctionTypeKind(aiglVar), afzd.INSTANCE);
    }

    public static final boolean isNumberedFunctionClassFqName(ahnh ahnhVar) {
        ahnhVar.getClass();
        return ahnhVar.startsWith(afyo.BUILT_INS_PACKAGE_NAME) && affa.f(getFunctionTypeKind(ahnhVar), afzd.INSTANCE);
    }

    public static final boolean isSuspendFunctionType(aigl aiglVar) {
        aiglVar.getClass();
        return affa.f(getFunctionTypeKind(aiglVar), afzg.INSTANCE);
    }

    private static final boolean isTypeAnnotatedWithExtensionFunctionType(aigl aiglVar) {
        return aiglVar.getAnnotations().findAnnotation(afyn.extensionFunctionType) != null;
    }

    public static final agfk withContextReceiversFunctionAnnotation(agfk agfkVar, afye afyeVar, int i) {
        agfkVar.getClass();
        afyeVar.getClass();
        return agfkVar.hasAnnotation(afyn.contextFunctionTypeParams) ? agfkVar : agfk.Companion.create(woy.bX(agfkVar, new agfo(afyeVar, afyn.contextFunctionTypeParams, woy.aW(new aezu(afyo.CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME, new ahuq(i))), false, 8, null)));
    }

    public static final agfk withExtensionFunctionAnnotation(agfk agfkVar, afye afyeVar) {
        agfkVar.getClass();
        afyeVar.getClass();
        return agfkVar.hasAnnotation(afyn.extensionFunctionType) ? agfkVar : agfk.Companion.create(woy.bX(agfkVar, new agfo(afyeVar, afyn.extensionFunctionType, afbf.a, false, 8, null)));
    }

    public static final afzh getFunctionTypeKind(agbi agbiVar) {
        agbiVar.getClass();
        if ((agbiVar instanceof agba) && afye.isUnderKotlinPackage(agbiVar)) {
            return getFunctionTypeKind(ahvz.getFqNameUnsafe(agbiVar));
        }
        return null;
    }

    public static final afzh getFunctionTypeKind(aigl aiglVar) {
        aiglVar.getClass();
        agbd declarationDescriptor = aiglVar.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor != null) {
            return getFunctionTypeKind(declarationDescriptor);
        }
        return null;
    }
}
