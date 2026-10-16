package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahjp extends ahol implements ahph {
    private int bitField0_;
    private int expandedTypeId_;
    private int name_;
    private int underlyingTypeId_;
    private int flags_ = 6;
    private List<ahjv> typeParameter_ = Collections.EMPTY_LIST;
    private ahjn underlyingType_ = ahjn.getDefaultInstance();
    private ahjn expandedType_ = ahjn.getDefaultInstance();
    private List<ahgx> annotation_ = Collections.EMPTY_LIST;
    private List<Integer> versionRequirement_ = Collections.EMPTY_LIST;
    private List<ahhf> compilerPluginData_ = Collections.EMPTY_LIST;

    private ahjp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ahjp create() {
        return new ahjp();
    }

    private void ensureAnnotationIsMutable() {
        if ((this.bitField0_ & 128) != 128) {
            this.annotation_ = new ArrayList(this.annotation_);
            this.bitField0_ |= 128;
        }
    }

    private void ensureCompilerPluginDataIsMutable() {
        if ((this.bitField0_ & sk.AUDIO_CONTENT_BUFFER_SIZE) != 512) {
            this.compilerPluginData_ = new ArrayList(this.compilerPluginData_);
            this.bitField0_ |= sk.AUDIO_CONTENT_BUFFER_SIZE;
        }
    }

    private void ensureTypeParameterIsMutable() {
        if ((this.bitField0_ & 4) != 4) {
            this.typeParameter_ = new ArrayList(this.typeParameter_);
            this.bitField0_ |= 4;
        }
    }

    private void ensureVersionRequirementIsMutable() {
        if ((this.bitField0_ & 256) != 256) {
            this.versionRequirement_ = new ArrayList(this.versionRequirement_);
            this.bitField0_ |= 256;
        }
    }

    @Override // defpackage.ahpf
    public ahjq build() {
        ahjq ahjqVarBuildPartial = buildPartial();
        if (ahjqVarBuildPartial.isInitialized()) {
            return ahjqVarBuildPartial;
        }
        throw newUninitializedMessageException(ahjqVarBuildPartial);
    }

    public ahjq buildPartial() {
        ahjq ahjqVar = new ahjq(this, (ahgm) null);
        int i = this.bitField0_;
        int i2 = i & 1;
        ahjqVar.flags_ = this.flags_;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ahjqVar.name_ = this.name_;
        if ((this.bitField0_ & 4) == 4) {
            this.typeParameter_ = DesugarCollections.unmodifiableList(this.typeParameter_);
            this.bitField0_ &= -5;
        }
        ahjqVar.typeParameter_ = this.typeParameter_;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        ahjqVar.underlyingType_ = this.underlyingType_;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        ahjqVar.underlyingTypeId_ = this.underlyingTypeId_;
        if ((i & 32) == 32) {
            i2 |= 16;
        }
        ahjqVar.expandedType_ = this.expandedType_;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        ahjqVar.expandedTypeId_ = this.expandedTypeId_;
        if ((this.bitField0_ & 128) == 128) {
            this.annotation_ = DesugarCollections.unmodifiableList(this.annotation_);
            this.bitField0_ &= -129;
        }
        ahjqVar.annotation_ = this.annotation_;
        if ((this.bitField0_ & 256) == 256) {
            this.versionRequirement_ = DesugarCollections.unmodifiableList(this.versionRequirement_);
            this.bitField0_ &= -257;
        }
        ahjqVar.versionRequirement_ = this.versionRequirement_;
        if ((this.bitField0_ & sk.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            this.compilerPluginData_ = DesugarCollections.unmodifiableList(this.compilerPluginData_);
            this.bitField0_ &= -513;
        }
        ahjqVar.compilerPluginData_ = this.compilerPluginData_;
        ahjqVar.bitField0_ = i2;
        return ahjqVar;
    }

    @Override // defpackage.ahol, defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public ahjp mo86clone() {
        ahjp ahjpVarCreate = create();
        ahjpVarCreate.mergeFrom(buildPartial());
        return ahjpVarCreate;
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

    @Override // defpackage.ahok, defpackage.ahph
    public ahjq getDefaultInstanceForType() {
        return ahjq.getDefaultInstance();
    }

    public ahjn getExpandedType() {
        return this.expandedType_;
    }

    public ahjv getTypeParameter(int i) {
        return this.typeParameter_.get(i);
    }

    public int getTypeParameterCount() {
        return this.typeParameter_.size();
    }

    public ahjn getUnderlyingType() {
        return this.underlyingType_;
    }

    public boolean hasExpandedType() {
        return (this.bitField0_ & 32) == 32;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasUnderlyingType() {
        return (this.bitField0_ & 8) == 8;
    }

    @Override // defpackage.ahph
    public final boolean isInitialized() {
        if (!hasName()) {
            return false;
        }
        for (int i = 0; i < getTypeParameterCount(); i++) {
            if (!getTypeParameter(i).isInitialized()) {
                return false;
            }
        }
        if (hasUnderlyingType() && !getUnderlyingType().isInitialized()) {
            return false;
        }
        if (hasExpandedType() && !getExpandedType().isInitialized()) {
            return false;
        }
        for (int i2 = 0; i2 < getAnnotationCount(); i2++) {
            if (!getAnnotation(i2).isInitialized()) {
                return false;
            }
        }
        for (int i3 = 0; i3 < getCompilerPluginDataCount(); i3++) {
            if (!getCompilerPluginData(i3).isInitialized()) {
                return false;
            }
        }
        return extensionsAreInitialized();
    }

    public ahjp mergeExpandedType(ahjn ahjnVar) {
        if ((this.bitField0_ & 32) == 32 && this.expandedType_ != ahjn.getDefaultInstance()) {
            ahjm ahjmVarNewBuilder = ahjn.newBuilder(this.expandedType_);
            ahjmVarNewBuilder.mergeFrom(ahjnVar);
            ahjnVar = ahjmVarNewBuilder.buildPartial();
        }
        this.expandedType_ = ahjnVar;
        this.bitField0_ |= 32;
        return this;
    }

    public ahjp mergeFrom(ahjq ahjqVar) {
        if (ahjqVar == ahjq.getDefaultInstance()) {
            return this;
        }
        if (ahjqVar.hasFlags()) {
            setFlags(ahjqVar.getFlags());
        }
        if (ahjqVar.hasName()) {
            setName(ahjqVar.getName());
        }
        if (!ahjqVar.typeParameter_.isEmpty()) {
            if (this.typeParameter_.isEmpty()) {
                this.typeParameter_ = ahjqVar.typeParameter_;
                this.bitField0_ &= -5;
            } else {
                ensureTypeParameterIsMutable();
                this.typeParameter_.addAll(ahjqVar.typeParameter_);
            }
        }
        if (ahjqVar.hasUnderlyingType()) {
            mergeUnderlyingType(ahjqVar.getUnderlyingType());
        }
        if (ahjqVar.hasUnderlyingTypeId()) {
            setUnderlyingTypeId(ahjqVar.getUnderlyingTypeId());
        }
        if (ahjqVar.hasExpandedType()) {
            mergeExpandedType(ahjqVar.getExpandedType());
        }
        if (ahjqVar.hasExpandedTypeId()) {
            setExpandedTypeId(ahjqVar.getExpandedTypeId());
        }
        if (!ahjqVar.annotation_.isEmpty()) {
            if (this.annotation_.isEmpty()) {
                this.annotation_ = ahjqVar.annotation_;
                this.bitField0_ &= -129;
            } else {
                ensureAnnotationIsMutable();
                this.annotation_.addAll(ahjqVar.annotation_);
            }
        }
        if (!ahjqVar.versionRequirement_.isEmpty()) {
            if (this.versionRequirement_.isEmpty()) {
                this.versionRequirement_ = ahjqVar.versionRequirement_;
                this.bitField0_ &= -257;
            } else {
                ensureVersionRequirementIsMutable();
                this.versionRequirement_.addAll(ahjqVar.versionRequirement_);
            }
        }
        if (!ahjqVar.compilerPluginData_.isEmpty()) {
            if (this.compilerPluginData_.isEmpty()) {
                this.compilerPluginData_ = ahjqVar.compilerPluginData_;
                this.bitField0_ &= -513;
            } else {
                ensureCompilerPluginDataIsMutable();
                this.compilerPluginData_.addAll(ahjqVar.compilerPluginData_);
            }
        }
        mergeExtensionFields(ahjqVar);
        setUnknownFields(getUnknownFields().concat(ahjqVar.unknownFields));
        return this;
    }

    public ahjp mergeUnderlyingType(ahjn ahjnVar) {
        if ((this.bitField0_ & 8) == 8 && this.underlyingType_ != ahjn.getDefaultInstance()) {
            ahjm ahjmVarNewBuilder = ahjn.newBuilder(this.underlyingType_);
            ahjmVarNewBuilder.mergeFrom(ahjnVar);
            ahjnVar = ahjmVarNewBuilder.buildPartial();
        }
        this.underlyingType_ = ahjnVar;
        this.bitField0_ |= 8;
        return this;
    }

    public ahjp setExpandedTypeId(int i) {
        this.bitField0_ |= 64;
        this.expandedTypeId_ = i;
        return this;
    }

    public ahjp setFlags(int i) {
        this.bitField0_ |= 1;
        this.flags_ = i;
        return this;
    }

    public ahjp setName(int i) {
        this.bitField0_ |= 2;
        this.name_ = i;
        return this;
    }

    public ahjp setUnderlyingTypeId(int i) {
        this.bitField0_ |= 16;
        this.underlyingTypeId_ = i;
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
    public defpackage.ahjp mergeFrom(defpackage.ahoc r2, defpackage.ahog r3) throws java.lang.Throwable {
        /*
            r1 = this;
            ahpi<ahjq> r0 = defpackage.ahjq.PARSER     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            ahjq r2 = (defpackage.ahjq) r2     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
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
            ahjq r3 = (defpackage.ahjq) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahjp.mergeFrom(ahoc, ahog):ahjp");
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
        mergeFrom((ahjq) ahoqVar);
        return this;
    }
}
