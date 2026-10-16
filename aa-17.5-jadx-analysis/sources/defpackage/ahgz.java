package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahgz extends ahol<ahhc, ahgz> implements ahph {
    private int bitField0_;
    private int companionObjectName_;
    private int fqName_;
    private int inlineClassUnderlyingPropertyName_;
    private int inlineClassUnderlyingTypeId_;
    private int flags_ = 6;
    private List<ahjv> typeParameter_ = Collections.EMPTY_LIST;
    private List<ahjn> supertype_ = Collections.EMPTY_LIST;
    private List<Integer> supertypeId_ = Collections.EMPTY_LIST;
    private List<Integer> nestedClassName_ = Collections.EMPTY_LIST;
    private List<ahjn> contextReceiverType_ = Collections.EMPTY_LIST;
    private List<Integer> contextReceiverTypeId_ = Collections.EMPTY_LIST;
    private List<ahhi> constructor_ = Collections.EMPTY_LIST;
    private List<ahif> function_ = Collections.EMPTY_LIST;
    private List<ahis> property_ = Collections.EMPTY_LIST;
    private List<ahjq> typeAlias_ = Collections.EMPTY_LIST;
    private List<ahhx> enumEntry_ = Collections.EMPTY_LIST;
    private List<Integer> sealedSubclassFqName_ = Collections.EMPTY_LIST;
    private ahjn inlineClassUnderlyingType_ = ahjn.getDefaultInstance();
    private List<ahgx> annotation_ = Collections.EMPTY_LIST;
    private ahjy typeTable_ = ahjy.getDefaultInstance();
    private List<Integer> versionRequirement_ = Collections.EMPTY_LIST;
    private ahkl versionRequirementTable_ = ahkl.getDefaultInstance();
    private List<ahhf> compilerPluginData_ = Collections.EMPTY_LIST;

    private ahgz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ahgz create() {
        return new ahgz();
    }

    private void ensureAnnotationIsMutable() {
        if ((this.bitField0_ & 262144) != 262144) {
            this.annotation_ = new ArrayList(this.annotation_);
            this.bitField0_ |= 262144;
        }
    }

    private void ensureCompilerPluginDataIsMutable() {
        if ((this.bitField0_ & 4194304) != 4194304) {
            this.compilerPluginData_ = new ArrayList(this.compilerPluginData_);
            this.bitField0_ |= 4194304;
        }
    }

    private void ensureConstructorIsMutable() {
        if ((this.bitField0_ & sk.AUDIO_CONTENT_BUFFER_SIZE) != 512) {
            this.constructor_ = new ArrayList(this.constructor_);
            this.bitField0_ |= sk.AUDIO_CONTENT_BUFFER_SIZE;
        }
    }

    private void ensureContextReceiverTypeIdIsMutable() {
        if ((this.bitField0_ & 256) != 256) {
            this.contextReceiverTypeId_ = new ArrayList(this.contextReceiverTypeId_);
            this.bitField0_ |= 256;
        }
    }

    private void ensureContextReceiverTypeIsMutable() {
        if ((this.bitField0_ & 128) != 128) {
            this.contextReceiverType_ = new ArrayList(this.contextReceiverType_);
            this.bitField0_ |= 128;
        }
    }

    private void ensureEnumEntryIsMutable() {
        if ((this.bitField0_ & 8192) != 8192) {
            this.enumEntry_ = new ArrayList(this.enumEntry_);
            this.bitField0_ |= 8192;
        }
    }

    private void ensureFunctionIsMutable() {
        if ((this.bitField0_ & 1024) != 1024) {
            this.function_ = new ArrayList(this.function_);
            this.bitField0_ |= 1024;
        }
    }

    private void ensureNestedClassNameIsMutable() {
        if ((this.bitField0_ & 64) != 64) {
            this.nestedClassName_ = new ArrayList(this.nestedClassName_);
            this.bitField0_ |= 64;
        }
    }

    private void ensurePropertyIsMutable() {
        if ((this.bitField0_ & 2048) != 2048) {
            this.property_ = new ArrayList(this.property_);
            this.bitField0_ |= 2048;
        }
    }

    private void ensureSealedSubclassFqNameIsMutable() {
        if ((this.bitField0_ & 16384) != 16384) {
            this.sealedSubclassFqName_ = new ArrayList(this.sealedSubclassFqName_);
            this.bitField0_ |= 16384;
        }
    }

    private void ensureSupertypeIdIsMutable() {
        if ((this.bitField0_ & 32) != 32) {
            this.supertypeId_ = new ArrayList(this.supertypeId_);
            this.bitField0_ |= 32;
        }
    }

    private void ensureSupertypeIsMutable() {
        if ((this.bitField0_ & 16) != 16) {
            this.supertype_ = new ArrayList(this.supertype_);
            this.bitField0_ |= 16;
        }
    }

    private void ensureTypeAliasIsMutable() {
        if ((this.bitField0_ & 4096) != 4096) {
            this.typeAlias_ = new ArrayList(this.typeAlias_);
            this.bitField0_ |= 4096;
        }
    }

    private void ensureTypeParameterIsMutable() {
        if ((this.bitField0_ & 8) != 8) {
            this.typeParameter_ = new ArrayList(this.typeParameter_);
            this.bitField0_ |= 8;
        }
    }

    private void ensureVersionRequirementIsMutable() {
        if ((this.bitField0_ & 1048576) != 1048576) {
            this.versionRequirement_ = new ArrayList(this.versionRequirement_);
            this.bitField0_ |= 1048576;
        }
    }

    public ahgz addAllAnnotation(Iterable<? extends ahgx> iterable) {
        ensureAnnotationIsMutable();
        ahns.addAll(iterable, this.annotation_);
        return this;
    }

    @Override // defpackage.ahpf
    public ahhc build() {
        ahhc ahhcVarBuildPartial = buildPartial();
        if (ahhcVarBuildPartial.isInitialized()) {
            return ahhcVarBuildPartial;
        }
        throw newUninitializedMessageException(ahhcVarBuildPartial);
    }

    public ahhc buildPartial() {
        ahhc ahhcVar = new ahhc(this, (ahgm) null);
        int i = this.bitField0_;
        int i2 = i & 1;
        ahhcVar.flags_ = this.flags_;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ahhcVar.fqName_ = this.fqName_;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        ahhcVar.companionObjectName_ = this.companionObjectName_;
        if ((this.bitField0_ & 8) == 8) {
            this.typeParameter_ = DesugarCollections.unmodifiableList(this.typeParameter_);
            this.bitField0_ &= -9;
        }
        ahhcVar.typeParameter_ = this.typeParameter_;
        if ((this.bitField0_ & 16) == 16) {
            this.supertype_ = DesugarCollections.unmodifiableList(this.supertype_);
            this.bitField0_ &= -17;
        }
        ahhcVar.supertype_ = this.supertype_;
        if ((this.bitField0_ & 32) == 32) {
            this.supertypeId_ = DesugarCollections.unmodifiableList(this.supertypeId_);
            this.bitField0_ &= -33;
        }
        ahhcVar.supertypeId_ = this.supertypeId_;
        if ((this.bitField0_ & 64) == 64) {
            this.nestedClassName_ = DesugarCollections.unmodifiableList(this.nestedClassName_);
            this.bitField0_ &= -65;
        }
        ahhcVar.nestedClassName_ = this.nestedClassName_;
        if ((this.bitField0_ & 128) == 128) {
            this.contextReceiverType_ = DesugarCollections.unmodifiableList(this.contextReceiverType_);
            this.bitField0_ &= -129;
        }
        ahhcVar.contextReceiverType_ = this.contextReceiverType_;
        if ((this.bitField0_ & 256) == 256) {
            this.contextReceiverTypeId_ = DesugarCollections.unmodifiableList(this.contextReceiverTypeId_);
            this.bitField0_ &= -257;
        }
        ahhcVar.contextReceiverTypeId_ = this.contextReceiverTypeId_;
        if ((this.bitField0_ & sk.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            this.constructor_ = DesugarCollections.unmodifiableList(this.constructor_);
            this.bitField0_ &= -513;
        }
        ahhcVar.constructor_ = this.constructor_;
        if ((this.bitField0_ & 1024) == 1024) {
            this.function_ = DesugarCollections.unmodifiableList(this.function_);
            this.bitField0_ &= -1025;
        }
        ahhcVar.function_ = this.function_;
        if ((this.bitField0_ & 2048) == 2048) {
            this.property_ = DesugarCollections.unmodifiableList(this.property_);
            this.bitField0_ &= -2049;
        }
        ahhcVar.property_ = this.property_;
        if ((this.bitField0_ & 4096) == 4096) {
            this.typeAlias_ = DesugarCollections.unmodifiableList(this.typeAlias_);
            this.bitField0_ &= -4097;
        }
        ahhcVar.typeAlias_ = this.typeAlias_;
        if ((this.bitField0_ & 8192) == 8192) {
            this.enumEntry_ = DesugarCollections.unmodifiableList(this.enumEntry_);
            this.bitField0_ &= -8193;
        }
        ahhcVar.enumEntry_ = this.enumEntry_;
        if ((this.bitField0_ & 16384) == 16384) {
            this.sealedSubclassFqName_ = DesugarCollections.unmodifiableList(this.sealedSubclassFqName_);
            this.bitField0_ &= -16385;
        }
        ahhcVar.sealedSubclassFqName_ = this.sealedSubclassFqName_;
        if ((i & 32768) == 32768) {
            i2 |= 8;
        }
        ahhcVar.inlineClassUnderlyingPropertyName_ = this.inlineClassUnderlyingPropertyName_;
        if ((i & 65536) == 65536) {
            i2 |= 16;
        }
        ahhcVar.inlineClassUnderlyingType_ = this.inlineClassUnderlyingType_;
        if ((i & 131072) == 131072) {
            i2 |= 32;
        }
        ahhcVar.inlineClassUnderlyingTypeId_ = this.inlineClassUnderlyingTypeId_;
        if ((this.bitField0_ & 262144) == 262144) {
            this.annotation_ = DesugarCollections.unmodifiableList(this.annotation_);
            this.bitField0_ &= -262145;
        }
        ahhcVar.annotation_ = this.annotation_;
        if ((i & 524288) == 524288) {
            i2 |= 64;
        }
        ahhcVar.typeTable_ = this.typeTable_;
        if ((this.bitField0_ & 1048576) == 1048576) {
            this.versionRequirement_ = DesugarCollections.unmodifiableList(this.versionRequirement_);
            this.bitField0_ &= -1048577;
        }
        ahhcVar.versionRequirement_ = this.versionRequirement_;
        if ((i & 2097152) == 2097152) {
            i2 |= 128;
        }
        ahhcVar.versionRequirementTable_ = this.versionRequirementTable_;
        if ((this.bitField0_ & 4194304) == 4194304) {
            this.compilerPluginData_ = DesugarCollections.unmodifiableList(this.compilerPluginData_);
            this.bitField0_ &= -4194305;
        }
        ahhcVar.compilerPluginData_ = this.compilerPluginData_;
        ahhcVar.bitField0_ = i2;
        return ahhcVar;
    }

    @Override // defpackage.ahol, defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public ahgz mo86clone() {
        ahgz ahgzVarCreate = create();
        ahgzVarCreate.mergeFrom(buildPartial());
        return ahgzVarCreate;
    }

    public ahgx getAnnotation(int i) {
        return this.annotation_.get(i);
    }

    public int getAnnotationCount() {
        return this.annotation_.size();
    }

    public ahhf getCompilerPluginData(int i) {
        return this.compilerPluginData_.get(i);
    }

    public int getCompilerPluginDataCount() {
        return this.compilerPluginData_.size();
    }

    public ahhi getConstructor(int i) {
        return this.constructor_.get(i);
    }

    public int getConstructorCount() {
        return this.constructor_.size();
    }

    public ahjn getContextReceiverType(int i) {
        return this.contextReceiverType_.get(i);
    }

    public int getContextReceiverTypeCount() {
        return this.contextReceiverType_.size();
    }

    @Override // defpackage.ahok, defpackage.ahph
    public ahhc getDefaultInstanceForType() {
        return ahhc.getDefaultInstance();
    }

    public ahhx getEnumEntry(int i) {
        return this.enumEntry_.get(i);
    }

    public int getEnumEntryCount() {
        return this.enumEntry_.size();
    }

    public ahif getFunction(int i) {
        return this.function_.get(i);
    }

    public int getFunctionCount() {
        return this.function_.size();
    }

    public ahjn getInlineClassUnderlyingType() {
        return this.inlineClassUnderlyingType_;
    }

    public ahis getProperty(int i) {
        return this.property_.get(i);
    }

    public int getPropertyCount() {
        return this.property_.size();
    }

    public ahjn getSupertype(int i) {
        return this.supertype_.get(i);
    }

    public int getSupertypeCount() {
        return this.supertype_.size();
    }

    public ahjq getTypeAlias(int i) {
        return this.typeAlias_.get(i);
    }

    public int getTypeAliasCount() {
        return this.typeAlias_.size();
    }

    public ahjv getTypeParameter(int i) {
        return this.typeParameter_.get(i);
    }

    public int getTypeParameterCount() {
        return this.typeParameter_.size();
    }

    public ahjy getTypeTable() {
        return this.typeTable_;
    }

    public boolean hasFqName() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasInlineClassUnderlyingType() {
        return (this.bitField0_ & 65536) == 65536;
    }

    public boolean hasTypeTable() {
        return (this.bitField0_ & 524288) == 524288;
    }

    @Override // defpackage.ahph
    public final boolean isInitialized() {
        if (!hasFqName()) {
            return false;
        }
        for (int i = 0; i < getTypeParameterCount(); i++) {
            if (!getTypeParameter(i).isInitialized()) {
                return false;
            }
        }
        for (int i2 = 0; i2 < getSupertypeCount(); i2++) {
            if (!getSupertype(i2).isInitialized()) {
                return false;
            }
        }
        for (int i3 = 0; i3 < getContextReceiverTypeCount(); i3++) {
            if (!getContextReceiverType(i3).isInitialized()) {
                return false;
            }
        }
        for (int i4 = 0; i4 < getConstructorCount(); i4++) {
            if (!getConstructor(i4).isInitialized()) {
                return false;
            }
        }
        for (int i5 = 0; i5 < getFunctionCount(); i5++) {
            if (!getFunction(i5).isInitialized()) {
                return false;
            }
        }
        for (int i6 = 0; i6 < getPropertyCount(); i6++) {
            if (!getProperty(i6).isInitialized()) {
                return false;
            }
        }
        for (int i7 = 0; i7 < getTypeAliasCount(); i7++) {
            if (!getTypeAlias(i7).isInitialized()) {
                return false;
            }
        }
        for (int i8 = 0; i8 < getEnumEntryCount(); i8++) {
            if (!getEnumEntry(i8).isInitialized()) {
                return false;
            }
        }
        if (hasInlineClassUnderlyingType() && !getInlineClassUnderlyingType().isInitialized()) {
            return false;
        }
        for (int i9 = 0; i9 < getAnnotationCount(); i9++) {
            if (!getAnnotation(i9).isInitialized()) {
                return false;
            }
        }
        if (hasTypeTable() && !getTypeTable().isInitialized()) {
            return false;
        }
        for (int i10 = 0; i10 < getCompilerPluginDataCount(); i10++) {
            if (!getCompilerPluginData(i10).isInitialized()) {
                return false;
            }
        }
        return extensionsAreInitialized();
    }

    public ahgz mergeFrom(ahhc ahhcVar) {
        if (ahhcVar == ahhc.getDefaultInstance()) {
            return this;
        }
        if (ahhcVar.hasFlags()) {
            setFlags(ahhcVar.getFlags());
        }
        if (ahhcVar.hasFqName()) {
            setFqName(ahhcVar.getFqName());
        }
        if (ahhcVar.hasCompanionObjectName()) {
            setCompanionObjectName(ahhcVar.getCompanionObjectName());
        }
        if (!ahhcVar.typeParameter_.isEmpty()) {
            if (this.typeParameter_.isEmpty()) {
                this.typeParameter_ = ahhcVar.typeParameter_;
                this.bitField0_ &= -9;
            } else {
                ensureTypeParameterIsMutable();
                this.typeParameter_.addAll(ahhcVar.typeParameter_);
            }
        }
        if (!ahhcVar.supertype_.isEmpty()) {
            if (this.supertype_.isEmpty()) {
                this.supertype_ = ahhcVar.supertype_;
                this.bitField0_ &= -17;
            } else {
                ensureSupertypeIsMutable();
                this.supertype_.addAll(ahhcVar.supertype_);
            }
        }
        if (!ahhcVar.supertypeId_.isEmpty()) {
            if (this.supertypeId_.isEmpty()) {
                this.supertypeId_ = ahhcVar.supertypeId_;
                this.bitField0_ &= -33;
            } else {
                ensureSupertypeIdIsMutable();
                this.supertypeId_.addAll(ahhcVar.supertypeId_);
            }
        }
        if (!ahhcVar.nestedClassName_.isEmpty()) {
            if (this.nestedClassName_.isEmpty()) {
                this.nestedClassName_ = ahhcVar.nestedClassName_;
                this.bitField0_ &= -65;
            } else {
                ensureNestedClassNameIsMutable();
                this.nestedClassName_.addAll(ahhcVar.nestedClassName_);
            }
        }
        if (!ahhcVar.contextReceiverType_.isEmpty()) {
            if (this.contextReceiverType_.isEmpty()) {
                this.contextReceiverType_ = ahhcVar.contextReceiverType_;
                this.bitField0_ &= -129;
            } else {
                ensureContextReceiverTypeIsMutable();
                this.contextReceiverType_.addAll(ahhcVar.contextReceiverType_);
            }
        }
        if (!ahhcVar.contextReceiverTypeId_.isEmpty()) {
            if (this.contextReceiverTypeId_.isEmpty()) {
                this.contextReceiverTypeId_ = ahhcVar.contextReceiverTypeId_;
                this.bitField0_ &= -257;
            } else {
                ensureContextReceiverTypeIdIsMutable();
                this.contextReceiverTypeId_.addAll(ahhcVar.contextReceiverTypeId_);
            }
        }
        if (!ahhcVar.constructor_.isEmpty()) {
            if (this.constructor_.isEmpty()) {
                this.constructor_ = ahhcVar.constructor_;
                this.bitField0_ &= -513;
            } else {
                ensureConstructorIsMutable();
                this.constructor_.addAll(ahhcVar.constructor_);
            }
        }
        if (!ahhcVar.function_.isEmpty()) {
            if (this.function_.isEmpty()) {
                this.function_ = ahhcVar.function_;
                this.bitField0_ &= -1025;
            } else {
                ensureFunctionIsMutable();
                this.function_.addAll(ahhcVar.function_);
            }
        }
        if (!ahhcVar.property_.isEmpty()) {
            if (this.property_.isEmpty()) {
                this.property_ = ahhcVar.property_;
                this.bitField0_ &= -2049;
            } else {
                ensurePropertyIsMutable();
                this.property_.addAll(ahhcVar.property_);
            }
        }
        if (!ahhcVar.typeAlias_.isEmpty()) {
            if (this.typeAlias_.isEmpty()) {
                this.typeAlias_ = ahhcVar.typeAlias_;
                this.bitField0_ &= -4097;
            } else {
                ensureTypeAliasIsMutable();
                this.typeAlias_.addAll(ahhcVar.typeAlias_);
            }
        }
        if (!ahhcVar.enumEntry_.isEmpty()) {
            if (this.enumEntry_.isEmpty()) {
                this.enumEntry_ = ahhcVar.enumEntry_;
                this.bitField0_ &= -8193;
            } else {
                ensureEnumEntryIsMutable();
                this.enumEntry_.addAll(ahhcVar.enumEntry_);
            }
        }
        if (!ahhcVar.sealedSubclassFqName_.isEmpty()) {
            if (this.sealedSubclassFqName_.isEmpty()) {
                this.sealedSubclassFqName_ = ahhcVar.sealedSubclassFqName_;
                this.bitField0_ &= -16385;
            } else {
                ensureSealedSubclassFqNameIsMutable();
                this.sealedSubclassFqName_.addAll(ahhcVar.sealedSubclassFqName_);
            }
        }
        if (ahhcVar.hasInlineClassUnderlyingPropertyName()) {
            setInlineClassUnderlyingPropertyName(ahhcVar.getInlineClassUnderlyingPropertyName());
        }
        if (ahhcVar.hasInlineClassUnderlyingType()) {
            mergeInlineClassUnderlyingType(ahhcVar.getInlineClassUnderlyingType());
        }
        if (ahhcVar.hasInlineClassUnderlyingTypeId()) {
            setInlineClassUnderlyingTypeId(ahhcVar.getInlineClassUnderlyingTypeId());
        }
        if (!ahhcVar.annotation_.isEmpty()) {
            if (this.annotation_.isEmpty()) {
                this.annotation_ = ahhcVar.annotation_;
                this.bitField0_ &= -262145;
            } else {
                ensureAnnotationIsMutable();
                this.annotation_.addAll(ahhcVar.annotation_);
            }
        }
        if (ahhcVar.hasTypeTable()) {
            mergeTypeTable(ahhcVar.getTypeTable());
        }
        if (!ahhcVar.versionRequirement_.isEmpty()) {
            if (this.versionRequirement_.isEmpty()) {
                this.versionRequirement_ = ahhcVar.versionRequirement_;
                this.bitField0_ &= -1048577;
            } else {
                ensureVersionRequirementIsMutable();
                this.versionRequirement_.addAll(ahhcVar.versionRequirement_);
            }
        }
        if (ahhcVar.hasVersionRequirementTable()) {
            mergeVersionRequirementTable(ahhcVar.getVersionRequirementTable());
        }
        if (!ahhcVar.compilerPluginData_.isEmpty()) {
            if (this.compilerPluginData_.isEmpty()) {
                this.compilerPluginData_ = ahhcVar.compilerPluginData_;
                this.bitField0_ &= -4194305;
            } else {
                ensureCompilerPluginDataIsMutable();
                this.compilerPluginData_.addAll(ahhcVar.compilerPluginData_);
            }
        }
        mergeExtensionFields(ahhcVar);
        setUnknownFields(getUnknownFields().concat(ahhcVar.unknownFields));
        return this;
    }

    public ahgz mergeInlineClassUnderlyingType(ahjn ahjnVar) {
        if ((this.bitField0_ & 65536) == 65536 && this.inlineClassUnderlyingType_ != ahjn.getDefaultInstance()) {
            ahjm ahjmVarNewBuilder = ahjn.newBuilder(this.inlineClassUnderlyingType_);
            ahjmVarNewBuilder.mergeFrom(ahjnVar);
            ahjnVar = ahjmVarNewBuilder.buildPartial();
        }
        this.inlineClassUnderlyingType_ = ahjnVar;
        this.bitField0_ |= 65536;
        return this;
    }

    public ahgz mergeTypeTable(ahjy ahjyVar) {
        if ((this.bitField0_ & 524288) == 524288 && this.typeTable_ != ahjy.getDefaultInstance()) {
            ahjx ahjxVarNewBuilder = ahjy.newBuilder(this.typeTable_);
            ahjxVarNewBuilder.mergeFrom(ahjyVar);
            ahjyVar = ahjxVarNewBuilder.buildPartial();
        }
        this.typeTable_ = ahjyVar;
        this.bitField0_ |= 524288;
        return this;
    }

    public ahgz mergeVersionRequirementTable(ahkl ahklVar) {
        if ((this.bitField0_ & 2097152) == 2097152 && this.versionRequirementTable_ != ahkl.getDefaultInstance()) {
            ahkk ahkkVarNewBuilder = ahkl.newBuilder(this.versionRequirementTable_);
            ahkkVarNewBuilder.mergeFrom(ahklVar);
            ahklVar = ahkkVarNewBuilder.buildPartial();
        }
        this.versionRequirementTable_ = ahklVar;
        this.bitField0_ |= 2097152;
        return this;
    }

    public ahgz setCompanionObjectName(int i) {
        this.bitField0_ |= 4;
        this.companionObjectName_ = i;
        return this;
    }

    public ahgz setFlags(int i) {
        this.bitField0_ |= 1;
        this.flags_ = i;
        return this;
    }

    public ahgz setFqName(int i) {
        this.bitField0_ |= 2;
        this.fqName_ = i;
        return this;
    }

    public ahgz setInlineClassUnderlyingPropertyName(int i) {
        this.bitField0_ |= 32768;
        this.inlineClassUnderlyingPropertyName_ = i;
        return this;
    }

    public ahgz setInlineClassUnderlyingTypeId(int i) {
        this.bitField0_ |= 131072;
        this.inlineClassUnderlyingTypeId_ = i;
        return this;
    }

    private void maybeForceBuilderInitialization() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
    @Override // defpackage.ahns, defpackage.ahpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ahgz mergeFrom(defpackage.ahoc r2, defpackage.ahog r3) throws java.lang.Throwable {
        /*
            r1 = this;
            ahpi<ahhc> r0 = defpackage.ahhc.PARSER     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            ahhc r2 = (defpackage.ahhc) r2     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            if (r2 == 0) goto Ld
            r1.mergeFrom(r2)
        Ld:
            return r1
        Le:
            r2 = move-exception
            goto L1a
        L10:
            r2 = move-exception
            ahpg r3 = r2.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Le
            ahhc r3 = (defpackage.ahhc) r3     // Catch: java.lang.Throwable -> Le
            throw r2     // Catch: java.lang.Throwable -> L18
        L18:
            r2 = move-exception
            goto L1b
        L1a:
            r3 = 0
        L1b:
            if (r3 == 0) goto L20
            r1.mergeFrom(r3)
        L20:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahgz.mergeFrom(ahoc, ahog):ahgz");
    }

    @Override // defpackage.ahns, defpackage.ahpf
    public /* bridge */ /* synthetic */ ahns mergeFrom(ahoc ahocVar, ahog ahogVar) throws Throwable {
        mergeFrom(ahocVar, ahogVar);
        return this;
    }

    @Override // defpackage.ahns, defpackage.ahpf
    public /* bridge */ /* synthetic */ ahpf mergeFrom(ahoc ahocVar, ahog ahogVar) throws Throwable {
        mergeFrom(ahocVar, ahogVar);
        return this;
    }

    @Override // defpackage.ahok
    public /* bridge */ /* synthetic */ ahok mergeFrom(ahoq ahoqVar) {
        mergeFrom((ahhc) ahoqVar);
        return this;
    }
}
