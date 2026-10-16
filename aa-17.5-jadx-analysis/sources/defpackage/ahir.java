package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahir extends ahol<ahis, ahir> implements ahph {
    private int bitField0_;
    private int getterFlags_;
    private int name_;
    private int receiverTypeId_;
    private int returnTypeId_;
    private int setterFlags_;
    private int flags_ = 518;
    private int oldFlags_ = 2054;
    private ahjn returnType_ = ahjn.getDefaultInstance();
    private List<ahjv> typeParameter_ = Collections.EMPTY_LIST;
    private ahjn receiverType_ = ahjn.getDefaultInstance();
    private List<ahjn> contextReceiverType_ = Collections.EMPTY_LIST;
    private List<Integer> contextReceiverTypeId_ = Collections.EMPTY_LIST;
    private List<ahkb> contextParameter_ = Collections.EMPTY_LIST;
    private ahkb setterValueParameter_ = ahkb.getDefaultInstance();
    private List<Integer> versionRequirement_ = Collections.EMPTY_LIST;
    private List<ahhf> compilerPluginData_ = Collections.EMPTY_LIST;
    private List<ahgx> annotation_ = Collections.EMPTY_LIST;
    private List<ahgx> getterAnnotation_ = Collections.EMPTY_LIST;
    private List<ahgx> setterAnnotation_ = Collections.EMPTY_LIST;
    private List<ahgx> extensionReceiverAnnotation_ = Collections.EMPTY_LIST;
    private List<ahgx> backingFieldAnnotation_ = Collections.EMPTY_LIST;
    private List<ahgx> delegateFieldAnnotation_ = Collections.EMPTY_LIST;
    private ahhl getterContract_ = ahhl.getDefaultInstance();
    private ahhl setterContract_ = ahhl.getDefaultInstance();

    private ahir() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ahir create() {
        return new ahir();
    }

    private void ensureAnnotationIsMutable() {
        if ((this.bitField0_ & 65536) != 65536) {
            this.annotation_ = new ArrayList(this.annotation_);
            this.bitField0_ |= 65536;
        }
    }

    private void ensureBackingFieldAnnotationIsMutable() {
        if ((this.bitField0_ & 1048576) != 1048576) {
            this.backingFieldAnnotation_ = new ArrayList(this.backingFieldAnnotation_);
            this.bitField0_ |= 1048576;
        }
    }

    private void ensureCompilerPluginDataIsMutable() {
        if ((this.bitField0_ & 32768) != 32768) {
            this.compilerPluginData_ = new ArrayList(this.compilerPluginData_);
            this.bitField0_ |= 32768;
        }
    }

    private void ensureContextParameterIsMutable() {
        if ((this.bitField0_ & 1024) != 1024) {
            this.contextParameter_ = new ArrayList(this.contextParameter_);
            this.bitField0_ |= 1024;
        }
    }

    private void ensureContextReceiverTypeIdIsMutable() {
        if ((this.bitField0_ & sk.AUDIO_CONTENT_BUFFER_SIZE) != 512) {
            this.contextReceiverTypeId_ = new ArrayList(this.contextReceiverTypeId_);
            this.bitField0_ |= sk.AUDIO_CONTENT_BUFFER_SIZE;
        }
    }

    private void ensureContextReceiverTypeIsMutable() {
        if ((this.bitField0_ & 256) != 256) {
            this.contextReceiverType_ = new ArrayList(this.contextReceiverType_);
            this.bitField0_ |= 256;
        }
    }

    private void ensureDelegateFieldAnnotationIsMutable() {
        if ((this.bitField0_ & 2097152) != 2097152) {
            this.delegateFieldAnnotation_ = new ArrayList(this.delegateFieldAnnotation_);
            this.bitField0_ |= 2097152;
        }
    }

    private void ensureExtensionReceiverAnnotationIsMutable() {
        if ((this.bitField0_ & 524288) != 524288) {
            this.extensionReceiverAnnotation_ = new ArrayList(this.extensionReceiverAnnotation_);
            this.bitField0_ |= 524288;
        }
    }

    private void ensureGetterAnnotationIsMutable() {
        if ((this.bitField0_ & 131072) != 131072) {
            this.getterAnnotation_ = new ArrayList(this.getterAnnotation_);
            this.bitField0_ |= 131072;
        }
    }

    private void ensureSetterAnnotationIsMutable() {
        if ((this.bitField0_ & 262144) != 262144) {
            this.setterAnnotation_ = new ArrayList(this.setterAnnotation_);
            this.bitField0_ |= 262144;
        }
    }

    private void ensureTypeParameterIsMutable() {
        if ((this.bitField0_ & 32) != 32) {
            this.typeParameter_ = new ArrayList(this.typeParameter_);
            this.bitField0_ |= 32;
        }
    }

    private void ensureVersionRequirementIsMutable() {
        if ((this.bitField0_ & 16384) != 16384) {
            this.versionRequirement_ = new ArrayList(this.versionRequirement_);
            this.bitField0_ |= 16384;
        }
    }

    public ahir addAllAnnotation(Iterable<? extends ahgx> iterable) {
        ensureAnnotationIsMutable();
        ahns.addAll(iterable, this.annotation_);
        return this;
    }

    public ahir addAllBackingFieldAnnotation(Iterable<? extends ahgx> iterable) {
        ensureBackingFieldAnnotationIsMutable();
        ahns.addAll(iterable, this.backingFieldAnnotation_);
        return this;
    }

    public ahir addAllCompilerPluginData(Iterable<? extends ahhf> iterable) {
        ensureCompilerPluginDataIsMutable();
        ahns.addAll(iterable, this.compilerPluginData_);
        return this;
    }

    public ahir addAllContextParameter(Iterable<? extends ahkb> iterable) {
        ensureContextParameterIsMutable();
        ahns.addAll(iterable, this.contextParameter_);
        return this;
    }

    public ahir addAllContextReceiverType(Iterable<? extends ahjn> iterable) {
        ensureContextReceiverTypeIsMutable();
        ahns.addAll(iterable, this.contextReceiverType_);
        return this;
    }

    public ahir addAllDelegateFieldAnnotation(Iterable<? extends ahgx> iterable) {
        ensureDelegateFieldAnnotationIsMutable();
        ahns.addAll(iterable, this.delegateFieldAnnotation_);
        return this;
    }

    public ahir addAllExtensionReceiverAnnotation(Iterable<? extends ahgx> iterable) {
        ensureExtensionReceiverAnnotationIsMutable();
        ahns.addAll(iterable, this.extensionReceiverAnnotation_);
        return this;
    }

    public ahir addAllGetterAnnotation(Iterable<? extends ahgx> iterable) {
        ensureGetterAnnotationIsMutable();
        ahns.addAll(iterable, this.getterAnnotation_);
        return this;
    }

    public ahir addAllSetterAnnotation(Iterable<? extends ahgx> iterable) {
        ensureSetterAnnotationIsMutable();
        ahns.addAll(iterable, this.setterAnnotation_);
        return this;
    }

    public ahir addAllVersionRequirement(Iterable<? extends Integer> iterable) {
        ensureVersionRequirementIsMutable();
        ahns.addAll(iterable, this.versionRequirement_);
        return this;
    }

    public ahir addTypeParameter(ahjv ahjvVar) {
        ahjvVar.getClass();
        ensureTypeParameterIsMutable();
        this.typeParameter_.add(ahjvVar);
        return this;
    }

    @Override // defpackage.ahpf
    public ahis build() {
        ahis ahisVarBuildPartial = buildPartial();
        if (ahisVarBuildPartial.isInitialized()) {
            return ahisVarBuildPartial;
        }
        throw newUninitializedMessageException(ahisVarBuildPartial);
    }

    public ahis buildPartial() {
        ahis ahisVar = new ahis(this, (ahgm) null);
        int i = this.bitField0_;
        int i2 = i & 1;
        ahisVar.flags_ = this.flags_;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ahisVar.oldFlags_ = this.oldFlags_;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        ahisVar.name_ = this.name_;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        ahisVar.returnType_ = this.returnType_;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        ahisVar.returnTypeId_ = this.returnTypeId_;
        if ((this.bitField0_ & 32) == 32) {
            this.typeParameter_ = DesugarCollections.unmodifiableList(this.typeParameter_);
            this.bitField0_ &= -33;
        }
        ahisVar.typeParameter_ = this.typeParameter_;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        ahisVar.receiverType_ = this.receiverType_;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        ahisVar.receiverTypeId_ = this.receiverTypeId_;
        if ((this.bitField0_ & 256) == 256) {
            this.contextReceiverType_ = DesugarCollections.unmodifiableList(this.contextReceiverType_);
            this.bitField0_ &= -257;
        }
        ahisVar.contextReceiverType_ = this.contextReceiverType_;
        if ((this.bitField0_ & sk.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            this.contextReceiverTypeId_ = DesugarCollections.unmodifiableList(this.contextReceiverTypeId_);
            this.bitField0_ &= -513;
        }
        ahisVar.contextReceiverTypeId_ = this.contextReceiverTypeId_;
        if ((this.bitField0_ & 1024) == 1024) {
            this.contextParameter_ = DesugarCollections.unmodifiableList(this.contextParameter_);
            this.bitField0_ &= -1025;
        }
        ahisVar.contextParameter_ = this.contextParameter_;
        if ((i & 2048) == 2048) {
            i2 |= 128;
        }
        ahisVar.setterValueParameter_ = this.setterValueParameter_;
        if ((i & 4096) == 4096) {
            i2 |= 256;
        }
        ahisVar.getterFlags_ = this.getterFlags_;
        if ((i & 8192) == 8192) {
            i2 |= sk.AUDIO_CONTENT_BUFFER_SIZE;
        }
        ahisVar.setterFlags_ = this.setterFlags_;
        if ((this.bitField0_ & 16384) == 16384) {
            this.versionRequirement_ = DesugarCollections.unmodifiableList(this.versionRequirement_);
            this.bitField0_ &= -16385;
        }
        ahisVar.versionRequirement_ = this.versionRequirement_;
        if ((this.bitField0_ & 32768) == 32768) {
            this.compilerPluginData_ = DesugarCollections.unmodifiableList(this.compilerPluginData_);
            this.bitField0_ &= -32769;
        }
        ahisVar.compilerPluginData_ = this.compilerPluginData_;
        if ((this.bitField0_ & 65536) == 65536) {
            this.annotation_ = DesugarCollections.unmodifiableList(this.annotation_);
            this.bitField0_ &= -65537;
        }
        ahisVar.annotation_ = this.annotation_;
        if ((this.bitField0_ & 131072) == 131072) {
            this.getterAnnotation_ = DesugarCollections.unmodifiableList(this.getterAnnotation_);
            this.bitField0_ &= -131073;
        }
        ahisVar.getterAnnotation_ = this.getterAnnotation_;
        if ((this.bitField0_ & 262144) == 262144) {
            this.setterAnnotation_ = DesugarCollections.unmodifiableList(this.setterAnnotation_);
            this.bitField0_ &= -262145;
        }
        ahisVar.setterAnnotation_ = this.setterAnnotation_;
        if ((this.bitField0_ & 524288) == 524288) {
            this.extensionReceiverAnnotation_ = DesugarCollections.unmodifiableList(this.extensionReceiverAnnotation_);
            this.bitField0_ &= -524289;
        }
        ahisVar.extensionReceiverAnnotation_ = this.extensionReceiverAnnotation_;
        if ((this.bitField0_ & 1048576) == 1048576) {
            this.backingFieldAnnotation_ = DesugarCollections.unmodifiableList(this.backingFieldAnnotation_);
            this.bitField0_ &= -1048577;
        }
        ahisVar.backingFieldAnnotation_ = this.backingFieldAnnotation_;
        if ((this.bitField0_ & 2097152) == 2097152) {
            this.delegateFieldAnnotation_ = DesugarCollections.unmodifiableList(this.delegateFieldAnnotation_);
            this.bitField0_ &= -2097153;
        }
        ahisVar.delegateFieldAnnotation_ = this.delegateFieldAnnotation_;
        if ((i & 4194304) == 4194304) {
            i2 |= 1024;
        }
        ahisVar.getterContract_ = this.getterContract_;
        if ((i & 8388608) == 8388608) {
            i2 |= 2048;
        }
        ahisVar.setterContract_ = this.setterContract_;
        ahisVar.bitField0_ = i2;
        return ahisVar;
    }

    @Override // defpackage.ahol, defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public ahir mo86clone() {
        ahir ahirVarCreate = create();
        ahirVarCreate.mergeFrom(buildPartial());
        return ahirVarCreate;
    }

    public ahgx getAnnotation(int i) {
        return this.annotation_.get(i);
    }

    public int getAnnotationCount() {
        return this.annotation_.size();
    }

    public ahgx getBackingFieldAnnotation(int i) {
        return this.backingFieldAnnotation_.get(i);
    }

    public int getBackingFieldAnnotationCount() {
        return this.backingFieldAnnotation_.size();
    }

    public ahhf getCompilerPluginData(int i) {
        return this.compilerPluginData_.get(i);
    }

    public int getCompilerPluginDataCount() {
        return this.compilerPluginData_.size();
    }

    public ahkb getContextParameter(int i) {
        return this.contextParameter_.get(i);
    }

    public int getContextParameterCount() {
        return this.contextParameter_.size();
    }

    public ahjn getContextReceiverType(int i) {
        return this.contextReceiverType_.get(i);
    }

    public int getContextReceiverTypeCount() {
        return this.contextReceiverType_.size();
    }

    @Override // defpackage.ahok, defpackage.ahph
    public ahis getDefaultInstanceForType() {
        return ahis.getDefaultInstance();
    }

    public ahgx getDelegateFieldAnnotation(int i) {
        return this.delegateFieldAnnotation_.get(i);
    }

    public int getDelegateFieldAnnotationCount() {
        return this.delegateFieldAnnotation_.size();
    }

    public ahgx getExtensionReceiverAnnotation(int i) {
        return this.extensionReceiverAnnotation_.get(i);
    }

    public int getExtensionReceiverAnnotationCount() {
        return this.extensionReceiverAnnotation_.size();
    }

    public ahgx getGetterAnnotation(int i) {
        return this.getterAnnotation_.get(i);
    }

    public int getGetterAnnotationCount() {
        return this.getterAnnotation_.size();
    }

    public ahhl getGetterContract() {
        return this.getterContract_;
    }

    public ahjn getReceiverType() {
        return this.receiverType_;
    }

    public ahjn getReturnType() {
        return this.returnType_;
    }

    public ahgx getSetterAnnotation(int i) {
        return this.setterAnnotation_.get(i);
    }

    public int getSetterAnnotationCount() {
        return this.setterAnnotation_.size();
    }

    public ahhl getSetterContract() {
        return this.setterContract_;
    }

    public ahkb getSetterValueParameter() {
        return this.setterValueParameter_;
    }

    public ahjv getTypeParameter(int i) {
        return this.typeParameter_.get(i);
    }

    public int getTypeParameterCount() {
        return this.typeParameter_.size();
    }

    public boolean hasGetterContract() {
        return (this.bitField0_ & 4194304) == 4194304;
    }

    public boolean hasName() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasReceiverType() {
        return (this.bitField0_ & 64) == 64;
    }

    public boolean hasReturnType() {
        return (this.bitField0_ & 8) == 8;
    }

    public boolean hasSetterContract() {
        return (this.bitField0_ & 8388608) == 8388608;
    }

    public boolean hasSetterValueParameter() {
        return (this.bitField0_ & 2048) == 2048;
    }

    @Override // defpackage.ahph
    public final boolean isInitialized() {
        if (!hasName()) {
            return false;
        }
        if (hasReturnType() && !getReturnType().isInitialized()) {
            return false;
        }
        for (int i = 0; i < getTypeParameterCount(); i++) {
            if (!getTypeParameter(i).isInitialized()) {
                return false;
            }
        }
        if (hasReceiverType() && !getReceiverType().isInitialized()) {
            return false;
        }
        for (int i2 = 0; i2 < getContextReceiverTypeCount(); i2++) {
            if (!getContextReceiverType(i2).isInitialized()) {
                return false;
            }
        }
        for (int i3 = 0; i3 < getContextParameterCount(); i3++) {
            if (!getContextParameter(i3).isInitialized()) {
                return false;
            }
        }
        if (hasSetterValueParameter() && !getSetterValueParameter().isInitialized()) {
            return false;
        }
        for (int i4 = 0; i4 < getCompilerPluginDataCount(); i4++) {
            if (!getCompilerPluginData(i4).isInitialized()) {
                return false;
            }
        }
        for (int i5 = 0; i5 < getAnnotationCount(); i5++) {
            if (!getAnnotation(i5).isInitialized()) {
                return false;
            }
        }
        for (int i6 = 0; i6 < getGetterAnnotationCount(); i6++) {
            if (!getGetterAnnotation(i6).isInitialized()) {
                return false;
            }
        }
        for (int i7 = 0; i7 < getSetterAnnotationCount(); i7++) {
            if (!getSetterAnnotation(i7).isInitialized()) {
                return false;
            }
        }
        for (int i8 = 0; i8 < getExtensionReceiverAnnotationCount(); i8++) {
            if (!getExtensionReceiverAnnotation(i8).isInitialized()) {
                return false;
            }
        }
        for (int i9 = 0; i9 < getBackingFieldAnnotationCount(); i9++) {
            if (!getBackingFieldAnnotation(i9).isInitialized()) {
                return false;
            }
        }
        for (int i10 = 0; i10 < getDelegateFieldAnnotationCount(); i10++) {
            if (!getDelegateFieldAnnotation(i10).isInitialized()) {
                return false;
            }
        }
        if (!hasGetterContract() || getGetterContract().isInitialized()) {
            return (!hasSetterContract() || getSetterContract().isInitialized()) && extensionsAreInitialized();
        }
        return false;
    }

    public ahir mergeFrom(ahis ahisVar) {
        if (ahisVar == ahis.getDefaultInstance()) {
            return this;
        }
        if (ahisVar.hasFlags()) {
            setFlags(ahisVar.getFlags());
        }
        if (ahisVar.hasOldFlags()) {
            setOldFlags(ahisVar.getOldFlags());
        }
        if (ahisVar.hasName()) {
            setName(ahisVar.getName());
        }
        if (ahisVar.hasReturnType()) {
            mergeReturnType(ahisVar.getReturnType());
        }
        if (ahisVar.hasReturnTypeId()) {
            setReturnTypeId(ahisVar.getReturnTypeId());
        }
        if (!ahisVar.typeParameter_.isEmpty()) {
            if (this.typeParameter_.isEmpty()) {
                this.typeParameter_ = ahisVar.typeParameter_;
                this.bitField0_ &= -33;
            } else {
                ensureTypeParameterIsMutable();
                this.typeParameter_.addAll(ahisVar.typeParameter_);
            }
        }
        if (ahisVar.hasReceiverType()) {
            mergeReceiverType(ahisVar.getReceiverType());
        }
        if (ahisVar.hasReceiverTypeId()) {
            setReceiverTypeId(ahisVar.getReceiverTypeId());
        }
        if (!ahisVar.contextReceiverType_.isEmpty()) {
            if (this.contextReceiverType_.isEmpty()) {
                this.contextReceiverType_ = ahisVar.contextReceiverType_;
                this.bitField0_ &= -257;
            } else {
                ensureContextReceiverTypeIsMutable();
                this.contextReceiverType_.addAll(ahisVar.contextReceiverType_);
            }
        }
        if (!ahisVar.contextReceiverTypeId_.isEmpty()) {
            if (this.contextReceiverTypeId_.isEmpty()) {
                this.contextReceiverTypeId_ = ahisVar.contextReceiverTypeId_;
                this.bitField0_ &= -513;
            } else {
                ensureContextReceiverTypeIdIsMutable();
                this.contextReceiverTypeId_.addAll(ahisVar.contextReceiverTypeId_);
            }
        }
        if (!ahisVar.contextParameter_.isEmpty()) {
            if (this.contextParameter_.isEmpty()) {
                this.contextParameter_ = ahisVar.contextParameter_;
                this.bitField0_ &= -1025;
            } else {
                ensureContextParameterIsMutable();
                this.contextParameter_.addAll(ahisVar.contextParameter_);
            }
        }
        if (ahisVar.hasSetterValueParameter()) {
            mergeSetterValueParameter(ahisVar.getSetterValueParameter());
        }
        if (ahisVar.hasGetterFlags()) {
            setGetterFlags(ahisVar.getGetterFlags());
        }
        if (ahisVar.hasSetterFlags()) {
            setSetterFlags(ahisVar.getSetterFlags());
        }
        if (!ahisVar.versionRequirement_.isEmpty()) {
            if (this.versionRequirement_.isEmpty()) {
                this.versionRequirement_ = ahisVar.versionRequirement_;
                this.bitField0_ &= -16385;
            } else {
                ensureVersionRequirementIsMutable();
                this.versionRequirement_.addAll(ahisVar.versionRequirement_);
            }
        }
        if (!ahisVar.compilerPluginData_.isEmpty()) {
            if (this.compilerPluginData_.isEmpty()) {
                this.compilerPluginData_ = ahisVar.compilerPluginData_;
                this.bitField0_ &= -32769;
            } else {
                ensureCompilerPluginDataIsMutable();
                this.compilerPluginData_.addAll(ahisVar.compilerPluginData_);
            }
        }
        if (!ahisVar.annotation_.isEmpty()) {
            if (this.annotation_.isEmpty()) {
                this.annotation_ = ahisVar.annotation_;
                this.bitField0_ &= -65537;
            } else {
                ensureAnnotationIsMutable();
                this.annotation_.addAll(ahisVar.annotation_);
            }
        }
        if (!ahisVar.getterAnnotation_.isEmpty()) {
            if (this.getterAnnotation_.isEmpty()) {
                this.getterAnnotation_ = ahisVar.getterAnnotation_;
                this.bitField0_ &= -131073;
            } else {
                ensureGetterAnnotationIsMutable();
                this.getterAnnotation_.addAll(ahisVar.getterAnnotation_);
            }
        }
        if (!ahisVar.setterAnnotation_.isEmpty()) {
            if (this.setterAnnotation_.isEmpty()) {
                this.setterAnnotation_ = ahisVar.setterAnnotation_;
                this.bitField0_ &= -262145;
            } else {
                ensureSetterAnnotationIsMutable();
                this.setterAnnotation_.addAll(ahisVar.setterAnnotation_);
            }
        }
        if (!ahisVar.extensionReceiverAnnotation_.isEmpty()) {
            if (this.extensionReceiverAnnotation_.isEmpty()) {
                this.extensionReceiverAnnotation_ = ahisVar.extensionReceiverAnnotation_;
                this.bitField0_ &= -524289;
            } else {
                ensureExtensionReceiverAnnotationIsMutable();
                this.extensionReceiverAnnotation_.addAll(ahisVar.extensionReceiverAnnotation_);
            }
        }
        if (!ahisVar.backingFieldAnnotation_.isEmpty()) {
            if (this.backingFieldAnnotation_.isEmpty()) {
                this.backingFieldAnnotation_ = ahisVar.backingFieldAnnotation_;
                this.bitField0_ &= -1048577;
            } else {
                ensureBackingFieldAnnotationIsMutable();
                this.backingFieldAnnotation_.addAll(ahisVar.backingFieldAnnotation_);
            }
        }
        if (!ahisVar.delegateFieldAnnotation_.isEmpty()) {
            if (this.delegateFieldAnnotation_.isEmpty()) {
                this.delegateFieldAnnotation_ = ahisVar.delegateFieldAnnotation_;
                this.bitField0_ &= -2097153;
            } else {
                ensureDelegateFieldAnnotationIsMutable();
                this.delegateFieldAnnotation_.addAll(ahisVar.delegateFieldAnnotation_);
            }
        }
        if (ahisVar.hasGetterContract()) {
            mergeGetterContract(ahisVar.getGetterContract());
        }
        if (ahisVar.hasSetterContract()) {
            mergeSetterContract(ahisVar.getSetterContract());
        }
        mergeExtensionFields(ahisVar);
        setUnknownFields(getUnknownFields().concat(ahisVar.unknownFields));
        return this;
    }

    public ahir mergeGetterContract(ahhl ahhlVar) {
        if ((this.bitField0_ & 4194304) == 4194304 && this.getterContract_ != ahhl.getDefaultInstance()) {
            ahhk ahhkVarNewBuilder = ahhl.newBuilder(this.getterContract_);
            ahhkVarNewBuilder.mergeFrom(ahhlVar);
            ahhlVar = ahhkVarNewBuilder.buildPartial();
        }
        this.getterContract_ = ahhlVar;
        this.bitField0_ |= 4194304;
        return this;
    }

    public ahir mergeReceiverType(ahjn ahjnVar) {
        if ((this.bitField0_ & 64) == 64 && this.receiverType_ != ahjn.getDefaultInstance()) {
            ahjm ahjmVarNewBuilder = ahjn.newBuilder(this.receiverType_);
            ahjmVarNewBuilder.mergeFrom(ahjnVar);
            ahjnVar = ahjmVarNewBuilder.buildPartial();
        }
        this.receiverType_ = ahjnVar;
        this.bitField0_ |= 64;
        return this;
    }

    public ahir mergeReturnType(ahjn ahjnVar) {
        if ((this.bitField0_ & 8) == 8 && this.returnType_ != ahjn.getDefaultInstance()) {
            ahjm ahjmVarNewBuilder = ahjn.newBuilder(this.returnType_);
            ahjmVarNewBuilder.mergeFrom(ahjnVar);
            ahjnVar = ahjmVarNewBuilder.buildPartial();
        }
        this.returnType_ = ahjnVar;
        this.bitField0_ |= 8;
        return this;
    }

    public ahir mergeSetterContract(ahhl ahhlVar) {
        if ((this.bitField0_ & 8388608) == 8388608 && this.setterContract_ != ahhl.getDefaultInstance()) {
            ahhk ahhkVarNewBuilder = ahhl.newBuilder(this.setterContract_);
            ahhkVarNewBuilder.mergeFrom(ahhlVar);
            ahhlVar = ahhkVarNewBuilder.buildPartial();
        }
        this.setterContract_ = ahhlVar;
        this.bitField0_ |= 8388608;
        return this;
    }

    public ahir mergeSetterValueParameter(ahkb ahkbVar) {
        if ((this.bitField0_ & 2048) == 2048 && this.setterValueParameter_ != ahkb.getDefaultInstance()) {
            ahka ahkaVarNewBuilder = ahkb.newBuilder(this.setterValueParameter_);
            ahkaVarNewBuilder.mergeFrom(ahkbVar);
            ahkbVar = ahkaVarNewBuilder.buildPartial();
        }
        this.setterValueParameter_ = ahkbVar;
        this.bitField0_ |= 2048;
        return this;
    }

    public ahir setFlags(int i) {
        this.bitField0_ |= 1;
        this.flags_ = i;
        return this;
    }

    public ahir setGetterFlags(int i) {
        this.bitField0_ |= 4096;
        this.getterFlags_ = i;
        return this;
    }

    public ahir setName(int i) {
        this.bitField0_ |= 4;
        this.name_ = i;
        return this;
    }

    public ahir setOldFlags(int i) {
        this.bitField0_ |= 2;
        this.oldFlags_ = i;
        return this;
    }

    public ahir setReceiverType(ahjn ahjnVar) {
        ahjnVar.getClass();
        this.receiverType_ = ahjnVar;
        this.bitField0_ |= 64;
        return this;
    }

    public ahir setReceiverTypeId(int i) {
        this.bitField0_ |= 128;
        this.receiverTypeId_ = i;
        return this;
    }

    public ahir setReturnType(ahjn ahjnVar) {
        ahjnVar.getClass();
        this.returnType_ = ahjnVar;
        this.bitField0_ |= 8;
        return this;
    }

    public ahir setReturnTypeId(int i) {
        this.bitField0_ |= 16;
        this.returnTypeId_ = i;
        return this;
    }

    public ahir setSetterFlags(int i) {
        this.bitField0_ |= 8192;
        this.setterFlags_ = i;
        return this;
    }

    public ahir setSetterValueParameter(ahkb ahkbVar) {
        ahkbVar.getClass();
        this.setterValueParameter_ = ahkbVar;
        this.bitField0_ |= 2048;
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
    public defpackage.ahir mergeFrom(defpackage.ahoc r2, defpackage.ahog r3) throws java.lang.Throwable {
        /*
            r1 = this;
            ahpi<ahis> r0 = defpackage.ahis.PARSER     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            ahis r2 = (defpackage.ahis) r2     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
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
            ahis r3 = (defpackage.ahis) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahir.mergeFrom(ahoc, ahog):ahir");
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
        mergeFrom((ahis) ahoqVar);
        return this;
    }
}
