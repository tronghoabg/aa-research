package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahhh extends ahol<ahhi, ahhh> implements ahph {
    private int bitField0_;
    private int flags_ = 6;
    private List<ahkb> valueParameter_ = Collections.EMPTY_LIST;
    private List<Integer> versionRequirement_ = Collections.EMPTY_LIST;
    private List<ahhf> compilerPluginData_ = Collections.EMPTY_LIST;
    private List<ahgx> annotation_ = Collections.EMPTY_LIST;

    private ahhh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ahhh create() {
        return new ahhh();
    }

    private void ensureAnnotationIsMutable() {
        if ((this.bitField0_ & 16) != 16) {
            this.annotation_ = new ArrayList(this.annotation_);
            this.bitField0_ |= 16;
        }
    }

    private void ensureCompilerPluginDataIsMutable() {
        if ((this.bitField0_ & 8) != 8) {
            this.compilerPluginData_ = new ArrayList(this.compilerPluginData_);
            this.bitField0_ |= 8;
        }
    }

    private void ensureValueParameterIsMutable() {
        if ((this.bitField0_ & 2) != 2) {
            this.valueParameter_ = new ArrayList(this.valueParameter_);
            this.bitField0_ |= 2;
        }
    }

    private void ensureVersionRequirementIsMutable() {
        if ((this.bitField0_ & 4) != 4) {
            this.versionRequirement_ = new ArrayList(this.versionRequirement_);
            this.bitField0_ |= 4;
        }
    }

    public ahhh addAllAnnotation(Iterable<? extends ahgx> iterable) {
        ensureAnnotationIsMutable();
        ahns.addAll(iterable, this.annotation_);
        return this;
    }

    @Override // defpackage.ahpf
    public ahhi build() {
        ahhi ahhiVarBuildPartial = buildPartial();
        if (ahhiVarBuildPartial.isInitialized()) {
            return ahhiVarBuildPartial;
        }
        throw newUninitializedMessageException(ahhiVarBuildPartial);
    }

    public ahhi buildPartial() {
        ahhi ahhiVar = new ahhi(this, (ahgm) null);
        int i = this.bitField0_ & 1;
        ahhiVar.flags_ = this.flags_;
        if ((this.bitField0_ & 2) == 2) {
            this.valueParameter_ = DesugarCollections.unmodifiableList(this.valueParameter_);
            this.bitField0_ &= -3;
        }
        ahhiVar.valueParameter_ = this.valueParameter_;
        if ((this.bitField0_ & 4) == 4) {
            this.versionRequirement_ = DesugarCollections.unmodifiableList(this.versionRequirement_);
            this.bitField0_ &= -5;
        }
        ahhiVar.versionRequirement_ = this.versionRequirement_;
        if ((this.bitField0_ & 8) == 8) {
            this.compilerPluginData_ = DesugarCollections.unmodifiableList(this.compilerPluginData_);
            this.bitField0_ &= -9;
        }
        ahhiVar.compilerPluginData_ = this.compilerPluginData_;
        if ((this.bitField0_ & 16) == 16) {
            this.annotation_ = DesugarCollections.unmodifiableList(this.annotation_);
            this.bitField0_ &= -17;
        }
        ahhiVar.annotation_ = this.annotation_;
        ahhiVar.bitField0_ = i;
        return ahhiVar;
    }

    @Override // defpackage.ahol, defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public ahhh mo86clone() {
        ahhh ahhhVarCreate = create();
        ahhhVarCreate.mergeFrom(buildPartial());
        return ahhhVarCreate;
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
    public ahhi getDefaultInstanceForType() {
        return ahhi.getDefaultInstance();
    }

    public ahkb getValueParameter(int i) {
        return this.valueParameter_.get(i);
    }

    public int getValueParameterCount() {
        return this.valueParameter_.size();
    }

    @Override // defpackage.ahph
    public final boolean isInitialized() {
        for (int i = 0; i < getValueParameterCount(); i++) {
            if (!getValueParameter(i).isInitialized()) {
                return false;
            }
        }
        for (int i2 = 0; i2 < getCompilerPluginDataCount(); i2++) {
            if (!getCompilerPluginData(i2).isInitialized()) {
                return false;
            }
        }
        for (int i3 = 0; i3 < getAnnotationCount(); i3++) {
            if (!getAnnotation(i3).isInitialized()) {
                return false;
            }
        }
        return extensionsAreInitialized();
    }

    public ahhh mergeFrom(ahhi ahhiVar) {
        if (ahhiVar == ahhi.getDefaultInstance()) {
            return this;
        }
        if (ahhiVar.hasFlags()) {
            setFlags(ahhiVar.getFlags());
        }
        if (!ahhiVar.valueParameter_.isEmpty()) {
            if (this.valueParameter_.isEmpty()) {
                this.valueParameter_ = ahhiVar.valueParameter_;
                this.bitField0_ &= -3;
            } else {
                ensureValueParameterIsMutable();
                this.valueParameter_.addAll(ahhiVar.valueParameter_);
            }
        }
        if (!ahhiVar.versionRequirement_.isEmpty()) {
            if (this.versionRequirement_.isEmpty()) {
                this.versionRequirement_ = ahhiVar.versionRequirement_;
                this.bitField0_ &= -5;
            } else {
                ensureVersionRequirementIsMutable();
                this.versionRequirement_.addAll(ahhiVar.versionRequirement_);
            }
        }
        if (!ahhiVar.compilerPluginData_.isEmpty()) {
            if (this.compilerPluginData_.isEmpty()) {
                this.compilerPluginData_ = ahhiVar.compilerPluginData_;
                this.bitField0_ &= -9;
            } else {
                ensureCompilerPluginDataIsMutable();
                this.compilerPluginData_.addAll(ahhiVar.compilerPluginData_);
            }
        }
        if (!ahhiVar.annotation_.isEmpty()) {
            if (this.annotation_.isEmpty()) {
                this.annotation_ = ahhiVar.annotation_;
                this.bitField0_ &= -17;
            } else {
                ensureAnnotationIsMutable();
                this.annotation_.addAll(ahhiVar.annotation_);
            }
        }
        mergeExtensionFields(ahhiVar);
        setUnknownFields(getUnknownFields().concat(ahhiVar.unknownFields));
        return this;
    }

    public ahhh setFlags(int i) {
        this.bitField0_ |= 1;
        this.flags_ = i;
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
    public defpackage.ahhh mergeFrom(defpackage.ahoc r2, defpackage.ahog r3) throws java.lang.Throwable {
        /*
            r1 = this;
            ahpi<ahhi> r0 = defpackage.ahhi.PARSER     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            ahhi r2 = (defpackage.ahhi) r2     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
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
            ahhi r3 = (defpackage.ahhi) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahhh.mergeFrom(ahoc, ahog):ahhh");
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
        mergeFrom((ahhi) ahoqVar);
        return this;
    }
}
