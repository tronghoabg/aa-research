package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class aibt extends aggh implements agbi {
    private final agfk annotations;
    private final ahyy c;
    private final ahnd classId;
    private final ahhc classProto;
    private final aied<agba> companionObjectDescriptor;
    private final aiec<Collection<agaz>> constructors;
    private final agbi containingDeclaration;
    private final aibp enumEntries;
    private final boolean hasEnumEntriesMetadataFlag;
    private final agbb kind;
    private final agdu<aibj> memberScopeHolder;
    private final ahkv metadataVersion;
    private final agcq modality;
    private final aied<agaz> primaryConstructor;
    private final aiec<Collection<agba>> sealedSubclasses;
    private final agdx sourceElement;
    private final ahxf staticScope;
    private final aiab thisAsProtoContainer;
    private final aibl typeConstructor;
    private final aied<agej<aigw>> valueClassRepresentation;
    private final agcc visibility;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aibt(ahyy ahyyVar, ahhc ahhcVar, ahld ahldVar, ahkv ahkvVar, agdx agdxVar) {
        ahxf ahxlVar;
        super(ahyyVar.getStorageManager(), ahzz.getClassId(ahldVar, ahhcVar.getFqName()).getShortClassName());
        ahyyVar.getClass();
        ahhcVar.getClass();
        ahldVar.getClass();
        ahkvVar.getClass();
        agdxVar.getClass();
        this.classProto = ahhcVar;
        this.metadataVersion = ahkvVar;
        this.sourceElement = agdxVar;
        this.classId = ahzz.getClassId(ahldVar, ahhcVar.getFqName());
        this.modality = aiae.INSTANCE.modality(ahla.MODALITY.get(ahhcVar.getFlags()));
        this.visibility = aiaf.descriptorVisibility(aiae.INSTANCE, ahla.VISIBILITY.get(ahhcVar.getFlags()));
        agbb agbbVarClassKind = aiae.INSTANCE.classKind(ahla.CLASS_KIND.get(ahhcVar.getFlags()));
        this.kind = agbbVarClassKind;
        List<ahjv> typeParameterList = ahhcVar.getTypeParameterList();
        typeParameterList.getClass();
        ahjy typeTable = ahhcVar.getTypeTable();
        typeTable.getClass();
        ahlh ahlhVar = new ahlh(typeTable);
        ahlm ahlmVar = ahln.Companion;
        ahkl versionRequirementTable = ahhcVar.getVersionRequirementTable();
        versionRequirementTable.getClass();
        ahyy ahyyVarChildContext = ahyyVar.childContext(this, typeParameterList, ahldVar, ahlhVar, ahlmVar.create(versionRequirementTable), ahkvVar);
        this.c = ahyyVarChildContext;
        boolean zBooleanValue = ahla.HAS_ENUM_ENTRIES.get(ahhcVar.getFlags()).booleanValue();
        this.hasEnumEntriesMetadataFlag = zBooleanValue;
        if (agbbVarClassKind == agbb.ENUM_CLASS) {
            boolean z = true;
            if (!zBooleanValue && !affa.f(ahyyVarChildContext.getComponents().getEnumEntriesDeserializationSupport().canSynthesizeEnumEntries(), true)) {
                z = false;
            }
            ahxlVar = new ahxl(ahyyVarChildContext.getStorageManager(), this, z);
        } else {
            ahxlVar = ahxd.INSTANCE;
        }
        this.staticScope = ahxlVar;
        this.typeConstructor = new aibl(this);
        this.memberScopeHolder = agdu.Companion.create(this, ahyyVarChildContext.getStorageManager(), ahyyVarChildContext.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner(), new aibs(this));
        this.enumEntries = agbbVarClassKind == agbb.ENUM_CLASS ? new aibp(this) : null;
        agbi containingDeclaration = ahyyVar.getContainingDeclaration();
        this.containingDeclaration = containingDeclaration;
        this.primaryConstructor = ahyyVarChildContext.getStorageManager().createNullableLazyValue(new aiaz(this));
        this.constructors = ahyyVarChildContext.getStorageManager().createLazyValue(new aiba(this));
        this.companionObjectDescriptor = ahyyVarChildContext.getStorageManager().createNullableLazyValue(new aibb(this));
        this.sealedSubclasses = ahyyVarChildContext.getStorageManager().createLazyValue(new aibc(this));
        this.valueClassRepresentation = ahyyVarChildContext.getStorageManager().createNullableLazyValue(new aibd(this));
        ahld nameResolver = ahyyVarChildContext.getNameResolver();
        ahlh typeTable2 = ahyyVarChildContext.getTypeTable();
        aibt aibtVar = containingDeclaration instanceof aibt ? (aibt) containingDeclaration : null;
        this.thisAsProtoContainer = new aiab(ahhcVar, nameResolver, typeTable2, agdxVar, aibtVar != null ? aibtVar.thisAsProtoContainer : null);
        this.annotations = !ahla.HAS_ANNOTATIONS.get(ahhcVar.getFlags()).booleanValue() ? agfk.Companion.getEMPTY() : new aicz(ahyyVarChildContext.getStorageManager(), new aibe(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List annotations$lambda$0(aibt aibtVar) {
        return woy.cf(aibtVar.c.getComponents().getAnnotationAndConstantLoader().loadClassAnnotations(aibtVar.thisAsProtoContainer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final agba computeCompanionObjectDescriptor() {
        if (!this.classProto.hasCompanionObjectName()) {
            return null;
        }
        agbd contributedClassifier = getMemberScope().getContributedClassifier(ahzz.getName(this.c.getNameResolver(), this.classProto.getCompanionObjectName()), aglr.FROM_DESERIALIZATION);
        if (contributedClassifier instanceof agba) {
            return (agba) contributedClassifier;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<agaz> computeConstructors() {
        return woy.bY(woy.bY(computeSecondaryConstructors(), woy.bj(getUnsubstitutedPrimaryConstructor())), this.c.getComponents().getAdditionalClassPartsProvider().getConstructors(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final agaz computePrimaryConstructor() {
        Object next;
        if (this.kind.isSingleton()) {
            aggu agguVarCreatePrimaryConstructorForObject = ahss.createPrimaryConstructorForObject(this, agdx.NO_SOURCE);
            agguVarCreatePrimaryConstructorForObject.setReturnType(getDefaultType());
            return agguVarCreatePrimaryConstructorForObject;
        }
        List<ahhi> constructorList = this.classProto.getConstructorList();
        constructorList.getClass();
        Iterator<T> it = constructorList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!ahla.IS_SECONDARY.get(((ahhi) next).getFlags()).booleanValue()) {
                break;
            }
        }
        ahhi ahhiVar = (ahhi) next;
        if (ahhiVar != null) {
            return this.c.getMemberDeserializer().loadConstructor(ahhiVar, true);
        }
        return null;
    }

    private final List<agaz> computeSecondaryConstructors() {
        List<ahhi> constructorList = this.classProto.getConstructorList();
        constructorList.getClass();
        ArrayList<ahhi> arrayList = new ArrayList();
        for (Object obj : constructorList) {
            if (ahla.IS_SECONDARY.get(((ahhi) obj).getFlags()).booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(woy.bp(arrayList, 10));
        for (ahhi ahhiVar : arrayList) {
            ahzy memberDeserializer = this.c.getMemberDeserializer();
            ahhiVar.getClass();
            arrayList2.add(memberDeserializer.loadConstructor(ahhiVar, false));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<agba> computeSubclassesForSealedClass() {
        if (this.modality != agcq.SEALED) {
            return afbe.a;
        }
        List<Integer> sealedSubclassFqNameList = this.classProto.getSealedSubclassFqNameList();
        sealedSubclassFqNameList.getClass();
        if (sealedSubclassFqNameList.isEmpty()) {
            return ahsk.INSTANCE.computeSealedSubclasses(this, false);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : sealedSubclassFqNameList) {
            ahyy ahyyVar = this.c;
            ahyv components = ahyyVar.getComponents();
            ahld nameResolver = ahyyVar.getNameResolver();
            num.getClass();
            agba agbaVarDeserializeClass = components.deserializeClass(ahzz.getClassId(nameResolver, num.intValue()));
            if (agbaVarDeserializeClass != null) {
                arrayList.add(agbaVarDeserializeClass);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final agej<aigw> computeValueClassRepresentation() {
        if (!isInline() && !isValue()) {
            return null;
        }
        ahkv ahkvVar = this.metadataVersion;
        ahhc ahhcVar = this.classProto;
        ahyy ahyyVar = this.c;
        boolean zIsAtLeast = ahkvVar.isAtLeast(1, 5, 1);
        agej<aigw> agejVarLoadValueClassRepresentation = aiap.loadValueClassRepresentation(ahhcVar, zIsAtLeast, ahyyVar.getNameResolver(), ahyyVar.getTypeTable(), new aibq(ahyyVar.getTypeDeserializer()), new aibr(this));
        if (agejVarLoadValueClassRepresentation != null) {
            return agejVarLoadValueClassRepresentation;
        }
        if (zIsAtLeast) {
            return null;
        }
        agaz unsubstitutedPrimaryConstructor = getUnsubstitutedPrimaryConstructor();
        if (unsubstitutedPrimaryConstructor == null) {
            toString();
            throw new IllegalStateException("Inline class has no primary constructor: ".concat(toString()));
        }
        List<agel> valueParameters = unsubstitutedPrimaryConstructor.getValueParameters();
        valueParameters.getClass();
        ahnj name = ((agel) woy.bF(valueParameters)).getName();
        name.getClass();
        aigw valueClassPropertyType = getValueClassPropertyType(name);
        if (valueClassPropertyType != null) {
            return new agck(name, valueClassPropertyType);
        }
        toString();
        throw new IllegalStateException("Value class has no underlying property: ".concat(toString()));
    }

    private final aibj getMemberScope() {
        return (aibj) this.memberScopeHolder.getScope(this.c.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final aigw getValueClassPropertyType(ahnj ahnjVar) {
        Iterator<T> it = getMemberScope().getContributedVariables(ahnjVar, aglr.FROM_DESERIALIZATION).iterator();
        boolean z = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
            } else {
                Object next = it.next();
                agdn agdnVar = (agdn) next;
                if (agdnVar.getExtensionReceiverParameter() == null && agdnVar.getContextReceiverParameters().isEmpty()) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj = next;
                }
            }
        }
        obj = null;
        agdn agdnVar2 = (agdn) obj;
        return (aigw) (agdnVar2 != null ? agdnVar2.getType() : null);
    }

    @Override // defpackage.agez
    public agfk getAnnotations() {
        return this.annotations;
    }

    public final ahyy getC() {
        return this.c;
    }

    public final ahhc getClassProto() {
        return this.classProto;
    }

    @Override // defpackage.agba
    public agba getCompanionObjectDescriptor() {
        return this.companionObjectDescriptor.invoke();
    }

    @Override // defpackage.agba
    public Collection<agaz> getConstructors() {
        return this.constructors.invoke();
    }

    @Override // defpackage.agba, defpackage.agbj, defpackage.agbi
    public agbi getContainingDeclaration() {
        return this.containingDeclaration;
    }

    @Override // defpackage.aggh, defpackage.agba
    public List<agdq> getContextReceivers() {
        List<ahjn> listContextReceiverTypes = ahlg.contextReceiverTypes(this.classProto, this.c.getTypeTable());
        ArrayList arrayList = new ArrayList(woy.bp(listContextReceiverTypes, 10));
        Iterator<T> it = listContextReceiverTypes.iterator();
        while (it.hasNext()) {
            arrayList.add(new agin(getThisAsReceiverParameter(), new ahxv(this, this.c.getTypeDeserializer().type((ahjn) it.next()), null, null), agfk.Companion.getEMPTY()));
        }
        return arrayList;
    }

    @Override // defpackage.agba, defpackage.agbe
    public List<agee> getDeclaredTypeParameters() {
        return this.c.getTypeDeserializer().getOwnTypeParameters();
    }

    @Override // defpackage.agba
    public agbb getKind() {
        return this.kind;
    }

    public final ahkv getMetadataVersion() {
        return this.metadataVersion;
    }

    @Override // defpackage.agba, defpackage.agco
    public agcq getModality() {
        return this.modality;
    }

    @Override // defpackage.agbl
    public agdx getSource() {
        return this.sourceElement;
    }

    public final aiab getThisAsProtoContainer$org_jetbrains_kotlin_deserialization() {
        return this.thisAsProtoContainer;
    }

    @Override // defpackage.agbd
    public aiid getTypeConstructor() {
        return this.typeConstructor;
    }

    @Override // defpackage.aghw
    protected ahxe getUnsubstitutedMemberScope(aiju aijuVar) {
        aijuVar.getClass();
        return this.memberScopeHolder.getScope(aijuVar);
    }

    @Override // defpackage.agba
    public agaz getUnsubstitutedPrimaryConstructor() {
        return this.primaryConstructor.invoke();
    }

    @Override // defpackage.agba
    public agej<aigw> getValueClassRepresentation() {
        return this.valueClassRepresentation.invoke();
    }

    @Override // defpackage.agba, defpackage.agco, defpackage.agbm
    public agcc getVisibility() {
        return this.visibility;
    }

    public final boolean hasNestedClass$org_jetbrains_kotlin_deserialization(ahnj ahnjVar) {
        ahnjVar.getClass();
        return getMemberScope().getClassNames$org_jetbrains_kotlin_deserialization().contains(ahnjVar);
    }

    @Override // defpackage.agco
    public boolean isActual() {
        return false;
    }

    @Override // defpackage.agba
    public boolean isCompanionObject() {
        return ahla.CLASS_KIND.get(this.classProto.getFlags()) == ahhb.COMPANION_OBJECT;
    }

    @Override // defpackage.agba
    public boolean isData() {
        return ahla.IS_DATA.get(this.classProto.getFlags()).booleanValue();
    }

    @Override // defpackage.agco
    public boolean isExpect() {
        return ahla.IS_EXPECT_CLASS.get(this.classProto.getFlags()).booleanValue();
    }

    @Override // defpackage.agco
    public boolean isExternal() {
        return ahla.IS_EXTERNAL_CLASS.get(this.classProto.getFlags()).booleanValue();
    }

    @Override // defpackage.agba
    public boolean isFun() {
        return ahla.IS_FUN_INTERFACE.get(this.classProto.getFlags()).booleanValue();
    }

    @Override // defpackage.agba
    public boolean isInline() {
        return ahla.IS_VALUE_CLASS.get(this.classProto.getFlags()).booleanValue() && this.metadataVersion.isAtMost(1, 4, 1);
    }

    @Override // defpackage.agbe
    public boolean isInner() {
        return ahla.IS_INNER.get(this.classProto.getFlags()).booleanValue();
    }

    @Override // defpackage.agba
    public boolean isValue() {
        return ahla.IS_VALUE_CLASS.get(this.classProto.getFlags()).booleanValue() && this.metadataVersion.isAtLeast(1, 4, 2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("deserialized ");
        sb.append(true != isExpect() ? "" : "expect ");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    @Override // defpackage.agba
    public ahxf getStaticScope() {
        return this.staticScope;
    }
}
