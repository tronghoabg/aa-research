package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahjm extends ahol implements ahph {
    private int abbreviatedTypeId_;
    private int bitField0_;
    private int className_;
    private int flags_;
    private int flexibleTypeCapabilitiesId_;
    private int flexibleUpperBoundId_;
    private boolean nullable_;
    private int outerTypeId_;
    private int typeAliasName_;
    private int typeParameterName_;
    private int typeParameter_;
    private List<ahjl> argument_ = Collections.EMPTY_LIST;
    private ahjn flexibleUpperBound_ = ahjn.getDefaultInstance();
    private ahjn outerType_ = ahjn.getDefaultInstance();
    private ahjn abbreviatedType_ = ahjn.getDefaultInstance();
    private List<ahgx> annotation_ = Collections.EMPTY_LIST;

    private ahjm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ahjm create() {
        return new ahjm();
    }

    private void ensureAnnotationIsMutable() {
        if ((this.bitField0_ & 16384) != 16384) {
            this.annotation_ = new ArrayList(this.annotation_);
            this.bitField0_ |= 16384;
        }
    }

    private void ensureArgumentIsMutable() {
        if ((this.bitField0_ & 1) != 1) {
            this.argument_ = new ArrayList(this.argument_);
            this.bitField0_ |= 1;
        }
    }

    public ahjm addAnnotation(ahgx ahgxVar) {
        ahgxVar.getClass();
        ensureAnnotationIsMutable();
        this.annotation_.add(ahgxVar);
        return this;
    }

    public ahjm addArgument(ahji ahjiVar) {
        ensureArgumentIsMutable();
        this.argument_.add(ahjiVar.build());
        return this;
    }

    @Override // defpackage.ahpf
    public ahjn build() {
        ahjn ahjnVarBuildPartial = buildPartial();
        if (ahjnVarBuildPartial.isInitialized()) {
            return ahjnVarBuildPartial;
        }
        throw newUninitializedMessageException(ahjnVarBuildPartial);
    }

    public ahjn buildPartial() {
        ahjn ahjnVar = new ahjn(this, (ahgm) null);
        int i = this.bitField0_;
        if ((i & 1) == 1) {
            this.argument_ = DesugarCollections.unmodifiableList(this.argument_);
            this.bitField0_ &= -2;
        }
        ahjnVar.argument_ = this.argument_;
        int i2 = (i & 2) != 2 ? 0 : 1;
        ahjnVar.nullable_ = this.nullable_;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        ahjnVar.flexibleTypeCapabilitiesId_ = this.flexibleTypeCapabilitiesId_;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        ahjnVar.flexibleUpperBound_ = this.flexibleUpperBound_;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        ahjnVar.flexibleUpperBoundId_ = this.flexibleUpperBoundId_;
        if ((i & 32) == 32) {
            i2 |= 16;
        }
        ahjnVar.className_ = this.className_;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        ahjnVar.typeParameter_ = this.typeParameter_;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        ahjnVar.typeParameterName_ = this.typeParameterName_;
        if ((i & 256) == 256) {
            i2 |= 128;
        }
        ahjnVar.typeAliasName_ = this.typeAliasName_;
        if ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            i2 |= 256;
        }
        ahjnVar.outerType_ = this.outerType_;
        if ((i & 1024) == 1024) {
            i2 |= sk.AUDIO_CONTENT_BUFFER_SIZE;
        }
        ahjnVar.outerTypeId_ = this.outerTypeId_;
        if ((i & 2048) == 2048) {
            i2 |= 1024;
        }
        ahjnVar.abbreviatedType_ = this.abbreviatedType_;
        if ((i & 4096) == 4096) {
            i2 |= 2048;
        }
        ahjnVar.abbreviatedTypeId_ = this.abbreviatedTypeId_;
        if ((i & 8192) == 8192) {
            i2 |= 4096;
        }
        ahjnVar.flags_ = this.flags_;
        if ((this.bitField0_ & 16384) == 16384) {
            this.annotation_ = DesugarCollections.unmodifiableList(this.annotation_);
            this.bitField0_ &= -16385;
        }
        ahjnVar.annotation_ = this.annotation_;
        ahjnVar.bitField0_ = i2;
        return ahjnVar;
    }

    @Override // defpackage.ahol, defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public ahjm mo86clone() {
        ahjm ahjmVarCreate = create();
        ahjmVarCreate.mergeFrom(buildPartial());
        return ahjmVarCreate;
    }

    public ahjn getAbbreviatedType() {
        return this.abbreviatedType_;
    }

    public ahgx getAnnotation(int i) {
        return this.annotation_.get(i);
    }

    public int getAnnotationCount() {
        return this.annotation_.size();
    }

    public ahjl getArgument(int i) {
        return this.argument_.get(i);
    }

    public int getArgumentCount() {
        return this.argument_.size();
    }

    @Override // defpackage.ahok, defpackage.ahph
    public ahjn getDefaultInstanceForType() {
        return ahjn.getDefaultInstance();
    }

    public ahjn getFlexibleUpperBound() {
        return this.flexibleUpperBound_;
    }

    public ahjn getOuterType() {
        return this.outerType_;
    }

    public boolean hasAbbreviatedType() {
        return (this.bitField0_ & 2048) == 2048;
    }

    public boolean hasFlexibleUpperBound() {
        return (this.bitField0_ & 8) == 8;
    }

    public boolean hasOuterType() {
        return (this.bitField0_ & sk.AUDIO_CONTENT_BUFFER_SIZE) == 512;
    }

    @Override // defpackage.ahph
    public final boolean isInitialized() {
        for (int i = 0; i < getArgumentCount(); i++) {
            if (!getArgument(i).isInitialized()) {
                return false;
            }
        }
        if (hasFlexibleUpperBound() && !getFlexibleUpperBound().isInitialized()) {
            return false;
        }
        if (hasOuterType() && !getOuterType().isInitialized()) {
            return false;
        }
        if (hasAbbreviatedType() && !getAbbreviatedType().isInitialized()) {
            return false;
        }
        for (int i2 = 0; i2 < getAnnotationCount(); i2++) {
            if (!getAnnotation(i2).isInitialized()) {
                return false;
            }
        }
        return extensionsAreInitialized();
    }

    public ahjm mergeAbbreviatedType(ahjn ahjnVar) {
        if ((this.bitField0_ & 2048) == 2048 && this.abbreviatedType_ != ahjn.getDefaultInstance()) {
            ahjm ahjmVarNewBuilder = ahjn.newBuilder(this.abbreviatedType_);
            ahjmVarNewBuilder.mergeFrom(ahjnVar);
            ahjnVar = ahjmVarNewBuilder.buildPartial();
        }
        this.abbreviatedType_ = ahjnVar;
        this.bitField0_ |= 2048;
        return this;
    }

    public ahjm mergeFlexibleUpperBound(ahjn ahjnVar) {
        if ((this.bitField0_ & 8) == 8 && this.flexibleUpperBound_ != ahjn.getDefaultInstance()) {
            ahjm ahjmVarNewBuilder = ahjn.newBuilder(this.flexibleUpperBound_);
            ahjmVarNewBuilder.mergeFrom(ahjnVar);
            ahjnVar = ahjmVarNewBuilder.buildPartial();
        }
        this.flexibleUpperBound_ = ahjnVar;
        this.bitField0_ |= 8;
        return this;
    }

    public ahjm mergeFrom(ahjn ahjnVar) {
        if (ahjnVar == ahjn.getDefaultInstance()) {
            return this;
        }
        if (!ahjnVar.argument_.isEmpty()) {
            if (this.argument_.isEmpty()) {
                this.argument_ = ahjnVar.argument_;
                this.bitField0_ &= -2;
            } else {
                ensureArgumentIsMutable();
                this.argument_.addAll(ahjnVar.argument_);
            }
        }
        if (ahjnVar.hasNullable()) {
            setNullable(ahjnVar.getNullable());
        }
        if (ahjnVar.hasFlexibleTypeCapabilitiesId()) {
            setFlexibleTypeCapabilitiesId(ahjnVar.getFlexibleTypeCapabilitiesId());
        }
        if (ahjnVar.hasFlexibleUpperBound()) {
            mergeFlexibleUpperBound(ahjnVar.getFlexibleUpperBound());
        }
        if (ahjnVar.hasFlexibleUpperBoundId()) {
            setFlexibleUpperBoundId(ahjnVar.getFlexibleUpperBoundId());
        }
        if (ahjnVar.hasClassName()) {
            setClassName(ahjnVar.getClassName());
        }
        if (ahjnVar.hasTypeParameter()) {
            setTypeParameter(ahjnVar.getTypeParameter());
        }
        if (ahjnVar.hasTypeParameterName()) {
            setTypeParameterName(ahjnVar.getTypeParameterName());
        }
        if (ahjnVar.hasTypeAliasName()) {
            setTypeAliasName(ahjnVar.getTypeAliasName());
        }
        if (ahjnVar.hasOuterType()) {
            mergeOuterType(ahjnVar.getOuterType());
        }
        if (ahjnVar.hasOuterTypeId()) {
            setOuterTypeId(ahjnVar.getOuterTypeId());
        }
        if (ahjnVar.hasAbbreviatedType()) {
            mergeAbbreviatedType(ahjnVar.getAbbreviatedType());
        }
        if (ahjnVar.hasAbbreviatedTypeId()) {
            setAbbreviatedTypeId(ahjnVar.getAbbreviatedTypeId());
        }
        if (ahjnVar.hasFlags()) {
            setFlags(ahjnVar.getFlags());
        }
        if (!ahjnVar.annotation_.isEmpty()) {
            if (this.annotation_.isEmpty()) {
                this.annotation_ = ahjnVar.annotation_;
                this.bitField0_ &= -16385;
            } else {
                ensureAnnotationIsMutable();
                this.annotation_.addAll(ahjnVar.annotation_);
            }
        }
        mergeExtensionFields(ahjnVar);
        setUnknownFields(getUnknownFields().concat(ahjnVar.unknownFields));
        return this;
    }

    public ahjm mergeOuterType(ahjn ahjnVar) {
        if ((this.bitField0_ & sk.AUDIO_CONTENT_BUFFER_SIZE) == 512 && this.outerType_ != ahjn.getDefaultInstance()) {
            ahjm ahjmVarNewBuilder = ahjn.newBuilder(this.outerType_);
            ahjmVarNewBuilder.mergeFrom(ahjnVar);
            ahjnVar = ahjmVarNewBuilder.buildPartial();
        }
        this.outerType_ = ahjnVar;
        this.bitField0_ |= sk.AUDIO_CONTENT_BUFFER_SIZE;
        return this;
    }

    public ahjm setAbbreviatedType(ahjn ahjnVar) {
        ahjnVar.getClass();
        this.abbreviatedType_ = ahjnVar;
        this.bitField0_ |= 2048;
        return this;
    }

    public ahjm setAbbreviatedTypeId(int i) {
        this.bitField0_ |= 4096;
        this.abbreviatedTypeId_ = i;
        return this;
    }

    public ahjm setClassName(int i) {
        this.bitField0_ |= 32;
        this.className_ = i;
        return this;
    }

    public ahjm setFlags(int i) {
        this.bitField0_ |= 8192;
        this.flags_ = i;
        return this;
    }

    public ahjm setFlexibleTypeCapabilitiesId(int i) {
        this.bitField0_ |= 4;
        this.flexibleTypeCapabilitiesId_ = i;
        return this;
    }

    public ahjm setFlexibleUpperBound(ahjn ahjnVar) {
        ahjnVar.getClass();
        this.flexibleUpperBound_ = ahjnVar;
        this.bitField0_ |= 8;
        return this;
    }

    public ahjm setFlexibleUpperBoundId(int i) {
        this.bitField0_ |= 16;
        this.flexibleUpperBoundId_ = i;
        return this;
    }

    public ahjm setNullable(boolean z) {
        this.bitField0_ |= 2;
        this.nullable_ = z;
        return this;
    }

    public ahjm setOuterType(ahjn ahjnVar) {
        ahjnVar.getClass();
        this.outerType_ = ahjnVar;
        this.bitField0_ |= sk.AUDIO_CONTENT_BUFFER_SIZE;
        return this;
    }

    public ahjm setOuterTypeId(int i) {
        this.bitField0_ |= 1024;
        this.outerTypeId_ = i;
        return this;
    }

    public ahjm setTypeAliasName(int i) {
        this.bitField0_ |= 256;
        this.typeAliasName_ = i;
        return this;
    }

    public ahjm setTypeParameter(int i) {
        this.bitField0_ |= 64;
        this.typeParameter_ = i;
        return this;
    }

    public ahjm setTypeParameterName(int i) {
        this.bitField0_ |= 128;
        this.typeParameterName_ = i;
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
    public defpackage.ahjm mergeFrom(defpackage.ahoc r2, defpackage.ahog r3) throws java.lang.Throwable {
        /*
            r1 = this;
            ahpi<ahjn> r0 = defpackage.ahjn.PARSER     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            ahjn r2 = (defpackage.ahjn) r2     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
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
            ahjn r3 = (defpackage.ahjn) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahjm.mergeFrom(ahoc, ahog):ahjm");
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
        mergeFrom((ahjn) ahoqVar);
        return this;
    }
}
