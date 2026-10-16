package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aian {
    private final ahyy c;
    private final afec<Integer, agbd> classifierDescriptors;
    private final String containerPresentableName;
    private final String debugName;
    private final aian parent;
    private final afec<Integer, agbd> typeAliasDescriptors;
    private final Map<Integer, agee> typeParameterDescriptors;

    public aian(ahyy ahyyVar, aian aianVar, List<ahjv> list, String str, String str2) {
        Map<Integer, agee> linkedHashMap;
        ahyyVar.getClass();
        list.getClass();
        str.getClass();
        str2.getClass();
        this.c = ahyyVar;
        this.parent = aianVar;
        this.debugName = str;
        this.containerPresentableName = str2;
        this.classifierDescriptors = ahyyVar.getStorageManager().createMemoizedFunctionWithNullableValues(new aiah(this));
        this.typeAliasDescriptors = ahyyVar.getStorageManager().createMemoizedFunctionWithNullableValues(new aiai(this));
        if (list.isEmpty()) {
            linkedHashMap = afbf.a;
        } else {
            linkedHashMap = new LinkedHashMap<>();
            int i = 0;
            for (ahjv ahjvVar : list) {
                linkedHashMap.put(Integer.valueOf(ahjvVar.getId()), new aicy(this.c, ahjvVar, i));
                i++;
            }
        }
        this.typeParameterDescriptors = linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final agbd computeClassifierDescriptor(int i) {
        ahnd classId = ahzz.getClassId(this.c.getNameResolver(), i);
        boolean zIsLocal = classId.isLocal();
        ahyy ahyyVar = this.c;
        return zIsLocal ? ahyyVar.getComponents().deserializeClass(classId) : agch.findClassifierAcrossModuleDependencies(ahyyVar.getComponents().getModuleDescriptor(), classId);
    }

    private final aigw computeLocalClassifierReplacementType(int i) {
        if (ahzz.getClassId(this.c.getNameResolver(), i).isLocal()) {
            return this.c.getComponents().getLocalClassifierTypeSettings().getReplacementTypeForLocalClassifiers();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final agbd computeTypeAliasDescriptor(int i) {
        ahnd classId = ahzz.getClassId(this.c.getNameResolver(), i);
        if (classId.isLocal()) {
            return null;
        }
        return agch.findTypeAliasAcrossModuleDependencies(this.c.getComponents().getModuleDescriptor(), classId);
    }

    private final aigw createSimpleSuspendFunctionType(aigl aiglVar, aigl aiglVar2) {
        afye builtIns = aimr.getBuiltIns(aiglVar);
        agfk annotations = aiglVar.getAnnotations();
        aigl receiverTypeFromFunctionType = afxy.getReceiverTypeFromFunctionType(aiglVar);
        List<aigl> contextReceiverTypesFromFunctionType = afxy.getContextReceiverTypesFromFunctionType(aiglVar);
        List listBS = woy.bS(afxy.getValueParameterTypesFromFunctionType(aiglVar), 1);
        ArrayList arrayList = new ArrayList(woy.bp(listBS, 10));
        Iterator it = listBS.iterator();
        while (it.hasNext()) {
            arrayList.add(((aiin) it.next()).getType());
        }
        return afxy.createFunctionType(builtIns, annotations, receiverTypeFromFunctionType, contextReceiverTypesFromFunctionType, arrayList, null, aiglVar2, true).makeNullableAsSpecified(aiglVar.isMarkedNullable());
    }

    private final aigw createSuspendFunctionType(aihr aihrVar, aiid aiidVar, List<? extends aiin> list, boolean z) {
        List<? extends aiin> list2;
        aigw aigwVarCreateSuspendFunctionTypeForBasicCase;
        int size;
        int size2 = aiidVar.getParameters().size() - list.size();
        if (size2 != 0) {
            aigwVarCreateSuspendFunctionTypeForBasicCase = null;
            if (size2 == 1 && list.size() - 1 >= 0) {
                aiid typeConstructor = aiidVar.getBuiltIns().getSuspendFunction(size).getTypeConstructor();
                typeConstructor.getClass();
                list2 = list;
                aigwVarCreateSuspendFunctionTypeForBasicCase = aigq.simpleType$default(aihrVar, typeConstructor, list2, z, (aiju) null, 16, (Object) null);
            } else {
                list2 = list;
            }
        } else {
            list2 = list;
            aigwVarCreateSuspendFunctionTypeForBasicCase = createSuspendFunctionTypeForBasicCase(aihrVar, aiidVar, list2, z);
        }
        return aigwVarCreateSuspendFunctionTypeForBasicCase == null ? ailm.INSTANCE.createErrorTypeWithArguments(aill.INCONSISTENT_SUSPEND_FUNCTION, list2, aiidVar, new String[0]) : aigwVarCreateSuspendFunctionTypeForBasicCase;
    }

    private final aigw createSuspendFunctionTypeForBasicCase(aihr aihrVar, aiid aiidVar, List<? extends aiin> list, boolean z) {
        aigw aigwVarSimpleType$default = aigq.simpleType$default(aihrVar, aiidVar, list, z, (aiju) null, 16, (Object) null);
        if (afxy.isFunctionType(aigwVarSimpleType$default)) {
            return transformRuntimeFunctionTypeToSuspendFunction(aigwVarSimpleType$default);
        }
        return null;
    }

    private final agee loadTypeParameter(int i) {
        agee ageeVar = this.typeParameterDescriptors.get(Integer.valueOf(i));
        if (ageeVar != null) {
            return ageeVar;
        }
        aian aianVar = this.parent;
        if (aianVar == null) {
            return null;
        }
        return aianVar.loadTypeParameter(i);
    }

    private static final List<ahjl> simpleType$collectAllArguments(ahjn ahjnVar, aian aianVar) {
        List<ahjl> argumentList = ahjnVar.getArgumentList();
        argumentList.getClass();
        ahjn ahjnVarOuterType = ahlg.outerType(ahjnVar, aianVar.c.getTypeTable());
        List<ahjl> listSimpleType$collectAllArguments = ahjnVarOuterType != null ? simpleType$collectAllArguments(ahjnVarOuterType, aianVar) : null;
        if (listSimpleType$collectAllArguments == null) {
            listSimpleType$collectAllArguments = afbe.a;
        }
        return woy.bY(argumentList, listSimpleType$collectAllArguments);
    }

    public static /* synthetic */ aigw simpleType$default(aian aianVar, ahjn ahjnVar, boolean z, int i, Object obj) {
        return aianVar.simpleType(ahjnVar, z | (!((i & 2) == 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List simpleType$lambda$0(aian aianVar, ahjn ahjnVar) {
        return aianVar.c.getComponents().getAnnotationAndConstantLoader().loadTypeAnnotations(ahjnVar, aianVar.c.getNameResolver());
    }

    private final aihr toAttributes(List<? extends aihp> list, agfk agfkVar, aiid aiidVar, agbi agbiVar) {
        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((aihp) it.next()).toAttributes(agfkVar, aiidVar, agbiVar));
        }
        return aihr.Companion.create(woy.bq(arrayList));
    }

    private final aigw transformRuntimeFunctionTypeToSuspendFunction(aigl aiglVar) {
        aigl type;
        aiin aiinVar = (aiin) woy.bL(afxy.getValueParameterTypesFromFunctionType(aiglVar));
        if (aiinVar == null || (type = aiinVar.getType()) == null) {
            return null;
        }
        agbd declarationDescriptor = type.getConstructor().getDeclarationDescriptor();
        ahnf fqNameSafe = declarationDescriptor != null ? ahvz.getFqNameSafe(declarationDescriptor) : null;
        if (type.getArguments().size() != 1 || (!affa.f(fqNameSafe, afyo.CONTINUATION_INTERFACE_FQ_NAME) && !affa.f(fqNameSafe, aiao.EXPERIMENTAL_CONTINUATION_FQ_NAME))) {
            return (aigw) aiglVar;
        }
        aigl type2 = ((aiin) woy.bN(type.getArguments())).getType();
        type2.getClass();
        agbi containingDeclaration = this.c.getContainingDeclaration();
        agav agavVar = containingDeclaration instanceof agav ? (agav) containingDeclaration : null;
        return affa.f(agavVar != null ? ahvz.fqNameOrNull(agavVar) : null, aiag.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME) ? createSimpleSuspendFunctionType(aiglVar, type2) : createSimpleSuspendFunctionType(aiglVar, type2);
    }

    private final aiin typeArgument(agee ageeVar, ahjl ahjlVar) {
        if (ahjlVar.getProjection() == ahjk.STAR) {
            return ageeVar == null ? new aihb(this.c.getComponents().getModuleDescriptor().getBuiltIns()) : new aihd(ageeVar);
        }
        aiae aiaeVar = aiae.INSTANCE;
        ahjk projection = ahjlVar.getProjection();
        projection.getClass();
        aijg aijgVarVariance = aiaeVar.variance(projection);
        ahjn ahjnVarType = ahlg.type(ahjlVar, this.c.getTypeTable());
        return ahjnVarType == null ? new aiip(ailm.createErrorType(aill.NO_RECORDED_TYPE, ahjlVar.toString())) : new aiip(aijgVarVariance, type(ahjnVarType));
    }

    private final aiid typeConstructor(ahjn ahjnVar) {
        agbd agbdVarInvoke;
        Object next;
        if (ahjnVar.hasClassName()) {
            agbdVarInvoke = this.classifierDescriptors.invoke(Integer.valueOf(ahjnVar.getClassName()));
            if (agbdVarInvoke == null) {
                agbdVarInvoke = typeConstructor$notFoundClass(this, ahjnVar, ahjnVar.getClassName());
            }
        } else if (ahjnVar.hasTypeParameter()) {
            agbdVarInvoke = loadTypeParameter(ahjnVar.getTypeParameter());
            if (agbdVarInvoke == null) {
                return ailm.INSTANCE.createErrorTypeConstructor(aill.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(ahjnVar.getTypeParameter()), this.containerPresentableName);
            }
        } else if (ahjnVar.hasTypeParameterName()) {
            String string = this.c.getNameResolver().getString(ahjnVar.getTypeParameterName());
            Iterator<T> it = getOwnTypeParameters().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (affa.f(((agee) next).getName().asString(), string)) {
                    break;
                }
            }
            agbdVarInvoke = (agee) next;
            if (agbdVarInvoke == null) {
                return ailm.INSTANCE.createErrorTypeConstructor(aill.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, this.c.getContainingDeclaration().toString());
            }
        } else {
            if (!ahjnVar.hasTypeAliasName()) {
                return ailm.INSTANCE.createErrorTypeConstructor(aill.UNKNOWN_TYPE, new String[0]);
            }
            agbdVarInvoke = this.typeAliasDescriptors.invoke(Integer.valueOf(ahjnVar.getTypeAliasName()));
            if (agbdVarInvoke == null) {
                agbdVarInvoke = typeConstructor$notFoundClass(this, ahjnVar, ahjnVar.getTypeAliasName());
            }
        }
        aiid typeConstructor = agbdVarInvoke.getTypeConstructor();
        typeConstructor.getClass();
        return typeConstructor;
    }

    private static final agba typeConstructor$notFoundClass(aian aianVar, ahjn ahjnVar, int i) {
        ahnd classId = ahzz.getClassId(aianVar.c.getNameResolver(), i);
        airp airpVarQ = afrg.q(afrg.f(ahjnVar, new aiak(aianVar)), aial.INSTANCE);
        ArrayList arrayList = new ArrayList();
        aisc aiscVar = new aisc((aisd) airpVarQ);
        while (aiscVar.hasNext()) {
            arrayList.add(aiscVar.next());
        }
        int iG = afrg.g(afrg.f(classId, new affn() { // from class: aiam
            @Override // defpackage.affn, defpackage.afhx
            public Object get(Object obj) {
                return ((ahnd) obj).getOuterClassId();
            }
        }));
        while (arrayList.size() < iG) {
            arrayList.add(0);
        }
        return aianVar.c.getComponents().getNotFoundClasses().getClass(classId, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahjn typeConstructor$notFoundClass$lambda$0(aian aianVar, ahjn ahjnVar) {
        ahjnVar.getClass();
        return ahlg.outerType(ahjnVar, aianVar.c.getTypeTable());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int typeConstructor$notFoundClass$lambda$1(ahjn ahjnVar) {
        ahjnVar.getClass();
        return ahjnVar.getArgumentCount();
    }

    public final List<agee> getOwnTypeParameters() {
        return woy.cf(this.typeParameterDescriptors.values());
    }

    public final aigw simpleType(ahjn ahjnVar, boolean z) {
        aigw aigwVarMakeDefinitelyNotNull;
        ahjnVar.getClass();
        aigw aigwVarComputeLocalClassifierReplacementType = ahjnVar.hasClassName() ? computeLocalClassifierReplacementType(ahjnVar.getClassName()) : ahjnVar.hasTypeAliasName() ? computeLocalClassifierReplacementType(ahjnVar.getTypeAliasName()) : null;
        if (aigwVarComputeLocalClassifierReplacementType != null) {
            return aigwVarComputeLocalClassifierReplacementType;
        }
        aiid aiidVarTypeConstructor = typeConstructor(ahjnVar);
        if (ailm.isError(aiidVarTypeConstructor.getDeclarationDescriptor())) {
            return ailm.INSTANCE.createErrorType(aill.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, aiidVarTypeConstructor, aiidVarTypeConstructor.toString());
        }
        aiaw aiawVar = new aiaw(this.c.getStorageManager(), new aiaj(this, ahjnVar));
        aihr attributes = toAttributes(this.c.getComponents().getTypeAttributeTranslators(), aiawVar, aiidVarTypeConstructor, this.c.getContainingDeclaration());
        List<ahjl> listSimpleType$collectAllArguments = simpleType$collectAllArguments(ahjnVar, this);
        ArrayList arrayList = new ArrayList(woy.bp(listSimpleType$collectAllArguments, 10));
        int i = 0;
        for (Object obj : listSimpleType$collectAllArguments) {
            int i2 = i + 1;
            if (i < 0) {
                woy.bo();
            }
            List<agee> parameters = aiidVarTypeConstructor.getParameters();
            parameters.getClass();
            arrayList.add(typeArgument((agee) woy.bI(parameters, i), (ahjl) obj));
            i = i2;
        }
        List<? extends aiin> listCf = woy.cf(arrayList);
        agbd declarationDescriptor = aiidVarTypeConstructor.getDeclarationDescriptor();
        if (z && (declarationDescriptor instanceof aged)) {
            aigw aigwVarComputeExpandedType = aigq.computeExpandedType((aged) declarationDescriptor, listCf);
            aihr attributes2 = toAttributes(this.c.getComponents().getTypeAttributeTranslators(), agfk.Companion.create(woy.bW(aiawVar, aigwVarComputeExpandedType.getAnnotations())), aiidVarTypeConstructor, this.c.getContainingDeclaration());
            boolean z2 = true;
            if (!aigr.isNullable(aigwVarComputeExpandedType) && !ahjnVar.getNullable()) {
                z2 = false;
            }
            aigwVarMakeDefinitelyNotNull = aigwVarComputeExpandedType.makeNullableAsSpecified(z2).replaceAttributes(attributes2);
        } else if (ahla.SUSPEND_TYPE.get(ahjnVar.getFlags()).booleanValue()) {
            aigwVarMakeDefinitelyNotNull = createSuspendFunctionType(attributes, aiidVarTypeConstructor, listCf, ahjnVar.getNullable());
        } else {
            aigw aigwVarSimpleType$default = aigq.simpleType$default(attributes, aiidVarTypeConstructor, listCf, ahjnVar.getNullable(), (aiju) null, 16, (Object) null);
            if (ahla.DEFINITELY_NOT_NULL_TYPE.get(ahjnVar.getFlags()).booleanValue()) {
                aigwVarMakeDefinitelyNotNull = aifo.Companion.makeDefinitelyNotNull(aigwVarSimpleType$default, true & ((4 & 2) == 0), false & ((4 & 4) == 0));
                if (aigwVarMakeDefinitelyNotNull == null) {
                    throw new IllegalStateException("null DefinitelyNotNullType for '" + aigwVarSimpleType$default + '\'');
                }
            } else {
                aigwVarMakeDefinitelyNotNull = aigwVarSimpleType$default;
            }
        }
        ahjn ahjnVarAbbreviatedType = ahlg.abbreviatedType(ahjnVar, this.c.getTypeTable());
        return ahjnVarAbbreviatedType != null ? aiha.withAbbreviation(aigwVarMakeDefinitelyNotNull, simpleType(ahjnVarAbbreviatedType, false)) : aigwVarMakeDefinitelyNotNull;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.debugName);
        aian aianVar = this.parent;
        sb.append(aianVar == null ? "" : ". Child of ".concat(String.valueOf(aianVar.debugName)));
        return sb.toString();
    }

    public final aigl type(ahjn ahjnVar) {
        ahjnVar.getClass();
        if (!ahjnVar.hasFlexibleTypeCapabilitiesId()) {
            return simpleType(ahjnVar, true);
        }
        String string = this.c.getNameResolver().getString(ahjnVar.getFlexibleTypeCapabilitiesId());
        aigw aigwVarSimpleType$default = simpleType$default(this, ahjnVar, false, 2, null);
        ahjn ahjnVarFlexibleUpperBound = ahlg.flexibleUpperBound(ahjnVar, this.c.getTypeTable());
        ahjnVarFlexibleUpperBound.getClass();
        return this.c.getComponents().getFlexibleTypeDeserializer().create(ahjnVar, string, aigwVarSimpleType$default, simpleType$default(this, ahjnVarFlexibleUpperBound, false, 2, null));
    }
}
