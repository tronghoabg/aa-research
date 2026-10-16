package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ahzy {
    private final ahyk annotationDeserializer;
    private final ahyy c;

    public ahzy(ahyy ahyyVar) {
        ahyyVar.getClass();
        this.c = ahyyVar;
        this.annotationDeserializer = new ahyk(ahyyVar.getComponents().getModuleDescriptor(), ahyyVar.getComponents().getNotFoundClasses());
    }

    private final aiad asProtoContainer(agbi agbiVar) {
        if (agbiVar instanceof agdc) {
            ahnf fqName = ((agdc) agbiVar).getFqName();
            ahyy ahyyVar = this.c;
            return new aiac(fqName, ahyyVar.getNameResolver(), ahyyVar.getTypeTable(), ahyyVar.getContainerSource());
        }
        if (agbiVar instanceof aibt) {
            return ((aibt) agbiVar).getThisAsProtoContainer$org_jetbrains_kotlin_deserialization();
        }
        return null;
    }

    private final List<agdq> contextReceivers(List<ahjn> list, List<ahkb> list2, ahpg ahpgVar, ahyh ahyhVar) {
        agbi containingDeclaration = this.c.getContainingDeclaration();
        containingDeclaration.getClass();
        agav agavVar = (agav) containingDeclaration;
        agbi containingDeclaration2 = agavVar.getContainingDeclaration();
        containingDeclaration2.getClass();
        aiad aiadVarAsProtoContainer = asProtoContainer(containingDeclaration2);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                woy.bo();
            }
            ahjn ahjnVar = (ahjn) obj;
            ahkb ahkbVar = (ahkb) woy.bI(list2, i);
            agdq agdqVarCreateContextReceiverParameterForCallable = ahss.createContextReceiverParameterForCallable(agavVar, this.c.getTypeDeserializer().type(ahjnVar), null, (aiadVarAsProtoContainer == null || !ahla.HAS_ANNOTATIONS.get((ahkbVar == null || !ahkbVar.hasFlags()) ? 0 : ahkbVar.getFlags()).booleanValue()) ? agfk.Companion.getEMPTY() : new aicz(this.c.getStorageManager(), new ahzv(this, aiadVarAsProtoContainer, ahpgVar, ahyhVar, i, ahkbVar)), i);
            if (agdqVarCreateContextReceiverParameterForCallable != null) {
                arrayList.add(agdqVarCreateContextReceiverParameterForCallable);
            }
            i = i2;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List contextReceivers$lambda$0$0(ahzy ahzyVar, aiad aiadVar, ahpg ahpgVar, ahyh ahyhVar, int i, ahkb ahkbVar) {
        return woy.cf(ahzyVar.c.getComponents().getAnnotationAndConstantLoader().loadContextParameterAnnotations(aiadVar, ahpgVar, ahyhVar, i, ahkbVar));
    }

    private final agfk getAnnotations(ahpg ahpgVar, int i, ahyh ahyhVar) {
        return !ahla.HAS_ANNOTATIONS.get(i).booleanValue() ? agfk.Companion.getEMPTY() : new aicz(this.c.getStorageManager(), new ahzr(this, ahpgVar, ahyhVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getAnnotations$lambda$0(ahzy ahzyVar, ahpg ahpgVar, ahyh ahyhVar) {
        aiad aiadVarAsProtoContainer = ahzyVar.asProtoContainer(ahzyVar.c.getContainingDeclaration());
        List listCf = aiadVarAsProtoContainer != null ? woy.cf(ahzyVar.c.getComponents().getAnnotationAndConstantLoader().loadCallableAnnotations(aiadVarAsProtoContainer, ahpgVar, ahyhVar)) : null;
        return listCf == null ? afbe.a : listCf;
    }

    private final agdq getDispatchReceiverParameter() {
        agbi containingDeclaration = this.c.getContainingDeclaration();
        agba agbaVar = containingDeclaration instanceof agba ? (agba) containingDeclaration : null;
        if (agbaVar != null) {
            return agbaVar.getThisAsReceiverParameter();
        }
        return null;
    }

    private final agfk getPropertyFieldAnnotations(ahis ahisVar, boolean z) {
        return !ahla.HAS_ANNOTATIONS.get(ahisVar.getFlags()).booleanValue() ? agfk.Companion.getEMPTY() : new aicz(this.c.getStorageManager(), new ahzs(this, z, ahisVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getPropertyFieldAnnotations$lambda$0(ahzy ahzyVar, boolean z, ahis ahisVar) {
        aiad aiadVarAsProtoContainer = ahzyVar.asProtoContainer(ahzyVar.c.getContainingDeclaration());
        List listCf = aiadVarAsProtoContainer != null ? z ? woy.cf(ahzyVar.c.getComponents().getAnnotationAndConstantLoader().loadPropertyDelegateFieldAnnotations(aiadVarAsProtoContainer, ahisVar)) : woy.cf(ahzyVar.c.getComponents().getAnnotationAndConstantLoader().loadPropertyBackingFieldAnnotations(aiadVarAsProtoContainer, ahisVar)) : null;
        return listCf == null ? afbe.a : listCf;
    }

    private final agfk getReceiverParameterAnnotations(ahpg ahpgVar, ahyh ahyhVar) {
        return new aiaw(this.c.getStorageManager(), new ahzt(this, ahpgVar, ahyhVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getReceiverParameterAnnotations$lambda$0(ahzy ahzyVar, ahpg ahpgVar, ahyh ahyhVar) {
        aiad aiadVarAsProtoContainer = ahzyVar.asProtoContainer(ahzyVar.c.getContainingDeclaration());
        List<agfc> listLoadExtensionReceiverParameterAnnotations = aiadVarAsProtoContainer != null ? ahzyVar.c.getComponents().getAnnotationAndConstantLoader().loadExtensionReceiverParameterAnnotations(aiadVarAsProtoContainer, ahpgVar, ahyhVar) : null;
        return listLoadExtensionReceiverParameterAnnotations == null ? afbe.a : listLoadExtensionReceiverParameterAnnotations;
    }

    private final void initializeWithCoroutinesExperimentalityStatus(aicv aicvVar, agdq agdqVar, agdq agdqVar2, List<? extends agdq> list, List<? extends agee> list2, List<? extends agel> list3, aigl aiglVar, agcq agcqVar, agcc agccVar, Map<? extends agau<?>, ?> map) {
        aicvVar.initialize(agdqVar, agdqVar2, list, list2, list3, aiglVar, agcqVar, agccVar, map);
    }

    private final int loadOldFlags(int i) {
        return (i & 63) + ((i >> 8) << 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aied loadProperty$lambda$2(ahzy ahzyVar, ahis ahisVar, aicu aicuVar) {
        return ahzyVar.c.getStorageManager().createNullableLazyValue(new ahzw(ahzyVar, ahisVar, aicuVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahuh loadProperty$lambda$2$0(ahzy ahzyVar, ahis ahisVar, aicu aicuVar) {
        aiad aiadVarAsProtoContainer = ahzyVar.asProtoContainer(ahzyVar.c.getContainingDeclaration());
        aiadVarAsProtoContainer.getClass();
        ahyi<agfc, ahuh<?>> annotationAndConstantLoader = ahzyVar.c.getComponents().getAnnotationAndConstantLoader();
        aigl returnType = aicuVar.getReturnType();
        returnType.getClass();
        return annotationAndConstantLoader.loadPropertyConstant(aiadVarAsProtoContainer, ahisVar, returnType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aied loadProperty$lambda$3(ahzy ahzyVar, ahis ahisVar, aicu aicuVar) {
        return ahzyVar.c.getStorageManager().createNullableLazyValue(new ahzx(ahzyVar, ahisVar, aicuVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahuh loadProperty$lambda$3$0(ahzy ahzyVar, ahis ahisVar, aicu aicuVar) {
        aiad aiadVarAsProtoContainer = ahzyVar.asProtoContainer(ahzyVar.c.getContainingDeclaration());
        aiadVarAsProtoContainer.getClass();
        ahyi<agfc, ahuh<?>> annotationAndConstantLoader = ahzyVar.c.getComponents().getAnnotationAndConstantLoader();
        aigl returnType = aicuVar.getReturnType();
        returnType.getClass();
        return annotationAndConstantLoader.loadAnnotationDefaultValue(aiadVarAsProtoContainer, ahisVar, returnType);
    }

    private final List<agel> valueParameters(List<ahkb> list, ahpg ahpgVar, ahyh ahyhVar) {
        ahzy ahzyVar;
        aiad aiadVar;
        agfk empty;
        ahzy ahzyVar2 = this;
        agbi containingDeclaration = ahzyVar2.c.getContainingDeclaration();
        containingDeclaration.getClass();
        agav agavVar = (agav) containingDeclaration;
        agbi containingDeclaration2 = agavVar.getContainingDeclaration();
        containingDeclaration2.getClass();
        aiad aiadVarAsProtoContainer = ahzyVar2.asProtoContainer(containingDeclaration2);
        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                woy.bo();
            }
            ahkb ahkbVar = (ahkb) obj;
            int flags = ahkbVar.hasFlags() ? ahkbVar.getFlags() : 0;
            if (aiadVarAsProtoContainer == null || !ahla.HAS_ANNOTATIONS.get(flags).booleanValue()) {
                ahzyVar = ahzyVar2;
                aiadVar = aiadVarAsProtoContainer;
                empty = agfk.Companion.getEMPTY();
            } else {
                int i3 = i;
                ahzyVar = ahzyVar2;
                aiadVar = aiadVarAsProtoContainer;
                i = i3;
                empty = new aicz(ahzyVar2.c.getStorageManager(), new ahzu(ahzyVar2, aiadVarAsProtoContainer, ahpgVar, ahyhVar, i3, ahkbVar));
            }
            agfk agfkVar = empty;
            ahnj name = ahzz.getName(ahzyVar.c.getNameResolver(), ahkbVar.getName());
            ahyy ahyyVar = ahzyVar.c;
            aigl aiglVarType = ahyyVar.getTypeDeserializer().type(ahlg.type(ahkbVar, ahyyVar.getTypeTable()));
            boolean zBooleanValue = ahla.DECLARES_DEFAULT_VALUE.get(flags).booleanValue();
            boolean zBooleanValue2 = ahla.IS_CROSSINLINE.get(flags).booleanValue();
            Boolean bool = ahla.IS_NOINLINE.get(flags);
            ahyy ahyyVar2 = ahzyVar.c;
            boolean zBooleanValue3 = bool.booleanValue();
            ahjn ahjnVarVarargElementType = ahlg.varargElementType(ahkbVar, ahyyVar2.getTypeTable());
            aigl aiglVarType2 = ahjnVarVarargElementType != null ? ahzyVar.c.getTypeDeserializer().type(ahjnVarVarargElementType) : null;
            agdx agdxVar = agdx.NO_SOURCE;
            agdxVar.getClass();
            agav agavVar2 = agavVar;
            arrayList.add(new agiy(agavVar2, null, i, agfkVar, name, aiglVarType, zBooleanValue, zBooleanValue2, zBooleanValue3, aiglVarType2, agdxVar));
            ahzyVar2 = ahzyVar;
            agavVar = agavVar2;
            i = i2;
            aiadVarAsProtoContainer = aiadVar;
        }
        return woy.cf(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List valueParameters$lambda$0$0(ahzy ahzyVar, aiad aiadVar, ahpg ahpgVar, ahyh ahyhVar, int i, ahkb ahkbVar) {
        return woy.cf(ahzyVar.c.getComponents().getAnnotationAndConstantLoader().loadValueParameterAnnotations(aiadVar, ahpgVar, ahyhVar, i, ahkbVar));
    }

    public final agaz loadConstructor(ahhi ahhiVar, boolean z) {
        ahhiVar.getClass();
        agbi containingDeclaration = this.c.getContainingDeclaration();
        containingDeclaration.getClass();
        agba agbaVar = (agba) containingDeclaration;
        agfk annotations = getAnnotations(ahhiVar, ahhiVar.getFlags(), ahyh.FUNCTION);
        agaw agawVar = agaw.DECLARATION;
        ahyy ahyyVar = this.c;
        aiay aiayVar = new aiay(agbaVar, null, annotations, z, agawVar, ahhiVar, ahyyVar.getNameResolver(), ahyyVar.getTypeTable(), ahyyVar.getVersionRequirementTable(), ahyyVar.getContainerSource(), null, 1024, null);
        ahzy memberDeserializer = ahyy.childContext$default(this.c, aiayVar, afbe.a, null, null, null, null, 60, null).getMemberDeserializer();
        List<ahkb> valueParameterList = ahhiVar.getValueParameterList();
        valueParameterList.getClass();
        aiayVar.initialize(memberDeserializer.valueParameters(valueParameterList, ahhiVar, ahyh.FUNCTION), aiaf.descriptorVisibility(aiae.INSTANCE, ahla.VISIBILITY.get(ahhiVar.getFlags())));
        aiayVar.setReturnType(agbaVar.getDefaultType());
        aiayVar.setExpect(agbaVar.isExpect());
        aiayVar.setHasStableParameterNames(!ahla.IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES.get(ahhiVar.getFlags()).booleanValue());
        return aiayVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v8, types: [agdv] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final agdv loadFunction(ahif ahifVar) {
        aigl aiglVarType;
        ahifVar.getClass();
        int flags = ahifVar.hasFlags() ? ahifVar.getFlags() : loadOldFlags(ahifVar.getOldFlags());
        agfk annotations = getAnnotations(ahifVar, flags, ahyh.FUNCTION);
        agfk receiverParameterAnnotations = ahlg.hasReceiver(ahifVar) ? getReceiverParameterAnnotations(ahifVar, ahyh.FUNCTION) : agfk.Companion.getEMPTY();
        ahln empty = affa.f(ahvz.getFqNameSafe(this.c.getContainingDeclaration()).child(ahzz.getName(this.c.getNameResolver(), ahifVar.getName())), aiag.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME) ? ahln.Companion.getEMPTY() : this.c.getVersionRequirementTable();
        ahyy ahyyVar = this.c;
        agbi containingDeclaration = ahyyVar.getContainingDeclaration();
        ahnj name = ahzz.getName(ahyyVar.getNameResolver(), ahifVar.getName());
        agaw agawVarMemberKind = aiaf.memberKind(aiae.INSTANCE, ahla.MEMBER_KIND.get(flags));
        ahyy ahyyVar2 = this.c;
        ?? CreateExtensionReceiverParameterForCallable = 0;
        CreateExtensionReceiverParameterForCallable = 0;
        agfk agfkVar = receiverParameterAnnotations;
        aicv aicvVar = new aicv(containingDeclaration, CreateExtensionReceiverParameterForCallable, annotations, name, agawVarMemberKind, ahifVar, ahyyVar2.getNameResolver(), ahyyVar2.getTypeTable(), empty, ahyyVar2.getContainerSource(), null, 1024, null);
        ahyy ahyyVar3 = this.c;
        List<ahjv> typeParameterList = ahifVar.getTypeParameterList();
        typeParameterList.getClass();
        ahyy ahyyVarChildContext$default = ahyy.childContext$default(ahyyVar3, aicvVar, typeParameterList, null, null, null, null, 60, null);
        ahjn ahjnVarReceiverType = ahlg.receiverType(ahifVar, this.c.getTypeTable());
        if (ahjnVarReceiverType != null && (aiglVarType = ahyyVarChildContext$default.getTypeDeserializer().type(ahjnVarReceiverType)) != null) {
            CreateExtensionReceiverParameterForCallable = ahss.createExtensionReceiverParameterForCallable(aicvVar, aiglVarType, agfkVar);
        }
        agdq agdqVar = CreateExtensionReceiverParameterForCallable;
        agdq dispatchReceiverParameter = getDispatchReceiverParameter();
        ahzy memberDeserializer = ahyyVarChildContext$default.getMemberDeserializer();
        List<ahjn> listContextReceiverTypes = ahlg.contextReceiverTypes(ahifVar, this.c.getTypeTable());
        List<ahkb> contextParameterList = ahifVar.getContextParameterList();
        contextParameterList.getClass();
        List<agdq> listContextReceivers = memberDeserializer.contextReceivers(listContextReceiverTypes, contextParameterList, ahifVar, ahyh.FUNCTION);
        List<agee> ownTypeParameters = ahyyVarChildContext$default.getTypeDeserializer().getOwnTypeParameters();
        ahzy memberDeserializer2 = ahyyVarChildContext$default.getMemberDeserializer();
        List<ahkb> valueParameterList = ahifVar.getValueParameterList();
        valueParameterList.getClass();
        initializeWithCoroutinesExperimentalityStatus(aicvVar, agdqVar, dispatchReceiverParameter, listContextReceivers, ownTypeParameters, memberDeserializer2.valueParameters(valueParameterList, ahifVar, ahyh.FUNCTION), ahyyVarChildContext$default.getTypeDeserializer().type(ahlg.returnType(ahifVar, this.c.getTypeTable())), aiae.INSTANCE.modality(ahla.MODALITY.get(flags)), aiaf.descriptorVisibility(aiae.INSTANCE, ahla.VISIBILITY.get(flags)), afbf.a);
        aicvVar.setOperator(ahla.IS_OPERATOR.get(flags).booleanValue());
        aicvVar.setInfix(ahla.IS_INFIX.get(flags).booleanValue());
        aicvVar.setExternal(ahla.IS_EXTERNAL_FUNCTION.get(flags).booleanValue());
        aicvVar.setInline(ahla.IS_INLINE.get(flags).booleanValue());
        aicvVar.setTailrec(ahla.IS_TAILREC.get(flags).booleanValue());
        aicvVar.setSuspend(ahla.IS_SUSPEND.get(flags).booleanValue());
        aicvVar.setExpect(ahla.IS_EXPECT_FUNCTION.get(flags).booleanValue());
        aicvVar.setHasStableParameterNames(!ahla.IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES.get(flags).booleanValue());
        aezu<agau<?>, Object> aezuVarDeserializeContractFromFunction = this.c.getComponents().getContractDeserializer().deserializeContractFromFunction(ahifVar, aicvVar, this.c.getTypeTable(), ahyyVarChildContext$default.getTypeDeserializer());
        if (aezuVarDeserializeContractFromFunction != null) {
            aicvVar.putInUserDataMap((agau) aezuVarDeserializeContractFromFunction.a, aezuVarDeserializeContractFromFunction.b);
        }
        return aicvVar;
    }

    public final agdn loadProperty(ahis ahisVar, boolean z) {
        agfk annotations;
        agil agilVar;
        agim agimVarCreateDefaultSetter;
        aigl aiglVarType;
        ahisVar.getClass();
        int flags = ahisVar.hasFlags() ? ahisVar.getFlags() : loadOldFlags(ahisVar.getOldFlags());
        if (z) {
            agfi agfiVar = agfk.Companion;
            List<ahgx> annotationList = ahisVar.getAnnotationList();
            annotationList.getClass();
            ArrayList arrayList = new ArrayList(woy.bp(annotationList, 10));
            for (ahgx ahgxVar : annotationList) {
                ahyk ahykVar = this.annotationDeserializer;
                ahgxVar.getClass();
                arrayList.add(ahykVar.deserializeAnnotation(ahgxVar, this.c.getNameResolver()));
            }
            annotations = agfiVar.create(arrayList);
        } else {
            annotations = null;
        }
        agbi containingDeclaration = this.c.getContainingDeclaration();
        if (annotations == null) {
            annotations = getAnnotations(ahisVar, flags, ahyh.PROPERTY);
        }
        agfk agfkVar = annotations;
        agcq agcqVarModality = aiae.INSTANCE.modality(ahla.MODALITY.get(flags));
        agcc agccVarDescriptorVisibility = aiaf.descriptorVisibility(aiae.INSTANCE, ahla.VISIBILITY.get(flags));
        boolean zBooleanValue = ahla.IS_VAR.get(flags).booleanValue();
        ahnj name = ahzz.getName(this.c.getNameResolver(), ahisVar.getName());
        agaw agawVarMemberKind = aiaf.memberKind(aiae.INSTANCE, ahla.MEMBER_KIND.get(flags));
        boolean zBooleanValue2 = ahla.IS_LATEINIT.get(flags).booleanValue();
        boolean zBooleanValue3 = ahla.IS_CONST.get(flags).booleanValue();
        boolean zBooleanValue4 = ahla.IS_EXTERNAL_PROPERTY.get(flags).booleanValue();
        boolean zBooleanValue5 = ahla.IS_DELEGATED.get(flags).booleanValue();
        boolean zBooleanValue6 = ahla.IS_EXPECT_PROPERTY.get(flags).booleanValue();
        int i = flags;
        ahyy ahyyVar = this.c;
        aicu aicuVar = new aicu(containingDeclaration, null, agfkVar, agcqVarModality, agccVarDescriptorVisibility, zBooleanValue, name, agawVarMemberKind, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, zBooleanValue6, ahisVar, ahyyVar.getNameResolver(), ahyyVar.getTypeTable(), ahyyVar.getVersionRequirementTable(), ahyyVar.getContainerSource());
        ahyy ahyyVar2 = this.c;
        List<ahjv> typeParameterList = ahisVar.getTypeParameterList();
        typeParameterList.getClass();
        ahyy ahyyVarChildContext$default = ahyy.childContext$default(ahyyVar2, aicuVar, typeParameterList, null, null, null, null, 60, null);
        boolean zBooleanValue7 = ahla.HAS_GETTER.get(i).booleanValue();
        agfk receiverParameterAnnotations = (zBooleanValue7 && ahlg.hasReceiver(ahisVar)) ? getReceiverParameterAnnotations(ahisVar, ahyh.PROPERTY_GETTER) : agfk.Companion.getEMPTY();
        aigl aiglVarType2 = ahyyVarChildContext$default.getTypeDeserializer().type(ahlg.returnType(ahisVar, this.c.getTypeTable()));
        List<agee> ownTypeParameters = ahyyVarChildContext$default.getTypeDeserializer().getOwnTypeParameters();
        agdq dispatchReceiverParameter = getDispatchReceiverParameter();
        ahjn ahjnVarReceiverType = ahlg.receiverType(ahisVar, this.c.getTypeTable());
        agdq agdqVarCreateExtensionReceiverParameterForCallable = (ahjnVarReceiverType == null || (aiglVarType = ahyyVarChildContext$default.getTypeDeserializer().type(ahjnVarReceiverType)) == null) ? null : ahss.createExtensionReceiverParameterForCallable(aicuVar, aiglVarType, receiverParameterAnnotations);
        ahzy memberDeserializer = ahyyVarChildContext$default.getMemberDeserializer();
        List<ahjn> listContextReceiverTypes = ahlg.contextReceiverTypes(ahisVar, this.c.getTypeTable());
        List<ahkb> contextParameterList = ahisVar.getContextParameterList();
        contextParameterList.getClass();
        aicuVar.setType(aiglVarType2, ownTypeParameters, dispatchReceiverParameter, agdqVarCreateExtensionReceiverParameterForCallable, memberDeserializer.contextReceivers(listContextReceiverTypes, contextParameterList, ahisVar, ahyh.PROPERTY_GETTER));
        int accessorFlags = ahla.getAccessorFlags(ahla.HAS_ANNOTATIONS.get(i).booleanValue(), ahla.VISIBILITY.get(i), ahla.MODALITY.get(i), false, false, false);
        if (zBooleanValue7) {
            int getterFlags = ahisVar.hasGetterFlags() ? ahisVar.getGetterFlags() : accessorFlags;
            boolean zBooleanValue8 = ahla.IS_NOT_DEFAULT.get(getterFlags).booleanValue();
            boolean zBooleanValue9 = ahla.IS_EXTERNAL_ACCESSOR.get(getterFlags).booleanValue();
            boolean zBooleanValue10 = ahla.IS_INLINE_ACCESSOR.get(getterFlags).booleanValue();
            agfk annotations2 = getAnnotations(ahisVar, getterFlags, ahyh.PROPERTY_GETTER);
            agil agilVar2 = zBooleanValue8 ? new agil(aicuVar, annotations2, aiae.INSTANCE.modality(ahla.MODALITY.get(getterFlags)), aiaf.descriptorVisibility(aiae.INSTANCE, ahla.VISIBILITY.get(getterFlags)), false, zBooleanValue9, zBooleanValue10, aicuVar.getKind(), null, agdx.NO_SOURCE) : ahss.createDefaultGetter(aicuVar, annotations2);
            agilVar2.initialize(aicuVar.getReturnType());
            agilVar = agilVar2;
        } else {
            agilVar = null;
        }
        if (ahla.HAS_SETTER.get(i).booleanValue()) {
            if (ahisVar.hasSetterFlags()) {
                accessorFlags = ahisVar.getSetterFlags();
            }
            boolean zBooleanValue11 = ahla.IS_NOT_DEFAULT.get(accessorFlags).booleanValue();
            boolean zBooleanValue12 = ahla.IS_EXTERNAL_ACCESSOR.get(accessorFlags).booleanValue();
            boolean zBooleanValue13 = ahla.IS_INLINE_ACCESSOR.get(accessorFlags).booleanValue();
            agfk annotations3 = getAnnotations(ahisVar, accessorFlags, ahyh.PROPERTY_SETTER);
            if (zBooleanValue11) {
                agimVarCreateDefaultSetter = new agim(aicuVar, annotations3, aiae.INSTANCE.modality(ahla.MODALITY.get(accessorFlags)), aiaf.descriptorVisibility(aiae.INSTANCE, ahla.VISIBILITY.get(accessorFlags)), false, zBooleanValue12, zBooleanValue13, aicuVar.getKind(), null, agdx.NO_SOURCE);
                agimVarCreateDefaultSetter.initialize((agel) woy.bN(ahyy.childContext$default(ahyyVarChildContext$default, agimVarCreateDefaultSetter, afbe.a, null, null, null, null, 60, null).getMemberDeserializer().valueParameters(woy.bg(ahisVar.getSetterValueParameter()), ahisVar, ahyh.PROPERTY_SETTER)));
            } else {
                agimVarCreateDefaultSetter = ahss.createDefaultSetter(aicuVar, annotations3, agfk.Companion.getEMPTY());
            }
        } else {
            agimVarCreateDefaultSetter = null;
        }
        if (ahla.HAS_CONSTANT.get(i).booleanValue()) {
            aicuVar.setCompileTimeInitializerFactory(new ahzp(this, ahisVar, aicuVar));
        }
        agbi containingDeclaration2 = this.c.getContainingDeclaration();
        agba agbaVar = containingDeclaration2 instanceof agba ? (agba) containingDeclaration2 : null;
        if ((agbaVar != null ? agbaVar.getKind() : null) == agbb.ANNOTATION_CLASS) {
            aicuVar.setCompileTimeInitializerFactory(new ahzq(this, ahisVar, aicuVar));
        }
        aicuVar.initialize(agilVar, agimVarCreateDefaultSetter, new aghi(getPropertyFieldAnnotations(ahisVar, false), aicuVar), new aghi(getPropertyFieldAnnotations(ahisVar, true), aicuVar));
        return aicuVar;
    }

    public final aged loadTypeAlias(ahjq ahjqVar) {
        ahjqVar.getClass();
        agfi agfiVar = agfk.Companion;
        List<ahgx> annotationList = ahjqVar.getAnnotationList();
        annotationList.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(annotationList, 10));
        for (ahgx ahgxVar : annotationList) {
            ahyk ahykVar = this.annotationDeserializer;
            ahgxVar.getClass();
            arrayList.add(ahykVar.deserializeAnnotation(ahgxVar, this.c.getNameResolver()));
        }
        agfk agfkVarCreate = agfiVar.create(arrayList);
        agcc agccVarDescriptorVisibility = aiaf.descriptorVisibility(aiae.INSTANCE, ahla.VISIBILITY.get(ahjqVar.getFlags()));
        ahyy ahyyVar = this.c;
        aiei storageManager = ahyyVar.getStorageManager();
        agbi containingDeclaration = ahyyVar.getContainingDeclaration();
        ahnj name = ahzz.getName(ahyyVar.getNameResolver(), ahjqVar.getName());
        ahyy ahyyVar2 = this.c;
        aicw aicwVar = new aicw(storageManager, containingDeclaration, agfkVarCreate, name, agccVarDescriptorVisibility, ahjqVar, ahyyVar2.getNameResolver(), ahyyVar2.getTypeTable(), ahyyVar2.getVersionRequirementTable(), ahyyVar2.getContainerSource());
        ahyy ahyyVar3 = this.c;
        List<ahjv> typeParameterList = ahjqVar.getTypeParameterList();
        typeParameterList.getClass();
        ahyy ahyyVarChildContext$default = ahyy.childContext$default(ahyyVar3, aicwVar, typeParameterList, null, null, null, null, 60, null);
        aicwVar.initialize(ahyyVarChildContext$default.getTypeDeserializer().getOwnTypeParameters(), ahyyVarChildContext$default.getTypeDeserializer().simpleType(ahlg.underlyingType(ahjqVar, this.c.getTypeTable()), false), ahyyVarChildContext$default.getTypeDeserializer().simpleType(ahlg.expandedType(ahjqVar, this.c.getTypeTable()), false));
        return aicwVar;
    }
}
