package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public final class agao implements agfx, aggb {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(agao.class, "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0), new affn(agao.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0), new affn(agao.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0)};
    private final aiec cloneableType$delegate;
    private final aiea<aezu<String, String>, agfk> deprecationForSomeOfTheListMethods;
    private final afzr j2kClassMapper;
    private final aidd<ahnf, agba> javaAnalogueClassesWithCustomSupertypeCache;
    private final aigl mockSerializableType;
    private final agcu moduleDescriptor;
    private final aiec notConsideredDeprecation$delegate;
    private final aiec settings$delegate;

    public agao(agcu agcuVar, aiei aieiVar, afdr<agaa> afdrVar) {
        agcuVar.getClass();
        aieiVar.getClass();
        afdrVar.getClass();
        this.moduleDescriptor = agcuVar;
        this.j2kClassMapper = afzr.INSTANCE;
        this.settings$delegate = aieiVar.createLazyValue(afdrVar);
        this.mockSerializableType = createMockJavaIoSerializableType(aieiVar);
        this.cloneableType$delegate = aieiVar.createLazyValue(new agac(this, aieiVar));
        this.javaAnalogueClassesWithCustomSupertypeCache = aieiVar.createCacheWithNotNullValues();
        this.notConsideredDeprecation$delegate = aieiVar.createLazyValue(new agad(this));
        this.deprecationForSomeOfTheListMethods = aieiVar.createMemoizedFunction(new agae(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aigw cloneableType_delegate$lambda$0(agao agaoVar, aiei aieiVar) {
        return agch.findNonGenericClassAcrossDependencies(agaoVar.getSettings().getOwnerModuleDescriptor(), afzv.Companion.getCLONEABLE_CLASS_ID(), new agdb(aieiVar, agaoVar.getSettings().getOwnerModuleDescriptor())).getDefaultType();
    }

    private final agdv createCloneForArray(aibt aibtVar, agdv agdvVar) {
        agci<? extends agdv> agciVarNewCopyBuilder = agdvVar.newCopyBuilder();
        agciVarNewCopyBuilder.setOwner(aibtVar);
        agciVarNewCopyBuilder.setVisibility(agcb.PUBLIC);
        agciVarNewCopyBuilder.setReturnType(aibtVar.getDefaultType());
        agciVarNewCopyBuilder.setDispatchReceiverParameter(aibtVar.getThisAsReceiverParameter());
        agcj agcjVarBuild = agciVarNewCopyBuilder.build();
        agcjVarBuild.getClass();
        return (agdv) agcjVarBuild;
    }

    private final aigl createMockJavaIoSerializableType(aiei aieiVar) {
        aggw aggwVar = new aggw(new agam(this.moduleDescriptor, new ahnf("java.io")), ahnj.identifier("Serializable"), agcq.ABSTRACT, agbb.INTERFACE, woy.bg(new aigt(aieiVar, new agaf(this))), agdx.NO_SOURCE, false, aieiVar);
        aggwVar.initialize(ahxd.INSTANCE, afbg.a, null);
        aigw defaultType = aggwVar.getDefaultType();
        defaultType.getClass();
        return defaultType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aigl createMockJavaIoSerializableType$lambda$0(agao agaoVar) {
        aigw anyType = agaoVar.moduleDescriptor.getBuiltIns().getAnyType();
        anyType.getClass();
        return anyType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agfk deprecationForSomeOfTheListMethods$lambda$0(agao agaoVar, aezu aezuVar) {
        aezuVar.getClass();
        Object obj = aezuVar.b;
        String str = (String) aezuVar.a;
        String str2 = (String) obj;
        return agfk.Companion.create(woy.bg(agfg.createDeprecatedAnnotation(agaoVar.moduleDescriptor.getBuiltIns(), "'" + str + "()' member of List is redundant in Kotlin and might be removed soon. Please use '" + str2 + "()' stdlib extension instead", String.valueOf(str2).concat("()"), "HIDDEN", false)));
    }

    private final Collection<agdv> getAdditionalFunctions(agba agbaVar, afec<? super ahxe, ? extends Collection<? extends agdv>> afecVar) {
        agws javaAnalogue = getJavaAnalogue(agbaVar);
        if (javaAnalogue != null) {
            Collection<agba> collectionMapPlatformClass = this.j2kClassMapper.mapPlatformClass(ahvz.getFqNameSafe(javaAnalogue), afzo.Companion.getInstance());
            Object next = null;
            if (collectionMapPlatformClass instanceof List) {
                List list = (List) collectionMapPlatformClass;
                if (!list.isEmpty()) {
                    next = list.get(list.size() - 1);
                }
            } else {
                Iterator<T> it = collectionMapPlatformClass.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                }
            }
            agba agbaVar2 = (agba) next;
            if (agbaVar2 != null) {
                aipt aiptVar = aipv.Companion;
                ArrayList arrayList = new ArrayList(woy.bp(collectionMapPlatformClass, 10));
                Iterator<T> it2 = collectionMapPlatformClass.iterator();
                while (it2.hasNext()) {
                    arrayList.add(ahvz.getFqNameSafe((agba) it2.next()));
                }
                aipv aipvVarCreate = aiptVar.create(arrayList);
                boolean zIsMutable = this.j2kClassMapper.isMutable(agbaVar);
                ahxe unsubstitutedMemberScope = this.javaAnalogueClassesWithCustomSupertypeCache.computeIfAbsent(ahvz.getFqNameSafe(javaAnalogue), new agah(javaAnalogue, agbaVar2)).getUnsubstitutedMemberScope();
                unsubstitutedMemberScope.getClass();
                Collection<? extends agdv> collectionInvoke = afecVar.invoke(unsubstitutedMemberScope);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionInvoke) {
                    agdv agdvVar = (agdv) obj;
                    if (agdvVar.getKind() == agaw.DECLARATION && agdvVar.getVisibility().isPublicAPI() && !afye.isDeprecated(agdvVar)) {
                        Collection<? extends agcj> overriddenDescriptors = agdvVar.getOverriddenDescriptors();
                        overriddenDescriptors.getClass();
                        if (!overriddenDescriptors.isEmpty()) {
                            Iterator<T> it3 = overriddenDescriptors.iterator();
                            while (it3.hasNext()) {
                                agbi containingDeclaration = ((agcj) it3.next()).getContainingDeclaration();
                                containingDeclaration.getClass();
                                if (aipvVarCreate.contains(ahvz.getFqNameSafe(containingDeclaration))) {
                                    break;
                                }
                            }
                        }
                        if (!isMutabilityViolation(agdvVar, zIsMutable)) {
                            arrayList2.add(obj);
                        }
                    }
                }
                return arrayList2;
            }
        }
        return afbe.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agba getAdditionalFunctions$lambda$1(agws agwsVar, agba agbaVar) {
        agup agupVar = agup.EMPTY;
        agupVar.getClass();
        return agwsVar.copy$org_jetbrains_kotlin_descriptors_jvm(agupVar, agbaVar);
    }

    private final aigw getCloneableType() {
        return (aigw) aieh.getValue(this.cloneableType$delegate, this, $$delegatedProperties[1]);
    }

    private static final boolean getConstructors$isEffectivelyTheSameAs(agbh agbhVar, aiiy aiiyVar, agbh agbhVar2) {
        return ahtj.getBothWaysOverridability(agbhVar, agbhVar2.substitute(aiiyVar)) == ahth.OVERRIDABLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection getFunctions$lambda$1(ahnj ahnjVar, ahxe ahxeVar) {
        ahxeVar.getClass();
        return ahxeVar.getContributedFunctions(ahnjVar, aglr.FROM_BUILTINS);
    }

    private final agws getJavaAnalogue(agba agbaVar) {
        ahnd ahndVarMapKotlinToJava;
        ahnf ahnfVarAsSingleFqName;
        if (afye.isAny(agbaVar) || !afye.isUnderKotlinPackage(agbaVar)) {
            return null;
        }
        ahnh fqNameUnsafe = ahvz.getFqNameUnsafe(agbaVar);
        if (!fqNameUnsafe.isSafe() || (ahndVarMapKotlinToJava = afzq.INSTANCE.mapKotlinToJava(fqNameUnsafe)) == null || (ahnfVarAsSingleFqName = ahndVarMapKotlinToJava.asSingleFqName()) == null) {
            return null;
        }
        agba agbaVarResolveClassByFqName = agbo.resolveClassByFqName(getSettings().getOwnerModuleDescriptor(), ahnfVarAsSingleFqName, aglr.FROM_BUILTINS);
        if (agbaVarResolveClassByFqName instanceof agws) {
            return (agws) agbaVarResolveClassByFqName;
        }
        return null;
    }

    private final agal getJdkMethodStatus(agcj agcjVar) {
        agbi containingDeclaration = agcjVar.getContainingDeclaration();
        containingDeclaration.getClass();
        Object objDfs = aipd.dfs(woy.bg((agba) containingDeclaration), new agak(this), new agan(ahfp.computeJvmDescriptor$default(agcjVar, false, false, 3, null), new affv()));
        objDfs.getClass();
        return (agal) objDfs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable getJdkMethodStatus$lambda$0(agao agaoVar, agba agbaVar) {
        Collection<aigl> collectionMo89getSupertypes = agbaVar.getTypeConstructor().mo89getSupertypes();
        collectionMo89getSupertypes.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionMo89getSupertypes.iterator();
        while (it.hasNext()) {
            agbd declarationDescriptor = ((aigl) it.next()).getConstructor().getDeclarationDescriptor();
            agws javaAnalogue = null;
            agbd original = declarationDescriptor != null ? declarationDescriptor.getOriginal() : null;
            agba agbaVar2 = original instanceof agba ? (agba) original : null;
            if (agbaVar2 != null && (javaAnalogue = agaoVar.getJavaAnalogue(agbaVar2)) == null) {
                javaAnalogue = agbaVar2;
            }
            if (javaAnalogue != null) {
                arrayList.add(javaAnalogue);
            }
        }
        return arrayList;
    }

    private final agfk getNotConsideredDeprecation() {
        return (agfk) aieh.getValue(this.notConsideredDeprecation$delegate, this, $$delegatedProperties[2]);
    }

    private final agaa getSettings() {
        return (agaa) aieh.getValue(this.settings$delegate, this, $$delegatedProperties[0]);
    }

    private final boolean isMutabilityViolation(agdv agdvVar, boolean z) {
        agbi containingDeclaration = agdvVar.getContainingDeclaration();
        containingDeclaration.getClass();
        String strComputeJvmDescriptor$default = ahfp.computeJvmDescriptor$default(agdvVar, false, false, 3, null);
        if (z ^ agas.INSTANCE.getMUTABLE_METHOD_SIGNATURES().contains(ahfo.signature(ahft.INSTANCE, (agba) containingDeclaration, strComputeJvmDescriptor$default))) {
            return true;
        }
        Boolean boolIfAny = aipd.ifAny(woy.bg(agdvVar), agai.INSTANCE, new agaj(this));
        boolIfAny.getClass();
        return boolIfAny.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable isMutabilityViolation$lambda$0(agax agaxVar) {
        return agaxVar.getOriginal().getOverriddenDescriptors();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean isMutabilityViolation$lambda$1(agao agaoVar, agax agaxVar) {
        boolean z = false;
        if (agaxVar.getKind() == agaw.DECLARATION) {
            afzr afzrVar = agaoVar.j2kClassMapper;
            agbi containingDeclaration = agaxVar.getContainingDeclaration();
            containingDeclaration.getClass();
            if (afzrVar.isMutable((agba) containingDeclaration)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    private final boolean isTrivialCopyConstructorFor(agbh agbhVar, agba agbaVar) {
        if (agbhVar.getValueParameters().size() != 1) {
            return false;
        }
        List<agel> valueParameters = agbhVar.getValueParameters();
        valueParameters.getClass();
        agbd declarationDescriptor = ((agel) woy.bN(valueParameters)).getType().getConstructor().getDeclarationDescriptor();
        return affa.f(declarationDescriptor != null ? ahvz.getFqNameUnsafe(declarationDescriptor) : null, ahvz.getFqNameUnsafe(agbaVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agfk notConsideredDeprecation_delegate$lambda$0(agao agaoVar) {
        return agfk.Companion.create(woy.bg(agfg.createDeprecatedAnnotation$default(agaoVar.moduleDescriptor.getBuiltIns(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, true, 6, null)));
    }

    @Override // defpackage.agfx
    public Collection<agaz> getConstructors(agba agbaVar) {
        agws javaAnalogue;
        agba agbaVarMapJavaToKotlin$default;
        agbaVar.getClass();
        if (agbaVar.getKind() != agbb.CLASS || !getSettings().isAdditionalBuiltInsFeatureSupported() || (javaAnalogue = getJavaAnalogue(agbaVar)) == null || (agbaVarMapJavaToKotlin$default = afzr.mapJavaToKotlin$default(this.j2kClassMapper, ahvz.getFqNameSafe(javaAnalogue), afzo.Companion.getInstance(), null, 4, null)) == null) {
            return afbe.a;
        }
        aiiy aiiyVarBuildSubstitutor = agat.createMappedTypeParametersSubstitution(agbaVarMapJavaToKotlin$default, javaAnalogue).buildSubstitutor();
        List<agaz> constructors = javaAnalogue.getConstructors();
        ArrayList<agaz> arrayList = new ArrayList();
        for (Object obj : constructors) {
            agaz agazVar = (agaz) obj;
            if (agazVar.getVisibility().isPublicAPI()) {
                Collection<agaz> constructors2 = agbaVarMapJavaToKotlin$default.getConstructors();
                constructors2.getClass();
                if (!constructors2.isEmpty()) {
                    for (agaz agazVar2 : constructors2) {
                        agazVar2.getClass();
                        if (getConstructors$isEffectivelyTheSameAs(agazVar2, aiiyVarBuildSubstitutor, agazVar)) {
                            break;
                        }
                    }
                }
                if (!isTrivialCopyConstructorFor(agazVar, agbaVar) && !afye.isDeprecated(agazVar) && !agas.INSTANCE.getHIDDEN_CONSTRUCTOR_SIGNATURES().contains(ahfo.signature(ahft.INSTANCE, javaAnalogue, ahfp.computeJvmDescriptor$default(agazVar, false, false, 3, null)))) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(woy.bp(arrayList, 10));
        for (agaz agazVar3 : arrayList) {
            agci<? extends agcj> agciVarNewCopyBuilder = agazVar3.newCopyBuilder();
            agciVarNewCopyBuilder.setOwner(agbaVar);
            agciVarNewCopyBuilder.setReturnType(agbaVar.getDefaultType());
            agciVarNewCopyBuilder.setPreserveSourceElement();
            agciVarNewCopyBuilder.setSubstitution(aiiyVarBuildSubstitutor.getSubstitution());
            if (!agas.INSTANCE.getVISIBLE_CONSTRUCTOR_SIGNATURES().contains(ahfo.signature(ahft.INSTANCE, javaAnalogue, ahfp.computeJvmDescriptor$default(agazVar3, false, false, 3, null)))) {
                agciVarNewCopyBuilder.setAdditionalAnnotations(getNotConsideredDeprecation());
            }
            agcj agcjVarBuild = agciVarNewCopyBuilder.build();
            agcjVarBuild.getClass();
            arrayList2.add((agaz) agcjVarBuild);
        }
        return arrayList2;
    }

    @Override // defpackage.agfx
    public Collection<agdv> getFunctions(ahnj ahnjVar, agba agbaVar) {
        agfk agfkVarInvoke;
        ahnjVar.getClass();
        agbaVar.getClass();
        if (affa.f(ahnjVar, afzm.Companion.getCLONE_NAME()) && (agbaVar instanceof aibt) && afye.isArrayOrPrimitiveArray(agbaVar)) {
            aibt aibtVar = (aibt) agbaVar;
            List<ahif> functionList = aibtVar.getClassProto().getFunctionList();
            functionList.getClass();
            if (!functionList.isEmpty()) {
                Iterator<T> it = functionList.iterator();
                while (it.hasNext()) {
                    if (affa.f(ahzz.getName(aibtVar.getC().getNameResolver(), ((ahif) it.next()).getName()), afzm.Companion.getCLONE_NAME())) {
                    }
                }
            }
            return woy.bg(createCloneForArray(aibtVar, (agdv) woy.bM(getCloneableType().getMemberScope().getContributedFunctions(ahnjVar, aglr.FROM_BUILTINS))));
        }
        if (getSettings().isAdditionalBuiltInsFeatureSupported()) {
            Collection<agdv> additionalFunctions = getAdditionalFunctions(agbaVar, new agag(ahnjVar));
            ArrayList arrayList = new ArrayList();
            for (agdv agdvVar : additionalFunctions) {
                agbi containingDeclaration = agdvVar.getContainingDeclaration();
                containingDeclaration.getClass();
                agcj agcjVarSubstitute = agdvVar.substitute(agat.createMappedTypeParametersSubstitution((agba) containingDeclaration, agbaVar).buildSubstitutor());
                agcjVarSubstitute.getClass();
                agci<? extends agdv> agciVarNewCopyBuilder = ((agdv) agcjVarSubstitute).newCopyBuilder();
                agciVarNewCopyBuilder.setOwner(agbaVar);
                agciVarNewCopyBuilder.setDispatchReceiverParameter(agbaVar.getThisAsReceiverParameter());
                agciVarNewCopyBuilder.setPreserveSourceElement();
                int iOrdinal = getJdkMethodStatus(agdvVar).ordinal();
                agdv agdvVar2 = null;
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        agcj agcjVarBuild = agciVarNewCopyBuilder.build();
                        agcjVarBuild.getClass();
                        agdvVar2 = (agdv) agcjVarBuild;
                    } else {
                        if (iOrdinal == 2) {
                            ahnj name = agdvVar.getName();
                            if (affa.f(name, agap.GET_FIRST_LIST_NAME)) {
                                agfkVarInvoke = this.deprecationForSomeOfTheListMethods.invoke(new aezu(agdvVar.getName().asString(), "first"));
                            } else {
                                if (!affa.f(name, agap.GET_LAST_LIST_NAME)) {
                                    ahnj name2 = agdvVar.getName();
                                    Objects.toString(name2);
                                    throw new IllegalStateException("Unexpected name: ".concat(String.valueOf(name2)));
                                }
                                agfkVarInvoke = this.deprecationForSomeOfTheListMethods.invoke(new aezu(agdvVar.getName().asString(), "last"));
                            }
                            agciVarNewCopyBuilder.setAdditionalAnnotations(agfkVarInvoke);
                        } else if (iOrdinal == 3) {
                            agciVarNewCopyBuilder.setAdditionalAnnotations(getNotConsideredDeprecation());
                        } else if (iOrdinal != 4) {
                            throw new aezs();
                        }
                        agcj agcjVarBuild2 = agciVarNewCopyBuilder.build();
                        agcjVarBuild2.getClass();
                        agdvVar2 = (agdv) agcjVarBuild2;
                    }
                } else if (!agcr.isFinalClass(agbaVar)) {
                    agciVarNewCopyBuilder.setHiddenForResolutionEverywhereBesideSupercalls();
                    agcj agcjVarBuild22 = agciVarNewCopyBuilder.build();
                    agcjVarBuild22.getClass();
                    agdvVar2 = (agdv) agcjVarBuild22;
                }
                if (agdvVar2 != null) {
                    arrayList.add(agdvVar2);
                }
            }
            return arrayList;
        }
        return afbe.a;
    }

    @Override // defpackage.agfx
    public Set<ahnj> getFunctionsNames(agba agbaVar) {
        agws javaAnalogue;
        Set<ahnj> functionNames;
        agbaVar.getClass();
        return (!getSettings().isAdditionalBuiltInsFeatureSupported() || (javaAnalogue = getJavaAnalogue(agbaVar)) == null || (functionNames = javaAnalogue.getUnsubstitutedMemberScope().getFunctionNames()) == null) ? afbg.a : functionNames;
    }

    @Override // defpackage.agfx
    public Collection<aigl> getSupertypes(agba agbaVar) {
        agbaVar.getClass();
        ahnh fqNameUnsafe = ahvz.getFqNameUnsafe(agbaVar);
        return agas.INSTANCE.isArrayOrPrimitiveArray(fqNameUnsafe) ? woy.bi(getCloneableType(), this.mockSerializableType) : agas.INSTANCE.isSerializableInJava(fqNameUnsafe) ? woy.bg(this.mockSerializableType) : afbe.a;
    }

    @Override // defpackage.aggb
    public boolean isFunctionAvailable(agba agbaVar, agdv agdvVar) {
        agbaVar.getClass();
        agdvVar.getClass();
        agws javaAnalogue = getJavaAnalogue(agbaVar);
        if (javaAnalogue == null || !agdvVar.getAnnotations().hasAnnotation(aggc.getPLATFORM_DEPENDENT_ANNOTATION_FQ_NAME())) {
            return true;
        }
        if (!getSettings().isAdditionalBuiltInsFeatureSupported()) {
            return false;
        }
        String strComputeJvmDescriptor$default = ahfp.computeJvmDescriptor$default(agdvVar, false, false, 3, null);
        agxf unsubstitutedMemberScope = javaAnalogue.getUnsubstitutedMemberScope();
        ahnj name = agdvVar.getName();
        name.getClass();
        Collection<? extends agdv> contributedFunctions = unsubstitutedMemberScope.getContributedFunctions(name, aglr.FROM_BUILTINS);
        if ((contributedFunctions instanceof Collection) && contributedFunctions.isEmpty()) {
            return false;
        }
        Iterator<T> it = contributedFunctions.iterator();
        while (it.hasNext()) {
            if (affa.f(ahfp.computeJvmDescriptor$default((agdv) it.next(), false, false, 3, null), strComputeJvmDescriptor$default)) {
                return true;
            }
        }
        return false;
    }
}
