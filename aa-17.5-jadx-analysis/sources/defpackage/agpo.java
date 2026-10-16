package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class agpo {
    public static final int getDefaultPropertyAccessorFlags(int i) {
        return ahla.getAccessorFlags(ahla.HAS_ANNOTATIONS.get(i).booleanValue(), ahla.VISIBILITY.get(i), ahla.MODALITY.get(i), false, false, false);
    }

    public static final int getPropertyGetterFlags(ahis ahisVar) {
        ahisVar.getClass();
        return ahisVar.hasGetterFlags() ? ahisVar.getGetterFlags() : getDefaultPropertyAccessorFlags(ahisVar.getFlags());
    }

    public static final int getPropertySetterFlags(ahis ahisVar) {
        ahisVar.getClass();
        return ahisVar.hasSetterFlags() ? ahisVar.getSetterFlags() : getDefaultPropertyAccessorFlags(ahisVar.getFlags());
    }

    private static final int getTypeFlags(ahjn ahjnVar) {
        boolean nullable = ahjnVar.getNullable();
        int flags = ahjnVar.getFlags();
        return (nullable ? 1 : 0) + flags + flags;
    }

    private static final int getTypeParameterFlags(ahjv ahjvVar) {
        return ahjvVar.getReified() ? 1 : 0;
    }

    private static final agoq legacyCtxReceiverToParameter(agol agolVar) {
        agoq agoqVar = new agoq(0, "_");
        agoqVar.setType(agolVar);
        return agoqVar;
    }

    private static final ahjn loadInlineClassUnderlyingType(ahhc ahhcVar, agpm agpmVar) {
        ahjn ahjnVarInlineClassUnderlyingType = ahlg.inlineClassUnderlyingType(ahhcVar, agpmVar.getTypes());
        if (ahjnVarInlineClassUnderlyingType != null) {
            return ahjnVarInlineClassUnderlyingType;
        }
        if (ahhcVar.hasInlineClassUnderlyingPropertyName()) {
            List<ahis> propertyList = ahhcVar.getPropertyList();
            propertyList.getClass();
            Iterator<T> it = propertyList.iterator();
            boolean z = false;
            Object obj = null;
            while (true) {
                if (!it.hasNext()) {
                    if (!z) {
                        break;
                    }
                } else {
                    Object next = it.next();
                    ahis ahisVar = (ahis) next;
                    ahisVar.getClass();
                    if (ahlg.receiverType(ahisVar, agpmVar.getTypes()) == null && affa.f(agpmVar.get(ahisVar.getName()), agpmVar.get(ahhcVar.getInlineClassUnderlyingPropertyName()))) {
                        if (z) {
                            break;
                        }
                        z = true;
                        obj = next;
                    }
                }
            }
            obj = null;
            ahis ahisVar2 = (ahis) obj;
            if (ahisVar2 != null) {
                return ahlg.returnType(ahisVar2, agpmVar.getTypes());
            }
        }
        return null;
    }

    private static final agot readVersionRequirement(int i, agpm agpmVar) {
        agov agovVar;
        agou agouVar;
        ahlk version;
        agot agotVar = new agot();
        ahll ahllVarCreate = ahll.Companion.create(i, agpmVar.getStrings(), agpmVar.getVersionRequirements$org_jetbrains_kotlin_kotlin_metadata());
        if (ahllVarCreate == null && !agpmVar.getIgnoreUnknownVersionRequirements$org_jetbrains_kotlin_kotlin_metadata()) {
            throw new agmq("No VersionRequirement with the given id in the table", null, 2, null);
        }
        ahkh kind = ahllVarCreate != null ? ahllVarCreate.getKind() : null;
        if (kind == null) {
            agovVar = agov.UNKNOWN;
        } else {
            ahju ahjuVar = ahju.IN;
            ahjk ahjkVar = ahjk.IN;
            ahhr ahhrVar = ahhr.RETURNS_CONSTANT;
            ahht ahhtVar = ahht.AT_MOST_ONCE;
            ahib ahibVar = ahib.TRUE;
            int iOrdinal = kind.ordinal();
            if (iOrdinal == 0) {
                agovVar = agov.LANGUAGE_VERSION;
            } else if (iOrdinal == 1) {
                agovVar = agov.COMPILER_VERSION;
            } else {
                if (iOrdinal != 2) {
                    throw new aezs();
                }
                agovVar = agov.API_VERSION;
            }
        }
        aezm level = ahllVarCreate != null ? ahllVarCreate.getLevel() : null;
        if (level == null) {
            agouVar = agou.HIDDEN;
        } else {
            ahju ahjuVar2 = ahju.IN;
            ahjk ahjkVar2 = ahjk.IN;
            ahkh ahkhVar = ahkh.LANGUAGE_VERSION;
            ahhr ahhrVar2 = ahhr.RETURNS_CONSTANT;
            ahht ahhtVar2 = ahht.AT_MOST_ONCE;
            ahib ahibVar2 = ahib.TRUE;
            int iOrdinal2 = level.ordinal();
            if (iOrdinal2 == 0) {
                agouVar = agou.WARNING;
            } else if (iOrdinal2 != 1) {
                if (iOrdinal2 != 2) {
                    throw new aezs();
                }
                agouVar = agou.HIDDEN;
            } else {
                agouVar = agou.ERROR;
            }
        }
        agotVar.setKind(agovVar);
        agotVar.setLevel(agouVar);
        agotVar.setErrorCode(ahllVarCreate != null ? ahllVarCreate.getErrorCode() : null);
        agotVar.setMessage(ahllVarCreate != null ? ahllVarCreate.getMessage() : null);
        if (ahllVarCreate == null || (version = ahllVarCreate.getVersion()) == null) {
            version = ahlk.INFINITY;
        }
        agotVar.setVersion(new agos(version.component1(), version.component2(), version.component3()));
        return agotVar;
    }

    public static final agnq toKmClass(ahhc ahhcVar, ahld ahldVar, boolean z, List<? extends Object> list) {
        ahhcVar.getClass();
        ahldVar.getClass();
        list.getClass();
        agnq agnqVar = new agnq();
        ahjy typeTable = ahhcVar.getTypeTable();
        typeTable.getClass();
        ahlh ahlhVar = new ahlh(typeTable);
        ahlm ahlmVar = ahln.Companion;
        ahkl versionRequirementTable = ahhcVar.getVersionRequirementTable();
        versionRequirementTable.getClass();
        agpm agpmVar = new agpm(ahldVar, ahlhVar, ahlmVar.create(versionRequirementTable), z, null, list, 16, null);
        List<ahjv> typeParameterList = ahhcVar.getTypeParameterList();
        typeParameterList.getClass();
        agpm agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata = agpmVar.withTypeParameters$org_jetbrains_kotlin_kotlin_metadata(typeParameterList);
        agnqVar.setFlags$org_jetbrains_kotlin_kotlin_metadata(ahhcVar.getFlags());
        agnqVar.setName(agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata.className$org_jetbrains_kotlin_kotlin_metadata(ahhcVar.getFqName()));
        List<ahjv> typeParameterList2 = ahhcVar.getTypeParameterList();
        typeParameterList2.getClass();
        List<agon> typeParameters = agnqVar.getTypeParameters();
        for (ahjv ahjvVar : typeParameterList2) {
            ahjvVar.getClass();
            typeParameters.add(toKmTypeParameter(ahjvVar, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata));
        }
        List<ahjn> listSupertypes = ahlg.supertypes(ahhcVar, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata.getTypes());
        List<agol> supertypes = agnqVar.getSupertypes();
        Iterator<T> it = listSupertypes.iterator();
        while (it.hasNext()) {
            supertypes.add(toKmType((ahjn) it.next(), agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata));
        }
        List<ahhi> constructorList = ahhcVar.getConstructorList();
        constructorList.getClass();
        List<agnw> constructors = agnqVar.getConstructors();
        for (ahhi ahhiVar : constructorList) {
            ahhiVar.getClass();
            constructors.add(toKmConstructor(ahhiVar, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata));
        }
        List<ahif> functionList = ahhcVar.getFunctionList();
        functionList.getClass();
        List<ahis> propertyList = ahhcVar.getPropertyList();
        propertyList.getClass();
        List<ahjq> typeAliasList = ahhcVar.getTypeAliasList();
        typeAliasList.getClass();
        visitDeclarations(agnqVar, functionList, propertyList, typeAliasList, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata);
        if (ahhcVar.hasCompanionObjectName()) {
            agnqVar.setCompanionObject(agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata.get(ahhcVar.getCompanionObjectName()));
        }
        List<Integer> nestedClassNameList = ahhcVar.getNestedClassNameList();
        nestedClassNameList.getClass();
        List<String> nestedClasses = agnqVar.getNestedClasses();
        for (Integer num : nestedClassNameList) {
            num.getClass();
            nestedClasses.add(agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata.get(num.intValue()));
        }
        Iterator<ahhx> it2 = ahhcVar.getEnumEntryList().iterator();
        while (true) {
            if (!it2.hasNext()) {
                List<Integer> sealedSubclassFqNameList = ahhcVar.getSealedSubclassFqNameList();
                sealedSubclassFqNameList.getClass();
                List<String> sealedSubclasses = agnqVar.getSealedSubclasses();
                for (Integer num2 : sealedSubclassFqNameList) {
                    num2.getClass();
                    sealedSubclasses.add(agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata.className$org_jetbrains_kotlin_kotlin_metadata(num2.intValue()));
                }
                if (ahhcVar.hasInlineClassUnderlyingPropertyName()) {
                    agnqVar.setInlineClassUnderlyingPropertyName(agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata.get(ahhcVar.getInlineClassUnderlyingPropertyName()));
                }
                ahjn ahjnVarLoadInlineClassUnderlyingType = loadInlineClassUnderlyingType(ahhcVar, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata);
                agnqVar.setInlineClassUnderlyingType(ahjnVarLoadInlineClassUnderlyingType != null ? toKmType(ahjnVarLoadInlineClassUnderlyingType, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata) : null);
                List<ahjn> listContextReceiverTypes = ahlg.contextReceiverTypes(ahhcVar, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata.getTypes());
                List<agol> contextReceiverTypes = agnqVar.getContextReceiverTypes();
                Iterator<T> it3 = listContextReceiverTypes.iterator();
                while (it3.hasNext()) {
                    contextReceiverTypes.add(toKmType((ahjn) it3.next(), agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata));
                }
                List<Integer> versionRequirementList = ahhcVar.getVersionRequirementList();
                versionRequirementList.getClass();
                List<agot> versionRequirements = agnqVar.getVersionRequirements();
                for (Integer num3 : versionRequirementList) {
                    num3.getClass();
                    versionRequirements.add(readVersionRequirement(num3.intValue(), agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata));
                }
                List<ahhf> compilerPluginDataList = ahhcVar.getCompilerPluginDataList();
                compilerPluginDataList.getClass();
                Map<String, byte[]> compilerPluginMetadata = agnqVar.getCompilerPluginMetadata();
                for (ahhf ahhfVar : compilerPluginDataList) {
                    compilerPluginMetadata.put(agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata.get(ahhfVar.getPluginId()), ahhfVar.getData().toByteArray());
                }
                Iterator<T> it4 = agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata.getExtensions$org_jetbrains_kotlin_kotlin_metadata().iterator();
                while (it4.hasNext()) {
                    ((agqf) it4.next()).readClassExtensions(agnqVar, ahhcVar, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata);
                }
                return agnqVar;
            }
            ahhx next = it2.next();
            if (!next.hasName()) {
                throw new agmq("No name for EnumEntry", null, 2, null);
            }
            agnqVar.getEnumEntries().add(agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata.get(next.getName()));
            List<agod> kmEnumEntries = agnqVar.getKmEnumEntries();
            next.getClass();
            kmEnumEntries.add(toKmEnumEntry(next, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata));
        }
    }

    public static /* synthetic */ agnq toKmClass$default(ahhc ahhcVar, ahld ahldVar, boolean z, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            list = afbe.a;
        }
        return toKmClass(ahhcVar, ahldVar, z & ((i & 2) == 0), list);
    }

    private static final agnw toKmConstructor(ahhi ahhiVar, agpm agpmVar) {
        agnw agnwVar = new agnw(ahhiVar.getFlags());
        List<ahkb> valueParameterList = ahhiVar.getValueParameterList();
        valueParameterList.getClass();
        List<agoq> valueParameters = agnwVar.getValueParameters();
        for (ahkb ahkbVar : valueParameterList) {
            ahkbVar.getClass();
            valueParameters.add(toKmValueParameter(ahkbVar, agpmVar));
        }
        List<Integer> versionRequirementList = ahhiVar.getVersionRequirementList();
        versionRequirementList.getClass();
        List<agot> versionRequirements = agnwVar.getVersionRequirements();
        for (Integer num : versionRequirementList) {
            num.getClass();
            versionRequirements.add(readVersionRequirement(num.intValue(), agpmVar));
        }
        List<ahhf> compilerPluginDataList = ahhiVar.getCompilerPluginDataList();
        compilerPluginDataList.getClass();
        Map<String, byte[]> compilerPluginMetadata = agnwVar.getCompilerPluginMetadata();
        for (ahhf ahhfVar : compilerPluginDataList) {
            compilerPluginMetadata.put(agpmVar.get(ahhfVar.getPluginId()), ahhfVar.getData().toByteArray());
        }
        Iterator<T> it = agpmVar.getExtensions$org_jetbrains_kotlin_kotlin_metadata().iterator();
        while (it.hasNext()) {
            ((agqf) it.next()).readConstructorExtensions(agnwVar, ahhiVar, agpmVar);
        }
        return agnwVar;
    }

    private static final agnx toKmContract(ahhl ahhlVar, agpm agpmVar) {
        agoc agocVar;
        agob agobVar;
        agnx agnxVar = new agnx();
        for (ahhu ahhuVar : ahhlVar.getEffectList()) {
            if (ahhuVar.hasEffectType()) {
                ahhr effectType = ahhuVar.getEffectType();
                if (effectType == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ahju ahjuVar = ahju.IN;
                ahjk ahjkVar = ahjk.IN;
                ahkh ahkhVar = ahkh.LANGUAGE_VERSION;
                ahht ahhtVar = ahht.AT_MOST_ONCE;
                ahib ahibVar = ahib.TRUE;
                int iOrdinal = effectType.ordinal();
                if (iOrdinal == 0) {
                    agocVar = agoc.RETURNS_CONSTANT;
                } else if (iOrdinal == 1) {
                    agocVar = agoc.CALLS;
                } else if (iOrdinal == 2) {
                    agocVar = agoc.RETURNS_NOT_NULL;
                } else {
                    if (iOrdinal != 3) {
                        throw new aezs();
                    }
                    agocVar = agoc.RETURNS_RESULT_OF;
                }
                if (ahhuVar.hasKind()) {
                    ahht kind = ahhuVar.getKind();
                    if (kind == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    int iOrdinal2 = kind.ordinal();
                    if (iOrdinal2 == 0) {
                        agobVar = agob.AT_MOST_ONCE;
                    } else if (iOrdinal2 == 1) {
                        agobVar = agob.EXACTLY_ONCE;
                    } else {
                        if (iOrdinal2 != 2) {
                            throw new aezs();
                        }
                        agobVar = agob.AT_LEAST_ONCE;
                    }
                } else {
                    agobVar = null;
                }
                List<agnz> effects = agnxVar.getEffects();
                ahhuVar.getClass();
                effects.add(toKmEffect(ahhuVar, agocVar, agobVar, agpmVar));
            }
        }
        return agnxVar;
    }

    private static final agnz toKmEffect(ahhu ahhuVar, agoc agocVar, agob agobVar, agpm agpmVar) {
        agnz agnzVar = new agnz(agocVar, agobVar);
        List<ahic> effectConstructorArgumentList = ahhuVar.getEffectConstructorArgumentList();
        effectConstructorArgumentList.getClass();
        List<agoa> constructorArguments = agnzVar.getConstructorArguments();
        for (ahic ahicVar : effectConstructorArgumentList) {
            ahicVar.getClass();
            constructorArguments.add(toKmEffectExpression(ahicVar, agpmVar));
        }
        if (ahhuVar.hasConclusionOfConditionalEffect()) {
            ahic conclusionOfConditionalEffect = ahhuVar.getConclusionOfConditionalEffect();
            conclusionOfConditionalEffect.getClass();
            agnzVar.setConclusion(toKmEffectExpression(conclusionOfConditionalEffect, agpmVar));
        }
        return agnzVar;
    }

    private static final agoa toKmEffectExpression(ahic ahicVar, agpm agpmVar) {
        Boolean bool;
        agoa agoaVar = new agoa();
        agoaVar.setFlags$org_jetbrains_kotlin_kotlin_metadata(ahicVar.getFlags());
        agoaVar.setParameterIndex(ahicVar.hasValueParameterReference() ? Integer.valueOf(ahicVar.getValueParameterReference()) : null);
        if (ahicVar.hasConstantValue()) {
            ahib constantValue = ahicVar.getConstantValue();
            if (constantValue == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ahju ahjuVar = ahju.IN;
            ahjk ahjkVar = ahjk.IN;
            ahkh ahkhVar = ahkh.LANGUAGE_VERSION;
            ahhr ahhrVar = ahhr.RETURNS_CONSTANT;
            ahht ahhtVar = ahht.AT_MOST_ONCE;
            int iOrdinal = constantValue.ordinal();
            if (iOrdinal == 0) {
                bool = true;
            } else if (iOrdinal == 1) {
                bool = false;
            } else {
                if (iOrdinal != 2) {
                    throw new aezs();
                }
                bool = null;
            }
            agoaVar.setConstantValue(new agnv(bool));
        }
        ahjn ahjnVarIsInstanceType = ahlg.isInstanceType(ahicVar, agpmVar.getTypes());
        agoaVar.setInstanceType(ahjnVarIsInstanceType != null ? toKmType(ahjnVarIsInstanceType, agpmVar) : null);
        List<ahic> andArgumentList = ahicVar.getAndArgumentList();
        andArgumentList.getClass();
        List<agoa> andArguments = agoaVar.getAndArguments();
        for (ahic ahicVar2 : andArgumentList) {
            ahicVar2.getClass();
            andArguments.add(toKmEffectExpression(ahicVar2, agpmVar));
        }
        List<ahic> orArgumentList = ahicVar.getOrArgumentList();
        orArgumentList.getClass();
        List<agoa> orArguments = agoaVar.getOrArguments();
        for (ahic ahicVar3 : orArgumentList) {
            ahicVar3.getClass();
            orArguments.add(toKmEffectExpression(ahicVar3, agpmVar));
        }
        return agoaVar;
    }

    private static final agod toKmEnumEntry(ahhx ahhxVar, agpm agpmVar) {
        agod agodVar = new agod(agpmVar.get(ahhxVar.getName()));
        Iterator<T> it = agpmVar.getExtensions$org_jetbrains_kotlin_kotlin_metadata().iterator();
        while (it.hasNext()) {
            ((agqf) it.next()).readEnumEntryExtensions(agodVar, ahhxVar, agpmVar);
        }
        return agodVar;
    }

    private static final agog toKmFunction(ahif ahifVar, agpm agpmVar) {
        agog agogVar = new agog(ahifVar.getFlags(), agpmVar.get(ahifVar.getName()));
        List<ahjv> typeParameterList = ahifVar.getTypeParameterList();
        typeParameterList.getClass();
        agpm agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata = agpmVar.withTypeParameters$org_jetbrains_kotlin_kotlin_metadata(typeParameterList);
        List<ahjv> typeParameterList2 = ahifVar.getTypeParameterList();
        typeParameterList2.getClass();
        List<agon> typeParameters = agogVar.getTypeParameters();
        for (ahjv ahjvVar : typeParameterList2) {
            ahjvVar.getClass();
            typeParameters.add(toKmTypeParameter(ahjvVar, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata));
        }
        ahjn ahjnVarReceiverType = ahlg.receiverType(ahifVar, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata.getTypes());
        agogVar.setReceiverParameterType(ahjnVarReceiverType != null ? toKmType(ahjnVarReceiverType, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata) : null);
        List<ahkb> contextParameterList = ahifVar.getContextParameterList();
        contextParameterList.getClass();
        List<agoq> contextParameters = agogVar.getContextParameters();
        for (ahkb ahkbVar : contextParameterList) {
            ahkbVar.getClass();
            contextParameters.add(toKmValueParameter(ahkbVar, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata));
        }
        if (ahifVar.getContextParameterList().isEmpty()) {
            List<ahjn> contextReceiverTypeList = ahifVar.getContextReceiverTypeList();
            contextReceiverTypeList.getClass();
            if (!contextReceiverTypeList.isEmpty()) {
                List<ahjn> listContextReceiverTypes = ahlg.contextReceiverTypes(ahifVar, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata.getTypes());
                List<agoq> contextParameters2 = agogVar.getContextParameters();
                Iterator<T> it = listContextReceiverTypes.iterator();
                while (it.hasNext()) {
                    contextParameters2.add(legacyCtxReceiverToParameter(toKmType((ahjn) it.next(), agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata)));
                }
            }
        }
        List<ahkb> valueParameterList = ahifVar.getValueParameterList();
        valueParameterList.getClass();
        List<agoq> valueParameters = agogVar.getValueParameters();
        for (ahkb ahkbVar2 : valueParameterList) {
            ahkbVar2.getClass();
            valueParameters.add(toKmValueParameter(ahkbVar2, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata));
        }
        agogVar.setReturnType(toKmType(ahlg.returnType(ahifVar, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata.getTypes()), agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata));
        if (ahifVar.hasContract()) {
            ahhl contract = ahifVar.getContract();
            contract.getClass();
            agogVar.setContract(toKmContract(contract, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata));
        }
        List<Integer> versionRequirementList = ahifVar.getVersionRequirementList();
        versionRequirementList.getClass();
        List<agot> versionRequirements = agogVar.getVersionRequirements();
        for (Integer num : versionRequirementList) {
            num.getClass();
            versionRequirements.add(readVersionRequirement(num.intValue(), agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata));
        }
        List<ahhf> compilerPluginDataList = ahifVar.getCompilerPluginDataList();
        compilerPluginDataList.getClass();
        Map<String, byte[]> compilerPluginMetadata = agogVar.getCompilerPluginMetadata();
        for (ahhf ahhfVar : compilerPluginDataList) {
            compilerPluginMetadata.put(agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata.get(ahhfVar.getPluginId()), ahhfVar.getData().toByteArray());
        }
        Iterator<T> it2 = agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata.getExtensions$org_jetbrains_kotlin_kotlin_metadata().iterator();
        while (it2.hasNext()) {
            ((agqf) it2.next()).readFunctionExtensions(agogVar, ahifVar, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata);
        }
        return agogVar;
    }

    public static final agoh toKmLambda(ahif ahifVar, ahld ahldVar, boolean z) {
        ahifVar.getClass();
        ahldVar.getClass();
        agoh agohVar = new agoh();
        ahjy typeTable = ahifVar.getTypeTable();
        typeTable.getClass();
        agohVar.setFunction(toKmFunction(ahifVar, new agpm(ahldVar, new ahlh(typeTable), ahln.Companion.getEMPTY(), z, null, null, 48, null)));
        return agohVar;
    }

    public static final agoi toKmPackage(ahim ahimVar, ahld ahldVar, boolean z, List<? extends Object> list) {
        ahimVar.getClass();
        ahldVar.getClass();
        list.getClass();
        agoi agoiVar = new agoi();
        ahjy typeTable = ahimVar.getTypeTable();
        typeTable.getClass();
        ahlh ahlhVar = new ahlh(typeTable);
        ahlm ahlmVar = ahln.Companion;
        ahkl versionRequirementTable = ahimVar.getVersionRequirementTable();
        versionRequirementTable.getClass();
        agpm agpmVar = new agpm(ahldVar, ahlhVar, ahlmVar.create(versionRequirementTable), z, null, list, 16, null);
        List<ahif> functionList = ahimVar.getFunctionList();
        functionList.getClass();
        List<ahis> propertyList = ahimVar.getPropertyList();
        propertyList.getClass();
        List<ahjq> typeAliasList = ahimVar.getTypeAliasList();
        typeAliasList.getClass();
        visitDeclarations(agoiVar, functionList, propertyList, typeAliasList, agpmVar);
        Iterator<T> it = agpmVar.getExtensions$org_jetbrains_kotlin_kotlin_metadata().iterator();
        while (it.hasNext()) {
            ((agqf) it.next()).readPackageExtensions(agoiVar, ahimVar, agpmVar);
        }
        return agoiVar;
    }

    public static /* synthetic */ agoi toKmPackage$default(ahim ahimVar, ahld ahldVar, boolean z, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            list = afbe.a;
        }
        return toKmPackage(ahimVar, ahldVar, z & ((i & 2) == 0), list);
    }

    public static final agoj toKmProperty(ahis ahisVar, agpm agpmVar) {
        ahisVar.getClass();
        agpmVar.getClass();
        agoj agojVar = new agoj(ahisVar.getFlags(), agpmVar.get(ahisVar.getName()), getPropertyGetterFlags(ahisVar), getPropertySetterFlags(ahisVar));
        List<ahjv> typeParameterList = ahisVar.getTypeParameterList();
        typeParameterList.getClass();
        agpm agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata = agpmVar.withTypeParameters$org_jetbrains_kotlin_kotlin_metadata(typeParameterList);
        List<ahjv> typeParameterList2 = ahisVar.getTypeParameterList();
        typeParameterList2.getClass();
        List<agon> typeParameters = agojVar.getTypeParameters();
        for (ahjv ahjvVar : typeParameterList2) {
            ahjvVar.getClass();
            typeParameters.add(toKmTypeParameter(ahjvVar, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata));
        }
        ahjn ahjnVarReceiverType = ahlg.receiverType(ahisVar, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata.getTypes());
        agojVar.setReceiverParameterType(ahjnVarReceiverType != null ? toKmType(ahjnVarReceiverType, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata) : null);
        List<ahkb> contextParameterList = ahisVar.getContextParameterList();
        contextParameterList.getClass();
        List<agoq> contextParameters = agojVar.getContextParameters();
        for (ahkb ahkbVar : contextParameterList) {
            ahkbVar.getClass();
            contextParameters.add(toKmValueParameter(ahkbVar, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata));
        }
        if (ahisVar.getContextParameterList().isEmpty()) {
            List<ahjn> contextReceiverTypeList = ahisVar.getContextReceiverTypeList();
            contextReceiverTypeList.getClass();
            if (!contextReceiverTypeList.isEmpty()) {
                List<ahjn> listContextReceiverTypes = ahlg.contextReceiverTypes(ahisVar, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata.getTypes());
                List<agoq> contextParameters2 = agojVar.getContextParameters();
                Iterator<T> it = listContextReceiverTypes.iterator();
                while (it.hasNext()) {
                    contextParameters2.add(legacyCtxReceiverToParameter(toKmType((ahjn) it.next(), agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata)));
                }
            }
        }
        if (ahisVar.hasSetterValueParameter()) {
            ahkb setterValueParameter = ahisVar.getSetterValueParameter();
            setterValueParameter.getClass();
            agojVar.setSetterParameter(toKmValueParameter(setterValueParameter, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata));
        }
        agojVar.setReturnType(toKmType(ahlg.returnType(ahisVar, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata.getTypes()), agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata));
        List<Integer> versionRequirementList = ahisVar.getVersionRequirementList();
        versionRequirementList.getClass();
        List<agot> versionRequirements = agojVar.getVersionRequirements();
        for (Integer num : versionRequirementList) {
            num.getClass();
            versionRequirements.add(readVersionRequirement(num.intValue(), agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata));
        }
        List<ahhf> compilerPluginDataList = ahisVar.getCompilerPluginDataList();
        compilerPluginDataList.getClass();
        Map<String, byte[]> compilerPluginMetadata = agojVar.getCompilerPluginMetadata();
        for (ahhf ahhfVar : compilerPluginDataList) {
            compilerPluginMetadata.put(agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata.get(ahhfVar.getPluginId()), ahhfVar.getData().toByteArray());
        }
        Iterator<T> it2 = agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata.getExtensions$org_jetbrains_kotlin_kotlin_metadata().iterator();
        while (it2.hasNext()) {
            ((agqf) it2.next()).readPropertyExtensions(agojVar, ahisVar, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata);
        }
        return agojVar;
    }

    private static final agol toKmType(ahjn ahjnVar, agpm agpmVar) {
        agnu agntVar;
        agor agorVar;
        agol agolVar = new agol(getTypeFlags(ahjnVar));
        if (ahjnVar.hasClassName()) {
            agntVar = new agnr(agpmVar.className$org_jetbrains_kotlin_kotlin_metadata(ahjnVar.getClassName()));
        } else if (ahjnVar.hasTypeAliasName()) {
            agntVar = new agns(agpmVar.className$org_jetbrains_kotlin_kotlin_metadata(ahjnVar.getTypeAliasName()));
        } else if (ahjnVar.hasTypeParameter()) {
            agntVar = new agnt(ahjnVar.getTypeParameter());
        } else {
            if (!ahjnVar.hasTypeParameterName()) {
                throw new agmq("No classifier (class, type alias or type parameter) recorded for Type", null, 2, null);
            }
            Integer typeParameterId$org_jetbrains_kotlin_kotlin_metadata = agpmVar.getTypeParameterId$org_jetbrains_kotlin_kotlin_metadata(ahjnVar.getTypeParameterName());
            if (typeParameterId$org_jetbrains_kotlin_kotlin_metadata == null) {
                throw new agmq("No type parameter id for ".concat(String.valueOf(agpmVar.get(ahjnVar.getTypeParameterName()))), null, 2, null);
            }
            agntVar = new agnt(typeParameterId$org_jetbrains_kotlin_kotlin_metadata.intValue());
        }
        agolVar.setClassifier(agntVar);
        for (ahjl ahjlVar : ahjnVar.getArgumentList()) {
            ahjk projection = ahjlVar.getProjection();
            if (projection == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ahju ahjuVar = ahju.IN;
            ahkh ahkhVar = ahkh.LANGUAGE_VERSION;
            ahhr ahhrVar = ahhr.RETURNS_CONSTANT;
            ahht ahhtVar = ahht.AT_MOST_ONCE;
            ahib ahibVar = ahib.TRUE;
            int iOrdinal = projection.ordinal();
            if (iOrdinal == 0) {
                agorVar = agor.IN;
            } else if (iOrdinal == 1) {
                agorVar = agor.OUT;
            } else if (iOrdinal == 2) {
                agorVar = agor.INVARIANT;
            } else {
                if (iOrdinal != 3) {
                    throw new aezs();
                }
                agorVar = null;
            }
            if (agorVar != null) {
                ahjlVar.getClass();
                ahjn ahjnVarType = ahlg.type(ahjlVar, agpmVar.getTypes());
                if (ahjnVarType == null) {
                    throw new agmq("No type argument for non-STAR projection in Type", null, 2, null);
                }
                agolVar.getArguments().add(new agop(agorVar, toKmType(ahjnVarType, agpmVar)));
            } else {
                agolVar.getArguments().add(agop.STAR);
            }
        }
        ahjn ahjnVarAbbreviatedType = ahlg.abbreviatedType(ahjnVar, agpmVar.getTypes());
        agolVar.setAbbreviatedType(ahjnVarAbbreviatedType != null ? toKmType(ahjnVarAbbreviatedType, agpmVar) : null);
        ahjn ahjnVarOuterType = ahlg.outerType(ahjnVar, agpmVar.getTypes());
        agolVar.setOuterType(ahjnVarOuterType != null ? toKmType(ahjnVarOuterType, agpmVar) : null);
        ahjn ahjnVarFlexibleUpperBound = ahlg.flexibleUpperBound(ahjnVar, agpmVar.getTypes());
        agolVar.setFlexibleTypeUpperBound(ahjnVarFlexibleUpperBound != null ? new agof(toKmType(ahjnVarFlexibleUpperBound, agpmVar), ahjnVar.hasFlexibleTypeCapabilitiesId() ? agpmVar.get(ahjnVar.getFlexibleTypeCapabilitiesId()) : null) : null);
        Iterator<T> it = agpmVar.getExtensions$org_jetbrains_kotlin_kotlin_metadata().iterator();
        while (it.hasNext()) {
            ((agqf) it.next()).readTypeExtensions(agolVar, ahjnVar, agpmVar);
        }
        return agolVar;
    }

    private static final agom toKmTypeAlias(ahjq ahjqVar, agpm agpmVar) {
        agom agomVar = new agom(ahjqVar.getFlags(), agpmVar.get(ahjqVar.getName()));
        List<ahjv> typeParameterList = ahjqVar.getTypeParameterList();
        typeParameterList.getClass();
        agpm agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata = agpmVar.withTypeParameters$org_jetbrains_kotlin_kotlin_metadata(typeParameterList);
        List<ahjv> typeParameterList2 = ahjqVar.getTypeParameterList();
        typeParameterList2.getClass();
        List<agon> typeParameters = agomVar.getTypeParameters();
        for (ahjv ahjvVar : typeParameterList2) {
            ahjvVar.getClass();
            typeParameters.add(toKmTypeParameter(ahjvVar, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata));
        }
        agomVar.setUnderlyingType(toKmType(ahlg.underlyingType(ahjqVar, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata.getTypes()), agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata));
        agomVar.setExpandedType(toKmType(ahlg.expandedType(ahjqVar, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata.getTypes()), agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata));
        List<ahgx> annotationList = ahjqVar.getAnnotationList();
        annotationList.getClass();
        List<agms> annotations = agomVar.getAnnotations();
        for (ahgx ahgxVar : annotationList) {
            ahgxVar.getClass();
            annotations.add(agpn.readAnnotation(ahgxVar, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata.getStrings()));
        }
        List<Integer> versionRequirementList = ahjqVar.getVersionRequirementList();
        versionRequirementList.getClass();
        List<agot> versionRequirements = agomVar.getVersionRequirements();
        for (Integer num : versionRequirementList) {
            num.getClass();
            versionRequirements.add(readVersionRequirement(num.intValue(), agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata));
        }
        List<ahhf> compilerPluginDataList = ahjqVar.getCompilerPluginDataList();
        compilerPluginDataList.getClass();
        Map<String, byte[]> compilerPluginMetadata = agomVar.getCompilerPluginMetadata();
        for (ahhf ahhfVar : compilerPluginDataList) {
            compilerPluginMetadata.put(agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata.get(ahhfVar.getPluginId()), ahhfVar.getData().toByteArray());
        }
        Iterator<T> it = agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata.getExtensions$org_jetbrains_kotlin_kotlin_metadata().iterator();
        while (it.hasNext()) {
            ((agqf) it.next()).readTypeAliasExtensions(agomVar, ahjqVar, agpmVarWithTypeParameters$org_jetbrains_kotlin_kotlin_metadata);
        }
        return agomVar;
    }

    private static final agon toKmTypeParameter(ahjv ahjvVar, agpm agpmVar) {
        agor agorVar;
        ahju variance = ahjvVar.getVariance();
        if (variance == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ahjk ahjkVar = ahjk.IN;
        ahkh ahkhVar = ahkh.LANGUAGE_VERSION;
        ahhr ahhrVar = ahhr.RETURNS_CONSTANT;
        ahht ahhtVar = ahht.AT_MOST_ONCE;
        ahib ahibVar = ahib.TRUE;
        int iOrdinal = variance.ordinal();
        if (iOrdinal == 0) {
            agorVar = agor.IN;
        } else if (iOrdinal == 1) {
            agorVar = agor.OUT;
        } else {
            if (iOrdinal != 2) {
                throw new aezs();
            }
            agorVar = agor.INVARIANT;
        }
        agon agonVar = new agon(getTypeParameterFlags(ahjvVar), agpmVar.get(ahjvVar.getName()), ahjvVar.getId(), agorVar);
        List<ahjn> listUpperBounds = ahlg.upperBounds(ahjvVar, agpmVar.getTypes());
        List<agol> upperBounds = agonVar.getUpperBounds();
        Iterator<T> it = listUpperBounds.iterator();
        while (it.hasNext()) {
            upperBounds.add(toKmType((ahjn) it.next(), agpmVar));
        }
        Iterator<T> it2 = agpmVar.getExtensions$org_jetbrains_kotlin_kotlin_metadata().iterator();
        while (it2.hasNext()) {
            ((agqf) it2.next()).readTypeParameterExtensions(agonVar, ahjvVar, agpmVar);
        }
        return agonVar;
    }

    private static final agoq toKmValueParameter(ahkb ahkbVar, agpm agpmVar) {
        agoq agoqVar = new agoq(ahkbVar.getFlags(), agpmVar.get(ahkbVar.getName()));
        agoqVar.setType(toKmType(ahlg.type(ahkbVar, agpmVar.getTypes()), agpmVar));
        ahjn ahjnVarVarargElementType = ahlg.varargElementType(ahkbVar, agpmVar.getTypes());
        agoqVar.setVarargElementType(ahjnVarVarargElementType != null ? toKmType(ahjnVarVarargElementType, agpmVar) : null);
        if (ahkbVar.hasAnnotationParameterDefaultValue()) {
            ahgu annotationParameterDefaultValue = ahkbVar.getAnnotationParameterDefaultValue();
            annotationParameterDefaultValue.getClass();
            agoqVar.setAnnotationParameterDefaultValue(agpn.readAnnotationArgument(annotationParameterDefaultValue, agpmVar.getStrings()));
        }
        Iterator<T> it = agpmVar.getExtensions$org_jetbrains_kotlin_kotlin_metadata().iterator();
        while (it.hasNext()) {
            ((agqf) it.next()).readValueParameterExtensions(agoqVar, ahkbVar, agpmVar);
        }
        return agoqVar;
    }

    private static final void visitDeclarations(agny agnyVar, List<ahif> list, List<ahis> list2, List<ahjq> list3, agpm agpmVar) {
        List<agog> functions = agnyVar.getFunctions();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            functions.add(toKmFunction((ahif) it.next(), agpmVar));
        }
        List<agoj> properties = agnyVar.getProperties();
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            properties.add(toKmProperty((ahis) it2.next(), agpmVar));
        }
        List<agom> typeAliases = agnyVar.getTypeAliases();
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            typeAliases.add(toKmTypeAlias((ahjq) it3.next(), agpmVar));
        }
    }
}
