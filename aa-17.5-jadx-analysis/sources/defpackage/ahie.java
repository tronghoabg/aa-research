package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahie extends ahol<ahif, ahie> implements ahph {
    private int bitField0_;
    private int name_;
    private int receiverTypeId_;
    private int returnTypeId_;
    private int flags_ = 6;
    private int oldFlags_ = 6;
    private ahjn returnType_ = ahjn.getDefaultInstance();
    private List<ahjv> typeParameter_ = Collections.EMPTY_LIST;
    private ahjn receiverType_ = ahjn.getDefaultInstance();
    private List<ahjn> contextReceiverType_ = Collections.EMPTY_LIST;
    private List<Integer> contextReceiverTypeId_ = Collections.EMPTY_LIST;
    private List<ahkb> contextParameter_ = Collections.EMPTY_LIST;
    private List<ahkb> valueParameter_ = Collections.EMPTY_LIST;
    private ahjy typeTable_ = ahjy.getDefaultInstance();
    private List<Integer> versionRequirement_ = Collections.EMPTY_LIST;
    private ahhl contract_ = ahhl.getDefaultInstance();
    private List<ahhf> compilerPluginData_ = Collections.EMPTY_LIST;
    private List<ahgx> annotation_ = Collections.EMPTY_LIST;
    private List<ahgx> extensionReceiverAnnotation_ = Collections.EMPTY_LIST;

    private ahie() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ahie create() {
        return new ahie();
    }

    private void ensureAnnotationIsMutable() {
        if ((this.bitField0_ & 65536) != 65536) {
            this.annotation_ = new ArrayList(this.annotation_);
            this.bitField0_ |= 65536;
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

    private void ensureExtensionReceiverAnnotationIsMutable() {
        if ((this.bitField0_ & 131072) != 131072) {
            this.extensionReceiverAnnotation_ = new ArrayList(this.extensionReceiverAnnotation_);
            this.bitField0_ |= 131072;
        }
    }

    private void ensureTypeParameterIsMutable() {
        if ((this.bitField0_ & 32) != 32) {
            this.typeParameter_ = new ArrayList(this.typeParameter_);
            this.bitField0_ |= 32;
        }
    }

    private void ensureValueParameterIsMutable() {
        if ((this.bitField0_ & 2048) != 2048) {
            this.valueParameter_ = new ArrayList(this.valueParameter_);
            this.bitField0_ |= 2048;
        }
    }

    private void ensureVersionRequirementIsMutable() {
        if ((this.bitField0_ & 8192) != 8192) {
            this.versionRequirement_ = new ArrayList(this.versionRequirement_);
            this.bitField0_ |= 8192;
        }
    }

    public ahie addAllAnnotation(Iterable<? extends ahgx> iterable) {
        ensureAnnotationIsMutable();
        ahns.addAll(iterable, this.annotation_);
        return this;
    }

    public ahie addAllExtensionReceiverAnnotation(Iterable<? extends ahgx> iterable) {
        ensureExtensionReceiverAnnotationIsMutable();
        ahns.addAll(iterable, this.extensionReceiverAnnotation_);
        return this;
    }

    @Override // defpackage.ahpf
    public ahif build() {
        ahif ahifVarBuildPartial = buildPartial();
        if (ahifVarBuildPartial.isInitialized()) {
            return ahifVarBuildPartial;
        }
        throw newUninitializedMessageException(ahifVarBuildPartial);
    }

    public ahif buildPartial() {
        ahif ahifVar = new ahif(this, (ahgm) null);
        int i = this.bitField0_;
        int i2 = i & 1;
        ahifVar.flags_ = this.flags_;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ahifVar.oldFlags_ = this.oldFlags_;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        ahifVar.name_ = this.name_;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        ahifVar.returnType_ = this.returnType_;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        ahifVar.returnTypeId_ = this.returnTypeId_;
        if ((this.bitField0_ & 32) == 32) {
            this.typeParameter_ = DesugarCollections.unmodifiableList(this.typeParameter_);
            this.bitField0_ &= -33;
        }
        ahifVar.typeParameter_ = this.typeParameter_;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        ahifVar.receiverType_ = this.receiverType_;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        ahifVar.receiverTypeId_ = this.receiverTypeId_;
        if ((this.bitField0_ & 256) == 256) {
            this.contextReceiverType_ = DesugarCollections.unmodifiableList(this.contextReceiverType_);
            this.bitField0_ &= -257;
        }
        ahifVar.contextReceiverType_ = this.contextReceiverType_;
        if ((this.bitField0_ & sk.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            this.contextReceiverTypeId_ = DesugarCollections.unmodifiableList(this.contextReceiverTypeId_);
            this.bitField0_ &= -513;
        }
        ahifVar.contextReceiverTypeId_ = this.contextReceiverTypeId_;
        if ((this.bitField0_ & 1024) == 1024) {
            this.contextParameter_ = DesugarCollections.unmodifiableList(this.contextParameter_);
            this.bitField0_ &= -1025;
        }
        ahifVar.contextParameter_ = this.contextParameter_;
        if ((this.bitField0_ & 2048) == 2048) {
            this.valueParameter_ = DesugarCollections.unmodifiableList(this.valueParameter_);
            this.bitField0_ &= -2049;
        }
        ahifVar.valueParameter_ = this.valueParameter_;
        if ((i & 4096) == 4096) {
            i2 |= 128;
        }
        ahifVar.typeTable_ = this.typeTable_;
        if ((this.bitField0_ & 8192) == 8192) {
            this.versionRequirement_ = DesugarCollections.unmodifiableList(this.versionRequirement_);
            this.bitField0_ &= -8193;
        }
        ahifVar.versionRequirement_ = this.versionRequirement_;
        if ((i & 16384) == 16384) {
            i2 |= 256;
        }
        ahifVar.contract_ = this.contract_;
        if ((this.bitField0_ & 32768) == 32768) {
            this.compilerPluginData_ = DesugarCollections.unmodifiableList(this.compilerPluginData_);
            this.bitField0_ &= -32769;
        }
        ahifVar.compilerPluginData_ = this.compilerPluginData_;
        if ((this.bitField0_ & 65536) == 65536) {
            this.annotation_ = DesugarCollections.unmodifiableList(this.annotation_);
            this.bitField0_ &= -65537;
        }
        ahifVar.annotation_ = this.annotation_;
        if ((this.bitField0_ & 131072) == 131072) {
            this.extensionReceiverAnnotation_ = DesugarCollections.unmodifiableList(this.extensionReceiverAnnotation_);
            this.bitField0_ &= -131073;
        }
        ahifVar.extensionReceiverAnnotation_ = this.extensionReceiverAnnotation_;
        ahifVar.bitField0_ = i2;
        return ahifVar;
    }

    @Override // defpackage.ahol, defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public ahie mo86clone() {
        ahie ahieVarCreate = create();
        ahieVarCreate.mergeFrom(buildPartial());
        return ahieVarCreate;
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

    public ahhl getContract() {
        return this.contract_;
    }

    @Override // defpackage.ahok, defpackage.ahph
    public ahif getDefaultInstanceForType() {
        return ahif.getDefaultInstance();
    }

    public ahgx getExtensionReceiverAnnotation(int i) {
        return this.extensionReceiverAnnotation_.get(i);
    }

    public int getExtensionReceiverAnnotationCount() {
        return this.extensionReceiverAnnotation_.size();
    }

    public ahjn getReceiverType() {
        return this.receiverType_;
    }

    public ahjn getReturnType() {
        return this.returnType_;
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

    public ahkb getValueParameter(int i) {
        return this.valueParameter_.get(i);
    }

    public int getValueParameterCount() {
        return this.valueParameter_.size();
    }

    public boolean hasContract() {
        return (this.bitField0_ & 16384) == 16384;
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

    public boolean hasTypeTable() {
        return (this.bitField0_ & 4096) == 4096;
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
        for (int i4 = 0; i4 < getValueParameterCount(); i4++) {
            if (!getValueParameter(i4).isInitialized()) {
                return false;
            }
        }
        if (hasTypeTable() && !getTypeTable().isInitialized()) {
            return false;
        }
        if (hasContract() && !getContract().isInitialized()) {
            return false;
        }
        for (int i5 = 0; i5 < getCompilerPluginDataCount(); i5++) {
            if (!getCompilerPluginData(i5).isInitialized()) {
                return false;
            }
        }
        for (int i6 = 0; i6 < getAnnotationCount(); i6++) {
            if (!getAnnotation(i6).isInitialized()) {
                return false;
            }
        }
        for (int i7 = 0; i7 < getExtensionReceiverAnnotationCount(); i7++) {
            if (!getExtensionReceiverAnnotation(i7).isInitialized()) {
                return false;
            }
        }
        return extensionsAreInitialized();
    }

    public ahie mergeContract(ahhl ahhlVar) {
        if ((this.bitField0_ & 16384) == 16384 && this.contract_ != ahhl.getDefaultInstance()) {
            ahhk ahhkVarNewBuilder = ahhl.newBuilder(this.contract_);
            ahhkVarNewBuilder.mergeFrom(ahhlVar);
            ahhlVar = ahhkVarNewBuilder.buildPartial();
        }
        this.contract_ = ahhlVar;
        this.bitField0_ |= 16384;
        return this;
    }

    public ahie mergeFrom(ahif ahifVar) {
        if (ahifVar == ahif.getDefaultInstance()) {
            return this;
        }
        if (ahifVar.hasFlags()) {
            setFlags(ahifVar.getFlags());
        }
        if (ahifVar.hasOldFlags()) {
            setOldFlags(ahifVar.getOldFlags());
        }
        if (ahifVar.hasName()) {
            setName(ahifVar.getName());
        }
        if (ahifVar.hasReturnType()) {
            mergeReturnType(ahifVar.getReturnType());
        }
        if (ahifVar.hasReturnTypeId()) {
            setReturnTypeId(ahifVar.getReturnTypeId());
        }
        if (!ahifVar.typeParameter_.isEmpty()) {
            if (this.typeParameter_.isEmpty()) {
                this.typeParameter_ = ahifVar.typeParameter_;
                this.bitField0_ &= -33;
            } else {
                ensureTypeParameterIsMutable();
                this.typeParameter_.addAll(ahifVar.typeParameter_);
            }
        }
        if (ahifVar.hasReceiverType()) {
            mergeReceiverType(ahifVar.getReceiverType());
        }
        if (ahifVar.hasReceiverTypeId()) {
            setReceiverTypeId(ahifVar.getReceiverTypeId());
        }
        if (!ahifVar.contextReceiverType_.isEmpty()) {
            if (this.contextReceiverType_.isEmpty()) {
                this.contextReceiverType_ = ahifVar.contextReceiverType_;
                this.bitField0_ &= -257;
            } else {
                ensureContextReceiverTypeIsMutable();
                this.contextReceiverType_.addAll(ahifVar.contextReceiverType_);
            }
        }
        if (!ahifVar.contextReceiverTypeId_.isEmpty()) {
            if (this.contextReceiverTypeId_.isEmpty()) {
                this.contextReceiverTypeId_ = ahifVar.contextReceiverTypeId_;
                this.bitField0_ &= -513;
            } else {
                ensureContextReceiverTypeIdIsMutable();
                this.contextReceiverTypeId_.addAll(ahifVar.contextReceiverTypeId_);
            }
        }
        if (!ahifVar.contextParameter_.isEmpty()) {
            if (this.contextParameter_.isEmpty()) {
                this.contextParameter_ = ahifVar.contextParameter_;
                this.bitField0_ &= -1025;
            } else {
                ensureContextParameterIsMutable();
                this.contextParameter_.addAll(ahifVar.contextParameter_);
            }
        }
        if (!ahifVar.valueParameter_.isEmpty()) {
            if (this.valueParameter_.isEmpty()) {
                this.valueParameter_ = ahifVar.valueParameter_;
                this.bitField0_ &= -2049;
            } else {
                ensureValueParameterIsMutable();
                this.valueParameter_.addAll(ahifVar.valueParameter_);
            }
        }
        if (ahifVar.hasTypeTable()) {
            mergeTypeTable(ahifVar.getTypeTable());
        }
        if (!ahifVar.versionRequirement_.isEmpty()) {
            if (this.versionRequirement_.isEmpty()) {
                this.versionRequirement_ = ahifVar.versionRequirement_;
                this.bitField0_ &= -8193;
            } else {
                ensureVersionRequirementIsMutable();
                this.versionRequirement_.addAll(ahifVar.versionRequirement_);
            }
        }
        if (ahifVar.hasContract()) {
            mergeContract(ahifVar.getContract());
        }
        if (!ahifVar.compilerPluginData_.isEmpty()) {
            if (this.compilerPluginData_.isEmpty()) {
                this.compilerPluginData_ = ahifVar.compilerPluginData_;
                this.bitField0_ &= -32769;
            } else {
                ensureCompilerPluginDataIsMutable();
                this.compilerPluginData_.addAll(ahifVar.compilerPluginData_);
            }
        }
        if (!ahifVar.annotation_.isEmpty()) {
            if (this.annotation_.isEmpty()) {
                this.annotation_ = ahifVar.annotation_;
                this.bitField0_ &= -65537;
            } else {
                ensureAnnotationIsMutable();
                this.annotation_.addAll(ahifVar.annotation_);
            }
        }
        if (!ahifVar.extensionReceiverAnnotation_.isEmpty()) {
            if (this.extensionReceiverAnnotation_.isEmpty()) {
                this.extensionReceiverAnnotation_ = ahifVar.extensionReceiverAnnotation_;
                this.bitField0_ &= -131073;
            } else {
                ensureExtensionReceiverAnnotationIsMutable();
                this.extensionReceiverAnnotation_.addAll(ahifVar.extensionReceiverAnnotation_);
            }
        }
        mergeExtensionFields(ahifVar);
        setUnknownFields(getUnknownFields().concat(ahifVar.unknownFields));
        return this;
    }

    public ahie mergeReceiverType(ahjn ahjnVar) {
        if ((this.bitField0_ & 64) == 64 && this.receiverType_ != ahjn.getDefaultInstance()) {
            ahjm ahjmVarNewBuilder = ahjn.newBuilder(this.receiverType_);
            ahjmVarNewBuilder.mergeFrom(ahjnVar);
            ahjnVar = ahjmVarNewBuilder.buildPartial();
        }
        this.receiverType_ = ahjnVar;
        this.bitField0_ |= 64;
        return this;
    }

    public ahie mergeReturnType(ahjn ahjnVar) {
        if ((this.bitField0_ & 8) == 8 && this.returnType_ != ahjn.getDefaultInstance()) {
            ahjm ahjmVarNewBuilder = ahjn.newBuilder(this.returnType_);
            ahjmVarNewBuilder.mergeFrom(ahjnVar);
            ahjnVar = ahjmVarNewBuilder.buildPartial();
        }
        this.returnType_ = ahjnVar;
        this.bitField0_ |= 8;
        return this;
    }

    public ahie mergeTypeTable(ahjy ahjyVar) {
        if ((this.bitField0_ & 4096) == 4096 && this.typeTable_ != ahjy.getDefaultInstance()) {
            ahjx ahjxVarNewBuilder = ahjy.newBuilder(this.typeTable_);
            ahjxVarNewBuilder.mergeFrom(ahjyVar);
            ahjyVar = ahjxVarNewBuilder.buildPartial();
        }
        this.typeTable_ = ahjyVar;
        this.bitField0_ |= 4096;
        return this;
    }

    public ahie setFlags(int i) {
        this.bitField0_ |= 1;
        this.flags_ = i;
        return this;
    }

    public ahie setName(int i) {
        this.bitField0_ |= 4;
        this.name_ = i;
        return this;
    }

    public ahie setOldFlags(int i) {
        this.bitField0_ |= 2;
        this.oldFlags_ = i;
        return this;
    }

    public ahie setReceiverTypeId(int i) {
        this.bitField0_ |= 128;
        this.receiverTypeId_ = i;
        return this;
    }

    public ahie setReturnTypeId(int i) {
        this.bitField0_ |= 16;
        this.returnTypeId_ = i;
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
    public defpackage.ahie mergeFrom(defpackage.ahoc r2, defpackage.ahog r3) throws java.lang.Throwable {
        /*
            r1 = this;
            ahpi<ahif> r0 = defpackage.ahif.PARSER     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            ahif r2 = (defpackage.ahif) r2     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
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
            ahif r3 = (defpackage.ahif) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahie.mergeFrom(ahoc, ahog):ahie");
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
        mergeFrom((ahif) ahoqVar);
        return this;
    }
}
